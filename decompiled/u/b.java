package u;

import n3.r;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float[] f12957a;

    static {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float[] fArr = new float[101];
        f12957a = fArr;
        float[] fArr2 = new float[101];
        float f18 = 0.0f;
        float f19 = 0.0f;
        int i7 = 0;
        while (true) {
            float f20 = 1.0f;
            if (i7 >= 100) {
                fArr2[100] = 1.0f;
                fArr[100] = 1.0f;
                return;
            }
            float f21 = i7 / 100;
            float f22 = 1.0f;
            while (true) {
                f10 = ((f22 - f18) / 2.0f) + f18;
                f11 = f20 - f10;
                f12 = f10 * 3.0f * f11;
                f13 = f10 * f10 * f10;
                float f23 = (((f10 * 0.35000002f) + (f11 * 0.175f)) * f12) + f13;
                if (Math.abs(f23 - f21) < 1.0E-5d) {
                    break;
                }
                if (f23 > f21) {
                    f22 = f10;
                } else {
                    f18 = f10;
                }
                f20 = 1.0f;
            }
            float f24 = 0.5f;
            fArr[i7] = (((f11 * 0.5f) + f10) * f12) + f13;
            float f25 = 1.0f;
            while (true) {
                f14 = ((f25 - f19) / 2.0f) + f19;
                f15 = 1.0f - f14;
                f16 = f14 * 3.0f * f15;
                f17 = f14 * f14 * f14;
                float f26 = (((f15 * f24) + f14) * f16) + f17;
                float f27 = f25;
                if (Math.abs(f26 - f21) >= 1.0E-5d) {
                    if (f26 > f21) {
                        f25 = f14;
                    } else {
                        f19 = f14;
                        f25 = f27;
                    }
                    f24 = 0.5f;
                }
            }
            fArr2[i7] = (((f14 * 0.35000002f) + (f15 * 0.175f)) * f16) + f17;
            i7++;
        }
    }

    public static a a(float f10) {
        float f11 = 0.0f;
        float f12 = 1.0f;
        float fL = r.l(f10, 0.0f, 1.0f);
        float f13 = 100;
        int i7 = (int) (f13 * fL);
        if (i7 < 100) {
            float f14 = i7 / f13;
            int i10 = i7 + 1;
            float f15 = i10 / f13;
            float[] fArr = f12957a;
            float f16 = fArr[i7];
            float f17 = (fArr[i10] - f16) / (f15 - f14);
            float f18 = ((fL - f14) * f17) + f16;
            f11 = f17;
            f12 = f18;
        }
        return new a(f12, f11);
    }
}
