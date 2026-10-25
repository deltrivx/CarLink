package net.easyconn.gwmec.carlife

/**
 * CarLife 传输抽象：一条「已连接的通道帧管道」。
 * WiFi 实现为 7 条 TCP；USB 实现为 AOA 单 bulk 管道多路复用。
 * 会话层只看到 (channel, serviceType, payload) 的收与发。
 */
interface CarLifeTransport {
    /** 建立传输；成功后回调 onMessage 分发每条收到的消息。 */
    fun start(onMessage: (channel: Int, serviceType: Int, payload: ByteArray) -> Unit): Boolean
    /** 按通道帧发送一条消息。seqOrTs 仅 12 字节头通道有意义。 */
    fun send(channel: Int, serviceType: Int, payload: ByteArray, seqOrTs: Int = 0): Boolean
    fun stop()
}
