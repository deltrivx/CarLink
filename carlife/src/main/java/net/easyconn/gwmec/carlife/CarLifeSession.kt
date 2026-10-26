package net.easyconn.gwmec.carlife

import kotlin.concurrent.thread

/**
 * CarLife 会话：与传输无关的握手状态机。
 * 传输由注入的 CarLifeTransport 提供（WiFi 7-socket / USB AOA 单管道）。
 * 握手时序对照原 APK（百度 CarLife SDK）反编译：版本协商 → 统计 → 设备信息 →
 * 鉴权 → 特征配置（CONNECT_TYPE 按传输路线）→ 视频参数 → 开始推流，1s 心跳。
 */
class CarLifeSession(
    private val transport: CarLifeTransport,
    private val connectType: Int,
    private val videoWidth: Int = 1280,
    private val videoHeight: Int = 720,
    private val frameRate: Int = 30,
    private val listener: Listener,
) {
    interface Listener {
        fun onState(state: String)
        fun onLog(line: String)
        /** 视频通道送来的 H.264 码流块（Annex-B），ts 为毫秒时间戳 */
        fun onVideoFrame(data: ByteArray, tsMs: Long)
        fun onPhoneInfo(info: String)
        fun onDisconnected()
    }

    @Volatile var running = false
        private set

    @Volatile private var videoStarted = false
    @Volatile private var versionMatched = false
    private var lastTs = 0L

    fun start() {
        if (running) return
        running = true
        listener.onState(if (connectType == CarLifeProtocol.CONNECT_TYPE_AOA) "建立 USB 连接" else "等待手机")
        val ok = transport.start { channel, serviceType, payload ->
            when (channel) {
                CarLifeProtocol.CHANNEL_CMD -> handleCommand(serviceType, payload)
                CarLifeProtocol.CHANNEL_VIDEO -> {
                    lastTs += 33
                    listener.onVideoFrame(payload, lastTs)
                }
            }
        }
        if (!ok) { listener.onState("连接失败"); stop(); return }
        startHandshake()
    }

    fun stop() {
        if (!running) return
        running = false
        videoStarted = false
        versionMatched = false
        transport.stop()
        listener.onState("已断开")
        listener.onDisconnected()
    }

    private fun sendCmd(serviceType: Int, payload: ByteArray = ByteArray(0)): Boolean =
        transport.send(CarLifeProtocol.CHANNEL_CMD, serviceType, payload)

    // ---- 握手状态机 ----
    private fun startHandshake() {
        listener.onState("版本协商")
        thread(name = "CarLife-Handshake") {
            var retries = 0
            while (running && !versionMatched) {
                if (!sendCmd(CarLifeProtocol.MSG_HU_PROTOCOL_VERSION, CarLifeMessages.protocolVersion(4, 0))) return@thread
                retries++
                if (retries % 4 == 0) listener.onLog("等待手机响应版本协商…（请确认手机 CarLife 在前台）")
                Thread.sleep(1500)
            }
        }
    }

    private fun handleCommand(serviceType: Int, payload: ByteArray) {
        when (serviceType) {
            CarLifeProtocol.MSG_MD_PROTOCOL_VERSION_MATCH -> {
                versionMatched = true
                listener.onLog("手机版本匹配成功")
                sendCmd(CarLifeProtocol.MSG_HU_STATISTIC_INFO, CarLifeMessages.statisticsInfo())
                startHeartbeat()
                listener.onState("交换设备信息")
            }
            CarLifeProtocol.MSG_MD_INFO -> {
                listener.onPhoneInfo(CarLifeMessages.describePhone(payload))
                sendCmd(CarLifeProtocol.MSG_HU_INFO, CarLifeMessages.huDeviceInfo(videoWidth, videoHeight))
                listener.onState("鉴权中")
            }
            CarLifeProtocol.MSG_MD_AUTHEN_RESULT -> {
                sendCmd(CarLifeProtocol.MSG_HU_AUTHEN_RESULT)
                sendCmd(CarLifeProtocol.MSG_HU_VIDEO_ENCODER_INIT,
                    CarLifeMessages.videoEncoderInfo(videoWidth, videoHeight, frameRate))
            }
            CarLifeProtocol.MSG_MD_FEATURE_CONFIG_REQUEST -> {
                sendCmd(CarLifeProtocol.MSG_HU_FEATURE_CONFIG_RESPONSE,
                    CarLifeMessages.featureConfigList(connectType))
                listener.onState("视频准备中")
            }
            CarLifeProtocol.MSG_MD_VIDEO_ENCODER_INIT -> {
                val (w, h, fps) = CarLifeMessages.parseEncoderInfo(payload)
                listener.onLog("手机确认编码参数 ${w}x${h}@$fps")
                sendCmd(CarLifeProtocol.MSG_HU_VIDEO_ENCODER_START)
                videoStarted = true
                listener.onState("已连接")
            }
            CarLifeProtocol.MSG_MD_VIDEO_ENCODER_DONE -> {
                if (!videoStarted) {
                    listener.onLog("手机编码器就绪，重发视频参数")
                    sendCmd(CarLifeProtocol.MSG_HU_VIDEO_ENCODER_INIT,
                        CarLifeMessages.videoEncoderInfo(videoWidth, videoHeight, frameRate))
                }
            }
            CarLifeProtocol.MSG_VIDEO_HEARTBEAT -> { /* 心跳应答保活 */ }
            CarLifeProtocol.MSG_MD_GO_TO_DESKTOP -> listener.onState("手机回桌面")
        }
    }

    private fun startHeartbeat() {
        thread(name = "CarLife-Heartbeat") {
            while (running) {
                if (!sendCmd(CarLifeProtocol.MSG_VIDEO_HEARTBEAT)) return@thread
                Thread.sleep(1000)
            }
        }
    }

    fun sendTouch(action: Int, x: Int, y: Int) {
        transport.send(CarLifeProtocol.CHANNEL_TOUCH, CarLifeProtocol.MSG_TOUCH_ACTION,
            CarLifeMessages.touchAction(action, x, y))
    }

    fun sendHardKey(code: Int) {
        transport.send(CarLifeProtocol.CHANNEL_TOUCH, CarLifeProtocol.MSG_HARD_KEY_CODE,
            CarLifeMessages.hardKeyCode(code))
    }
}
