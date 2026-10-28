package w3;

import android.graphics.Color;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f14091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f14092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f14093c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f14094d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f14095e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f14096f;

    public a(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f14091a = f10;
        this.f14092b = f11;
        this.f14093c = f12;
        this.f14094d = f13;
        this.f14095e = f14;
        this.f14096f = f15;
    }

    public static a a(int i7) {
        m mVar = m.k;
        float f10 = b.f(Color.red(i7));
        float f11 = b.f(Color.green(i7));
        float f12 = b.f(Color.blue(i7));
        float[][] fArr = b.f14100d;
        float[] fArr2 = fArr[0];
        float f13 = (fArr2[2] * f12) + (fArr2[1] * f11) + (fArr2[0] * f10);
        float[] fArr3 = fArr[1];
        float f14 = (fArr3[2] * f12) + (fArr3[1] * f11) + (fArr3[0] * f10);
        float[] fArr4 = fArr[2];
        float f15 = (f12 * fArr4[2]) + (f11 * fArr4[1]) + (f10 * fArr4[0]);
        float[][] fArr5 = b.f14097a;
        float[] fArr6 = fArr5[0];
        float f16 = (fArr6[2] * f15) + (fArr6[1] * f14) + (fArr6[0] * f13);
        float[] fArr7 = fArr5[1];
        float f17 = (fArr7[2] * f15) + (fArr7[1] * f14) + (fArr7[0] * f13);
        float[] fArr8 = fArr5[2];
        float f18 = (f15 * fArr8[2]) + (f14 * fArr8[1]) + (f13 * fArr8[0]);
        float[] fArr9 = mVar.f14131g;
        float f19 = mVar.f14133i;
        float f20 = mVar.f14128d;
        float f21 = mVar.f14125a;
        float f22 = fArr9[0] * f16;
        float f23 = fArr9[1] * f17;
        float f24 = fArr9[2] * f18;
        float f25 = mVar.f14132h;
        float fPow = (float) Math.pow(((double) (Math.abs(f22) * f25)) / 100.0d, 0.42d);
        float fPow2 = (float) Math.pow(((double) (Math.abs(f23) * f25)) / 100.0d, 0.42d);
        float fPow3 = (float) Math.pow(((double) (Math.abs(f24) * f25)) / 100.0d, 0.42d);
        float fSignum = ((Math.signum(f22) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((Math.signum(f23) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f24) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        double d10 = fSignum3;
        float f26 = ((float) (((((double) fSignum2) * (-12.0d)) + (((double) fSignum) * 11.0d)) + d10)) / 11.0f;
        float f27 = ((float) (((double) (fSignum + fSignum2)) - (d10 * 2.0d))) / 9.0f;
        float f28 = fSignum2 * 20.0f;
        float f29 = ((21.0f * fSignum3) + ((fSignum * 20.0f) + f28)) / 20.0f;
        float f30 = (((fSignum * 40.0f) + f28) + fSignum3) / 20.0f;
        float fAtan2 = (((float) Math.atan2(f27, f26)) * 180.0f) / 3.1415927f;
        if (fAtan2 < 0.0f) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f31 = (3.1415927f * fAtan2) / 180.0f;
        float fPow4 = ((float) Math.pow((f30 * mVar.f14126b) / f21, mVar.f14134j * f20)) * 100.0f;
        Math.sqrt(fPow4 / 100.0f);
        float f32 = f21 + 4.0f;
        float fPow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, mVar.f14130f), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((((double) (((double) fAtan2) < 20.14d ? 360.0f + fAtan2 : fAtan2)) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * mVar.f14129e) * mVar.f14127c) * ((float) Math.sqrt((f27 * f27) + (f26 * f26)))) / (f29 + 0.305f), 0.9d));
        float fSqrt = fPow5 * ((float) Math.sqrt(((double) fPow4) / 100.0d));
        Math.sqrt((fPow5 * f20) / f32);
        float f33 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        float fLog = ((float) Math.log((f19 * fSqrt * 0.0228f) + 1.0f)) * 43.85965f;
        double d11 = f31;
        return new a(fAtan2, fSqrt, fPow4, f33, fLog * ((float) Math.cos(d11)), fLog * ((float) Math.sin(d11)));
    }

    public static a b(float f10, float f11, float f12) {
        m mVar = m.k;
        float f13 = mVar.f14128d;
        double d10 = ((double) f10) / 100.0d;
        Math.sqrt(d10);
        float f14 = mVar.f14125a + 4.0f;
        float f15 = mVar.f14133i * f11;
        Math.sqrt(((f11 / ((float) Math.sqrt(d10))) * mVar.f14128d) / f14);
        float f16 = (1.7f * f10) / ((0.007f * f10) + 1.0f);
        float fLog = ((float) Math.log((((double) f15) * 0.0228d) + 1.0d)) * 43.85965f;
        double d11 = (3.1415927f * f12) / 180.0f;
        return new a(f12, f11, f10, f16, fLog * ((float) Math.cos(d11)), fLog * ((float) Math.sin(d11)));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    public final int c(m mVar) {
        float fSqrt;
        float f10 = this.f14092b;
        double d10 = f10;
        float f11 = this.f14093c;
        if (d10 != 0.0d) {
            double d11 = f11;
            if (d11 == 0.0d) {
                fSqrt = 0.0f;
            } else {
                fSqrt = f10 / ((float) Math.sqrt(d11 / 100.0d));
            }
        } else {
            fSqrt = 0.0f;
        }
        float f12 = mVar.f14130f;
        float f13 = mVar.f14132h;
        float fPow = (float) Math.pow(((double) fSqrt) / Math.pow(1.64d - Math.pow(0.29d, f12), 0.73d), 1.1111111111111112d);
        double d12 = (this.f14091a * 3.1415927f) / 180.0f;
        float fCos = ((float) (Math.cos(2.0d + d12) + 3.8d)) * 0.25f;
        float fPow2 = mVar.f14125a * ((float) Math.pow(((double) f11) / 100.0d, (1.0d / ((double) mVar.f14128d)) / ((double) mVar.f14134j)));
        float f14 = fCos * 3846.1538f * mVar.f14129e * mVar.f14127c;
        float f15 = fPow2 / mVar.f14126b;
        float fSin = (float) Math.sin(d12);
        float fCos2 = (float) Math.cos(d12);
        float f16 = (((0.305f + f15) * 23.0f) * fPow) / (((fPow * 108.0f) * fSin) + (((11.0f * fPow) * fCos2) + (f14 * 23.0f)));
        float f17 = fCos2 * f16;
        float f18 = f16 * fSin;
        float f19 = f15 * 460.0f;
        float f20 = ((288.0f * f18) + ((451.0f * f17) + f19)) / 1403.0f;
        float f21 = ((f19 - (891.0f * f17)) - (261.0f * f18)) / 1403.0f;
        float f22 = ((f19 - (f17 * 220.0f)) - (f18 * 6300.0f)) / 1403.0f;
        float f23 = 100.0f / f13;
        float fSignum = Math.signum(f20) * f23 * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f20)) * 27.13d) / (400.0d - ((double) Math.abs(f20)))), 2.380952380952381d));
        float fSignum2 = Math.signum(f21) * f23 * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f21)) * 27.13d) / (400.0d - ((double) Math.abs(f21)))), 2.380952380952381d));
        float fSignum3 = Math.signum(f22) * f23 * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f22)) * 27.13d) / (400.0d - ((double) Math.abs(f22)))), 2.380952380952381d));
        float[] fArr = mVar.f14131g;
        float f24 = fSignum / fArr[0];
        float f25 = fSignum2 / fArr[1];
        float f26 = fSignum3 / fArr[2];
        float[][] fArr2 = b.f14098b;
        float[] fArr3 = fArr2[0];
        float f27 = (fArr3[2] * f26) + (fArr3[1] * f25) + (fArr3[0] * f24);
        float[] fArr4 = fArr2[1];
        float f28 = (fArr4[2] * f26) + (fArr4[1] * f25) + (fArr4[0] * f24);
        float[] fArr5 = fArr2[2];
        return x3.a.a(f27, f28, (f26 * fArr5[2]) + (f25 * fArr5[1]) + (f24 * fArr5[0]));
    }
}
