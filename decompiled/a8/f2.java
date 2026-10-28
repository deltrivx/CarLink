package a8;

import android.content.Intent;
import android.net.wifi.WifiManager;
import android.os.Build;
import b8.g2;
import b8.h2;
import com.baidu.carlife.sdk.util.Logger;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class f2 implements h2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g2 f124a = g2.f1594b;

    public static void d(boolean z10) {
        Object objB;
        Object systemService = n8.a.b().getApplicationContext().getSystemService("wifi");
        WifiManager wifiManager = systemService instanceof WifiManager ? (WifiManager) systemService : null;
        if (wifiManager == null) {
            return;
        }
        int i7 = Build.VERSION.SDK_INT;
        Object objB2 = t8.z.f12851a;
        if (i7 < 29) {
            try {
                wifiManager.setWifiEnabled(z10);
            } catch (Throwable th) {
                objB2 = t8.a.b(th);
            }
            Throwable thA = t8.m.a(objB2);
            if (thA != null) {
                hc.c cVar = n8.c.f8897a;
                n8.c.j(0, (z10 ? "打开" : "关闭").concat("失败"));
                Logger.INSTANCE.e("CarLife_Vehicle", ob.a.q("【WiFi开关】Android9- 直接开关失败: ", thA.getMessage()));
                return;
            }
            return;
        }
        try {
            Method declaredMethod = wifiManager.getClass().getDeclaredMethod("setWifiEnabled", Boolean.TYPE);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(wifiManager, Boolean.valueOf(z10));
            hc.c cVar2 = n8.c.f8897a;
            n8.c.j(0, "调用隐藏 API");
            objB = Boolean.TRUE;
        } catch (Throwable th2) {
            objB = t8.a.b(th2);
        }
        Throwable thA2 = t8.m.a(objB);
        if (thA2 != null) {
            hc.c cVar3 = n8.c.f8897a;
            n8.c.j(0, "隐藏 API 调用失败");
            Logger.INSTANCE.e("CarLife_Vehicle", ob.a.q("【WiFi开关】隐藏 API 调用失败: ", thA2.getMessage()));
            objB = Boolean.FALSE;
        }
        if (((Boolean) objB).booleanValue()) {
            return;
        }
        try {
            Intent intent = new Intent("android.settings.panel.action.WIFI");
            intent.setFlags(268435456);
            n8.a.b().startActivity(intent);
            hc.c cVar4 = n8.c.f8897a;
            n8.c.j(0, "打开 Wi-Fi 设置页");
        } catch (Throwable th3) {
            objB2 = t8.a.b(th3);
        }
        Throwable thA3 = t8.m.a(objB2);
        if (thA3 != null) {
            hc.c cVar5 = n8.c.f8897a;
            n8.c.j(0, "无法跳转 Wi-Fi 设置页");
            Logger.INSTANCE.e("CarLife_Vehicle", ob.a.q("【WiFi开关】无法跳转 Wi-Fi 设置页: ", thA3.getMessage()));
        }
    }

    @Override // b8.h2
    public final void a() {
        hc.c cVar = n8.c.f8897a;
        n8.c.d(new c1(this, null, 2));
    }

    @Override // b8.h2
    public final String b() {
        return "WiFi开关";
    }

    @Override // b8.h2
    public final void c(boolean z10, h9.a aVar, h9.k kVar, f1.s sVar, int i7) {
        i9.l.e(aVar, "onDismissRequest");
        i9.l.e(kVar, "onConfigured");
        sVar.Y(-1016279559);
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
            l8.n.a(z10, null, 0L, false, 0, null, n1.h.e(196330272, new o(aVar, 7), sVar), n1.h.e(-765294943, new k0(5, this, b1Var), sVar), n1.h.e(-1726920158, new a1(kVar, this, b1Var, 5), sVar), n1.h.e(-335946896, new w(b1Var, 15), sVar), sVar, (i10 & 14) | 918552576, 126);
        }
        f1.w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new i(this, z10, aVar, kVar, i7, 11);
        }
    }

    @Override // b8.h2
    public final String getName() {
        return "Wifi";
    }

    @Override // b8.h2
    public final g2 getType() {
        return this.f124a;
    }
}
