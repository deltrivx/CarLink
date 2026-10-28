package d1;

import b3.r0;
import b3.x;
import b3.z;
import c1.a0;
import c1.u2;
import f1.c0;
import f1.u1;
import f1.w1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z f3688a = new z(null, new x());

    public static final void a(long j5, r0 r0Var, h9.n nVar, f1.s sVar, int i7) {
        int i10;
        sVar.Y(-716124955);
        if ((i7 & 6) == 0) {
            i10 = (sVar.e(j5) ? 4 : 2) | i7;
        } else {
            i10 = i7;
        }
        if ((i7 & 48) == 0) {
            i10 |= sVar.f(r0Var) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i10 |= sVar.h(nVar) ? 256 : 128;
        }
        if ((i10 & 147) == 146 && sVar.z()) {
            sVar.Q();
        } else {
            c0 c0Var = u2.f2203a;
            f1.b.b(new u1[]{a0.f1805a.a(new y1.q(j5)), c0Var.a(((r0) sVar.j(c0Var)).d(r0Var))}, nVar, sVar, ((i10 >> 3) & 112) | 8);
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new h(j5, r0Var, nVar, i7, 0);
        }
    }
}
