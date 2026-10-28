package t1;

import i9.l;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f12748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f12749c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f4.e f12750d;

    public d(int i7, long j5, e eVar, f4.e eVar2) {
        this.f12747a = i7;
        this.f12748b = j5;
        this.f12749c = eVar;
        this.f12750d = eVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f12747a == dVar.f12747a && this.f12748b == dVar.f12748b && this.f12749c == dVar.f12749c && l.a(this.f12750d, dVar.f12750d);
    }

    public final int hashCode() {
        int i7 = this.f12747a * 31;
        long j5 = this.f12748b;
        int iHashCode = (this.f12749c.hashCode() + ((i7 + ((int) (j5 ^ (j5 >>> 32)))) * 31)) * 31;
        f4.e eVar = this.f12750d;
        return iHashCode + (eVar == null ? 0 : eVar.hashCode());
    }

    public final String toString() {
        return "ContentCaptureEvent(id=" + this.f12747a + ", timestamp=" + this.f12748b + ", type=" + this.f12749c + ", structureCompat=" + this.f12750d + ')';
    }
}
