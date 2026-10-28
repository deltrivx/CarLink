package a8;

import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import b8.g2;
import b8.h2;
import com.baidu.carlife.sdk.util.BluetoothUtils;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d1 implements h2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g2 f107a = g2.f1594b;

    public static void d(h9.k kVar, boolean z10) {
        BluetoothAdapter adapter = BluetoothUtils.INSTANCE.getAdapter(n8.a.b());
        if (adapter == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            Intent intent = new Intent("android.settings.BLUETOOTH_SETTINGS");
            intent.setFlags(268435456);
            n8.a.b().startActivity(intent);
            return;
        }
        if (z10) {
            if (adapter.isEnabled()) {
                kVar.invoke("蓝牙已是开启状态");
                return;
            }
            adapter.enable();
        } else {
            if (!adapter.isEnabled()) {
                kVar.invoke("蓝牙已是关闭状态");
                return;
            }
            adapter.disable();
        }
        u3.f.g(n8.a.b(), new b1(kVar), new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
    }

    @Override // b8.h2
    public final void a() {
        hc.c cVar = n8.c.f8897a;
        n8.c.d(new c1(this, null, 0));
    }

    @Override // b8.h2
    public final String b() {
        return "蓝牙开关";
    }

    @Override // b8.h2
    public final void c(boolean z10, h9.a aVar, h9.k kVar, f1.s sVar, int i7) {
        i9.l.e(aVar, "onDismissRequest");
        i9.l.e(kVar, "onConfigured");
        sVar.Y(1730529151);
        int i10 = i7 | (sVar.g(z10) ? 4 : 2) | (sVar.h(kVar) ? 256 : 128) | (sVar.f(this) ? 2048 : 1024);
        if ((i10 & 1171) == 1170 && sVar.z()) {
            sVar.Q();
        } else {
            sVar.W(1849434622);
            Object objK = sVar.K();
            if (objK == f1.n.f5051a) {
                objK = f1.b.s(Boolean.TRUE);
                sVar.h0(objK);
            }
            f1.b1 b1Var = (f1.b1) objK;
            sVar.p(false);
            l8.n.a(z10, null, 0L, false, 0, null, n1.h.e(-771004378, new o(aVar, 2), sVar), n1.h.e(-69069785, new k0(1, this, b1Var), sVar), n1.h.e(632864808, new a1(kVar, this, b1Var, 0), sVar), n1.h.e(-347461514, new w(b1Var, 10), sVar), sVar, (i10 & 14) | 918552576, 126);
        }
        f1.w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new i(this, z10, aVar, kVar, i7, 3);
        }
    }

    @Override // b8.h2
    public final String getName() {
        return "BTSwitch";
    }

    @Override // b8.h2
    public final g2 getType() {
        return this.f107a;
    }
}
