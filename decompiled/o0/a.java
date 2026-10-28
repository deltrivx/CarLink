package o0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9248a;

    public a(int i7) {
        this.f9248a = i7;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f9248a == ((a) obj).f9248a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f9248a;
    }
}
