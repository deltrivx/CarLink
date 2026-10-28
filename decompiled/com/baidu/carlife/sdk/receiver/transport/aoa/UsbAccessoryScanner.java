package com.baidu.carlife.sdk.receiver.transport.aoa;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbInterface;
import android.hardware.usb.UsbManager;
import android.os.Build;
import com.baidu.carlife.sdk.CarLifeContext;
import com.baidu.carlife.sdk.Constants;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import com.baidu.carlife.sdk.receiver.transport.aoa.async.UsbAccessoryCommunicatorAsync;
import com.baidu.carlife.sdk.util.Logger;
import h9.k;
import i9.l;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import t8.a;
import t8.h;
import u3.f;
import u8.y;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 32\u00020\u00012\u00020\u0002:\u00013B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u000fJ\r\u0010\u0013\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0011J\r\u0010\u0014\u001a\u00020\u0007¢\u0006\u0004\b\u0014\u0010\u0011J\r\u0010\u0015\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u0011J\u000f\u0010\u0016\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0016\u0010\u0011J\u001f\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001cR \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001dR\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000b0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010%\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010'\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u001b\u0010-\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001b\u00102\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010*\u001a\u0004\b0\u00101¨\u00064"}, d2 = {"Lcom/baidu/carlife/sdk/receiver/transport/aoa/UsbAccessoryScanner;", "Landroid/content/BroadcastReceiver;", "Ljava/lang/Runnable;", "Lcom/baidu/carlife/sdk/CarLifeContext;", "context", "Lkotlin/Function1;", "Lcom/baidu/carlife/sdk/internal/transport/communicator/Communicator;", "Lt8/z;", "callback", "<init>", "(Lcom/baidu/carlife/sdk/CarLifeContext;Lh9/k;)V", "Landroid/hardware/usb/UsbDevice;", "device", "", "isUsbStorageDevice", "(Landroid/hardware/usb/UsbDevice;)Z", "requestPendingPermission", "()V", "openAccessory", "scan", "ready", "stop", "run", "Landroid/content/Context;", "Landroid/content/Intent;", "intent", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "Lcom/baidu/carlife/sdk/CarLifeContext;", "Lh9/k;", "Landroid/hardware/usb/UsbManager;", "usbManager", "Landroid/hardware/usb/UsbManager;", "Ljava/util/concurrent/LinkedBlockingQueue;", "pendingPermissionDevices", "Ljava/util/concurrent/LinkedBlockingQueue;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isStopped", "Ljava/util/concurrent/atomic/AtomicBoolean;", "lastConnectedDevice", "Landroid/hardware/usb/UsbDevice;", "useAsyncMode$delegate", "Lt8/h;", "getUseAsyncMode", "()Z", "useAsyncMode", "Landroid/content/IntentFilter;", "filter$delegate", "getFilter", "()Landroid/content/IntentFilter;", "filter", "Companion", "carlife-sdk_release"}, k = 1, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
public final class UsbAccessoryScanner extends BroadcastReceiver implements Runnable {
    private static final String ACTION_USB_PERMISSION = "com.baidu.carlifevehicle.connect.USB_PERMISSION";
    public static final int STORAGE_INTERFACE_CLASS = 8;
    public static final int STORAGE_INTERFACE_CONUT = 1;
    public static final int STORAGE_INTERFACE_ID = 0;
    public static final int STORAGE_INTERFACE_PROTOCOL = 80;
    public static final int STORAGE_INTERFACE_SUBCLASS = 6;
    public static final int VID_IPHONE = 1452;
    private final k callback;
    private final CarLifeContext context;

    /* JADX INFO: renamed from: filter$delegate, reason: from kotlin metadata */
    private final h filter;
    private AtomicBoolean isStopped;
    private UsbDevice lastConnectedDevice;
    private final LinkedBlockingQueue<UsbDevice> pendingPermissionDevices;
    private final UsbManager usbManager;

    /* JADX INFO: renamed from: useAsyncMode$delegate, reason: from kotlin metadata */
    private final h useAsyncMode;

    public UsbAccessoryScanner(CarLifeContext carLifeContext, k kVar) {
        l.e(carLifeContext, "context");
        l.e(kVar, "callback");
        this.context = carLifeContext;
        this.callback = kVar;
        Object systemService = carLifeContext.getContext().getSystemService("usb");
        this.usbManager = systemService instanceof UsbManager ? (UsbManager) systemService : null;
        this.pendingPermissionDevices = new LinkedBlockingQueue<>();
        this.isStopped = new AtomicBoolean(false);
        this.useAsyncMode = a.d(new UsbAccessoryScanner$useAsyncMode$2(this));
        this.filter = a.d(UsbAccessoryScanner$filter$2.INSTANCE);
    }

    private final IntentFilter getFilter() {
        return (IntentFilter) this.filter.getValue();
    }

    private final boolean getUseAsyncMode() {
        return ((Boolean) this.useAsyncMode.getValue()).booleanValue();
    }

    private final boolean isUsbStorageDevice(UsbDevice device) {
        if (device == null) {
            Logger.INSTANCE.d(Constants.TAG, "this device is null");
            return false;
        }
        if (1 == device.getInterfaceCount()) {
            UsbInterface usbInterface = device.getInterface(0);
            l.d(usbInterface, "device.getInterface(STORAGE_INTERFACE_ID)");
            if (8 == usbInterface.getInterfaceClass() && 6 == usbInterface.getInterfaceSubclass() && 80 == usbInterface.getInterfaceProtocol()) {
                Logger.INSTANCE.d(Constants.TAG, "this device is mass storage 2");
                return true;
            }
        }
        return false;
    }

    private final boolean openAccessory(UsbDevice device) {
        Logger.Companion companion = Logger.INSTANCE;
        companion.d(Constants.TAG, "UsbAccessoryScanner start openAccessory isStopped: ", this.isStopped);
        if (!this.isStopped.get()) {
            if (getUseAsyncMode()) {
                UsbAccessoryCommunicatorAsync usbAccessoryCommunicatorAsync = new UsbAccessoryCommunicatorAsync(this.context, device);
                if (usbAccessoryCommunicatorAsync.openAccessory()) {
                    companion.d(Constants.TAG, "UsbAccessoryScanner2 openAccessory success");
                    this.lastConnectedDevice = device;
                    this.callback.invoke(usbAccessoryCommunicatorAsync);
                    return true;
                }
            } else {
                UsbAccessoryCommunicator usbAccessoryCommunicator = new UsbAccessoryCommunicator(this.context, device);
                if (usbAccessoryCommunicator.openAccessory()) {
                    companion.d(Constants.TAG, "UsbAccessoryScanner1 openAccessory success");
                    this.lastConnectedDevice = device;
                    this.callback.invoke(usbAccessoryCommunicator);
                    return true;
                }
            }
        }
        companion.d(Constants.TAG, "UsbAccessoryScanner openAccessory failed");
        return false;
    }

    private final void requestPendingPermission() {
        UsbDevice usbDevicePoll = this.pendingPermissionDevices.poll();
        if (usbDevicePoll != null) {
            PendingIntent broadcast = PendingIntent.getBroadcast(this.context.getContext(), 0, new Intent(ACTION_USB_PERMISSION), Build.VERSION.SDK_INT >= 31 ? ServiceTypes.MSG_VEHICLE_CONTROL_AREA_ID_ZONE : 0);
            UsbManager usbManager = this.usbManager;
            if (usbManager != null) {
                usbManager.requestPermission(usbDevicePoll, broadcast);
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action;
        UsbDevice usbDevice;
        l.e(context, "context");
        l.e(intent, "intent");
        Logger.INSTANCE.d(Constants.TAG, "UsbAccessoryScanner action with " + intent.getAction() + ", " + this.isStopped);
        if (this.isStopped.get() || (action = intent.getAction()) == null) {
            return;
        }
        int iHashCode = action.hashCode();
        if (iHashCode != -2114103349) {
            if (iHashCode == -1608292967) {
                if (action.equals("android.hardware.usb.action.USB_DEVICE_DETACHED")) {
                    this.isStopped.set(false);
                    return;
                }
                return;
            } else {
                if (iHashCode == -301399968 && action.equals(ACTION_USB_PERMISSION)) {
                    if (intent.getBooleanExtra("permission", false) && (usbDevice = (UsbDevice) intent.getParcelableExtra("device")) != null && openAccessory(usbDevice)) {
                        this.pendingPermissionDevices.clear();
                        return;
                    } else {
                        requestPendingPermission();
                        return;
                    }
                }
                return;
            }
        }
        if (action.equals("android.hardware.usb.action.USB_DEVICE_ATTACHED")) {
            Set<String> stringSet = context.getApplicationContext().getSharedPreferences("CarLifePrefs", 0).getStringSet("USB_DEVICE_IGNORE", null);
            if (stringSet == null) {
                stringSet = y.f13124a;
            }
            UsbDevice usbDevice2 = (UsbDevice) intent.getParcelableExtra("device");
            if (usbDevice2 == null || isUsbStorageDevice(usbDevice2)) {
                return;
            }
            UsbManager usbManager = this.usbManager;
            if (usbManager != null && usbManager.hasPermission(usbDevice2)) {
                openAccessory(usbDevice2);
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(usbDevice2.getVendorId());
            sb2.append('-');
            sb2.append(usbDevice2.getProductId());
            if (stringSet.contains(sb2.toString())) {
                return;
            }
            this.pendingPermissionDevices.add(usbDevice2);
            requestPendingPermission();
        }
    }

    public final void ready() {
        this.isStopped.set(false);
    }

    @Override // java.lang.Runnable
    public void run() {
        UsbManager usbManager;
        this.pendingPermissionDevices.clear();
        UsbDevice usbDevice = this.lastConnectedDevice;
        if (usbDevice == null || (usbManager = this.usbManager) == null || !usbManager.hasPermission(usbDevice) || !openAccessory(usbDevice)) {
            Set<String> stringSet = this.context.getContext().getSharedPreferences("CarLifePrefs", 0).getStringSet("CONNECT_USB_DEVICE_IGNORE", null);
            if (stringSet == null) {
                stringSet = y.f13124a;
            }
            UsbManager usbManager2 = this.usbManager;
            if (usbManager2 != null) {
                for (UsbDevice usbDevice2 : usbManager2.getDeviceList().values()) {
                    if (!isUsbStorageDevice(usbDevice2)) {
                        boolean zHasPermission = this.usbManager.hasPermission(usbDevice2);
                        Logger.INSTANCE.d(Constants.TAG, "UsbAccessoryScanner deal with ", usbDevice2, " has permission ", Boolean.valueOf(zHasPermission));
                        if (zHasPermission) {
                            l.d(usbDevice2, "device");
                            if (openAccessory(usbDevice2)) {
                                this.pendingPermissionDevices.clear();
                                break;
                            }
                        } else if (usbDevice2.getVendorId() != 1452) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(usbDevice2.getVendorId());
                            sb2.append('-');
                            sb2.append(usbDevice2.getProductId());
                            if (!stringSet.contains(sb2.toString())) {
                                this.pendingPermissionDevices.add(usbDevice2);
                            }
                        }
                    }
                }
            }
            requestPendingPermission();
        }
    }

    public final void scan() {
        this.isStopped.set(false);
        f.g(this.context.getContext(), this, getFilter());
        this.context.io().execute(this);
    }

    public final void stop() {
        if (this.isStopped.getAndSet(true)) {
            return;
        }
        try {
            this.context.getContext().unregisterReceiver(this);
        } catch (IllegalArgumentException e7) {
            e7.printStackTrace();
        }
        this.context.getHandler().removeCallbacks(this);
        this.pendingPermissionDevices.clear();
    }
}
