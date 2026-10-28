package d0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class p0 extends r1.o implements q2.x {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f3611o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f3612p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f3613q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f3614r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f3615s;

    /* JADX WARN: Code duplicated, block: B:23:0x0045  */
    public final long A0(o2.o0 o0Var) {
        int iA0;
        int iA1;
        int iA2;
        int i7 = 0;
        if (Float.isNaN(this.f3613q)) {
            iA0 = Integer.MAX_VALUE;
        } else {
            iA0 = o0Var.a0(this.f3613q);
            if (iA0 < 0) {
                iA0 = 0;
            }
        }
        if (Float.isNaN(this.f3614r)) {
            iA1 = Integer.MAX_VALUE;
        } else {
            iA1 = o0Var.a0(this.f3614r);
            if (iA1 < 0) {
                iA1 = 0;
            }
        }
        if (Float.isNaN(this.f3611o)) {
            iA2 = 0;
        } else {
            iA2 = o0Var.a0(this.f3611o);
            if (iA2 < 0) {
                iA2 = 0;
            }
            if (iA2 > iA0) {
                iA2 = iA0;
            }
            if (iA2 == Integer.MAX_VALUE) {
                iA2 = 0;
            }
        }
        if (!Float.isNaN(this.f3612p)) {
            int iA3 = o0Var.a0(this.f3612p);
            if (iA3 < 0) {
                iA3 = 0;
            }
            if (iA3 > iA1) {
                iA3 = iA1;
            }
            if (iA3 != Integer.MAX_VALUE) {
                i7 = iA3;
            }
        }
        return n3.b.a(iA2, iA0, i7, iA1);
    }

    @Override // q2.x
    public final o2.n0 b(o2.o0 o0Var, o2.l0 l0Var, long j5) {
        int iJ;
        int iH;
        int i7;
        int iG;
        long jA;
        long jA0 = A0(o0Var);
        if (this.f3615s) {
            jA = n3.b.e(j5, jA0);
        } else {
            if (Float.isNaN(this.f3611o)) {
                iJ = n3.a.j(j5);
                int iH2 = n3.a.h(jA0);
                if (iJ > iH2) {
                    iJ = iH2;
                }
            } else {
                iJ = n3.a.j(jA0);
            }
            if (Float.isNaN(this.f3613q)) {
                iH = n3.a.h(j5);
                int iJ2 = n3.a.j(jA0);
                if (iH < iJ2) {
                    iH = iJ2;
                }
            } else {
                iH = n3.a.h(jA0);
            }
            if (Float.isNaN(this.f3612p)) {
                i7 = n3.a.i(j5);
                int iG2 = n3.a.g(jA0);
                if (i7 > iG2) {
                    i7 = iG2;
                }
            } else {
                i7 = n3.a.i(jA0);
            }
            if (Float.isNaN(this.f3614r)) {
                iG = n3.a.g(j5);
                int i10 = n3.a.i(jA0);
                if (iG < i10) {
                    iG = i10;
                }
            } else {
                iG = n3.a.g(jA0);
            }
            jA = n3.b.a(iJ, iH, i7, iG);
        }
        o2.v0 v0VarU = l0Var.u(jA);
        return o0Var.i(v0VarU.f9435a, v0VarU.f9436b, u8.x.f13123a, new i(v0VarU, 3));
    }

    @Override // q2.x
    public final int c(q2.p0 p0Var, o2.l0 l0Var, int i7) {
        long jA0 = A0(p0Var);
        if (n3.a.f(jA0)) {
            return n3.a.h(jA0);
        }
        if (!this.f3615s) {
            i7 = n3.b.f(i7, jA0);
        }
        return n3.b.g(l0Var.m(i7), jA0);
    }

    @Override // q2.x
    public final int d(q2.p0 p0Var, o2.l0 l0Var, int i7) {
        long jA0 = A0(p0Var);
        if (n3.a.e(jA0)) {
            return n3.a.g(jA0);
        }
        if (!this.f3615s) {
            i7 = n3.b.g(i7, jA0);
        }
        return n3.b.f(l0Var.H(i7), jA0);
    }

    @Override // q2.x
    public final int e(q2.p0 p0Var, o2.l0 l0Var, int i7) {
        long jA0 = A0(p0Var);
        if (n3.a.e(jA0)) {
            return n3.a.g(jA0);
        }
        if (!this.f3615s) {
            i7 = n3.b.g(i7, jA0);
        }
        return n3.b.f(l0Var.c(i7), jA0);
    }

    @Override // q2.x
    public final int f(q2.p0 p0Var, o2.l0 l0Var, int i7) {
        long jA0 = A0(p0Var);
        if (n3.a.f(jA0)) {
            return n3.a.h(jA0);
        }
        if (!this.f3615s) {
            i7 = n3.b.f(i7, jA0);
        }
        return n3.b.g(l0Var.r(i7), jA0);
    }
}
