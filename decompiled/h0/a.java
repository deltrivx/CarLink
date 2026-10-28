package h0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f6277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f6278b;

    public long a() {
        if (this.f6277a) {
            return Long.MAX_VALUE;
        }
        return Math.max(0L, this.f6278b - System.nanoTime());
    }
}
