package net.easyconn.gwmec.carlife

import android.app.Activity
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.hardware.usb.UsbManager
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
import android.widget.Button
import android.widget.FrameLayout
import android.widget.LinearLayout
import android.widget.ScrollView
import android.widget.TextView
import kotlin.concurrent.thread

/**
 * CarLife 连接与投屏：先连接面板（USB 有线 / 无线），握手完成后同一页面直接进入视频。
 * USB 插入自动走有线；无线监听手机广播。状态实时可见，不再是"等待手机"一个死胡同。
 */
class CarLifeVideoActivity : Activity() {
    private var session: CarLifeSession? = null
    private var codec: MediaCodec? = null
    private var videoSurface: Surface? = null
    private var connectPanel: LinearLayout? = null
    private var statusLine: TextView? = null
    private var logView: TextView? = null
    private var videoWidth = 1280
    private var videoHeight = 720
    private val bufferInfo = MediaCodec.BufferInfo()
    private val logLines = ArrayDeque<String>()

    private val usbReceiver = object : BroadcastReceiver() {
        override fun onReceive(context: Context, intent: Intent) {
            if (intent.action == UsbManager.ACTION_USB_DEVICE_ATTACHED && session == null) {
                startConnection(usb = true)
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val frame = FrameLayout(this)
        val surface = SurfaceView(this)
        surface.holder.addCallback(object : SurfaceHolder.Callback {
            override fun surfaceCreated(holder: SurfaceHolder) {
                videoSurface = holder.surface
            }
            override fun surfaceChanged(holder: SurfaceHolder, f: Int, w: Int, h: Int) {}
            override fun surfaceDestroyed(holder: SurfaceHolder) { videoSurface = null }
        })
        surface.setOnTouchListener { _, event -> handleTouch(event); true }
        frame.addView(surface, FrameLayout.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT))
        frame.addView(buildConnectPanel(), FrameLayout.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT))
        setContentView(frame)
        // Android 13+ 要求非系统广播的动态接收器显式声明可见性；
        // 自定义 USB 授权广播只接收本应用发出的 PendingIntent。
        val usbFilter = IntentFilter(UsbManager.ACTION_USB_DEVICE_ATTACHED)
        usbFilter.addAction(CarLifeUsbTransport.ACTION_USB_PERMISSION)
        androidx.core.content.ContextCompat.registerReceiver(
            this, usbReceiver, usbFilter,
            androidx.core.content.ContextCompat.RECEIVER_NOT_EXPORTED)
        // 已插着安卓手机（AOA 配件或常见手机 VID）时直接走有线
        val usb = getSystemService(Context.USB_SERVICE) as? UsbManager
        if (usb?.deviceList?.isNotEmpty() == true) startConnection(usb = true)
    }

    /** 连接面板：模式选择 + 当前状态 + 过程日志。 */
    private fun buildConnectPanel(): LinearLayout {
        val panel = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER
            setPadding(64, 64, 64, 64)
            setBackgroundColor(0xEE101418.toInt())
        }
        statusLine = TextView(this).apply {
            text = "选择连接方式"
            textSize = 22f
            setTextColor(0xFFFFFFFF.toInt())
        }
        val usbButton = Button(this).apply {
            text = "USB 有线连接"
            setOnClickListener { startConnection(usb = true) }
        }
        val wifiButton = Button(this).apply {
            text = "无线连接（车机热点 / 同一网络）"
            setOnClickListener { startConnection(usb = false) }
        }
        val hint = TextView(this).apply {
            text = "· 有线：手机用数据线连接车机，首次会请求 USB 授权\n· 无线：手机安装百度 CarLife，加入车机热点或同一 Wi-Fi，App 内点击连接"
            textSize = 13f
            setTextColor(0xFFB0BEC5.toInt())
            setPadding(0, 32, 0, 0)
        }
        logView = TextView(this).apply {
            textSize = 12f
            setTextColor(0xFF90A4AE.toInt())
            setPadding(0, 24, 0, 0)
        }
        val scroll = ScrollView(this).apply { addView(logView) }
        panel.addView(statusLine)
        panel.addView(usbButton, LinearLayout.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT).apply { topMargin = 48 })
        panel.addView(wifiButton, LinearLayout.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT).apply { topMargin = 24 })
        panel.addView(hint)
        panel.addView(scroll, LinearLayout.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT, 0, 1f).apply { topMargin = 24 })
        connectPanel = panel
        return panel
    }

    private fun startConnection(usb: Boolean) {
        if (session != null) return
        val transport: CarLifeTransport
        val connectType: Int
        if (usb) {
            transport = CarLifeUsbTransport(this) { line -> appendLog(line) }
            connectType = CarLifeProtocol.CONNECT_TYPE_AOA
            statusLine?.text = "USB 有线连接中…"
        } else {
            transport = CarLifeWifiTransport { line -> appendLog(line) }
            connectType = CarLifeProtocol.CONNECT_TYPE_WIFI
            statusLine?.text = "无线连接中…"
        }
        val s = CarLifeSession(transport, connectType, videoWidth, videoHeight, 30, object : CarLifeSession.Listener {
            override fun onState(state: String) {
                runOnUiThread { statusLine?.text = "CarLife：$state" }
            }
            override fun onLog(line: String) {
                appendLog(line)
            }
            override fun onPhoneInfo(info: String) {
                runOnUiThread { statusLine?.text = "已识别手机：$info" }
            }
            override fun onVideoFrame(data: ByteArray, tsMs: Long) {
                runOnUiThread { feed(data) }
            }
            override fun onDisconnected() {
                runOnUiThread { showPanel(true) }
            }
        })
        session = s
        thread { s.start() }
        showPanel(false)
    }

    private fun showPanel(show: Boolean) {
        runOnUiThread { connectPanel?.visibility = if (show) android.view.View.VISIBLE else android.view.View.GONE }
    }

    private fun appendLog(line: String) {
        runOnUiThread {
            logLines.addLast(line)
            while (logLines.size > 12) logLines.removeFirst()
            logView?.text = logLines.joinToString("\n")
            Log.i("CarLifeConnect", line)
        }
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
        val s = session ?: return
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
        runCatching { unregisterReceiver(usbReceiver) }
        session?.stop(); session = null
        codec?.let { try { it.stop() } catch (_: Exception) {}; it.release() }
        codec = null
        super.onDestroy()
    }

    @Deprecated("Deprecated in Java")
    override fun onBackPressed() {
        session?.stop(); session = null
        super.onBackPressed()
    }
}
