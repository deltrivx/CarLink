package d0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class g0 extends r1.o implements q2.x {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f3561o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f3562p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f3563q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f3564r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f3565s;

    @Override // q2.x
    public final o2.n0 b(o2.o0 o0Var, o2.l0 l0Var, long j5) {
        int iA0 = o0Var.a0(this.f3563q) + o0Var.a0(this.f3561o);
        int iA1 = o0Var.a0(this.f3564r) + o0Var.a0(this.f3562p);
        o2.v0 v0VarU = l0Var.u(n3.b.i(-iA0, -iA1, j5));
        return o0Var.i(n3.b.g(v0VarU.f9435a + iA0, j5), n3.b.f(v0VarU.f9436b + iA1, j5), u8.x.f13123a, new c8.p(3, this, v0VarU));
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
