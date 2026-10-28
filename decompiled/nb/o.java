package nb;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class o extends p0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p0 f9021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p0 f9022c;

    public o(p0 p0Var, p0 p0Var2) {
        this.f9021b = p0Var;
        this.f9022c = p0Var2;
    }

    @Override // nb.p0
    public final boolean a() {
        return this.f9021b.a() || this.f9022c.a();
    }

    @Override // nb.p0
    public final boolean b() {
        return this.f9021b.b() || this.f9022c.b();
    }

    @Override // nb.p0
    public final y9.h c(y9.h hVar) {
        i9.l.e(hVar, "annotations");
        return this.f9022c.c(this.f9021b.c(hVar));
    }

    @Override // nb.p0
    public final n0 d(w wVar) {
        n0 n0VarD = this.f9021b.d(wVar);
        return n0VarD == null ? this.f9022c.d(wVar) : n0VarD;
    }

    @Override // nb.p0
    public final w f(w wVar, x0 x0Var) {
        i9.l.e(wVar, "topLevelType");
        i9.l.e(x0Var, "position");
        return this.f9022c.f(this.f9021b.f(wVar, x0Var), x0Var);
    }
}
