package p1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class w extends b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public j1.c f10103c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f10104d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f10105e;

    public w(long j5, j1.c cVar) {
        super(j5);
        this.f10103c = cVar;
    }

    @Override // p1.b0
    public final void a(b0 b0Var) {
        synchronized (q.f10069a) {
            i9.l.c(b0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.StateListStateRecord>");
            this.f10103c = ((w) b0Var).f10103c;
            this.f10104d = ((w) b0Var).f10104d;
            this.f10105e = ((w) b0Var).f10105e;
        }
    }

    @Override // p1.b0
    public final b0 b(long j5) {
        return new w(j5, this.f10103c);
    }
}
