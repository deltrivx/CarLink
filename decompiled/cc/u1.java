package cc;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class u1 extends hc.p implements Runnable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f2676e;

    public u1(long j5, v1 v1Var) {
        super(v1Var, v1Var.getContext());
        this.f2676e = j5;
    }

    @Override // cc.h1
    public final String T() {
        return super.T() + "(timeMillis=" + this.f2676e + ')';
    }

    @Override // java.lang.Runnable
    public final void run() {
        b0.k(this.f2587c);
        B(new t1("Timed out waiting for " + this.f2676e + " ms", this));
    }
}
