package com.baidu.carlife.sdk.receiver.transport.aoa;

import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbDeviceConnection;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import i9.l;
import java.nio.charset.Charset;
import kotlin.Metadata;
import zb.a;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J6\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\bH\u0002J6\u0010\u000f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\bH\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0011H\u0002J\u0006\u0010\u0013\u001a\u00020\u0011J\b\u0010\u0014\u001a\u00020\u0011H\u0002J\b\u0010\u0015\u001a\u00020\u0011H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/baidu/carlife/sdk/receiver/transport/aoa/UsbAccessoryStarter;", "", "usbDevice", "Landroid/hardware/usb/UsbDevice;", "usbConnection", "Landroid/hardware/usb/UsbDeviceConnection;", "(Landroid/hardware/usb/UsbDevice;Landroid/hardware/usb/UsbDeviceConnection;)V", "controlTransferIn", "", "request", "value", "index", "buffer", "", "length", "controlTransferOut", "getProtocolVersion", "", "isAccessory", "openAccessory", "sendIdentities", "startAccessory", "Companion", "carlife-sdk_release"}, k = 1, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
public final class UsbAccessoryStarter {
    public static final int AOA_AUDIO_SUPPORT = 58;
    public static final String AOA_DESCRIPTION = "Baidu CarLife";
    public static final int AOA_GET_PROTOCOL = 51;
    public static final String AOA_MANUFACTURER = "Baidu";
    public static final String AOA_MODEL_NAME = "CarLife";
    public static final int AOA_SEND_IDENT = 52;
    public static final String AOA_SERIAL_NUMBER = "0720SerialNo.";
    public static final int AOA_START_ACCESSORY = 53;
    public static final String AOA_URI = "http://carlife.baidu.com/";
    public static final String AOA_VERSION = "1.0.0";
    public static final int PID_ACCESSORY_ADB = 11521;
    public static final int PID_ACCESSORY_AUDIO = 11522;
    public static final int PID_ACCESSORY_AUDIO_ADB = 11523;
    public static final int PID_ACCESSORY_AUDIO_ADB_BULK = 11525;
    public static final int PID_ACCESSORY_AUDIO_BULK = 11524;
    public static final int PID_ACCESSORY_ONLY = 11520;
    public static final int VID_ACCESSORY = 6353;
    private final UsbDeviceConnection usbConnection;
    private final UsbDevice usbDevice;

    public UsbAccessoryStarter(UsbDevice usbDevice, UsbDeviceConnection usbDeviceConnection) {
        l.e(usbDevice, "usbDevice");
        l.e(usbDeviceConnection, "usbConnection");
        this.usbDevice = usbDevice;
        this.usbConnection = usbDeviceConnection;
    }

    private final int controlTransferIn(int request, int value, int index, byte[] buffer, int length) {
        return this.usbConnection.controlTransfer(192, request, value, index, buffer, length, 0);
    }

    public static /* synthetic */ int controlTransferIn$default(UsbAccessoryStarter usbAccessoryStarter, int i7, int i10, int i11, byte[] bArr, int i12, int i13, Object obj) {
        if ((i13 & 8) != 0) {
            bArr = null;
        }
        byte[] bArr2 = bArr;
        if ((i13 & 16) != 0) {
            i12 = bArr2 != null ? bArr2.length : 0;
        }
        return usbAccessoryStarter.controlTransferIn(i7, i10, i11, bArr2, i12);
    }

    private final int controlTransferOut(int request, int value, int index, byte[] buffer, int length) {
        return this.usbConnection.controlTransfer(64, request, value, index, buffer, length, 0);
    }

    public static /* synthetic */ int controlTransferOut$default(UsbAccessoryStarter usbAccessoryStarter, int i7, int i10, int i11, byte[] bArr, int i12, int i13, Object obj) {
        if ((i13 & 8) != 0) {
            bArr = null;
        }
        byte[] bArr2 = bArr;
        if ((i13 & 16) != 0) {
            i12 = bArr2 != null ? bArr2.length : 0;
        }
        return usbAccessoryStarter.controlTransferOut(i7, i10, i11, bArr2, i12);
    }

    private final boolean getProtocolVersion() {
        return controlTransferIn$default(this, 51, 0, 0, new byte[2], 0, 16, null) >= 0;
    }

    private final boolean isAccessory() {
        return this.usbDevice.getVendorId() == 6353 && this.usbDevice.getProductId() >= 11520 && this.usbDevice.getProductId() <= 11525;
    }

    private final boolean sendIdentities() {
        Charset charset = a.f15804a;
        byte[] bytes = AOA_MANUFACTURER.getBytes(charset);
        l.d(bytes, "getBytes(...)");
        if (controlTransferOut$default(this, 52, 0, 0, bytes, 0, 16, null) < 0) {
            return false;
        }
        byte[] bytes2 = AOA_MODEL_NAME.getBytes(charset);
        l.d(bytes2, "getBytes(...)");
        if (controlTransferOut$default(this, 52, 0, 1, bytes2, 0, 16, null) < 0) {
            return false;
        }
        byte[] bytes3 = AOA_DESCRIPTION.getBytes(charset);
        l.d(bytes3, "getBytes(...)");
        if (controlTransferOut$default(this, 52, 0, 2, bytes3, 0, 16, null) < 0) {
            return false;
        }
        byte[] bytes4 = AOA_VERSION.getBytes(charset);
        l.d(bytes4, "getBytes(...)");
        if (controlTransferOut$default(this, 52, 0, 3, bytes4, 0, 16, null) < 0) {
            return false;
        }
        byte[] bytes5 = AOA_URI.getBytes(charset);
        l.d(bytes5, "getBytes(...)");
        if (controlTransferOut$default(this, 52, 0, 4, bytes5, 0, 16, null) < 0) {
            return false;
        }
        byte[] bytes6 = AOA_SERIAL_NUMBER.getBytes(charset);
        l.d(bytes6, "getBytes(...)");
        return controlTransferOut$default(this, 52, 0, 5, bytes6, 0, 16, null) >= 0;
    }

    private final boolean startAccessory() {
        return controlTransferOut$default(this, 53, 0, 0, null, 0, 24, null) >= 0;
    }

    public final boolean openAccessory() {
        if (isAccessory()) {
            return true;
        }
        if (!getProtocolVersion() || !sendIdentities()) {
            return false;
        }
        startAccessory();
        return false;
    }
}
