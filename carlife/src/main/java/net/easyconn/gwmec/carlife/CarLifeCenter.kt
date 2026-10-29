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
    enum class State { IDLE, CONNECTING, CONNECTED, ERROR }
    @Volatile var connectionState: State = State.IDLE
        private set
    @Volatile var lastError: String? = null
        private set

    @Volatile var session: CarLifeSession? = null
        private set
    @Volatile var mode: String? = null
        private set

    private val listeners = mutableListOf<CarLifeSession.Listener>()

    fun addListener(l: CarLifeSession.Listener) {
        synchronized(listeners) { listeners.add(l) }
    }

    fun removeListener(l: CarLifeSession.Listener) {
        synchronized(listeners) { listeners.remove(l) }
    }

    @Deprecated("Use addListener/removeListener to avoid clobbering other subscribers")
    @Volatile var listener: CarLifeSession.Listener? = null

    private val logLines = ArrayDeque<String>()
    var onLogLine: ((String) -> Unit)? = null

    private var appContext: Context? = null
    private var usbRetryReceiver: BroadcastReceiver? = null

    fun attach(context: Context) {
        if (appContext != null) return
        appContext = context.applicationContext
    }

    fun connect(context: Context, usb: Boolean) {
        // 会话还活着就复用：从投屏页返回再进入时，重建会把正在跑的链路拆掉，
        // 新界面拿不到流就卡在「连接中请稍候」。
        session?.let { if (it.running) return }
        session = null
        attach(context)
        mode = if (usb) "usb" else "wifi"
        val transport: CarLifeTransport = if (usb) {
            CarLifeUsbTransport(context.applicationContext) { line -> log(line) }
        } else {
            CarLifeWifiTransport { line -> log(line) }
        }
        val connectType = if (usb) CarLifeProtocol.CONNECT_TYPE_AOA else CarLifeProtocol.CONNECT_TYPE_WIFI
        val s = CarLifeSession(transport, connectType, listener = CenterListener)
        connectionState = State.CONNECTING
        lastError = null
        session = s
        if (usb) watchUsbPermission(context.applicationContext)
        Thread({ s.start() }, "CarLife-Center-Connect").start()
    }

    fun disconnect() {
        session?.stop()
        session = null
        mode = null
        connectionState = State.IDLE
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
        override fun onState(state: String) {
            if (state.contains("已连接")) {
                connectionState = State.CONNECTED
            } else if (state.contains("失败") || state.contains("错误")) {
                connectionState = State.ERROR
                lastError = state
            } else if (state.contains("已断开")) {
                connectionState = State.IDLE
            } else {
                connectionState = State.CONNECTING
            }
            listener?.onState(state)
            synchronized(listeners) { listeners.forEach { it.onState(state) } }
        }
        override fun onLog(line: String) { log(line) }
        override fun onVideoFrame(data: ByteArray, tsMs: Long) {
            listener?.onVideoFrame(data, tsMs)
            synchronized(listeners) { listeners.forEach { it.onVideoFrame(data, tsMs) } }
        }
        override fun onPhoneInfo(info: String) {
            listener?.onPhoneInfo(info)
            synchronized(listeners) { listeners.forEach { it.onPhoneInfo(info) } }
        }
        override fun onNaviInfo(info: CarLifeMessages.NaviNextTurnInfo) {
            listener?.onNaviInfo(info)
            synchronized(listeners) { listeners.forEach { it.onNaviInfo(info) } }
        }
        override fun onMediaInfo(info: CarLifeMessages.MediaInfoData) {
            listener?.onMediaInfo(info)
            synchronized(listeners) { listeners.forEach { it.onMediaInfo(info) } }
        }
        override fun onBtHfpIndication(command: Int, phoneNum: String) {
            listener?.onBtHfpIndication(command, phoneNum)
            synchronized(listeners) { listeners.forEach { it.onBtHfpIndication(command, phoneNum) } }
        }
        override fun onDisconnected() {
            session = null
            mode = null
            connectionState = State.IDLE
            unwatchUsbPermission()
            listener?.onDisconnected()
            synchronized(listeners) { listeners.forEach { it.onDisconnected() } }
        }
    }
}
