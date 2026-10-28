package d0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends r1.o implements q2.x {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public c0 f3551o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f3552p;

    @Override // q2.x
    public final o2.n0 b(o2.o0 o0Var, o2.l0 l0Var, long j5) {
        int iM = this.f3551o == c0.f3546a ? l0Var.m(n3.a.g(j5)) : l0Var.r(n3.a.g(j5));
        if (iM < 0) {
            iM = 0;
        }
        if (iM < 0) {
            n3.i.a("width must be >= 0");
        }
        long jH = n3.b.h(iM, iM, 0, Integer.MAX_VALUE);
        if (this.f3552p) {
            jH = n3.b.e(j5, jH);
        }
        o2.v0 v0VarU = l0Var.u(jH);
        return o0Var.i(v0VarU.f9435a, v0VarU.f9436b, u8.x.f13123a, new i(v0VarU, 2));
    }

    @Override // q2.x
    public final int c(q2.p0 p0Var, o2.l0 l0Var, int i7) {
        return this.f3551o == c0.f3546a ? l0Var.m(i7) : l0Var.r(i7);
    }

    @Override // q2.x
    public final int d(q2.p0 p0Var, o2.l0 l0Var, int i7) {
        return l0Var.H(i7);
    }

    @Override // q2.x
    public final int e(q2.p0 p0Var, o2.l0 l0Var, int i7) {
        return l0Var.c(i7);
    }

    @Override // q2.x
    public final int f(q2.p0 p0Var, o2.l0 l0Var, int i7) {
        return this.f3551o == c0.f3546a ? l0Var.m(i7) : l0Var.r(i7);
    }
}
