package c3;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f2376c;

    public g(int i7, int i10, boolean z10) {
        this.f2374a = i7;
        this.f2375b = i10;
        this.f2376c = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f2374a == gVar.f2374a && this.f2375b == gVar.f2375b && this.f2376c == gVar.f2376c;
    }

    public final int hashCode() {
        return (((this.f2374a * 31) + this.f2375b) * 31) + (this.f2376c ? 1231 : 1237);
    }

    public final String toString() {
        return "BidiRun(start=" + this.f2374a + ", end=" + this.f2375b + ", isRtl=" + this.f2376c + ')';
    }
}
