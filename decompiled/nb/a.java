package nb;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a extends m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f8973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a0 f8974c;

    public a(a0 a0Var, a0 a0Var2) {
        i9.l.e(a0Var, "delegate");
        i9.l.e(a0Var2, "abbreviation");
        this.f8973b = a0Var;
        this.f8974c = a0Var2;
    }

    @Override // nb.a0
    /* JADX INFO: renamed from: L0 */
    public final a0 J0(h0 h0Var) {
        i9.l.e(h0Var, "newAttributes");
        return new a(this.f8973b.J0(h0Var), this.f8974c);
    }

    @Override // nb.m
    public final a0 M0() {
        return this.f8973b;
    }

    @Override // nb.m
    public final m O0(a0 a0Var) {
        return new a(a0Var, this.f8974c);
    }

    @Override // nb.a0
    /* JADX INFO: renamed from: P0, reason: merged with bridge method [inline-methods] */
    public final a H0(boolean z10) {
        return new a(this.f8973b.H0(z10), this.f8974c.H0(z10));
    }

    @Override // nb.m
    /* JADX INFO: renamed from: Q0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final a F0(ob.g gVar) {
        i9.l.e(gVar, "kotlinTypeRefiner");
        a0 a0Var = this.f8973b;
        i9.l.e(a0Var, "type");
        a0 a0Var2 = this.f8974c;
        i9.l.e(a0Var2, "type");
        return new a(a0Var, a0Var2);
    }
}
