package x1;

import n3.n;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f14521a;

    public /* synthetic */ b(long j5) {
        this.f14521a = j5;
    }

    public static long a(long j5, float f10, int i7) {
        float fIntBitsToFloat = (i7 & 1) != 0 ? Float.intBitsToFloat((int) (j5 >> 32)) : 0.0f;
        if ((i7 & 2) != 0) {
            f10 = Float.intBitsToFloat((int) (j5 & 4294967295L));
        }
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(f10)) & 4294967295L);
    }

    public static final boolean b(long j5, long j10) {
        return j5 == j10;
    }

    public static final float c(long j5) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j5 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j5 & 4294967295L));
        return (float) Math.sqrt((fIntBitsToFloat2 * fIntBitsToFloat2) + (fIntBitsToFloat * fIntBitsToFloat));
    }

    public static final float d(long j5) {
        return Float.intBitsToFloat((int) (j5 >> 32));
    }

    public static final float e(long j5) {
        return Float.intBitsToFloat((int) (j5 & 4294967295L));
    }

    public static int f(long j5) {
        return (int) (j5 ^ (j5 >>> 32));
    }

    public static final long g(long j5, long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j5 >> 32)) - Float.intBitsToFloat((int) (j10 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j5 & 4294967295L)) - Float.intBitsToFloat((int) (j10 & 4294967295L));
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    public static final long h(long j5, long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) + Float.intBitsToFloat((int) (j5 >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j10 & 4294967295L)) + Float.intBitsToFloat((int) (j5 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public static final long i(float f10, long j5) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j5 >> 32)) * f10;
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j5 & 4294967295L)) * f10)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public static String j(long j5) {
        if ((9223372034707292159L & j5) == 9205357640488583168L) {
            return "Offset.Unspecified";
        }
        return "Offset(" + n.N0(Float.intBitsToFloat((int) (j5 >> 32))) + ", " + n.N0(Float.intBitsToFloat((int) (j5 & 4294967295L))) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return this.f14521a == ((b) obj).f14521a;
        }
        return false;
    }

    public final int hashCode() {
        return f(this.f14521a);
    }

    public final String toString() {
        return j(this.f14521a);
    }
}
