package xa;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f14782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14783b;

    public f(int i7, Object obj) {
        this.f14782a = obj;
        this.f14783b = i7;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f14782a == fVar.f14782a && this.f14783b == fVar.f14783b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f14782a) * 65535) + this.f14783b;
    }
}
