package net.easyconn.gwmec.carlife

/** CarLife protobuf 消息构造与解析（字段号对照百度 com.baidu.carlife.protobuf.*）。 */
object CarLifeMessages {
    fun protocolVersion(major: Int, minor: Int): ByteArray =
        Pb.int32(1, major) + Pb.int32(2, minor)

    /** 车机统计信息（原生车机公开测试渠道号，来自 VehicleApplication 反编译）。 */
    fun statisticsInfo(): ByteArray =
        Pb.str(1, "12345678") +
            Pb.str(2, "4.0.0") +
            Pb.int32(3, 16) +
            Pb.str(4, "20029999") +
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

    fun videoEncoderInfo(w: Int, h: Int, fps: Int): ByteArray =
        Pb.int32(1, w) + Pb.int32(2, h) + Pb.int32(3, fps)

    /** 特征配置：CONNECT_TYPE 决定手机端走 WiFi 还是 AOA 路径。 */
    fun featureConfigList(connectType: Int): ByteArray {
        val item1 = Pb.str(1, "I_FRAME_INTERVAL") + Pb.int32(2, 300)
        val item2 = Pb.str(1, "CONNECT_TYPE") + Pb.int32(2, connectType)
        return Pb.int32(1, 2) +
            Pb.msg(2, item1) +
            Pb.msg(2, item2) +
            Pb.bool(3, false) +
            Pb.str(4, "CarLink") +
            Pb.str(5, "00:11:22:33:44:55")
    }

    fun touchAction(action: Int, x: Int, y: Int, px: Int = 0, py: Int = 0): ByteArray =
        Pb.int32(1, action) + Pb.int32(2, x) + Pb.int32(3, y) + Pb.int32(4, px) + Pb.int32(5, py)

    fun hardKeyCode(code: Int): ByteArray = Pb.int32(1, code)

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
