package com.baidu.carlife.sdk.receiver.transport.aoa.async;

import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbDeviceConnection;
import android.hardware.usb.UsbInterface;
import android.hardware.usb.UsbManager;
import android.hardware.usb.UsbRequest;
import com.baidu.carlife.sdk.CarLifeContext;
import com.baidu.carlife.sdk.Constants;
import com.baidu.carlife.sdk.internal.protocol.CarLifeMessage;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import com.baidu.carlife.sdk.internal.transport.communicator.Communicator;
import com.baidu.carlife.sdk.receiver.transport.aoa.UsbAccessoryStarter;
import com.baidu.carlife.sdk.util.Logger;
import i9.l;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lcom/baidu/carlife/sdk/receiver/transport/aoa/async/UsbAccessoryCommunicatorAsync;", "Lcom/baidu/carlife/sdk/internal/transport/communicator/Communicator;", "Lcom/baidu/carlife/sdk/CarLifeContext;", "context", "Landroid/hardware/usb/UsbDevice;", "usbDevice", "<init>", "(Lcom/baidu/carlife/sdk/CarLifeContext;Landroid/hardware/usb/UsbDevice;)V", "", "openAccessory", "()Z", "Lcom/baidu/carlife/sdk/internal/protocol/CarLifeMessage;", "message", "Lt8/z;", "write", "(Lcom/baidu/carlife/sdk/internal/protocol/CarLifeMessage;)V", "read", "()Lcom/baidu/carlife/sdk/internal/protocol/CarLifeMessage;", "terminate", "()V", "Lcom/baidu/carlife/sdk/CarLifeContext;", "Landroid/hardware/usb/UsbDevice;", "Landroid/hardware/usb/UsbManager;", "usbManager", "Landroid/hardware/usb/UsbManager;", "Lcom/baidu/carlife/sdk/receiver/transport/aoa/async/UsbRequestPool;", "usbRequestPool", "Lcom/baidu/carlife/sdk/receiver/transport/aoa/async/UsbRequestPool;", "Landroid/hardware/usb/UsbInterface;", "usbInterface", "Landroid/hardware/usb/UsbInterface;", "Landroid/hardware/usb/UsbDeviceConnection;", "usbConnection", "Landroid/hardware/usb/UsbDeviceConnection;", "Lcom/baidu/carlife/sdk/receiver/transport/aoa/async/MessageReader;", "messageReader", "Lcom/baidu/carlife/sdk/receiver/transport/aoa/async/MessageReader;", "Lcom/baidu/carlife/sdk/receiver/transport/aoa/async/MessageSender;", "messageSender", "Lcom/baidu/carlife/sdk/receiver/transport/aoa/async/MessageSender;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isTerminated", "Ljava/util/concurrent/atomic/AtomicBoolean;", "carlife-sdk_release"}, k = 1, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
public final class UsbAccessoryCommunicatorAsync implements Communicator {
    private final CarLifeContext context;
    private final AtomicBoolean isTerminated;
    private final MessageReader messageReader;
    private final MessageSender messageSender;
    private UsbDeviceConnection usbConnection;
    private final UsbDevice usbDevice;
    private UsbInterface usbInterface;
    private final UsbManager usbManager;
    private final UsbRequestPool usbRequestPool;

    public UsbAccessoryCommunicatorAsync(CarLifeContext carLifeContext, UsbDevice usbDevice) {
        l.e(carLifeContext, "context");
        l.e(usbDevice, "usbDevice");
        this.context = carLifeContext;
        this.usbDevice = usbDevice;
        Object systemService = carLifeContext.getContext().getSystemService("usb");
        this.usbManager = systemService instanceof UsbManager ? (UsbManager) systemService : null;
        UsbRequestPool usbRequestPool = new UsbRequestPool();
        this.usbRequestPool = usbRequestPool;
        this.messageReader = new MessageReader(usbRequestPool);
        this.messageSender = new MessageSender(usbRequestPool);
        this.isTerminated = new AtomicBoolean(false);
    }

    public final boolean openAccessory() {
        try {
            this.usbInterface = this.usbDevice.getInterface(0);
            UsbManager usbManager = this.usbManager;
            UsbDeviceConnection usbDeviceConnectionOpenDevice = usbManager != null ? usbManager.openDevice(this.usbDevice) : null;
            this.usbConnection = usbDeviceConnectionOpenDevice;
            l.b(usbDeviceConnectionOpenDevice);
            usbDeviceConnectionOpenDevice.claimInterface(this.usbInterface, true);
            UsbDevice usbDevice = this.usbDevice;
            UsbDeviceConnection usbDeviceConnection = this.usbConnection;
            l.b(usbDeviceConnection);
            if (!new UsbAccessoryStarter(usbDevice, usbDeviceConnection).openAccessory()) {
                terminate();
                return false;
            }
            UsbRequestPool usbRequestPool = this.usbRequestPool;
            UsbDeviceConnection usbDeviceConnection2 = this.usbConnection;
            l.b(usbDeviceConnection2);
            UsbInterface usbInterface = this.usbInterface;
            l.b(usbInterface);
            usbRequestPool.attach(usbDeviceConnection2, usbInterface);
            return true;
        } catch (Exception e7) {
            Logger.INSTANCE.e(Constants.TAG, "openAccessory exception: ", e7);
            terminate();
            return false;
        }
    }

    @Override // com.baidu.carlife.sdk.internal.transport.communicator.Communicator
    public CarLifeMessage read() throws IOException {
        this.messageReader.read();
        while (!this.isTerminated.get()) {
            UsbDeviceConnection usbDeviceConnection = this.usbConnection;
            l.b(usbDeviceConnection);
            UsbRequest usbRequestRequestWait = usbDeviceConnection.requestWait();
            if (usbRequestRequestWait == null) {
                throw new IOException("UsbDeviceConnection requestWait return null");
            }
            if (this.usbRequestPool.isInput(usbRequestRequestWait)) {
                CarLifeMessage carLifeMessage = this.messageReader.read(usbRequestRequestWait);
                if (carLifeMessage != null) {
                    return carLifeMessage;
                }
            } else {
                this.messageSender.send(usbRequestRequestWait);
            }
        }
        throw new IOException("UsbAccessoryCommunicator read from terminated communicator");
    }

    @Override // com.baidu.carlife.sdk.internal.transport.communicator.Communicator
    public void terminate() {
        if (this.isTerminated.getAndSet(true)) {
            return;
        }
        this.usbRequestPool.release();
        this.messageSender.complete();
        UsbDeviceConnection usbDeviceConnection = this.usbConnection;
        if (usbDeviceConnection != null) {
            usbDeviceConnection.releaseInterface(this.usbInterface);
        }
        UsbDeviceConnection usbDeviceConnection2 = this.usbConnection;
        if (usbDeviceConnection2 != null) {
            usbDeviceConnection2.close();
        }
        this.usbConnection = null;
        Logger.INSTANCE.d(Constants.TAG, "UsbAccessoryCommunicator released");
    }

    @Override // com.baidu.carlife.sdk.internal.transport.communicator.Communicator
    public void write(CarLifeMessage message) throws InterruptedException, IOException {
        l.e(message, "message");
        this.messageSender.send(message);
    }
}
