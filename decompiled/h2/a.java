package h2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6435a;

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f6435a == ((a) obj).f6435a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f6435a;
    }

    public final String toString() {
        int i7 = this.f6435a;
        if (i7 == 1) {
            return "Touch";
        }
        return i7 == 2 ? "Keyboard" : "Error";
    }
}
