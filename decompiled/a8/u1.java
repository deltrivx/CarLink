package a8;

import b8.g2;
import b8.h2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class u1 implements h2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g2 f253a = g2.f1594b;

    @Override // b8.h2
    public final void a() {
        hc.c cVar = n8.c.f8897a;
        n8.c.d(new c0(2, null, 7));
        n8.c.d(new c0(2, null, 8));
    }

    @Override // b8.h2
    public final String b() {
        return "互联主题";
    }

    @Override // b8.h2
    public final void c(boolean z10, h9.a aVar, h9.k kVar, f1.s sVar, int i7) {
        i9.l.e(aVar, "onDismissRequest");
        i9.l.e(kVar, "onConfigured");
        sVar.Y(-1632409121);
        int i10 = i7 | (sVar.g(z10) ? 4 : 2) | (sVar.h(kVar) ? 256 : 128) | (sVar.f(this) ? 2048 : 1024);
        if ((i10 & 1171) == 1170 && sVar.z()) {
            sVar.Q();
        } else {
            sVar.W(5004770);
            Object objK = sVar.K();
            if (objK == f1.n.f5051a) {
                objK = new n(aVar, 9);
                sVar.h0(objK);
            }
            sVar.p(false);
            l8.n.a(z10, (h9.a) objK, 0L, false, 0, null, null, null, null, n1.h.e(706056214, new k0(4, kVar, this), sVar), sVar, i10 & 14, 1020);
        }
        f1.w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new i(this, z10, aVar, kVar, i7, 9);
        }
    }

    @Override // b8.h2
    public final String getName() {
        return "Theme";
    }

    @Override // b8.h2
    public final g2 getType() {
        return this.f253a;
    }
}
