package y1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f14946a = (((long) Float.floatToRawIntBits(0.5f)) << 32) | (((long) Float.floatToRawIntBits(0.5f)) & 4294967295L);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f14947b = 0;

    public static final float a(long j5) {
        return Float.intBitsToFloat((int) (j5 >> 32));
    }

    public static final float b(long j5) {
        return Float.intBitsToFloat((int) (j5 & 4294967295L));
    }
}
