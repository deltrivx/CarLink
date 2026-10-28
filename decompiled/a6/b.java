package a6;

import e4.n;
import f1.t0;
import f7.t;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import k6.e;
import k6.g;
import l0.o0;
import n5.c;
import n5.f;
import t5.d;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o0 f49a;

    public b(int i7) {
        switch (i7) {
            case 1:
                this.f49a = new o0(28, v5.a.f13612l);
                break;
            case 2:
                this.f49a = new o0(28, v5.a.f13613m);
                break;
            default:
                this.f49a = new o0(28, v5.a.f13615o);
                break;
        }
    }

    public void a(int i7, int i10, int i11, byte[] bArr, int i12) throws c {
        int i13 = i10 + i11;
        int i14 = i12 == 0 ? 1 : 2;
        int[] iArr = new int[i13 / i14];
        for (int i15 = 0; i15 < i13; i15++) {
            if (i12 == 0 || i15 % 2 == i12 - 1) {
                iArr[i15 / i14] = bArr[i15 + i7] & 255;
            }
        }
        try {
            this.f49a.V(iArr, i11 / i14);
            for (int i16 = 0; i16 < i10; i16++) {
                if (i12 == 0 || i16 % 2 == i12 - 1) {
                    bArr[i16 + i7] = (byte) iArr[i16 / i14];
                }
            }
        } catch (v5.c unused) {
            throw c.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v15 */
    public d b(t0 t0Var, Map map) throws Throwable {
        int iB;
        e eVar;
        ArrayList arrayList;
        Throwable th;
        String str;
        int iB2;
        int i7;
        int i10;
        g gVarD = t0Var.d();
        int i11 = t0Var.c().f7315a;
        k6.d dVarC = t0Var.c();
        g gVarD2 = t0Var.d();
        int i12 = e1.d.c(8)[dVarC.f7316b];
        t5.b bVar = (t5.b) t0Var.f5149b;
        int i13 = bVar.f12762b;
        for (int i14 = 0; i14 < i13; i14++) {
            for (int i15 = 0; i15 < i13; i15++) {
                if (k6.c.a(i12, i14, i15)) {
                    bVar.a(i15, i14);
                }
            }
        }
        int i16 = gVarD2.f7331a * 4;
        int i17 = i16 + 17;
        int i18 = gVarD2.f7334d;
        t5.b bVar2 = new t5.b(i17, i17);
        bVar2.g(0, 0, 9, 9);
        int i19 = i16 + 9;
        bVar2.g(i19, 0, 8, 9);
        bVar2.g(0, i19, 9, 8);
        int[] iArr = gVarD2.f7332b;
        int length = iArr.length;
        for (int i20 = 0; i20 < length; i20++) {
            int i21 = iArr[i20] - 2;
            for (int i22 = 0; i22 < length; i22++) {
                if ((i20 != 0 || (i22 != 0 && i22 != length - 1)) && (i20 != length - 1 || i22 != 0)) {
                    bVar2.g(iArr[i22] - 2, i21, 5, 5);
                }
            }
        }
        int i23 = 6;
        bVar2.g(6, 9, 1, i16);
        bVar2.g(9, 6, i16, 1);
        if (gVarD2.f7331a > 6) {
            int i24 = i16 + 6;
            bVar2.g(i24, 0, 3, 6);
            bVar2.g(0, i24, 6, 3);
        }
        byte[] bArr = new byte[i18];
        int i25 = i13 - 1;
        int i26 = i25;
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        boolean z10 = true;
        while (i26 > 0) {
            if (i26 == i23) {
                i26--;
            }
            for (int i30 = 0; i30 < i13; i30++) {
                int i31 = z10 ? i25 - i30 : i30;
                for (int i32 = 0; i32 < 2; i32++) {
                    int i33 = i26 - i32;
                    if (!bVar2.b(i33, i31)) {
                        i28++;
                        i29 <<= 1;
                        if (bVar.b(i33, i31)) {
                            i29 |= 1;
                        }
                        if (i28 == 8) {
                            bArr[i27] = (byte) i29;
                            i27++;
                            i28 = 0;
                            i29 = 0;
                        }
                    }
                }
            }
            z10 = !z10;
            i26 -= 2;
            i23 = 6;
        }
        if (i27 != i18) {
            throw f.a();
        }
        if (i18 != gVarD.f7334d) {
            throw new IllegalArgumentException();
        }
        j.g gVar = gVarD.f7333c[e1.d.b(i11)];
        n[] nVarArr = (n[]) gVar.f6795c;
        int i34 = gVar.f6794b;
        int i35 = 0;
        for (n nVar : nVarArr) {
            i35 += nVar.f4380b;
        }
        k6.a[] aVarArr = new k6.a[i35];
        int i36 = 0;
        for (n nVar2 : nVarArr) {
            int i37 = 0;
            while (i37 < nVar2.f4380b) {
                int i38 = nVar2.f4381c;
                aVarArr[i36] = new k6.a(new byte[i34 + i38], i38);
                i37++;
                i36++;
            }
        }
        int length2 = aVarArr[0].f7310a.length;
        int i39 = i35 - 1;
        while (i39 >= 0 && aVarArr[i39].f7310a.length != length2) {
            i39--;
        }
        int i40 = i39 + 1;
        int i41 = length2 - i34;
        int i42 = 0;
        int i43 = 0;
        while (i42 < i41) {
            int i44 = i43;
            int i45 = 0;
            while (i45 < i36) {
                aVarArr[i45].f7310a[i42] = bArr[i44];
                i45++;
                i44++;
            }
            i42++;
            i43 = i44;
        }
        int i46 = i40;
        while (i46 < i36) {
            aVarArr[i46].f7310a[i41] = bArr[i43];
            i46++;
            i43++;
        }
        int length3 = aVarArr[0].f7310a.length;
        while (i41 < length3) {
            int i47 = i43;
            int i48 = 0;
            while (i48 < i36) {
                aVarArr[i48].f7310a[i48 < i40 ? i41 : i41 + 1] = bArr[i47];
                i48++;
                i47++;
            }
            i41++;
            i43 = i47;
        }
        int i49 = 0;
        for (int i50 = 0; i50 < i35; i50++) {
            i49 += aVarArr[i50].f7311b;
        }
        byte[] bArr2 = new byte[i49];
        int i51 = 0;
        for (int i52 = 0; i52 < i35; i52++) {
            k6.a aVar = aVarArr[i52];
            byte[] bArr3 = aVar.f7310a;
            int i53 = aVar.f7311b;
            int length4 = bArr3.length;
            int[] iArr2 = new int[length4];
            for (int i54 = 0; i54 < length4; i54++) {
                iArr2[i54] = bArr3[i54] & 255;
            }
            try {
                this.f49a.V(iArr2, bArr3.length - i53);
                for (int i55 = 0; i55 < i53; i55++) {
                    bArr3[i55] = (byte) iArr2[i55];
                }
                int i56 = 0;
                while (i56 < i53) {
                    bArr2[i51] = bArr3[i56];
                    i56++;
                    i51++;
                }
            } catch (v5.c unused) {
                throw c.a();
            }
        }
        char[] cArr = k6.b.f7312a;
        t tVar = new t(bArr2);
        StringBuilder sb2 = new StringBuilder(50);
        ArrayList arrayList2 = new ArrayList(1);
        int iB3 = -1;
        int iB4 = -1;
        boolean z11 = false;
        t5.c cVar = null;
        while (true) {
            try {
                int iA = tVar.a();
                e eVar2 = e.TERMINATOR;
                if (iA < 4 || (iB = tVar.b(4)) == 0) {
                    eVar = eVar2;
                } else if (iB == 1) {
                    eVar = e.NUMERIC;
                } else if (iB == 2) {
                    eVar = e.ALPHANUMERIC;
                } else if (iB == 3) {
                    eVar = e.STRUCTURED_APPEND;
                } else if (iB == 4) {
                    eVar = e.BYTE;
                } else if (iB == 5) {
                    eVar = e.FNC1_FIRST_POSITION;
                } else if (iB == 7) {
                    eVar = e.ECI;
                } else if (iB == 8) {
                    eVar = e.KANJI;
                } else if (iB == 9) {
                    eVar = e.FNC1_SECOND_POSITION;
                } else {
                    if (iB != 13) {
                        throw new IllegalArgumentException();
                    }
                    eVar = e.HANZI;
                }
                int iOrdinal = eVar.ordinal();
                if (iOrdinal != 0) {
                    th = null;
                    if (iOrdinal == 3) {
                        arrayList = arrayList2;
                        if (tVar.a() < 16) {
                            throw f.a();
                        }
                        iB3 = tVar.b(8);
                        iB4 = tVar.b(8);
                    } else if (iOrdinal == 5) {
                        arrayList = arrayList2;
                        int iB5 = tVar.b(8);
                        if ((iB5 & 128) == 0) {
                            i10 = iB5 & 127;
                        } else {
                            if ((iB5 & 192) == 128) {
                                iB2 = tVar.b(8);
                                i7 = (iB5 & 63) << 8;
                            } else {
                                if ((iB5 & 224) != 192) {
                                    throw f.a();
                                }
                                iB2 = tVar.b(16);
                                i7 = (iB5 & 31) << 16;
                            }
                            i10 = i7 | iB2;
                        }
                        HashMap map2 = t5.c.f12765c;
                        if (i10 < 0 || i10 >= 900) {
                            throw f.a();
                        }
                        cVar = (t5.c) t5.c.f12765c.get(Integer.valueOf(i10));
                        if (cVar == null) {
                            throw f.a();
                        }
                    } else if (iOrdinal == 7 || iOrdinal == 8) {
                        arrayList = arrayList2;
                        z11 = true;
                    } else if (iOrdinal != 9) {
                        int iB6 = tVar.b(eVar.a(gVarD));
                        int iOrdinal2 = eVar.ordinal();
                        if (iOrdinal2 == 1) {
                            arrayList = arrayList2;
                            k6.b.e(tVar, sb2, iB6);
                        } else if (iOrdinal2 == 2) {
                            arrayList = arrayList2;
                            k6.b.a(tVar, sb2, iB6, z11);
                        } else if (iOrdinal2 == 4) {
                            arrayList = arrayList2;
                            k6.b.b(tVar, sb2, iB6, cVar, arrayList, map);
                        } else {
                            if (iOrdinal2 != 6) {
                                throw f.a();
                            }
                            k6.b.d(tVar, sb2, iB6);
                            arrayList = arrayList2;
                        }
                    } else {
                        arrayList = arrayList2;
                        int iB7 = tVar.b(4);
                        int iB8 = tVar.b(eVar.a(gVarD));
                        if (iB7 == 1) {
                            k6.b.c(tVar, sb2, iB8);
                        }
                    }
                } else {
                    arrayList = arrayList2;
                    th = null;
                }
                int i57 = iB4;
                if (eVar == eVar2) {
                    String string = sb2.toString();
                    ?? r10 = arrayList.isEmpty() ? th : arrayList;
                    if (i11 == 1) {
                        str = "L";
                    } else if (i11 == 2) {
                        str = "M";
                    } else if (i11 == 3) {
                        str = "Q";
                    } else {
                        if (i11 != 4) {
                            throw th;
                        }
                        str = "H";
                    }
                    return new d(bArr2, string, r10, str, iB3, i57);
                }
                arrayList2 = arrayList;
            } catch (IllegalArgumentException unused2) {
                throw f.a();
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:493:0x03c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:501:? A[LOOP:15: B:204:0x0357->B:501:?, LOOP_END, SYNTHETIC] */
    public d c(t5.b bVar) throws f, c {
        byte[] bArr;
        int iB;
        int iB2;
        int iB3;
        a2.b bVar2 = new a2.b(bVar);
        x5.b bVar3 = (x5.b) bVar2.f14d;
        t5.b bVar4 = (t5.b) bVar2.f13c;
        int i7 = bVar3.f14603g;
        byte[] bArr2 = new byte[i7];
        t5.b bVar5 = (t5.b) bVar2.f12b;
        int i10 = bVar5.f12762b;
        int i11 = bVar5.f12761a;
        int i12 = 0;
        int i13 = 4;
        int i14 = 0;
        boolean z10 = false;
        int i15 = 0;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        while (true) {
            if (i13 == i10 && i14 == 0 && !z10) {
                int i16 = i15 + 1;
                int i17 = i10 - 1;
                int i18 = (bVar2.T(i17, i12, i10, i11) ? 1 : 0) << 1;
                if (bVar2.T(i17, 1, i10, i11)) {
                    i18 |= 1;
                }
                int i19 = i18 << 1;
                if (bVar2.T(i17, 2, i10, i11)) {
                    i19 |= 1;
                }
                int i20 = i19 << 1;
                bArr = bArr2;
                if (bVar2.T(0, i11 - 2, i10, i11)) {
                    i20 |= 1;
                }
                int i21 = i20 << 1;
                int i22 = i11 - 1;
                if (bVar2.T(0, i22, i10, i11)) {
                    i21 |= 1;
                }
                int i23 = i21 << 1;
                if (bVar2.T(1, i22, i10, i11)) {
                    i23 |= 1;
                }
                int i24 = i23 << 1;
                if (bVar2.T(2, i22, i10, i11)) {
                    i24 |= 1;
                }
                int i25 = i24 << 1;
                if (bVar2.T(3, i22, i10, i11)) {
                    i25 |= 1;
                }
                bArr[i15] = (byte) i25;
                i13 -= 2;
                i14 += 2;
                i15 = i16;
                z10 = true;
            } else {
                bArr = bArr2;
                int i26 = i10 - 2;
                if (i13 == i26 && i14 == 0 && (i11 & 3) != 0 && !z11) {
                    int i27 = i15 + 1;
                    int i28 = (bVar2.T(i10 + (-3), 0, i10, i11) ? 1 : 0) << 1;
                    if (bVar2.T(i26, 0, i10, i11)) {
                        i28 |= 1;
                    }
                    int i29 = i28 << 1;
                    if (bVar2.T(i10 - 1, 0, i10, i11)) {
                        i29 |= 1;
                    }
                    int i30 = i29 << 1;
                    if (bVar2.T(0, i11 - 4, i10, i11)) {
                        i30 |= 1;
                    }
                    int i31 = i30 << 1;
                    if (bVar2.T(0, i11 - 3, i10, i11)) {
                        i31 |= 1;
                    }
                    int i32 = i31 << 1;
                    if (bVar2.T(0, i11 - 2, i10, i11)) {
                        i32 |= 1;
                    }
                    int i33 = i32 << 1;
                    int i34 = i11 - 1;
                    if (bVar2.T(0, i34, i10, i11)) {
                        i33 |= 1;
                    }
                    int i35 = i33 << 1;
                    if (bVar2.T(1, i34, i10, i11)) {
                        i35 |= 1;
                    }
                    bArr[i15] = (byte) i35;
                    i13 -= 2;
                    i14 += 2;
                    i15 = i27;
                    z11 = true;
                } else if (i13 == i10 + 4 && i14 == 2 && (i11 & 7) == 0 && !z12) {
                    int i36 = i15 + 1;
                    int i37 = i10 - 1;
                    int i38 = (bVar2.T(i37, 0, i10, i11) ? 1 : 0) << 1;
                    int i39 = i11 - 1;
                    if (bVar2.T(i37, i39, i10, i11)) {
                        i38 |= 1;
                    }
                    int i40 = i38 << 1;
                    int i41 = i11 - 3;
                    if (bVar2.T(0, i41, i10, i11)) {
                        i40 |= 1;
                    }
                    int i42 = i40 << 1;
                    int i43 = i11 - 2;
                    if (bVar2.T(0, i43, i10, i11)) {
                        i42 |= 1;
                    }
                    int i44 = i42 << 1;
                    if (bVar2.T(0, i39, i10, i11)) {
                        i44 |= 1;
                    }
                    int i45 = i44 << 1;
                    int i46 = (bVar2.T(1, i41, i10, i11) ? i45 | 1 : i45) << 1;
                    if (bVar2.T(1, i43, i10, i11)) {
                        i46 |= 1;
                    }
                    int i47 = i46 << 1;
                    if (bVar2.T(1, i39, i10, i11)) {
                        i47 |= 1;
                    }
                    bArr[i15] = (byte) i47;
                    i13 -= 2;
                    i14 += 2;
                    i15 = i36;
                    z12 = true;
                } else if (i13 == i26 && i14 == 0 && (i11 & 7) == 4 && !z13) {
                    int i48 = i15 + 1;
                    int i49 = (bVar2.T(i10 + (-3), 0, i10, i11) ? 1 : 0) << 1;
                    if (bVar2.T(i26, 0, i10, i11)) {
                        i49 |= 1;
                    }
                    int i50 = i49 << 1;
                    if (bVar2.T(i10 - 1, 0, i10, i11)) {
                        i50 |= 1;
                    }
                    int i51 = i50 << 1;
                    if (bVar2.T(0, i11 - 2, i10, i11)) {
                        i51 |= 1;
                    }
                    int i52 = i51 << 1;
                    int i53 = i11 - 1;
                    if (bVar2.T(0, i53, i10, i11)) {
                        i52 |= 1;
                    }
                    int i54 = i52 << 1;
                    if (bVar2.T(1, i53, i10, i11)) {
                        i54 |= 1;
                    }
                    int i55 = i54 << 1;
                    if (bVar2.T(2, i53, i10, i11)) {
                        i55 |= 1;
                    }
                    int i56 = i55 << 1;
                    if (bVar2.T(3, i53, i10, i11)) {
                        i56 |= 1;
                    }
                    bArr[i15] = (byte) i56;
                    i13 -= 2;
                    i14 += 2;
                    i15 = i48;
                    z13 = true;
                } else {
                    while (true) {
                        if (i13 < i10 && i14 >= 0 && !bVar4.b(i14, i13)) {
                            bArr[i15] = (byte) bVar2.U(i13, i14, i10, i11);
                            i15++;
                        }
                        int i57 = i13 - 2;
                        int i58 = i14 + 2;
                        if (i57 < 0 || i58 >= i11) {
                            break;
                        }
                        i13 = i57;
                        i14 = i58;
                    }
                    int i59 = i13 - 1;
                    int i60 = i14 + 5;
                    while (true) {
                        if (i59 >= 0 && i60 < i11 && !bVar4.b(i60, i59)) {
                            bArr[i15] = (byte) bVar2.U(i59, i60, i10, i11);
                            i15++;
                        }
                        int i61 = i59 + 2;
                        int i62 = i60 - 2;
                        if (i61 >= i10 || i62 < 0) {
                            break;
                        }
                        i59 = i61;
                        i60 = i62;
                    }
                    i13 = i59 + 5;
                    i14 = i60 - 1;
                }
            }
            if (i13 >= i10 && i14 >= i11) {
                break;
            }
            bArr2 = bArr;
            i12 = 0;
        }
        if (i15 != bVar3.f14603g) {
            throw f.a();
        }
        j.g gVar = bVar3.f14602f;
        n[] nVarArr = (n[]) gVar.f6795c;
        int i63 = gVar.f6794b;
        int i64 = 0;
        for (n nVar : nVarArr) {
            i64 += nVar.f4380b;
        }
        k6.a[] aVarArr = new k6.a[i64];
        int i65 = 0;
        for (n nVar2 : nVarArr) {
            int i66 = 0;
            while (i66 < nVar2.f4380b) {
                int i67 = nVar2.f4381c;
                aVarArr[i65] = new k6.a(new byte[i63 + i67], i67);
                i66++;
                i65++;
            }
        }
        int length = aVarArr[0].f7310a.length - i63;
        int i68 = length - 1;
        int i69 = 0;
        for (int i70 = 0; i70 < i68; i70++) {
            int i71 = 0;
            while (i71 < i65) {
                aVarArr[i71].f7310a[i70] = bArr[i69];
                i71++;
                i69++;
            }
        }
        boolean z14 = bVar3.f14597a == 24;
        int i72 = 8;
        int i73 = z14 ? 8 : i65;
        int i74 = 0;
        while (i74 < i73) {
            aVarArr[i74].f7310a[i68] = bArr[i69];
            i74++;
            i69++;
        }
        int length2 = aVarArr[0].f7310a.length;
        while (length < length2) {
            int i75 = 0;
            while (i75 < i65) {
                int i76 = z14 ? (i75 + 8) % i65 : i75;
                aVarArr[i76].f7310a[(!z14 || i76 <= 7) ? length : length - 1] = bArr[i69];
                i75++;
                i69++;
            }
            length++;
        }
        if (i69 != i7) {
            throw new IllegalArgumentException();
        }
        int i77 = 0;
        for (int i78 = 0; i78 < i64; i78++) {
            i77 += aVarArr[i78].f7311b;
        }
        byte[] bArr3 = new byte[i77];
        for (int i79 = 0; i79 < i64; i79++) {
            k6.a aVar = aVarArr[i79];
            byte[] bArr4 = aVar.f7310a;
            int i80 = aVar.f7311b;
            int length3 = bArr4.length;
            int[] iArr = new int[length3];
            for (int i81 = 0; i81 < length3; i81++) {
                iArr[i81] = bArr4[i81] & 255;
            }
            try {
                this.f49a.V(iArr, bArr4.length - i80);
                for (int i82 = 0; i82 < i80; i82++) {
                    bArr4[i82] = (byte) iArr[i82];
                }
                for (int i83 = 0; i83 < i80; i83++) {
                    bArr3[(i83 * i64) + i79] = bArr4[i83];
                }
            } catch (v5.c unused) {
                throw c.a();
            }
        }
        t tVar = new t(bArr3);
        StringBuilder sb2 = new StringBuilder(100);
        StringBuilder sb3 = new StringBuilder(0);
        ArrayList arrayList = new ArrayList(1);
        int i84 = 2;
        while (true) {
            int i85 = 6;
            if (i84 == 2) {
                boolean z15 = false;
                while (true) {
                    int iB4 = tVar.b(i72);
                    if (iB4 == 0) {
                        throw f.a();
                    }
                    if (iB4 <= 128) {
                        if (z15) {
                            iB4 += 128;
                        }
                        sb2.append((char) (iB4 - 1));
                        i85 = 2;
                    } else if (iB4 == 129) {
                        i85 = 1;
                    } else {
                        if (iB4 > 229) {
                            switch (iB4) {
                                case 230:
                                    i85 = 3;
                                    break;
                                case 231:
                                    i85 = 7;
                                    break;
                                case 232:
                                    sb2.append((char) 29);
                                    if (tVar.a() <= 0) {
                                        i85 = 2;
                                    }
                                    break;
                                case 233:
                                case 234:
                                case 241:
                                    break;
                                case 235:
                                    z15 = true;
                                    if (tVar.a() <= 0) {
                                        i85 = 2;
                                    }
                                    break;
                                case 236:
                                    sb2.append("[)>\u001e05\u001d");
                                    sb3.insert(0, "\u001e\u0004");
                                    if (tVar.a() <= 0) {
                                        i85 = 2;
                                    }
                                    break;
                                case 237:
                                    sb2.append("[)>\u001e06\u001d");
                                    sb3.insert(0, "\u001e\u0004");
                                    if (tVar.a() <= 0) {
                                        i85 = 2;
                                    }
                                    break;
                                case 238:
                                    i85 = 5;
                                    break;
                                case 239:
                                    i85 = 4;
                                    break;
                                case 240:
                                    break;
                                default:
                                    if (iB4 != 254 || tVar.a() != 0) {
                                        throw f.a();
                                    }
                                    break;
                            }
                        } else {
                            int i86 = iB4 - 130;
                            if (i86 < 10) {
                                sb2.append('0');
                            }
                            sb2.append(i86);
                        }
                        if (tVar.a() <= 0) {
                            i85 = 2;
                        }
                    }
                }
                i84 = i85;
            } else {
                int iB5 = e1.d.b(i84);
                if (iB5 == 2) {
                    int i87 = 3;
                    int[] iArr2 = new int[3];
                    boolean z16 = false;
                    int i88 = 0;
                    while (true) {
                        if (tVar.a() != 8 && (iB = tVar.b(8)) != 254) {
                            x5.a.a(iB, tVar.b(8), iArr2);
                            int i89 = i88;
                            boolean z17 = z16;
                            int i90 = 0;
                            while (i90 < i87) {
                                int i91 = iArr2[i90];
                                if (i89 != 0) {
                                    if (i89 != 1) {
                                        if (i89 != 2) {
                                            if (i89 != i87) {
                                                throw f.a();
                                            }
                                            if (z17) {
                                                sb2.append((char) (i91 + 224));
                                                z17 = false;
                                            } else {
                                                sb2.append((char) (i91 + 96));
                                            }
                                        } else if (i91 < 27) {
                                            char c10 = x5.a.f14592b[i91];
                                            if (z17) {
                                                sb2.append((char) (c10 + 128));
                                                z17 = false;
                                            } else {
                                                sb2.append(c10);
                                            }
                                        } else if (i91 == 27) {
                                            sb2.append((char) 29);
                                        } else {
                                            if (i91 != 30) {
                                                throw f.a();
                                            }
                                            z17 = true;
                                        }
                                    } else if (z17) {
                                        sb2.append((char) (i91 + 128));
                                        z17 = false;
                                    } else {
                                        sb2.append((char) i91);
                                    }
                                    i89 = 0;
                                } else if (i91 < i87) {
                                    i89 = i91 + 1;
                                } else {
                                    if (i91 >= 40) {
                                        throw f.a();
                                    }
                                    char c11 = x5.a.f14591a[i91];
                                    if (z17) {
                                        sb2.append((char) (c11 + 128));
                                        z17 = false;
                                    } else {
                                        sb2.append(c11);
                                    }
                                }
                                i90++;
                                i87 = 3;
                            }
                            if (tVar.a() > 0) {
                                z16 = z17;
                                i88 = i89;
                                i87 = 3;
                            }
                        }
                    }
                    i84 = 2;
                } else if (iB5 == 3) {
                    int i92 = 3;
                    int[] iArr3 = new int[3];
                    boolean z18 = false;
                    int i93 = 0;
                    for (int i94 = 254; tVar.a() != i72 && (iB2 = tVar.b(i72)) != i94; i94 = 254) {
                        x5.a.a(iB2, tVar.b(i72), iArr3);
                        int i95 = i93;
                        int i96 = 0;
                        while (i96 < i92) {
                            int i97 = iArr3[i96];
                            if (i95 != 0) {
                                if (i95 != 1) {
                                    if (i95 != 2) {
                                        if (i95 != i92) {
                                            throw f.a();
                                        }
                                        if (i97 >= 32) {
                                            throw f.a();
                                        }
                                        char c12 = x5.a.f14595e[i97];
                                        if (z18) {
                                            sb2.append((char) (c12 + 128));
                                            z18 = false;
                                        } else {
                                            sb2.append(c12);
                                        }
                                    } else if (i97 < 27) {
                                        char c13 = x5.a.f14594d[i97];
                                        if (z18) {
                                            sb2.append((char) (c13 + 128));
                                            z18 = false;
                                        } else {
                                            sb2.append(c13);
                                        }
                                    } else if (i97 == 27) {
                                        sb2.append((char) 29);
                                    } else {
                                        if (i97 != 30) {
                                            throw f.a();
                                        }
                                        z18 = true;
                                    }
                                } else if (z18) {
                                    sb2.append((char) (i97 + 128));
                                    z18 = false;
                                } else {
                                    sb2.append((char) i97);
                                }
                                i95 = 0;
                            } else if (i97 < i92) {
                                i95 = i97 + 1;
                            } else {
                                if (i97 >= 40) {
                                    throw f.a();
                                }
                                char c14 = x5.a.f14593c[i97];
                                if (z18) {
                                    sb2.append((char) (c14 + 128));
                                    z18 = false;
                                } else {
                                    sb2.append(c14);
                                }
                            }
                            i96++;
                            i92 = 3;
                        }
                        if (tVar.a() > 0) {
                            i93 = i95;
                            i72 = 8;
                            i92 = 3;
                        }
                    }
                } else if (iB5 == 4) {
                    int i98 = 3;
                    int[] iArr4 = new int[3];
                    while (tVar.a() != i72 && (iB3 = tVar.b(i72)) != 254) {
                        x5.a.a(iB3, tVar.b(i72), iArr4);
                        int i99 = 0;
                        while (i99 < i98) {
                            int i100 = iArr4[i99];
                            if (i100 == 0) {
                                sb2.append('\r');
                            } else if (i100 == 1) {
                                sb2.append('*');
                            } else if (i100 == 2) {
                                sb2.append('>');
                            } else if (i100 == i98) {
                                sb2.append(' ');
                            } else if (i100 < 14) {
                                sb2.append((char) (i100 + 44));
                            } else {
                                if (i100 >= 40) {
                                    throw f.a();
                                }
                                sb2.append((char) (i100 + 51));
                            }
                            i99++;
                            i98 = 3;
                        }
                        if (tVar.a() > 0) {
                            i98 = 3;
                        }
                    }
                } else if (iB5 == 5) {
                    while (tVar.a() > 16) {
                        int i101 = 0;
                        while (true) {
                            if (i101 < 4) {
                                int iB6 = tVar.b(6);
                                if (iB6 == 31) {
                                    int i102 = 8 - tVar.f5453c;
                                    if (i102 != i72) {
                                        tVar.b(i102);
                                    }
                                } else {
                                    if ((iB6 & 32) == 0) {
                                        iB6 |= 64;
                                    }
                                    sb2.append((char) iB6);
                                    i101++;
                                }
                            } else if (tVar.a() <= 0) {
                            }
                        }
                    }
                } else {
                    if (iB5 != 6) {
                        throw f.a();
                    }
                    int i103 = tVar.f5452b;
                    int i104 = i103 + 2;
                    int iB7 = x5.a.b(tVar.b(i72), i103 + 1);
                    if (iB7 == 0) {
                        iB7 = tVar.a() / 8;
                    } else if (iB7 >= 250) {
                        iB7 = ((iB7 - 249) * 250) + x5.a.b(tVar.b(i72), i104);
                        i104 = i103 + 3;
                    }
                    if (iB7 < 0) {
                        throw f.a();
                    }
                    byte[] bArr5 = new byte[iB7];
                    int i105 = 0;
                    while (i105 < iB7) {
                        if (tVar.a() < i72) {
                            throw f.a();
                        }
                        bArr5[i105] = (byte) x5.a.b(tVar.b(i72), i104);
                        i105++;
                        i104++;
                    }
                    arrayList.add(bArr5);
                    try {
                        sb2.append(new String(bArr5, "ISO8859_1"));
                    } catch (UnsupportedEncodingException e7) {
                        throw new IllegalStateException("Platform does not support required encoding: ".concat(String.valueOf(e7)));
                    }
                }
                i84 = 2;
            }
            if (i84 == 1 || tVar.a() <= 0) {
                if (sb3.length() > 0) {
                    sb2.append((CharSequence) sb3);
                }
                String string = sb2.toString();
                if (arrayList.isEmpty()) {
                    arrayList = null;
                }
                return new d(bArr3, string, arrayList, null);
            }
            i72 = 8;
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002a A[Catch: c | f -> 0x0052, TryCatch #2 {c | f -> 0x0052, blocks: (B:9:0x0011, B:10:0x0026, B:12:0x002a, B:13:0x002d, B:15:0x0031, B:17:0x003b, B:18:0x0041, B:20:0x0046), top: B:26:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:15:0x0031 A[Catch: c | f -> 0x0052, TryCatch #2 {c | f -> 0x0052, blocks: (B:9:0x0011, B:10:0x0026, B:12:0x002a, B:13:0x002d, B:15:0x0031, B:17:0x003b, B:18:0x0041, B:20:0x0046), top: B:26:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:17:0x003b A[Catch: c | f -> 0x0052, TryCatch #2 {c | f -> 0x0052, blocks: (B:9:0x0011, B:10:0x0026, B:12:0x002a, B:13:0x002d, B:15:0x0031, B:17:0x003b, B:18:0x0041, B:20:0x0046), top: B:26:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0041 A[SYNTHETIC] */
    public d d(t5.b bVar, Map map) throws f, c {
        c cVar;
        t5.b bVar2;
        int i7;
        int i10;
        t0 t0Var = new t0(bVar);
        try {
            return b(t0Var, map);
        } catch (c e7) {
            cVar = e7;
            e = null;
            try {
                t0Var.e();
                t0Var.f5150c = null;
                t0Var.f5151d = null;
                t0Var.f5148a = true;
                t0Var.d();
                t0Var.c();
                bVar2 = (t5.b) t0Var.f5149b;
                i7 = 0;
                while (i7 < bVar2.f12761a) {
                    int i11 = i7 + 1;
                    for (i10 = i11; i10 < bVar2.f12762b; i10++) {
                        if (bVar2.b(i7, i10) != bVar2.b(i10, i7)) {
                            bVar2.a(i10, i7);
                            bVar2.a(i7, i10);
                        }
                    }
                    i7 = i11;
                }
                d dVarB = b(t0Var, map);
                dVarB.f12774e = new k6.f();
                return dVarB;
            } catch (c | f unused) {
                if (e != null) {
                    throw e;
                }
                throw cVar;
            }
        } catch (f e10) {
            e = e10;
            cVar = null;
            t0Var.e();
            t0Var.f5150c = null;
            t0Var.f5151d = null;
            t0Var.f5148a = true;
            t0Var.d();
            t0Var.c();
            bVar2 = (t5.b) t0Var.f5149b;
            i7 = 0;
            while (i7 < bVar2.f12761a) {
                int i12 = i7 + 1;
                while (i10 < bVar2.f12762b) {
                    if (bVar2.b(i7, i10) != bVar2.b(i10, i7)) {
                        bVar2.a(i10, i7);
                        bVar2.a(i7, i10);
                    }
                }
                i7 = i12;
            }
            d dVarB2 = b(t0Var, map);
            dVarB2.f12774e = new k6.f();
            return dVarB2;
        }
    }
}
