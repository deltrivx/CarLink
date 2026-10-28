package g0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5622a;

    public a(int i7) {
        this.f5622a = i7;
        if (i7 > 0) {
            return;
        }
        c0.b.a("Provided count should be larger than zero");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f5622a == ((a) obj).f5622a;
        }
        return false;
    }

    public final int hashCode() {
        return -this.f5622a;
    }
}
