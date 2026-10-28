package w0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m3.j f14009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f14011c;

    public y(m3.j jVar, int i7, long j5) {
        this.f14009a = jVar;
        this.f14010b = i7;
        this.f14011c = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.f14009a == yVar.f14009a && this.f14010b == yVar.f14010b && this.f14011c == yVar.f14011c;
    }

    public final int hashCode() {
        int iHashCode = ((this.f14009a.hashCode() * 31) + this.f14010b) * 31;
        long j5 = this.f14011c;
        return iHashCode + ((int) (j5 ^ (j5 >>> 32)));
    }

    public final String toString() {
        return "AnchorInfo(direction=" + this.f14009a + ", offset=" + this.f14010b + ", selectableId=" + this.f14011c + ')';
    }
}
