package d0;

import f1.k1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a0 implements o2.y, r1.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t0 f3535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k1 f3536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k1 f3537c;

    public a0(a aVar) {
        this.f3535a = aVar;
        this.f3536b = f1.b.s(aVar);
        this.f3537c = f1.b.s(aVar);
    }

    @Override // r1.p
    public final /* synthetic */ r1.p a(r1.p pVar) {
        return ob.a.g(this, pVar);
    }

    @Override // o2.y
    public final o2.n0 b(o2.o0 o0Var, o2.l0 l0Var, long j5) {
        k1 k1Var = this.f3536b;
        int iC = ((t0) k1Var.getValue()).c(o0Var, o0Var.getLayoutDirection());
        int iD = ((t0) k1Var.getValue()).d(o0Var);
        int iA = ((t0) k1Var.getValue()).a(o0Var, o0Var.getLayoutDirection()) + iC;
        int iB = ((t0) k1Var.getValue()).b(o0Var) + iD;
        o2.v0 v0VarU = l0Var.u(n3.b.i(-iA, -iB, j5));
        return o0Var.i(n3.b.g(v0VarU.f9435a + iA, j5), n3.b.f(v0VarU.f9436b + iB, j5), u8.x.f13123a, new z(v0VarU, iC, iD, 0));
    }

    @Override // o2.y
    public final /* synthetic */ int c(q2.p0 p0Var, o2.l0 l0Var, int i7) {
        return a2.f.h(this, p0Var, l0Var, i7);
    }

    @Override // o2.y
    public final /* synthetic */ int d(q2.p0 p0Var, o2.l0 l0Var, int i7) {
        return a2.f.f(this, p0Var, l0Var, i7);
    }

    @Override // o2.y
    public final /* synthetic */ int e(q2.p0 p0Var, o2.l0 l0Var, int i7) {
        return a2.f.a(this, p0Var, l0Var, i7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a0) {
            return i9.l.a(((a0) obj).f3535a, this.f3535a);
        }
        return false;
    }

    @Override // o2.y
    public final /* synthetic */ int f(q2.p0 p0Var, o2.l0 l0Var, int i7) {
        return a2.f.c(this, p0Var, l0Var, i7);
    }

    @Override // r1.p
    public final Object g(h9.n nVar, Object obj) {
        return nVar.invoke(obj, this);
    }

    @Override // r1.p
    public final boolean h(h9.k kVar) {
        return ((Boolean) kVar.invoke(this)).booleanValue();
    }

    public final int hashCode() {
        return this.f3535a.hashCode();
    }
}
