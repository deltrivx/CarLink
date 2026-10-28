package sb;

import i9.l;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f12712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f12713b;

    public a(Object obj, Object obj2) {
        this.f12712a = obj;
        this.f12713b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f12712a, aVar.f12712a) && l.a(this.f12713b, aVar.f12713b);
    }

    public final int hashCode() {
        Object obj = this.f12712a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f12713b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "ApproximationBounds(lower=" + this.f12712a + ", upper=" + this.f12713b + ')';
    }
}
