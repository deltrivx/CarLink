package net.easyconn.gwmec.carlife

/**
 * CarLife 协议常量与报文帧。
 *
 * 协议依据：百度 CarLife 车机手机互联接入指南 V2.1.1；帧结构与消息 ID 对照
 * carlife_pc_tool（从百度 carlife-vehicle SDK 逆向）。
 * 帧全部大端序：通道 1/6 头 8 字节 [u16 len][u16 reserved][u32 serviceType]，
 * 其余通道头 12 字节 [u32 len][u32 seqOrTs][u32 serviceType]。
 */
object CarLifeProtocol {
    // 原版 ServiceTypes 对齐
    const val MSG_MEDIA_INIT = 196609
    const val MSG_MEDIA_STOP = 196610
    const val MSG_MEDIA_PAUSE = 196611
    const val MSG_MEDIA_RESUME_PLAY = 196612
    const val MSG_MEDIA_DATA = 196614
    const val MSG_MEDIA_DATA_ENCODER = 196615
    const val MSG_NAV_TTS_INIT = 262145
    const val MSG_NAV_TTS_END = 262146
    const val MSG_NAV_TTS_DATA = 262147

    // ---- 通道与端口（WiFi 模式下每通道一条 TCP 连接，端口在手机侧）----
    const val CHANNEL_CMD = 1
    const val CHANNEL_VIDEO = 2
    const val CHANNEL_AUDIO = 3
    const val CHANNEL_TTS = 4
    const val CHANNEL_VR = 5
    const val CHANNEL_TOUCH = 6
    const val CHANNEL_DATA = 7

    val ALL_CHANNELS = listOf(
        CHANNEL_CMD to 7240,
        CHANNEL_VIDEO to 8240,
        CHANNEL_AUDIO to 9240,
        CHANNEL_TTS to 9241,
        CHANNEL_VR to 9242,
        CHANNEL_TOUCH to 9340,
        CHANNEL_DATA to 9440,
    )

    const val UDP_DISCOVERY_PORT = 7999

    // ---- 连接类型（FeatureConfig CONNECT_TYPE）----
    const val CONNECT_TYPE_ADB = 1
    const val CONNECT_TYPE_AOA = 2
    const val CONNECT_TYPE_NCM_ANDROID = 3
    const val CONNECT_TYPE_NCM_IOS = 4
    const val CONNECT_TYPE_WIFI = 5

    // ---- 控制通道消息 ID ----
    const val MSG_HU_PROTOCOL_VERSION = 98305          // 0x18001 车端版本协商
    const val MSG_MD_PROTOCOL_VERSION_MATCH = 65538    // 0x10002 手机匹配结果
    const val MSG_HU_INFO = 98307                      // 0x18003 车端设备信息
    const val MSG_MD_INFO = 65540                      // 0x10004 手机设备信息
    const val MSG_HU_STATISTIC_INFO = 98343            // 0x18027 车端统计
    const val MSG_HU_MODULE_CONTROL = 98344            // 0x18028 车端模块控制
    const val MSG_MD_AUTHEN_RESULT = 65611             // 0x1004B 手机鉴权结果
    const val MSG_HU_AUTHEN_RESULT = 98380             // 0x1804C 车端鉴权确认
    const val MSG_MD_FEATURE_CONFIG_REQUEST = 65617    // 0x10051 手机特征请求
    const val MSG_HU_FEATURE_CONFIG_RESPONSE = 98386   // 0x18052 车端特征回复
    const val MSG_HU_VIDEO_ENCODER_INIT = 98311        // 0x18007 车端视频参数
    const val MSG_MD_VIDEO_ENCODER_INIT = 65544        // 0x10008 手机视频参数
    const val MSG_MD_VIDEO_ENCODER_DONE = 65551        // 0x1000F 手机编码器就绪
    const val MSG_HU_VIDEO_ENCODER_START = 98313       // 0x18009 车端请求推流
    const val MSG_HU_VIDEO_ENCODER_PAUSE = 98314       // 0x1800A 车端暂停推流
    const val MSG_VIDEO_HEARTBEAT = 131074             // 0x20002 心跳
    const val MSG_MD_GO_TO_DESKTOP = 65569             // 0x10021 手机请求回桌面
    const val MSG_MD_MODULE_STATUS = 65574             // 0x10026 手机模块状态

    // ---- 音频通道消息 ID ----
    const val MSG_HU_MUSIC_INIT = 98315                // 0x1800B 车端媒体音频初始化确认
    const val MSG_MD_MUSIC_INIT = 65548                // 0x1000C 手机端媒体音频参数
    const val MSG_HU_TTS_INIT = 98316                  // 0x1800C 车端 TTS 初始化确认
    const val MSG_MD_TTS_INIT = 65549                  // 0x1000D 手机端 TTS 音频参数
    const val MSG_HU_BT_AUDIO_INFO = 98317             // 0x1800D 车端蓝牙音频信息
    const val MSG_MD_BT_AUDIO_INFO = 65550             // 0x1000E 手机端蓝牙音频信息

    // ---- 蓝牙 HFP 消息 ID ----
    const val MSG_HU_BT_HFP_REQUEST = 98387            // 0x18053 车端 HFP 请求
    const val MSG_MD_BT_HFP_INDICATION = 65618         // 0x10052 手机端 HFP 指示
    const val MSG_MD_BT_HFP_RESPONSE = 65619           // 0x10053 手机端 HFP 响应
    const val MSG_MD_BT_HFP_STATUS_REQUEST = 65620     // 0x10054 手机端 HFP 状态请求
    const val MSG_HU_BT_HFP_STATUS_RESPONSE = 98389    // 0x18055 车端 HFP 状态响应
    const val MSG_MD_BT_HFP_CONNECTION = 65621         // 0x10055 手机端 HFP 连接状态
    const val MSG_MD_BT_HFP_CALL_STATUS = 65622        // 0x10056 手机端通话状态

    // ---- 导航信息消息 ID ----
    const val MSG_MD_NAVI_NEXT_TURN = 65600            // 0x10040 导航下一转向
    const val MSG_MD_NAVI_ASSISTANT_GUIDE = 65601      // 0x10041 导航辅助引导

    // ---- 媒体信息消息 ID ----
    const val MSG_MD_MEDIA_INFO = 65584                // 0x10030 当前媒体信息
    const val MSG_MD_MEDIA_PROGRESS = 65585            // 0x10031 媒体播放进度

    // ---- 车辆信息消息 ID ----
    const val MSG_HU_VEHICLE_INFO = 98336              // 0x18020 车端车辆信息
    const val MSG_MD_VEHICLE_INFO = 65568              // 0x10020 手机端车辆信息

    // ---- 触控动作（CarlifeTouchAction.action，对照手机端 RemoteDisplayGLView）----
    const val TOUCH_DOWN = 0
    const val TOUCH_UP = 1
    const val TOUCH_MOVE = 2
    const val MSG_TOUCH_ACTION = 425985             // 0x68001 触控通道数据消息
    const val MSG_HARD_KEY_CODE = 425992            // 0x68008 车机物理按键

    fun headerSize(channel: Int): Int =
        if (channel == CHANNEL_CMD || channel == CHANNEL_TOUCH) 8 else 12

    /** 打包一帧 CarLife 报文。seqOrTs 仅 12 字节头通道使用。 */
    fun pack(channel: Int, serviceType: Int, payload: ByteArray = ByteArray(0), seqOrTs: Int = 0): ByteArray {
        val header = if (headerSize(channel) == 8) {
            byteArrayOf(
                (payload.size ushr 8).toByte(), payload.size.toByte(),
                0, 0,
                (serviceType ushr 24).toByte(), (serviceType ushr 16).toByte(),
                (serviceType ushr 8).toByte(), serviceType.toByte(),
            )
        } else {
            byteArrayOf(
                (payload.size ushr 24).toByte(), (payload.size ushr 16).toByte(),
                (payload.size ushr 8).toByte(), payload.size.toByte(),
                (seqOrTs ushr 24).toByte(), (seqOrTs ushr 16).toByte(),
                (seqOrTs ushr 8).toByte(), seqOrTs.toByte(),
                (serviceType ushr 24).toByte(), (serviceType ushr 16).toByte(),
                (serviceType ushr 8).toByte(), serviceType.toByte(),
            )
        }
        return header + payload
    }

    /** 帧头解析结果：payloadLen / seqOrTs / serviceType */
    fun parseHeader(channel: Int, header: ByteArray, off: Int = 0): Triple<Int, Int, Int> {
        fun u32(o: Int) = ((header[o].toInt() and 0xFF) shl 24) or
            ((header[o + 1].toInt() and 0xFF) shl 16) or
            ((header[o + 2].toInt() and 0xFF) shl 8) or
            (header[o + 3].toInt() and 0xFF)
        return if (headerSize(channel) == 8) {
            val len = ((header[off].toInt() and 0xFF) shl 8) or (header[off + 1].toInt() and 0xFF)
            Triple(len, 0, u32(off + 4))
        } else {
            Triple(u32(off), u32(off + 4), u32(off + 8))
        }
    }
}

/**
 * 极简 protobuf wire-format 编解码（proto2 语义，字段号与百度
 * com.baidu.carlife.protobuf.* 一致）。只覆盖 CarLife 用到的标量与嵌套消息。
 */
object Pb {
    fun varint(value: Long): ByteArray {
        var v = value
        val out = ArrayList<Byte>(10)
        while (true) {
            if (v and 0x7FL.inv() == 0L) { out.add(v.toByte()); break }
            out.add(((v and 0x7F) or 0x80).toByte())
            v = v ushr 7
        }
        return out.toByteArray()
    }

    fun tag(field: Int, wireType: Int) = varint((field.toLong() shl 3) or wireType.toLong())

    fun str(field: Int, value: String) = tag(field, 2) + varint(value.toByteArray().size.toLong()) + value.toByteArray()
    fun int32(field: Int, value: Int) = tag(field, 0) + varint(value.toLong())
    fun bool(field: Int, value: Boolean) = tag(field, 0) + varint(if (value) 1L else 0L)
    fun msg(field: Int, body: ByteArray) = tag(field, 2) + varint(body.size.toLong()) + body

    /** 顺序读取一段 payload 的字段，回调 (fieldNumber, wireType, valueBytesOrVarint)。 */
    fun forEachField(payload: ByteArray, block: (field: Int, wireType: Int, value: ByteArray) -> Unit) {
        var i = 0
        while (i < payload.size) {
            var shift = 0; var tag = 0L
            while (true) {
                val b = payload[i++].toInt() and 0xFF
                tag = tag or ((b and 0x7F).toLong() shl shift)
                if (b and 0x80 == 0) break
                shift += 7
            }
            val field = (tag ushr 3).toInt()
            val wireType = (tag and 0x7).toInt()
            when (wireType) {
                0 -> { // varint
                    var shift2 = 0; var v = 0L
                    while (true) {
                        val b = payload[i++].toInt() and 0xFF
                        v = v or ((b and 0x7F).toLong() shl shift2)
                        if (b and 0x80 == 0) break
                        shift2 += 7
                    }
                    // 把 varint 原样放回最小编码，交由调用方按需解码
                    block(field, 0, Pb.varint(v))
                }
                1 -> { val v = payload.copyOfRange(i, i + 8); i += 8; block(field, 1, v) }
                2 -> { // length-delimited
                    var shift2 = 0; var len = 0L
                    while (true) {
                        val b = payload[i++].toInt() and 0xFF
                        len = len or ((b and 0x7F).toLong() shl shift2)
                        if (b and 0x80 == 0) break
                        shift2 += 7
                    }
                    block(field, 2, payload.copyOfRange(i, i + len.toInt()))
                    i += len.toInt()
                }
                5 -> { val v = payload.copyOfRange(i, i + 4); i += 4; block(field, 5, v) }
                else -> return // 未知 wire type，放弃本条消息
            }
        }
    }

    fun asVarint(bytes: ByteArray): Long {
        var shift = 0; var v = 0L
        for (b in bytes) { v = v or ((b.toLong() and 0x7F) shl shift); shift += 7 }
        return v
    }

    fun asString(bytes: ByteArray) = String(bytes, Charsets.UTF_8)
}
