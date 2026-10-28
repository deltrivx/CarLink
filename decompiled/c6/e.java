package c6;

import b6.h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import n3.r;
import n5.i;
import n5.m;
import n5.o;
import n5.p;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e extends a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int[] f2446i = {1, 10, 34, 70, 126};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int[] f2447j = {4, 20, 48, 81};
    public static final int[] k = {0, 161, 961, 2015, 2715};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int[] f2448l = {0, 336, 1036, 1516};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int[] f2449m = {8, 6, 4, 3, 1};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int[] f2450n = {2, 4, 6, 8};

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int[][] f2451o = {new int[]{3, 8, 2, 1}, new int[]{3, 5, 5, 1}, new int[]{3, 3, 7, 1}, new int[]{3, 1, 9, 1}, new int[]{2, 7, 4, 1}, new int[]{2, 5, 6, 1}, new int[]{2, 3, 8, 1}, new int[]{1, 5, 7, 1}, new int[]{1, 3, 9, 1}};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f2452g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f2453h = new ArrayList();

    public static void j(ArrayList arrayList, d dVar) {
        if (dVar == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            d dVar2 = (d) it.next();
            if (dVar2.f2439a == dVar.f2439a) {
                dVar2.f2445d++;
                return;
            }
        }
        arrayList.add(dVar);
    }

    @Override // b6.h
    public final m b(int i7, t5.a aVar, Map map) throws i {
        d dVarL = l(aVar, false, i7, map);
        ArrayList<d> arrayList = this.f2452g;
        j(arrayList, dVarL);
        aVar.i();
        d dVarL2 = l(aVar, true, i7, map);
        ArrayList<d> arrayList2 = this.f2453h;
        j(arrayList2, dVarL2);
        aVar.i();
        for (d dVar : arrayList) {
            int i10 = dVar.f2445d;
            c cVar = dVar.f2444c;
            if (i10 > 1) {
                for (d dVar2 : arrayList2) {
                    int i11 = dVar2.f2445d;
                    c cVar2 = dVar2.f2444c;
                    if (i11 > 1) {
                        int i12 = ((dVar2.f2440b * 16) + dVar.f2440b) % 79;
                        int i13 = (cVar.f2441a * 9) + cVar2.f2441a;
                        if (i13 > 72) {
                            i13--;
                        }
                        if (i13 > 8) {
                            i13--;
                        }
                        if (i12 == i13) {
                            String strValueOf = String.valueOf((((long) dVar.f2439a) * 4537077) + ((long) dVar2.f2439a));
                            StringBuilder sb2 = new StringBuilder(14);
                            for (int length = 13 - strValueOf.length(); length > 0; length--) {
                                sb2.append('0');
                            }
                            sb2.append(strValueOf);
                            int i14 = 0;
                            for (int i15 = 0; i15 < 13; i15++) {
                                int iCharAt = sb2.charAt(i15) - '0';
                                if ((i15 & 1) == 0) {
                                    iCharAt *= 3;
                                }
                                i14 += iCharAt;
                            }
                            int i16 = 10 - (i14 % 10);
                            if (i16 == 10) {
                                i16 = 0;
                            }
                            sb2.append(i16);
                            o[] oVarArr = cVar.f2443c;
                            o[] oVarArr2 = cVar2.f2443c;
                            return new m(sb2.toString(), null, new o[]{oVarArr[0], oVarArr[1], oVarArr2[0], oVarArr2[1]}, n5.a.f8801m);
                        }
                    }
                }
            }
        }
        throw i.f8833c;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x008f A[PHI: r14 r15
      0x008f: PHI (r14v15 boolean) = (r14v5 boolean), (r14v19 boolean) binds: [B:47:0x00ad, B:33:0x008d] A[DONT_GENERATE, DONT_INLINE]
      0x008f: PHI (r15v11 boolean) = (r15v1 boolean), (r15v13 boolean) binds: [B:47:0x00ad, B:33:0x008d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:36:0x0096 A[PHI: r14 r15
      0x0096: PHI (r14v9 boolean) = (r14v5 boolean), (r14v19 boolean) binds: [B:49:0x00b0, B:35:0x0094] A[DONT_GENERATE, DONT_INLINE]
      0x0096: PHI (r15v5 boolean) = (r15v1 boolean), (r15v13 boolean) binds: [B:49:0x00b0, B:35:0x0094] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:38:0x009b A[PHI: r14 r15
      0x009b: PHI (r14v7 boolean) = (r14v5 boolean), (r14v19 boolean) binds: [B:49:0x00b0, B:35:0x0094] A[DONT_GENERATE, DONT_INLINE]
      0x009b: PHI (r15v3 boolean) = (r15v1 boolean), (r15v13 boolean) binds: [B:49:0x00b0, B:35:0x0094] A[DONT_GENERATE, DONT_INLINE]] */
    public final b k(t5.a aVar, c cVar, boolean z10) throws i {
        float[] fArr;
        float[] fArr2;
        int[] iArr;
        int[] iArr2;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int[] iArr3 = cVar.f2442b;
        int[] iArr4 = this.f2434b;
        Arrays.fill(iArr4, 0);
        if (z10) {
            h.f(iArr3[0], aVar, iArr4);
        } else {
            h.e(iArr3[1], aVar, iArr4);
            int i7 = 0;
            for (int length = iArr4.length - 1; i7 < length; length--) {
                int i10 = iArr4[i7];
                iArr4[i7] = iArr4[length];
                iArr4[length] = i10;
                i7++;
            }
        }
        int i11 = z10 ? 16 : 15;
        float fA0 = r.a0(iArr4) / i11;
        int i12 = 0;
        while (true) {
            int length2 = iArr4.length;
            fArr = this.f2436d;
            fArr2 = this.f2435c;
            iArr = this.f2438f;
            iArr2 = this.f2437e;
            if (i12 >= length2) {
                break;
            }
            float f10 = iArr4[i12] / fA0;
            int i13 = (int) (0.5f + f10);
            if (i13 <= 0) {
                i13 = 1;
            } else if (i13 > 8) {
                i13 = 8;
            }
            int i14 = i12 / 2;
            if ((i12 & 1) == 0) {
                iArr2[i14] = i13;
                fArr2[i14] = f10 - i13;
            } else {
                iArr[i14] = i13;
                fArr[i14] = f10 - i13;
            }
            i12++;
        }
        int iA0 = r.a0(iArr2);
        int iA1 = r.a0(iArr);
        if (z10) {
            if (iA0 > 12) {
                z11 = false;
                z12 = true;
            } else {
                z11 = iA0 < 4;
                z12 = false;
            }
            if (iA1 > 12) {
                z13 = false;
                z14 = true;
            } else {
                if (iA1 < 4) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = false;
            }
        } else {
            if (iA0 > 11) {
                z11 = false;
                z12 = true;
            } else {
                z11 = iA0 < 5;
                z12 = false;
            }
            if (iA1 > 10) {
                z13 = false;
                z14 = true;
            } else {
                if (iA1 < 4) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = false;
            }
        }
        int i15 = (iA0 + iA1) - i11;
        boolean z15 = (iA0 & 1) == z10;
        boolean z16 = (iA1 & 1) == 1;
        if (i15 != -1) {
            if (i15 != 0) {
                if (i15 != 1) {
                    throw i.f8833c;
                }
                if (!z15) {
                    if (!z16) {
                        throw i.f8833c;
                    }
                    z14 = true;
                } else {
                    if (z16) {
                        throw i.f8833c;
                    }
                    z12 = true;
                }
            } else if (z15) {
                if (!z16) {
                    throw i.f8833c;
                }
                if (iA0 < iA1) {
                    z11 = true;
                    z14 = true;
                } else {
                    z12 = true;
                    z13 = true;
                }
            } else if (z16) {
                throw i.f8833c;
            }
        } else if (!z15) {
            if (!z16) {
                throw i.f8833c;
            }
            z13 = true;
        } else {
            if (z16) {
                throw i.f8833c;
            }
            z11 = true;
        }
        if (z11) {
            if (z12) {
                throw i.f8833c;
            }
            a.h(iArr2, fArr2);
        }
        if (z12) {
            a.g(iArr2, fArr2);
        }
        if (z13) {
            if (z14) {
                throw i.f8833c;
            }
            a.h(iArr, fArr2);
        }
        if (z14) {
            a.g(iArr, fArr);
        }
        int i16 = 0;
        int i17 = 0;
        for (int length3 = iArr2.length - 1; length3 >= 0; length3--) {
            int i18 = iArr2[length3];
            i16 = (i16 * 9) + i18;
            i17 += i18;
        }
        int i19 = 0;
        int i20 = 0;
        for (int length4 = iArr.length - 1; length4 >= 0; length4--) {
            int i21 = iArr[length4];
            i19 = (i19 * 9) + i21;
            i20 += i21;
        }
        int i22 = (i19 * 3) + i16;
        if (!z10) {
            if ((i20 & 1) != 0 || i20 > 10 || i20 < 4) {
                throw i.f8833c;
            }
            int i23 = (10 - i20) / 2;
            int i24 = f2450n[i23];
            return new b((a.a.D(iArr, 9 - i24, false) * f2447j[i23]) + a.a.D(iArr2, i24, true) + f2448l[i23], i22);
        }
        if ((i17 & 1) != 0 || i17 > 12 || i17 < 4) {
            throw i.f8833c;
        }
        int i25 = (12 - i17) / 2;
        int i26 = f2449m[i25];
        return new b((a.a.D(iArr2, i26, false) * f2446i[i25]) + a.a.D(iArr, 9 - i26, true) + k[i25], i22);
    }

    public final d l(t5.a aVar, boolean z10, int i7, Map map) {
        try {
            c cVarN = n(aVar, i7, z10, m(aVar, z10));
            p pVar = map == null ? null : (p) map.get(n5.d.NEED_RESULT_POINT_CALLBACK);
            if (pVar != null) {
                int[] iArr = cVarN.f2442b;
                float f10 = ((iArr[0] + iArr[1]) - 1) / 2.0f;
                if (z10) {
                    f10 = (aVar.f12760b - 1) - f10;
                }
                pVar.a(new o(f10, i7));
            }
            b bVarK = k(aVar, cVarN, true);
            b bVarK2 = k(aVar, cVarN, false);
            return new d((bVarK.f2439a * 1597) + bVarK2.f2439a, (bVarK2.f2440b * 4) + bVarK.f2440b, cVarN);
        } catch (i unused) {
            return null;
        }
    }

    public final int[] m(t5.a aVar, boolean z10) throws i {
        int[] iArr = this.f2433a;
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        int i7 = aVar.f12760b;
        int i10 = 0;
        boolean z11 = false;
        while (i10 < i7) {
            z11 = !aVar.d(i10);
            if (z10 == z11) {
                break;
            }
            i10++;
        }
        int i11 = i10;
        int i12 = 0;
        while (i10 < i7) {
            if (aVar.d(i10) != z11) {
                iArr[i12] = iArr[i12] + 1;
            } else {
                if (i12 != 3) {
                    i12++;
                } else {
                    if (a.i(iArr)) {
                        return new int[]{i11, i10};
                    }
                    i11 += iArr[0] + iArr[1];
                    iArr[0] = iArr[2];
                    iArr[1] = iArr[3];
                    iArr[2] = 0;
                    iArr[3] = 0;
                    i12--;
                }
                iArr[i12] = 1;
                z11 = !z11;
            }
            i10++;
        }
        throw i.f8833c;
    }

    public final c n(t5.a aVar, int i7, boolean z10, int[] iArr) throws i {
        int i10;
        int i11;
        boolean zD = aVar.d(iArr[0]);
        int i12 = iArr[0] - 1;
        while (i12 >= 0 && zD != aVar.d(i12)) {
            i12--;
        }
        int i13 = i12 + 1;
        int i14 = iArr[0] - i13;
        int[] iArr2 = this.f2433a;
        System.arraycopy(iArr2, 0, iArr2, 1, iArr2.length - 1);
        iArr2[0] = i14;
        for (int i15 = 0; i15 < 9; i15++) {
            if (h.d(iArr2, f2451o[i15], 0.45f) < 0.2f) {
                int i16 = iArr[1];
                if (z10) {
                    int i17 = aVar.f12760b - 1;
                    i10 = i17 - i16;
                    i11 = i17 - i13;
                } else {
                    i10 = i16;
                    i11 = i13;
                }
                return new c(i15, i11, i10, i7, new int[]{i13, i16});
            }
        }
        throw i.f8833c;
    }

    @Override // b6.h, n5.k
    public final void reset() {
        this.f2452g.clear();
        this.f2453h.clear();
    }
}
