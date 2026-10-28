package p1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class r extends b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public i1.d f10071c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f10072d;

    public r(long j5, i1.d dVar) {
        super(j5);
        this.f10071c = dVar;
    }

    @Override // p1.b0
    public final void a(b0 b0Var) {
        i9.l.c(b0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord, V of androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord>");
        r rVar = (r) b0Var;
        synchronized (q.f10070b) {
            this.f10071c = rVar.f10071c;
            this.f10072d = rVar.f10072d;
        }
    }

    @Override // p1.b0
    public final b0 b(long j5) {
        return new r(j5, this.f10071c);
    }
}
