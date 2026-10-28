package p5;

import java.util.Arrays;
import l0.o0;
import n5.f;
import n5.l;
import t5.b;
import t5.d;
import v5.c;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f10285b = {"CTRL_PS", " ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "CTRL_LL", "CTRL_ML", "CTRL_DL", "CTRL_BS"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f10286c = {"CTRL_PS", " ", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "CTRL_US", "CTRL_ML", "CTRL_DL", "CTRL_BS"};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String[] f10287d = {"CTRL_PS", " ", "\u0001", "\u0002", "\u0003", "\u0004", "\u0005", "\u0006", "\u0007", "\b", "\t", "\n", "\u000b", "\f", "\r", "\u001b", "\u001c", "\u001d", "\u001e", "\u001f", "@", "\\", "^", "_", "`", "|", "~", "\u007f", "CTRL_LL", "CTRL_UL", "CTRL_PL", "CTRL_BS"};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String[] f10288e = {"", "\r", "\r\n", ". ", ", ", ": ", "!", "\"", "#", "$", "%", "&", "'", "(", ")", "*", "+", ",", "-", ".", "/", ":", ";", "<", "=", ">", "?", "[", "]", "{", "}", "CTRL_UL"};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String[] f10289f = {"CTRL_PS", " ", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", ",", ".", "CTRL_UL", "CTRL_US"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o5.a f10290a;

    public static int b(boolean[] zArr, int i7, int i10) {
        int i11 = 0;
        for (int i12 = i7; i12 < i7 + i10; i12++) {
            i11 <<= 1;
            if (zArr[i12]) {
                i11 |= 1;
            }
        }
        return i11;
    }

    public final d a(o5.a aVar) throws f {
        int i7;
        v5.a aVar2;
        String str;
        this.f10290a = aVar;
        b bVar = aVar.f9458a;
        boolean z10 = aVar.f9460c;
        int i10 = aVar.f9462e;
        int i11 = (z10 ? 11 : 14) + (i10 << 2);
        int[] iArr = new int[i11];
        int i12 = ((z10 ? 88 : 112) + (i10 << 4)) * i10;
        boolean[] zArr = new boolean[i12];
        int i13 = 2;
        if (z10) {
            for (int i14 = 0; i14 < i11; i14++) {
                iArr[i14] = i14;
            }
        } else {
            int i15 = i11 / 2;
            int i16 = ((((i15 - 1) / 15) * 2) + (i11 + 1)) / 2;
            for (int i17 = 0; i17 < i15; i17++) {
                int i18 = (i17 / 15) + i17;
                iArr[(i15 - i17) - 1] = (i16 - i18) - 1;
                iArr[i15 + i17] = i18 + i16 + 1;
            }
        }
        int i19 = 0;
        int i20 = 0;
        while (true) {
            i7 = 12;
            if (i19 >= i10) {
                break;
            }
            int i21 = ((i10 - i19) << i13) + (z10 ? 9 : 12);
            int i22 = i19 << 1;
            int i23 = (i11 - 1) - i22;
            int i24 = 0;
            while (i24 < i21) {
                int i25 = i24 << 1;
                int i26 = 0;
                while (i26 < i13) {
                    int i27 = i22 + i26;
                    int i28 = i22 + i24;
                    zArr[i20 + i25 + i26] = bVar.b(iArr[i27], iArr[i28]);
                    int i29 = i23 - i26;
                    zArr[(i21 * 2) + i20 + i25 + i26] = bVar.b(iArr[i28], iArr[i29]);
                    int i30 = i23 - i24;
                    zArr[(i21 * 4) + i20 + i25 + i26] = bVar.b(iArr[i29], iArr[i30]);
                    zArr[(i21 * 6) + i20 + i25 + i26] = bVar.b(iArr[i30], iArr[i27]);
                    i26++;
                    i10 = i10;
                    i13 = 2;
                }
                i24++;
                i13 = 2;
            }
            i20 += i21 << 3;
            i19++;
            i10 = i10;
            i13 = 2;
        }
        o5.a aVar3 = this.f10290a;
        int i31 = aVar3.f9462e;
        int i32 = 8;
        if (i31 <= 2) {
            aVar2 = v5.a.f13611j;
            i7 = 6;
        } else if (i31 <= 8) {
            aVar2 = v5.a.f13614n;
            i7 = 8;
        } else if (i31 <= 22) {
            aVar2 = v5.a.f13610i;
            i7 = 10;
        } else {
            aVar2 = v5.a.f13609h;
        }
        int i33 = aVar3.f9461d;
        int i34 = i12 / i7;
        if (i34 < i33) {
            throw f.a();
        }
        int i35 = i12 % i7;
        int[] iArr2 = new int[i34];
        int i36 = 0;
        while (i36 < i34) {
            iArr2[i36] = b(zArr, i35, i7);
            i36++;
            i35 += i7;
        }
        try {
            new o0(28, aVar2).V(iArr2, i34 - i33);
            int i37 = 1 << i7;
            int i38 = i37 - 1;
            int i39 = 0;
            for (int i40 = 0; i40 < i33; i40++) {
                int i41 = iArr2[i40];
                if (i41 == 0 || i41 == i38) {
                    throw f.a();
                }
                if (i41 == 1 || i41 == i37 - 2) {
                    i39++;
                }
            }
            int i42 = (i33 * i7) - i39;
            boolean[] zArr2 = new boolean[i42];
            int i43 = 0;
            for (int i44 = 0; i44 < i33; i44++) {
                int i45 = iArr2[i44];
                int i46 = 1;
                if (i45 == 1 || i45 == i37 - 2) {
                    Arrays.fill(zArr2, i43, (i43 + i7) - 1, i45 > 1);
                    i43 = (i7 - 1) + i43;
                } else {
                    int i47 = i7 - 1;
                    while (i47 >= 0) {
                        int i48 = i43 + 1;
                        zArr2[i43] = (i45 & (i46 << i47)) != 0;
                        i47--;
                        i43 = i48;
                        i46 = 1;
                    }
                }
            }
            int i49 = (i42 + 7) / 8;
            byte[] bArr = new byte[i49];
            for (int i50 = 0; i50 < i49; i50++) {
                int i51 = i50 << 3;
                int i52 = i42 - i51;
                bArr[i50] = (byte) (i52 >= 8 ? b(zArr2, i51, 8) : b(zArr2, i51, i52) << (8 - i52));
            }
            StringBuilder sb2 = new StringBuilder(20);
            int i53 = 1;
            int i54 = 0;
            int i55 = 1;
            while (i54 < i42) {
                if (i55 != 6) {
                    int i56 = i55 == 4 ? 4 : 5;
                    if (i42 - i54 < i56) {
                        break;
                    }
                    int iB = b(zArr2, i54, i56);
                    i54 += i56;
                    int iB2 = e1.d.b(i55);
                    if (iB2 == 0) {
                        str = f10285b[iB];
                    } else if (iB2 == 1) {
                        str = f10286c[iB];
                    } else if (iB2 == 2) {
                        str = f10287d[iB];
                    } else if (iB2 == 3) {
                        str = f10289f[iB];
                    } else {
                        if (iB2 != 4) {
                            throw new IllegalStateException("Bad table");
                        }
                        str = f10288e[iB];
                    }
                    if (str.startsWith("CTRL_")) {
                        char cCharAt = str.charAt(5);
                        if (cCharAt == 'B') {
                            i53 = 6;
                        } else if (cCharAt == 'D') {
                            i53 = 4;
                        } else if (cCharAt == 'P') {
                            i53 = 5;
                        } else if (cCharAt != 'L') {
                            i53 = cCharAt != 'M' ? 1 : 3;
                        } else {
                            i53 = 2;
                        }
                        if (str.charAt(6) != 'L') {
                            int i57 = i55;
                            i55 = i53;
                            i53 = i57;
                        }
                        i32 = 8;
                    } else {
                        sb2.append(str);
                    }
                    i55 = i53;
                    i32 = 8;
                } else {
                    if (i42 - i54 < 5) {
                        break;
                    }
                    int iB3 = b(zArr2, i54, 5);
                    int i58 = i54 + 5;
                    if (iB3 == 0) {
                        if (i42 - i58 < 11) {
                            break;
                        }
                        iB3 = b(zArr2, i58, 11) + 31;
                        i58 = i54 + 16;
                    }
                    int i59 = 0;
                    while (true) {
                        if (i59 >= iB3) {
                            i54 = i58;
                            break;
                        }
                        if (i42 - i58 < i32) {
                            i54 = i42;
                            break;
                        }
                        sb2.append((char) b(zArr2, i58, i32));
                        i58 += 8;
                        i59++;
                    }
                    i55 = i53;
                }
            }
            return new d(bArr, sb2.toString(), null, null);
        } catch (c e7) {
            f fVar = f.f8828c;
            if (l.f8837a) {
                throw new f(e7);
            }
            throw f.f8828c;
        }
    }
}
