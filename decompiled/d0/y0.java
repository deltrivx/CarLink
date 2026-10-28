package d0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class y0 extends r1.o implements q2.x {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public u f3673o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public h9.n f3674p;

    @Override // q2.x
    public final o2.n0 b(final o2.o0 o0Var, o2.l0 l0Var, long j5) {
        final o2.v0 v0VarU = l0Var.u(n3.b.a(this.f3673o != u.f3632a ? 0 : n3.a.j(j5), n3.a.h(j5), this.f3673o == u.f3633b ? n3.a.i(j5) : 0, n3.a.g(j5)));
        final int iM = n3.r.m(v0VarU.f9435a, n3.a.j(j5), n3.a.h(j5));
        final int iM2 = n3.r.m(v0VarU.f9436b, n3.a.i(j5), n3.a.g(j5));
        return o0Var.i(iM, iM2, u8.x.f13123a, new h9.k() { // from class: d0.x0
            @Override // h9.k
            public final Object invoke(Object obj) {
                h9.n nVar = this.f3664a.f3674p;
                o2.v0 v0Var = v0VarU;
                o2.u0.h((o2.u0) obj, v0Var, ((n3.j) nVar.invoke(new n3.m((((long) (iM - v0Var.f9435a)) << 32) | (((long) (iM2 - v0Var.f9436b)) & 4294967295L)), o0Var.getLayoutDirection())).f8739a);
                return t8.z.f12851a;
            }
        });
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
