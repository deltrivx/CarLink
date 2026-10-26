package net.easyconn.gwmec.carlife

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.hardware.usb.UsbManager
import android.util.Log

/**
 * CarLife 连接中枢：页面与投屏界面共享同一个会话。
 * 状态文案对齐原 APK（百度 CarLife 车机端）：
 * 「等待连接: IP」「连接成功: IP」「USB设备已插入 VID=…, PID=…」等。
 */
object CarLifeCenter {
    @Volatile var session: CarLifeSession? = null
        private set
    @Volatile var mode: String? = null
        private set

    /** 页面/投屏界面的回调；会话事件转发给当前注册者。 */
    @Volatile var listener: CarLifeSession.Listener? = null

    private val logLines = ArrayDeque<String>()
    var onLogLine: ((String) -> Unit)? = null

    private var appContext: Context? = null
    private var usbRetryReceiver: BroadcastReceiver? = null

    fun attach(context: Context) {
        if (appContext != null) return
        appContext = context.applicationContext
    }

    /** 直连已知 IP（盒子/指定IP模式），不经过广播发现。 */
    fun connectToIp(context: Context, ip: String) {
        if (session != null) return
        attach(context)
        mode = "wifi"
        val transport = CarLifeWifiTransport { line -> log(line) }
        session = CarLifeSession(transport, CarLifeProtocol.CONNECT_TYPE_WIFI, listener = CenterListener)
        session?.let { Thread({ it.start() }, "CarLife-Center-Connect").start() }
    }

    fun connect(context: Context, usb: Boolean) {
        if (session != null) return
        attach(context)
        mode = if (usb) "usb" else "wifi"
        val transport: CarLifeTransport = if (usb) {
            CarLifeUsbTransport(context.applicationContext, ::log)
        } else {
            CarLifeWifiTransport(::log)
        }
        val connectType = if (usb) CarLifeProtocol.CONNECT_TYPE_AOA else CarLifeProtocol.CONNECT_TYPE_WIFI
        val s = CarLifeSession(transport, connectType, listener = CenterListener)
        session = s
        if (usb) watchUsbPermission(context.applicationContext)
        Thread({ s.start() }, "CarLife-Center-Connect").start()
    }

    fun disconnect() {
        session?.stop()
        session = null
        mode = null
        unwatchUsbPermission()
    }

    fun log(line: String) {
        Log.i("CarLifeCenter", line)
        synchronized(logLines) {
            logLines.addLast(line)
            while (logLines.size > 40) logLines.removeFirst()
        }
        onLogLine?.invoke(line)
    }

    fun recentLog(): List<String> = synchronized(logLines) { logLines.toList() }

    fun state(): String = session?.let { if (it.running) "进行中" else "已断开" } ?: "未连接"

    /** USB 授权广播：原 APK 的「USB权限已授予，正在连接」流程。 */
    private fun watchUsbPermission(context: Context) {
        unwatchUsbPermission()
        val receiver = object : BroadcastReceiver() {
            override fun onReceive(c: Context, intent: Intent) {
                if (intent.action == CarLifeUsbTransport.ACTION_USB_PERMISSION) {
                    val granted = intent.getBooleanExtra(UsbManager.EXTRA_PERMISSION_GRANTED, false)
                    if (granted) {
                        log("USB权限已授予，正在连接")
                        retryUsb(context)
                    } else {
                        log("USB权限被拒绝，请在弹窗中允许")
                    }
                } else if (intent.action == UsbManager.ACTION_USB_DEVICE_ATTACHED) {
                    log("USB设备已插入")
                    if (session == null) connect(c, usb = true)
                } else if (intent.action == UsbManager.ACTION_USB_DEVICE_DETACHED) {
                    if (session != null && mode == "usb") {
                        log("USB设备已拔出")
                        disconnect()
                    }
                }
            }
        }
        val filter = IntentFilter(CarLifeUsbTransport.ACTION_USB_PERMISSION)
        filter.addAction(UsbManager.ACTION_USB_DEVICE_ATTACHED)
        filter.addAction(UsbManager.ACTION_USB_DEVICE_DETACHED)
        androidx.core.content.ContextCompat.registerReceiver(
            context, receiver, filter,
            androidx.core.content.ContextCompat.RECEIVER_NOT_EXPORTED)
        usbRetryReceiver = receiver
    }

    private fun unwatchUsbPermission() {
        val ctx = appContext ?: return
        usbRetryReceiver?.let { runCatching { ctx.unregisterReceiver(it) } }
        usbRetryReceiver = null
    }

    private fun retryUsb(context: Context) {
        if (session != null) disconnect()
        connect(context, usb = true)
    }

    private object CenterListener : CarLifeSession.Listener {
        override fun onState(state: String) { listener?.onState(state) }
        override fun onLog(line: String) { log(line) }
        override fun onVideoFrame(data: ByteArray, tsMs: Long) { listener?.onVideoFrame(data, tsMs) }
        override fun onPhoneInfo(info: String) { listener?.onPhoneInfo(info) }
        override fun onDisconnected() {
            session = null
            mode = null
            unwatchUsbPermission()
            listener?.onDisconnected()
        }
    }
}
