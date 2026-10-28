package m8;

import b3.r0;
import c1.n0;
import c1.w;
import c1.y;
import c1.y2;
import f1.s;
import f1.w1;
import l0.p;
import n1.c;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w f8611a = y.b(a.f8605a, 0, 0, 0, 0, a.f8606b, 0, 0, 0, a.f8607c, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -546, 15);

    static {
        y.d(a.f8608d, 0L, 0L, 0L, 0L, a.f8609e, 0L, 0L, 0L, a.f8610f, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -546, 15);
    }

    public static final void a(boolean z10, c cVar, s sVar, int i7) {
        boolean z11;
        sVar.Y(-928319264);
        if (((i7 | 54) & 147) == 146 && sVar.z()) {
            sVar.Q();
            z11 = z10;
        } else {
            sVar.W(1238393625);
            sVar.p(false);
            n0.a(f8611a, null, new y2(new r0(0L, 0L, null, 0L, 0, 0L, 16777183), 32255), cVar, sVar, 3072);
            z11 = true;
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new p(z11, cVar, i7);
        }
    }
}
