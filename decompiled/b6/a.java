package b6;

import java.util.Arrays;
import java.util.Map;
import n5.m;
import n5.o;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a extends h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final char[] f1516d = "0123456789-$:/.+ABCD".toCharArray();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f1517e = {3, 6, 9, 96, 18, 66, 33, 36, 48, 72, 12, 24, 69, 81, 84, 21, 26, 41, 11, 14};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final char[] f1518f = {'A', 'B', 'C', 'D'};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringBuilder f1519a = new StringBuilder(20);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f1520b = new int[80];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1521c = 0;

    public static boolean g(char[] cArr, char c10) {
        if (cArr != null) {
            for (char c11 : cArr) {
                if (c11 == c10) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // b6.h
    public final m b(int i7, t5.a aVar, Map map) throws n5.i {
        int i10;
        int[] iArr;
        int i11 = 0;
        Arrays.fill(this.f1520b, 0);
        this.f1521c = 0;
        int iF = aVar.f(0);
        int i12 = aVar.f12760b;
        if (iF >= i12) {
            throw n5.i.f8833c;
        }
        int i13 = 1;
        int i14 = 0;
        boolean z10 = true;
        while (iF < i12) {
            if (aVar.d(iF) != z10) {
                i14++;
            } else {
                int[] iArr2 = this.f1520b;
                int i15 = this.f1521c;
                iArr2[i15] = i14;
                int i16 = i15 + 1;
                this.f1521c = i16;
                if (i16 >= iArr2.length) {
                    int[] iArr3 = new int[i16 << 1];
                    System.arraycopy(iArr2, 0, iArr3, 0, i16);
                    this.f1520b = iArr3;
                }
                z10 = !z10;
                i14 = 1;
            }
            iF++;
        }
        int[] iArr4 = this.f1520b;
        int i17 = this.f1521c;
        iArr4[i17] = i14;
        int i18 = i17 + 1;
        this.f1521c = i18;
        if (i18 >= iArr4.length) {
            int[] iArr5 = new int[i18 << 1];
            System.arraycopy(iArr4, 0, iArr5, 0, i18);
            this.f1520b = iArr5;
        }
        int i19 = 1;
        while (i19 < this.f1521c) {
            int iH = h(i19);
            if (iH != -1) {
                char[] cArr = f1516d;
                char c10 = cArr[iH];
                char[] cArr2 = f1518f;
                if (g(cArr2, c10)) {
                    int i20 = 0;
                    for (int i21 = i19; i21 < i19 + 7; i21++) {
                        i20 += this.f1520b[i21];
                    }
                    if (i19 == i13 || this.f1520b[i19 - 1] >= i20 / 2) {
                        StringBuilder sb2 = this.f1519a;
                        sb2.setLength(i11);
                        int i22 = i19;
                        while (true) {
                            int iH2 = h(i22);
                            if (iH2 == -1) {
                                throw n5.i.f8833c;
                            }
                            sb2.append((char) iH2);
                            i10 = i22 + 8;
                            if ((sb2.length() > i13 && g(cArr2, cArr[iH2])) || i10 >= this.f1521c) {
                                break;
                            }
                            i22 = i10;
                            i13 = 1;
                        }
                        int i23 = i22 + 7;
                        int i24 = this.f1520b[i23];
                        int i25 = 0;
                        for (int i26 = -8; i26 < -1; i26++) {
                            i25 += this.f1520b[i10 + i26];
                        }
                        if (i10 < this.f1521c && i24 < i25 / 2) {
                            throw n5.i.f8833c;
                        }
                        int[] iArr6 = new int[4];
                        iArr6[i11] = i11;
                        iArr6[i13] = i11;
                        iArr6[2] = i11;
                        iArr6[3] = i11;
                        int[] iArr7 = new int[4];
                        iArr7[i11] = i11;
                        iArr7[i13] = i11;
                        iArr7[2] = i11;
                        iArr7[3] = i11;
                        int length = sb2.length() - i13;
                        int i27 = i19;
                        int i28 = 0;
                        while (true) {
                            char cCharAt = sb2.charAt(i28);
                            iArr = f1517e;
                            int i29 = iArr[cCharAt];
                            for (int i30 = 6; i30 >= 0; i30--) {
                                int i31 = (i30 & 1) + ((i29 & 1) << 1);
                                iArr6[i31] = iArr6[i31] + this.f1520b[i27 + i30];
                                iArr7[i31] = iArr7[i31] + 1;
                                i29 >>= 1;
                            }
                            if (i28 >= length) {
                                break;
                            }
                            i27 += 8;
                            i28++;
                        }
                        float[] fArr = new float[4];
                        float[] fArr2 = new float[4];
                        int i32 = 0;
                        for (int i33 = 2; i32 < i33; i33 = 2) {
                            fArr2[i32] = 0.0f;
                            int i34 = i32 + 2;
                            float f10 = iArr6[i32] / iArr7[i32];
                            float f11 = iArr6[i34];
                            float f12 = iArr7[i34];
                            float f13 = ((f11 / f12) + f10) / 2.0f;
                            fArr2[i34] = f13;
                            fArr[i32] = f13;
                            fArr[i34] = ((f11 * 2.0f) + 1.5f) / f12;
                            i32++;
                        }
                        int i35 = i19;
                        int i36 = 0;
                        loop8: while (true) {
                            int i37 = iArr[sb2.charAt(i36)];
                            for (int i38 = 6; i38 >= 0; i38--) {
                                int i39 = (i38 & 1) + ((i37 & 1) << 1);
                                float f14 = this.f1520b[i35 + i38];
                                if (f14 < fArr2[i39] || f14 > fArr[i39]) {
                                    break loop8;
                                }
                                i37 >>= 1;
                            }
                            if (i36 >= length) {
                                for (int i40 = 0; i40 < sb2.length(); i40++) {
                                    sb2.setCharAt(i40, cArr[sb2.charAt(i40)]);
                                }
                                if (!g(cArr2, sb2.charAt(0))) {
                                    throw n5.i.f8833c;
                                }
                                if (!g(cArr2, sb2.charAt(sb2.length() - 1))) {
                                    throw n5.i.f8833c;
                                }
                                if (sb2.length() <= 3) {
                                    throw n5.i.f8833c;
                                }
                                if (map == null || !map.containsKey(n5.d.RETURN_CODABAR_START_END)) {
                                    sb2.deleteCharAt(sb2.length() - 1);
                                    sb2.deleteCharAt(0);
                                }
                                int i41 = 0;
                                for (int i42 = 0; i42 < i19; i42++) {
                                    i41 += this.f1520b[i42];
                                }
                                float f15 = i41;
                                while (i19 < i23) {
                                    i41 += this.f1520b[i19];
                                    i19++;
                                }
                                float f16 = i7;
                                return new m(sb2.toString(), null, new o[]{new o(f15, f16), new o(i41, f16)}, n5.a.f8791b);
                            }
                            i35 += 8;
                            i36++;
                        }
                        throw n5.i.f8833c;
                    }
                }
            }
            i19 += 2;
            i11 = 0;
            i13 = 1;
        }
        throw n5.i.f8833c;
    }

    public final int h(int i7) {
        int i10 = i7 + 7;
        if (i10 >= this.f1521c) {
            return -1;
        }
        int[] iArr = this.f1520b;
        int i11 = Integer.MAX_VALUE;
        int i12 = 0;
        int i13 = Integer.MAX_VALUE;
        int i14 = 0;
        for (int i15 = i7; i15 < i10; i15 += 2) {
            int i16 = iArr[i15];
            if (i16 < i13) {
                i13 = i16;
            }
            if (i16 > i14) {
                i14 = i16;
            }
        }
        int i17 = (i13 + i14) / 2;
        int i18 = 0;
        for (int i19 = i7 + 1; i19 < i10; i19 += 2) {
            int i20 = iArr[i19];
            if (i20 < i11) {
                i11 = i20;
            }
            if (i20 > i18) {
                i18 = i20;
            }
        }
        int i21 = (i11 + i18) / 2;
        int i22 = 128;
        int i23 = 0;
        for (int i24 = 0; i24 < 7; i24++) {
            i22 >>= 1;
            if (iArr[i7 + i24] > ((i24 & 1) == 0 ? i17 : i21)) {
                i23 |= i22;
            }
        }
        while (true) {
            int[] iArr2 = f1517e;
            if (i12 >= iArr2.length) {
                return -1;
            }
            if (iArr2[i12] == i23) {
                return i12;
            }
            i12++;
        }
    }
}
