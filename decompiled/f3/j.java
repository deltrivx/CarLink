package f3;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5256a;

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            return this.f5256a == ((j) obj).f5256a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f5256a;
    }

    public final String toString() {
        int i7 = this.f5256a;
        if (i7 == 0) {
            return "None";
        }
        if (i7 == 1) {
            return "Weight";
        }
        if (i7 == 2) {
            return "Style";
        }
        return i7 == 65535 ? "All" : "Invalid";
    }
}
