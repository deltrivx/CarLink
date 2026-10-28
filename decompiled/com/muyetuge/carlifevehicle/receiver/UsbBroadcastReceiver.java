package com.muyetuge.carlifevehicle.receiver;

import a2.f;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.hardware.usb.UsbDevice;
import android.os.Build;
import com.baidu.carlife.sdk.Configs;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import com.baidu.carlife.sdk.util.Logger;
import hc.c;
import i9.l;
import kotlin.Metadata;
import n8.d;
import t8.o;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/muyetuge/carlifevehicle/receiver/UsbBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "app_baiduRelease"}, k = 1, mv = {2, 1, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
public final class UsbBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action;
        l.e(context, "context");
        l.e(intent, "intent");
        o oVar = d.f8898a;
        d.b(5, Configs.FEATURE_CONFIG_CONNECT_TYPE);
        UsbDevice usbDevice = Build.VERSION.SDK_INT >= 33 ? (UsbDevice) intent.getParcelableExtra("device", UsbDevice.class) : (UsbDevice) intent.getParcelableExtra("device");
        if (usbDevice == null || (action = intent.getAction()) == null) {
            return;
        }
        int iHashCode = action.hashCode();
        if (iHashCode == -2114103349) {
            if (action.equals("android.hardware.usb.action.USB_DEVICE_ATTACHED")) {
                c cVar = n8.c.f8897a;
                String productName = usbDevice.getProductName();
                if (productName == null) {
                    productName = usbDevice.getDeviceName();
                    l.d(productName, "getDeviceName(...)");
                }
                n8.c.j(0, productName.concat("已连接"));
                Logger.Companion companion = Logger.INSTANCE;
                String productName2 = usbDevice.getProductName();
                if (productName2 == null) {
                    productName2 = usbDevice.getDeviceName();
                    l.d(productName2, "getDeviceName(...)");
                }
                companion.d("CarLife_Vehicle", f.G("【USB设备】", productName2, "已连接"));
                return;
            }
            return;
        }
        if (iHashCode == -1608292967 && action.equals("android.hardware.usb.action.USB_DEVICE_DETACHED")) {
            c cVar2 = n8.c.f8897a;
            String productName3 = usbDevice.getProductName();
            if (productName3 == null) {
                productName3 = usbDevice.getDeviceName();
                l.d(productName3, "getDeviceName(...)");
            }
            n8.c.j(0, productName3.concat("已断开"));
            Logger.Companion companion2 = Logger.INSTANCE;
            String productName4 = usbDevice.getProductName();
            if (productName4 == null) {
                productName4 = usbDevice.getDeviceName();
                l.d(productName4, "getDeviceName(...)");
            }
            companion2.d("CarLife_Vehicle", f.G("【USB设备】", productName4, "已断开"));
        }
    }
}
