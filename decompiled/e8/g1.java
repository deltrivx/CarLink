package e8;

import android.content.ComponentCallbacks;
import android.content.res.Configuration;
import b8.g2;
import b8.h2;
import b8.p1;
import com.baidu.carlife.sdk.util.Logger;
import f1.w1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class g1 implements h2, ComponentCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g2 f4547a = g2.f1593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f4548b;

    @Override // b8.h2
    public final void a() {
        hc.c cVar = n8.c.f8897a;
        n8.c.d(new a8.c1(this, null, 13));
    }

    @Override // b8.h2
    public final String b() {
        return "系统主题";
    }

    @Override // b8.h2
    public final void c(boolean z10, h9.a aVar, h9.k kVar, f1.s sVar, int i7) {
        i9.l.e(aVar, "onDismissRequest");
        i9.l.e(kVar, "onConfigured");
        sVar.Y(-1459432083);
        int i10 = i7 | (sVar.g(z10) ? 4 : 2) | (sVar.h(kVar) ? 256 : 128) | (sVar.h(this) ? 2048 : 1024);
        if ((i10 & 1171) == 1170 && sVar.z()) {
            sVar.Q();
        } else {
            sVar.W(5004770);
            Object objK = sVar.K();
            if (objK == f1.n.f5051a) {
                objK = new a8.n(aVar, 25);
                sVar.h0(objK);
            }
            sVar.p(false);
            l8.n.a(z10, (h9.a) objK, 0L, false, 0, i.f4560d, null, null, null, n1.h.e(-1452633258, new a8.k0(12, kVar, this), sVar), sVar, (i10 & 14) | 1572864, 956);
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new a8.i(this, z10, aVar, kVar, i7, 24);
        }
    }

    public final synchronized void d() {
        try {
            if (!this.f4548b) {
                n8.a.b().registerComponentCallbacks(this);
                this.f4548b = true;
                Configuration configuration = n8.a.b().getResources().getConfiguration();
                i9.l.d(configuration, "getConfiguration(...)");
                onConfigurationChanged(configuration);
            }
        } catch (Exception e7) {
            Logger.INSTANCE.d("CarLife_Vehicle", "【系统主题】注册异常: " + e7.getMessage());
        }
    }

    @Override // b8.h2
    public final String getName() {
        return "System";
    }

    @Override // b8.h2
    public final g2 getType() {
        return this.f4547a;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        int i7;
        i9.l.e(configuration, "newConfig");
        int i10 = configuration.uiMode & 48;
        if (i10 == 16) {
            i7 = 0;
        } else if (i10 != 32) {
            return;
        } else {
            i7 = 1;
        }
        hc.c cVar = d8.v.f3842a;
        d8.v.a(new p1(i7));
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        Logger.INSTANCE.d("CarLife_Vehicle", "【系统主题】内存不足警告");
    }
}
