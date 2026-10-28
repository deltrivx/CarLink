package b3;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l0 implements v.t, z1.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1388a;

    @Override // v.t
    public float a(float f10) {
        return f10;
    }

    @Override // z1.i
    public double b(double d10) {
        switch (this.f1388a) {
            case 9:
                double d11 = d10 < 0.0d ? -d10 : d10;
                return Math.copySign(d11 >= 0.0031308049535603718d ? (Math.pow(d11, 0.4166666666666667d) - 0.05213270142180095d) / 0.9478672985781991d : d11 / 0.07739938080495357d, d10);
            case 10:
                double d12 = d10 < 0.0d ? -d10 : d10;
                return Math.copySign(d12 >= 0.04045d ? Math.pow((0.9478672985781991d * d12) + 0.05213270142180095d, 2.4d) : d12 * 0.07739938080495357d, d10);
            case 11:
                float[] fArr = z1.d.f15621a;
                return z1.d.b(z1.d.f15623c, d10);
            case 12:
                float[] fArr2 = z1.d.f15621a;
                return z1.d.a(z1.d.f15623c, d10);
            case 13:
                float[] fArr3 = z1.d.f15621a;
                return z1.d.d(z1.d.f15624d, d10);
            case 14:
                float[] fArr4 = z1.d.f15621a;
                return z1.d.c(z1.d.f15624d, d10);
            default:
                return d10;
        }
    }
}
