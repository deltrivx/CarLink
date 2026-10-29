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

/**
 * CarLife 投屏画面：会话由 CarLifeCenter 持有（连接页建立），
 * 本界面只负责解码渲染与触控回传；无会话时引导回连接页。
 * 沉浸式全屏，对齐 CarPlayVideoActivity 的系统栏处理。
 */
class CarLifeVideoActivity : ComponentActivity() {
    private var codec: MediaCodec? = null
    private var videoSurface: Surface? = null
    private var videoWidth = 1280
    private var videoHeight = 720
    private val bufferInfo = MediaCodec.BufferInfo()
    private var statusView: TextView? = null
    private var surfaceView: SurfaceView? = null
    private var videoStarted = false
    @Volatile private var running = true

    private val centerListener = object : CarLifeSession.Listener {
        override fun onState(state: String) {}
        override fun onLog(line: String) {}
        override fun onPhoneInfo(info: String) {}
        /**
         * 手机回的编码尺寸才是解码器的真实画布，对齐原版 DecodeUtil.initDecoder(
         * mSurface, encWidth, encHeight)。尺寸变了就重建解码器。
         */
        override fun onVideoSize(width: Int, height: Int) {
            runOnUiThread {
                if (width <= 0 || height <= 0) return@runOnUiThread
                if (width == videoWidth && height == videoHeight && codec != null) return@runOnUiThread
                logCanvas(width, height)
                videoWidth = width
                videoHeight = height
                resetCodec()
            }
        }
        override fun onVideoFrame(data: ByteArray, tsMs: Long) {
            runOnUiThread { feed(data) }
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

        onBackPressedDispatcher.addCallback(this, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                CarLifeCenter.disconnect()
                finish()
            }
        })
    }

    private fun logCanvas(w: Int, h: Int) {
        val sv = surfaceView
        Log.i("CarLifeVideo", "phone canvas ${w}x$h, surface ${sv?.width}x${sv?.height}")
    }

    /** 换解码器：旧的先停再放，避免两个解码器抢同一个 Surface。 */
    private fun resetCodec() {
        val old = codec
        codec = null
        videoStarted = false
        old?.let {
            try { it.stop() } catch (_: Exception) {}
            try { it.release() } catch (_: Exception) {}
        }
    }

    /**
     * 喂帧：只负责把码流塞进解码器，不在调用线程里做渲染。
     *
     * 原来每来一帧只 dequeueInputBuffer 一次、超时 10ms 就丢，且渲染用 timeout=0
     * 空转——这就是卡顿和丢帧的来源。原版 DecodeUtil 把渲染交给独立的
     * DisplayThread 持续 dequeue，这里照做。
     */
    private fun feed(data: ByteArray) {
        val surface = videoSurface ?: return
        if (!surface.isValid) return
        try {
            val c = codec ?: MediaCodec.createDecoderByType("video/avc").also {
                it.configure(MediaFormat.createVideoFormat("video/avc", videoWidth, videoHeight),
                    surface, null, 0)
                it.start()
                codec = it
                startRenderThread(it)
            }
            // 阻塞等一个可用的输入槽：丢帧会让画面停顿
            var idx = -1
            while (idx < 0 && running) {
                idx = c.dequeueInputBuffer(20_000)
            }
            if (idx < 0) return
            val ib = c.getInputBuffer(idx) ?: return
            ib.clear()
            ib.put(data)
            c.queueInputBuffer(idx, 0, data.size, System.nanoTime() / 1000, 0)
            if (!videoStarted) {
                videoStarted = true
                runOnUiThread { statusView?.visibility = View.GONE }
            }
        } catch (e: Exception) {
            Log.e("CarLifeVideo", "decoder: ${e.message}")
        }
    }

    /** 对应原版 DisplayThread：持续把解码结果送去渲染，不依赖新帧到达。 */
    private fun startRenderThread(codec: MediaCodec) {
        Thread({
            val info = MediaCodec.BufferInfo()
            while (running) {
                try {
                    when (val out = codec.dequeueOutputBuffer(info, 10_000)) {
                        MediaCodec.INFO_TRY_AGAIN_LATER -> Unit
                        MediaCodec.INFO_OUTPUT_FORMAT_CHANGED -> Unit
                        else -> if (out >= 0) codec.releaseOutputBuffer(out, true)
                    }
                } catch (e: IllegalStateException) {
                    break
                }
            }
        }, "CarLife-Render").start()
    }

    private fun handleTouch(event: MotionEvent) {
        val s = CarLifeCenter.session ?: return
        val sv = surfaceView ?: return
        val action = when (event.actionMasked) {
            MotionEvent.ACTION_DOWN, MotionEvent.ACTION_POINTER_DOWN -> 0
            MotionEvent.ACTION_UP, MotionEvent.ACTION_POINTER_UP, MotionEvent.ACTION_CANCEL -> 1
            MotionEvent.ACTION_MOVE -> 2
            else -> return
        }
        val viewW = sv.width.toFloat()
        val viewH = sv.height.toFloat()
        if (viewW <= 0 || viewH <= 0) return
        val videoAspect = videoWidth.toFloat() / videoHeight.toFloat()
        val viewAspect = viewW / viewH
        val scaleX: Float
        val scaleY: Float
        val offsetX: Float
        val offsetY: Float
        if (viewAspect > videoAspect) {
            val renderedW = viewH * videoAspect
            offsetX = (viewW - renderedW) / 2f
            offsetY = 0f
            scaleX = videoWidth / renderedW
            scaleY = videoHeight / viewH
        } else {
            val renderedH = viewW / videoAspect
            offsetX = 0f
            offsetY = (viewH - renderedH) / 2f
            scaleX = videoWidth / viewW
            scaleY = videoHeight / renderedH
        }
        val x = ((event.x - offsetX) * scaleX).toInt().coerceIn(0, videoWidth)
        val y = ((event.y - offsetY) * scaleY).toInt().coerceIn(0, videoHeight)
        s.sendTouch(action, x, y)
    }

    override fun onDestroy() {
        running = false
        CarLifeCenter.removeListener(centerListener)
        codec?.let { try { it.stop() } catch (_: Exception) {}; it.release() }
        codec = null
        super.onDestroy()
    }
}
