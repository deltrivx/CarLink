package a8;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.baidu.carlife.sdk.util.Logger;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b1 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h9.k f87a;

    public b1(h9.k kVar) {
        this.f87a = kVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Logger.INSTANCE.e("eee", intent != null ? intent.getAction() : null);
        if ("android.bluetooth.adapter.action.STATE_CHANGED".equals(intent != null ? intent.getAction() : null)) {
            int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", Integer.MIN_VALUE);
            h9.k kVar = this.f87a;
            try {
                if (intExtra == Integer.MIN_VALUE) {
                    kVar.invoke("蓝牙操作失败");
                    n8.a.b().unregisterReceiver(this);
                } else if (intExtra == 10) {
                    kVar.invoke("蓝牙已成功关闭");
                    n8.a.b().unregisterReceiver(this);
                } else {
                    if (intExtra != 12) {
                        return;
                    }
                    kVar.invoke("蓝牙已成功开启");
                    n8.a.b().unregisterReceiver(this);
                }
            } catch (Exception unused) {
            }
        }
    }
}
