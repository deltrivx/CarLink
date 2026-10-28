package q2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class y extends q0 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ z f10848u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(z zVar) {
        super(zVar);
        this.f10848u = zVar;
    }

    @Override // o2.l0
    public final int H(int i7) {
        z zVar = this.f10848u;
        x xVar = zVar.O;
        h1 h1Var = zVar.f10693p;
        i9.l.b(h1Var);
        q0 q0VarE0 = h1Var.E0();
        i9.l.b(q0VarE0);
        return xVar.d(this, q0VarE0, i7);
    }

    @Override // o2.l0
    public final int c(int i7) {
        z zVar = this.f10848u;
        x xVar = zVar.O;
        h1 h1Var = zVar.f10693p;
        i9.l.b(h1Var);
        q0 q0VarE0 = h1Var.E0();
        i9.l.b(q0VarE0);
        return xVar.e(this, q0VarE0, i7);
    }

    @Override // q2.p0
    public final int d0(o2.m mVar) {
        int iC = f.c(this, mVar);
        this.f10784t.h(iC, mVar);
        return iC;
    }

    @Override // o2.l0
    public final int m(int i7) {
        z zVar = this.f10848u;
        x xVar = zVar.O;
        h1 h1Var = zVar.f10693p;
        i9.l.b(h1Var);
        q0 q0VarE0 = h1Var.E0();
        i9.l.b(q0VarE0);
        return xVar.c(this, q0VarE0, i7);
    }

    @Override // o2.l0
    public final int r(int i7) {
        z zVar = this.f10848u;
        x xVar = zVar.O;
        h1 h1Var = zVar.f10693p;
        i9.l.b(h1Var);
        q0 q0VarE0 = h1Var.E0();
        i9.l.b(q0VarE0);
        return xVar.f(this, q0VarE0, i7);
    }

    @Override // o2.l0
    public final o2.v0 u(long j5) {
        X(j5);
        new n3.a(j5);
        z zVar = this.f10848u;
        x xVar = zVar.O;
        h1 h1Var = zVar.f10693p;
        i9.l.b(h1Var);
        q0 q0VarE0 = h1Var.E0();
        i9.l.b(q0VarE0);
        q0.v0(this, xVar.b(this, q0VarE0, j5));
        return this;
    }
}
