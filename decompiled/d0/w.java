package d0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class w extends r1.o implements q2.x {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public u f3661o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f3662p;

    @Override // q2.x
    public final o2.n0 b(o2.o0 o0Var, o2.l0 l0Var, long j5) {
        int iJ;
        int iH;
        int iG;
        int iG2;
        if (!n3.a.d(j5) || this.f3661o == u.f3632a) {
            iJ = n3.a.j(j5);
            iH = n3.a.h(j5);
        } else {
            int iRound = Math.round(n3.a.h(j5) * this.f3662p);
            int iJ2 = n3.a.j(j5);
            iJ = n3.a.h(j5);
            if (iRound < iJ2) {
                iRound = iJ2;
            }
            if (iRound <= iJ) {
                iJ = iRound;
            }
            iH = iJ;
        }
        if (!n3.a.c(j5) || this.f3661o == u.f3633b) {
            int i7 = n3.a.i(j5);
            iG = n3.a.g(j5);
            iG2 = i7;
        } else {
            int iRound2 = Math.round(n3.a.g(j5) * this.f3662p);
            int i10 = n3.a.i(j5);
            iG2 = n3.a.g(j5);
            if (iRound2 < i10) {
                iRound2 = i10;
            }
            if (iRound2 <= iG2) {
                iG2 = iRound2;
            }
            iG = iG2;
        }
        o2.v0 v0VarU = l0Var.u(n3.b.a(iJ, iH, iG2, iG));
        return o0Var.i(v0VarU.f9435a, v0VarU.f9436b, u8.x.f13123a, new i(v0VarU, 1));
    }

    @Override // q2.x
    public final /* synthetic */ int c(q2.p0 p0Var, o2.l0 l0Var, int i7) {
        return ob.a.f(this, p0Var, l0Var, i7);
    }

    @Override // q2.x
    public final /* synthetic */ int d(q2.p0 p0Var, o2.l0 l0Var, int i7) {
        return ob.a.e(this, p0Var, l0Var, i7);
    }

    @Override // q2.x
    public final /* synthetic */ int e(q2.p0 p0Var, o2.l0 l0Var, int i7) {
        return ob.a.c(this, p0Var, l0Var, i7);
    }

    @Override // q2.x
    public final /* synthetic */ int f(q2.p0 p0Var, o2.l0 l0Var, int i7) {
        return ob.a.d(this, p0Var, l0Var, i7);
    }
}
