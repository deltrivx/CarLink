package w0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f13868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f13869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final y2.u f13870c = new y2.u("SelectionHandleInfo");

    static {
        float f10 = 25;
        f13868a = f10;
        f13869b = f10;
    }

    public static final long a(long j5) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j5 >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j5 & 4294967295L)) - 1.0f)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }
}
