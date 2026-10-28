package e8;

import b8.g2;
import b8.h2;
import f1.w1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class y0 implements h2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g2 f4659a = g2.f1593a;

    @Override // b8.h2
    public final void a() {
        hc.c cVar = n8.c.f8897a;
        n8.c.d(new a8.c0(2, null, 12));
    }

    @Override // b8.h2
    public final String b() {
        return "系统日志";
    }

    @Override // b8.h2
    public final void c(boolean z10, h9.a aVar, h9.k kVar, f1.s sVar, int i7) {
        i9.l.e(aVar, "onDismissRequest");
        i9.l.e(kVar, "onConfigured");
        sVar.Y(-396723563);
        int i10 = i7 | (sVar.g(z10) ? 4 : 2) | (sVar.h(kVar) ? 256 : 128) | (sVar.f(this) ? 2048 : 1024);
        if ((i10 & 1171) == 1170 && sVar.z()) {
            sVar.Q();
        } else {
            sVar.W(1849434622);
            Object objK = sVar.K();
            Object obj = f1.n.f5051a;
            if (objK == obj) {
                objK = f1.b.s(Boolean.TRUE);
                sVar.h0(objK);
            }
            f1.b1 b1Var = (f1.b1) objK;
            Object objC = a2.f.C(sVar, false, 1849434622);
            if (objC == obj) {
                objC = f1.b.s("keycode");
                sVar.h0(objC);
            }
            f1.b1 b1Var2 = (f1.b1) objC;
            Object objC2 = a2.f.C(sVar, false, 1849434622);
            if (objC2 == obj) {
                objC2 = f1.b.s("");
                sVar.h0(objC2);
            }
            f1.b1 b1Var3 = (f1.b1) objC2;
            Object objC3 = a2.f.C(sVar, false, 1849434622);
            if (objC3 == obj) {
                objC3 = f1.b.s(Boolean.FALSE);
                sVar.h0(objC3);
            }
            f1.b1 b1Var4 = (f1.b1) objC3;
            sVar.p(false);
            n8.s sVar2 = new n8.s();
            Boolean boolValueOf = Boolean.valueOf(z10);
            sVar.W(-1224400529);
            int i11 = i10 & 14;
            boolean zH = (i11 == 4) | sVar.h(sVar2);
            Object objK2 = sVar.K();
            if (zH || objK2 == obj) {
                Object u0Var = new u0(z10, sVar2, b1Var2, b1Var, b1Var3, null);
                sVar.h0(u0Var);
                objK2 = u0Var;
            }
            sVar.p(false);
            f1.b.f(sVar, (h9.n) objK2, boolValueOf);
            l8.n.a(z10, null, 0L, false, 0, null, n1.h.e(-1585796850, new a8.o(aVar, 13), sVar), null, n1.h.e(1923172556, new a8.s(kVar, this, b1Var3, b1Var2, b1Var, 7), sVar), n1.h.e(1614454462, new v0(b1Var3, b1Var2, b1Var4, b1Var, 1), sVar), sVar, i11 | 817889280, 382);
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new a8.i(this, z10, aVar, kVar, i7, 20);
        }
    }

    @Override // b8.h2
    public final String getName() {
        return "LogLine";
    }

    @Override // b8.h2
    public final g2 getType() {
        return this.f4659a;
    }
}
