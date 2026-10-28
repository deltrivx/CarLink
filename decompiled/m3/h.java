package m3;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8412a;

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f8412a == ((h) obj).f8412a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f8412a;
    }

    public final String toString() {
        int i7 = this.f8412a;
        if (i7 == 1) {
            return "LineHeightStyle.Trim.FirstLineTop";
        }
        if (i7 == 16) {
            return "LineHeightStyle.Trim.LastLineBottom";
        }
        if (i7 == 17) {
            return "LineHeightStyle.Trim.Both";
        }
        return i7 == 0 ? "LineHeightStyle.Trim.None" : "Invalid";
    }
}
