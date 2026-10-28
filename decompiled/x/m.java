package x;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public y1.f f14424a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public y1.b f14425b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a2.c f14426c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public y1.h f14427d = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return i9.l.a(this.f14424a, mVar.f14424a) && i9.l.a(this.f14425b, mVar.f14425b) && i9.l.a(this.f14426c, mVar.f14426c) && i9.l.a(this.f14427d, mVar.f14427d);
    }

    public final int hashCode() {
        y1.f fVar = this.f14424a;
        int iHashCode = (fVar == null ? 0 : fVar.hashCode()) * 31;
        y1.b bVar = this.f14425b;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        a2.c cVar = this.f14426c;
        int iHashCode3 = (iHashCode2 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        y1.h hVar = this.f14427d;
        return iHashCode3 + (hVar != null ? hVar.hashCode() : 0);
    }

    public final String toString() {
        return "BorderCache(imageBitmap=" + this.f14424a + ", canvas=" + this.f14425b + ", canvasDrawScope=" + this.f14426c + ", borderPath=" + this.f14427d + ')';
    }
}
