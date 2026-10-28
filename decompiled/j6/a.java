package j6;

import a6.b;
import android.support.v4.media.session.r;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k6.g;
import l6.e;
import n3.l;
import n5.c;
import n5.f;
import n5.i;
import n5.k;
import n5.m;
import n5.n;
import n5.o;
import n5.p;
import t5.d;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a implements k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o[] f6953b = new o[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f6954a = new b(1);

    /* JADX WARN: Code duplicated, block: B:219:0x0421  */
    /* JADX WARN: Code duplicated, block: B:221:0x042e  */
    /* JADX WARN: Code duplicated, block: B:224:0x0467  */
    /* JADX WARN: Code duplicated, block: B:225:0x0477  */
    @Override // n5.k
    public final m a(n5.b bVar, Map map) throws i, f, c {
        ArrayList arrayList;
        l6.c cVar;
        l6.c cVar2;
        l6.c cVar3;
        float f10;
        float f11;
        l6.a aVarV;
        float f12;
        float f13;
        float f14;
        float f15;
        int i7;
        o[] oVarArr;
        d dVarD;
        o[] oVarArr2;
        double d10;
        int i10;
        char c10;
        int iAbs;
        int i11;
        b bVar2 = this.f6954a;
        int i12 = 1;
        int i13 = 0;
        if (map == null || !map.containsKey(n5.d.PURE_BARCODE)) {
            t5.b bVarA = bVar.a();
            r rVar = new r(16, bVarA);
            p pVar = map == null ? null : (p) map.get(n5.d.NEED_RESULT_POINT_CALLBACK);
            rVar.f605c = pVar;
            e eVar = new e(bVarA, pVar);
            boolean z10 = map != null && map.containsKey(n5.d.TRY_HARDER);
            int i14 = bVarA.f12762b;
            int i15 = bVarA.f12761a;
            int i16 = (i14 * 3) / 388;
            if (i16 < 3 || z10) {
                i16 = 3;
            }
            int[] iArr = new int[5];
            int i17 = i16 - 1;
            boolean zD = false;
            while (true) {
                arrayList = eVar.f8073b;
                if (i17 >= i14 || zD) {
                    break;
                }
                Arrays.fill(iArr, i13);
                int i18 = 0;
                while (i18 < i15) {
                    if (bVarA.b(i18, i17)) {
                        if ((i13 & 1) == i12) {
                            i13++;
                        }
                        iArr[i13] = iArr[i13] + i12;
                    } else {
                        if ((i13 & 1) == 0) {
                            if (i13 != 4) {
                                int i19 = i13 + 1;
                                iArr[i19] = iArr[i19] + 1;
                                i13 = i19;
                            } else if (e.b(iArr) && eVar.c(i17, i18, iArr)) {
                                if (eVar.f8074c) {
                                    zD = eVar.d();
                                } else {
                                    if (arrayList.size() > i12) {
                                        Iterator it = arrayList.iterator();
                                        l6.c cVar4 = null;
                                        while (true) {
                                            if (!it.hasNext()) {
                                                i10 = i18;
                                                c10 = 2;
                                                iAbs = 0;
                                                break;
                                            }
                                            l6.c cVar5 = (l6.c) it.next();
                                            i10 = i18;
                                            if (cVar5.f8070d >= 2) {
                                                if (cVar4 != null) {
                                                    eVar.f8074c = true;
                                                    c10 = 2;
                                                    iAbs = ((int) (Math.abs(cVar4.f8854a - cVar5.f8854a) - Math.abs(cVar4.f8855b - cVar5.f8855b))) / 2;
                                                    break;
                                                }
                                                cVar4 = cVar5;
                                            }
                                            i18 = i10;
                                        }
                                    } else {
                                        i10 = i18;
                                        iAbs = 0;
                                        c10 = 2;
                                    }
                                    int i20 = iArr[c10];
                                    if (iAbs > i20) {
                                        i17 += (iAbs - i20) - 2;
                                        i18 = i15 - 1;
                                    } else {
                                        i18 = i10;
                                    }
                                }
                                Arrays.fill(iArr, 0);
                                i13 = 0;
                                i16 = 2;
                            } else {
                                iArr[0] = iArr[2];
                                iArr[1] = iArr[3];
                                iArr[2] = iArr[4];
                                iArr[3] = 1;
                                iArr[4] = 0;
                                i18 = i18;
                                i13 = 3;
                            }
                            i18++;
                            i12 = 1;
                        } else {
                            iArr[i13] = iArr[i13] + 1;
                        }
                        i18 = i18;
                        i18++;
                        i12 = 1;
                    }
                    i18++;
                    i12 = 1;
                }
                if (e.b(iArr) && eVar.c(i17, i15, iArr)) {
                    int i21 = iArr[0];
                    if (eVar.f8074c) {
                        i16 = i21;
                        zD = eVar.d();
                    } else {
                        i16 = i21;
                    }
                }
                i17 += i16;
                i12 = 1;
                i13 = 0;
            }
            if (arrayList.size() < 3) {
                throw i.f8833c;
            }
            arrayList.sort(e.f8071f);
            l6.c[] cVarArr = new l6.c[3];
            int i22 = 0;
            double d11 = Double.MAX_VALUE;
            while (i22 < arrayList.size() - 2) {
                l6.c cVar6 = (l6.c) arrayList.get(i22);
                float f16 = cVar6.f8069c;
                i22++;
                int i23 = i22;
                while (i23 < arrayList.size() - 1) {
                    l6.c cVar7 = (l6.c) arrayList.get(i23);
                    double dE = e.e(cVar6, cVar7);
                    i23++;
                    int i24 = i23;
                    while (i24 < arrayList.size()) {
                        l6.c cVar8 = (l6.c) arrayList.get(i24);
                        l6.c[] cVarArr2 = cVarArr;
                        if (cVar8.f8069c <= 1.4f * f16) {
                            double dE2 = e.e(cVar7, cVar8);
                            double dE3 = e.e(cVar6, cVar8);
                            if (dE < dE2) {
                                if (dE2 <= dE3) {
                                    dE3 = dE2;
                                    dE2 = dE3;
                                } else if (dE >= dE3) {
                                    d10 = dE3;
                                    dE3 = dE;
                                }
                                d10 = dE;
                            } else {
                                if (dE2 >= dE3) {
                                    d10 = dE3;
                                    dE3 = dE2;
                                } else if (dE < dE3) {
                                    d10 = dE2;
                                    dE2 = dE3;
                                    dE3 = dE;
                                } else {
                                    d10 = dE2;
                                }
                                dE2 = dE;
                            }
                            double dAbs = Math.abs(dE2 - (d10 * 2.0d)) + Math.abs(dE2 - (dE3 * 2.0d));
                            if (dAbs < d11) {
                                cVarArr2[0] = cVar6;
                                cVarArr2[1] = cVar7;
                                cVarArr2[2] = cVar8;
                                d11 = dAbs;
                            }
                        }
                        i24++;
                        cVarArr = cVarArr2;
                    }
                }
            }
            l6.c[] cVarArr3 = cVarArr;
            if (d11 == Double.MAX_VALUE) {
                throw i.f8833c;
            }
            float fA = o.a(cVarArr3[0], cVarArr3[1]);
            float fA2 = o.a(cVarArr3[1], cVarArr3[2]);
            float fA3 = o.a(cVarArr3[0], cVarArr3[2]);
            if (fA2 >= fA && fA2 >= fA3) {
                cVar = cVarArr3[0];
                cVar2 = cVarArr3[1];
                cVar3 = cVarArr3[2];
            } else if (fA3 < fA2 || fA3 < fA) {
                cVar = cVarArr3[2];
                cVar2 = cVarArr3[0];
                cVar3 = cVarArr3[1];
            } else {
                cVar = cVarArr3[1];
                cVar2 = cVarArr3[0];
                cVar3 = cVarArr3[2];
            }
            float f17 = cVar.f8854a;
            float f18 = cVar.f8855b;
            if (((cVar2.f8855b - f18) * (cVar3.f8854a - f17)) - ((cVar2.f8854a - f17) * (cVar3.f8855b - f18)) < 0.0f) {
                l6.c cVar9 = cVar3;
                cVar3 = cVar2;
                cVar2 = cVar9;
            }
            cVarArr3[0] = cVar2;
            cVarArr3[1] = cVar;
            cVarArr3[2] = cVar3;
            float fQ = rVar.q(cVar, cVar3);
            float f19 = cVar.f8854a;
            float f20 = cVar3.f8855b;
            float f21 = cVar3.f8854a;
            float fQ2 = rVar.q(cVar, cVar2);
            float f22 = cVar2.f8855b;
            float f23 = cVar2.f8854a;
            float f24 = (fQ2 + fQ) / 2.0f;
            if (f24 < 1.0f) {
                throw i.f8833c;
            }
            int iT = (n3.r.T(o.a(cVar, cVar2) / f24) + n3.r.T(o.a(cVar, cVar3) / f24)) / 2;
            int i25 = iT + 7;
            int i26 = i25 & 3;
            if (i26 == 0) {
                i25 = iT + 8;
            } else if (i26 == 2) {
                i25 = iT + 6;
            } else if (i26 == 3) {
                throw i.f8833c;
            }
            int i27 = i25;
            int[] iArr2 = g.f7329e;
            if (i27 % 4 != 1) {
                throw f.a();
            }
            try {
                g gVarC = g.c((i27 - 17) / 4);
                int i28 = (gVarC.f7331a * 4) + 10;
                if (gVarC.f7332b.length > 0) {
                    float f25 = (f20 - f18) + f22;
                    float f26 = 1.0f - (3.0f / i28);
                    int i29 = (int) (((((f21 - f19) + f23) - f19) * f26) + f19);
                    int i30 = (int) (((f25 - f18) * f26) + f18);
                    f10 = f19;
                    f11 = f20;
                    int i31 = 4;
                    while (true) {
                        if (i31 <= 16) {
                            try {
                                aVarV = rVar.v(f24, i29, i30, i31);
                                break;
                            } catch (i unused) {
                                i31 <<= 1;
                            }
                        }
                    }
                    f12 = i27 - 3.5f;
                    if (aVarV != null) {
                        f13 = aVarV.f8854a;
                        f14 = aVarV.f8855b;
                        f15 = f12 - 3.0f;
                    } else {
                        f13 = (f21 - f10) + f23;
                        f14 = (f11 - f18) + f22;
                        f15 = f12;
                    }
                    t5.b bVarR = l.R(bVarA, i27, i27, t5.f.a(3.5f, 3.5f, f12, 3.5f, f15, f15, 3.5f, f12, cVar.f8854a, cVar.f8855b, cVar3.f8854a, cVar3.f8855b, f13, f14, cVar2.f8854a, cVar2.f8855b));
                    if (aVarV == null) {
                        i7 = 3;
                        oVarArr = new o[]{cVar2, cVar, cVar3};
                    } else {
                        i7 = 3;
                        oVarArr = new o[]{cVar2, cVar, cVar3, aVarV};
                    }
                    dVarD = bVar2.d(bVarR, map);
                    oVarArr2 = oVarArr;
                } else {
                    f10 = f19;
                    f11 = f20;
                }
                aVarV = null;
                f12 = i27 - 3.5f;
                if (aVarV != null) {
                    f13 = aVarV.f8854a;
                    f14 = aVarV.f8855b;
                    f15 = f12 - 3.0f;
                } else {
                    f13 = (f21 - f10) + f23;
                    f14 = (f11 - f18) + f22;
                    f15 = f12;
                }
                t5.b bVarR2 = l.R(bVarA, i27, i27, t5.f.a(3.5f, 3.5f, f12, 3.5f, f15, f15, 3.5f, f12, cVar.f8854a, cVar.f8855b, cVar3.f8854a, cVar3.f8855b, f13, f14, cVar2.f8854a, cVar2.f8855b));
                if (aVarV == null) {
                    i7 = 3;
                    oVarArr = new o[]{cVar2, cVar, cVar3};
                } else {
                    i7 = 3;
                    oVarArr = new o[]{cVar2, cVar, cVar3, aVarV};
                }
                dVarD = bVar2.d(bVarR2, map);
                oVarArr2 = oVarArr;
            } catch (IllegalArgumentException unused2) {
                throw f.a();
            }
        } else {
            t5.b bVarA2 = bVar.a();
            int[] iArrE = bVarA2.e();
            int i32 = bVarA2.f12761a;
            int[] iArrC = bVarA2.c();
            if (iArrE == null || iArrC == null) {
                throw i.f8833c;
            }
            int i33 = bVarA2.f12762b;
            int i34 = iArrE[0];
            int i35 = iArrE[1];
            boolean z11 = true;
            int i36 = 0;
            while (i34 < i32 && i35 < i33) {
                if (z11 != bVarA2.b(i34, i35)) {
                    int i37 = i36 + 1;
                    if (i37 == 5) {
                        break;
                    }
                    z11 = !z11;
                    i36 = i37;
                }
                i34++;
                i35++;
            }
            if (i34 == i32 || i35 == i33) {
                throw i.f8833c;
            }
            int i38 = iArrE[0];
            float f27 = (i34 - i38) / 7.0f;
            int i39 = iArrE[1];
            int i40 = iArrC[1];
            int i41 = iArrC[0];
            if (i38 >= i41 || i39 >= i40) {
                throw i.f8833c;
            }
            int i42 = i40 - i39;
            if (i42 != i41 - i38 && (i41 = i38 + i42) >= i32) {
                throw i.f8833c;
            }
            int iRound = Math.round(((i41 - i38) + 1) / f27);
            int iRound2 = Math.round((i42 + 1) / f27);
            if (iRound <= 0 || iRound2 <= 0) {
                throw i.f8833c;
            }
            if (iRound2 != iRound) {
                throw i.f8833c;
            }
            int i43 = (int) (f27 / 2.0f);
            int i44 = i39 + i43;
            int i45 = i38 + i43;
            int i46 = (((int) ((iRound - 1) * f27)) + i45) - i41;
            if (i46 > 0) {
                if (i46 > i43) {
                    throw i.f8833c;
                }
                i45 -= i46;
            }
            int i47 = (((int) ((iRound2 - 1) * f27)) + i44) - i40;
            if (i47 > 0) {
                if (i47 > i43) {
                    throw i.f8833c;
                }
                i44 -= i47;
            }
            t5.b bVar3 = new t5.b(iRound, iRound2);
            for (int i48 = 0; i48 < iRound2; i48++) {
                int i49 = ((int) (i48 * f27)) + i44;
                for (int i50 = 0; i50 < iRound; i50++) {
                    if (bVarA2.b(((int) (i50 * f27)) + i45, i49)) {
                        bVar3.f(i50, i48);
                    }
                }
            }
            dVarD = bVar2.d(bVar3, map);
            oVarArr2 = f6953b;
            i7 = 3;
        }
        int i51 = dVarD.f12775f;
        if ((dVarD.f12774e instanceof k6.f) && oVarArr2.length >= i7) {
            o oVar = oVarArr2[0];
            oVarArr2[0] = oVarArr2[2];
            oVarArr2[2] = oVar;
        }
        m mVar = new m(dVarD.f12771b, dVarD.f12770a, oVarArr2, n5.a.f8800l);
        List list = dVarD.f12772c;
        if (list != null) {
            mVar.b(n.f8845b, list);
        }
        String str = dVarD.f12773d;
        if (str != null) {
            mVar.b(n.f8846c, str);
        }
        if (i51 >= 0 && (i11 = dVarD.f12776g) >= 0) {
            mVar.b(n.f8852i, Integer.valueOf(i11));
            mVar.b(n.f8853j, Integer.valueOf(i51));
        }
        return mVar;
    }

    @Override // n5.k
    public final void reset() {
    }
}
