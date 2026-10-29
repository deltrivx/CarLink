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
    /** 视频画布尺寸：由车机 Surface 实际尺寸决定，对齐原版 mSurfaceView.getWidth()/getHeight()。 */
    @Volatile var videoWidth: Int = 1280,
    @Volatile var videoHeight: Int = 720,
    private val frameRate: Int = 30,
    private val listener: Listener,
) {
    interface Listener {
        fun onState(state: String)
        fun onLog(line: String)
        fun onVideoFrame(data: ByteArray, tsMs: Long)
        fun onPhoneInfo(info: String)
        fun onNaviInfo(info: CarLifeMessages.NaviNextTurnInfo) {}
        fun onMediaInfo(info: CarLifeMessages.MediaInfoData) {}
        fun onBtHfpIndication(command: Int, phoneNum: String) {}
        /** 手机回的真实编码尺寸：解码器必须按这个建，不能按车机猜的。 */
        fun onVideoSize(width: Int, height: Int) {}
        fun onDisconnected()
    }

    @Volatile var running = false
        private set

    @Volatile private var videoStarted = false
    @Volatile private var versionMatched = false
    private var lastTs = 0L
    val audio = CarLifeAudio { line -> listener.onLog(line) }

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
                CarLifeProtocol.CHANNEL_AUDIO -> audio.feedMusic(payload)
                CarLifeProtocol.CHANNEL_TTS -> audio.feedTts(payload)
                CarLifeProtocol.CHANNEL_VR -> handleVrData(payload)
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
        audio.stopAll()
        transport.stop()
        listener.onState("已断开")
        listener.onDisconnected()
    }

    private companion object {
        /** 1.5s 一次，约 20 秒无回应即判超时（原版连接超时同为 20s 量级）。 */
        const val HANDSHAKE_TIMEOUT_TRIES = 14
    }

    private fun sendCmd(serviceType: Int, payload: ByteArray = ByteArray(0)): Boolean =
        transport.send(CarLifeProtocol.CHANNEL_CMD, serviceType, payload)

    private fun handleVrData(payload: ByteArray) {
        // VR 通道双向：手机端发来的语音识别数据，车端也可回传麦克风数据
        // 此处先处理手机端发来的 VR 数据（如语音识别结果），麦克风数据由 startMic 驱动
    }

    // ---- 握手状态机 ----
    private fun startHandshake() {
        listener.onState("版本协商")
        thread(name = "CarLife-Handshake") {
            var retries = 0
            while (running && !versionMatched) {
                // 握手超过 20 秒没有任何回应，就当这条链路废了：主动收尾回 IDLE，
                // 不要让界面永远停在「连接中请稍候」。原版有 20 秒连接超时，同理。
                if (retries >= HANDSHAKE_TIMEOUT_TRIES) {
                    listener.onLog("等待手机响应超时，结束本次连接")
                    stop()
                    return@thread
                }
                sendCmd(CarLifeProtocol.MSG_HU_PROTOCOL_VERSION, CarLifeMessages.protocolVersion(4, 0))
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
                // 原版在此刻 VehiclePCMPlayer.initial() + threadStart()：音频播放器要先就绪，
                // 手机端才会向音频通道推 PCM。
                audio.prepare()
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
                // 发送蓝牙音频信息（对齐 APK）
                sendCmd(CarLifeProtocol.MSG_HU_BT_AUDIO_INFO,
                    CarLifeMessages.btAudioInfo(true))
                // 发送车辆信息（对齐 APK）
                sendCmd(CarLifeProtocol.MSG_HU_VEHICLE_INFO,
                    CarLifeMessages.vehicleInfo(0, 1))
                listener.onState("视频准备中")
            }
            CarLifeProtocol.MSG_MD_VIDEO_ENCODER_INIT -> {
                // 原版 CarlifeActivity MSG_CMD_VIDEO_ENCODER_INIT_DONE 分支：
                // 1) 用手机回的尺寸建解码器  2) 设触摸容器  3) 才发 START 请求推流
                val (w, h, fps) = CarLifeMessages.parseEncoderInfo(payload)
                listener.onLog("手机确认编码参数 ${w}x${h}@$fps")
                listener.onVideoSize(w, h)
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
            CarLifeProtocol.MSG_MD_MUSIC_INIT -> {
                val params = CarLifeAudio.parseAudioInit(payload)
                audio.startMusic(params.sampleRate, params.channelConfig, params.sampleFormat)
                sendCmd(CarLifeProtocol.MSG_HU_MUSIC_INIT)
                listener.onLog("媒体音频初始化 ${params.sampleRate}Hz ch=${params.channelConfig}")
            }
            CarLifeProtocol.MSG_MD_TTS_INIT -> {
                val params = CarLifeAudio.parseAudioInit(payload)
                audio.startTts(params.sampleRate, params.channelConfig, params.sampleFormat)
                sendCmd(CarLifeProtocol.MSG_HU_TTS_INIT)
                listener.onLog("TTS 音频初始化 ${params.sampleRate}Hz ch=${params.channelConfig}")
            }
            CarLifeProtocol.MSG_MD_BT_AUDIO_INFO -> {
                listener.onLog("收到蓝牙音频信息")
            }
            CarLifeProtocol.MSG_MD_BT_HFP_INDICATION -> {
                val (cmd, phone) = CarLifeMessages.parseBtHfpIndication(payload)
                listener.onBtHfpIndication(cmd, phone)
            }
            CarLifeProtocol.MSG_MD_NAVI_NEXT_TURN -> {
                val navi = CarLifeMessages.parseNaviNextTurn(payload)
                listener.onNaviInfo(navi)
            }
            CarLifeProtocol.MSG_MD_MEDIA_INFO -> {
                val media = CarLifeMessages.parseMediaInfo(payload)
                listener.onMediaInfo(media)
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

    /**
     * 画布尺寸变化后重新协商视频参数。
     *
     * 原版在 rotation/窗口变化时会再发一次 sendVideoCodecMsg(w, h, 0) 并在必要时重建
     * 解码器；这里让投屏页把 Surface 尺寸交给会话，会话按新尺寸重发编码参数。
     */
    fun requestVideoResize(width: Int, height: Int) {
        if (width == videoWidth && height == videoHeight) return
        videoWidth = width
        videoHeight = height
        // 握手没完成时只记住画布，不发帧：此时发视频参数手机端还没准备好接收。
        if (!versionMatched) return
        if (!videoStarted) return
        listener.onLog("画布更新为 ${width}x$height，重发视频参数")
        sendCmd(CarLifeProtocol.MSG_HU_VIDEO_ENCODER_INIT,
            CarLifeMessages.videoEncoderInfo(width, height, frameRate))
    }

    /**
     * 链路是否真的活着。
     *
     * running 只表示线程没被要求停，不代表 USB/WiFi 通道还在。中心层决定
     * 「复用还是重建」必须看这个，否则死会话会被当成活会话复用，
     * 界面就永远停在「连接中请稍候」。
     */
    fun isLinkAlive(): Boolean = running && transport.isAlive()

    fun sendTouch(action: Int, x: Int, y: Int) {
        transport.send(CarLifeProtocol.CHANNEL_TOUCH, CarLifeProtocol.MSG_TOUCH_ACTION,
            CarLifeMessages.touchAction(action, x, y))
    }

    fun sendHardKey(code: Int) {
        transport.send(CarLifeProtocol.CHANNEL_TOUCH, CarLifeProtocol.MSG_HARD_KEY_CODE,
            CarLifeMessages.hardKeyCode(code))
    }

    fun sendBtHfpRequest(command: Int, phoneNum: String = "") {
        transport.send(CarLifeProtocol.CHANNEL_CMD, CarLifeProtocol.MSG_HU_BT_HFP_REQUEST,
            CarLifeMessages.btHfpRequest(command, phoneNum))
    }
}
