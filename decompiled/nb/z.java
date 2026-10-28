package nb;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class z extends n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f9060c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(a0 a0Var, int i7) {
        super(a0Var);
        this.f9060c = i7;
    }

    @Override // nb.m, nb.w
    public final boolean E0() {
        switch (this.f9060c) {
            case 0:
                return false;
            default:
                return true;
        }
    }

    @Override // nb.m
    public final m O0(a0 a0Var) {
        switch (this.f9060c) {
            case 0:
                return new z(a0Var, 0);
            default:
                return new z(a0Var, 1);
        }
    }
}
