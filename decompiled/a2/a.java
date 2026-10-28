package a2;

import i9.l;
import n3.o;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public n3.c f6a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o f7b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public y1.o f8c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f9d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f6a, aVar.f6a) && this.f7b == aVar.f7b && l.a(this.f8c, aVar.f8c) && x1.e.a(this.f9d, aVar.f9d);
    }

    public final int hashCode() {
        int iHashCode = (this.f8c.hashCode() + ((this.f7b.hashCode() + (this.f6a.hashCode() * 31)) * 31)) * 31;
        long j5 = this.f9d;
        return ((int) (j5 ^ (j5 >>> 32))) + iHashCode;
    }

    public final String toString() {
        return "DrawParams(density=" + this.f6a + ", layoutDirection=" + this.f7b + ", canvas=" + this.f8c + ", size=" + ((Object) x1.e.f(this.f9d)) + ')';
    }
}
