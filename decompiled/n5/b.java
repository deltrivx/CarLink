package n5;

import g1.j0;
import java.lang.reflect.Array;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t5.e f8807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public t5.b f8808b;

    public b(t5.e eVar) {
        this.f8807a = eVar;
    }

    public final t5.b a() throws i {
        if (this.f8808b == null) {
            t5.e eVar = this.f8807a;
            int[] iArr = eVar.f12780c;
            t5.b bVar = eVar.f12781d;
            if (bVar == null) {
                j0 j0Var = eVar.f12778a;
                int i7 = j0Var.f5792b;
                int i10 = j0Var.f5793c;
                int i11 = 0;
                if (i7 < 40 || i10 < 40) {
                    t5.b bVar2 = new t5.b(i7, i10);
                    if (eVar.f12779b.length < i7) {
                        eVar.f12779b = new byte[i7];
                    }
                    for (int i12 = 0; i12 < 32; i12++) {
                        iArr[i12] = 0;
                    }
                    for (int i13 = 1; i13 < 5; i13++) {
                        byte[] bArrF = j0Var.f(eVar.f12779b, (i10 * i13) / 5);
                        int i14 = (i7 << 2) / 5;
                        for (int i15 = i7 / 5; i15 < i14; i15++) {
                            int i16 = (bArrF[i15] & 255) >> 3;
                            iArr[i16] = iArr[i16] + 1;
                        }
                    }
                    int iA = t5.e.a(iArr);
                    byte[] bArrE = j0Var.e();
                    for (int i17 = 0; i17 < i10; i17++) {
                        int i18 = i17 * i7;
                        for (int i19 = 0; i19 < i7; i19++) {
                            if ((bArrE[i18 + i19] & 255) < iA) {
                                bVar2.f(i19, i17);
                            }
                        }
                    }
                    eVar.f12781d = bVar2;
                } else {
                    byte[] bArrE2 = j0Var.e();
                    int i20 = i7 >> 3;
                    if ((i7 & 7) != 0) {
                        i20++;
                    }
                    int i21 = i10 >> 3;
                    if ((i10 & 7) != 0) {
                        i21++;
                    }
                    int i22 = i10 - 8;
                    int i23 = i7 - 8;
                    int[][] iArr2 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i21, i20);
                    int i24 = 0;
                    while (true) {
                        int i25 = 8;
                        if (i24 >= i21) {
                            break;
                        }
                        int i26 = i24 << 3;
                        if (i26 > i22) {
                            i26 = i22;
                        }
                        while (i11 < i20) {
                            int i27 = i11 << 3;
                            if (i27 > i23) {
                                i27 = i23;
                            }
                            int i28 = (i26 * i7) + i27;
                            int i29 = 0;
                            int i30 = 0;
                            int i31 = 0;
                            int i32 = 255;
                            while (i29 < i25) {
                                byte[] bArr = bArrE2;
                                int i33 = i26;
                                int i34 = i31;
                                int i35 = i32;
                                int i36 = 0;
                                while (i36 < i25) {
                                    int i37 = i36;
                                    int i38 = bArr[i28 + i36] & 255;
                                    i30 += i38;
                                    if (i38 < i35) {
                                        i35 = i38;
                                    }
                                    if (i38 > i34) {
                                        i34 = i38;
                                    }
                                    i36 = i37 + 1;
                                    i25 = 8;
                                }
                                if (i34 - i35 > 24) {
                                    while (true) {
                                        i29++;
                                        i28 += i7;
                                        if (i29 < 8) {
                                            int i39 = 0;
                                            for (int i40 = 8; i39 < i40; i40 = 8) {
                                                i30 += bArr[i28 + i39] & 255;
                                                i39++;
                                                i35 = i35;
                                            }
                                        }
                                    }
                                }
                                i29++;
                                i28 += i7;
                                i32 = i35;
                                bArrE2 = bArr;
                                i26 = i33;
                                i25 = 8;
                                i31 = i34;
                            }
                            byte[] bArr2 = bArrE2;
                            int i41 = i26;
                            int i42 = i30 >> 6;
                            int i43 = i32;
                            if (i31 - i43 <= 24) {
                                i42 = i43 / 2;
                                if (i24 > 0 && i11 > 0) {
                                    int[] iArr3 = iArr2[i24 - 1];
                                    int i44 = i11 - 1;
                                    int i45 = (((iArr2[i24][i44] * 2) + iArr3[i11]) + iArr3[i44]) / 4;
                                    if (i43 < i45) {
                                        i42 = i45;
                                    }
                                }
                            }
                            iArr2[i24][i11] = i42;
                            i11++;
                            bArrE2 = bArr2;
                            i26 = i41;
                            i25 = 8;
                        }
                        i24++;
                        i11 = 0;
                    }
                    byte[] bArr3 = bArrE2;
                    t5.b bVar3 = new t5.b(i7, i10);
                    int i46 = 0;
                    while (i46 < i21) {
                        int i47 = i46 << 3;
                        if (i47 > i22) {
                            i47 = i22;
                        }
                        int iMin = i46 < 2 ? 2 : Math.min(i46, i21 - 3);
                        int i48 = 0;
                        while (i48 < i20) {
                            int i49 = i48 << 3;
                            if (i49 > i23) {
                                i49 = i23;
                            }
                            int iMin2 = i48 < 2 ? 2 : Math.min(i48, i20 - 3);
                            int i50 = i20;
                            int i51 = -2;
                            int i52 = 0;
                            for (int i53 = 2; i51 <= i53; i53 = 2) {
                                int[] iArr4 = iArr2[iMin + i51];
                                i52 = iArr4[iMin2 - 2] + iArr4[iMin2 - 1] + iArr4[iMin2] + iArr4[iMin2 + 1] + iArr4[iMin2 + 2] + i52;
                                i51++;
                            }
                            int i54 = i52 / 25;
                            int i55 = (i47 * i7) + i49;
                            int i56 = i46;
                            int i57 = 0;
                            while (true) {
                                if (i57 < 8) {
                                    int i58 = i47;
                                    int i59 = 0;
                                    for (int i60 = 8; i59 < i60; i60 = 8) {
                                        int i61 = i59;
                                        if ((bArr3[i55 + i59] & 255) <= i54) {
                                            bVar3.f(i49 + i61, i58 + i57);
                                        }
                                        i59 = i61 + 1;
                                    }
                                    i57++;
                                    i55 += i7;
                                    i47 = i58;
                                }
                            }
                            i48++;
                            i46 = i56;
                            i20 = i50;
                        }
                        i46++;
                    }
                    eVar.f12781d = bVar3;
                }
                bVar = eVar.f12781d;
            }
            this.f8808b = bVar;
        }
        return this.f8808b;
    }

    public final t5.a b(t5.a aVar, int i7) throws i {
        t5.e eVar = this.f8807a;
        int[] iArr = eVar.f12780c;
        j0 j0Var = eVar.f12778a;
        int i10 = j0Var.f5792b;
        if (aVar.f12760b < i10) {
            aVar = new t5.a(i10);
        } else {
            int length = aVar.f12759a.length;
            for (int i11 = 0; i11 < length; i11++) {
                aVar.f12759a[i11] = 0;
            }
        }
        if (eVar.f12779b.length < i10) {
            eVar.f12779b = new byte[i10];
        }
        for (int i12 = 0; i12 < 32; i12++) {
            iArr[i12] = 0;
        }
        byte[] bArrF = j0Var.f(eVar.f12779b, i7);
        for (int i13 = 0; i13 < i10; i13++) {
            int i14 = (bArrF[i13] & 255) >> 3;
            iArr[i14] = iArr[i14] + 1;
        }
        int iA = t5.e.a(iArr);
        if (i10 < 3) {
            for (int i15 = 0; i15 < i10; i15++) {
                if ((bArrF[i15] & 255) < iA) {
                    aVar.j(i15);
                }
            }
        } else {
            int i16 = bArrF[0] & 255;
            int i17 = bArrF[1] & 255;
            int i18 = 1;
            while (i18 < i10 - 1) {
                int i19 = i18 + 1;
                int i20 = bArrF[i19] & 255;
                if ((((i17 << 2) - i16) - i20) / 2 < iA) {
                    aVar.j(i18);
                }
                i16 = i17;
                i18 = i19;
                i17 = i20;
            }
        }
        return aVar;
    }

    public final String toString() {
        try {
            return a().toString();
        } catch (i unused) {
            return "";
        }
    }
}
