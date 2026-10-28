package o2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class z extends r1.o implements q2.x {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public h9.o f9448o;

    @Override // q2.x
    public final n0 b(o0 o0Var, l0 l0Var, long j5) {
        return (n0) this.f9448o.invoke(o0Var, l0Var, new n3.a(j5));
    }

    @Override // q2.x
    public final /* synthetic */ int c(q2.p0 p0Var, l0 l0Var, int i7) {
        return ob.a.f(this, p0Var, l0Var, i7);
    }

    @Override // q2.x
    public final /* synthetic */ int d(q2.p0 p0Var, l0 l0Var, int i7) {
        return ob.a.e(this, p0Var, l0Var, i7);
    }

    @Override // q2.x
    public final /* synthetic */ int e(q2.p0 p0Var, l0 l0Var, int i7) {
        return ob.a.c(this, p0Var, l0Var, i7);
    }

    @Override // q2.x
    public final /* synthetic */ int f(q2.p0 p0Var, l0 l0Var, int i7) {
        return ob.a.d(this, p0Var, l0Var, i7);
    }

    public final String toString() {
        return "LayoutModifierImpl(measureBlock=" + this.f9448o + ')';
    }
}
