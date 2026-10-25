package net.easyconn.gwmec.carlife

import android.app.Activity
import android.media.MediaCodec
import android.media.MediaFormat
import android.os.Bundle
import android.util.Log
import android.view.Gravity
import android.view.MotionEvent
import android.view.Surface
import android.view.SurfaceHolder
import android.view.SurfaceView
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.LinearLayout
import android.widget.TextView

/**
 * CarLife 投屏画面：会话由 CarLifeCenter 持有（连接页建立），
 * 本界面只负责解码渲染与触控回传；无会话时引导回连接页。
 */
class CarLifeVideoActivity : Activity() {
    private var codec: MediaCodec? = null
    private var videoSurface: Surface? = null
    private var videoWidth = 1280
    private var videoHeight = 720
    private val bufferInfo = MediaCodec.BufferInfo()

    private val centerListener = object : CarLifeSession.Listener {
        override fun onState(state: String) {}
        override fun onLog(line: String) {}
        override fun onPhoneInfo(info: String) {}
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
        val frame = FrameLayout(this)
        val surface = SurfaceView(this)
        surface.holder.addCallback(object : SurfaceHolder.Callback {
            override fun surfaceCreated(holder: SurfaceHolder) { videoSurface = holder.surface }
            override fun surfaceChanged(holder: SurfaceHolder, f: Int, w: Int, h: Int) {}
            override fun surfaceDestroyed(holder: SurfaceHolder) { videoSurface = null }
        })
        surface.setOnTouchListener { _, event -> handleTouch(event); true }
        frame.addView(surface, FrameLayout.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT))
        val status = TextView(this).apply {
            text = "CarPlay↔CarLife 切换中请稍候"
            setTextColor(0xFFFFFFFF.toInt())
            gravity = Gravity.CENTER
        }
        frame.addView(status, FrameLayout.LayoutParams(
            ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT,
            Gravity.CENTER))
        setContentView(frame)
        CarLifeCenter.listener = centerListener
    }

    private fun feed(data: ByteArray) {
        val surface = videoSurface ?: return
        if (!surface.isValid) return
        try {
            val c = codec ?: MediaCodec.createDecoderByType("video/avc").also {
                it.configure(MediaFormat.createVideoFormat("video/avc", videoWidth, videoHeight),
                    surface, null, 0)
                it.start()
                codec = it
            }
            val idx = c.dequeueInputBuffer(10_000)
            if (idx >= 0) {
                val ib = c.getInputBuffer(idx)
                if (ib != null) {
                    ib.clear()
                    ib.put(data)
                    c.queueInputBuffer(idx, 0, data.size, System.nanoTime() / 1000, 0)
                }
            }
            var out = c.dequeueOutputBuffer(bufferInfo, 0)
            while (out >= 0) {
                c.releaseOutputBuffer(out, true)
                out = c.dequeueOutputBuffer(bufferInfo, 0)
            }
        } catch (e: Exception) {
            Log.e("CarLifeVideo", "decoder: ${e.message}")
        }
    }

    private fun handleTouch(event: MotionEvent) {
        val s = CarLifeCenter.session ?: return
        val action = when (event.actionMasked) {
            MotionEvent.ACTION_DOWN, MotionEvent.ACTION_POINTER_DOWN -> 0
            MotionEvent.ACTION_UP, MotionEvent.ACTION_POINTER_UP, MotionEvent.ACTION_CANCEL -> 1
            MotionEvent.ACTION_MOVE -> 2
            else -> return
        }
        val x = (event.x / resources.displayMetrics.widthPixels.toFloat() * videoWidth).toInt()
        val y = (event.y / resources.displayMetrics.heightPixels.toFloat() * videoHeight).toInt()
        s.sendTouch(action, x, y)
    }

    override fun onDestroy() {
        if (CarLifeCenter.listener === centerListener) CarLifeCenter.listener = null
        codec?.let { try { it.stop() } catch (_: Exception) {}; it.release() }
        codec = null
        super.onDestroy()
    }

    @Deprecated("Deprecated in Java")
    override fun onBackPressed() {
        CarLifeCenter.disconnect()
        super.onBackPressed()
    }
}
