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

        onBackPressedDispatcher.addCallback(this, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                CarLifeCenter.disconnect()
                finish()
            }
        })
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
            if (!videoStarted) {
                videoStarted = true
                statusView?.visibility = View.GONE
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
            scaleX = videoWidth / renderedW
            scaleY = videoHeight / viewH
        } else {
            val renderedH = viewW / videoAspect
            offsetY = (viewH - renderedH) / 2f
            scaleX = videoWidth / viewW
            scaleY = videoHeight / renderedH
        }
        val x = ((event.x - offsetX) * scaleX).toInt().coerceIn(0, videoWidth)
        val y = ((event.y - offsetY) * scaleY).toInt().coerceIn(0, videoHeight)
        s.sendTouch(action, x, y)
    }

    override fun onDestroy() {
        CarLifeCenter.removeListener(centerListener)
        codec?.let { try { it.stop() } catch (_: Exception) {}; it.release() }
        codec = null
        super.onDestroy()
    }
}
