package nb;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class n extends m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f9020b;

    public n(a0 a0Var) {
        this.f9020b = a0Var;
    }

    @Override // nb.a0
    /* JADX INFO: renamed from: K0 */
    public final a0 H0(boolean z10) {
        return z10 == E0() ? this : this.f9020b.H0(z10).J0(C0());
    }

    @Override // nb.a0
    /* JADX INFO: renamed from: L0 */
    public final a0 J0(h0 h0Var) {
        i9.l.e(h0Var, "newAttributes");
        return h0Var != C0() ? new c0(this, h0Var) : this;
    }

    @Override // nb.m
    public final a0 M0() {
        return this.f9020b;
    }
}
