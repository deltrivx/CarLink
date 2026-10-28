package g0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f5623a;

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return this.f5623a == ((b) obj).f5623a;
        }
        return false;
    }

    public final int hashCode() {
        long j5 = this.f5623a;
        return (int) (j5 ^ (j5 >>> 32));
    }

    public final String toString() {
        return "GridItemSpan(packedValue=" + this.f5623a + ')';
    }
}
