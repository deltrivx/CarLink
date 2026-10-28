package com.baidu.carlife.sdk.internal.transport.communicator;

import com.baidu.carlife.sdk.Constants;
import com.baidu.carlife.sdk.internal.protocol.CarLifeMessage;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import com.baidu.carlife.sdk.util.IOUtilsKt;
import com.baidu.carlife.sdk.util.Logger;
import i9.g;
import i9.l;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000 -2\u00020\u0001:\u0002-.B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fB?\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001bR\u001c\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u001a\u0010$\u001a\u00020#8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010)\u001a\u00020(8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u0006/"}, d2 = {"Lcom/baidu/carlife/sdk/internal/transport/communicator/SocketCommunicator;", "Lcom/baidu/carlife/sdk/internal/transport/communicator/Communicator;", "", "channel", "Ljava/net/Socket;", "socket", "Lcom/baidu/carlife/sdk/internal/transport/communicator/Communicator$Callbacks;", "callbacks", "Ljava/util/concurrent/BlockingQueue;", "Lcom/baidu/carlife/sdk/internal/protocol/CarLifeMessage;", "messageQueue", "<init>", "(ILjava/net/Socket;Lcom/baidu/carlife/sdk/internal/transport/communicator/Communicator$Callbacks;Ljava/util/concurrent/BlockingQueue;)V", "", "host", "port", "(ILjava/lang/String;ILcom/baidu/carlife/sdk/internal/transport/communicator/Communicator$Callbacks;Ljava/util/concurrent/BlockingQueue;)V", "message", "Lt8/z;", "write", "(Lcom/baidu/carlife/sdk/internal/protocol/CarLifeMessage;)V", "read", "()Lcom/baidu/carlife/sdk/internal/protocol/CarLifeMessage;", "terminate", "()V", "I", "Ljava/net/Socket;", "Lcom/baidu/carlife/sdk/internal/transport/communicator/Communicator$Callbacks;", "Ljava/util/concurrent/BlockingQueue;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isTerminated", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Lcom/baidu/carlife/sdk/internal/transport/communicator/SocketCommunicator$Reader;", "reader", "Lcom/baidu/carlife/sdk/internal/transport/communicator/SocketCommunicator$Reader;", "Ljava/io/InputStream;", "input", "Ljava/io/InputStream;", "getInput", "()Ljava/io/InputStream;", "Ljava/io/OutputStream;", "output", "Ljava/io/OutputStream;", "getOutput", "()Ljava/io/OutputStream;", "Companion", "Reader", "carlife-sdk_release"}, k = 1, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
public class SocketCommunicator implements Communicator {
    public static final int MAX_PACKET_SIZE = 10240;
    private final Communicator.Callbacks callbacks;
    private final int channel;
    private final InputStream input;
    private AtomicBoolean isTerminated;
    private final BlockingQueue<CarLifeMessage> messageQueue;
    private final OutputStream output;
    private Reader reader;
    private final Socket socket;

    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000fR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/baidu/carlife/sdk/internal/transport/communicator/SocketCommunicator$Reader;", "Ljava/lang/Thread;", "", "channel", "Ljava/util/concurrent/BlockingQueue;", "Lcom/baidu/carlife/sdk/internal/protocol/CarLifeMessage;", "messageQueue", "Lcom/baidu/carlife/sdk/internal/transport/communicator/Communicator;", "communicator", "<init>", "(ILjava/util/concurrent/BlockingQueue;Lcom/baidu/carlife/sdk/internal/transport/communicator/Communicator;)V", "Lt8/z;", "run", "()V", "I", "Ljava/util/concurrent/BlockingQueue;", "Lcom/baidu/carlife/sdk/internal/transport/communicator/Communicator;", "carlife-sdk_release"}, k = 1, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
    public static final class Reader extends Thread {
        private final int channel;
        private final Communicator communicator;
        private final BlockingQueue<CarLifeMessage> messageQueue;

        public Reader(int i7, BlockingQueue<CarLifeMessage> blockingQueue, Communicator communicator) {
            l.e(blockingQueue, "messageQueue");
            l.e(communicator, "communicator");
            this.channel = i7;
            this.messageQueue = blockingQueue;
            this.communicator = communicator;
            setName("SocketReader_" + i7);
            start();
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (!isInterrupted()) {
                try {
                    if (!this.messageQueue.offer(this.communicator.read(), 2000L, TimeUnit.MILLISECONDS)) {
                        Logger.INSTANCE.w(Constants.TAG, "SocketReader_" + this.channel + " 队列写入超时，丢弃消息");
                    }
                } catch (Exception unused) {
                    if (!Thread.currentThread().isInterrupted()) {
                        this.messageQueue.clear();
                        this.messageQueue.offer(CarLifeMessage.INSTANCE.getNULL());
                    }
                    Logger.INSTANCE.d(Constants.TAG, "SocketReader_" + this.channel + " 线程退出");
                    return;
                }
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SocketCommunicator(int i7, String str, int i10, Communicator.Callbacks callbacks, BlockingQueue<CarLifeMessage> blockingQueue) {
        this(i7, new Socket(str, i10), callbacks, blockingQueue);
        l.e(str, "host");
    }

    public /* synthetic */ SocketCommunicator(int i7, String str, int i10, Communicator.Callbacks callbacks, BlockingQueue blockingQueue, int i11, g gVar) {
        this(i7, str, i10, (i11 & 8) != 0 ? null : callbacks, (i11 & 16) != 0 ? null : blockingQueue);
    }

    public SocketCommunicator(int i7, Socket socket, Communicator.Callbacks callbacks, BlockingQueue<CarLifeMessage> blockingQueue) throws IOException {
        l.e(socket, "socket");
        this.channel = i7;
        this.socket = socket;
        this.callbacks = callbacks;
        this.messageQueue = blockingQueue;
        this.isTerminated = new AtomicBoolean(false);
        InputStream inputStream = socket.getInputStream();
        l.d(inputStream, "socket.getInputStream()");
        this.input = inputStream;
        OutputStream outputStream = socket.getOutputStream();
        l.d(outputStream, "socket.getOutputStream()");
        this.output = outputStream;
        if (blockingQueue != null) {
            this.reader = new Reader(i7, blockingQueue, this);
        }
    }

    public /* synthetic */ SocketCommunicator(int i7, Socket socket, Communicator.Callbacks callbacks, BlockingQueue blockingQueue, int i10, g gVar) {
        this(i7, socket, (i10 & 4) != 0 ? null : callbacks, (i10 & 8) != 0 ? null : blockingQueue);
    }

    public final InputStream getInput() {
        return this.input;
    }

    public final OutputStream getOutput() {
        return this.output;
    }

    @Override // com.baidu.carlife.sdk.internal.transport.communicator.Communicator
    public CarLifeMessage read() throws Exception {
        if (this.isTerminated.get()) {
            throw new IOException("socket has been closed");
        }
        CarLifeMessage carLifeMessageObtain$default = CarLifeMessage.Companion.obtain$default(CarLifeMessage.INSTANCE, this.channel, null, 0, 6, null);
        try {
            IOUtilsKt.blockRead(this.input, carLifeMessageObtain$default.getBody(), 0, carLifeMessageObtain$default.getCommandSize());
            carLifeMessageObtain$default.resizeBuffer(carLifeMessageObtain$default.getSize());
            IOUtilsKt.blockRead(this.input, carLifeMessageObtain$default.getBody(), carLifeMessageObtain$default.getCommandSize(), carLifeMessageObtain$default.getPayloadSize());
            return carLifeMessageObtain$default;
        } catch (Exception e7) {
            carLifeMessageObtain$default.recycle();
            throw e7;
        }
    }

    @Override // com.baidu.carlife.sdk.internal.transport.communicator.Communicator
    public void terminate() throws InterruptedException {
        if (this.isTerminated.getAndSet(true)) {
            return;
        }
        try {
            this.socket.shutdownInput();
            this.socket.shutdownOutput();
            this.socket.close();
        } catch (Exception e7) {
            Logger.INSTANCE.d(Constants.TAG, "Communicator ", Integer.valueOf(this.channel), " terminate exception: ", e7);
        }
        BlockingQueue<CarLifeMessage> blockingQueue = this.messageQueue;
        if (blockingQueue != null) {
            blockingQueue.put(CarLifeMessage.INSTANCE.getNULL());
        }
        Reader reader = this.reader;
        if (reader != null) {
            reader.interrupt();
        }
        Communicator.Callbacks callbacks = this.callbacks;
        if (callbacks != null) {
            callbacks.onTerminated(this.channel);
        }
        Logger.INSTANCE.d(Constants.TAG, "Communicator ", Integer.valueOf(this.channel), " terminated ", this);
    }

    @Override // com.baidu.carlife.sdk.internal.transport.communicator.Communicator
    public void write(CarLifeMessage message) throws Exception {
        l.e(message, "message");
        if (this.isTerminated.get()) {
            throw new IOException("socket has been closed");
        }
        try {
            int size = message.getSize();
            int i7 = size;
            while (i7 > 0) {
                int i10 = MAX_PACKET_SIZE;
                if (i7 <= 10240) {
                    i10 = i7;
                }
                this.output.write(message.getBody(), size - i7, i10);
                i7 -= i10;
            }
        } catch (Exception e7) {
            Logger.INSTANCE.e(Constants.TAG, "socket " + this.channel + " write exception: ", e7);
            throw e7;
        }
    }
}
