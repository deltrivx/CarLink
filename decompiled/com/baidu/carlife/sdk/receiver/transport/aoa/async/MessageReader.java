package com.baidu.carlife.sdk.receiver.transport.aoa.async;

import android.hardware.usb.UsbRequest;
import android.os.Build;
import com.baidu.carlife.sdk.Constants;
import com.baidu.carlife.sdk.internal.protocol.CarLifeMessage;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import com.baidu.carlife.sdk.util.BitConverterKt;
import com.baidu.carlife.sdk.util.Logger;
import i9.l;
import java.io.IOException;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import ob.a;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0015\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0016\u0010\u0017\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001b\u001a\n \u001a*\u0004\u0018\u00010\u00190\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\u001f\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018R\u001c\u0010 \u001a\n \u001a*\u0004\u0018\u00010\u00190\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001c¨\u0006!"}, d2 = {"Lcom/baidu/carlife/sdk/receiver/transport/aoa/async/MessageReader;", "", "Lcom/baidu/carlife/sdk/receiver/transport/aoa/async/UsbRequestPool;", "pool", "<init>", "(Lcom/baidu/carlife/sdk/receiver/transport/aoa/async/UsbRequestPool;)V", "Landroid/hardware/usb/UsbRequest;", "request", "Lcom/baidu/carlife/sdk/internal/protocol/CarLifeMessage;", "readAfterApi26", "(Landroid/hardware/usb/UsbRequest;)Lcom/baidu/carlife/sdk/internal/protocol/CarLifeMessage;", "readBelowApi26", "", "channel", "size", "", "verifyHeader", "(II)Z", "Lt8/z;", "reset", "()V", "read", "Lcom/baidu/carlife/sdk/receiver/transport/aoa/async/UsbRequestPool;", "messageSize", "I", "Ljava/nio/ByteBuffer;", "kotlin.jvm.PlatformType", "header", "Ljava/nio/ByteBuffer;", "readingMessage", "Lcom/baidu/carlife/sdk/internal/protocol/CarLifeMessage;", "readSize", "queuedBuffer", "carlife-sdk_release"}, k = 1, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
public final class MessageReader {
    private final ByteBuffer header;
    private int messageSize;
    private final UsbRequestPool pool;
    private final ByteBuffer queuedBuffer;
    private int readSize;
    private CarLifeMessage readingMessage;

    public MessageReader(UsbRequestPool usbRequestPool) {
        l.e(usbRequestPool, "pool");
        this.pool = usbRequestPool;
        this.header = ByteBuffer.allocate(8);
        this.queuedBuffer = ByteBuffer.allocate(16384);
    }

    private final CarLifeMessage readAfterApi26(UsbRequest request) throws IOException {
        CarLifeMessage carLifeMessage = this.readingMessage;
        if (carLifeMessage != null) {
            l.b(carLifeMessage);
            int iPosition = carLifeMessage.getWrappedBody().position();
            int i7 = this.messageSize;
            int i10 = i7 - iPosition;
            if (iPosition == i7) {
                this.pool.releaseRequest(request);
                CarLifeMessage carLifeMessage2 = this.readingMessage;
                l.b(carLifeMessage2);
                this.readingMessage = null;
                return carLifeMessage2;
            }
            UsbRequestPool usbRequestPool = this.pool;
            CarLifeMessage carLifeMessage3 = this.readingMessage;
            l.b(carLifeMessage3);
            if (usbRequestPool.queue(request, carLifeMessage3.getWrappedBody(), i10)) {
                return null;
            }
            reset();
            this.pool.releaseRequest(request);
            throw new IOException("MessageReader queue read message failed");
        }
        if (this.header.position() == 0) {
            Logger.INSTANCE.e(Constants.TAG, "MessageReader read zero header length");
            this.pool.releaseRequest(request);
            read();
            return null;
        }
        byte[] bArrArray = this.header.array();
        l.d(bArrArray, "header.array()");
        int int$default = BitConverterKt.toInt$default(bArrArray, 0, 1, null);
        byte[] bArrArray2 = this.header.array();
        l.d(bArrArray2, "header.array()");
        int i11 = BitConverterKt.toInt(bArrArray2, 4);
        this.messageSize = i11;
        if (!verifyHeader(int$default, i11)) {
            this.pool.releaseRequest(request);
            StringBuilder sbT = a.t("invalid message channel ", " or message size ", int$default);
            sbT.append(this.messageSize);
            throw new IOException(sbT.toString());
        }
        CarLifeMessage carLifeMessageObtain$default = CarLifeMessage.Companion.obtain$default(CarLifeMessage.INSTANCE, int$default, null, this.messageSize, 2, null);
        carLifeMessageObtain$default.getWrappedBody().rewind();
        carLifeMessageObtain$default.getWrappedBody().limit(this.messageSize);
        if (this.pool.queue(request, carLifeMessageObtain$default.getWrappedBody(), this.messageSize)) {
            this.readingMessage = carLifeMessageObtain$default;
            return null;
        }
        carLifeMessageObtain$default.recycle();
        this.pool.releaseRequest(request);
        throw new IOException("MessageReader queue read message failed");
    }

    private final CarLifeMessage readBelowApi26(UsbRequest request) throws IOException {
        if (this.readingMessage == null) {
            if (this.header.position() == 0) {
                Logger.INSTANCE.e(Constants.TAG, "MessageReader read zero header length");
                this.pool.releaseRequest(request);
                read();
                return null;
            }
            byte[] bArrArray = this.header.array();
            l.d(bArrArray, "header.array()");
            int int$default = BitConverterKt.toInt$default(bArrArray, 0, 1, null);
            byte[] bArrArray2 = this.header.array();
            l.d(bArrArray2, "header.array()");
            int i7 = BitConverterKt.toInt(bArrArray2, 4);
            this.messageSize = i7;
            if (!verifyHeader(int$default, i7)) {
                this.pool.releaseRequest(request);
                StringBuilder sbT = a.t("invalid message channel ", " or message size ", int$default);
                sbT.append(this.messageSize);
                throw new IOException(sbT.toString());
            }
            CarLifeMessage carLifeMessageObtain$default = CarLifeMessage.Companion.obtain$default(CarLifeMessage.INSTANCE, int$default, null, this.messageSize, 2, null);
            this.queuedBuffer.rewind();
            UsbRequestPool usbRequestPool = this.pool;
            ByteBuffer byteBuffer = this.queuedBuffer;
            l.d(byteBuffer, "queuedBuffer");
            if (usbRequestPool.queue(request, byteBuffer, this.queuedBuffer.limit())) {
                this.readingMessage = carLifeMessageObtain$default;
                return null;
            }
            carLifeMessageObtain$default.recycle();
            this.pool.releaseRequest(request);
            throw new IOException("MessageReader queue read message failed");
        }
        int iPosition = this.queuedBuffer.position();
        this.queuedBuffer.rewind();
        ByteBuffer byteBuffer2 = this.queuedBuffer;
        CarLifeMessage carLifeMessage = this.readingMessage;
        l.b(carLifeMessage);
        byteBuffer2.get(carLifeMessage.getBody(), this.readSize, iPosition);
        int i10 = this.readSize + iPosition;
        this.readSize = i10;
        int i11 = this.messageSize;
        int i12 = i11 - i10;
        if (i10 == i11) {
            this.pool.releaseRequest(request);
            CarLifeMessage carLifeMessage2 = this.readingMessage;
            l.b(carLifeMessage2);
            this.readingMessage = null;
            return carLifeMessage2;
        }
        this.queuedBuffer.rewind();
        UsbRequestPool usbRequestPool2 = this.pool;
        ByteBuffer byteBuffer3 = this.queuedBuffer;
        l.d(byteBuffer3, "queuedBuffer");
        int iLimit = this.queuedBuffer.limit();
        if (i12 > iLimit) {
            i12 = iLimit;
        }
        if (usbRequestPool2.queue(request, byteBuffer3, i12)) {
            return null;
        }
        reset();
        this.pool.releaseRequest(request);
        throw new IOException("MessageReader queue read message failed");
    }

    private final void reset() {
        this.readSize = 0;
        this.messageSize = 0;
        CarLifeMessage carLifeMessage = this.readingMessage;
        if (carLifeMessage != null) {
            carLifeMessage.recycle();
            this.readingMessage = null;
        }
    }

    private final boolean verifyHeader(int channel, int size) {
        return channel >= 1 && channel <= 7 && this.messageSize > 0;
    }

    public final CarLifeMessage read(UsbRequest request) {
        l.e(request, "request");
        return Build.VERSION.SDK_INT >= 26 ? readAfterApi26(request) : readBelowApi26(request);
    }

    public final void read() {
        reset();
        UsbRequest usbRequestAcquireInRequest = this.pool.acquireInRequest(this);
        this.header.rewind();
        UsbRequestPool usbRequestPool = this.pool;
        ByteBuffer byteBuffer = this.header;
        l.d(byteBuffer, "header");
        if (usbRequestPool.queue(usbRequestAcquireInRequest, byteBuffer, 8)) {
            return;
        }
        this.pool.releaseRequest(usbRequestAcquireInRequest);
        throw new IOException("MessageReader queue read header failed");
    }
}
