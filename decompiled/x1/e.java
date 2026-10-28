package x1;

import n3.n;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f14535a;

    public /* synthetic */ e(long j5) {
        this.f14535a = j5;
    }

    public static final boolean a(long j5, long j10) {
        return j5 == j10;
    }

    public static final float b(long j5) {
        return Float.intBitsToFloat((int) (j5 & 4294967295L));
    }

    public static final float c(long j5) {
        return Math.min(Float.intBitsToFloat((int) ((j5 >> 32) & 2147483647L)), Float.intBitsToFloat((int) (j5 & 2147483647L)));
    }

    public static final float d(long j5) {
        return Float.intBitsToFloat((int) (j5 >> 32));
    }

    public static final boolean e(long j5) {
        return (j5 == 9205357640488583168L) | (Float.intBitsToFloat((int) (j5 >> 32)) <= 0.0f) | (Float.intBitsToFloat((int) (j5 & 4294967295L)) <= 0.0f);
    }

    public static String f(long j5) {
        if (j5 == 9205357640488583168L) {
            return "Size.Unspecified";
        }
        return "Size(" + n.N0(Float.intBitsToFloat((int) (j5 >> 32))) + ", " + n.N0(Float.intBitsToFloat((int) (j5 & 4294967295L))) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f14535a == ((e) obj).f14535a;
        }
        return false;
    }

    public final int hashCode() {
        long j5 = this.f14535a;
        return (int) (j5 ^ (j5 >>> 32));
    }

    public final String toString() {
        return f(this.f14535a);
    }
}
