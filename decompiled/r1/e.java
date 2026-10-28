package r1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f11106a;

    public e(float f10) {
        this.f11106a = f10;
    }

    @Override // r1.d
    public final long a(long j5, long j10, n3.o oVar) {
        long j11 = (((long) (((int) (j10 >> 32)) - ((int) (j5 >> 32)))) << 32) | (((long) (((int) (j10 & 4294967295L)) - ((int) (j5 & 4294967295L)))) & 4294967295L);
        float f10 = 1;
        float f11 = (this.f11106a + f10) * (((int) (j11 >> 32)) / 2.0f);
        return (((long) Math.round((f10 - 1.0f) * (((int) (j11 & 4294967295L)) / 2.0f))) & 4294967295L) | (((long) Math.round(f11)) << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && Float.compare(this.f11106a, ((e) obj).f11106a) == 0 && Float.compare(-1.0f, -1.0f) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(-1.0f) + (Float.floatToIntBits(this.f11106a) * 31);
    }

    public final String toString() {
        return "BiasAbsoluteAlignment(horizontalBias=" + this.f11106a + ", verticalBias=-1.0)";
    }
}
