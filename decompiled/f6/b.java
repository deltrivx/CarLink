package f6;

import f7.q;
import g6.e;
import g6.g;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import n5.f;
import n5.i;
import n5.k;
import n5.m;
import n5.n;
import n5.o;
import t5.d;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m[] f5376a = new m[0];

    public static int b(o oVar, o oVar2) {
        if (oVar == null || oVar2 == null) {
            return 0;
        }
        return (int) Math.abs(oVar.f8854a - oVar2.f8854a);
    }

    public static int c(o oVar, o oVar2) {
        if (oVar == null || oVar2 == null) {
            return Integer.MAX_VALUE;
        }
        return (int) Math.abs(oVar.f8854a - oVar2.f8854a);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x024b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:101:0x024d  */
    /* JADX WARN: Code duplicated, block: B:102:0x0251  */
    /* JADX WARN: Code duplicated, block: B:103:0x0255  */
    /* JADX WARN: Code duplicated, block: B:108:0x0263 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:109:0x0265  */
    /* JADX WARN: Code duplicated, block: B:110:0x0268  */
    /* JADX WARN: Code duplicated, block: B:111:0x026b  */
    /* JADX WARN: Code duplicated, block: B:128:0x02a6 A[EDGE_INSN: B:128:0x02a6->B:130:0x02b3 BREAK  A[LOOP:5: B:112:0x026e->B:126:0x029f]] */
    /* JADX WARN: Code duplicated, block: B:129:0x02ad A[EDGE_INSN: B:129:0x02ad->B:130:0x02b3 BREAK  A[LOOP:5: B:112:0x026e->B:126:0x029f]] */
    /* JADX WARN: Code duplicated, block: B:133:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:136:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:139:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:140:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:141:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:367:0x069a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x0165 A[PHI: r24
      0x0165: PHI (r24v2 char) = (r24v0 char), (r24v4 char) binds: [B:39:0x0167, B:37:0x0163] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:53:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:95:0x0239 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:96:0x023b  */
    /* JADX WARN: Code duplicated, block: B:97:0x023f  */
    /* JADX WARN: Code duplicated, block: B:98:0x0243  */
    @Override // n5.k
    public final m a(n5.b bVar, Map map) throws i, f, n5.c {
        t5.b bVar2;
        m mVar;
        int i7;
        int i10;
        int i11;
        int i12;
        g6.c cVar;
        t5.b bVar3;
        e eVar;
        char c10;
        g6.a aVarK1;
        char c11;
        q qVar;
        g6.a aVarK2;
        int i13;
        u0.k[] kVarArr;
        int i14;
        t5.b bVar4;
        int i15;
        g6.a[] aVarArr;
        int i16;
        d dVarB;
        int i17;
        u0.k kVar;
        g6.a aVar;
        int i18;
        int i19;
        g6.a aVar2;
        g6.a aVarS0;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        g6.c cVar2;
        int i27;
        g6.a aVarC;
        ArrayList arrayList = new ArrayList();
        t5.b bVarA = bVar.a();
        ArrayList arrayListA = i6.a.a(bVarA);
        char c12 = 0;
        char c13 = 2;
        char c14 = 1;
        if (arrayListA.isEmpty()) {
            int i28 = bVarA.f12761a;
            int i29 = bVarA.f12762b;
            t5.b bVar5 = new t5.b(i28, i29, bVarA.f12763c, (int[]) bVarA.f12764d.clone());
            t5.a aVar3 = new t5.a(i28);
            t5.a aVar4 = new t5.a(i28);
            int i30 = (i29 + 1) / 2;
            for (int i31 = 0; i31 < i30; i31++) {
                aVar3 = bVar5.d(aVar3, i31);
                int i32 = (i29 - 1) - i31;
                aVar4 = bVar5.d(aVar4, i32);
                aVar3.i();
                aVar4.i();
                int[] iArr = aVar4.f12759a;
                int i33 = bVar5.f12763c;
                int[] iArr2 = bVar5.f12764d;
                System.arraycopy(iArr, 0, iArr2, i31 * i33, i33);
                System.arraycopy(aVar3.f12759a, 0, iArr2, i32 * i33, i33);
            }
            bVar2 = bVar5;
            arrayListA = i6.a.a(bVar5);
        } else {
            bVar2 = bVarA;
        }
        Iterator it = arrayListA.iterator();
        while (it.hasNext()) {
            o[] oVarArr = (o[]) it.next();
            o oVar = oVarArr[4];
            o oVar2 = oVarArr[5];
            o oVar3 = oVarArr[6];
            o oVar4 = oVarArr[7];
            int iMin = Math.min(Math.min(c(oVarArr[c12], oVar), (c(oVarArr[6], oVarArr[c13]) * 17) / 18), Math.min(c(oVarArr[c14], oVarArr[5]), (c(oVarArr[7], oVarArr[3]) * 17) / 18));
            int iMax = Math.max(Math.max(b(oVarArr[c12], oVarArr[4]), (b(oVarArr[6], oVarArr[c13]) * 17) / 18), Math.max(b(oVarArr[c14], oVarArr[5]), (b(oVarArr[7], oVarArr[3]) * 17) / 18));
            a2.d dVar = g.f5950a;
            t5.b bVar6 = bVar2;
            g6.c cVar3 = new g6.c(bVar6, oVar, oVar2, oVar3, oVar4);
            e eVarD = null;
            e eVarD2 = null;
            boolean z10 = true;
            while (true) {
                int i34 = cVar3.f5944i;
                i7 = cVar3.f5943h;
                if (oVar != null) {
                    i10 = iMin;
                    i11 = iMax;
                    i12 = i34;
                    t5.b bVar7 = bVar6;
                    cVar = cVar3;
                    bVar3 = bVar7;
                    eVarD = g.d(bVar3, cVar, oVar, true, i10, i11);
                } else {
                    i10 = iMin;
                    i11 = iMax;
                    i12 = i34;
                    t5.b bVar8 = bVar6;
                    cVar = cVar3;
                    bVar3 = bVar8;
                }
                o oVar5 = oVar;
                eVar = eVarD;
                if (oVar3 != null) {
                    eVarD2 = g.d(bVar3, cVar, oVar3, false, i10, i11);
                }
                if (eVar == null && eVarD2 == null) {
                    qVar = null;
                    c10 = 5;
                } else {
                    if (eVar == null || (aVarK1 = eVar.k1()) == null) {
                        c10 = 5;
                        if (eVarD2 == null) {
                            aVarK1 = null;
                        } else {
                            aVarK1 = eVarD2.k1();
                        }
                    } else if (eVarD2 == null || (aVarK2 = eVarD2.k1()) == null) {
                        c10 = 5;
                    } else {
                        c10 = 5;
                        if (aVarK1.f5930b != aVarK2.f5930b && aVarK1.f5931c != aVarK2.f5931c && aVarK1.f5934f != aVarK2.f5934f) {
                            aVarK1 = null;
                        }
                    }
                    if (aVarK1 == null) {
                        qVar = null;
                    } else {
                        g6.c cVarA = g.a(eVar);
                        g6.c cVarA2 = g.a(eVarD2);
                        if (cVarA == null) {
                            cVarA = cVarA2;
                        } else {
                            if (cVarA2 != null) {
                                c11 = 1;
                                cVarA = new g6.c(cVarA.f5936a, cVarA.f5937b, cVarA.f5938c, cVarA2.f5939d, cVarA2.f5940e);
                            }
                            qVar = new q(aVarK1, cVarA);
                        }
                        c11 = 1;
                        qVar = new q(aVarK1, cVarA);
                    }
                    if (qVar != null) {
                        throw i.f8833c;
                    }
                    i13 = qVar.f5446b;
                    kVarArr = (u0.k[]) qVar.f5448d;
                    g6.c cVar4 = (g6.c) qVar.f5449e;
                    if (z10 || cVar4 == null || (cVar4.f5943h >= i7 && cVar4.f5944i <= i12)) {
                        break;
                    }
                    bVar6 = bVar3;
                    cVar3 = cVar4;
                    iMin = i10;
                    iMax = i11;
                    oVar = oVar5;
                    eVarD = eVar;
                    z10 = false;
                }
                c11 = 1;
                if (qVar != null) {
                    throw i.f8833c;
                }
                i13 = qVar.f5446b;
                kVarArr = (u0.k[]) qVar.f5448d;
                g6.c cVar5 = (g6.c) qVar.f5449e;
                if (z10) {
                }
            }
            qVar.f5449e = cVar;
            int i35 = i13 + 1;
            kVarArr[0] = eVar;
            kVarArr[i35] = eVarD2;
            boolean z11 = eVar != null;
            int i36 = 1;
            while (i36 <= i35) {
                int i37 = z11 ? i36 : i35 - i36;
                if (kVarArr[i37] == null) {
                    u0.k eVar2 = (i37 == 0 || i37 == i35) ? new e(cVar, i37 == 0) : new u0.k(cVar);
                    kVarArr[i37] = eVar2;
                    int i38 = i37;
                    int i39 = -1;
                    int iMax2 = i11;
                    int i40 = i7;
                    while (i40 <= i12) {
                        int i41 = z11 ? 1 : -1;
                        int i42 = i38 - i41;
                        if (i42 >= 0) {
                            i19 = i12;
                            if (i42 <= i13 + 1) {
                                u0.k kVar2 = kVarArr[i42];
                                aVar2 = ((g6.a[]) kVar2.f12991c)[kVar2.W0(i40)];
                            }
                            if (aVar2 != null) {
                                aVarS0 = kVarArr[i38].S0(i40);
                                if (aVarS0 != null) {
                                    if (i42 >= 0 && i42 <= i13 + 1) {
                                        aVarS0 = kVarArr[i42].S0(i40);
                                    }
                                    if (aVarS0 != null) {
                                        i20 = i38;
                                        i21 = 0;
                                        while (true) {
                                            i22 = i20 - i41;
                                            if (i22 >= 0 || i22 > i13 + 1) {
                                                if (z11) {
                                                    i23 = ((g6.c) qVar.f5449e).f5942g;
                                                    break;
                                                }
                                                i23 = ((g6.c) qVar.f5449e).f5941f;
                                                break;
                                            }
                                            g6.a[] aVarArr2 = (g6.a[]) kVarArr[i22].f12991c;
                                            int length = aVarArr2.length;
                                            int i43 = i21;
                                            int i44 = 0;
                                            while (i44 < length) {
                                                int i45 = length;
                                                g6.a aVar5 = aVarArr2[i44];
                                                if (aVar5 != null) {
                                                    int i46 = aVar5.f5930b;
                                                    int i47 = aVar5.f5931c;
                                                    i23 = ((i47 - i46) * i41 * i43) + (z11 ? i47 : i46);
                                                    break;
                                                }
                                                i44++;
                                                length = i45;
                                            }
                                            i21 = i43 + 1;
                                            i20 = i22;
                                        }
                                    } else if (z11) {
                                        i23 = aVarS0.f5931c;
                                    } else {
                                        i23 = aVarS0.f5930b;
                                    }
                                } else if (z11) {
                                    i23 = aVarS0.f5930b;
                                } else {
                                    i23 = aVarS0.f5931c;
                                }
                            } else if (z11) {
                                i23 = aVar2.f5931c;
                            } else {
                                i23 = aVar2.f5930b;
                            }
                            if (i23 >= 0 || i23 > cVar.f5942g) {
                                if (i39 != -1) {
                                    i27 = i39;
                                } else {
                                    i24 = i35;
                                    i25 = i36;
                                    i26 = i38;
                                    bVar3 = bVar3;
                                    cVar2 = cVar;
                                    i10 = i10;
                                }
                                i10 = i10;
                                i40++;
                                i35 = i24;
                                cVar = cVar2;
                                i36 = i25;
                                i38 = i26;
                                i12 = i19;
                            } else {
                                i27 = i23;
                            }
                            i25 = i36;
                            i24 = i35;
                            i26 = i38;
                            cVar2 = cVar;
                            bVar3 = bVar3;
                            aVarC = g.c(bVar3, cVar.f5941f, cVar.f5942g, z11, i27, i40, i10, iMax2);
                            if (aVarC != null) {
                                int i48 = aVarC.f5930b;
                                int i49 = aVarC.f5931c;
                                ((g6.a[]) eVar2.f12991c)[eVar2.W0(i40)] = aVarC;
                                int iMin2 = Math.min(i10, i49 - i48);
                                iMax2 = Math.max(iMax2, i49 - i48);
                                i39 = i27;
                                i10 = iMin2;
                            } else {
                                i10 = i10;
                            }
                            i40++;
                            i35 = i24;
                            cVar = cVar2;
                            i36 = i25;
                            i38 = i26;
                            i12 = i19;
                        } else {
                            i19 = i12;
                        }
                        aVar2 = null;
                        if (aVar2 != null) {
                            aVarS0 = kVarArr[i38].S0(i40);
                            if (aVarS0 != null) {
                                if (i42 >= 0) {
                                    aVarS0 = kVarArr[i42].S0(i40);
                                }
                                if (aVarS0 != null) {
                                    i20 = i38;
                                    i21 = 0;
                                    while (true) {
                                        i22 = i20 - i41;
                                        if (i22 >= 0) {
                                        }
                                        if (z11) {
                                            i23 = ((g6.c) qVar.f5449e).f5942g;
                                            break;
                                        }
                                        i23 = ((g6.c) qVar.f5449e).f5941f;
                                        break;
                                        i21 = i43 + 1;
                                        i20 = i22;
                                    }
                                } else if (z11) {
                                    i23 = aVarS0.f5931c;
                                } else {
                                    i23 = aVarS0.f5930b;
                                }
                            } else if (z11) {
                                i23 = aVarS0.f5930b;
                            } else {
                                i23 = aVarS0.f5931c;
                            }
                        } else if (z11) {
                            i23 = aVar2.f5931c;
                        } else {
                            i23 = aVar2.f5930b;
                        }
                        if (i23 >= 0) {
                            if (i39 != -1) {
                                i27 = i39;
                                i25 = i36;
                                i24 = i35;
                                i26 = i38;
                                cVar2 = cVar;
                                bVar3 = bVar3;
                                aVarC = g.c(bVar3, cVar.f5941f, cVar.f5942g, z11, i27, i40, i10, iMax2);
                                if (aVarC != null) {
                                    int i410 = aVarC.f5930b;
                                    int i411 = aVarC.f5931c;
                                    ((g6.a[]) eVar2.f12991c)[eVar2.W0(i40)] = aVarC;
                                    int iMin3 = Math.min(i10, i411 - i410);
                                    iMax2 = Math.max(iMax2, i411 - i410);
                                    i39 = i27;
                                    i10 = iMin3;
                                }
                                i40++;
                                i35 = i24;
                                cVar = cVar2;
                                i36 = i25;
                                i38 = i26;
                                i12 = i19;
                            } else {
                                i24 = i35;
                                i25 = i36;
                                i26 = i38;
                                bVar3 = bVar3;
                                cVar2 = cVar;
                                i10 = i10;
                            }
                        } else if (i39 != -1) {
                            i27 = i39;
                            i25 = i36;
                            i24 = i35;
                            i26 = i38;
                            cVar2 = cVar;
                            bVar3 = bVar3;
                            aVarC = g.c(bVar3, cVar.f5941f, cVar.f5942g, z11, i27, i40, i10, iMax2);
                            if (aVarC != null) {
                                int i412 = aVarC.f5930b;
                                int i413 = aVarC.f5931c;
                                ((g6.a[]) eVar2.f12991c)[eVar2.W0(i40)] = aVarC;
                                int iMin4 = Math.min(i10, i413 - i412);
                                iMax2 = Math.max(iMax2, i413 - i412);
                                i39 = i27;
                                i10 = iMin4;
                            }
                            i40++;
                            i35 = i24;
                            cVar = cVar2;
                            i36 = i25;
                            i38 = i26;
                            i12 = i19;
                        } else {
                            i24 = i35;
                            i25 = i36;
                            i26 = i38;
                            bVar3 = bVar3;
                            cVar2 = cVar;
                            i10 = i10;
                        }
                        i10 = i10;
                        i40++;
                        i35 = i24;
                        cVar = cVar2;
                        i36 = i25;
                        i38 = i26;
                        i12 = i19;
                    }
                    i18 = i36;
                    i11 = iMax2;
                } else {
                    it = it;
                    i7 = i7;
                    i18 = i36;
                }
                i36 = i18 + 1;
                i35 = i35;
                it = it;
                i7 = i7;
                cVar = cVar;
                arrayList = arrayList;
                i12 = i12;
            }
            ArrayList arrayList2 = arrayList;
            Iterator it2 = it;
            int i50 = i35;
            byte[] bArr = null;
            g6.a aVar6 = (g6.a) qVar.f5447c;
            int i51 = aVar6.f5934f;
            int[] iArr3 = new int[2];
            iArr3[c11] = i13 + 2;
            iArr3[0] = i51;
            g6.b[][] bVarArr = (g6.b[][]) Array.newInstance((Class<?>) g6.b.class, iArr3);
            for (g6.b[] bVarArr2 : bVarArr) {
                int i52 = 0;
                while (true) {
                    if (i52 < bVarArr2.length) {
                        bVarArr2[i52] = new g6.b();
                        i52++;
                    }
                }
            }
            qVar.a(kVarArr[0]);
            qVar.a(kVarArr[i50]);
            int i53 = 928;
            while (true) {
                u0.k kVar3 = kVarArr[0];
                if (kVar3 != null && (kVar = kVarArr[i50]) != null) {
                    g6.a[] aVarArr3 = (g6.a[]) kVar3.f12991c;
                    g6.a[] aVarArr4 = (g6.a[]) kVar.f12991c;
                    for (int i54 = 0; i54 < aVarArr3.length; i54++) {
                        g6.a aVar7 = aVarArr3[i54];
                        if (aVar7 != null && (aVar = aVarArr4[i54]) != null && aVar7.f5934f == aVar.f5934f) {
                            for (int i55 = 1; i55 <= i13; i55++) {
                                g6.a aVar8 = ((g6.a[]) kVarArr[i55].f12991c)[i54];
                                if (aVar8 != null) {
                                    int i56 = aVarArr3[i54].f5934f;
                                    aVar8.f5934f = i56;
                                    if (!aVar8.a(i56)) {
                                        ((g6.a[]) kVarArr[i55].f12991c)[i54] = null;
                                    }
                                }
                            }
                        }
                    }
                }
                u0.k kVar4 = kVarArr[0];
                if (kVar4 == null) {
                    i14 = 0;
                } else {
                    g6.a[] aVarArr5 = (g6.a[]) kVar4.f12991c;
                    int i57 = 0;
                    i14 = 0;
                    while (i57 < aVarArr5.length) {
                        g6.a aVar9 = aVarArr5[i57];
                        if (aVar9 != null) {
                            int i58 = aVar9.f5934f;
                            int i59 = 1;
                            int i60 = 0;
                            while (i59 < i50 && i60 < 2) {
                                g6.a aVar10 = ((g6.a[]) kVarArr[i59].f12991c)[i57];
                                t5.b bVar9 = bVar3;
                                if (aVar10 != null) {
                                    if (!aVar10.a(aVar10.f5934f)) {
                                        if (aVar10.a(i58)) {
                                            aVar10.f5934f = i58;
                                            i60 = 0;
                                        } else {
                                            i60++;
                                        }
                                    }
                                    if (!aVar10.a(aVar10.f5934f)) {
                                        i14++;
                                    }
                                }
                                i59++;
                                bVar3 = bVar9;
                            }
                        }
                        i57++;
                        bVar3 = bVar3;
                    }
                }
                bVar4 = bVar3;
                u0.k kVar5 = kVarArr[i50];
                if (kVar5 == null) {
                    i15 = 0;
                } else {
                    g6.a[] aVarArr6 = (g6.a[]) kVar5.f12991c;
                    int i61 = 0;
                    i15 = 0;
                    while (i61 < aVarArr6.length) {
                        g6.a aVar11 = aVarArr6[i61];
                        if (aVar11 != null) {
                            int i62 = aVar11.f5934f;
                            int i63 = i15;
                            int i64 = 0;
                            int i65 = i50;
                            while (i65 > 0 && i64 < 2) {
                                g6.a aVar12 = ((g6.a[]) kVarArr[i65].f12991c)[i61];
                                g6.a[] aVarArr7 = aVarArr6;
                                if (aVar12 != null) {
                                    if (!aVar12.a(aVar12.f5934f)) {
                                        if (aVar12.a(i62)) {
                                            aVar12.f5934f = i62;
                                            i64 = 0;
                                        } else {
                                            i64++;
                                        }
                                    }
                                    if (!aVar12.a(aVar12.f5934f)) {
                                        i63++;
                                    }
                                }
                                i65--;
                                aVarArr6 = aVarArr7;
                            }
                            aVarArr = aVarArr6;
                            i15 = i63;
                        } else {
                            aVarArr = aVarArr6;
                        }
                        i61++;
                        aVarArr6 = aVarArr;
                    }
                }
                int i66 = i14 + i15;
                if (i66 == 0) {
                    i66 = 0;
                } else {
                    for (int i67 = 1; i67 < i50; i67++) {
                        g6.a[] aVarArr8 = (g6.a[]) kVarArr[i67].f12991c;
                        int i68 = 0;
                        while (i68 < aVarArr8.length) {
                            g6.a aVar13 = aVarArr8[i68];
                            if (aVar13 == null || aVar13.a(aVar13.f5934f)) {
                                i16 = i50;
                            } else {
                                g6.a aVar14 = aVarArr8[i68];
                                g6.a[] aVarArr9 = (g6.a[]) kVarArr[i67 - 1].f12991c;
                                u0.k kVar6 = kVarArr[i67 + 1];
                                g6.a[] aVarArr10 = kVar6 != null ? (g6.a[]) kVar6.f12991c : aVarArr9;
                                i16 = i50;
                                g6.a[] aVarArr11 = new g6.a[14];
                                aVarArr11[2] = aVarArr9[i68];
                                aVarArr11[3] = aVarArr10[i68];
                                if (i68 > 0) {
                                    int i69 = i68 - 1;
                                    aVarArr11[0] = aVarArr8[i69];
                                    aVarArr11[4] = aVarArr9[i69];
                                    aVarArr11[c10] = aVarArr10[i69];
                                }
                                if (i68 > 1) {
                                    int i70 = i68 - 2;
                                    aVarArr11[8] = aVarArr8[i70];
                                    aVarArr11[10] = aVarArr9[i70];
                                    aVarArr11[11] = aVarArr10[i70];
                                }
                                if (i68 < aVarArr8.length - 1) {
                                    int i71 = i68 + 1;
                                    aVarArr11[1] = aVarArr8[i71];
                                    aVarArr11[6] = aVarArr9[i71];
                                    aVarArr11[7] = aVarArr10[i71];
                                }
                                if (i68 < aVarArr8.length - 2) {
                                    int i72 = i68 + 2;
                                    aVarArr11[9] = aVarArr8[i72];
                                    aVarArr11[12] = aVarArr9[i72];
                                    aVarArr11[13] = aVarArr10[i72];
                                }
                                int i73 = 0;
                                while (i73 < 14) {
                                    g6.a aVar15 = aVarArr11[i73];
                                    if (aVar15 != null && aVar15.a(aVar15.f5934f)) {
                                        if (aVar15.f5932d == aVar14.f5932d) {
                                            aVar14.f5934f = aVar15.f5934f;
                                            break;
                                        }
                                    }
                                    i73++;
                                    aVarArr11 = aVarArr11;
                                }
                            }
                            i68++;
                            i50 = i16;
                        }
                    }
                }
                int i74 = i50;
                if (i66 <= 0 || i66 >= i53) {
                    break;
                }
                i53 = i66;
                bVar3 = bVar4;
                i50 = i74;
            }
            int i75 = 0;
            for (u0.k kVar7 : kVarArr) {
                if (kVar7 != null) {
                    for (g6.a aVar16 : (g6.a[]) kVar7.f12991c) {
                        if (aVar16 != null && (i17 = aVar16.f5934f) >= 0 && i17 < bVarArr.length) {
                            bVarArr[i17][i75].b(aVar16.f5933e);
                        }
                    }
                }
                i75++;
            }
            g6.b bVar10 = bVarArr[0][1];
            int[] iArrA = bVar10.a();
            int i76 = aVar6.f5931c;
            int i77 = i13 * i51;
            int i78 = i77 - (2 << i76);
            if (iArrA.length == 0) {
                if (i78 <= 0 || i78 > 928) {
                    throw i.f8833c;
                }
                bVar10.b(i78);
            } else if (iArrA[0] != i78 && i78 > 0 && i78 <= 928) {
                bVar10.b(i78);
            }
            ArrayList arrayList3 = new ArrayList();
            int[] iArr4 = new int[i77];
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            for (int i79 = 0; i79 < i51; i79++) {
                int i80 = 0;
                while (i80 < i13) {
                    int i81 = i80 + 1;
                    int[] iArrA2 = bVarArr[i79][i81].a();
                    int i82 = (i79 * i13) + i80;
                    if (iArrA2.length == 0) {
                        arrayList3.add(Integer.valueOf(i82));
                    } else if (iArrA2.length == 1) {
                        iArr4[i82] = iArrA2[0];
                    } else {
                        arrayList5.add(Integer.valueOf(i82));
                        arrayList4.add(iArrA2);
                    }
                    i80 = i81;
                }
            }
            int size = arrayList4.size();
            int[][] iArr5 = new int[size][];
            for (int i83 = 0; i83 < size; i83++) {
                iArr5[i83] = (int[]) arrayList4.get(i83);
            }
            int[] iArrA3 = a.a(arrayList3);
            int[] iArrA4 = a.a(arrayList5);
            int length2 = iArrA4.length;
            int[] iArr6 = new int[length2];
            int i84 = 100;
            while (true) {
                int i85 = i84 - 1;
                if (i84 <= 0) {
                    throw n5.c.a();
                }
                for (int i86 = 0; i86 < length2; i86++) {
                    iArr4[iArrA4[i86]] = iArr5[i86][iArr6[i86]];
                }
                try {
                    dVarB = g.b(iArr4, i76, iArrA3);
                } catch (n5.c unused) {
                    ArrayList arrayList6 = arrayList2;
                    byte[] bArr2 = bArr;
                    if (length2 == 0) {
                        throw n5.c.a();
                    }
                    for (int i87 = 0; i87 < length2; i87++) {
                        int i88 = iArr6[i87];
                        if (i88 < iArr5[i87].length - 1) {
                            iArr6[i87] = i88 + 1;
                            break;
                        }
                        iArr6[i87] = 0;
                        if (i87 == length2 - 1) {
                            throw n5.c.a();
                        }
                    }
                    bArr = bArr2;
                    i84 = i85;
                    arrayList2 = arrayList6;
                }
            }
            m mVar2 = new m(dVarB.f12771b, bArr, oVarArr, n5.a.k);
            mVar2.b(n.f8846c, dVarB.f12773d);
            c cVar6 = (c) dVarB.f12774e;
            if (cVar6 != null) {
                mVar2.b(n.f8851h, cVar6);
            }
            ArrayList arrayList7 = arrayList2;
            arrayList7.add(mVar2);
            arrayList = arrayList7;
            it = it2;
            bVar2 = bVar4;
            c12 = 0;
            c13 = 2;
            c14 = 1;
        }
        m[] mVarArr = (m[]) arrayList.toArray(f5376a);
        if (mVarArr.length == 0 || (mVar = mVarArr[0]) == null) {
            throw i.f8833c;
        }
        return mVar;
    }

    @Override // n5.k
    public final void reset() {
    }
}
