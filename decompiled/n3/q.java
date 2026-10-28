package n3;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final s[] f8753b = {new s(0), new s(4294967296L), new s(8589934592L)};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f8754c = r.K(Float.NaN, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f8755a;

    public /* synthetic */ q(long j5) {
        this.f8755a = j5;
    }

    public static final boolean a(long j5, long j10) {
        return j5 == j10;
    }

    public static final long b(long j5) {
        return f8753b[(int) ((j5 & 1095216660480L) >>> 32)].f8762a;
    }

    public static final float c(long j5) {
        return Float.intBitsToFloat((int) (j5 & 4294967295L));
    }

    public static int d(long j5) {
        return (int) (j5 ^ (j5 >>> 32));
    }

    public static String e(long j5) {
        long jB = b(j5);
        if (s.a(jB, 0L)) {
            return "Unspecified";
        }
        if (s.a(jB, 4294967296L)) {
            return c(j5) + ".sp";
        }
        if (!s.a(jB, 8589934592L)) {
            return "Invalid";
        }
        return c(j5) + ".em";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q) {
            return this.f8755a == ((q) obj).f8755a;
        }
        return false;
    }

    public final int hashCode() {
        return d(this.f8755a);
    }

    public final String toString() {
        return e(this.f8755a);
    }
}
