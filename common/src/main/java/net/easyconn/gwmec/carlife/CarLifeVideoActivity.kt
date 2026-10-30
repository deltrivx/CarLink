package net.easyconn.gwmec.carlife

import android.media.MediaCodec
import android.media.MediaFormat
import android.os.Bundle
import android.util.Log
import android.view.Gravity
import android.view.MotionEvent
import android.view.Surface
import android.view.SurfaceHolder
import android.view.SurfaceView
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.OnBackPressedCallback
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import java.util.concurrent.ArrayBlockingQueue
import java.util.concurrent.TimeUnit

/**
 * CarLife 投屏画面：会话由 CarLifeCenter 持有（连接页建立），
 * 本界面只负责解码渲染与触控回传；无会话时引导回连接页。
 * 沉浸式全屏，对齐 CarPlayVideoActivity 的系统栏处理。
 *
 * 解码全部在专用线程进行（旧版在 UI 线程跑 dequeueInputBuffer 自旋，
 * Surface 停顿时直接卡死主线程——返回键、进入动画全部无响应）：
 * UI 线程只入队，解码线程出队喂 MediaCodec。
 */
class CarLifeVideoActivity : ComponentActivity() {
    private var codec: MediaCodec? = null
    @Volatile private var videoSurface: Surface? = null
    @Volatile private var videoWidth = 1280
    @Volatile private var videoHeight = 720
    private val bufferInfo = MediaCodec.BufferInfo()
    private var statusView: TextView? = null
    private var surfaceView: SurfaceView? = null
    @Volatile private var videoStarted = false
    @Volatile private var running = true

    /** 有界帧队列：解码线程消费不过来时丢最旧帧，绝不倒灌 UI 线程。 */
    private val frameQueue = ArrayBlockingQueue<ByteArray>(6)

    /** 解码线程观察的待重建尺寸（onVideoSize 来自会话线程）。null 表示无变更。 */
    private val pendingSize = java.util.concurrent.atomic.AtomicReference<IntArray?>(null)

    private var decodeThread: Thread? = null

    private val centerListener = object : CarLifeSession.Listener {
        override fun onState(state: String) {}
        override fun onLog(line: String) {}
        override fun onPhoneInfo(info: String) {}
        /**
         * 手机回的编码尺寸才是解码器的真实画布，对齐原版 DecodeUtil.initDecoder(
         * mSurface, encWidth, encHeight)。尺寸变了就重建解码器（在解码线程做）。
         */
        override fun onVideoSize(width: Int, height: Int) {
            if (width <= 0 || height <= 0) return
            if (width == videoWidth && height == videoHeight && codec != null) return
            logCanvas(width, height)
            pendingSize.set(intArrayOf(width, height))
        }
        override fun onVideoFrame(data: ByteArray, tsMs: Long) {
            if (!frameQueue.offer(data)) {
                frameQueue.poll()
                frameQueue.offer(data)
            }
        }
        override fun onDisconnected() {
            runOnUiThread { finish() }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val s = CarLifeCenter.session
        if (s == null || !s.running) {
            finish()
            return
        }

        WindowCompat.setDecorFitsSystemWindows(window, false)
        WindowInsetsControllerCompat(window, window.decorView).apply {
            hide(WindowInsetsCompat.Type.systemBars())
            systemBarsBehavior = WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
        }

        val frame = FrameLayout(this).apply {
            setBackgroundColor(0xFF000000.toInt())
        }
        val surface = SurfaceView(this).apply {
            holder.addCallback(object : SurfaceHolder.Callback {
                override fun surfaceCreated(holder: SurfaceHolder) { videoSurface = holder.surface }
                override fun surfaceChanged(holder: SurfaceHolder, f: Int, w: Int, h: Int) {}
                override fun surfaceDestroyed(holder: SurfaceHolder) { videoSurface = null }
            })
            setOnTouchListener { _, event -> handleTouch(event); true }
        }
        surfaceView = surface
        frame.addView(surface, FrameLayout.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT))
        val status = TextView(this).apply {
            text = "连接中请稍候"
            setTextColor(0xFFFFFFFF.toInt())
            gravity = Gravity.CENTER
        }
        statusView = status
        frame.addView(status, FrameLayout.LayoutParams(
            ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT,
            Gravity.CENTER))
        setContentView(frame)
        CarLifeCenter.addListener(centerListener)
        // 对齐原版 sendVideoCodecMsg(mSurfaceView.getWidth(), getHeight(), 0)：
        // 画布尺寸来自车机屏幕，不是写死的 1280x720。
        surface.post {
            val w = surface.width
            val h = surface.height
            if (w > 0 && h > 0) {
                CarLifeCenter.session?.let { s ->
                    s.videoWidth = w
                    s.videoHeight = h
                    videoWidth = w
                    videoHeight = h
                    Log.i("CarLifeVideo", "canvas from surface: ${w}x$h")
                    // 通知会话用新尺寸重新协商视频参数
                    s.requestVideoResize(w, h)
                }
            }
        }

        startDecodeThread()

        onBackPressedDispatcher.addCallback(this, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                CarLifeCenter.disconnect()
                finish()
            }
        })
    }

    /** 专用解码线程：等待首帧前先等 Surface 就绪，避免空转。 */
    private fun startDecodeThread() {
        val t = Thread({
            while (running) {
                try {
                    val data = frameQueue.poll(200, TimeUnit.MILLISECONDS) ?: continue
                    applyPendingSize()
                    feed(data)
                } catch (_: InterruptedException) {
                    break
                }
            }
        }, "CarLife-Decode")
        t.start()
        decodeThread = t
    }

    /** 解码线程内应用 onVideoSize 的待重建请求（旧版在 UI 线程 reset，会和 feed 抢锁）。 */
    private fun applyPendingSize() {
        val size = pendingSize.getAndSet(null) ?: return
        videoWidth = size[0]
        videoHeight = size[1]
        releaseCodec()
        videoStarted = false
    }

    private fun logCanvas(w: Int, h: Int) {
        val sv = surfaceView
        Log.i("CarLifeVideo", "phone canvas ${w}x$h, surface ${sv?.width}x${sv?.height}")
    }

    /** 换解码器：旧的先停再放，避免两个解码器抢同一个 Surface。 */
    private fun releaseCodec() {
        val old = codec
        codec = null
        old?.let {
            try { it.stop() } catch (_: Exception) {}
            try { it.release() } catch (_: Exception) {}
        }
    }

    @Volatile private var waitingFirstKeyFrame = true

    /** 对照原版 h8/a.java f() 检查是否为关键帧 (SPS:7, PPS:8, IDR:5) */
    private fun isKeyFrame(buf: ByteArray, offset: Int = 0): Boolean {
        if (buf.size < offset + 5) return false
        val b0 = buf[offset]
        val headerLen = if (b0.toInt() == 0 && buf[offset + 1].toInt() == 0 && buf[offset + 2].toInt() == 0 && buf[offset + 3].toInt() == 1) 4
        else if (b0.toInt() == 0 && buf[offset + 1].toInt() == 0 && buf[offset + 2].toInt() == 1) 3 else 0
        if (headerLen != 0) {
            val nalType = buf[offset + headerLen].toInt() and 0x1F
            if (nalType == 5 || nalType == 7 || nalType == 8) return true
        }
        return false
    }

    private fun feed(data: ByteArray) {
        val surface = videoSurface ?: return
        if (!surface.isValid || data.isEmpty()) return
        try {
            // 对齐原版 h8/a.java a()：硬解失败自动回退软解
            val c = codec ?: run {
                val format = MediaFormat.createVideoFormat("video/avc", videoWidth, videoHeight)
                val newCodec = try {
                    MediaCodec.createDecoderByType("video/avc").apply {
                        configure(format, surface, null, 0)
                        start()
                    }
                } catch (e: Exception) {
                    Log.w("CarLifeVideo", "硬解创建失败，尝试软解 OMX.google.h264.decoder", e)
                    try {
                        MediaCodec.createByCodecName("OMX.google.h264.decoder").apply {
                            configure(format, surface, null, 0)
                            start()
                        }
                    } catch (e2: Exception) {
                        Log.e("CarLifeVideo", "软解创建失败", e2)
                        return
                    }
                }
                waitingFirstKeyFrame = true
                codec = newCodec
                startRenderThread(newCodec)
                newCodec
            }

            // 对齐原版：等待首个关键帧，避免残帧花屏或黑屏
            if (waitingFirstKeyFrame) {
                if (isKeyFrame(data)) {
                    Log.i("CarLifeVideo", "收到首个关键帧，开启解码")
                    waitingFirstKeyFrame = false
                } else {
                    return
                }
            }

            var offset = 0
            var payloadRemaining = data.size
            while (running && payloadRemaining > 0) {
                var idx = -1
                var spins = 0
                while (idx < 0 && running) {
                    idx = c.dequeueInputBuffer(10_000)
                    // Surface 消失/解码器失效时别无限自旋：连续 500 次拿不到就丢帧
                    if (idx < 0 && ++spins > 500) return
                }
                if (idx < 0) break
                val ib = c.getInputBuffer(idx) ?: break
                ib.clear()
                val chunk = Math.min(payloadRemaining, ib.remaining())
                ib.put(data, offset, chunk)
                val ptsUs = System.nanoTime() / 1000L
                c.queueInputBuffer(idx, 0, chunk, ptsUs, 0)
                offset += chunk
                payloadRemaining -= chunk
            }

            if (!videoStarted) {
                videoStarted = true
                runOnUiThread { statusView?.visibility = View.GONE }
            }
        } catch (e: Exception) {
            Log.e("CarLifeVideo", "decoder error: ${e.message}")
        }
    }

    /** 对齐原版 h8/a.java b()：持续批量清空渲染输出 buffer */
    private fun startRenderThread(c: MediaCodec) {
        Thread({
            val info = MediaCodec.BufferInfo()
            while (running) {
                try {
                    var out = c.dequeueOutputBuffer(info, 10_000)
                    while (out >= 0 && running) {
                        val sf = videoSurface
                        val render = sf != null && sf.isValid
                        c.releaseOutputBuffer(out, render)
                        out = c.dequeueOutputBuffer(info, 0L)
                    }
                } catch (_: Exception) {
                    break
                }
            }
        }, "CarLife-Render").start()
    }

    /**
     * 对齐原版 APK (h8/b.java)：
     * 1. 采用原版确切的 Action 传递 (保留 event.action，包括多点 pointer)
     * 2. 纯线性无黑边换算 (viewWidth/videoWidth)
     * 3. 支持第二个触控点的 pointerx, pointery，对齐原版多点手势
     */
    private fun handleTouch(event: MotionEvent) {
        val s = CarLifeCenter.session ?: return
        val sv = surfaceView ?: return
        val viewW = sv.width
        val viewH = sv.height
        if (viewW <= 0 || viewH <= 0 || videoWidth <= 0 || videoHeight <= 0) return

        val action = event.action
        val x = (event.x.toInt() * videoWidth) / viewW
        val y = (event.y.toInt() * videoHeight) / viewH

        var px = 0
        var py = 0
        if (event.pointerCount > 1) {
            px = (event.getX(1).toInt() * videoWidth) / viewW
            py = (event.getY(1).toInt() * videoHeight) / viewH
        }

        s.sendTouchAction(action, x, y, px, py)
    }

    override fun onDestroy() {
        running = false
        frameQueue.clear()
        decodeThread?.interrupt()
        decodeThread = null
        CarLifeCenter.removeListener(centerListener)
        releaseCodec()
        super.onDestroy()
    }
}
