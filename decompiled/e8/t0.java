package e8;

import b8.g2;
import b8.h2;
import f1.w1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class t0 implements h2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g2 f4624a = g2.f1593a;

    @Override // b8.h2
    public final void a() {
    }

    @Override // b8.h2
    public final String b() {
        return "物理按键";
    }

    @Override // b8.h2
    public final void c(boolean z10, h9.a aVar, h9.k kVar, f1.s sVar, int i7) {
        i9.l.e(aVar, "onDismissRequest");
        i9.l.e(kVar, "onConfigured");
        sVar.Y(-702016531);
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
                objC = new f1.h1(0);
                sVar.h0(objC);
            }
            f1.h1 h1Var = (f1.h1) objC;
            Object objC2 = a2.f.C(sVar, false, 1849434622);
            if (objC2 == w0Var) {
                objC2 = f1.b.s(Boolean.TRUE);
                sVar.h0(objC2);
            }
            f1.b1 b1Var2 = (f1.b1) objC2;
            Object objC3 = a2.f.C(sVar, false, 1849434622);
            if (objC3 == w0Var) {
                objC3 = new w1.o();
                sVar.h0(objC3);
            }
            w1.o oVar = (w1.o) objC3;
            Object objC4 = a2.f.C(sVar, false, 1849434622);
            if (objC4 == w0Var) {
                objC4 = f1.b.s(Boolean.FALSE);
                sVar.h0(objC4);
            }
            sVar.p(false);
            l8.n.a(z10, null, 0L, false, 0, null, n1.h.e(-940144602, new a8.o(aVar, 12), sVar), null, n1.h.e(-369872796, new a8.s(kVar, this, b1Var, h1Var, b1Var2), sVar), n1.h.e(-695217706, new s0(oVar, b1Var, (f1.b1) objC4, h1Var, b1Var2, 1), sVar), sVar, (i10 & 14) | 817889280, 382);
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new a8.i(this, z10, aVar, kVar, i7, 19);
        }
    }

    @Override // b8.h2
    public final String getName() {
        return "KeyBoard";
    }

    @Override // b8.h2
    public final g2 getType() {
        return this.f4624a;
    }
}
