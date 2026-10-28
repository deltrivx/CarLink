package w0;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f0 implements h9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w0 f13785b;

    public /* synthetic */ f0(w0 w0Var, int i7) {
        this.f13784a = i7;
        this.f13785b = w0Var;
    }

    @Override // h9.a
    public final Object invoke() {
        int iNextIndex;
        cc.y yVar;
        o2.w wVar;
        List list;
        x1.c cVar;
        int i7;
        o2.w wVarC;
        int[] iArr;
        p pVar;
        int i10;
        z zVar;
        int i11 = this.f13784a;
        t8.z zVar2 = t8.z.f12851a;
        int i12 = 1;
        w0 w0Var = this.f13785b;
        switch (i11) {
            case 0:
                x1.b bVar = (x1.b) w0Var.f13993p.getValue();
                return new x1.b(bVar != null ? bVar.f14521a : 9205357640488583168L);
            case 1:
                x1.b bVar2 = (x1.b) w0Var.f13994q.getValue();
                return new x1.b(bVar2 != null ? bVar2.f14521a : 9205357640488583168L);
            case 2:
                w0 w0Var2 = this.f13785b;
                w0Var2.f14001x = true;
                w0Var2.p();
                w0Var2.f13995r.setValue(null);
                w0Var2.f13996s.setValue(null);
                if (w0Var2.f13998u && w0Var2.i()) {
                    i9.x xVar = new i9.x();
                    i9.x xVar2 = new i9.x();
                    i9.w wVar2 = new i9.w();
                    d1 d1Var = w0Var2.f13979a;
                    ArrayList arrayListC = d1Var.c(w0Var2.k());
                    ListIterator listIterator = arrayListC.listIterator(arrayListC.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            z zVar3 = (z) d1Var.a().e(((p) listIterator.previous()).f13874a);
                            if (zVar3 != null && zVar3.f14018a.f14010b != zVar3.f14019b.f14010b) {
                                iNextIndex = listIterator.nextIndex();
                            }
                        } else {
                            iNextIndex = -1;
                        }
                    }
                    if (iNextIndex != -1) {
                        int size = arrayListC.size();
                        int i13 = 0;
                        while (i13 < size) {
                            p pVar2 = (p) arrayListC.get(i13);
                            z zVar4 = (z) d1Var.a().e(pVar2.f13874a);
                            if (zVar4 != null) {
                                b3.h hVarD = pVar2.d();
                                long jB = b3.g0.b(zVar4.f14018a.f14010b, zVar4.f14019b.f14010b);
                                boolean z10 = i13 >= iNextIndex;
                                long j5 = pVar2.f13874a;
                                if (z10) {
                                    xVar.f6688a = hVarD;
                                    xVar2.f6688a = new b3.q0(jB);
                                    wVar2.f6687a = j5;
                                }
                            } else {
                                i13++;
                            }
                        }
                    }
                    Object obj = xVar.f6688a;
                    if (obj != null && xVar2.f6688a != null && wVar2.f6687a != 0 && ((CharSequence) obj).length() > 0 && (yVar = w0Var2.f13999v) != null) {
                        cc.b0.s(yVar, null, new fc.i(w0Var2, xVar, xVar2, wVar2, null, 7, false), 3);
                    }
                }
                w0Var2.f13998u = false;
                return zVar2;
            case 3:
                w0Var.j();
                return zVar2;
            case 4:
                d1 d1Var2 = w0Var.f13979a;
                w0Var.f13990m.getValue();
                if (w0Var.g() != null && (wVar = w0Var.f13989l) != null && wVar.isAttached()) {
                    ArrayList arrayListC2 = d1Var2.c(w0Var.k());
                    ArrayList arrayList = new ArrayList(arrayListC2.size());
                    int size2 = arrayListC2.size();
                    for (int i14 = 0; i14 < size2; i14++) {
                        p pVar3 = (p) arrayListC2.get(i14);
                        z zVar5 = (z) d1Var2.a().e(pVar3.f13874a);
                        t8.j jVar = zVar5 != null ? new t8.j(pVar3, zVar5) : null;
                        if (jVar != null) {
                            arrayList.add(jVar);
                        }
                    }
                    int size3 = arrayList.size();
                    List listJ = arrayList;
                    listJ = arrayList;
                    if (size3 != 0 && size3 != 1) {
                        listJ = n3.l.J(u8.p.k0(arrayList), u8.p.s0(arrayList));
                    }
                    if (!listJ.isEmpty()) {
                        boolean zIsEmpty = listJ.isEmpty();
                        x1.c cVar2 = y0.f14012a;
                        if (zIsEmpty) {
                            cVar = cVar2;
                        } else {
                            int size4 = listJ.size();
                            float fMax = Float.NEGATIVE_INFINITY;
                            int i15 = 0;
                            float fMin = Float.POSITIVE_INFINITY;
                            float fMin2 = Float.POSITIVE_INFINITY;
                            float fMax2 = Float.NEGATIVE_INFINITY;
                            while (i15 < size4) {
                                t8.j jVar2 = (t8.j) list.get(i15);
                                p pVar4 = (p) jVar2.f12830a;
                                z zVar6 = (z) jVar2.f12831b;
                                int i16 = zVar6.f14018a.f14010b;
                                int i17 = zVar6.f14019b.f14010b;
                                if (i16 == i17 || (wVarC = pVar4.c()) == null) {
                                    list = listJ;
                                    list = listJ;
                                    i7 = i15;
                                } else {
                                    int iMin = Math.min(i16, i17);
                                    int iMax = Math.max(i16, i17) - i12;
                                    if (iMin == iMax) {
                                        list = listJ;
                                        iArr = new int[i12];
                                        iArr[0] = iMin;
                                    } else {
                                        list = listJ;
                                        iArr = new int[]{iMin, iMax};
                                    }
                                    int length = iArr.length;
                                    int[] iArr2 = iArr;
                                    float fMin3 = Float.POSITIVE_INFINITY;
                                    float fMax3 = Float.NEGATIVE_INFINITY;
                                    float fMax4 = Float.NEGATIVE_INFINITY;
                                    int i18 = 0;
                                    float fMin4 = Float.POSITIVE_INFINITY;
                                    while (i18 < length) {
                                        int i19 = length;
                                        int i20 = iArr2[i18];
                                        int i21 = i18;
                                        b3.o0 o0Var = (b3.o0) pVar4.f13876c.invoke();
                                        x1.c cVarB = x1.c.f14522e;
                                        if (o0Var == null) {
                                            pVar = pVar4;
                                            i10 = i15;
                                        } else {
                                            pVar = pVar4;
                                            int length2 = o0Var.f1408a.f1393a.f1353b.length();
                                            i10 = i15;
                                            if (length2 >= 1) {
                                                cVarB = o0Var.b(n3.r.m(i20, 0, length2 - 1));
                                            }
                                        }
                                        x1.c cVar3 = cVarB;
                                        fMin4 = Math.min(fMin4, cVar3.f14523a);
                                        fMin3 = Math.min(fMin3, cVar3.f14524b);
                                        fMax3 = Math.max(fMax3, cVar3.f14525c);
                                        fMax4 = Math.max(fMax4, cVar3.f14526d);
                                        i18 = i21 + 1;
                                        length = i19;
                                        pVar4 = pVar;
                                        i15 = i10;
                                    }
                                    i7 = i15;
                                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fMin4)) << 32) | (((long) Float.floatToRawIntBits(fMin3)) & 4294967295L);
                                    long jFloatToRawIntBits2 = Float.floatToRawIntBits(fMax3);
                                    long jFloatToRawIntBits3 = ((long) Float.floatToRawIntBits(fMax4)) & 4294967295L;
                                    long jN = wVar.n(wVarC, jFloatToRawIntBits);
                                    long jN2 = wVar.n(wVarC, jFloatToRawIntBits3 | (jFloatToRawIntBits2 << 32));
                                    fMin = Math.min(fMin, Float.intBitsToFloat((int) (jN >> 32)));
                                    fMin2 = Math.min(fMin2, Float.intBitsToFloat((int) (jN & 4294967295L)));
                                    fMax2 = Math.max(fMax2, Float.intBitsToFloat((int) (jN2 >> 32)));
                                    fMax = Math.max(fMax, Float.intBitsToFloat((int) (jN2 & 4294967295L)));
                                }
                                i15 = i7 + 1;
                                size4 = size4;
                                list = list;
                                i12 = 1;
                            }
                            list = listJ;
                            cVar = new x1.c(fMin, fMin2, fMax2, fMax);
                        }
                        if (!cVar.equals(cVar2)) {
                            x1.c cVarE = y0.y(wVar).e(cVar);
                            if (cVarE.f14525c - cVarE.f14523a >= 0.0f && cVarE.f14526d - cVarE.f14524b >= 0.0f) {
                                x1.c cVarI = cVarE.i(wVar.E(0L));
                                return x1.c.a(cVarI, 0.0f, 0.0f, (o0.f13869b * 4) + cVarI.f14526d, 7);
                            }
                        }
                    }
                }
                return null;
            case 5:
                w0Var.c();
                return zVar2;
            case 6:
                return Boolean.valueOf((w0Var.f14001x && w0Var.h()) ? false : true);
            default:
                d1 d1Var3 = w0Var.f13979a;
                ArrayList arrayListC3 = d1Var3.c(w0Var.k());
                if (arrayListC3.isEmpty()) {
                    return zVar2;
                }
                s.a0 a0Var = s.o.f12475a;
                s.a0 a0Var2 = new s.a0();
                int size5 = arrayListC3.size();
                int i22 = 0;
                z zVar7 = null;
                z zVar8 = null;
                while (i22 < size5) {
                    p pVar5 = (p) arrayListC3.get(i22);
                    long j10 = pVar5.f13874a;
                    b3.o0 o0Var2 = (b3.o0) pVar5.f13876c.invoke();
                    if (o0Var2 == null) {
                        zVar = null;
                    } else {
                        int length3 = o0Var2.f1408a.f1393a.f1353b.length();
                        zVar = new z(new y(o0Var2.a(0), 0, j10), new y(o0Var2.a(Math.max(length3 - 1, 0)), length3, j10), false);
                    }
                    if (zVar != null) {
                        if (zVar7 == null) {
                            zVar7 = zVar;
                        }
                        long j11 = pVar5.f13874a;
                        int iC = a0Var2.c(j11);
                        Object[] objArr = a0Var2.f12382c;
                        Object obj2 = objArr[iC];
                        a0Var2.f12381b[iC] = j11;
                        objArr[iC] = zVar;
                        zVar8 = zVar;
                    }
                    i22++;
                    arrayListC3 = arrayListC3;
                    size5 = size5;
                    zVar2 = zVar2;
                }
                t8.z zVar9 = zVar2;
                if (a0Var2.f12384e == 0) {
                    return zVar9;
                }
                if (zVar7 != zVar8) {
                    i9.l.b(zVar7);
                    y yVar2 = zVar7.f14018a;
                    i9.l.b(zVar8);
                    zVar7 = new z(yVar2, zVar8.f14019b, false);
                }
                d1Var3.k.setValue(a0Var2);
                w0Var.f13982d.invoke(zVar7);
                w0Var.f13997t = null;
                return zVar9;
        }
    }
}
