package a8;

import b8.g2;
import b8.h2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class i1 implements h2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g2 f144a = g2.f1594b;

    @Override // b8.h2
    public final void a() {
    }

    @Override // b8.h2
    public final String b() {
        return "延迟执行";
    }

    @Override // b8.h2
    public final void c(boolean z10, h9.a aVar, h9.k kVar, f1.s sVar, int i7) {
        i9.l.e(aVar, "onDismissRequest");
        i9.l.e(kVar, "onConfigured");
        sVar.Y(-975673569);
        int i10 = i7 | (sVar.g(z10) ? 4 : 2) | (sVar.h(kVar) ? 256 : 128) | (sVar.f(this) ? 2048 : 1024);
        if ((i10 & 1171) == 1170 && sVar.z()) {
            sVar.Q();
        } else {
            sVar.W(1849434622);
            Object objK = sVar.K();
            if (objK == f1.n.f5051a) {
                objK = new f1.h1(1);
                sVar.h0(objK);
            }
            f1.h1 h1Var = (f1.h1) objK;
            sVar.p(false);
            l8.n.a(z10, null, 0L, false, 0, null, n1.h.e(-1290710778, new o(aVar, 3), sVar), null, n1.h.e(1234784904, new a1(kVar, this, h1Var, 1), sVar), n1.h.e(1362791766, new h1(h1Var, 3), sVar), sVar, (i10 & 14) | 817889280, 382);
        }
        f1.w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new i(this, z10, aVar, kVar, i7, 5);
        }
    }

    @Override // b8.h2
    public final String getName() {
        return "Delay";
    }

    @Override // b8.h2
    public final g2 getType() {
        return this.f144a;
    }
}
