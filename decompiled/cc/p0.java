package cc;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class p0 extends q0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Runnable f2652c;

    public p0(Runnable runnable, long j5) {
        super(j5);
        this.f2652c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f2652c.run();
    }

    @Override // cc.q0
    public final String toString() {
        return super.toString() + this.f2652c;
    }
}
