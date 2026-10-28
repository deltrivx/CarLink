package f3;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5255a;

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            return this.f5255a == ((i) obj).f5255a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f5255a;
    }

    public final String toString() {
        int i7 = this.f5255a;
        if (i7 == 0) {
            return "Normal";
        }
        return i7 == 1 ? "Italic" : "Invalid";
    }
}
