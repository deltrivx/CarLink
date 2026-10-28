package d6;

import b6.h;
import com.baidu.carlife.sdk.Constants;
import com.baidu.carlife.sdk.receiver.transport.aoa.UsbAccessoryStarter;
import e6.f;
import e6.g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import n3.r;
import n5.i;
import n5.m;
import n5.o;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c extends c6.a {
    public static final int[] k = {7, 5, 4, 3, 1};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int[] f3777l = {4, 20, 52, 104, 204};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int[] f3778m = {0, 348, 1388, 2948, 3988};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int[][] f3779n = {new int[]{1, 8, 4, 1}, new int[]{3, 6, 4, 1}, new int[]{3, 4, 6, 1}, new int[]{3, 2, 8, 1}, new int[]{2, 6, 5, 1}, new int[]{2, 2, 9, 1}};

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int[][] f3780o = {new int[]{1, 3, 9, 27, 81, 32, 96, 77}, new int[]{20, 60, 180, 118, 143, 7, 21, 63}, new int[]{189, 145, 13, 39, 117, 140, 209, 205}, new int[]{193, 157, 49, 147, 19, 57, 171, 91}, new int[]{62, 186, 136, 197, 169, 85, 44, 132}, new int[]{185, 133, 188, 142, 4, 12, 36, 108}, new int[]{113, 128, 173, 97, 80, 29, 87, 50}, new int[]{150, 28, 84, 41, 123, 158, 52, 156}, new int[]{46, 138, 203, 187, 139, 206, 196, 166}, new int[]{76, 17, 51, 153, 37, 111, 122, 155}, new int[]{43, 129, 176, 106, 107, 110, 119, 146}, new int[]{16, 48, 144, 10, 30, 90, 59, 177}, new int[]{109, 116, 137, Constants.MSG_RESPONSE_SUCCESS, 178, 112, 125, 164}, new int[]{70, 210, 208, 202, 184, 130, 179, 115}, new int[]{134, 191, 151, 31, 93, 68, 204, 190}, new int[]{148, 22, 66, 198, 172, 94, 71, 2}, new int[]{6, 18, 54, 162, 64, 192, 154, 40}, new int[]{120, 149, 25, 75, 14, 42, 126, 167}, new int[]{79, 26, 78, 23, 69, 207, 199, 175}, new int[]{103, 98, 83, 38, 114, 131, 182, 124}, new int[]{161, 61, 183, 127, 170, 88, 53, 159}, new int[]{55, 165, 73, 8, 24, 72, 5, 15}, new int[]{45, 135, 194, 160, 58, 174, 100, 89}};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int[][] f3781p = {new int[]{0, 0}, new int[]{0, 1, 1}, new int[]{0, 2, 1, 3}, new int[]{0, 4, 1, 3, 2}, new int[]{0, 4, 1, 3, 3, 5}, new int[]{0, 4, 1, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 2, 3, 3}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 4}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 3, 3, 4, 4, 5, 5}};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f3782g = new ArrayList(11);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f3783h = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int[] f3784i = new int[2];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f3785j;

    public static m m(List list) {
        f aVar;
        int i7 = 1;
        int size = list.size() << 1;
        int i10 = size - 1;
        int i11 = 2;
        if (((a) list.get(list.size() - 1)).f3773b == null) {
            i10 = size - 2;
        }
        t5.a aVar2 = new t5.a(i10 * 12);
        int i12 = 0;
        int i13 = ((a) list.get(0)).f3773b.f2439a;
        int i14 = 0;
        for (int i15 = 11; i15 >= 0; i15--) {
            if (((1 << i15) & i13) != 0) {
                aVar2.j(i14);
            }
            i14++;
        }
        for (int i16 = 1; i16 < list.size(); i16++) {
            a aVar3 = (a) list.get(i16);
            int i17 = aVar3.f3772a.f2439a;
            for (int i18 = 11; i18 >= 0; i18--) {
                if (((1 << i18) & i17) != 0) {
                    aVar2.j(i14);
                }
                i14++;
            }
            c6.b bVar = aVar3.f3773b;
            if (bVar != null) {
                int i19 = bVar.f2439a;
                for (int i20 = 11; i20 >= 0; i20--) {
                    if (((1 << i20) & i19) != 0) {
                        aVar2.j(i14);
                    }
                    i14++;
                }
            }
        }
        if (aVar2.d(1)) {
            aVar = new e6.b(aVar2, i11);
        } else if (aVar2.d(2)) {
            int iX = a2.b.x(1, 4, aVar2);
            if (iX == 4) {
                aVar = new e6.a(aVar2, 0);
            } else if (iX != 5) {
                int iX2 = a2.b.x(1, 5, aVar2);
                if (iX2 == 12) {
                    aVar = new e6.b(aVar2, i12);
                } else if (iX2 != 13) {
                    switch (a2.b.x(1, 7, aVar2)) {
                        case 56:
                            aVar = new e6.c(aVar2, "310", "11");
                            break;
                        case 57:
                            aVar = new e6.c(aVar2, "320", "11");
                            break;
                        case UsbAccessoryStarter.AOA_AUDIO_SUPPORT /* 58 */:
                            aVar = new e6.c(aVar2, "310", "13");
                            break;
                        case 59:
                            aVar = new e6.c(aVar2, "320", "13");
                            break;
                        case 60:
                            aVar = new e6.c(aVar2, "310", "15");
                            break;
                        case 61:
                            aVar = new e6.c(aVar2, "320", "15");
                            break;
                        case 62:
                            aVar = new e6.c(aVar2, "310", "17");
                            break;
                        case 63:
                            aVar = new e6.c(aVar2, "320", "17");
                            break;
                        default:
                            throw new IllegalStateException("unknown decoder: ".concat(String.valueOf(aVar2)));
                    }
                } else {
                    aVar = new e6.b(aVar2, i7);
                }
            } else {
                aVar = new e6.a(aVar2, 1);
            }
        } else {
            aVar = new g(aVar2);
        }
        String strM = aVar.m();
        o[] oVarArr = ((a) list.get(0)).f3774c.f2443c;
        o[] oVarArr2 = ((a) list.get(list.size() - 1)).f3774c.f2443c;
        return new m(strM, null, new o[]{oVarArr[0], oVarArr[1], oVarArr2[0], oVarArr2[1]}, n5.a.f8802n);
    }

    @Override // b6.h
    public final m b(int i7, t5.a aVar, Map map) {
        ArrayList arrayList = this.f3782g;
        arrayList.clear();
        this.f3785j = false;
        try {
            return m(o(aVar, i7));
        } catch (i unused) {
            arrayList.clear();
            this.f3785j = true;
            return m(o(aVar, i7));
        }
    }

    public final boolean j() {
        ArrayList arrayList = this.f3782g;
        a aVar = (a) arrayList.get(0);
        c6.b bVar = aVar.f3772a;
        c6.b bVar2 = aVar.f3773b;
        if (bVar2 != null) {
            int i7 = bVar2.f2440b;
            int i10 = 2;
            for (int i11 = 1; i11 < arrayList.size(); i11++) {
                a aVar2 = (a) arrayList.get(i11);
                i7 += aVar2.f3772a.f2440b;
                int i12 = i10 + 1;
                c6.b bVar3 = aVar2.f3773b;
                if (bVar3 != null) {
                    i7 += bVar3.f2440b;
                    i10 += 2;
                } else {
                    i10 = i12;
                }
            }
            if (((i10 - 4) * 211) + (i7 % 211) == bVar.f2439a) {
                return true;
            }
        }
        return false;
    }

    public final List k(int i7, ArrayList arrayList) throws i {
        while (true) {
            ArrayList arrayList2 = this.f3783h;
            if (i7 >= arrayList2.size()) {
                throw i.f8833c;
            }
            b bVar = (b) arrayList2.get(i7);
            ArrayList arrayList3 = this.f3782g;
            arrayList3.clear();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList3.addAll(((b) it.next()).f3775a);
            }
            arrayList3.addAll(bVar.f3775a);
            for (int i10 = 0; i10 < 10; i10++) {
                int[] iArr = f3781p[i10];
                if (arrayList3.size() <= iArr.length) {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= arrayList3.size()) {
                            if (!j()) {
                                ArrayList arrayList4 = new ArrayList(arrayList);
                                arrayList4.add(bVar);
                                try {
                                    return k(i7 + 1, arrayList4);
                                } catch (i unused) {
                                    break;
                                }
                            }
                            return arrayList3;
                        }
                        if (((a) arrayList3.get(i11)).f3774c.f2441a != iArr[i11]) {
                            break;
                        }
                        i11++;
                    }
                }
            }
            i7++;
        }
    }

    public final List l(boolean z10) {
        ArrayList arrayList = this.f3783h;
        List listK = null;
        if (arrayList.size() > 25) {
            arrayList.clear();
            return null;
        }
        this.f3782g.clear();
        if (z10) {
            Collections.reverse(arrayList);
        }
        try {
            listK = k(0, new ArrayList());
        } catch (i unused) {
        }
        if (z10) {
            Collections.reverse(arrayList);
        }
        return listK;
    }

    public final c6.b n(t5.a aVar, c6.c cVar, boolean z10, boolean z11) throws i {
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        int[][] iArr;
        int[] iArr2 = this.f2434b;
        Arrays.fill(iArr2, 0);
        if (z11) {
            h.f(cVar.f2442b[0], aVar, iArr2);
        } else {
            h.e(cVar.f2442b[1], aVar, iArr2);
            int i7 = 0;
            for (int length = iArr2.length - 1; i7 < length; length--) {
                int i10 = iArr2[i7];
                iArr2[i7] = iArr2[length];
                iArr2[length] = i10;
                i7++;
            }
        }
        float fA0 = r.a0(iArr2) / 17.0f;
        int[] iArr3 = cVar.f2442b;
        int i11 = cVar.f2441a;
        float f10 = (iArr3[1] - iArr3[0]) / 15.0f;
        if (Math.abs(fA0 - f10) / f10 > 0.3f) {
            throw i.f8833c;
        }
        int i12 = 0;
        while (true) {
            int length2 = iArr2.length;
            float[] fArr = this.f2436d;
            float[] fArr2 = this.f2435c;
            int[] iArr4 = this.f2438f;
            int[] iArr5 = this.f2437e;
            if (i12 >= length2) {
                int iA0 = r.a0(iArr5);
                int iA1 = r.a0(iArr4);
                if (iA0 > 13) {
                    z12 = false;
                    z13 = true;
                } else {
                    z12 = iA0 < 4;
                    z13 = false;
                }
                if (iA1 > 13) {
                    z14 = false;
                    z15 = true;
                } else {
                    z14 = iA1 < 4;
                    z15 = false;
                }
                int i13 = (iA0 + iA1) - 17;
                boolean z16 = (iA0 & 1) == 1;
                boolean z17 = (iA1 & 1) == 0;
                if (i13 != -1) {
                    if (i13 != 0) {
                        if (i13 != 1) {
                            throw i.f8833c;
                        }
                        if (!z16) {
                            if (!z17) {
                                throw i.f8833c;
                            }
                            z15 = true;
                        } else {
                            if (z17) {
                                throw i.f8833c;
                            }
                            z13 = true;
                        }
                    } else if (z16) {
                        if (!z17) {
                            throw i.f8833c;
                        }
                        if (iA0 < iA1) {
                            z12 = true;
                            z15 = true;
                        } else {
                            z13 = true;
                            z14 = true;
                        }
                    } else if (z17) {
                        throw i.f8833c;
                    }
                } else if (!z16) {
                    if (!z17) {
                        throw i.f8833c;
                    }
                    z14 = true;
                } else {
                    if (z17) {
                        throw i.f8833c;
                    }
                    z12 = true;
                }
                if (z12) {
                    if (z13) {
                        throw i.f8833c;
                    }
                    c6.a.h(iArr5, fArr2);
                }
                if (z13) {
                    c6.a.g(iArr5, fArr2);
                }
                if (z14) {
                    if (z15) {
                        throw i.f8833c;
                    }
                    c6.a.h(iArr4, fArr2);
                }
                if (z15) {
                    c6.a.g(iArr4, fArr);
                }
                int i14 = (((i11 * 4) + (z10 ? 0 : 2)) + (!z11 ? 1 : 0)) - 1;
                int length3 = iArr5.length - 1;
                int i15 = 0;
                int i16 = 0;
                while (true) {
                    iArr = f3780o;
                    if (length3 < 0) {
                        break;
                    }
                    if (i11 != 0 || !z10 || !z11) {
                        i15 += iArr5[length3] * iArr[i14][length3 * 2];
                    }
                    i16 += iArr5[length3];
                    length3--;
                }
                int i17 = 0;
                for (int length4 = iArr4.length - 1; length4 >= 0; length4--) {
                    if (i11 != 0 || !z10 || !z11) {
                        i17 += iArr4[length4] * iArr[i14][(length4 * 2) + 1];
                    }
                }
                int i18 = i15 + i17;
                if ((i16 & 1) != 0 || i16 > 13 || i16 < 4) {
                    throw i.f8833c;
                }
                int i19 = (13 - i16) / 2;
                int i20 = k[i19];
                return new c6.b((a.a.D(iArr5, i20, true) * f3777l[i19]) + a.a.D(iArr4, 9 - i20, false) + f3778m[i19], i18);
            }
            float f11 = (iArr2[i12] * 1.0f) / fA0;
            int i21 = (int) (0.5f + f11);
            if (i21 <= 0) {
                if (f11 < 0.3f) {
                    throw i.f8833c;
                }
                i21 = 1;
            } else if (i21 > 8) {
                if (f11 > 8.7f) {
                    throw i.f8833c;
                }
                i21 = 8;
            }
            int i22 = i12 / 2;
            if ((i12 & 1) == 0) {
                iArr5[i22] = i21;
                fArr2[i22] = f11 - i21;
            } else {
                iArr4[i22] = i21;
                fArr[i22] = f11 - i21;
            }
            i12++;
        }
    }

    public final List o(t5.a aVar, int i7) throws i {
        boolean zEquals;
        boolean z10;
        boolean z11 = false;
        while (true) {
            ArrayList arrayList = this.f3782g;
            if (z11) {
                if (j()) {
                    return arrayList;
                }
                ArrayList arrayList2 = this.f3783h;
                boolean zIsEmpty = arrayList2.isEmpty();
                int i10 = 0;
                boolean zEquals2 = false;
                while (true) {
                    if (i10 >= arrayList2.size()) {
                        zEquals = false;
                        break;
                    }
                    b bVar = (b) arrayList2.get(i10);
                    int i11 = bVar.f3776b;
                    ArrayList arrayList3 = bVar.f3775a;
                    if (i11 > i7) {
                        zEquals = arrayList3.equals(arrayList);
                        break;
                    }
                    zEquals2 = arrayList3.equals(arrayList);
                    i10++;
                }
                if (!zEquals && !zEquals2) {
                    Iterator it = arrayList2.iterator();
                    loop2: while (true) {
                        if (!it.hasNext()) {
                            z10 = false;
                            break;
                        }
                        b bVar2 = (b) it.next();
                        Iterator it2 = arrayList.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                z10 = true;
                                break loop2;
                            }
                            a aVar2 = (a) it2.next();
                            Iterator it3 = bVar2.f3775a.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    if (aVar2.equals((a) it3.next())) {
                                    }
                                }
                            }
                        }
                    }
                    if (!z10) {
                        arrayList2.add(i10, new b(i7, arrayList));
                        Iterator it4 = arrayList2.iterator();
                        while (it4.hasNext()) {
                            b bVar3 = (b) it4.next();
                            if (bVar3.f3775a.size() != arrayList.size()) {
                                Iterator it5 = bVar3.f3775a.iterator();
                                do {
                                    if (!it5.hasNext()) {
                                        it4.remove();
                                        break;
                                    }
                                } while (arrayList.contains((a) it5.next()));
                            }
                        }
                    }
                }
                if (!zIsEmpty) {
                    List listL = l(false);
                    if (listL != null) {
                        return listL;
                    }
                    List listL2 = l(true);
                    if (listL2 != null) {
                        return listL2;
                    }
                }
                throw i.f8833c;
            }
            try {
                arrayList.add(p(aVar, arrayList, i7));
            } catch (i e7) {
                if (arrayList.isEmpty()) {
                    throw e7;
                }
                z11 = true;
            }
        }
    }

    public final a p(t5.a aVar, ArrayList arrayList, int i7) throws i {
        int i10;
        char c10;
        char c11;
        int iF;
        int i11;
        c6.c cVar;
        int i12 = 2;
        int i13 = 0;
        int i14 = 1;
        boolean z10 = arrayList.size() % 2 == 0;
        if (this.f3785j) {
            z10 = !z10;
        }
        int iE = -1;
        boolean z11 = true;
        while (true) {
            int[] iArr = this.f2433a;
            iArr[i13] = i13;
            iArr[i14] = i13;
            iArr[i12] = i13;
            int i15 = 3;
            iArr[3] = i13;
            int i16 = aVar.f12760b;
            int i17 = iE >= 0 ? iE : arrayList.isEmpty() ? 0 : ((a) arrayList.get(arrayList.size() - i14)).f3774c.f2442b[i14];
            boolean z12 = arrayList.size() % i12 != 0;
            if (this.f3785j) {
                z12 = !z12;
            }
            boolean z13 = false;
            while (i17 < i16) {
                boolean zD = aVar.d(i17);
                boolean z14 = !zD;
                if (zD) {
                    z13 = z14;
                    break;
                }
                i17++;
                z13 = z14;
            }
            boolean z15 = z13;
            int i18 = 0;
            int i19 = i17;
            while (true) {
                if (i17 >= i16) {
                    throw i.f8833c;
                }
                if (aVar.d(i17) != z15) {
                    iArr[i18] = iArr[i18] + i14;
                } else {
                    if (i18 == i15) {
                        if (z12) {
                            int length = iArr.length;
                            int i20 = 0;
                            c10 = 3;
                            while (true) {
                                c11 = 1;
                                if (i20 >= length / 2) {
                                    break;
                                }
                                int i21 = iArr[i20];
                                int i22 = (length - i20) - 1;
                                iArr[i20] = iArr[i22];
                                iArr[i22] = i21;
                                i20++;
                            }
                        } else {
                            c10 = 3;
                            c11 = 1;
                        }
                        if (c6.a.i(iArr)) {
                            break;
                        }
                        if (z12) {
                            int length2 = iArr.length;
                            for (int i23 = 0; i23 < length2 / 2; i23++) {
                                int i24 = iArr[i23];
                                int i25 = (length2 - i23) - 1;
                                iArr[i23] = iArr[i25];
                                iArr[i25] = i24;
                            }
                        }
                        i10 = 1;
                        i19 += iArr[0] + iArr[1];
                        iArr[0] = iArr[2];
                        iArr[1] = iArr[c10];
                        iArr[2] = 0;
                        iArr[c10] = 0;
                        i18--;
                    } else {
                        i10 = 1;
                        i18++;
                    }
                    iArr[i18] = i10;
                    z15 = !z15;
                }
                i17++;
                i14 = 1;
                i15 = 3;
            }
            int[] iArr2 = this.f3784i;
            iArr2[0] = i19;
            iArr2[c11] = i17;
            if (z10) {
                int i26 = i19 - 1;
                while (i26 >= 0 && !aVar.d(i26)) {
                    i26--;
                }
                i19 = i26 + 1;
                i11 = iArr2[0] - i19;
                iF = iArr2[c11];
            } else {
                iF = aVar.f(i17 + 1);
                i11 = iF - iArr2[c11];
            }
            int i27 = iF;
            int i28 = i19;
            System.arraycopy(iArr, 0, iArr, 1, iArr.length - 1);
            iArr[0] = i11;
            c6.b bVarN = null;
            try {
                int[][] iArr3 = f3779n;
                int i29 = 0;
                while (true) {
                    if (i29 >= 6) {
                        throw i.f8833c;
                    }
                    if (h.d(iArr, iArr3[i29], 0.45f) < 0.2f) {
                        cVar = new c6.c(i29, i28, i27, i7, new int[]{i28, i27});
                        break;
                    }
                    i29++;
                }
            } catch (i unused) {
                cVar = null;
            }
            if (cVar == null) {
                int i30 = iArr2[0];
                iE = aVar.d(i30) ? aVar.e(aVar.f(i30)) : aVar.f(aVar.e(i30));
            } else {
                z11 = false;
            }
            if (!z11) {
                c6.b bVarN2 = n(aVar, cVar, z10, true);
                if (!arrayList.isEmpty() && ((a) arrayList.get(arrayList.size() - 1)).f3773b == null) {
                    throw i.f8833c;
                }
                try {
                    bVarN = n(aVar, cVar, z10, false);
                } catch (i unused2) {
                }
                return new a(bVarN2, bVarN, cVar);
            }
            i12 = 2;
            i13 = 0;
            i14 = 1;
        }
    }

    @Override // b6.h, n5.k
    public final void reset() {
        this.f3782g.clear();
        this.f3783h.clear();
    }
}
