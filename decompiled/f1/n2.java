package f1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class n2 extends p1.b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5063c;

    public n2(int i7, long j5) {
        super(j5);
        this.f5063c = i7;
    }

    @Override // p1.b0
    public final void a(p1.b0 b0Var) {
        i9.l.c(b0Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        this.f5063c = ((n2) b0Var).f5063c;
    }

    @Override // p1.b0
    public final p1.b0 b(long j5) {
        return new n2(this.f5063c, j5);
    }
}
