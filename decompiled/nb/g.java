package nb;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y9.h f8992a;

    public g(y9.h hVar) {
        i9.l.e(hVar, "annotations");
        this.f8992a = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return i9.l.a(((g) obj).f8992a, this.f8992a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8992a.hashCode();
    }
}
