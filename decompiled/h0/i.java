package h0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f6322c;

    public i(int i7, int i10, p pVar) {
        this.f6320a = i7;
        this.f6321b = i10;
        this.f6322c = pVar;
        if (i7 < 0) {
            c0.b.a("startIndex should be >= 0");
        }
        if (i10 > 0) {
            return;
        }
        c0.b.a("size should be > 0");
    }
}
