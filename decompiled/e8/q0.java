package e8;

import b8.g2;
import b8.h2;
import f1.w1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class q0 implements h2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g2 f4606a = g2.f1593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d8.f f4607b;

    @Override // b8.h2
    public final void a() {
        hc.c cVar = n8.c.f8897a;
        y8.c cVar2 = null;
        n8.c.d(new p0(this, cVar2, 0));
        n8.c.d(new p0(this, cVar2, 1));
    }

    @Override // b8.h2
    public final String b() {
        return "德赛西威";
    }

    @Override // b8.h2
    public final void c(boolean z10, h9.a aVar, h9.k kVar, f1.s sVar, int i7) {
        i9.l.e(aVar, "onDismissRequest");
        i9.l.e(kVar, "onConfigured");
        sVar.Y(-41251023);
        int i10 = i7 | (sVar.g(z10) ? 4 : 2) | (sVar.h(kVar) ? 256 : 128) | (sVar.h(this) ? 2048 : 1024);
        if ((i10 & 1171) == 1170 && sVar.z()) {
            sVar.Q();
        } else {
            d8.f fVar = new d8.f();
            if (!z10) {
                fVar.b();
            }
            sVar.W(5004770);
            Object objK = sVar.K();
            if (objK == f1.n.f5051a) {
                objK = new a8.n(aVar, 19);
                sVar.h0(objK);
            }
            sVar.p(false);
            l8.n.a(z10, (h9.a) objK, 0L, false, 0, n1.h.e(439536331, new m0(fVar, 2), sVar), null, null, null, n1.h.e(-563269670, new a8.k0(10, kVar, this), sVar), sVar, (i10 & 14) | 1572864, 956);
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new a8.i(this, z10, aVar, kVar, i7, 18);
        }
    }

    @Override // b8.h2
    public final String getName() {
        return "Desay";
    }

    @Override // b8.h2
    public final g2 getType() {
        return this.f4606a;
    }
}
