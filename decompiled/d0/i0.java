package d0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class i0 extends r1.o implements q2.x {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public h0 f3577o;

    @Override // q2.x
    public final o2.n0 b(o2.o0 o0Var, o2.l0 l0Var, long j5) {
        float fA = this.f3577o.a(o0Var.getLayoutDirection());
        h0 h0Var = this.f3577o;
        float f10 = h0Var.f3572b;
        float fB = h0Var.b(o0Var.getLayoutDirection());
        float f11 = this.f3577o.f3574d;
        float f12 = 0;
        if (!((Float.compare(f11, f12) >= 0) & (Float.compare(fA, f12) >= 0) & (Float.compare(f10, f12) >= 0) & (Float.compare(fB, f12) >= 0))) {
            e0.a.a("Padding must be non-negative");
        }
        int iA0 = o0Var.a0(fA);
        int iA1 = o0Var.a0(fB) + iA0;
        int iA2 = o0Var.a0(f10);
        int iA3 = o0Var.a0(f11) + iA2;
        o2.v0 v0VarU = l0Var.u(n3.b.i(-iA1, -iA3, j5));
        return o0Var.i(n3.b.g(v0VarU.f9435a + iA1, j5), n3.b.f(v0VarU.f9436b + iA3, j5), u8.x.f13123a, new z(v0VarU, iA0, iA2, 1));
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
