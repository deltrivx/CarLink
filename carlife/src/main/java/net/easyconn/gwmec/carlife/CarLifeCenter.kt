package net.easyconn.gwmec.carlife

import android.hardware.usb.UsbDevice

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

    /**
     * @param canvasWidth/@param canvasHeight 车机投屏画布尺寸。连接时就要带上，
     * 否则握手用的是默认 1280x720，等投屏页拿到真实尺寸时协商已经结束了。
     */
    fun connect(
        context: Context,
        usb: Boolean,
        canvasWidth: Int = 0,
        canvasHeight: Int = 0,
    ) {
        // 只有链路真的活着才复用：running 只说明线程没停，不代表链路还在。
        // 之前只看 session != null 就 return，死会话把界面永远钉在「连接中」。
        val live = session?.let { it.running && it.isLinkAlive() } ?: false
        if (live) return
        if (session != null) {
            log("上一个会话已失效，重建连接")
            teardown()
        }
        attach(context)
        mode = if (usb) "usb" else "wifi"
        val transport: CarLifeTransport = if (usb) {
            CarLifeUsbTransport(context.applicationContext) { line -> log(line) }
        } else {
            CarLifeWifiTransport { line -> log(line) }
        }
        val connectType = if (usb) CarLifeProtocol.CONNECT_TYPE_AOA else CarLifeProtocol.CONNECT_TYPE_WIFI
        val s = CarLifeSession(
            transport = transport,
            connectType = connectType,
            videoWidth = if (canvasWidth > 0) canvasWidth else 1280,
            videoHeight = if (canvasHeight > 0) canvasHeight else 720,
            listener = CenterListener,
        )
        connectionState = State.CONNECTING
        lastError = null
        session = s
        if (usb) watchUsbPermission(context.applicationContext)
        Thread({ s.start() }, "CarLife-Center-Connect").start()
    }

    fun disconnect() {
        teardown()
    }

    /**
     * 销毁会话：停线程、关掉传输、清干净单例状态。
     *
     * 原版 AOAConnectManager.uninit() 会停掉读线程、停掉 socket 线程、释放
     * UsbDeviceConnection，再连时从零开始。这里照同样口径，漏一步就会留下
     * "session 还在但链路已死"的僵死状态。
     */
    private fun teardown() {
        val s = session
        session = null
        mode = null
        try { s?.stop() } catch (e: Exception) { log("stop 异常: ${e.message}") }
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
                    val dev = if (android.os.Build.VERSION.SDK_INT >= 33) {
                        intent.getParcelableExtra(UsbManager.EXTRA_DEVICE, UsbDevice::class.java)
                    } else {
                        @Suppress("DEPRECATION")
                        intent.getParcelableExtra(UsbManager.EXTRA_DEVICE)
                    }
                    // AOA切换时设备会从普通模式(如0bb4:1001)断开并重枚举为配件(18d1:2d00)，不能判定为拔出误断开！
                    // 对齐原版 UsbAccessoryScanner：DETACHED 时只重置就绪状态，不中断握手
                    if (dev?.vendorId == 6353) {
                        log("AOA 配件设备拔出")
                        if (session != null && mode == "usb") {
                            disconnect()
                        }
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
