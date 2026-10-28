package a8;

import b8.g2;
import b8.h2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class x0 implements h2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g2 f276a = g2.f1594b;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n8.q f277b = new n8.q("audio", ".mp3,.wav,.aac,.flac");

    public static final void f(f1.b1 b1Var, boolean z10) {
        b1Var.setValue(Boolean.valueOf(z10));
    }

    @Override // b8.h2
    public final void a() {
        hc.c cVar = n8.c.f8897a;
        n8.c.d(new c0(2, null, 2));
    }

    @Override // b8.h2
    public final String b() {
        return "播放音频";
    }

    @Override // b8.h2
    public final void c(boolean z10, h9.a aVar, h9.k kVar, f1.s sVar, int i7) {
        i9.l.e(aVar, "onDismissRequest");
        i9.l.e(kVar, "onConfigured");
        sVar.Y(1332756095);
        int i10 = i7 | (sVar.g(z10) ? 4 : 2) | (sVar.h(kVar) ? 256 : 128) | (sVar.h(this) ? 2048 : 1024);
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
                objC = f1.b.s(Boolean.FALSE);
                sVar.h0(objC);
            }
            f1.b1 b1Var2 = (f1.b1) objC;
            Object objC2 = a2.f.C(sVar, false, 1849434622);
            if (objC2 == w0Var) {
                objC2 = f1.b.s(Boolean.FALSE);
                sVar.h0(objC2);
            }
            f1.b1 b1Var3 = (f1.b1) objC2;
            Object objC3 = a2.f.C(sVar, false, 1849434622);
            if (objC3 == w0Var) {
                objC3 = new f1.h1(1);
                sVar.h0(objC3);
            }
            f1.h1 h1Var = (f1.h1) objC3;
            sVar.p(false);
            l8.n.a(z10, null, 0L, false, 0, null, n1.h.e(1017718886, new o(aVar, 1), sVar), n1.h.e(132983079, new w(b1Var2, 7), sVar), n1.h.e(-751752728, new s(kVar, this, b1Var, b1Var3, h1Var, 2), sVar), n1.h.e(-623745866, new s0(this, b1Var2, b1Var, b1Var3, h1Var, 1), sVar), sVar, (i10 & 14) | 918552576, 126);
        }
        f1.w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new i(this, z10, aVar, kVar, i7, 2);
        }
    }

    public final void d(String str, h9.n nVar, f1.s sVar, int i7) {
        i9.l.e(str, "fileName");
        i9.l.e(nVar, "callback");
        sVar.Y(1657704197);
        int i10 = i7 | (sVar.f(str) ? 4 : 2);
        if ((i10 & 19) == 18 && sVar.z()) {
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
                objC = new f1.h1(1);
                sVar.h0(objC);
            }
            f1.h1 h1Var = (f1.h1) objC;
            Object objC2 = a2.f.C(sVar, false, 1849434622);
            if (objC2 == w0Var) {
                objC2 = f1.b.s(Boolean.FALSE);
                sVar.h0(objC2);
            }
            f1.b1 b1Var2 = (f1.b1) objC2;
            sVar.p(false);
            n1.c cVar = e.f109b;
            n1.c cVarE = n1.h.e(800105725, new n0(b1Var, h1Var, 0), sVar);
            sVar.W(-1633490746);
            boolean z10 = (i10 & 14) == 4;
            Object objK2 = sVar.K();
            if (z10 || objK2 == w0Var) {
                objK2 = new j(str, b1Var2, 1);
                sVar.h0(objK2);
            }
            sVar.p(false);
            a.a.h(cVar, cVarE, false, (h9.a) objK2, sVar, 438, 0);
            Boolean bool = (Boolean) b1Var2.getValue();
            bool.booleanValue();
            sVar.W(5004770);
            Object objK3 = sVar.K();
            if (objK3 == w0Var) {
                objK3 = new o0(b1Var2, null, 0);
                sVar.h0(objK3);
            }
            sVar.p(false);
            f1.b.f(sVar, (h9.n) objK3, bool);
            boolean zBooleanValue = ((Boolean) b1Var2.getValue()).booleanValue();
            sVar.W(5004770);
            Object objK4 = sVar.K();
            if (objK4 == w0Var) {
                objK4 = new k(b1Var2, 3);
                sVar.h0(objK4);
            }
            sVar.p(false);
            l8.n.a(zBooleanValue, (h9.a) objK4, 0L, false, 0, null, null, null, null, n1.h.e(-1820628356, new q0(nVar, str, b1Var, h1Var, 1), sVar), sVar, 48, 1020);
        }
        f1.w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new l(this, str, nVar, i7, 1);
        }
    }

    public final void e(n8.q qVar, h9.n nVar, f1.s sVar, int i7) {
        i9.l.e(qVar, "httpService");
        i9.l.e(nVar, "callback");
        sVar.Y(-886184817);
        if (((i7 | (sVar.h(qVar) ? 4 : 2)) & 19) == 18 && sVar.z()) {
            sVar.Q();
        } else {
            sVar.W(1849434622);
            Object objK = sVar.K();
            Object obj = f1.n.f5051a;
            if (objK == obj) {
                objK = f1.b.s(qVar.i());
                sVar.h0(objK);
            }
            f1.b1 b1Var = (f1.b1) objK;
            Object objC = a2.f.C(sVar, false, 1849434622);
            if (objC == obj) {
                objC = f1.b.s("");
                sVar.h0(objC);
            }
            f1.b1 b1Var2 = (f1.b1) objC;
            Object objC2 = a2.f.C(sVar, false, 1849434622);
            if (objC2 == obj) {
                objC2 = f1.b.s(Boolean.FALSE);
                sVar.h0(objC2);
            }
            f1.b1 b1Var3 = (f1.b1) objC2;
            sVar.p(false);
            f1.b1 b1VarK = f1.b.k(n8.q.f8931l, sVar);
            String str = (String) b1VarK.getValue();
            sVar.W(-1224400529);
            boolean zF = sVar.f(b1VarK) | sVar.h(qVar);
            Object objK2 = sVar.K();
            if (zF || objK2 == obj) {
                Object t0Var = new t0(qVar, b1VarK, b1Var, b1Var2, b1Var3, null);
                sVar.h0(t0Var);
                objK2 = t0Var;
            }
            sVar.p(false);
            f1.b.f(sVar, (h9.n) objK2, str);
            n1.c cVar = e.f108a;
            n1.c cVarE = n1.h.e(-1935393145, new w(b1Var2, 8), sVar);
            sVar.W(-1224400529);
            Object objK3 = sVar.K();
            if (objK3 == obj) {
                objK3 = new m0(nVar, b1Var, b1Var2, b1Var3, 0);
                sVar.h0(objK3);
            }
            sVar.p(false);
            a.a.h(cVar, cVarE, false, (h9.a) objK3, sVar, 54, 4);
            boolean zBooleanValue = ((Boolean) b1Var3.getValue()).booleanValue();
            sVar.W(5004770);
            Object objK4 = sVar.K();
            if (objK4 == obj) {
                objK4 = new k(b1Var3, 4);
                sVar.h0(objK4);
            }
            sVar.p(false);
            l8.n.a(zBooleanValue, (h9.a) objK4, 0L, false, 0, null, null, null, null, n1.h.e(-629003130, new s(nVar, b1Var, qVar, b1Var3, b1Var2, 3), sVar), sVar, 48, 1020);
        }
        f1.w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new l(this, qVar, nVar, i7, 2);
        }
    }

    @Override // b8.h2
    public final String getName() {
        return "Audio";
    }

    @Override // b8.h2
    public final g2 getType() {
        return this.f276a;
    }
}
