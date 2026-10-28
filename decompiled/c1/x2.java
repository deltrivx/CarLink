package c1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class x2 extends r1.o implements q2.x {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public b0.k f2312o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f2313p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f2314q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public v.c f2315r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public v.c f2316s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f2317t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f2318u;

    @Override // q2.x
    public final o2.n0 b(o2.o0 o0Var, o2.l0 l0Var, long j5) {
        float f10;
        boolean z10 = (l0Var.c(n3.a.h(j5)) == 0 || l0Var.r(n3.a.g(j5)) == 0) ? false : true;
        if (this.f2314q) {
            f10 = e1.n.f4024a;
        } else {
            f10 = (z10 || this.f2313p) ? androidx.compose.material3.a.f917a : androidx.compose.material3.a.f918b;
        }
        float fR = o0Var.R(f10);
        v.c cVar = this.f2316s;
        int iFloatValue = (int) (cVar != null ? ((Number) cVar.d()).floatValue() : fR);
        if (!((iFloatValue >= 0) & (iFloatValue >= 0))) {
            n3.i.a("width and height must be >= 0");
        }
        o2.v0 v0VarU = l0Var.u(n3.b.h(iFloatValue, iFloatValue, iFloatValue, iFloatValue));
        float fR2 = o0Var.R((androidx.compose.material3.a.f920d - o0Var.L(fR)) / 2.0f);
        float fR3 = o0Var.R((androidx.compose.material3.a.f919c - androidx.compose.material3.a.f917a) - androidx.compose.material3.a.f921e);
        boolean z11 = this.f2314q;
        if (z11 && this.f2313p) {
            fR2 = fR3 - o0Var.R(e1.n.f4028e);
        } else if (z11 && !this.f2313p) {
            fR2 = o0Var.R(e1.n.f4028e);
        } else if (this.f2313p) {
            fR2 = fR3;
        }
        v.c cVar2 = this.f2316s;
        y8.c cVar3 = null;
        Float f11 = cVar2 != null ? (Float) cVar2.f13328e.getValue() : null;
        if (f11 == null || f11.floatValue() != fR) {
            cc.b0.s(m0(), null, new v2(this, fR, cVar3, 0), 3);
        }
        v.c cVar4 = this.f2315r;
        Float f12 = cVar4 != null ? (Float) cVar4.f13328e.getValue() : null;
        if (f12 == null || f12.floatValue() != fR2) {
            cc.b0.s(m0(), null, new v2(this, fR2, cVar3, 1), 3);
        }
        if (Float.isNaN(this.f2318u) && Float.isNaN(this.f2317t)) {
            this.f2318u = fR;
            this.f2317t = fR2;
        }
        return o0Var.i(iFloatValue, iFloatValue, u8.x.f13123a, new w2(v0VarU, this, fR2));
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

    @Override // r1.o
    public final boolean n0() {
        return false;
    }

    @Override // r1.o
    public final void q0() {
        cc.b0.s(m0(), null, new a8.c1(this, null, 3), 3);
    }
}
