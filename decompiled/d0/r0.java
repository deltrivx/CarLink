package d0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class r0 extends r1.o implements q2.x {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f3625o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f3626p;

    @Override // q2.x
    public final o2.n0 b(o2.o0 o0Var, o2.l0 l0Var, long j5) {
        int iJ;
        int i7;
        if (Float.isNaN(this.f3625o) || n3.a.j(j5) != 0) {
            iJ = n3.a.j(j5);
        } else {
            int iA0 = o0Var.a0(this.f3625o);
            iJ = n3.a.h(j5);
            if (iA0 < 0) {
                iA0 = 0;
            }
            if (iA0 <= iJ) {
                iJ = iA0;
            }
        }
        int iH = n3.a.h(j5);
        if (Float.isNaN(this.f3626p) || n3.a.i(j5) != 0) {
            i7 = n3.a.i(j5);
        } else {
            int iA1 = o0Var.a0(this.f3626p);
            i7 = n3.a.g(j5);
            int i10 = iA1 >= 0 ? iA1 : 0;
            if (i10 <= i7) {
                i7 = i10;
            }
        }
        o2.v0 v0VarU = l0Var.u(n3.b.a(iJ, iH, i7, n3.a.g(j5)));
        return o0Var.i(v0VarU.f9435a, v0VarU.f9436b, u8.x.f13123a, new i(v0VarU, 4));
    }

    @Override // q2.x
    public final int c(q2.p0 p0Var, o2.l0 l0Var, int i7) {
        int iM = l0Var.m(i7);
        int iJ = !Float.isNaN(this.f3625o) ? a2.f.j(this.f3625o, p0Var) : 0;
        return iM < iJ ? iJ : iM;
    }

    @Override // q2.x
    public final int d(q2.p0 p0Var, o2.l0 l0Var, int i7) {
        int iH = l0Var.H(i7);
        int iJ = !Float.isNaN(this.f3626p) ? a2.f.j(this.f3626p, p0Var) : 0;
        return iH < iJ ? iJ : iH;
    }

    @Override // q2.x
    public final int e(q2.p0 p0Var, o2.l0 l0Var, int i7) {
        int iC = l0Var.c(i7);
        int iJ = !Float.isNaN(this.f3626p) ? a2.f.j(this.f3626p, p0Var) : 0;
        return iC < iJ ? iJ : iC;
    }

    @Override // q2.x
    public final int f(q2.p0 p0Var, o2.l0 l0Var, int i7) {
        int iR = l0Var.r(i7);
        int iJ = !Float.isNaN(this.f3625o) ? a2.f.j(this.f3625o, p0Var) : 0;
        return iR < iJ ? iJ : iR;
    }
}
