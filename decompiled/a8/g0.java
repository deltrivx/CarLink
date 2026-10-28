package a8;

import b8.g2;
import b8.h2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class g0 implements h2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g2 f127a = g2.f1594b;

    @Override // b8.h2
    public final void a() {
        hc.c cVar = n8.c.f8897a;
        n8.c.d(new c0(2, null, 0));
    }

    @Override // b8.h2
    public final String b() {
        return "打开应用";
    }

    @Override // b8.h2
    public final void c(boolean z10, h9.a aVar, h9.k kVar, f1.s sVar, int i7) {
        i9.l.e(aVar, "onDismissRequest");
        i9.l.e(kVar, "onConfigured");
        sVar.Y(-1889805345);
        int i10 = i7 | (sVar.g(z10) ? 4 : 2) | (sVar.h(kVar) ? 256 : 128) | (sVar.f(this) ? 2048 : 1024);
        if ((i10 & 1171) == 1170 && sVar.z()) {
            sVar.Q();
        } else {
            sVar.W(1849434622);
            Object objK = sVar.K();
            f1.w0 w0Var = f1.n.f5051a;
            if (objK == w0Var) {
                objK = f1.b.s("");
                sVar.h0(objK);
            }
            f1.b1 b1Var = (f1.b1) objK;
            Object objC = a2.f.C(sVar, false, 1849434622);
            if (objC == w0Var) {
                objC = f1.b.s("");
                sVar.h0(objC);
            }
            f1.b1 b1Var2 = (f1.b1) objC;
            Object objC2 = a2.f.C(sVar, false, 1849434622);
            if (objC2 == w0Var) {
                objC2 = f1.b.s("");
                sVar.h0(objC2);
            }
            f1.b1 b1Var3 = (f1.b1) objC2;
            sVar.p(false);
            l8.n.a(z10, null, 0L, false, 0, null, n1.h.e(11500102, new o(aVar, 0), sVar), n1.h.e(-1802292601, new q(b1Var, b1Var3, 0), sVar), n1.h.e(678881992, new s(kVar, this, b1Var, b1Var3, b1Var2, 0), sVar), n1.h.e(-1270739306, new v(this, b1Var, b1Var2, b1Var3, 1), sVar), sVar, (i10 & 14) | 918552576, 126);
        }
        f1.w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new i(this, z10, aVar, kVar, i7, 0);
        }
    }

    public final void d(String str, h9.k kVar, f1.s sVar, int i7) {
        i9.l.e(str, "packageName");
        i9.l.e(kVar, "callback");
        sVar.Y(714350839);
        int i10 = i7 | (sVar.f(str) ? 4 : 2) | (sVar.f(this) ? 256 : 128);
        if ((i10 & 147) == 146 && sVar.z()) {
            sVar.Q();
        } else {
            sVar.W(1849434622);
            Object objK = sVar.K();
            f1.w0 w0Var = f1.n.f5051a;
            if (objK == w0Var) {
                objK = f1.b.s(Boolean.FALSE);
                sVar.h0(objK);
            }
            f1.b1 b1Var = (f1.b1) objK;
            Object objC = a2.f.C(sVar, false, 1849434622);
            if (objC == w0Var) {
                objC = f1.b.s(Boolean.FALSE);
                sVar.h0(objC);
            }
            f1.b1 b1Var2 = (f1.b1) objC;
            Object objC2 = a2.f.C(sVar, false, 1849434622);
            if (objC2 == w0Var) {
                objC2 = f1.b.s("");
                sVar.h0(objC2);
            }
            f1.b1 b1Var3 = (f1.b1) objC2;
            sVar.p(false);
            n1.c cVarE = n1.h.e(-1849909266, new w(b1Var3, 0), sVar);
            n1.c cVar = c.f92b;
            sVar.W(-1633490746);
            boolean z10 = (i10 & 14) == 4;
            Object objK2 = sVar.K();
            if (z10 || objK2 == w0Var) {
                objK2 = new j(str, b1Var, 0);
                sVar.h0(objK2);
            }
            sVar.p(false);
            a.a.h(cVarE, cVar, false, (h9.a) objK2, sVar, 438, 0);
            boolean zBooleanValue = ((Boolean) b1Var.getValue()).booleanValue();
            sVar.W(5004770);
            Object objK3 = sVar.K();
            if (objK3 == w0Var) {
                objK3 = new k(b1Var, 0);
                sVar.h0(objK3);
            }
            sVar.p(false);
            l8.n.a(zBooleanValue, (h9.a) objK3, 0L, false, 0, n1.h.e(1284049437, new w(b1Var2, 2), sVar), null, null, null, n1.h.e(-1242151122, new s(this, str, kVar, b1Var2, b1Var3, b1Var), sVar), sVar, 1572912, 956);
        }
        f1.w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new l(this, str, kVar, i7, 0);
        }
    }

    public final void e(h9.n nVar, f1.s sVar, int i7) {
        i9.l.e(nVar, "callback");
        sVar.Y(-1648132782);
        if ((((sVar.f(this) ? 32 : 16) | i7) & 19) == 18 && sVar.z()) {
            sVar.Q();
        } else {
            sVar.W(1849434622);
            Object objK = sVar.K();
            f1.w0 w0Var = f1.n.f5051a;
            if (objK == w0Var) {
                objK = f1.b.s(Boolean.FALSE);
                sVar.h0(objK);
            }
            f1.b1 b1Var = (f1.b1) objK;
            Object objC = a2.f.C(sVar, false, 1849434622);
            if (objC == w0Var) {
                objC = f1.b.s(Boolean.FALSE);
                sVar.h0(objC);
            }
            f1.b1 b1Var2 = (f1.b1) objC;
            Object objC2 = a2.f.C(sVar, false, 1849434622);
            if (objC2 == w0Var) {
                objC2 = f1.b.s("");
                sVar.h0(objC2);
            }
            f1.b1 b1Var3 = (f1.b1) objC2;
            Object objC3 = a2.f.C(sVar, false, 1849434622);
            if (objC3 == w0Var) {
                objC3 = f1.b.s("");
                sVar.h0(objC3);
            }
            f1.b1 b1Var4 = (f1.b1) objC3;
            sVar.p(false);
            n1.c cVarE = n1.h.e(-1359474743, new w(b1Var3, 3), sVar);
            n1.c cVarE2 = n1.h.e(-1166543542, new w(b1Var4, 4), sVar);
            sVar.W(5004770);
            Object objK2 = sVar.K();
            if (objK2 == w0Var) {
                objK2 = new k(b1Var, 1);
                sVar.h0(objK2);
            }
            sVar.p(false);
            a.a.h(cVarE, cVarE2, false, (h9.a) objK2, sVar, 3126, 4);
            boolean zBooleanValue = ((Boolean) b1Var.getValue()).booleanValue();
            sVar.W(5004770);
            Object objK3 = sVar.K();
            if (objK3 == w0Var) {
                objK3 = new k(b1Var, 2);
                sVar.h0(objK3);
            }
            sVar.p(false);
            l8.n.a(zBooleanValue, (h9.a) objK3, 0L, false, 0, n1.h.e(-1120474760, new w(b1Var2, 6), sVar), null, null, null, n1.h.e(1453807369, new a0(this, nVar, b1Var2, b1Var3, b1Var4, b1Var, 0), sVar), sVar, 1572912, 956);
        }
        f1.w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new m(i7, 0, this, nVar);
        }
    }

    @Override // b8.h2
    public final String getName() {
        return "AppOpen";
    }

    @Override // b8.h2
    public final g2 getType() {
        return this.f127a;
    }
}
