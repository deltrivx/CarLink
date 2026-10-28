package f1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class m2 extends p1.b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f5050c;

    public m2(float f10, long j5) {
        super(j5);
        this.f5050c = f10;
    }

    @Override // p1.b0
    public final void a(p1.b0 b0Var) {
        i9.l.c(b0Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        this.f5050c = ((m2) b0Var).f5050c;
    }

    @Override // p1.b0
    public final p1.b0 b(long j5) {
        return new m2(this.f5050c, j5);
    }
}
