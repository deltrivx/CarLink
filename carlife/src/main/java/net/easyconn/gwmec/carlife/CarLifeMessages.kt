package net.easyconn.gwmec.carlife

/** CarLife protobuf 消息构造与解析（字段号对照百度 com.baidu.carlife.protobuf.*）。 */
object CarLifeMessages {
    /**
     * 对齐原版 ConnectionEstablishHandler.onConnectionAttached：
     * majorVersion = 4, minorVersion = 1
     */
    fun protocolVersion(major: Int = 4, minor: Int = 1): ByteArray =
        Pb.int32(1, major) + Pb.int32(2, minor)

    /** 车机统计信息（原生车机公开测试渠道号，来自 VehicleApplication 反编译）。 */
    /**
     * 对齐原版 MainApplication.onCreate 中的 CarLife.init 参数：
     * channel = "20352101", cuid = "12345678"
     */
    fun statisticsInfo(): ByteArray =
        Pb.str(1, "12345678") +
            Pb.str(2, "4.0.0") +
            Pb.int32(3, 16) +
            Pb.str(4, "20352101") +
            Pb.int32(5, 0) +
            Pb.int32(6, 0) +
            Pb.int32(7, 0) +
            Pb.str(8, "")

    /** 车机设备信息：必须伪装为原生 Android 车机平台，字段号 1-23。 */
    fun huDeviceInfo(w: Int, h: Int): ByteArray =
        Pb.str(1, "Android") +
            Pb.str(2, "universal") +
            Pb.str(3, "unknown") +
            Pb.str(4, "baidu") +
            Pb.str(5, "arm64-v8a") +
            Pb.str(6, "armeabi-v7a") +
            Pb.str(7, "carlife") +
            Pb.str(8, "${w}x${h}") +
            Pb.str(9, "baidu/carlife/carlife:11/RQ3A.211001.001/1:user/release-keys") +
            Pb.str(10, "universal") +
            Pb.str(11, "carlife-build") +
            Pb.str(12, "RQ3A.211001.001") +
            Pb.str(13, "baidu") +
            Pb.str(14, "CarLifeVehicle") +
            Pb.str(15, "carlife") +
            Pb.str(16, "unknown") +
            Pb.str(17, "REL") +
            Pb.str(18, "1") +
            Pb.str(19, "11") +
            Pb.str(20, "30") +
            Pb.int32(21, 30) +
            Pb.str(22, "4.0.0")

    /**
     * 原版 ConnectManager.sendConnectTypeToMd(CARLIFE_CONNECT_MODULE_ID, CONNECTED_TYPE)：
     * CarlifeModuleStatus { moduleID = 1, statusID = 2 }，serviceType = MSG_CMD_MODULE_CONTROL。
     *
     * 版本匹配成功后原版必发这条，把连接方式告诉手机。手机据此决定启用哪些通道；
     * 缺了它，手机不会发 MSG_MD_MUSIC_INIT，音频就一直留在手机上。
     */
    fun connectTypeToMd(connectType: Int): ByteArray =
        Pb.int32(1, MODULE_ID_CARLIFE_CONNECT) + Pb.int32(2, connectType)

    /**
     * 原版 ConnectionEstablishHandler.sendAuthRequest():
     * CarlifeAuthenRequest { randomValue = "2.0;" + HH:mm:ss }，serviceType = MSG_CMD_HU_AUTH_REQUEST(0x18048)。
     * 收到手机 MD_INFO 后必须发这条，否则手机不会进入鉴权流程：
     * 不发 → 收不到 MSG_CMD_MD_AUTH_RESULT(0x1004B) → 握手卡在版本协商之后。
     */
    fun authenRequest(randomValue: String): ByteArray = Pb.str(1, randomValue)

    /** 原版 handleAuthResult：回 MSG_CMD_MD_AUTH_RESULT_RESPONSE(0x1804C)，空负载。 */
    fun authenResultResponse(): ByteArray = ByteArray(0)

    /** 原版 randomValue 格式："2.0;HH:mm:ss"（TIME_FORMAT_FOR_HMS）。 */
    fun authenRandomValue(now: java.util.Date = java.util.Date()): String {
        val f = java.text.SimpleDateFormat("HH:mm:ss", java.util.Locale.US)
        return "2.0;" + f.format(now)
    }

    /** 原版 ModuleStatusModel.CARLIFE_CONNECT_MODULE_ID。 */
    private const val MODULE_ID_CARLIFE_CONNECT = 5

    fun videoEncoderInfo(w: Int, h: Int, fps: Int): ByteArray =
        Pb.int32(1, w) + Pb.int32(2, h) + Pb.int32(3, fps)

    /**
     * 特征配置：对齐原版 FeatureConfigManager.customFeature() 的完整 key 列表。
     *
     * 少了 VOICE_MIC / MEDIA_SAMPLE_RATE / AUDIO_TRANSMISSION_MODE 这些项，手机端
     * 就不知道车机要音频，只推视频——之前"声音还在手机上"就是这个原因。
     */
    fun featureConfigList(connectType: Int): ByteArray {
        // 原版 CarlifeConfUtil 的默认值
        val items = listOf(
            "VOICE_WAKEUP" to 1,               // true
            "BLUETOOTH_AUTO_PAIR" to 0,        // false
            "BLUETOOTH_INTERNAL_UI" to 0,      // false
            "FOCUS_UI" to 0,                   // false
            "VOICE_MIC" to 0,                  // 0 = 用车机麦克风
            "MEDIA_SAMPLE_RATE" to 0,          // 0 = 原始采样率
            "AUDIO_TRANSMISSION_MODE" to 0,    // 0 = 默认传输模式
            "CONTENT_ENCRYPTION" to 0,         // false
            "ENGINE_TYPE" to 0,
            "INPUT_DISABLE" to 0,
            "I_FRAME_INTERVAL" to 300,
            "CONNECT_TYPE" to connectType,
        )

        val body = ArrayList<ByteArray>()
        items.forEach { (key, value) ->
            body.add(Pb.msg(2, Pb.str(1, key) + Pb.int32(2, value)))
        }
        if (connectType == CarLifeProtocol.CONNECT_TYPE_AOA) {
            body.add(Pb.msg(2, Pb.str(1, "USB_MTU") + Pb.int32(2, 16384)))
        }

        return Pb.int32(1, body.size) +
            body.reduce { a, b -> a + b } +
            Pb.bool(3, false) +
            Pb.str(4, "CarLink") +
            Pb.str(5, "00:11:22:33:44:55")
    }

    fun touchAction(action: Int, x: Int, y: Int, px: Int = 0, py: Int = 0): ByteArray =
        Pb.int32(1, action) + Pb.int32(2, x) + Pb.int32(3, y) + Pb.int32(4, px) + Pb.int32(5, py)

    fun hardKeyCode(code: Int): ByteArray = Pb.int32(1, code)

    /** 蓝牙音频信息：车端告知手机端是否支持蓝牙音频及蓝牙地址。 */
    fun btAudioInfo(support: Boolean, btName: String = "", btMac: String = ""): ByteArray =
        Pb.bool(1, support) + Pb.str(2, btName) + Pb.str(3, btMac)

    /** 蓝牙 HFP 请求：车端向手机端发送 HFP 指令（接听/挂断/拨号等）。 */
    fun btHfpRequest(command: Int, phoneNum: String = "", dtmfCode: Int = 0): ByteArray =
        Pb.int32(1, command) + Pb.str(2, phoneNum) + Pb.int32(3, dtmfCode)

    /** 蓝牙 HFP 状态响应：车端回复手机端的状态查询。 */
    fun btHfpStatusResponse(status: Int): ByteArray = Pb.int32(1, status)

    /** 车辆信息上报：车端向手机端声明支持的车辆模块。 */
    fun vehicleInfo(moduleId: Int, supportFlag: Int, frequency: Int = 0): ByteArray =
        Pb.int32(1, moduleId) + Pb.int32(2, supportFlag) + Pb.int32(3, frequency)

    data class EncoderInfo(val width: Int, val height: Int, val frameRate: Int)

    fun parseEncoderInfo(payload: ByteArray): EncoderInfo {
        var w = 0; var h = 0; var fps = 0
        Pb.forEachField(payload) { field, wt, v ->
            if (wt == 0) when (field) {
                1 -> w = Pb.asVarint(v).toInt()
                2 -> h = Pb.asVarint(v).toInt()
                3 -> fps = Pb.asVarint(v).toInt()
            }
        }
        return EncoderInfo(w, h, fps)
    }

    data class NaviNextTurnInfo(
        val action: Int,
        val nextTurn: String,
        val roadName: String,
        val totalDistance: Int,
        val remainDistance: Int,
        val turnIconData: ByteArray?
    )

    fun parseNaviNextTurn(payload: ByteArray): NaviNextTurnInfo {
        var action = 0; var nextTurn = ""; var roadName = ""
        var totalDist = 0; var remainDist = 0; var iconData: ByteArray? = null
        Pb.forEachField(payload) { field, wt, v ->
            when {
                wt == 0 -> when (field) {
                    1 -> action = Pb.asVarint(v).toInt()
                    4 -> totalDist = Pb.asVarint(v).toInt()
                    5 -> remainDist = Pb.asVarint(v).toInt()
                }
                wt == 2 -> when (field) {
                    2 -> nextTurn = Pb.asString(v)
                    3 -> roadName = Pb.asString(v)
                    6 -> iconData = v
                }
            }
        }
        return NaviNextTurnInfo(action, nextTurn, roadName, totalDist, remainDist, iconData)
    }

    data class MediaInfoData(
        val source: String,
        val song: String,
        val artist: String,
        val album: String,
        val albumArt: ByteArray?,
        val duration: Int
    )

    fun parseMediaInfo(payload: ByteArray): MediaInfoData {
        var source = ""; var song = ""; var artist = ""; var album = ""
        var art: ByteArray? = null; var duration = 0
        Pb.forEachField(payload) { field, wt, v ->
            when {
                wt == 2 -> when (field) {
                    1 -> source = Pb.asString(v)
                    2 -> song = Pb.asString(v)
                    3 -> artist = Pb.asString(v)
                    4 -> album = Pb.asString(v)
                    5 -> art = v
                }
                wt == 0 -> when (field) {
                    6 -> duration = Pb.asVarint(v).toInt()
                }
            }
        }
        return MediaInfoData(source, song, artist, album, art, duration)
    }

    fun parseBtHfpIndication(payload: ByteArray): Pair<Int, String> {
        var command = 0; var phoneNum = ""
        Pb.forEachField(payload) { field, wt, v ->
            when {
                wt == 0 && field == 1 -> command = Pb.asVarint(v).toInt()
                wt == 2 && field == 2 -> phoneNum = Pb.asString(v)
            }
        }
        return command to phoneNum
    }

    /** 从 CarlifeDeviceInfo 里摘 brand / model / release 做一行摘要。 */
    fun describePhone(payload: ByteArray): String {
        var brand = "?"; var model = "?"; var release = "?"
        Pb.forEachField(payload) { field, wt, v ->
            if (wt == 2) when (field) {
                4 -> brand = Pb.asString(v)
                14 -> model = Pb.asString(v)
                19 -> release = Pb.asString(v)
            }
        }
        return "$brand $model (Android $release)"
    }
}
