package i6;

import java.util.ArrayList;
import java.util.Arrays;
import n5.o;
import t5.b;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f6652a = {0, 4, 1, 5};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f6653b = {6, 2, 7, 3};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f6654c = {8, 1, 1, 1, 1, 1, 1, 3};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f6655d = {7, 1, 1, 3, 1, 1, 1, 2, 1};

    public static ArrayList a(b bVar) {
        ArrayList arrayList = new ArrayList();
        int i7 = bVar.f12762b;
        if (i7 > 0) {
            int i10 = bVar.f12761a;
            o[] oVarArr = new o[8];
            int i11 = 0;
            int i12 = 0;
            o[] oVarArrC = c(bVar, i7, i10, 0, 0, f6654c);
            for (int i13 = 0; i13 < 4; i13++) {
                oVarArr[f6652a[i13]] = oVarArrC[i13];
            }
            o oVar = oVarArr[4];
            if (oVar != null) {
                i12 = (int) oVar.f8854a;
                i11 = (int) oVar.f8855b;
            }
            o[] oVarArrC2 = c(bVar, i7, i10, i11, i12, f6655d);
            for (int i14 = 0; i14 < 4; i14++) {
                oVarArr[f6653b[i14]] = oVarArrC2[i14];
            }
            if (oVarArr[0] != null || oVarArr[3] != null) {
                arrayList.add(oVarArr);
            }
        }
        return arrayList;
    }

    public static int[] b(b bVar, int i7, int i10, int i11, int[] iArr, int[] iArr2) {
        Arrays.fill(iArr2, 0, iArr2.length, 0);
        int i12 = 0;
        while (bVar.b(i7, i10) && i7 > 0) {
            int i13 = i12 + 1;
            if (i12 >= 3) {
                break;
            }
            i7--;
            i12 = i13;
        }
        int length = iArr.length;
        int i14 = i7;
        int i15 = 0;
        boolean z10 = false;
        while (i7 < i11) {
            if (bVar.b(i7, i10) != z10) {
                iArr2[i15] = iArr2[i15] + 1;
            } else {
                if (i15 != length - 1) {
                    i15++;
                } else {
                    if (d(iArr2, iArr) < 0.42f) {
                        return new int[]{i14, i7};
                    }
                    i14 += iArr2[0] + iArr2[1];
                    int i16 = i15 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i16);
                    iArr2[i16] = 0;
                    iArr2[i15] = 0;
                    i15--;
                }
                iArr2[i15] = 1;
                z10 = !z10;
            }
            i7++;
        }
        if (i15 != length - 1 || d(iArr2, iArr) >= 0.42f) {
            return null;
        }
        return new int[]{i14, i7 - 1};
    }

    public static o[] c(b bVar, int i7, int i10, int i11, int i12, int[] iArr) {
        int i13;
        boolean z10;
        int[] iArrB;
        o[] oVarArr = new o[4];
        int[] iArr2 = iArr;
        int[] iArr3 = new int[iArr2.length];
        int i14 = i11;
        while (true) {
            if (i14 >= i7) {
                i13 = i14;
                z10 = false;
                break;
            }
            int[] iArrB2 = b(bVar, i12, i14, i10, iArr2, iArr3);
            if (iArrB2 != null) {
                int[] iArr4 = iArrB2;
                while (true) {
                    i13 = i14;
                    if (i13 <= 0 || (iArrB = b(bVar, i12, (i14 = i13 - 1), i10, iArr, iArr3)) == null) {
                        break;
                    }
                    iArr4 = iArrB;
                }
                float f10 = i13;
                oVarArr[0] = new o(iArr4[0], f10);
                oVarArr[1] = new o(iArr4[1], f10);
                z10 = true;
                break;
            }
            i14 += 5;
            iArr2 = iArr;
        }
        int i15 = i13 + 1;
        if (z10) {
            int[] iArr5 = {(int) oVarArr[0].f8854a, (int) oVarArr[1].f8854a};
            int i16 = i15;
            int i17 = 0;
            while (i16 < i7) {
                int[] iArrB3 = b(bVar, iArr5[0], i16, i10, iArr, iArr3);
                if (iArrB3 != null && Math.abs(iArr5[0] - iArrB3[0]) < 5 && Math.abs(iArr5[1] - iArrB3[1]) < 5) {
                    iArr5 = iArrB3;
                    i17 = 0;
                } else {
                    if (i17 > 25) {
                        break;
                    }
                    i17++;
                }
                i16++;
            }
            i15 = i16 - (i17 + 1);
            float f11 = i15;
            oVarArr[2] = new o(iArr5[0], f11);
            oVarArr[3] = new o(iArr5[1], f11);
        }
        if (i15 - i13 < 10) {
            Arrays.fill(oVarArr, (Object) null);
        }
        return oVarArr;
    }

    public static float d(int[] iArr, int[] iArr2) {
        int length = iArr.length;
        int i7 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            i7 += iArr[i11];
            i10 += iArr2[i11];
        }
        if (i7 < i10) {
            return Float.POSITIVE_INFINITY;
        }
        float f10 = i7;
        float f11 = f10 / i10;
        float f12 = 0.8f * f11;
        float f13 = 0.0f;
        for (int i12 = 0; i12 < length; i12++) {
            int i13 = iArr[i12];
            float f14 = iArr2[i12] * f11;
            float f15 = i13;
            float f16 = f15 > f14 ? f15 - f14 : f14 - f15;
            if (f16 > f12) {
                return Float.POSITIVE_INFINITY;
            }
            f13 += f16;
        }
        return f13 / f10;
    }
}
