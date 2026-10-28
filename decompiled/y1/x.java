package y1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14965a;

    public final boolean equals(Object obj) {
        if (obj instanceof x) {
            return this.f14965a == ((x) obj).f14965a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f14965a;
    }

    public final String toString() {
        int i7 = this.f14965a;
        if (i7 == 0) {
            return "Argb8888";
        }
        if (i7 == 1) {
            return "Alpha8";
        }
        if (i7 == 2) {
            return "Rgb565";
        }
        if (i7 == 3) {
            return "F16";
        }
        return i7 == 4 ? "Gpu" : "Unknown";
    }
}
