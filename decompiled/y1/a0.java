package y1;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f14874a;

    public static float[] a() {
        return new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    }

    public static final long b(long j5, float[] fArr) {
        if (fArr.length < 16) {
            return j5;
        }
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[3];
        float f13 = fArr[4];
        float f14 = fArr[5];
        float f15 = fArr[7];
        float f16 = fArr[12];
        float f17 = fArr[13];
        float f18 = fArr[15];
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j5 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j5 & 4294967295L));
        float f19 = 1 / (((f15 * fIntBitsToFloat2) + (f12 * fIntBitsToFloat)) + f18);
        if ((Float.floatToRawIntBits(f19) & Integer.MAX_VALUE) >= 2139095040) {
            f19 = 0.0f;
        }
        return (((long) Float.floatToRawIntBits((((f13 * fIntBitsToFloat2) + (f10 * fIntBitsToFloat)) + f16) * f19)) << 32) | (((long) Float.floatToRawIntBits(((f14 * fIntBitsToFloat2) + (f11 * fIntBitsToFloat) + f17) * f19)) & 4294967295L);
    }

    public static final void c(float[] fArr, x1.a aVar) {
        if (fArr.length < 16) {
            return;
        }
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[3];
        float f13 = fArr[4];
        float f14 = fArr[5];
        float f15 = fArr[7];
        float f16 = fArr[12];
        float f17 = fArr[13];
        float f18 = fArr[15];
        float f19 = aVar.f14517a;
        float f20 = aVar.f14518b;
        float f21 = aVar.f14519c;
        float f22 = aVar.f14520d;
        float f23 = f12 * f19;
        float f24 = f15 * f20;
        float f25 = 1.0f / ((f23 + f24) + f18);
        if ((Float.floatToRawIntBits(f25) & Integer.MAX_VALUE) >= 2139095040) {
            f25 = 0.0f;
        }
        float f26 = f10 * f19;
        float f27 = f13 * f20;
        float f28 = (f26 + f27 + f16) * f25;
        float f29 = f19 * f11;
        float f30 = f20 * f14;
        float f31 = (f29 + f30 + f17) * f25;
        float f32 = f15 * f22;
        float f33 = 1.0f / ((f23 + f32) + f18);
        if ((Float.floatToRawIntBits(f33) & Integer.MAX_VALUE) >= 2139095040) {
            f33 = 0.0f;
        }
        float f34 = f13 * f22;
        float f35 = (f26 + f34 + f16) * f33;
        float f36 = f14 * f22;
        float f37 = (f29 + f36 + f17) * f33;
        float f38 = f12 * f21;
        float f39 = 1.0f / ((f24 + f38) + f18);
        if ((Float.floatToRawIntBits(f39) & Integer.MAX_VALUE) >= 2139095040) {
            f39 = 0.0f;
        }
        float f40 = f10 * f21;
        float f41 = (f40 + f27 + f16) * f39;
        float f42 = f21 * f11;
        float f43 = (f30 + f42 + f17) * f39;
        float f44 = 1.0f / ((f38 + f32) + f18);
        float f45 = (Float.floatToRawIntBits(f44) & Integer.MAX_VALUE) < 2139095040 ? f44 : 0.0f;
        float f46 = (f40 + f34 + f16) * f45;
        float f47 = (f42 + f36 + f17) * f45;
        aVar.f14517a = Math.min(f28, Math.min(f35, Math.min(f41, f46)));
        aVar.f14518b = Math.min(f31, Math.min(f37, Math.min(f43, f47)));
        aVar.f14519c = Math.max(f28, Math.max(f35, Math.max(f41, f46)));
        aVar.f14520d = Math.max(f31, Math.max(f37, Math.max(f43, f47)));
    }

    public static final void d(float[] fArr) {
        if (fArr.length < 16) {
            return;
        }
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 1.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = 0.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 1.0f;
    }

    public static final void e(float[] fArr, float[] fArr2) {
        if (fArr.length >= 16 && fArr2.length >= 16) {
            float f10 = fArr[0];
            float f11 = fArr2[0];
            float f12 = fArr[1];
            float f13 = fArr2[4];
            float f14 = fArr[2];
            float f15 = fArr2[8];
            float f16 = f14 * f15;
            float f17 = fArr[3];
            float f18 = fArr2[12];
            float f19 = f17 * f18;
            float f20 = f19 + f16 + (f12 * f13) + (f10 * f11);
            float f21 = fArr2[1];
            float f22 = fArr2[5];
            float f23 = fArr2[9];
            float f24 = f14 * f23;
            float f25 = fArr2[13];
            float f26 = f17 * f25;
            float f27 = f26 + f24 + (f12 * f22) + (f10 * f21);
            float f28 = fArr2[2];
            float f29 = fArr2[6];
            float f30 = fArr2[10];
            float f31 = f14 * f30;
            float f32 = fArr2[14];
            float f33 = f17 * f32;
            float f34 = f33 + f31 + (f12 * f29) + (f10 * f28);
            float f35 = fArr2[3];
            float f36 = fArr2[7];
            float f37 = fArr2[11];
            float f38 = f14 * f37;
            float f39 = fArr2[15];
            float f40 = f17 * f39;
            float f41 = f40 + f38 + (f12 * f36) + (f10 * f35);
            float f42 = fArr[4];
            float f43 = fArr[5];
            float f44 = fArr[6];
            float f45 = (f44 * f15) + (f43 * f13) + (f42 * f11);
            float f46 = fArr[7];
            float f47 = (f46 * f18) + f45;
            float f48 = (f46 * f25) + (f44 * f23) + (f43 * f22) + (f42 * f21);
            float f49 = (f46 * f32) + (f44 * f30) + (f43 * f29) + (f42 * f28);
            float f50 = f44 * f37;
            float f51 = f46 * f39;
            float f52 = f51 + f50 + (f43 * f36) + (f42 * f35);
            float f53 = fArr[8];
            float f54 = fArr[9];
            float f55 = fArr[10];
            float f56 = (f55 * f15) + (f54 * f13) + (f53 * f11);
            float f57 = fArr[11];
            float f58 = (f57 * f18) + f56;
            float f59 = (f57 * f25) + (f55 * f23) + (f54 * f22) + (f53 * f21);
            float f60 = (f57 * f32) + (f55 * f30) + (f54 * f29) + (f53 * f28);
            float f61 = f55 * f37;
            float f62 = f57 * f39;
            float f63 = f62 + f61 + (f54 * f36) + (f53 * f35);
            float f64 = fArr[12];
            float f65 = fArr[13];
            float f66 = (f13 * f65) + (f11 * f64);
            float f67 = fArr[14];
            float f68 = (f15 * f67) + f66;
            float f69 = fArr[15];
            float f70 = (f18 * f69) + f68;
            float f71 = f23 * f67;
            float f72 = f25 * f69;
            float f73 = f72 + f71 + (f22 * f65) + (f21 * f64);
            float f74 = f30 * f67;
            float f75 = f32 * f69;
            float f76 = f75 + f74 + (f29 * f65) + (f28 * f64);
            float f77 = f67 * f37;
            float f78 = f69 * f39;
            fArr[0] = f20;
            fArr[1] = f27;
            fArr[2] = f34;
            fArr[3] = f41;
            fArr[4] = f47;
            fArr[5] = f48;
            fArr[6] = f49;
            fArr[7] = f52;
            fArr[8] = f58;
            fArr[9] = f59;
            fArr[10] = f60;
            fArr[11] = f63;
            fArr[12] = f70;
            fArr[13] = f73;
            fArr[14] = f76;
            fArr[15] = f78 + f77 + (f65 * f36) + (f64 * f35);
        }
    }

    public static final void f(float[] fArr, float f10, float f11) {
        if (fArr.length < 16) {
            return;
        }
        float f12 = (fArr[8] * 0.0f) + (fArr[4] * f11) + (fArr[0] * f10) + fArr[12];
        float f13 = (fArr[9] * 0.0f) + (fArr[5] * f11) + (fArr[1] * f10) + fArr[13];
        float f14 = (fArr[10] * 0.0f) + (fArr[6] * f11) + (fArr[2] * f10) + fArr[14];
        float f15 = (fArr[11] * 0.0f) + (fArr[7] * f11) + (fArr[3] * f10) + fArr[15];
        fArr[12] = f12;
        fArr[13] = f13;
        fArr[14] = f14;
        fArr[15] = f15;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a0) {
            return i9.l.a(this.f14874a, ((a0) obj).f14874a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f14874a);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("\n            |");
        float[] fArr = this.f14874a;
        sb2.append(fArr[0]);
        sb2.append(' ');
        sb2.append(fArr[1]);
        sb2.append(' ');
        sb2.append(fArr[2]);
        sb2.append(' ');
        sb2.append(fArr[3]);
        sb2.append("|\n            |");
        sb2.append(fArr[4]);
        sb2.append(' ');
        sb2.append(fArr[5]);
        sb2.append(' ');
        sb2.append(fArr[6]);
        sb2.append(' ');
        sb2.append(fArr[7]);
        sb2.append("|\n            |");
        sb2.append(fArr[8]);
        sb2.append(' ');
        sb2.append(fArr[9]);
        sb2.append(' ');
        sb2.append(fArr[10]);
        sb2.append(' ');
        sb2.append(fArr[11]);
        sb2.append("|\n            |");
        sb2.append(fArr[12]);
        sb2.append(' ');
        sb2.append(fArr[13]);
        sb2.append(' ');
        sb2.append(fArr[14]);
        sb2.append(' ');
        sb2.append(fArr[15]);
        sb2.append("|\n        ");
        return zb.k.g0(sb2.toString());
    }
}
