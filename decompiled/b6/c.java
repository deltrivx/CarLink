package b6;

import java.util.Arrays;
import java.util.Map;
import n5.m;
import n5.o;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c extends h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f1523d = {52, 289, 97, 352, 49, 304, 112, 37, 292, 100, 265, 73, 328, 25, 280, 88, 13, 268, 76, 28, 259, 67, 322, 19, 274, 82, 7, 262, 70, 22, 385, 193, 448, 145, 400, 208, 133, 388, 196, 168, 162, 138, 42};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f1524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StringBuilder f1525b = new StringBuilder(20);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f1526c = new int[9];

    public c(boolean z10) {
        this.f1524a = z10;
    }

    public static int g(int[] iArr) {
        int length = iArr.length;
        int i7 = 0;
        while (true) {
            int i10 = Integer.MAX_VALUE;
            for (int i11 : iArr) {
                if (i11 < i10 && i11 > i7) {
                    i10 = i11;
                }
            }
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            for (int i15 = 0; i15 < length; i15++) {
                int i16 = iArr[i15];
                if (i16 > i10) {
                    i13 |= 1 << ((length - 1) - i15);
                    i12++;
                    i14 += i16;
                }
            }
            if (i12 == 3) {
                for (int i17 = 0; i17 < length && i12 > 0; i17++) {
                    int i18 = iArr[i17];
                    if (i18 > i10) {
                        i12--;
                        if ((i18 << 1) >= i14) {
                            return -1;
                        }
                    }
                }
                return i13;
            }
            if (i12 <= 3) {
                return -1;
            }
            i7 = i10;
        }
    }

    @Override // b6.h
    public final m b(int i7, t5.a aVar, Map map) throws n5.i, n5.c {
        int i10;
        char c10;
        char cCharAt;
        int[] iArr = this.f1526c;
        Arrays.fill(iArr, 0);
        StringBuilder sb2 = this.f1525b;
        sb2.setLength(0);
        int i11 = aVar.f12760b;
        int iE = aVar.e(0);
        int length = iArr.length;
        int i12 = iE;
        boolean z10 = false;
        int i13 = 0;
        while (iE < i11) {
            if (aVar.d(iE) != z10) {
                iArr[i13] = iArr[i13] + 1;
            } else {
                if (i13 == length - 1) {
                    int i14 = 148;
                    if (g(iArr) == 148 && aVar.h(Math.max(0, i12 - ((iE - i12) / 2)), i12)) {
                        int[] iArr2 = {i12, iE};
                        int iE2 = aVar.e(iArr2[1]);
                        int i15 = aVar.f12760b;
                        while (true) {
                            h.e(iE2, aVar, iArr);
                            int iG = g(iArr);
                            if (iG < 0) {
                                throw n5.i.f8833c;
                            }
                            int i16 = 0;
                            while (true) {
                                if (i16 >= 43) {
                                    c10 = 1;
                                    if (iG != i14) {
                                        throw n5.i.f8833c;
                                    }
                                    cCharAt = '*';
                                    break;
                                }
                                c10 = 1;
                                if (f1523d[i16] == iG) {
                                    cCharAt = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".charAt(i16);
                                    break;
                                }
                                i16++;
                            }
                            sb2.append(cCharAt);
                            int i17 = iE2;
                            for (int i18 : iArr) {
                                i17 += i18;
                            }
                            int iE3 = aVar.e(i17);
                            if (cCharAt == '*') {
                                sb2.setLength(sb2.length() - 1);
                                int i19 = 0;
                                for (int i20 : iArr) {
                                    i19 += i20;
                                }
                                int i21 = (iE3 - iE2) - i19;
                                if (iE3 != i15 && (i21 << 1) < i19) {
                                    throw n5.i.f8833c;
                                }
                                if (this.f1524a) {
                                    int length2 = sb2.length() - 1;
                                    int iIndexOf = 0;
                                    for (int i22 = 0; i22 < length2; i22++) {
                                        iIndexOf += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(sb2.charAt(i22));
                                    }
                                    if (sb2.charAt(length2) != "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".charAt(iIndexOf % 43)) {
                                        throw n5.c.a();
                                    }
                                    sb2.setLength(length2);
                                }
                                if (sb2.length() == 0) {
                                    throw n5.i.f8833c;
                                }
                                String string = sb2.toString();
                                float f10 = i7;
                                o oVar = new o((iArr2[c10] + iArr2[0]) / 2.0f, f10);
                                o oVar2 = new o((i19 / 2.0f) + iE2, f10);
                                o[] oVarArr = new o[2];
                                oVarArr[0] = oVar;
                                oVarArr[c10] = oVar2;
                                return new m(string, null, oVarArr, n5.a.f8792c);
                            }
                            iE2 = iE3;
                            i14 = 148;
                        }
                    } else {
                        i10 = 1;
                        i12 += iArr[0] + iArr[1];
                        int i23 = i13 - 1;
                        System.arraycopy(iArr, 2, iArr, 0, i23);
                        iArr[i23] = 0;
                        iArr[i13] = 0;
                        i13--;
                    }
                } else {
                    i10 = 1;
                    i13++;
                }
                iArr[i13] = i10;
                z10 = !z10;
            }
            iE++;
        }
        throw n5.i.f8833c;
    }
}
