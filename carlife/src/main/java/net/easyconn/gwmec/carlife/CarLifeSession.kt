package net.easyconn.gwmec.carlife

import android.util.Log
import java.io.BufferedOutputStream
import java.net.InetSocketAddress
import java.net.ServerSocket
import java.net.Socket
import kotlin.concurrent.thread

/**
 * CarLife 会话：WiFi 直连模式（CONNECT_TYPE=5）。
 *
 * 流程：监听 UDP 7999 等手机 CarLife App 广播 → 主动连接手机 7 个 TCP 端口 →
 * 控制通道握手（版本协商→统计→设备信息→鉴权→特征配置→视频参数→开始推流）→
 * 视频 H.264 帧回调渲染、触控经通道 6 回传。
 */
class CarLifeSession(
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
    }

    @Volatile var running = false
        private set

    private val sockets = HashMap<Int, Socket>()
    private val outputs = HashMap<Int, BufferedOutputStream>()
    private var udpSocket: java.net.DatagramSocket? = null
    private var videoSeq = 0
    @Volatile private var videoStarted = false
    @Volatile private var versionMatched = false

    fun start() {
        if (running) return
        running = true
        listener.onState("等待手机")
        thread(name = "CarLife-UdpListen") { udpListenLoop() }
    }

    fun stop() {
        if (!running) return
        running = false
        videoStarted = false
        versionMatched = false
        listener.onState("已断开")
        try { udpSocket?.close() } catch (_: Exception) {}
        synchronized(sockets) {
            outputs.values.forEach { try { it.flush() } catch (_: Exception) {} }
            sockets.values.forEach { try { it.close() } catch (_: Exception) {} }
            sockets.clear(); outputs.clear()
        }
    }

    // ---- 第一步：UDP 7999 监听手机广播（手机端每秒广播 "CarlifeHost"）----
    private fun udpListenLoop() {
        val sock = java.net.DatagramSocket(CarLifeProtocol.UDP_DISCOVERY_PORT)
        udpSocket = sock
        listener.onLog("UDP 7999 监听中，等待手机 CarLife 广播…")
        val buf = ByteArray(1024)
        while (running) {
            val pkt = java.net.DatagramPacket(buf, buf.size)
            try {
                sock.receive(pkt)
            } catch (e: Exception) {
                if (running) listener.onLog("UDP 接收异常: $e")
                break
            }
            val ip = pkt.address.hostAddress ?: continue
            listener.onLog("发现手机广播来自 $ip：${String(pkt.data, 0, pkt.length)}")
            if (connectChannels(ip)) return
        }
    }

    // ---- 第二步：连接手机 7 个 TCP 通道 ----
    private fun connectChannels(phoneIp: String): Boolean {
        listener.onState("连接手机")
        for ((ch, port) in CarLifeProtocol.ALL_CHANNELS) {
            val s = Socket()
            try {
                s.connect(InetSocketAddress(phoneIp, port), 3000)
                s.tcpNoDelay = true
                synchronized(sockets) {
                    sockets[ch] = s
                    outputs[ch] = BufferedOutputStream(s.getOutputStream(), 1 shl 16)
                }
                listener.onLog("通道 $ch → $phoneIp:$port 已连接")
            } catch (e: Exception) {
                listener.onLog("通道 $ch ($port) 连接失败: ${e.message}")
                stop()
                return false
            }
        }
        startReaders()
        startHandshake()
        return true
    }

    private fun startReaders() {
        thread(name = "CarLife-CmdReader") { readLoop(CarLifeProtocol.CHANNEL_CMD) }
        thread(name = "CarLife-VideoReader") { readLoop(CarLifeProtocol.CHANNEL_VIDEO) }
    }

    private fun readLoop(channel: Int) {
        val s = synchronized(sockets) { sockets[channel] } ?: return
        val headerSize = CarLifeProtocol.headerSize(channel)
        val header = ByteArray(headerSize)
        try {
            val input = s.getInputStream()
            while (running) {
                if (!readFully(input, header)) break
                val (len, ts, serviceType) = CarLifeProtocol.parseHeader(channel, header)
                if (len < 0 || len > (1 shl 24)) { listener.onLog("通道 $channel 流失步 len=$len"); break }
                val payload = if (len > 0) ByteArray(len).also { if (!readFully(input, it)) break } else ByteArray(0)
                when (channel) {
                    CarLifeProtocol.CHANNEL_CMD -> handleCommand(serviceType, payload)
                    CarLifeProtocol.CHANNEL_VIDEO -> listener.onVideoFrame(payload, ts.toLong() and 0xFFFFFFFFL)
                }
            }
        } catch (e: Exception) {
            if (running) listener.onLog("通道 $channel 读取异常: $e")
        }
        if (running) { listener.onLog("通道 $channel 断开"); stop() }
    }

    private fun readFully(input: java.io.InputStream, buf: ByteArray): Boolean {
        var off = 0
        while (off < buf.size) {
            val n = input.read(buf, off, buf.size - off)
            if (n < 0) return false
            off += n
        }
        return true
    }

    private fun sendCmd(serviceType: Int, payload: ByteArray = ByteArray(0)): Boolean =
        send(CarLifeProtocol.CHANNEL_CMD, serviceType, payload)

    private fun send(channel: Int, serviceType: Int, payload: ByteArray = ByteArray(0)): Boolean {
        val out = synchronized(outputs) { outputs[channel] } ?: return false
        return try {
            val seq = if (channel == CarLifeProtocol.CHANNEL_VIDEO) (videoSeq++ * 33) else 0
            out.write(CarLifeProtocol.pack(channel, serviceType, payload, seq))
            out.flush()
            true
        } catch (e: Exception) {
            listener.onLog("发送失败(通道$channel): ${e.message}")
            stop()
            false
        }
    }

    // ---- 第三步：握手状态机（时序对照 carlife-vehicle 逆向实现）----
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
                listener.onLog("手机版本匹配成功，发送统计信息")
                sendCmd(CarLifeProtocol.MSG_HU_STATISTIC_INFO, CarLifeMessages.statisticsInfo())
                startHeartbeat()
                listener.onState("交换设备信息")
            }
            CarLifeProtocol.MSG_MD_INFO -> {
                listener.onPhoneInfo(CarLifeMessages.describePhone(payload))
                listener.onLog("收到手机设备信息，回复车机信息")
                sendCmd(CarLifeProtocol.MSG_HU_INFO, CarLifeMessages.huDeviceInfo(videoWidth, videoHeight))
                listener.onState("鉴权中")
            }
            CarLifeProtocol.MSG_MD_AUTHEN_RESULT -> {
                listener.onLog("手机鉴权通过，回复确认并请求视频参数")
                sendCmd(CarLifeProtocol.MSG_HU_AUTHEN_RESULT)
                sendCmd(CarLifeProtocol.MSG_HU_VIDEO_ENCODER_INIT,
                    CarLifeMessages.videoEncoderInfo(videoWidth, videoHeight, frameRate))
            }
            CarLifeProtocol.MSG_MD_FEATURE_CONFIG_REQUEST -> {
                listener.onLog("回复特征配置（WiFi 直连）")
                sendCmd(CarLifeProtocol.MSG_HU_FEATURE_CONFIG_RESPONSE,
                    CarLifeMessages.featureConfigList(CarLifeProtocol.CONNECT_TYPE_WIFI))
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
                // 编码器就绪确认后重发一次视频参数；已开始推流则不再重发，避免循环
                if (!videoStarted) {
                    listener.onLog("手机编码器就绪，重发视频参数确认")
                    sendCmd(CarLifeProtocol.MSG_HU_VIDEO_ENCODER_INIT,
                        CarLifeMessages.videoEncoderInfo(videoWidth, videoHeight, frameRate))
                }
            }
            CarLifeProtocol.MSG_VIDEO_HEARTBEAT -> { /* 心跳应答，保活即可 */ }
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

    // ---- 触控回传（通道 6，CarlifeTouchAction，MSG_TOUCH_ACTION）----
    fun sendTouch(action: Int, x: Int, y: Int) {
        send(CarLifeProtocol.CHANNEL_TOUCH, CarLifeProtocol.MSG_TOUCH_ACTION,
            CarLifeMessages.touchAction(action, x, y))
    }

    fun sendHardKey(code: Int) {
        send(CarLifeProtocol.CHANNEL_TOUCH, CarLifeProtocol.MSG_HARD_KEY_CODE,
            CarLifeMessages.hardKeyCode(code))
    }

    companion object { const val TAG = "CarLifeSession" }
}
