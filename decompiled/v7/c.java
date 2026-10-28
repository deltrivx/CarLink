package v7;

import a8.k0;
import android.view.View;
import f1.b1;
import f1.n;
import f1.s;
import f1.w0;
import f1.w1;
import l8.f0;
import r2.n0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f13637a = new c();

    public final void a(int i7, s sVar) {
        sVar.Y(1292331051);
        if ((i7 & 1) == 0 && sVar.z()) {
            sVar.Q();
        } else {
            View view = (View) sVar.j(n0.f11347f);
            b1 b1VarK = f1.b.k(g.f13647d, sVar);
            sVar.W(1849434622);
            Object objK = sVar.K();
            w0 w0Var = n.f5051a;
            if (objK == w0Var) {
                objK = f1.b.s(f.Settings);
                sVar.h0(objK);
            }
            b1 b1Var = (b1) objK;
            sVar.p(false);
            boolean z10 = ((g) b1VarK.getValue()).f13649b;
            sVar.W(1849434622);
            Object objK2 = sVar.K();
            if (objK2 == w0Var) {
                objK2 = new n8.f(27);
                sVar.h0(objK2);
            }
            sVar.p(false);
            l8.n.a(z10, (h9.a) objK2, 0L, false, 0, n1.h.e(1417284933, new k0(23, view, b1Var), sVar), null, null, null, n1.h.e(-1245682028, new f0(b1Var, 4), sVar), sVar, 1572912, 956);
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new b3.a(i7, 22, this);
        }
    }
}
