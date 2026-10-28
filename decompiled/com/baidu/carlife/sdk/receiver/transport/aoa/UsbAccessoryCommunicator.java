package com.baidu.carlife.sdk.receiver.transport.aoa;

import a2.f;
import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbDeviceConnection;
import android.hardware.usb.UsbEndpoint;
import android.hardware.usb.UsbInterface;
import android.hardware.usb.UsbManager;
import com.baidu.carlife.sdk.CarLifeContext;
import com.baidu.carlife.sdk.Constants;
import com.baidu.carlife.sdk.internal.protocol.CarLifeMessage;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import com.baidu.carlife.sdk.internal.transport.communicator.Communicator;
import com.baidu.carlife.sdk.util.BitConverterKt;
import com.baidu.carlife.sdk.util.Logger;
import i9.l;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\nJ\u0015\u0010\u0014\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u000b¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lcom/baidu/carlife/sdk/receiver/transport/aoa/UsbAccessoryCommunicator;", "Lcom/baidu/carlife/sdk/internal/transport/communicator/Communicator;", "Lcom/baidu/carlife/sdk/CarLifeContext;", "context", "Landroid/hardware/usb/UsbDevice;", "usbDevice", "<init>", "(Lcom/baidu/carlife/sdk/CarLifeContext;Landroid/hardware/usb/UsbDevice;)V", "Lt8/z;", "resetUsbDevice", "()V", "", "openAccessory", "()Z", "Lcom/baidu/carlife/sdk/internal/protocol/CarLifeMessage;", "message", "write", "(Lcom/baidu/carlife/sdk/internal/protocol/CarLifeMessage;)V", "read", "()Lcom/baidu/carlife/sdk/internal/protocol/CarLifeMessage;", "terminate", "(Z)V", "Lcom/baidu/carlife/sdk/CarLifeContext;", "Landroid/hardware/usb/UsbDevice;", "Landroid/hardware/usb/UsbManager;", "usbManager", "Landroid/hardware/usb/UsbManager;", "Landroid/hardware/usb/UsbInterface;", "usbInterface", "Landroid/hardware/usb/UsbInterface;", "Landroid/hardware/usb/UsbDeviceConnection;", "usbConnection", "Landroid/hardware/usb/UsbDeviceConnection;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isTerminated", "Ljava/util/concurrent/atomic/AtomicBoolean;", "", "headerBuffer", "[B", "carlife-sdk_release"}, k = 1, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
public final class UsbAccessoryCommunicator implements Communicator {
    private final CarLifeContext context;
    private final byte[] headerBuffer;
    private final AtomicBoolean isTerminated;
    private UsbDeviceConnection usbConnection;
    private final UsbDevice usbDevice;
    private UsbInterface usbInterface;
    private final UsbManager usbManager;

    public UsbAccessoryCommunicator(CarLifeContext carLifeContext, UsbDevice usbDevice) {
        l.e(carLifeContext, "context");
        l.e(usbDevice, "usbDevice");
        this.context = carLifeContext;
        this.usbDevice = usbDevice;
        Object systemService = carLifeContext.getContext().getSystemService("usb");
        this.usbManager = systemService instanceof UsbManager ? (UsbManager) systemService : null;
        this.isTerminated = new AtomicBoolean(false);
        this.headerBuffer = new byte[8];
    }

    private final void resetUsbDevice() {
        try {
            Object objInvoke = UsbDeviceConnection.class.getMethod("resetDevice", null).invoke(this.usbConnection, null);
            Logger.INSTANCE.d(Constants.TAG, "USB Device resetDevice result: " + objInvoke);
        } catch (Exception e7) {
            e7.printStackTrace();
            Logger.INSTANCE.e(Constants.TAG, "USB Device resetDevice error", e7);
        }
    }

    public final boolean openAccessory() {
        try {
            Logger.Companion companion = Logger.INSTANCE;
            companion.d(Constants.TAG, "UsbAccessoryCommunicator openAccessory");
            this.usbInterface = this.usbDevice.getInterface(0);
            UsbManager usbManager = this.usbManager;
            UsbDeviceConnection usbDeviceConnectionOpenDevice = usbManager != null ? usbManager.openDevice(this.usbDevice) : null;
            this.usbConnection = usbDeviceConnectionOpenDevice;
            l.b(usbDeviceConnectionOpenDevice);
            usbDeviceConnectionOpenDevice.claimInterface(this.usbInterface, true);
            UsbDevice usbDevice = this.usbDevice;
            UsbDeviceConnection usbDeviceConnection = this.usbConnection;
            l.b(usbDeviceConnection);
            if (new UsbAccessoryStarter(usbDevice, usbDeviceConnection).openAccessory()) {
                return true;
            }
            terminate(false);
            companion.d(Constants.TAG, "UsbAccessoryCommunicator openAccessory switch to aoa");
            return false;
        } catch (Exception e7) {
            Logger.INSTANCE.e(Constants.TAG, "openAccessory exception: ", e7);
            terminate();
            return false;
        }
    }

    @Override // com.baidu.carlife.sdk.internal.transport.communicator.Communicator
    public CarLifeMessage read() throws IOException {
        UsbDeviceConnection usbDeviceConnection = this.usbConnection;
        if (usbDeviceConnection == null) {
            throw new IOException("UsbAccessoryCommunicator read from terminated communicator");
        }
        UsbInterface usbInterface = this.usbInterface;
        l.b(usbInterface);
        UsbEndpoint endpoint = usbInterface.getEndpoint(0);
        int iBulkTransfer = 0;
        while (iBulkTransfer == 0) {
            iBulkTransfer = usbDeviceConnection.bulkTransfer(endpoint, this.headerBuffer, 0, 8, 0);
            if (iBulkTransfer == 0) {
                Logger.INSTANCE.e(Constants.TAG, "bulkTransfer read zero header length");
            }
        }
        if (iBulkTransfer < 0) {
            throw new IOException("UsbAccessoryCommunicatorSync bulkTransfer header read failed");
        }
        int int$default = BitConverterKt.toInt$default(this.headerBuffer, 0, 1, null);
        int i7 = BitConverterKt.toInt(this.headerBuffer, 4);
        if (int$default < 1 || int$default > 7 || i7 < 0 || i7 > 67108864) {
            throw new IOException(f.D(int$default, i7, "invalid message channel ", " or message size "));
        }
        CarLifeMessage carLifeMessageObtain$default = CarLifeMessage.Companion.obtain$default(CarLifeMessage.INSTANCE, int$default, null, i7, 2, null);
        int i10 = i7;
        while (i10 > 0) {
            int iBulkTransfer2 = usbDeviceConnection.bulkTransfer(endpoint, carLifeMessageObtain$default.getBody(), i7 - i10, Math.min(i10, endpoint.getMaxPacketSize()), 1000);
            if (iBulkTransfer2 > 0) {
                i10 -= iBulkTransfer2;
            }
            if (iBulkTransfer2 < 0) {
                carLifeMessageObtain$default.recycle();
                throw new IOException("UsbAccessoryCommunicator bulkTransfer header failed " + i7 + ' ' + i10 + ' ' + iBulkTransfer2);
            }
        }
        return carLifeMessageObtain$default;
    }

    @Override // com.baidu.carlife.sdk.internal.transport.communicator.Communicator
    public void terminate() {
        terminate(true);
    }

    public final void terminate(boolean resetUsbDevice) {
        if (this.isTerminated.getAndSet(true)) {
            return;
        }
        Logger.INSTANCE.d(Constants.TAG, "UsbAccessoryCommunicator terminate");
        UsbDeviceConnection usbDeviceConnection = this.usbConnection;
        if (usbDeviceConnection != null) {
            usbDeviceConnection.releaseInterface(this.usbInterface);
        }
        if (resetUsbDevice) {
            resetUsbDevice();
        }
        UsbDeviceConnection usbDeviceConnection2 = this.usbConnection;
        if (usbDeviceConnection2 != null) {
            usbDeviceConnection2.close();
        }
        this.usbConnection = null;
    }

    @Override // com.baidu.carlife.sdk.internal.transport.communicator.Communicator
    public void write(CarLifeMessage message) throws IOException {
        l.e(message, "message");
        Logger.INSTANCE.v(Constants.TAG, "UsbAccessoryCommunicator write ");
        UsbDeviceConnection usbDeviceConnection = this.usbConnection;
        if (usbDeviceConnection == null) {
            throw new IOException("UsbAccessoryCommunicatorSync is terminated");
        }
        UsbInterface usbInterface = this.usbInterface;
        l.b(usbInterface);
        UsbEndpoint endpoint = usbInterface.getEndpoint(1);
        int iBulkTransfer = 0;
        while (iBulkTransfer == 0) {
            iBulkTransfer = usbDeviceConnection.bulkTransfer(endpoint, CarLifeMessage.header$default(message, false, 1, null), 0, 8, 0);
            if (iBulkTransfer == 0) {
                Logger.INSTANCE.e(Constants.TAG, "bulkTransfer write zero header length");
            }
        }
        if (iBulkTransfer < 0) {
            throw new IOException("UsbAccessoryCommunicator bulkTransfer header write failed");
        }
        int iBulkTransfer2 = 0;
        while (iBulkTransfer2 == 0) {
            iBulkTransfer2 = usbDeviceConnection.bulkTransfer(endpoint, message.getBody(), 0, message.getSize(), 0);
            if (iBulkTransfer2 == 0) {
                Logger.INSTANCE.e(Constants.TAG, "bulkTransfer write zero body length");
            }
        }
        if (iBulkTransfer2 < 0) {
            throw new IOException("UsbAccessoryCommunicatorSync bulkTransfer body failed");
        }
    }
}
