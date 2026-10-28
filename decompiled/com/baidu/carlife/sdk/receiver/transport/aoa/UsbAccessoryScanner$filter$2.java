package com.baidu.carlife.sdk.receiver.transport.aoa;

import android.content.IntentFilter;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import h9.a;
import i9.n;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/content/IntentFilter;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
public final class UsbAccessoryScanner$filter$2 extends n implements a {
    public static final UsbAccessoryScanner$filter$2 INSTANCE = new UsbAccessoryScanner$filter$2();

    public UsbAccessoryScanner$filter$2() {
        super(0);
    }

    @Override // h9.a
    public final IntentFilter invoke() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.hardware.usb.action.USB_DEVICE_ATTACHED");
        intentFilter.addAction("android.hardware.usb.action.USB_DEVICE_DETACHED");
        intentFilter.addAction("com.baidu.carlifevehicle.connect.USB_PERMISSION");
        return intentFilter;
    }
}
