package d4;

import android.graphics.Rect;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f3765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f3766b;

    public b(Rect rect, Rect rect2) {
        this.f3765a = rect;
        this.f3766b = rect2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return bVar.f3765a.equals(this.f3765a) && bVar.f3766b.equals(this.f3766b);
    }

    public final int hashCode() {
        return this.f3765a.hashCode() ^ this.f3766b.hashCode();
    }

    public final String toString() {
        return "Pair{" + this.f3765a + " " + this.f3766b + "}";
    }
}
