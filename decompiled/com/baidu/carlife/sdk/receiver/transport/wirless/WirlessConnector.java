package com.baidu.carlife.sdk.receiver.transport.wirless;

import com.baidu.carlife.sdk.internal.protocol.CarLifeMessage;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import com.baidu.carlife.sdk.internal.transport.communicator.Communicator;
import com.baidu.carlife.sdk.internal.transport.communicator.SocketCommunicator;
import i9.l;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import t8.j;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u0003J\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/baidu/carlife/sdk/receiver/transport/wirless/WirlessConnector;", "Lcom/baidu/carlife/sdk/internal/transport/communicator/Communicator;", "<init>", "()V", "", "host", "", "startConnect", "(Ljava/lang/String;)Z", "Lt8/z;", "terminate", "Lcom/baidu/carlife/sdk/internal/protocol/CarLifeMessage;", "message", "write", "(Lcom/baidu/carlife/sdk/internal/protocol/CarLifeMessage;)V", "read", "()Lcom/baidu/carlife/sdk/internal/protocol/CarLifeMessage;", "", "", "communicators", "Ljava/util/Map;", "Ljava/util/concurrent/BlockingQueue;", "messageQueue", "Ljava/util/concurrent/BlockingQueue;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isTerminated", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Companion", "carlife-sdk_release"}, k = 1, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
public final class WirlessConnector implements Communicator {
    private static final int SERVER_CMD_SOCKET_PORT = 7240;
    private static final int SERVER_VIDEO_SOCKET_PORT = 8240;
    private static final int SERVER_AUDIO_SOCKET_PORT = 9240;
    private static final int SERVER_AUDIO_TTS_SOCKET_PORT = 9241;
    private static final int SERVER_AUDIO_VR_SOCKET_PORT = 9242;
    private static final int SERVER_TOUCH_SOCKET_PORT = 9340;
    private static final int SERVER_UPDATE_SOCKET_PORT = 9440;
    private static final j[] SUPPORT_CHANNELS = {new j(1, Integer.valueOf(SERVER_CMD_SOCKET_PORT)), new j(2, Integer.valueOf(SERVER_VIDEO_SOCKET_PORT)), new j(3, Integer.valueOf(SERVER_AUDIO_SOCKET_PORT)), new j(4, Integer.valueOf(SERVER_AUDIO_TTS_SOCKET_PORT)), new j(5, Integer.valueOf(SERVER_AUDIO_VR_SOCKET_PORT)), new j(6, Integer.valueOf(SERVER_TOUCH_SOCKET_PORT)), new j(7, Integer.valueOf(SERVER_UPDATE_SOCKET_PORT))};
    private final Map<Integer, Communicator> communicators = new LinkedHashMap();
    private final BlockingQueue<CarLifeMessage> messageQueue = new LinkedBlockingQueue();
    private volatile AtomicBoolean isTerminated = new AtomicBoolean(false);

    @Override // com.baidu.carlife.sdk.internal.transport.communicator.Communicator
    public CarLifeMessage read() throws InterruptedException, IOException {
        if (this.isTerminated.get()) {
            throw new IOException("sockets closed");
        }
        CarLifeMessage carLifeMessageTake = this.messageQueue.take();
        if (l.a(carLifeMessageTake, CarLifeMessage.INSTANCE.getNULL())) {
            throw new IOException("socket closed");
        }
        l.d(carLifeMessageTake, "message");
        return carLifeMessageTake;
    }

    public final boolean startConnect(String host) {
        l.e(host, "host");
        this.isTerminated.set(false);
        this.messageQueue.clear();
        for (j jVar : SUPPORT_CHANNELS) {
            this.communicators.put((Integer) jVar.f12830a, new SocketCommunicator(((Number) jVar.f12830a).intValue(), host, ((Number) jVar.f12831b).intValue(), null, this.messageQueue, 8, null));
        }
        return true;
    }

    @Override // com.baidu.carlife.sdk.internal.transport.communicator.Communicator
    public void terminate() {
        if (this.isTerminated.getAndSet(true)) {
            return;
        }
        Iterator<Map.Entry<Integer, Communicator>> it = this.communicators.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().terminate();
        }
        this.messageQueue.clear();
        this.communicators.clear();
    }

    @Override // com.baidu.carlife.sdk.internal.transport.communicator.Communicator
    public void write(CarLifeMessage message) throws IOException {
        l.e(message, "message");
        if (this.isTerminated.get()) {
            throw new IOException("sockets closed");
        }
        Communicator communicator = this.communicators.get(Integer.valueOf(message.getChannel()));
        if (communicator != null) {
            communicator.write(message);
        }
    }
}
