package o2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9340a;

    public long a(long j5, long j10) {
        switch (this.f9340a) {
            case 0:
                float fMax = Math.max(Float.intBitsToFloat((int) (j10 >> 32)) / Float.intBitsToFloat((int) (j5 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)) / Float.intBitsToFloat((int) (j5 & 4294967295L)));
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax)) & 4294967295L);
                int i7 = c1.f9311a;
                return jFloatToRawIntBits;
            case 1:
                float fB = d1.b(j5, j10);
                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fB)) << 32) | (((long) Float.floatToRawIntBits(fB)) & 4294967295L);
                int i10 = c1.f9311a;
                return jFloatToRawIntBits2;
            default:
                if (Float.intBitsToFloat((int) (j5 >> 32)) <= Float.intBitsToFloat((int) (j10 >> 32)) && Float.intBitsToFloat((int) (j5 & 4294967295L)) <= Float.intBitsToFloat((int) (j10 & 4294967295L))) {
                    long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(1.0f)) << 32) | (((long) Float.floatToRawIntBits(1.0f)) & 4294967295L);
                    int i11 = c1.f9311a;
                    return jFloatToRawIntBits3;
                }
                float fB2 = d1.b(j5, j10);
                long jFloatToRawIntBits4 = (((long) Float.floatToRawIntBits(fB2)) << 32) | (((long) Float.floatToRawIntBits(fB2)) & 4294967295L);
                int i12 = c1.f9311a;
                return jFloatToRawIntBits4;
        }
    }

    public String toString() {
        switch (this.f9340a) {
            case 3:
                return "ReusedSlotId";
            default:
                return super.toString();
        }
    }
}
