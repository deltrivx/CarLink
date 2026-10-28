package f1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class p2 extends p1.b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f5087c;

    public p2(long j5, Object obj) {
        super(j5);
        this.f5087c = obj;
    }

    @Override // p1.b0
    public final void a(p1.b0 b0Var) {
        i9.l.c(b0Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord>");
        this.f5087c = ((p2) b0Var).f5087c;
    }

    @Override // p1.b0
    public final p1.b0 b(long j5) {
        return new p2(p1.l.k().g(), this.f5087c);
    }
}
