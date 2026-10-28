package b3;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f1467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f1468b;

    public z(y yVar, x xVar) {
        this.f1467a = yVar;
        this.f1468b = xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return i9.l.a(this.f1468b, zVar.f1468b) && i9.l.a(this.f1467a, zVar.f1467a);
    }

    public final int hashCode() {
        y yVar = this.f1467a;
        int iHashCode = (yVar != null ? yVar.hashCode() : 0) * 31;
        x xVar = this.f1468b;
        return iHashCode + (xVar != null ? xVar.hashCode() : 0);
    }

    public final String toString() {
        return "PlatformTextStyle(spanStyle=" + this.f1467a + ", paragraphSyle=" + this.f1468b + ')';
    }
}
