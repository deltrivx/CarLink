package nb;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h0 f8980c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(a0 a0Var, h0 h0Var) {
        super(a0Var);
        i9.l.e(h0Var, "attributes");
        this.f8980c = h0Var;
    }

    @Override // nb.m, nb.w
    public final h0 C0() {
        return this.f8980c;
    }

    @Override // nb.m
    public final m O0(a0 a0Var) {
        return new c0(a0Var, this.f8980c);
    }
}
