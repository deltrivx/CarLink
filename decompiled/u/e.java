package u;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f12962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f12963b;

    public e(float f10, n3.c cVar) {
        this.f12962a = f10;
        float fA = cVar.a();
        float f11 = f.f12964a;
        this.f12963b = fA * 386.0878f * 160.0f * 0.84f;
    }

    public final d a(float f10) {
        double dB = b(f10);
        double d10 = f.f12964a;
        double d11 = d10 - 1.0d;
        return new d(f10, (float) (Math.exp((d10 / d11) * dB) * ((double) (this.f12962a * this.f12963b))), (long) (Math.exp(dB / d11) * 1000.0d));
    }

    public final double b(float f10) {
        float[] fArr = b.f12957a;
        return Math.log(((double) (Math.abs(f10) * 0.35f)) / ((double) (this.f12962a * this.f12963b)));
    }
}
