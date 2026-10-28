package q2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class u1 implements r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o2.n0 f10827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p0 f10828b;

    public u1(o2.n0 n0Var, p0 p0Var) {
        this.f10827a = n0Var;
        this.f10828b = p0Var;
    }

    @Override // q2.r1
    public final boolean p() {
        return this.f10828b.l0().isAttached();
    }
}
