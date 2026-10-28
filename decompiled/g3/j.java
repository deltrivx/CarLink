package g3;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5864a;

    public static String a(int i7) {
        if (i7 == -1) {
            return "Unspecified";
        }
        if (i7 == 0) {
            return "None";
        }
        if (i7 == 1) {
            return "Default";
        }
        if (i7 == 2) {
            return "Go";
        }
        if (i7 == 3) {
            return "Search";
        }
        if (i7 == 4) {
            return "Send";
        }
        if (i7 == 5) {
            return "Previous";
        }
        if (i7 == 6) {
            return "Next";
        }
        return i7 == 7 ? "Done" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            return this.f5864a == ((j) obj).f5864a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f5864a;
    }

    public final String toString() {
        return a(this.f5864a);
    }
}
