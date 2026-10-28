package w1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14034a;

    public static String a(int i7) {
        if (i7 == 1) {
            return "Next";
        }
        if (i7 == 2) {
            return "Previous";
        }
        if (i7 == 3) {
            return "Left";
        }
        if (i7 == 4) {
            return "Right";
        }
        if (i7 == 5) {
            return "Up";
        }
        if (i7 == 6) {
            return "Down";
        }
        if (i7 == 7) {
            return "Enter";
        }
        return i7 == 8 ? "Exit" : "Invalid FocusDirection";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.f14034a == ((d) obj).f14034a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f14034a;
    }

    public final String toString() {
        return a(this.f14034a);
    }
}
