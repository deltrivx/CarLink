package t8;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class l implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f12832a;

    public l(Throwable th) {
        i9.l.e(th, "exception");
        this.f12832a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            return i9.l.a(this.f12832a, ((l) obj).f12832a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f12832a.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f12832a + ')';
    }
}
