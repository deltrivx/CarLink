package c1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class p0 extends r1.o implements q2.k, q2.x {
    @Override // q2.x
    public final o2.n0 b(o2.o0 o0Var, o2.l0 l0Var, long j5) {
        float f10 = ((n3.f) q2.f.i(this, l0.f1978a)).f8736a;
        float f11 = 0;
        if (f10 < f11) {
            f10 = f11;
        }
        o2.v0 v0VarU = l0Var.u(j5);
        boolean z10 = this.f11129n && !Float.isNaN(f10) && Float.compare(f10, f11) > 0;
        int iA0 = Float.isNaN(f10) ? 0 : o0Var.a0(f10);
        int iMax = z10 ? Math.max(v0VarU.f9435a, iA0) : v0VarU.f9435a;
        int iMax2 = z10 ? Math.max(v0VarU.f9436b, iA0) : v0VarU.f9436b;
        return o0Var.i(iMax, iMax2, u8.x.f13123a, new o0(iMax, v0VarU, iMax2));
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
