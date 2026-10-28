package v0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f13483a = a(Float.NaN, Float.NaN);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f13484b = 0;

    public static long a(float f10, float f11) {
        return (((long) Float.floatToRawIntBits(f11)) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32);
    }

    public static String b(long j5) {
        return "InlineDensity(density=" + Float.intBitsToFloat((int) (j5 >> 32)) + ", fontScale=" + Float.intBitsToFloat((int) (j5 & 4294967295L)) + ')';
    }
}
