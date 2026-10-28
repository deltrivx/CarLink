package nb;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class l extends m implements j, qb.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f9015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f9016c;

    public l(a0 a0Var, boolean z10) {
        this.f9015b = a0Var;
        this.f9016c = z10;
    }

    @Override // nb.m, nb.w
    public final boolean E0() {
        return false;
    }

    @Override // nb.a0
    /* JADX INFO: renamed from: K0 */
    public final a0 H0(boolean z10) {
        return z10 ? this.f9015b.H0(z10) : this;
    }

    @Override // nb.a0
    /* JADX INFO: renamed from: L0 */
    public final a0 J0(h0 h0Var) {
        i9.l.e(h0Var, "newAttributes");
        return new l(this.f9015b.J0(h0Var), this.f9016c);
    }

    @Override // nb.m
    public final a0 M0() {
        return this.f9015b;
    }

    @Override // nb.m
    public final m O0(a0 a0Var) {
        return new l(a0Var, this.f9016c);
    }

    @Override // nb.j
    public final boolean p0() {
        a0 a0Var = this.f9015b;
        a0Var.D0();
        return a0Var.D0().l() instanceof x9.r0;
    }

    @Override // nb.a0
    public final String toString() {
        return this.f9015b + " & Any";
    }

    @Override // nb.j
    public final w0 v0(w wVar) {
        i9.l.e(wVar, "replacement");
        return c.m(wVar.G0(), this.f9016c);
    }
}
