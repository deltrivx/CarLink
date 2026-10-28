package x;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class y extends r1.o implements q2.o {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final b0.k f14500o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f14501p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f14502q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f14503r;

    public y(b0.k kVar) {
        this.f14500o = kVar;
    }

    @Override // q2.o
    public final /* synthetic */ void H() {
    }

    @Override // r1.o
    public final void q0() {
        cc.b0.s(m0(), null, new a8.c1(this, null, 25), 3);
    }

    @Override // q2.o
    public final void x(q2.j0 j0Var) {
        j0Var.b();
        a2.c cVar = j0Var.f10720a;
        if (this.f14501p) {
            a2.f.w(j0Var, y1.q.b(0.3f, y1.q.f14948b), 0L, cVar.f16b.J(), 122);
        } else if (this.f14502q || this.f14503r) {
            a2.f.w(j0Var, y1.q.b(0.1f, y1.q.f14948b), 0L, cVar.f16b.J(), 122);
        }
    }
}
