package nb;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends m implements v0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f8982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w f8983c;

    public d0(a0 a0Var, w wVar) {
        i9.l.e(a0Var, "delegate");
        i9.l.e(wVar, "enhancement");
        this.f8982b = a0Var;
        this.f8983c = wVar;
    }

    @Override // nb.v0
    public final w D() {
        return this.f8983c;
    }

    @Override // nb.a0
    /* JADX INFO: renamed from: K0 */
    public final a0 H0(boolean z10) {
        w0 w0VarF = c.F(this.f8982b.H0(z10), this.f8983c.G0().H0(z10));
        i9.l.c(w0VarF, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return (a0) w0VarF;
    }

    @Override // nb.a0
    /* JADX INFO: renamed from: L0 */
    public final a0 J0(h0 h0Var) {
        i9.l.e(h0Var, "newAttributes");
        w0 w0VarF = c.F(this.f8982b.J0(h0Var), this.f8983c);
        i9.l.c(w0VarF, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return (a0) w0VarF;
    }

    @Override // nb.m
    public final a0 M0() {
        return this.f8982b;
    }

    @Override // nb.m
    public final m O0(a0 a0Var) {
        return new d0(a0Var, this.f8983c);
    }

    @Override // nb.m
    /* JADX INFO: renamed from: P0, reason: merged with bridge method [inline-methods] */
    public final d0 F0(ob.g gVar) {
        i9.l.e(gVar, "kotlinTypeRefiner");
        a0 a0Var = this.f8982b;
        i9.l.e(a0Var, "type");
        w wVar = this.f8983c;
        i9.l.e(wVar, "type");
        return new d0(a0Var, wVar);
    }

    @Override // nb.a0
    public final String toString() {
        return "[@EnhancedForWarnings(" + this.f8983c + ")] " + this.f8982b;
    }

    @Override // nb.v0
    public final w0 w0() {
        return this.f8982b;
    }
}
