package a8;

import b8.g2;
import b8.h2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class l1 implements h2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g2 f168a = g2.f1594b;

    @Override // b8.h2
    public final void a() {
        hc.c cVar = n8.c.f8897a;
        n8.c.d(new c0(2, null, 4));
    }

    @Override // b8.h2
    public final String b() {
        return "热点开关";
    }

    @Override // b8.h2
    public final void c(boolean z10, h9.a aVar, h9.k kVar, f1.s sVar, int i7) {
        i9.l.e(aVar, "onDismissRequest");
        i9.l.e(kVar, "onConfigured");
        sVar.Y(-700215457);
        int i10 = i7 | (sVar.g(z10) ? 4 : 2) | (sVar.h(kVar) ? 256 : 128) | (sVar.f(this) ? 2048 : 1024);
        if ((i10 & 1171) == 1170 && sVar.z()) {
            sVar.Q();
        } else {
            sVar.W(1849434622);
            Object objK = sVar.K();
            f1.w0 w0Var = f1.n.f5051a;
            if (objK == w0Var) {
                objK = f1.b.s(Boolean.TRUE);
                sVar.h0(objK);
            }
            f1.b1 b1Var = (f1.b1) objK;
            Object objC = a2.f.C(sVar, false, 1849434622);
            if (objC == w0Var) {
                objC = f1.b.s("MyHotspot");
                sVar.h0(objC);
            }
            f1.b1 b1Var2 = (f1.b1) objC;
            Object objC2 = a2.f.C(sVar, false, 1849434622);
            if (objC2 == w0Var) {
                objC2 = f1.b.s("12345678");
                sVar.h0(objC2);
            }
            f1.b1 b1Var3 = (f1.b1) objC2;
            sVar.p(false);
            l8.n.a(z10, null, 0L, false, 0, null, n1.h.e(1201089990, new o(aVar, 4), sVar), n1.h.e(-612702713, new k1(0, b1Var2, b1Var3, b1Var), sVar), n1.h.e(1868471880, new s(kVar, this, b1Var2, b1Var3, b1Var, 4), sVar), n1.h.e(-81149418, new k1(2, b1Var, b1Var2, b1Var3), sVar), sVar, (i10 & 14) | 918552576, 126);
        }
        f1.w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new i(this, z10, aVar, kVar, i7, 6);
        }
    }

    @Override // b8.h2
    public final String getName() {
        return "Hotspot";
    }

    @Override // b8.h2
    public final g2 getType() {
        return this.f168a;
    }
}
