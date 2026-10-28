package a8;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbManager;
import android.net.NetworkInfo;
import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c2 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f99a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f101c;

    public /* synthetic */ c2(int i7, Object obj, Object obj2) {
        this.f99a = i7;
        this.f100b = obj;
        this.f101c = obj2;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        NetworkInfo networkInfo;
        switch (this.f99a) {
            case 0:
                String str = (String) this.f101c;
                h9.k kVar = (h9.k) this.f100b;
                i9.l.e(context, "ctx");
                i9.l.e(intent, "intent");
                String action = intent.getAction();
                if (action != null) {
                    int iHashCode = action.hashCode();
                    try {
                        if (iHashCode != -343630553) {
                            if (iHashCode == 233521600 && action.equals("android.net.wifi.supplicant.STATE_CHANGE") && intent.getIntExtra("supplicantError", -1) == 1) {
                                kVar.invoke("连接失败: " + str);
                                n8.a.b().unregisterReceiver(this);
                            }
                        } else if (action.equals("android.net.wifi.STATE_CHANGE") && (networkInfo = (NetworkInfo) intent.getParcelableExtra("networkInfo")) != null && networkInfo.isConnected()) {
                            kVar.invoke("连接成功: " + str);
                            n8.a.b().unregisterReceiver(this);
                        }
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
            default:
                UsbManager usbManager = (UsbManager) this.f100b;
                if (usbManager != null) {
                    p1.p pVar = (p1.p) this.f101c;
                    pVar.clear();
                    Collection<UsbDevice> collectionValues = usbManager.getDeviceList().values();
                    i9.l.d(collectionValues, "<get-values>(...)");
                    pVar.addAll(collectionValues);
                }
                break;
        }
    }
}
