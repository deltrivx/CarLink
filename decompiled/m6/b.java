package m6;

import f1.d1;
import java.util.Arrays;
import k6.g;
import n5.q;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f8556a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[][] f8557b = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[][] f8558c = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[][] f8559d = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, 118, -1, -1}, new int[]{6, 26, 50, 74, 98, 122, -1}, new int[]{6, 30, 54, 78, 102, 126, -1}, new int[]{6, 26, 52, 78, 104, 130, -1}, new int[]{6, 30, 56, 82, 108, 134, -1}, new int[]{6, 34, 60, 86, 112, 138, -1}, new int[]{6, 30, 58, 86, 114, 142, -1}, new int[]{6, 34, 62, 90, 118, 146, -1}, new int[]{6, 30, 54, 78, 102, 126, 150}, new int[]{6, 24, 50, 76, 102, 128, 154}, new int[]{6, 28, 54, 80, 106, 132, 158}, new int[]{6, 32, 58, 84, 110, 136, 162}, new int[]{6, 26, 54, 82, 110, 138, 166}, new int[]{6, 30, 58, 86, 114, 142, 170}};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[][] f8560e = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};

    public static int a(d1 d1Var, boolean z10) {
        int i7 = d1Var.f4930b;
        int i10 = d1Var.f4931c;
        int i11 = z10 ? i10 : i7;
        if (!z10) {
            i7 = i10;
        }
        byte[][] bArr = (byte[][]) d1Var.f4932d;
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            byte b10 = -1;
            int i14 = 0;
            for (int i15 = 0; i15 < i7; i15++) {
                byte b11 = z10 ? bArr[i13][i15] : bArr[i15][i13];
                if (b11 == b10) {
                    i14++;
                } else {
                    if (i14 >= 5) {
                        i12 += i14 - 2;
                    }
                    b10 = b11;
                    i14 = 1;
                }
            }
            if (i14 >= 5) {
                i12 = (i14 - 2) + i12;
            }
        }
        return i12;
    }

    /* JADX WARN: Code duplicated, block: B:117:0x0233  */
    /* JADX WARN: Code duplicated, block: B:118:0x0235  */
    /* JADX WARN: Code duplicated, block: B:120:0x0238  */
    /* JADX WARN: Multi-variable type inference failed */
    public static void b(t5.a aVar, int i7, g gVar, int i10, d1 d1Var) throws q {
        char c10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z10;
        int i16;
        int i17;
        byte[][] bArr = (byte[][]) d1Var.f4932d;
        int i18 = d1Var.f4930b;
        int i19 = d1Var.f4931c;
        for (byte[] bArr2 : bArr) {
            Arrays.fill(bArr2, (byte) -1);
        }
        int length = f8557b[0].length;
        e(0, 0, d1Var);
        int i20 = i18 - length;
        e(i20, 0, d1Var);
        e(0, i20, d1Var);
        d(0, 7, d1Var);
        int i21 = i18 - 8;
        d(i21, 7, d1Var);
        d(0, i21, d1Var);
        f(7, 0, d1Var);
        int i22 = i19 - 8;
        f(i22, 0, d1Var);
        int i23 = i19 - 7;
        f(7, i23, d1Var);
        if (d1Var.h(8, i22) == 0) {
            throw new q();
        }
        d1Var.i(8, i22, 1);
        int i24 = gVar.f7331a;
        if (i24 < 2) {
            c10 = 1;
        } else {
            c10 = 1;
            int[] iArr = f8559d[i24 - 1];
            int length2 = iArr.length;
            int i25 = 0;
            while (i25 < length2) {
                int i26 = iArr[i25];
                if (i26 >= 0) {
                    int length3 = iArr.length;
                    int i27 = 0;
                    while (i27 < length3) {
                        byte[][] bArr3 = bArr;
                        int i28 = iArr[i27];
                        if (i28 >= 0 && g(d1Var.h(i28, i26))) {
                            int i29 = i28 - 2;
                            int i30 = i26 - 2;
                            int i31 = 0;
                            while (true) {
                                if (i31 >= 5) {
                                    break;
                                }
                                int[] iArr2 = f8558c[i31];
                                int i32 = i31;
                                int i33 = 0;
                                for (int i34 = 5; i33 < i34; i34 = 5) {
                                    int i35 = i33;
                                    d1Var.i(i29 + i33, i30 + i32, iArr2[i35]);
                                    i33 = i35 + 1;
                                    i26 = i26;
                                }
                                i31 = i32 + 1;
                            }
                        }
                        i27++;
                        bArr = bArr3;
                        i18 = i18;
                        i26 = i26;
                    }
                }
                i25++;
                bArr = bArr;
                i18 = i18;
            }
        }
        byte[][] bArr4 = bArr;
        int i36 = i18;
        int i37 = 8;
        while (i37 < i21) {
            int i38 = i37 + 1;
            int i39 = i38 % 2;
            if (g(d1Var.h(i37, 6))) {
                d1Var.i(i37, 6, i39);
            }
            if (g(d1Var.h(6, i37))) {
                d1Var.i(6, i37, i39);
            }
            i37 = i38;
        }
        t5.a aVar2 = new t5.a();
        if (i10 < 0 || i10 >= 8) {
            throw new q("Invalid mask pattern");
        }
        int i40 = 1;
        if (i7 != 1) {
            i40 = 2;
            if (i7 == 2) {
                i40 = 0;
            } else if (i7 == 3) {
                i40 = 3;
            } else if (i7 != 4) {
                throw null;
            }
        }
        int i41 = (i40 << 3) | i10;
        aVar2.b(i41, 5);
        aVar2.b(c(i41, 1335), 10);
        t5.a aVar3 = new t5.a();
        aVar3.b(21522, 15);
        if (aVar2.f12760b != aVar3.f12760b) {
            throw new IllegalArgumentException("Sizes don't match");
        }
        int i42 = 0;
        while (true) {
            int[] iArr3 = aVar2.f12759a;
            if (i42 >= iArr3.length) {
                break;
            }
            iArr3[i42] = iArr3[i42] ^ aVar3.f12759a[i42];
            i42++;
        }
        if (aVar2.f12760b != 15) {
            throw new q("should not happen but we got: " + aVar2.f12760b);
        }
        int i43 = 0;
        while (true) {
            int i44 = aVar2.f12760b;
            if (i43 >= i44) {
                break;
            }
            boolean zD = aVar2.d((i44 - 1) - i43);
            int[] iArr4 = f8560e[i43];
            int i45 = iArr4[0];
            byte[] bArr5 = bArr4[iArr4[c10]];
            byte b10 = zD ? (byte) 1 : (byte) 0;
            bArr5[i45] = b10;
            if (i43 < 8) {
                i17 = (i36 - i43) - 1;
                i16 = 8;
            } else {
                i16 = (i43 - 8) + i23;
                i17 = 8;
            }
            bArr4[i16][i17] = b10;
            i43++;
        }
        if (i24 >= 7) {
            t5.a aVar4 = new t5.a();
            aVar4.b(i24, 6);
            aVar4.b(c(i24, 7973), 12);
            if (aVar4.f12760b != 18) {
                throw new q("should not happen but we got: " + aVar4.f12760b);
            }
            int i46 = 17;
            for (int i47 = 0; i47 < 6; i47++) {
                for (int i48 = 0; i48 < 3; i48++) {
                    boolean zD2 = aVar4.d(i46);
                    i46--;
                    int i49 = (i19 - 11) + i48;
                    byte[] bArr6 = bArr4[i49];
                    byte b11 = zD2 ? (byte) 1 : (byte) 0;
                    bArr6[i47] = b11;
                    bArr4[i47][i49] = b11;
                }
            }
        }
        int i50 = i36 - 1;
        int i51 = i19 - 1;
        int i52 = 0;
        int i53 = -1;
        while (i50 > 0) {
            if (i50 == 6) {
                i50--;
            }
            while (i51 >= 0 && i51 < i19) {
                for (int i54 = 0; i54 < 2; i54++) {
                    int i55 = i50 - i54;
                    if (g(d1Var.h(i55, i51))) {
                        if (i52 < aVar.f12760b) {
                            boolean zD3 = aVar.d(i52);
                            i52++;
                            i11 = zD3;
                        } else {
                            i11 = 0;
                        }
                        if (i10 != -1) {
                            switch (i10) {
                                case 0:
                                    i12 = i51 + i55;
                                    i13 = i12 & 1;
                                    if (i13 == 0) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    if (z10) {
                                        i11 = ~i11;
                                    }
                                    break;
                                case 1:
                                    i13 = i51 & 1;
                                    if (i13 == 0) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    if (z10) {
                                        i11 = ~i11;
                                    }
                                    break;
                                case 2:
                                    i13 = i55 % 3;
                                    if (i13 == 0) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    if (z10) {
                                        i11 = ~i11;
                                    }
                                    break;
                                case 3:
                                    i13 = (i51 + i55) % 3;
                                    if (i13 == 0) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    if (z10) {
                                        i11 = ~i11;
                                    }
                                    break;
                                case 4:
                                    i13 = ((i55 / 3) + (i51 / 2)) & 1;
                                    if (i13 == 0) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    if (z10) {
                                        i11 = ~i11;
                                    }
                                    break;
                                case 5:
                                    int i56 = i51 * i55;
                                    i13 = (i56 % 3) + (i56 & 1);
                                    if (i13 == 0) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    if (z10) {
                                        i11 = ~i11;
                                    }
                                    break;
                                case 6:
                                    int i57 = i51 * i55;
                                    i14 = i57 & 1;
                                    i15 = i57 % 3;
                                    i12 = i15 + i14;
                                    i13 = i12 & 1;
                                    if (i13 == 0) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    if (z10) {
                                        i11 = ~i11;
                                    }
                                    break;
                                case 7:
                                    i15 = (i51 * i55) % 3;
                                    i14 = (i51 + i55) & 1;
                                    i12 = i15 + i14;
                                    i13 = i12 & 1;
                                    if (i13 == 0) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    if (z10) {
                                        i11 = ~i11;
                                    }
                                    break;
                                default:
                                    throw new IllegalArgumentException("Invalid mask pattern: ".concat(String.valueOf(i10)));
                            }
                        }
                        bArr4[i51][i55] = (byte) i11;
                    }
                }
                i51 += i53;
            }
            i53 = -i53;
            i51 += i53;
            i50 -= 2;
        }
        if (i52 == aVar.f12760b) {
            return;
        }
        throw new q("Not all bits consumed: " + i52 + '/' + aVar.f12760b);
    }

    public static int c(int i7, int i10) {
        if (i10 == 0) {
            throw new IllegalArgumentException("0 polynomial");
        }
        int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i10);
        int i11 = 32 - iNumberOfLeadingZeros;
        int iNumberOfLeadingZeros2 = i7 << (31 - iNumberOfLeadingZeros);
        while (32 - Integer.numberOfLeadingZeros(iNumberOfLeadingZeros2) >= i11) {
            iNumberOfLeadingZeros2 ^= i10 << ((32 - Integer.numberOfLeadingZeros(iNumberOfLeadingZeros2)) - i11);
        }
        return iNumberOfLeadingZeros2;
    }

    public static void d(int i7, int i10, d1 d1Var) throws q {
        for (int i11 = 0; i11 < 8; i11++) {
            int i12 = i7 + i11;
            if (!g(d1Var.h(i12, i10))) {
                throw new q();
            }
            d1Var.i(i12, i10, 0);
        }
    }

    public static void e(int i7, int i10, d1 d1Var) {
        for (int i11 = 0; i11 < 7; i11++) {
            int[] iArr = f8557b[i11];
            for (int i12 = 0; i12 < 7; i12++) {
                d1Var.i(i7 + i12, i10 + i11, iArr[i12]);
            }
        }
    }

    public static void f(int i7, int i10, d1 d1Var) throws q {
        for (int i11 = 0; i11 < 7; i11++) {
            int i12 = i10 + i11;
            if (!g(d1Var.h(i7, i12))) {
                throw new q();
            }
            d1Var.i(i7, i12, 0);
        }
    }

    public static boolean g(int i7) {
        return i7 == -1;
    }
}
