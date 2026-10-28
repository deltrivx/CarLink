package t8;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class j implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f12830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f12831b;

    public j(Object obj, Object obj2) {
        this.f12830a = obj;
        this.f12831b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return i9.l.a(this.f12830a, jVar.f12830a) && i9.l.a(this.f12831b, jVar.f12831b);
    }

    public final int hashCode() {
        Object obj = this.f12830a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f12831b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f12830a + ", " + this.f12831b + ')';
    }
}
