package d0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class j extends r1.o implements q2.x {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f3578o;

    public final long A0(long j5, boolean z10) {
        int iRound;
        int iG = n3.a.g(j5);
        if (iG == Integer.MAX_VALUE || (iRound = Math.round(iG * this.f3578o)) <= 0) {
            return 0L;
        }
        if (!z10 || androidx.compose.foundation.layout.a.e(iRound, iG, j5)) {
            return (((long) iRound) << 32) | (((long) iG) & 4294967295L);
        }
        return 0L;
    }

    public final long B0(long j5, boolean z10) {
        int iRound;
        int iH = n3.a.h(j5);
        if (iH == Integer.MAX_VALUE || (iRound = Math.round(iH / this.f3578o)) <= 0) {
            return 0L;
        }
        if (!z10 || androidx.compose.foundation.layout.a.e(iH, iRound, j5)) {
            return (((long) iH) << 32) | (((long) iRound) & 4294967295L);
        }
        return 0L;
    }

    public final long C0(long j5, boolean z10) {
        int i7 = n3.a.i(j5);
        int iRound = Math.round(i7 * this.f3578o);
        if (iRound <= 0) {
            return 0L;
        }
        if (!z10 || androidx.compose.foundation.layout.a.e(iRound, i7, j5)) {
            return (((long) iRound) << 32) | (((long) i7) & 4294967295L);
        }
        return 0L;
    }

    public final long D0(long j5, boolean z10) {
        int iJ = n3.a.j(j5);
        int iRound = Math.round(iJ / this.f3578o);
        if (iRound <= 0) {
            return 0L;
        }
        if (!z10 || androidx.compose.foundation.layout.a.e(iJ, iRound, j5)) {
            return (((long) iJ) << 32) | (((long) iRound) & 4294967295L);
        }
        return 0L;
    }

    @Override // q2.x
    public final o2.n0 b(o2.o0 o0Var, o2.l0 l0Var, long j5) {
        long jB0 = B0(j5, true);
        if (n3.m.a(jB0, 0L)) {
            jB0 = A0(j5, true);
            if (n3.m.a(jB0, 0L)) {
                jB0 = D0(j5, true);
                if (n3.m.a(jB0, 0L)) {
                    jB0 = C0(j5, true);
                    if (n3.m.a(jB0, 0L)) {
                        jB0 = B0(j5, false);
                        if (n3.m.a(jB0, 0L)) {
                            jB0 = A0(j5, false);
                            if (n3.m.a(jB0, 0L)) {
                                jB0 = D0(j5, false);
                                if (n3.m.a(jB0, 0L)) {
                                    jB0 = C0(j5, false);
                                    if (n3.m.a(jB0, 0L)) {
                                        jB0 = 0;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!n3.m.a(jB0, 0L)) {
            int i7 = (int) (jB0 >> 32);
            int i10 = (int) (jB0 & 4294967295L);
            if (!((i10 >= 0) & (i7 >= 0))) {
                n3.i.a("width and height must be >= 0");
            }
            j5 = n3.b.h(i7, i7, i10, i10);
        }
        o2.v0 v0VarU = l0Var.u(j5);
        return o0Var.i(v0VarU.f9435a, v0VarU.f9436b, u8.x.f13123a, new i(v0VarU, 0));
    }

    @Override // q2.x
    public final int c(q2.p0 p0Var, o2.l0 l0Var, int i7) {
        return i7 != Integer.MAX_VALUE ? Math.round(i7 * this.f3578o) : l0Var.m(i7);
    }

    @Override // q2.x
    public final int d(q2.p0 p0Var, o2.l0 l0Var, int i7) {
        return i7 != Integer.MAX_VALUE ? Math.round(i7 / this.f3578o) : l0Var.H(i7);
    }

    @Override // q2.x
    public final int e(q2.p0 p0Var, o2.l0 l0Var, int i7) {
        return i7 != Integer.MAX_VALUE ? Math.round(i7 / this.f3578o) : l0Var.c(i7);
    }

    @Override // q2.x
    public final int f(q2.p0 p0Var, o2.l0 l0Var, int i7) {
        return i7 != Integer.MAX_VALUE ? Math.round(i7 * this.f3578o) : l0Var.r(i7);
    }
}
