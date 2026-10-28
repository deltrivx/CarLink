package v;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f13479a = 0;

    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
    static {
        char c10;
        float[] fArr;
        n4.e[] eVarArr;
        char c11;
        int i7;
        float[][] fArr2 = {new float[2], new float[2]};
        int i10 = new int[2][0];
        char c12 = 3;
        if (i10 == 0) {
            c10 = 3;
        } else if (i10 == 1) {
            c10 = 1;
        } else if (i10 == 2 || i10 == 3) {
            c10 = 2;
        } else if (i10 == 4) {
            c10 = 4;
        } else if (i10 != 5) {
            c10 = 1;
        } else {
            c10 = 5;
        }
        float[] fArr3 = fArr2[0];
        float[] fArr4 = fArr2[1];
        int length = (fArr3.length % 2) + (fArr3.length / 2);
        n4.e[] eVarArr2 = new n4.e[length];
        int i11 = 0;
        while (i11 < length) {
            int i12 = i11 * 2;
            float f10 = fArr3[i12];
            int i13 = i12 + 1;
            float f11 = fArr3[i13];
            float f12 = fArr4[i12];
            float f13 = fArr4[i13];
            n4.e eVar = new n4.e(16);
            float f14 = f12 - f10;
            float f15 = f13 - f11;
            float[] fArr5 = new float[101];
            if (c10 != c12 && Math.abs(f14) >= 0.001f && Math.abs(f15) >= 0.001f) {
                float f16 = f11 - f13;
                float[] fArr6 = d.f13344i;
                int i14 = 90;
                float f17 = 90;
                float f18 = f16;
                int i15 = 1;
                float fHypot = 0.0f;
                float f19 = 0.0f;
                while (true) {
                    fArr = fArr3;
                    eVarArr = eVarArr2;
                    c11 = c10;
                    double radians = (float) Math.toRadians((((double) i15) * 90.0d) / ((double) i14));
                    float fSin = ((float) Math.sin(radians)) * f14;
                    float fCos = ((float) Math.cos(radians)) * f16;
                    float f20 = fCos - f18;
                    i7 = i11;
                    fHypot += (float) Math.hypot(fSin - f19, f20);
                    fArr6[i15] = fHypot;
                    if (i15 == 90) {
                        break;
                    }
                    i15++;
                    f19 = fSin;
                    i11 = i7;
                    c10 = c11;
                    fArr3 = fArr;
                    i14 = 90;
                    f18 = fCos;
                    eVarArr2 = eVarArr;
                }
                int i16 = 1;
                while (true) {
                    fArr6[i16] = fArr6[i16] / fHypot;
                    if (i16 == 90) {
                        break;
                    } else {
                        i16++;
                    }
                }
                for (int i17 = 0; i17 < 101; i17++) {
                    float f21 = i17 / 100.0f;
                    int iBinarySearch = Arrays.binarySearch(fArr6, 0, 91, f21);
                    if (iBinarySearch >= 0) {
                        fArr5[i17] = iBinarySearch / f17;
                    } else if (iBinarySearch == -1) {
                        fArr5[i17] = 0.0f;
                    } else {
                        int i18 = -iBinarySearch;
                        int i19 = i18 - 2;
                        float f22 = i19;
                        float f23 = fArr6[i19];
                        fArr5[i17] = (((f21 - f23) / (fArr6[i18 - 1] - f23)) + f22) / f17;
                    }
                }
            } else {
                eVarArr = eVarArr2;
                c11 = c10;
                fArr = fArr3;
                i7 = i11;
                Math.hypot(f15, f14);
            }
            eVarArr[i7] = eVar;
            i11 = i7 + 1;
            c10 = c11;
            eVarArr2 = eVarArr;
            fArr3 = fArr;
            c12 = 3;
        }
    }
}
