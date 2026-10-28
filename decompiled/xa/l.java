package xa;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class l implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m0 f14797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f14798c;

    public l(int i7, m0 m0Var, boolean z10) {
        this.f14796a = i7;
        this.f14797b = m0Var;
        this.f14798c = z10;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f14796a - ((l) obj).f14796a;
    }
}
