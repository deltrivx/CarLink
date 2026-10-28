package cc;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class o0 extends q0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f2649c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s0 f2650d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(s0 s0Var, long j5, l lVar) {
        super(j5);
        this.f2650d = s0Var;
        this.f2649c = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f2649c.y(this.f2650d);
    }

    @Override // cc.q0
    public final String toString() {
        return super.toString() + this.f2649c;
    }
}
