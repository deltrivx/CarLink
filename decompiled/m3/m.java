package m3;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8424a;

    public static String a(int i7) {
        if (i7 == 1) {
            return "Ltr";
        }
        if (i7 == 2) {
            return "Rtl";
        }
        if (i7 == 3) {
            return "Content";
        }
        if (i7 == 4) {
            return "ContentOrLtr";
        }
        if (i7 == 5) {
            return "ContentOrRtl";
        }
        return i7 == Integer.MIN_VALUE ? "Unspecified" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            return this.f8424a == ((m) obj).f8424a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f8424a;
    }

    public final String toString() {
        return a(this.f8424a);
    }
}
