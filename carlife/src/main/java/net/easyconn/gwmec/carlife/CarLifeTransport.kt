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
    /** 通道是否仍然可用；中心层据此判断该复用还是重建会话。 */
    fun isAlive(): Boolean

    /**
     * 传输层链路意外死亡回调（读失败且重连耗尽、通道断开等）。
     * 会话层收到后走自己的 stop() 流程，把状态带回 IDLE——
     * 否则界面永远停在「已连接」、画面冻结在最后一帧（审计 P1-1）。
     */
    var onLinkLost: (() -> Unit)?

    /**
     * 链路层面重新握手：版本协商超时说明手机这次没有在听，而读线程并没有报错，
     * 原来只有「读失败」才会重连，超时这条路径直接放弃——于是表现成偶尔能通、
     * 多数不通。原版靠手机端 CarLife 重新探测来恢复，这里改成自己再试一轮。
     */
    fun retryHandshake()
}
