package n3;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f8763a;

    public static long a(long j5, float f10, float f11, int i7) {
        if ((i7 & 1) != 0) {
            f10 = Float.intBitsToFloat((int) (j5 >> 32));
        }
        if ((i7 & 2) != 0) {
            f11 = Float.intBitsToFloat((int) (j5 & 4294967295L));
        }
        return (((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(f11)) & 4294967295L);
    }

    public static final float b(long j5) {
        return Float.intBitsToFloat((int) (j5 >> 32));
    }

    public static final float c(long j5) {
        return Float.intBitsToFloat((int) (j5 & 4294967295L));
    }

    public static final long d(long j5, long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j5 >> 32)) - Float.intBitsToFloat((int) (j10 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j5 & 4294967295L)) - Float.intBitsToFloat((int) (j10 & 4294967295L));
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    public static final long e(long j5, long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) + Float.intBitsToFloat((int) (j5 >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j10 & 4294967295L)) + Float.intBitsToFloat((int) (j5 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public static final long f(float f10, long j5) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j5 >> 32)) * f10;
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j5 & 4294967295L)) * f10)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public static String g(long j5) {
        return "(" + b(j5) + ", " + c(j5) + ") px/sec";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof t) {
            return this.f8763a == ((t) obj).f8763a;
        }
        return false;
    }

    public final int hashCode() {
        long j5 = this.f8763a;
        return (int) (j5 ^ (j5 >>> 32));
    }

    public final String toString() {
        return g(this.f8763a);
    }
}
