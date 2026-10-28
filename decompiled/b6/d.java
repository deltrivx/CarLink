package b6;

import java.util.Arrays;
import java.util.Map;
import n5.m;
import n5.o;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d extends h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final char[] f1527c = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".toCharArray();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f1528d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f1529e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringBuilder f1530a = new StringBuilder(20);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f1531b = new int[6];

    static {
        int[] iArr = {276, 328, 324, 322, 296, 292, 290, 336, 274, 266, 424, 420, 418, 404, 402, 394, 360, 356, 354, 308, 282, 344, 332, 326, 300, 278, 436, 434, 428, 422, 406, 410, 364, 358, 310, 314, 302, 468, 466, 458, 366, 374, 430, 294, 474, 470, 306, 350};
        f1528d = iArr;
        f1529e = iArr[47];
    }

    public static void g(CharSequence charSequence, int i7, int i10) throws n5.c {
        int iIndexOf = 0;
        int i11 = 1;
        for (int i12 = i7 - 1; i12 >= 0; i12--) {
            iIndexOf += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(charSequence.charAt(i12)) * i11;
            i11++;
            if (i11 > i10) {
                i11 = 1;
            }
        }
        if (charSequence.charAt(i7) != f1527c[iIndexOf % 47]) {
            throw n5.c.a();
        }
    }

    public static int h(int[] iArr) {
        int i7 = 0;
        for (int i10 : iArr) {
            i7 += i10;
        }
        int length = iArr.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            int iRound = Math.round((iArr[i12] * 9.0f) / i7);
            if (iRound <= 0 || iRound > 4) {
                return -1;
            }
            if ((i12 & 1) == 0) {
                for (int i13 = 0; i13 < iRound; i13++) {
                    i11 = (i11 << 1) | 1;
                }
            } else {
                i11 <<= iRound;
            }
        }
        return i11;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:42:0x00d9  */
    @Override // b6.h
    public final m b(int i7, t5.a aVar, Map map) throws n5.i, n5.f, n5.c {
        int i10;
        char c10;
        int i11 = aVar.f12760b;
        int iE = aVar.e(0);
        int[] iArr = this.f1531b;
        Arrays.fill(iArr, 0);
        int length = iArr.length;
        int i12 = iE;
        boolean z10 = false;
        int i13 = 0;
        while (iE < i11) {
            if (aVar.d(iE) != z10) {
                iArr[i13] = iArr[i13] + 1;
            } else {
                if (i13 != length - 1) {
                    i13++;
                } else if (h(iArr) == f1529e) {
                    int[] iArr2 = {i12, iE};
                    int iE2 = aVar.e(iArr2[1]);
                    int i14 = aVar.f12760b;
                    Arrays.fill(iArr, 0);
                    StringBuilder sb2 = this.f1530a;
                    sb2.setLength(0);
                    while (true) {
                        h.e(iE2, aVar, iArr);
                        int iH = h(iArr);
                        if (iH < 0) {
                            throw n5.i.f8833c;
                        }
                        int i15 = 0;
                        while (true) {
                            int[] iArr3 = f1528d;
                            if (i15 >= iArr3.length) {
                                throw n5.i.f8833c;
                            }
                            if (iArr3[i15] == iH) {
                                break;
                            }
                            i15++;
                        }
                        char c11 = f1527c[i15];
                        sb2.append(c11);
                        int i16 = iE2;
                        for (int i17 : iArr) {
                            i16 += i17;
                        }
                        int iE3 = aVar.e(i16);
                        if (c11 == '*') {
                            sb2.deleteCharAt(sb2.length() - 1);
                            int i18 = 0;
                            for (int i19 : iArr) {
                                i18 += i19;
                            }
                            if (iE3 == i14 || !aVar.d(iE3)) {
                                throw n5.i.f8833c;
                            }
                            if (sb2.length() < 2) {
                                throw n5.i.f8833c;
                            }
                            int length2 = sb2.length();
                            g(sb2, length2 - 2, 20);
                            g(sb2, length2 - 1, 15);
                            sb2.setLength(sb2.length() - 2);
                            int length3 = sb2.length();
                            StringBuilder sb3 = new StringBuilder(length3);
                            int i20 = 0;
                            while (i20 < length3) {
                                char cCharAt = sb2.charAt(i20);
                                if (cCharAt >= 'a' && cCharAt <= 'd') {
                                    if (i20 >= length3 - 1) {
                                        throw n5.f.a();
                                    }
                                    i20++;
                                    char cCharAt2 = sb2.charAt(i20);
                                    switch (cCharAt) {
                                        case 'a':
                                            if (cCharAt2 < 'A' || cCharAt2 > 'Z') {
                                                throw n5.f.a();
                                            }
                                            i10 = cCharAt2 - '@';
                                            c10 = (char) i10;
                                            sb3.append(c10);
                                            break;
                                            break;
                                        case 'b':
                                            if (cCharAt2 >= 'A' && cCharAt2 <= 'E') {
                                                i10 = cCharAt2 - '&';
                                            } else if (cCharAt2 >= 'F' && cCharAt2 <= 'J') {
                                                i10 = cCharAt2 - 11;
                                            } else if (cCharAt2 < 'K' || cCharAt2 > 'O') {
                                                if (cCharAt2 >= 'P' && cCharAt2 <= 'T') {
                                                    i10 = cCharAt2 + '+';
                                                } else if (cCharAt2 == 'U') {
                                                    c10 = 0;
                                                } else if (cCharAt2 == 'V') {
                                                    c10 = '@';
                                                } else if (cCharAt2 == 'W') {
                                                    c10 = '`';
                                                } else {
                                                    if (cCharAt2 < 'X' || cCharAt2 > 'Z') {
                                                        throw n5.f.a();
                                                    }
                                                    c10 = 127;
                                                }
                                                sb3.append(c10);
                                            } else {
                                                i10 = cCharAt2 + 16;
                                            }
                                            c10 = (char) i10;
                                            sb3.append(c10);
                                            break;
                                        case 'c':
                                            if (cCharAt2 >= 'A' && cCharAt2 <= 'O') {
                                                i10 = cCharAt2 - ' ';
                                                c10 = (char) i10;
                                            } else {
                                                if (cCharAt2 != 'Z') {
                                                    throw n5.f.a();
                                                }
                                                c10 = ':';
                                            }
                                            sb3.append(c10);
                                            break;
                                        case 'd':
                                            if (cCharAt2 < 'A' || cCharAt2 > 'Z') {
                                                throw n5.f.a();
                                            }
                                            i10 = cCharAt2 + ' ';
                                            c10 = (char) i10;
                                            sb3.append(c10);
                                            break;
                                            break;
                                        default:
                                            c10 = 0;
                                            sb3.append(c10);
                                            break;
                                    }
                                } else {
                                    sb3.append(cCharAt);
                                }
                                i20++;
                            }
                            float f10 = i7;
                            return new m(sb3.toString(), null, new o[]{new o((iArr2[1] + iArr2[0]) / 2.0f, f10), new o((i18 / 2.0f) + iE2, f10)}, n5.a.f8793d);
                        }
                        iE2 = iE3;
                    }
                } else {
                    i12 += iArr[0] + iArr[1];
                    int i21 = i13 - 1;
                    System.arraycopy(iArr, 2, iArr, 0, i21);
                    iArr[i21] = 0;
                    iArr[i13] = 0;
                    i13--;
                }
                iArr[i13] = 1;
                z10 = !z10;
            }
            iE++;
        }
        throw n5.i.f8833c;
    }
}
