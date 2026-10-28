package m3;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8432a;

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            return this.f8432a == ((r) obj).f8432a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f8432a;
    }

    public final String toString() {
        int i7 = this.f8432a;
        if (i7 == 1) {
            return "Linearity.Linear";
        }
        if (i7 == 2) {
            return "Linearity.FontHinting";
        }
        return i7 == 3 ? "Linearity.None" : "Invalid";
    }
}
