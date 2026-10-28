package com.baidu.carlife.sdk.receiver.transport.aoa.async;

import android.hardware.usb.UsbDeviceConnection;
import android.hardware.usb.UsbInterface;
import android.hardware.usb.UsbRequest;
import android.os.Build;
import com.baidu.carlife.sdk.Constants;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import com.baidu.carlife.sdk.util.Logger;
import i9.l;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0004\u0018\u0000 .2\u00020\u0001:\u0001.B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\u0003J\u001d\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ-\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0019J\u0019\u0010\u001b\u001a\u00020\u00042\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001d\u001a\u00020\u00042\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u001d\u0010\u001cJ\u0015\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010 \u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\b¢\u0006\u0004\b\"\u0010\u0003R\u0018\u0010#\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010%\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00040'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00040'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010)R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00040+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lcom/baidu/carlife/sdk/receiver/transport/aoa/async/UsbRequestPool;", "", "<init>", "()V", "Landroid/hardware/usb/UsbRequest;", "request", "record", "(Landroid/hardware/usb/UsbRequest;)Landroid/hardware/usb/UsbRequest;", "Lt8/z;", "checkUsbState", "Landroid/hardware/usb/UsbDeviceConnection;", "connection", "Landroid/hardware/usb/UsbInterface;", "interfaze", "attach", "(Landroid/hardware/usb/UsbDeviceConnection;Landroid/hardware/usb/UsbInterface;)V", "", "buffer", "", "offset", "length", "", "queue", "(Landroid/hardware/usb/UsbRequest;[BII)Z", "Ljava/nio/ByteBuffer;", "(Landroid/hardware/usb/UsbRequest;Ljava/nio/ByteBuffer;I)Z", "clientData", "acquireInRequest", "(Ljava/lang/Object;)Landroid/hardware/usb/UsbRequest;", "acquireOutRequest", "releaseRequest", "(Landroid/hardware/usb/UsbRequest;)V", "isInput", "(Landroid/hardware/usb/UsbRequest;)Z", "release", "usbConnection", "Landroid/hardware/usb/UsbDeviceConnection;", "usbInterface", "Landroid/hardware/usb/UsbInterface;", "Ljava/util/LinkedList;", "inRequestCache", "Ljava/util/LinkedList;", "outRequestCache", "", "recordingRequests", "Ljava/util/Set;", "Companion", "carlife-sdk_release"}, k = 1, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
public final class UsbRequestPool {
    public static final int BULK_ENDPOINT_IN_ADDRESS = 0;
    public static final int BULK_ENDPOINT_OUT_ADDRESS = 1;
    private static final AtomicInteger createRequestCount = new AtomicInteger(0);
    private final LinkedList<UsbRequest> inRequestCache = new LinkedList<>();
    private final LinkedList<UsbRequest> outRequestCache = new LinkedList<>();
    private final Set<UsbRequest> recordingRequests = new LinkedHashSet();
    private UsbDeviceConnection usbConnection;
    private UsbInterface usbInterface;

    public static /* synthetic */ UsbRequest acquireInRequest$default(UsbRequestPool usbRequestPool, Object obj, int i7, Object obj2) {
        if ((i7 & 1) != 0) {
            obj = null;
        }
        return usbRequestPool.acquireInRequest(obj);
    }

    public static /* synthetic */ UsbRequest acquireOutRequest$default(UsbRequestPool usbRequestPool, Object obj, int i7, Object obj2) {
        if ((i7 & 1) != 0) {
            obj = null;
        }
        return usbRequestPool.acquireOutRequest(obj);
    }

    private final void checkUsbState() {
        if (this.usbConnection == null || this.usbInterface == null) {
            throw new IllegalStateException("access before attached or after release");
        }
    }

    private final UsbRequest record(UsbRequest request) {
        this.recordingRequests.add(request);
        return request;
    }

    public final synchronized UsbRequest acquireInRequest(Object clientData) {
        checkUsbState();
        UsbRequest usbRequestPoll = this.inRequestCache.poll();
        if (usbRequestPoll != null) {
            usbRequestPoll.setClientData(clientData);
            return record(usbRequestPoll);
        }
        UsbRequest usbRequest = new UsbRequest();
        UsbDeviceConnection usbDeviceConnection = this.usbConnection;
        UsbInterface usbInterface = this.usbInterface;
        l.b(usbInterface);
        usbRequest.initialize(usbDeviceConnection, usbInterface.getEndpoint(0));
        usbRequest.setClientData(clientData);
        createRequestCount.incrementAndGet();
        Logger.INSTANCE.d(Constants.TAG, "UsbRequestPool create new in request ", usbRequest);
        return record(usbRequest);
    }

    public final synchronized UsbRequest acquireOutRequest(Object clientData) {
        checkUsbState();
        UsbRequest usbRequestPoll = this.outRequestCache.poll();
        if (usbRequestPoll != null) {
            usbRequestPoll.setClientData(clientData);
            return record(usbRequestPoll);
        }
        UsbRequest usbRequest = new UsbRequest();
        UsbDeviceConnection usbDeviceConnection = this.usbConnection;
        UsbInterface usbInterface = this.usbInterface;
        l.b(usbInterface);
        usbRequest.initialize(usbDeviceConnection, usbInterface.getEndpoint(1));
        usbRequest.setClientData(clientData);
        createRequestCount.incrementAndGet();
        Logger.INSTANCE.d(Constants.TAG, "UsbRequestPool create new out request ", usbRequest);
        return record(usbRequest);
    }

    public final void attach(UsbDeviceConnection connection, UsbInterface interfaze) {
        l.e(connection, "connection");
        l.e(interfaze, "interfaze");
        if (this.usbConnection != null || this.usbInterface != null) {
            throw new IllegalStateException("can not attach to a pool which already attached");
        }
        this.usbConnection = connection;
        this.usbInterface = interfaze;
    }

    public final boolean isInput(UsbRequest request) {
        l.e(request, "request");
        return request.getEndpoint().getDirection() == 128;
    }

    public final boolean queue(UsbRequest request, ByteBuffer buffer, int length) {
        l.e(request, "request");
        l.e(buffer, "buffer");
        return Build.VERSION.SDK_INT >= 26 ? request.queue(buffer) : request.queue(buffer, length);
    }

    public final boolean queue(UsbRequest request, byte[] buffer, int offset, int length) {
        l.e(request, "request");
        l.e(buffer, "buffer");
        return Build.VERSION.SDK_INT >= 26 ? request.queue(ByteBuffer.wrap(buffer, offset, length)) : request.queue(ByteBuffer.wrap(buffer, offset, length), length);
    }

    public final synchronized void release() {
        try {
            this.usbConnection = null;
            this.usbInterface = null;
            AtomicInteger atomicInteger = createRequestCount;
            int size = atomicInteger.get() - ((this.inRequestCache.size() + this.outRequestCache.size()) + this.recordingRequests.size());
            atomicInteger.set(0);
            Logger.INSTANCE.d(Constants.TAG, "UsbRequestPool requests leak ", Integer.valueOf(size));
            Iterator<T> it = this.inRequestCache.iterator();
            while (it.hasNext()) {
                ((UsbRequest) it.next()).close();
            }
            this.inRequestCache.clear();
            Iterator<T> it2 = this.outRequestCache.iterator();
            while (it2.hasNext()) {
                ((UsbRequest) it2.next()).close();
            }
            this.outRequestCache.clear();
            Iterator<T> it3 = this.recordingRequests.iterator();
            while (it3.hasNext()) {
                ((UsbRequest) it3.next()).close();
            }
            this.recordingRequests.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void releaseRequest(UsbRequest request) {
        l.e(request, "request");
        if (this.usbInterface == null) {
            request.close();
            return;
        }
        this.recordingRequests.remove(request);
        if (isInput(request)) {
            this.inRequestCache.offer(request);
        } else {
            this.outRequestCache.offer(request);
        }
    }
}
