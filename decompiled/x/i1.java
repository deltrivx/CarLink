package x;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class i1 extends g1 {
    @Override // x.g1, x.e1
    public final void a(long j5, long j10) {
        if (!Float.isNaN(Float.NaN)) {
            this.f14370a.setZoom(Float.NaN);
        }
        if ((9223372034707292159L & j10) != 9205357640488583168L) {
            this.f14370a.show(Float.intBitsToFloat((int) (j5 >> 32)), Float.intBitsToFloat((int) (j5 & 4294967295L)), Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)));
        } else {
            this.f14370a.show(Float.intBitsToFloat((int) (j5 >> 32)), Float.intBitsToFloat((int) (j5 & 4294967295L)));
        }
    }
}
