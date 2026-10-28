package c1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class n0 {
    static {
        new f1.v0(x.f2277g);
    }

    public static final void a(w wVar, k1 k1Var, y2 y2Var, n1.c cVar, f1.s sVar, int i7) {
        int i10;
        sVar.Y(-2127166334);
        if ((i7 & 6) == 0) {
            i10 = (sVar.f(wVar) ? 4 : 2) | i7;
        } else {
            i10 = i7;
        }
        if ((i7 & 48) == 0) {
            i10 |= 16;
        }
        if ((i7 & 384) == 0) {
            i10 |= sVar.f(y2Var) ? 256 : 128;
        }
        if ((i7 & 3072) == 0) {
            i10 |= sVar.h(cVar) ? 2048 : 1024;
        }
        if ((i10 & 1171) == 1170 && sVar.z()) {
            sVar.Q();
        } else {
            sVar.S();
            if ((i7 & 1) == 0 || sVar.x()) {
                k1Var = (k1) sVar.j(l1.f1979a);
            } else {
                sVar.Q();
            }
            sVar.q();
            x.n0 n0VarA = h1.a(0.0f, sVar, 0, 7);
            long j5 = wVar.f2225a;
            boolean zE = sVar.e(j5);
            Object objK = sVar.K();
            if (zE || objK == f1.n.f5051a) {
                objK = new w0.y1(j5, y1.q.b(0.4f, j5));
                sVar.h0(objK);
            }
            f1.b.b(new f1.u1[]{y.f2319a.a(wVar), androidx.compose.foundation.c.f779a.a(n0VarA), b1.o.f1173a.a(z.f2361a), l1.f1979a.a(k1Var), w0.z1.f14024a.a((w0.y1) objK), z2.f2365a.a(y2Var)}, n1.h.e(-1066563262, new h(1, y2Var, cVar), sVar), sVar, 56);
        }
        k1 k1Var2 = k1Var;
        f1.w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new m0(wVar, k1Var2, y2Var, cVar, i7);
        }
    }
}
