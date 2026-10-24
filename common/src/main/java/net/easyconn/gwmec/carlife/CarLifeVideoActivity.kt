package net.easyconn.gwmec.carlife

import android.view.MotionEvent

/**
 * CarLife H.264 视频界面：MediaCodec 解码到 SurfaceView，触控经通道 6 回传手机。
 * 触控动作对照手机端 RemoteDisplayGLView：0=DOWN, 1=UP, 2=MOVE。
 */
class CarLifeVideoActivity : android.app.Activity() {
    private var session: CarLifeSession? = null
    private var codec: android.media.MediaCodec? = null
    private var statusView: android.widget.TextView? = null
    private var videoWidth = 1280
    private var videoHeight = 720
    private var decoderStarted = false
    private val bufferInfo = android.media.MediaCodec.BufferInfo()

    private val uiRunner = java.util.concurrent.Executors.newSingleThreadExecutor()

    override fun onCreate(savedInstanceState: android.os.Bundle?) {
        super.onCreate(savedInstanceState)
        android.app.ActionBar.LayoutParams()
        val frame = android.widget.FrameLayout(this)
        val surface = android.view.SurfaceView(this)
        surface.holder.addCallback(object : android.view.SurfaceHolder.Callback {
            override fun surfaceCreated(holder: android.view.SurfaceHolder) { startSession(holder.surface) }
            override fun surfaceChanged(holder: android.view.SurfaceHolder, f: Int, w: Int, h: Int) {}
            override fun surfaceDestroyed(holder: android.view.SurfaceHolder) { stopSession() }
        })
        val status = android.widget.TextView(this)
        status.setTextColor(0xFFFFFFFF.toInt()); status.setPadding(24, 48, 24, 24)
        statusView = status
        frame.addView(surface, android.widget.FrameLayout.LayoutParams(
            android.view.ViewGroup.LayoutParams.MATCH_PARENT, android.view.ViewGroup.LayoutParams.MATCH_PARENT))
        frame.addView(status, android.widget.FrameLayout.LayoutParams(
            android.view.ViewGroup.LayoutParams.WRAP_CONTENT, android.view.ViewGroup.LayoutParams.WRAP_CONTENT))
        setContentView(frame)
    }

    private fun startSession(surface: android.view.Surface) {
        stopSession()
        val s = CarLifeSession(videoWidth, videoHeight, 30, object : CarLifeSession.Listener {
            override fun onState(state: String) = runOnUiThread { statusView?.text = "CarLife：$state" }
            override fun onLog(line: String) = android.util.Log.i("CarLifeVideo", line)
            override fun onPhoneInfo(info: String) = runOnUiThread { statusView?.text = "CarLife：$info" }
            override fun onVideoFrame(data: ByteArray, tsMs: Long) = feedDecoder(data)
        })
        session = s
        s.start()
    }

    private fun stopSession() {
        session?.stop(); session = null
        codec?.let { try { it.stop() } catch (_: Exception) {}; it.release() }
        codec = null; decoderStarted = false
    }

    private fun feedDecoder(data: ByteArray) = runOnUiThread { feedOnUiThread(data) }

    private fun feedOnUiThread(data: ByteArray) {
        val surface = (window.decorView as? android.view.ViewGroup)?.getChildAt(0) as? android.view.SurfaceView ?: return
        if (!surface.holder.surface.isValid) return
        try {
            val c = codec ?: android.media.MediaCodec.createDecoderByType("video/avc").also {
                it.configure(android.media.MediaFormat.createVideoFormat("video/avc", videoWidth, videoHeight),
                    surface, null, 0)
                it.start(); decoderStarted = true; codec = it
            }
            val idx = c.dequeueInputBuffer(10_000)
            if (idx >= 0) {
                val ib = c.getInputBuffer(idx) ?: return
                ib.clear(); ib.put(data)
                c.queueInputBuffer(idx, 0, data.size, System.nanoTime() / 1000, 0)
            }
            var out = c.dequeueOutputBuffer(bufferInfo, 0)
            while (out >= 0) {
                c.releaseOutputBuffer(out, true)
                out = c.dequeueOutputBuffer(bufferInfo, 0)
            }
        } catch (e: Exception) {
            android.util.Log.e("CarLifeVideo", "decoder: ${e.message}")
        }
    }

    override fun onTouchEvent(event: android.view.MotionEvent): Boolean {
        val s = session ?: return super.onTouchEvent(event)
        val action = when (event.actionMasked) {
            MotionEvent.ACTION_DOWN, MotionEvent.ACTION_POINTER_DOWN -> 0
            MotionEvent.ACTION_UP, MotionEvent.ACTION_POINTER_UP, MotionEvent.ACTION_CANCEL -> 1
            MotionEvent.ACTION_MOVE -> 2
            else -> return false
        }
        val x = (event.x / width.toFloat() * videoWidth).toInt()
        val y = (event.y / height.toFloat() * videoHeight).toInt()
        s.sendTouch(action, x, y)
        return true
    }

    override fun onDestroy() { stopSession(); super.onDestroy() }
    override fun onBackPressed() { stopSession(); super.onBackPressed() }
}
