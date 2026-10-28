package b6;

import java.util.Map;
import n5.m;
import n5.o;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class f extends h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f1536b = {6, 8, 10, 12, 14};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f1537c = {1, 1, 1, 1};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[][] f1538d = {new int[]{1, 1, 2}, new int[]{1, 1, 3}};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[][] f1539e = {new int[]{1, 1, 2, 2, 1}, new int[]{2, 1, 1, 1, 2}, new int[]{1, 2, 1, 1, 2}, new int[]{2, 2, 1, 1, 1}, new int[]{1, 1, 2, 1, 2}, new int[]{2, 1, 2, 1, 1}, new int[]{1, 2, 2, 1, 1}, new int[]{1, 1, 1, 2, 2}, new int[]{2, 1, 1, 2, 1}, new int[]{1, 2, 1, 2, 1}, new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1540a = -1;

    public static int g(int[] iArr) throws n5.i {
        float f10 = 0.38f;
        int i7 = -1;
        for (int i10 = 0; i10 < 20; i10++) {
            float fD = h.d(iArr, f1539e[i10], 0.5f);
            if (fD < f10) {
                i7 = i10;
                f10 = fD;
            } else if (fD == f10) {
                i7 = -1;
            }
        }
        if (i7 >= 0) {
            return i7 % 10;
        }
        throw n5.i.f8833c;
    }

    public static int[] h(int i7, t5.a aVar, int[] iArr) throws n5.i {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        int i10 = aVar.f12760b;
        int i11 = i7;
        boolean z10 = false;
        int i12 = 0;
        while (i7 < i10) {
            if (aVar.d(i7) != z10) {
                iArr2[i12] = iArr2[i12] + 1;
            } else {
                if (i12 != length - 1) {
                    i12++;
                } else {
                    if (h.d(iArr2, iArr, 0.5f) < 0.38f) {
                        return new int[]{i11, i7};
                    }
                    i11 += iArr2[0] + iArr2[1];
                    int i13 = i12 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i13);
                    iArr2[i13] = 0;
                    iArr2[i12] = 0;
                    i12--;
                }
                iArr2[i12] = 1;
                z10 = !z10;
            }
            i7++;
        }
        throw n5.i.f8833c;
    }

    @Override // b6.h
    public final m b(int i7, t5.a aVar, Map map) throws n5.i, n5.f {
        int[] iArrH;
        int[] iArr;
        int length;
        int length2;
        int i10;
        int i11;
        boolean z10;
        int i12 = aVar.f12760b;
        int iE = aVar.e(0);
        if (iE == i12) {
            throw n5.i.f8833c;
        }
        int[] iArrH2 = h(iE, aVar, f1537c);
        int i13 = iArrH2[1];
        int i14 = iArrH2[0];
        this.f1540a = (i13 - i14) / 4;
        i(aVar, i14);
        int[][] iArr2 = f1538d;
        aVar.i();
        try {
            int i15 = aVar.f12760b;
            int iE2 = aVar.e(0);
            if (iE2 == i15) {
                throw n5.i.f8833c;
            }
            try {
                iArrH = h(iE2, aVar, iArr2[0]);
                while (true) {
                    if (i10 >= length2) {
                        z10 = false;
                        break;
                    }
                    int i16 = iArr[i10];
                    if (length == i16) {
                        z10 = true;
                        break;
                    }
                    if (i16 > i11) {
                        i11 = i16;
                    }
                    i10++;
                }
            } catch (n5.i unused) {
                iArrH = h(iE2, aVar, iArr2[1]);
            }
            i(aVar, iArrH[0]);
            int i17 = iArrH[0];
            int i18 = aVar.f12760b;
            iArrH[0] = i18 - iArrH[1];
            iArrH[1] = i18 - i17;
            aVar.i();
            StringBuilder sb2 = new StringBuilder(20);
            int i19 = iArrH2[1];
            int i20 = iArrH[0];
            int[] iArr3 = new int[10];
            int[] iArr4 = new int[5];
            int[] iArr5 = new int[5];
            while (i19 < i20) {
                h.e(i19, aVar, iArr3);
                for (int i21 = 0; i21 < 5; i21++) {
                    int i22 = i21 * 2;
                    iArr4[i21] = iArr3[i22];
                    iArr5[i21] = iArr3[i22 + 1];
                }
                sb2.append((char) (g(iArr4) + 48));
                sb2.append((char) (g(iArr5) + 48));
                for (int i23 = 0; i23 < 10; i23++) {
                    i19 += iArr3[i23];
                }
            }
            String string = sb2.toString();
            iArr = map != null ? (int[]) map.get(n5.d.ALLOWED_LENGTHS) : null;
            if (iArr == null) {
                iArr = f1536b;
            }
            length = string.length();
            length2 = iArr.length;
            i10 = 0;
            i11 = 0;
            if (!z10 && length > i11) {
                z10 = true;
            }
            if (!z10) {
                throw n5.f.a();
            }
            float f10 = i7;
            return new m(string, null, new o[]{new o(iArrH2[1], f10), new o(iArrH[0], f10)}, n5.a.f8798i);
        } catch (Throwable th) {
            aVar.i();
            throw th;
        }
    }

    public final void i(t5.a aVar, int i7) throws n5.i {
        int iMin = Math.min(this.f1540a * 10, i7);
        for (int i10 = i7 - 1; iMin > 0 && i10 >= 0 && !aVar.d(i10); i10--) {
            iMin--;
        }
        if (iMin != 0) {
            throw n5.i.f8833c;
        }
    }
}
