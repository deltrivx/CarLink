package com.baidu.carlife.sdk.internal.transport.communicator;

import android.bluetooth.BluetoothSocket;
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
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/baidu/carlife/sdk/internal/transport/communicator/BluetoothCommunicator;", "Lcom/baidu/carlife/sdk/internal/transport/communicator/Communicator;", "Landroid/bluetooth/BluetoothSocket;", "socket", "Lcom/baidu/carlife/sdk/internal/transport/communicator/Communicator$Callbacks;", "callbacks", "<init>", "(Landroid/bluetooth/BluetoothSocket;Lcom/baidu/carlife/sdk/internal/transport/communicator/Communicator$Callbacks;)V", "Lcom/baidu/carlife/sdk/internal/protocol/CarLifeMessage;", "message", "Lt8/z;", "write", "(Lcom/baidu/carlife/sdk/internal/protocol/CarLifeMessage;)V", "read", "()Lcom/baidu/carlife/sdk/internal/protocol/CarLifeMessage;", "terminate", "()V", "Landroid/bluetooth/BluetoothSocket;", "Lcom/baidu/carlife/sdk/internal/transport/communicator/Communicator$Callbacks;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isTerminated", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/io/InputStream;", "input", "Ljava/io/InputStream;", "Ljava/io/OutputStream;", "output", "Ljava/io/OutputStream;", "carlife-sdk_release"}, k = 1, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
public final class BluetoothCommunicator implements Communicator {
    private final Communicator.Callbacks callbacks;
    private final InputStream input;
    private AtomicBoolean isTerminated;
    private final OutputStream output;
    private final BluetoothSocket socket;

    public BluetoothCommunicator(BluetoothSocket bluetoothSocket, Communicator.Callbacks callbacks) throws IOException {
        l.e(bluetoothSocket, "socket");
        this.socket = bluetoothSocket;
        this.callbacks = callbacks;
        this.isTerminated = new AtomicBoolean(false);
        InputStream inputStream = bluetoothSocket.getInputStream();
        l.d(inputStream, "socket.inputStream");
        this.input = inputStream;
        OutputStream outputStream = bluetoothSocket.getOutputStream();
        l.d(outputStream, "socket.outputStream");
        this.output = outputStream;
    }

    public /* synthetic */ BluetoothCommunicator(BluetoothSocket bluetoothSocket, Communicator.Callbacks callbacks, int i7, g gVar) {
        this(bluetoothSocket, (i7 & 2) != 0 ? null : callbacks);
    }

    @Override // com.baidu.carlife.sdk.internal.transport.communicator.Communicator
    public CarLifeMessage read() throws Exception {
        if (this.isTerminated.get()) {
            throw new IOException("socket has been closed");
        }
        CarLifeMessage carLifeMessageObtain$default = CarLifeMessage.Companion.obtain$default(CarLifeMessage.INSTANCE, 1, null, 0, 6, null);
        try {
            IOUtilsKt.blockRead(this.input, carLifeMessageObtain$default.getBody(), 0, carLifeMessageObtain$default.getCommandSize());
            carLifeMessageObtain$default.resizeBuffer(carLifeMessageObtain$default.getSize());
            IOUtilsKt.blockRead(this.input, carLifeMessageObtain$default.getBody(), carLifeMessageObtain$default.getCommandSize(), carLifeMessageObtain$default.getPayloadSize());
            Logger.INSTANCE.d(Constants.TAG, "BluetoothCommunicator onReceiveMessage ", carLifeMessageObtain$default);
            return carLifeMessageObtain$default;
        } catch (Exception e7) {
            carLifeMessageObtain$default.recycle();
            terminate();
            throw e7;
        }
    }

    @Override // com.baidu.carlife.sdk.internal.transport.communicator.Communicator
    public void terminate() {
        if (this.isTerminated.getAndSet(true)) {
            return;
        }
        try {
            this.socket.close();
        } catch (Exception e7) {
            Logger.INSTANCE.d(Constants.TAG, "BluetoothCommunicator terminate exception: ", e7);
        }
        Communicator.Callbacks callbacks = this.callbacks;
        if (callbacks != null) {
            callbacks.onTerminated(1);
        }
        Logger.INSTANCE.d(Constants.TAG, "BluetoothCommunicator terminated ", this);
    }

    @Override // com.baidu.carlife.sdk.internal.transport.communicator.Communicator
    public void write(CarLifeMessage message) throws Exception {
        l.e(message, "message");
        if (this.isTerminated.get()) {
            throw new IOException("socket has been closed");
        }
        try {
            this.output.write(message.getBody(), 0, message.getSize());
            Logger.INSTANCE.d(Constants.TAG, "BluetoothCommunicator onSendMessage ", message);
        } catch (Exception e7) {
            terminate();
            throw e7;
        }
    }
}
