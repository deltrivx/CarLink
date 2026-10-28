package u;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f12959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f12960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f12961c;

    public d(float f10, float f11, long j5) {
        this.f12959a = f10;
        this.f12960b = f11;
        this.f12961c = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Float.compare(this.f12959a, dVar.f12959a) == 0 && Float.compare(this.f12960b, dVar.f12960b) == 0 && this.f12961c == dVar.f12961c;
    }

    public final int hashCode() {
        int iJ = ob.a.j(this.f12960b, Float.floatToIntBits(this.f12959a) * 31, 31);
        long j5 = this.f12961c;
        return iJ + ((int) (j5 ^ (j5 >>> 32)));
    }

    public final String toString() {
        return "FlingInfo(initialVelocity=" + this.f12959a + ", distance=" + this.f12960b + ", duration=" + this.f12961c + ')';
    }
}
