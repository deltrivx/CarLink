package t8;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class p implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f12839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f12840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f12841c;

    public p(Object obj, Object obj2, Object obj3) {
        this.f12839a = obj;
        this.f12840b = obj2;
        this.f12841c = obj3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return i9.l.a(this.f12839a, pVar.f12839a) && i9.l.a(this.f12840b, pVar.f12840b) && i9.l.a(this.f12841c, pVar.f12841c);
    }

    public final int hashCode() {
        Object obj = this.f12839a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f12840b;
        int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.f12841c;
        return iHashCode2 + (obj3 != null ? obj3.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f12839a + ", " + this.f12840b + ", " + this.f12841c + ')';
    }
}
