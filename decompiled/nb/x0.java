package nb;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public enum x0 {
    INVARIANT("", true),
    IN_VARIANCE("in", false),
    OUT_VARIANCE("out", true);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f9056b;

    x0(String str, boolean z10) {
        this.f9055a = str;
        this.f9056b = z10;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f9055a;
    }
}
