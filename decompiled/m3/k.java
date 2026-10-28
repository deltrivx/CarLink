package m3;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8419a;

    public static String a(int i7) {
        if (i7 == 1) {
            return "Left";
        }
        if (i7 == 2) {
            return "Right";
        }
        if (i7 == 3) {
            return "Center";
        }
        if (i7 == 4) {
            return "Justify";
        }
        if (i7 == 5) {
            return "Start";
        }
        if (i7 == 6) {
            return "End";
        }
        return i7 == Integer.MIN_VALUE ? "Unspecified" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return this.f8419a == ((k) obj).f8419a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f8419a;
    }

    public final String toString() {
        return a(this.f8419a);
    }
}
