package z5;

import a6.b;
import java.text.DecimalFormat;
import java.util.Map;
import n5.c;
import n5.f;
import n5.i;
import n5.k;
import n5.m;
import n5.n;
import n5.o;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a implements k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o[] f15738b = new o[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f15739a = new b(0);

    @Override // n5.k
    public final m a(n5.b bVar, Map map) throws i, f, c {
        int i7;
        byte[] bArr;
        String strValueOf;
        t5.b bVarA = bVar.a();
        int i10 = bVarA.f12761a;
        int i11 = bVarA.f12762b;
        int i12 = -1;
        int i13 = i11;
        int i14 = -1;
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = 0;
            while (true) {
                int i17 = bVarA.f12763c;
                if (i16 < i17) {
                    int i18 = bVarA.f12764d[(i17 * i15) + i16];
                    if (i18 != 0) {
                        if (i15 < i13) {
                            i13 = i15;
                        }
                        if (i15 > i14) {
                            i14 = i15;
                        }
                        int i19 = i16 << 5;
                        if (i19 < i10) {
                            int i20 = 0;
                            while ((i18 << (31 - i20)) == 0) {
                                i20++;
                            }
                            int i21 = i20 + i19;
                            if (i21 < i10) {
                                i10 = i21;
                            }
                        }
                        if (i19 + 31 > i12) {
                            int i22 = 31;
                            while ((i18 >>> i22) == 0) {
                                i22--;
                            }
                            int i23 = i19 + i22;
                            if (i23 > i12) {
                                i12 = i23;
                            }
                        }
                    }
                    i16++;
                }
            }
        }
        int[] iArr = (i12 < i10 || i14 < i13) ? null : new int[]{i10, i13, (i12 - i10) + 1, (i14 - i13) + 1};
        if (iArr == null) {
            throw i.f8833c;
        }
        int i24 = iArr[0];
        int i25 = iArr[1];
        int i26 = iArr[2];
        int i27 = iArr[3];
        int i28 = (30 + 31) / 32;
        int[] iArr2 = new int[i28 * 33];
        int i29 = 0;
        while (true) {
            if (i29 >= 33) {
                break;
            }
            int i30 = (((i27 / 2) + (i29 * i27)) / 33) + i25;
            for (int i31 = 0; i31 < 30; i31++) {
                if (bVarA.b((((((i29 & 1) * i26) / 2) + ((i26 / 2) + (i31 * i26))) / 30) + i24, i30)) {
                    int i32 = (i31 / 32) + (i29 * i28);
                    iArr2[i32] = iArr2[i32] | (1 << (i31 & 31));
                }
            }
            i29++;
        }
        b bVar2 = this.f15739a;
        bVar2.getClass();
        byte[] bArr2 = new byte[144];
        int i33 = 0;
        for (i7 = 33; i33 < i7; i7 = 33) {
            int[] iArr3 = a6.a.f47a[i33];
            for (int i34 = 0; i34 < 30; i34++) {
                int i35 = iArr3[i34];
                if (i35 >= 0) {
                    if (((iArr2[(i34 / 32) + (i33 * i28)] >>> (i34 & 31)) & 1) != 0) {
                        int i36 = i35 / 6;
                        bArr2[i36] = (byte) (bArr2[i36] | ((byte) (1 << (5 - (i35 % 6)))));
                    }
                }
            }
            i33++;
        }
        bVar2.a(0, 10, 10, bArr2, 0);
        int i37 = bArr2[0] & 15;
        if (i37 == 2 || i37 == 3 || i37 == 4) {
            bVar2.a(20, 84, 40, bArr2, 1);
            bVar2.a(20, 84, 40, bArr2, 2);
            bArr = new byte[94];
        } else {
            if (i37 != 5) {
                throw f.a();
            }
            bVar2.a(20, 68, 56, bArr2, 1);
            bVar2.a(20, 68, 56, bArr2, 2);
            bArr = new byte[78];
        }
        System.arraycopy(r18, 0, bArr, 0, 10);
        System.arraycopy(bArr2, 20, bArr, 10, bArr.length - 10);
        StringBuilder sb2 = new StringBuilder(144);
        if (i37 == 2 || i37 == 3) {
            if (i37 == 2) {
                strValueOf = new DecimalFormat("0000000000".substring(0, a6.a.a(bArr, new byte[]{39, 40, 41, 42, 31, 32}))).format(a6.a.a(bArr, new byte[]{33, 34, 35, 36, 25, 26, 27, 28, 29, 30, 19, 20, 21, 22, 23, 24, 13, 14, 15, 16, 17, 18, 7, 8, 9, 10, 11, 12, 1, 2}));
            } else {
                String[] strArr = a6.a.f48b;
                strValueOf = String.valueOf(new char[]{strArr[0].charAt(a6.a.a(bArr, new byte[]{39, 40, 41, 42, 31, 32})), strArr[0].charAt(a6.a.a(bArr, new byte[]{33, 34, 35, 36, 25, 26})), strArr[0].charAt(a6.a.a(bArr, new byte[]{27, 28, 29, 30, 19, 20})), strArr[0].charAt(a6.a.a(bArr, new byte[]{21, 22, 23, 24, 13, 14})), strArr[0].charAt(a6.a.a(bArr, new byte[]{15, 16, 17, 18, 7, 8})), strArr[0].charAt(a6.a.a(bArr, new byte[]{9, 10, 11, 12, 1, 2}))});
            }
            DecimalFormat decimalFormat = new DecimalFormat("000");
            String str = decimalFormat.format(a6.a.a(bArr, new byte[]{53, 54, 43, 44, 45, 46, 47, 48, 37, 38}));
            String str2 = decimalFormat.format(a6.a.a(bArr, new byte[]{55, 56, 57, 58, 59, 60, 49, 50, 51, 52}));
            sb2.append(a6.a.b(bArr, 10, 84));
            if (sb2.toString().startsWith("[)>\u001e01\u001d")) {
                sb2.insert(9, strValueOf + (char) 29 + str + (char) 29 + str2 + (char) 29);
            } else {
                sb2.insert(0, strValueOf + (char) 29 + str + (char) 29 + str2 + (char) 29);
            }
        } else if (i37 == 4) {
            sb2.append(a6.a.b(bArr, 1, 93));
        } else if (i37 == 5) {
            sb2.append(a6.a.b(bArr, 1, 77));
        }
        String string = sb2.toString();
        String strValueOf2 = String.valueOf(i37);
        m mVar = new m(string, bArr, f15738b, n5.a.f8799j);
        if (strValueOf2 != null) {
            mVar.b(n.f8846c, strValueOf2);
        }
        return mVar;
    }

    @Override // n5.k
    public final void reset() {
    }
}
