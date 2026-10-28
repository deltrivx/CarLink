package o2;

import q2.d2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b1 extends r1.o implements q2.x, d2 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public q f9300o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c1.a1 f9301p;

    public b1(q qVar) {
        this.f9300o = qVar;
        this.f9301p = new c1.a1(4, this, qVar);
    }

    @Override // q2.x
    public final n0 b(o0 o0Var, l0 l0Var, long j5) {
        v0 v0VarU = l0Var.u(j5);
        return o0Var.M(v0VarU.f9435a, v0VarU.f9436b, u8.x.f13123a, this.f9301p, new y0(v0VarU, 1));
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

    @Override // q2.d2
    public final Object k() {
        return "androidx.compose.ui.layout.WindowInsetsRulers";
    }
}
