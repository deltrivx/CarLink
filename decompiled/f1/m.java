package f1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class m extends IllegalStateException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5041a;

    public m(String str) {
        this.f5041a = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f5041a;
    }
}
