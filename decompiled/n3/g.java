package n3;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f8737a;

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f8737a == ((g) obj).f8737a;
        }
        return false;
    }

    public final int hashCode() {
        long j5 = this.f8737a;
        return (int) (j5 ^ (j5 >>> 32));
    }

    public final String toString() {
        long j5 = this.f8737a;
        if (j5 == 9205357640488583168L) {
            return "DpOffset.Unspecified";
        }
        return "(" + ((Object) f.b(Float.intBitsToFloat((int) (j5 >> 32)))) + ", " + ((Object) f.b(Float.intBitsToFloat((int) (j5 & 4294967295L)))) + ')';
    }
}
