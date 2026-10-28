package m3;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8405a;

    public static String a(int i7) {
        if (i7 == 1) {
            return "Hyphens.None";
        }
        if (i7 == 2) {
            return "Hyphens.Auto";
        }
        return i7 == Integer.MIN_VALUE ? "Hyphens.Unspecified" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.f8405a == ((d) obj).f8405a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f8405a;
    }

    public final String toString() {
        return a(this.f8405a);
    }
}
