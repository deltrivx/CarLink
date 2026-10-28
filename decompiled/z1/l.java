package z1;

import y1.h0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class l extends c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float[] f15659d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float[] f15660e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final float[] f15661f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final float[] f15662g;

    static {
        float[] fArrG = j.g(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, j.c(a.f15611b.f15612a, new float[]{0.964212f, 1.0f, 0.8251883f}, new float[]{0.95042855f, 1.0f, 1.0889004f}));
        f15659d = fArrG;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        f15660e = fArr;
        f15661f = j.f(fArrG);
        f15662g = j.f(fArr);
    }

    @Override // z1.c
    public final float a(int i7) {
        return i7 == 0 ? 1.0f : 0.5f;
    }

    @Override // z1.c
    public final float b(int i7) {
        return i7 == 0 ? 0.0f : -0.5f;
    }

    @Override // z1.c
    public final long d(float f10, float f11, float f12) {
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        if (f11 < -0.5f) {
            f11 = -0.5f;
        }
        if (f11 > 0.5f) {
            f11 = 0.5f;
        }
        if (f12 < -0.5f) {
            f12 = -0.5f;
        }
        float f13 = f12 <= 0.5f ? f12 : 0.5f;
        float[] fArr = f15662g;
        float f14 = (fArr[6] * f13) + (fArr[3] * f11) + (fArr[0] * f10);
        float f15 = (fArr[7] * f13) + (fArr[4] * f11) + (fArr[1] * f10);
        float f16 = (fArr[8] * f13) + (fArr[5] * f11) + (fArr[2] * f10);
        float f17 = f14 * f14 * f14;
        float f18 = f15 * f15 * f15;
        float f19 = f16 * f16 * f16;
        float[] fArr2 = f15661f;
        float f20 = (fArr2[6] * f19) + (fArr2[3] * f18) + (fArr2[0] * f17);
        return (((long) Float.floatToRawIntBits((fArr2[7] * f19) + (fArr2[4] * f18) + (fArr2[1] * f17))) & 4294967295L) | (((long) Float.floatToRawIntBits(f20)) << 32);
    }

    @Override // z1.c
    public final float e(float f10, float f11, float f12) {
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        if (f11 < -0.5f) {
            f11 = -0.5f;
        }
        if (f11 > 0.5f) {
            f11 = 0.5f;
        }
        if (f12 < -0.5f) {
            f12 = -0.5f;
        }
        float f13 = f12 <= 0.5f ? f12 : 0.5f;
        float[] fArr = f15662g;
        float f14 = (fArr[6] * f13) + (fArr[3] * f11) + (fArr[0] * f10);
        float f15 = (fArr[7] * f13) + (fArr[4] * f11) + (fArr[1] * f10);
        float f16 = (fArr[8] * f13) + (fArr[5] * f11) + (fArr[2] * f10);
        float f17 = f14 * f14 * f14;
        float f18 = f15 * f15 * f15;
        float f19 = f16 * f16 * f16;
        float[] fArr2 = f15661f;
        return (fArr2[8] * f19) + (fArr2[5] * f18) + (fArr2[2] * f17);
    }

    @Override // z1.c
    public final long f(float f10, float f11, float f12, float f13, c cVar) {
        float[] fArr = f15659d;
        float f14 = (fArr[6] * f12) + (fArr[3] * f11) + (fArr[0] * f10);
        float f15 = (fArr[7] * f12) + (fArr[4] * f11) + (fArr[1] * f10);
        float f16 = (fArr[8] * f12) + (fArr[5] * f11) + (fArr[2] * f10);
        float fY = n3.r.y(f14);
        float fY2 = n3.r.y(f15);
        float fY3 = n3.r.y(f16);
        float[] fArr2 = f15660e;
        return h0.b((fArr2[6] * fY3) + (fArr2[3] * fY2) + (fArr2[0] * fY), (fArr2[7] * fY3) + (fArr2[4] * fY2) + (fArr2[1] * fY), (fArr2[8] * fY3) + (fArr2[5] * fY2) + (fArr2[2] * fY), f13, cVar);
    }
}
