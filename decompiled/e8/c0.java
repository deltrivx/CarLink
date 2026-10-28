package e8;

import b8.g2;
import b8.h2;
import f1.w1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c0 implements h2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g2 f4496a = g2.f1593a;

    @Override // b8.h2
    public final void a() {
    }

    @Override // b8.h2
    public final String b() {
        return "系统启动";
    }

    @Override // b8.h2
    public final void c(boolean z10, h9.a aVar, h9.k kVar, f1.s sVar, int i7) {
        i9.l.e(aVar, "onDismissRequest");
        i9.l.e(kVar, "onConfigured");
        sVar.Y(-793203251);
        int i10 = i7 | (sVar.g(z10) ? 4 : 2) | (sVar.h(kVar) ? 256 : 128) | (sVar.f(this) ? 2048 : 1024);
        if ((i10 & 1171) == 1170 && sVar.z()) {
            sVar.Q();
        } else {
            l8.n.a(z10, null, 0L, false, 0, null, n1.h.e(-1219007738, new a8.o(aVar, 10), sVar), null, n1.h.e(-1830276796, new a8.k0(8, kVar, this), sVar), d.f4503b, sVar, (i10 & 14) | 817889280, 382);
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new a8.i(this, z10, aVar, kVar, i7, 15);
        }
    }

    @Override // b8.h2
    public final String getName() {
        return "Boot";
    }

    @Override // b8.h2
    public final g2 getType() {
        return this.f4496a;
    }
}
