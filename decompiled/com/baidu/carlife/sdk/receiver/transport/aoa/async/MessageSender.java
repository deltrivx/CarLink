package com.baidu.carlife.sdk.receiver.transport.aoa.async;

import android.hardware.usb.UsbRequest;
import com.baidu.carlife.sdk.Constants;
import com.baidu.carlife.sdk.internal.protocol.CarLifeMessage;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import com.baidu.carlife.sdk.util.Logger;
import i9.l;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.Semaphore;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\t\u0010\rJ\r\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/baidu/carlife/sdk/receiver/transport/aoa/async/MessageSender;", "", "Lcom/baidu/carlife/sdk/receiver/transport/aoa/async/UsbRequestPool;", "pool", "<init>", "(Lcom/baidu/carlife/sdk/receiver/transport/aoa/async/UsbRequestPool;)V", "Lcom/baidu/carlife/sdk/internal/protocol/CarLifeMessage;", "message", "Lt8/z;", "send", "(Lcom/baidu/carlife/sdk/internal/protocol/CarLifeMessage;)V", "Landroid/hardware/usb/UsbRequest;", "request", "(Landroid/hardware/usb/UsbRequest;)V", "complete", "()V", "Lcom/baidu/carlife/sdk/receiver/transport/aoa/async/UsbRequestPool;", "Ljava/util/concurrent/Semaphore;", "semaphore", "Ljava/util/concurrent/Semaphore;", "", "stage", "I", "sendingMessage", "Lcom/baidu/carlife/sdk/internal/protocol/CarLifeMessage;", "Companion", "carlife-sdk_release"}, k = 1, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
public final class MessageSender {
    private static final int SENDING_BODY = 1;
    private static final int SENDING_COMPLETE = 2;
    private static final int SENDING_HEADER = 0;
    private final UsbRequestPool pool;
    private final Semaphore semaphore;
    private volatile CarLifeMessage sendingMessage;
    private volatile int stage;

    public MessageSender(UsbRequestPool usbRequestPool) {
        l.e(usbRequestPool, "pool");
        this.pool = usbRequestPool;
        this.semaphore = new Semaphore(0);
        this.stage = 2;
    }

    public final void complete() {
        if (this.stage != 2) {
            this.semaphore.release();
        }
    }

    public final void send(UsbRequest request) throws IOException {
        l.e(request, "request");
        if (this.stage != 0) {
            CarLifeMessage carLifeMessage = this.sendingMessage;
            l.b(carLifeMessage);
            if (carLifeMessage.getWrappedBody().position() != 0) {
                this.stage = 2;
                this.pool.releaseRequest(request);
                this.semaphore.release();
                return;
            }
            Logger.INSTANCE.e(Constants.TAG, "MessageSender send zero body length");
            UsbRequestPool usbRequestPool = this.pool;
            CarLifeMessage carLifeMessage2 = this.sendingMessage;
            l.b(carLifeMessage2);
            ByteBuffer wrappedBody = carLifeMessage2.getWrappedBody();
            CarLifeMessage carLifeMessage3 = this.sendingMessage;
            l.b(carLifeMessage3);
            if (usbRequestPool.queue(request, wrappedBody, carLifeMessage3.getSize())) {
                return;
            }
            this.pool.releaseRequest(request);
            throw new IOException("MessageReader queue send body failed");
        }
        CarLifeMessage carLifeMessage4 = this.sendingMessage;
        l.b(carLifeMessage4);
        if (carLifeMessage4.getWrappedHeader().position() == 0) {
            Logger.INSTANCE.e(Constants.TAG, "MessageSender send zero header length");
            UsbRequestPool usbRequestPool2 = this.pool;
            CarLifeMessage carLifeMessage5 = this.sendingMessage;
            l.b(carLifeMessage5);
            if (usbRequestPool2.queue(request, carLifeMessage5.getWrappedHeader(), 8)) {
                return;
            }
            this.pool.releaseRequest(request);
            throw new IOException("MessageReader queue send header failed");
        }
        this.stage = 1;
        CarLifeMessage carLifeMessage6 = this.sendingMessage;
        l.b(carLifeMessage6);
        carLifeMessage6.getWrappedBody().rewind();
        CarLifeMessage carLifeMessage7 = this.sendingMessage;
        l.b(carLifeMessage7);
        ByteBuffer wrappedBody2 = carLifeMessage7.getWrappedBody();
        CarLifeMessage carLifeMessage8 = this.sendingMessage;
        l.b(carLifeMessage8);
        wrappedBody2.limit(carLifeMessage8.getSize());
        UsbRequestPool usbRequestPool3 = this.pool;
        CarLifeMessage carLifeMessage9 = this.sendingMessage;
        l.b(carLifeMessage9);
        ByteBuffer wrappedBody3 = carLifeMessage9.getWrappedBody();
        CarLifeMessage carLifeMessage10 = this.sendingMessage;
        l.b(carLifeMessage10);
        if (usbRequestPool3.queue(request, wrappedBody3, carLifeMessage10.getSize())) {
            return;
        }
        this.pool.releaseRequest(request);
        throw new IOException("MessageReader queue send body failed");
    }

    public final void send(CarLifeMessage message) throws InterruptedException, IOException {
        l.e(message, "message");
        this.sendingMessage = message;
        this.stage = 0;
        UsbRequest usbRequestAcquireOutRequest = this.pool.acquireOutRequest(this);
        message.header(true);
        message.getWrappedHeader().rewind();
        if (this.pool.queue(usbRequestAcquireOutRequest, message.getWrappedHeader(), 8)) {
            this.semaphore.acquire();
        } else {
            this.pool.releaseRequest(usbRequestAcquireOutRequest);
            throw new IOException("MessageReader queue send header failed");
        }
    }
}
