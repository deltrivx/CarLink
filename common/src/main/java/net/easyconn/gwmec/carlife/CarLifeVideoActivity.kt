package net.easyconn.gwmec.carlife

import android.app.Activity
import android.media.MediaCodec
import android.media.MediaFormat
import android.os.Bundle
import android.util.Log
import android.view.MotionEvent
import android.view.Surface
import android.view.SurfaceHolder
import android.view.SurfaceView
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.TextView

/**
 * CarLife H.264 视频界面：MediaCodec 解码到 SurfaceView，触控经通道 6 回传手机。
 * 触控动作对照手机端 RemoteDisplayGLView：0=DOWN, 1=UP, 2=MOVE。
 */
class CarLifeVideoActivity : Activity() {
    private var session: CarLifeSession? = null
    private var codec: MediaCodec? = null
    private var statusView: TextView? = null
    private var videoWidth = 1280
    private var videoHeight = 720
    private val bufferInfo = MediaCodec.BufferInfo()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val frame = FrameLayout(this)
        val surface = SurfaceView(this)
        surface.holder.addCallback(object : SurfaceHolder.Callback {
            override fun surfaceCreated(holder: SurfaceHolder) = startSession(holder.surface)
            override fun surfaceChanged(holder: SurfaceHolder, format: Int, width: Int, height: Int) {}
            override fun surfaceDestroyed(holder: SurfaceHolder) = stopSession()
        })
        val status = TextView(this)
        status.setTextColor(0xFFFFFFFF.toInt())
        status.setPadding(24, 48, 24, 24)
        statusView = status
        frame.addView(surface, FrameLayout.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT))
        frame.addView(status, FrameLayout.LayoutParams(
            ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT))
        setContentView(frame)
    }

    private fun startSession(surface: Surface) {
        stopSession()
        val s = CarLifeSession(videoWidth, videoHeight, 30, object : CarLifeSession.Listener {
            override fun onState(state: String) {
                runOnUiThread { statusView?.text = "CarLife：$state" }
            }
            override fun onLog(line: String) {
                Log.i("CarLifeVideo", line)
            }
            override fun onPhoneInfo(info: String) {
                runOnUiThread { statusView?.text = "CarLife：$info" }
            }
            override fun onVideoFrame(data: ByteArray, tsMs: Long) {
                runOnUiThread { feed(data, surface) }
            }
        })
        session = s
        s.start()
    }

    private fun stopSession() {
        session?.stop()
        session = null
        codec?.let { try { it.stop() } catch (_: Exception) {}; it.release() }
        codec = null
    }

    private fun feed(data: ByteArray, surface: Surface) {
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

    override fun onTouchEvent(event: MotionEvent): Boolean {
        val s = session ?: return super.onTouchEvent(event)
        val action = when (event.actionMasked) {
            MotionEvent.ACTION_DOWN, MotionEvent.ACTION_POINTER_DOWN -> 0
            MotionEvent.ACTION_UP, MotionEvent.ACTION_POINTER_UP, MotionEvent.ACTION_CANCEL -> 1
            MotionEvent.ACTION_MOVE -> 2
            else -> return false
        }
        val x = (event.x / resources.displayMetrics.widthPixels.toFloat() * videoWidth).toInt()
        val y = (event.y / resources.displayMetrics.heightPixels.toFloat() * videoHeight).toInt()
        s.sendTouch(action, x, y)
        return true
    }

    override fun onDestroy() {
        stopSession()
        super.onDestroy()
    }

    @Deprecated("Deprecated in Java")
    override fun onBackPressed() {
        stopSession()
        super.onBackPressed()
    }
}
