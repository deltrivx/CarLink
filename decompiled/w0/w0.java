package w0;

import java.util.ArrayList;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d1 f13979a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public g2.a f13983e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public h9.k f13984f;
    public x1.b k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public o2.w f13989l;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public p0 f13997t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f13998u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public cc.y f13999v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public t f14000w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f14001x;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f1.k1 f13980b = f1.b.s(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f1.k1 f13981c = f1.b.s(Boolean.TRUE);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public h9.k f13982d = new e0(this, 7);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l0.o0 f13985g = new l0.o0(16, false);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final w1.o f13986h = new w1.o();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final f1.k1 f13987i = f1.b.s(Boolean.FALSE);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final f1.f0 f13988j = f1.b.o(new f0(this, 4));

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final f1.k1 f13990m = new f1.k1(t8.z.f12851a, f1.w0.f5184c);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final f1.k1 f13991n = f1.b.s(new x1.b(0));

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final f1.k1 f13992o = f1.b.s(new x1.b(0));

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f1.k1 f13993p = f1.b.s(null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final f1.k1 f13994q = f1.b.s(null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final f1.k1 f13995r = f1.b.s(null);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final f1.k1 f13996s = f1.b.s(null);

    public w0(d1 d1Var) {
        this.f13979a = d1Var;
        d1Var.f13766e = new e0(this, 8);
        d1Var.f13767f = new j3.c(1, this);
        d1Var.f13768g = new u0(this);
        int i7 = 2;
        d1Var.f13769h = new f0(this, i7);
        d1Var.f13770i = new e0(this, i7);
        d1Var.f13771j = new e0(this, 3);
    }

    public static final Object a(w0 w0Var, a9.i iVar) throws Throwable {
        Object objA;
        t8.j jVarE = w0Var.e();
        t8.z zVar = t8.z.f12851a;
        if (jVarE != null) {
            b3.h hVar = (b3.h) jVarE.f12830a;
            long j5 = ((b3.q0) jVarE.f12831b).f1430a;
            t tVar = w0Var.f14000w;
            if (tVar != null) {
                if (hVar.length() == 0 || b3.q0.c(j5)) {
                    objA = zVar;
                } else {
                    objA = cc.b0.A(tVar.f13927a, new fc.i(tVar, new l0.i1(j5, hVar, tVar, null), (y8.c) null), iVar);
                }
                if (objA == z8.a.f15774a) {
                    return objA;
                }
            }
        }
        return zVar;
    }

    public final long b(o2.w wVar, long j5) {
        o2.w wVar2 = this.f13989l;
        if (wVar2 == null || !wVar2.isAttached()) {
            return 9205357640488583168L;
        }
        return k().n(wVar, j5);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00a2  */
    public final void c() {
        b3.h hVarC;
        h9.k kVar;
        int iNextIndex;
        if (g() != null) {
            d1 d1Var = this.f13979a;
            if (d1Var.a().f12384e == 0) {
                hVarC = null;
            } else {
                b3.e eVar = new b3.e();
                ArrayList arrayListC = d1Var.c(k());
                ListIterator listIterator = arrayListC.listIterator(arrayListC.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        iNextIndex = -1;
                        break;
                    }
                    z zVar = (z) d1Var.a().e(((p) listIterator.previous()).f13874a);
                    if (zVar != null && zVar.f14018a.f14010b != zVar.f14019b.f14010b) {
                        iNextIndex = listIterator.nextIndex();
                        break;
                    }
                }
                if (iNextIndex != -1) {
                    int size = arrayListC.size();
                    int i7 = 0;
                    while (i7 < size) {
                        p pVar = (p) arrayListC.get(i7);
                        z zVar2 = (z) d1Var.a().e(pVar.f13874a);
                        if (zVar2 != null) {
                            b3.h hVarD = pVar.d();
                            long jB = b3.g0.b(zVar2.f14018a.f14010b, zVar2.f14019b.f14010b);
                            boolean z10 = i7 >= iNextIndex;
                            eVar.b(hVarD, b3.q0.f(jB), b3.q0.e(jB));
                            if (!z10) {
                                eVar.f1320a.append('\n');
                            }
                        }
                        i7++;
                    }
                }
                hVarC = eVar.c();
            }
        } else {
            hVarC = null;
        }
        if (hVarC != null) {
            b3.h hVar = hVarC.f1353b.length() > 0 ? hVarC : null;
            if (hVar == null || (kVar = this.f13984f) == null) {
                return;
            }
            kVar.invoke(hVar);
        }
    }

    public final p d(y yVar) {
        return (p) this.f13979a.f13764c.e(yVar.f14011c);
    }

    public final t8.j e() {
        int iNextIndex;
        int iF;
        int length;
        if (g() == null) {
            return null;
        }
        d1 d1Var = this.f13979a;
        if (d1Var.f13763b.isEmpty()) {
            return null;
        }
        b3.e eVar = new b3.e();
        ArrayList arrayListC = d1Var.c(k());
        ListIterator listIterator = arrayListC.listIterator(arrayListC.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                iNextIndex = -1;
                break;
            }
            z zVar = (z) d1Var.a().e(((p) listIterator.previous()).f13874a);
            if (zVar != null && zVar.f14018a.f14010b != zVar.f14019b.f14010b) {
                iNextIndex = listIterator.nextIndex();
                break;
            }
        }
        if (iNextIndex != -1) {
            int size = arrayListC.size();
            int i7 = 0;
            int i10 = 0;
            iF = -1;
            length = -1;
            while (i10 < size) {
                p pVar = (p) arrayListC.get(i10);
                z zVar2 = (z) d1Var.a().e(pVar.f13874a);
                if (zVar2 != null) {
                    b3.h hVarD = pVar.d();
                    long jB = b3.g0.b(zVar2.f14018a.f14010b, zVar2.f14019b.f14010b);
                    boolean z10 = i10 >= iNextIndex;
                    if (iF == -1) {
                        iF = b3.q0.f(jB);
                        eVar.b(hVarD, i7, b3.q0.f(jB));
                    }
                    eVar.b(hVarD, b3.q0.f(jB), b3.q0.e(jB));
                    StringBuilder sb2 = eVar.f1320a;
                    if (z10) {
                        length = sb2.length();
                        eVar.b(hVarD, b3.q0.e(jB), hVarD.f1353b.length());
                    } else {
                        sb2.append('\n');
                    }
                }
                i10++;
                i7 = 0;
            }
        } else {
            iF = -1;
            length = -1;
        }
        b3.h hVarC = eVar.c();
        if (iF == -1 || length == -1) {
            return null;
        }
        return new t8.j(hVarC, new b3.q0(b3.g0.b(iF, length)));
    }

    public final l0.h0 f() {
        return (l0.h0) this.f13995r.getValue();
    }

    public final z g() {
        return (z) this.f13980b.getValue();
    }

    public final boolean h() {
        return ((Boolean) this.f13981c.getValue()).booleanValue();
    }

    public final boolean i() {
        z zVarG = g();
        if (zVarG != null) {
            y yVar = zVarG.f14019b;
            y yVar2 = zVarG.f14018a;
            if (!i9.l.a(yVar2, yVar)) {
                if (yVar2.f14011c == yVar.f14011c) {
                    return true;
                }
                o2.w wVarK = k();
                d1 d1Var = this.f13979a;
                ArrayList arrayListC = d1Var.c(wVarK);
                int size = arrayListC.size();
                for (int i7 = 0; i7 < size; i7++) {
                    z zVar = (z) d1Var.a().e(((p) arrayListC.get(i7)).f13874a);
                    if (zVar != null && zVar.f14018a.f14010b != zVar.f14019b.f14010b) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void j() {
        g2.a aVar;
        s.a0 a0Var = s.o.f12475a;
        i9.l.c(a0Var, "null cannot be cast to non-null type androidx.collection.LongObjectMap<V of androidx.collection.LongObjectMapKt.emptyLongObjectMap>");
        this.f13979a.k.setValue(a0Var);
        this.f14001x = false;
        p();
        if (g() != null) {
            this.f13982d.invoke(null);
            if (!h() || (aVar = this.f13983e) == null) {
                return;
            }
            aVar.a(9);
        }
    }

    public final o2.w k() {
        o2.w wVar = this.f13989l;
        if (wVar == null) {
            c0.b.b("null coordinates");
            throw new cc.s();
        }
        if (!wVar.isAttached()) {
            c0.b.a("unattached coordinates");
        }
        return wVar;
    }

    public final void l(boolean z10) {
        f1.k1 k1Var = this.f13981c;
        if (((Boolean) k1Var.getValue()).booleanValue() != z10) {
            k1Var.setValue(Boolean.valueOf(z10));
            p();
        }
    }

    public final void m(z zVar) {
        this.f13980b.setValue(zVar);
        if (zVar != null) {
            n();
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0083  */
    /* JADX WARN: Code duplicated, block: B:44:0x008f  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a6  */
    public final void n() {
        long j5;
        x1.b bVar;
        long jA;
        x1.b bVar2;
        y yVar;
        y yVar2;
        z zVarG = g();
        o2.w wVar = this.f13989l;
        x1.b bVar3 = null;
        p pVarD = (zVarG == null || (yVar2 = zVarG.f14018a) == null) ? null : d(yVar2);
        p pVarD2 = (zVarG == null || (yVar = zVarG.f14019b) == null) ? null : d(yVar);
        o2.w wVarC = pVarD != null ? pVarD.c() : null;
        o2.w wVarC2 = pVarD2 != null ? pVarD2.c() : null;
        f1.k1 k1Var = this.f13994q;
        f1.k1 k1Var2 = this.f13993p;
        if (zVarG == null || wVar == null || !wVar.isAttached() || (wVarC == null && wVarC2 == null)) {
            k1Var2.setValue(null);
            k1Var.setValue(null);
            return;
        }
        x1.c cVarY = y0.y(wVar);
        if (wVarC != null) {
            j5 = 9205357640488583168L;
            long jA2 = pVarD.a(zVarG, true);
            if ((jA2 & 9223372034707292159L) != 9205357640488583168L) {
                long jN = wVar.n(wVarC, jA2);
                bVar = new x1.b(jN);
                if (f() != l0.h0.f7652b && !y0.p(cVarY, jN)) {
                }
            }
            k1Var2.setValue(bVar);
            if (wVarC2 != null) {
                jA = pVarD2.a(zVarG, false);
                if ((jA & 9223372034707292159L) != j5) {
                    long jN2 = wVar.n(wVarC2, jA);
                    bVar2 = new x1.b(jN2);
                    if (f() != l0.h0.f7653c || y0.p(cVarY, jN2)) {
                        bVar3 = bVar2;
                    }
                }
            }
            k1Var.setValue(bVar3);
        }
        j5 = 9205357640488583168L;
        bVar = null;
        k1Var2.setValue(bVar);
        if (wVarC2 != null) {
            jA = pVarD2.a(zVarG, false);
            if ((jA & 9223372034707292159L) != j5) {
                long jN3 = wVar.n(wVarC2, jA);
                bVar2 = new x1.b(jN3);
                if (f() != l0.h0.f7653c) {
                    bVar3 = bVar2;
                } else {
                    bVar3 = bVar2;
                }
            }
        }
        k1Var.setValue(bVar3);
    }

    /* JADX WARN: Not found block with instruction: 0x00da: MOVE (r4v1 ?? I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) A[DONT_GENERATE, REMOVE] */
    public final boolean o(long j5, long j10, boolean z10, a0 a0Var) {
        ArrayList arrayList;
        p0 h1Var;
        b3.o0 o0Var;
        long j11;
        ArrayList arrayList2;
        int i7;
        q0 q0Var;
        long j12;
        l lVarN;
        l lVar;
        l lVar2;
        l lVar3;
        l lVar4;
        l lVar5;
        l lVar6;
        q0 q0Var2;
        int i10;
        int iS;
        y yVar;
        y yVar2;
        this.f13995r.setValue(z10 ? l0.h0.f7652b : l0.h0.f7653c);
        this.f13996s.setValue(new x1.b(j5));
        o2.w wVarK = k();
        d1 d1Var = this.f13979a;
        ArrayList arrayListC = d1Var.c(wVarK);
        int i11 = s.n.f12473a;
        s.y yVar3 = new s.y(6);
        int size = arrayListC.size();
        for (int i12 = 0; i12 < size; i12++) {
            yVar3.e(i12, ((p) arrayListC.get(i12)).f13874a);
        }
        long j13 = 9223372034707292159L;
        q0 q0Var3 = new q0(j5, j10, wVarK, z10, (j10 & 9223372034707292159L) == 9205357640488583168L ? null : g(), new nb.u(1, yVar3));
        int size2 = arrayListC.size();
        int i13 = 0;
        while (true) {
            arrayList = q0Var3.f13890h;
            if (i13 >= size2) {
                break;
            }
            p pVar = (p) arrayListC.get(i13);
            o2.w wVarC = pVar.c();
            if (wVarC == null || (o0Var = (b3.o0) pVar.f13876c.invoke()) == null) {
                i7 = size2;
                arrayList2 = arrayListC;
                j11 = j13;
                q0Var2 = q0Var3;
            } else {
                j11 = j13;
                long jN = q0Var3.f13885c.n(wVarC, 0L);
                long jG = x1.b.g(q0Var3.f13883a, jN);
                arrayList2 = arrayListC;
                long j14 = q0Var3.f13884b;
                long jG2 = (j14 & j11) == 9205357640488583168L ? 9205357640488583168L : x1.b.g(j14, jN);
                long j15 = pVar.f13874a;
                long j16 = o0Var.f1410c;
                float f10 = (int) (j16 >> 32);
                float f11 = (int) (j16 & 4294967295L);
                i7 = size2;
                int i14 = (int) (jG >> 32);
                float fIntBitsToFloat = Float.intBitsToFloat(i14);
                l lVar7 = l.f13838c;
                l lVar8 = l.f13836a;
                l lVar9 = l.f13837b;
                if (fIntBitsToFloat >= 0.0f) {
                    lVar8 = Float.intBitsToFloat(i14) > f10 ? lVar7 : lVar9;
                }
                int i15 = (int) (jG & 4294967295L);
                l lVar10 = Float.intBitsToFloat(i15) < 0.0f ? lVar8 : Float.intBitsToFloat(i15) > f11 ? lVar7 : lVar9;
                boolean z11 = q0Var3.f13886d;
                z zVar = q0Var3.f13887e;
                if (z11) {
                    q0Var = q0Var3;
                    j12 = j15;
                    lVarN = y0.n(lVar8, lVar10, q0Var, j12, zVar != null ? zVar.f14019b : null);
                    lVar = lVar8;
                    lVar3 = lVar;
                    lVar6 = lVar10;
                    lVar2 = lVar6;
                    lVar4 = lVarN;
                    lVar5 = lVar4;
                } else {
                    q0Var = q0Var3;
                    j12 = j15;
                    lVarN = y0.n(lVar8, lVar10, q0Var, j12, zVar != null ? zVar.f14018a : null);
                    lVar = lVar8;
                    lVar2 = lVar10;
                    lVar3 = lVarN;
                    lVar4 = lVar2;
                    lVar5 = lVar;
                    lVar6 = lVar3;
                }
                q0Var2 = q0Var;
                l lVarX = y0.x(lVar, lVar2);
                if (lVarX == lVar9 || lVarX != lVarN) {
                    int length = o0Var.f1408a.f1393a.f1353b.length();
                    nb.u uVar = q0Var2.f13888f;
                    if (z11) {
                        iS = y0.s(jG, o0Var);
                        if (zVar == null || (yVar2 = zVar.f14019b) == null) {
                            length = iS;
                        } else {
                            int iCompare = uVar.compare(Long.valueOf(yVar2.f14011c), Long.valueOf(j12));
                            if (iCompare < 0) {
                                length = 0;
                            } else if (iCompare <= 0) {
                                length = yVar2.f14010b;
                            }
                        }
                        i10 = length;
                    } else {
                        int iS2 = y0.s(jG, o0Var);
                        if (zVar == null || (yVar = zVar.f14018a) == null) {
                            length = iS2;
                        } else {
                            int iCompare2 = uVar.compare(Long.valueOf(yVar.f14011c), Long.valueOf(j12));
                            if (iCompare2 < 0) {
                                length = 0;
                            } else if (iCompare2 <= 0) {
                                length = yVar.f14010b;
                            }
                        }
                        i10 = iS2;
                        iS = length;
                    }
                    int iS3 = (jG2 & j11) == 9205357640488583168L ? -1 : y0.s(jG2, o0Var);
                    int i16 = q0Var2.k + 2;
                    q0Var2.k = i16;
                    long j17 = j12;
                    w wVar = new w(j17, i16, iS, i10, iS3, o0Var);
                    q0Var2.f13891i = q0Var2.a(q0Var2.f13891i, lVar3, lVar6);
                    q0Var2.f13892j = q0Var2.a(q0Var2.f13892j, lVar5, lVar4);
                    q0Var2.f13889g.e(r7.size(), j17);
                    arrayList.add(wVar);
                }
            }
            i13++;
            size2 = i7;
            q0Var3 = q0Var2;
            j13 = j11;
            arrayListC = arrayList2;
        }
        q0 q0Var4 = q0Var3;
        int i17 = q0Var4.k + 1;
        int size3 = arrayList.size();
        if (size3 == 0) {
            h1Var = null;
        } else if (size3 != 1) {
            int i18 = q0Var4.f13891i;
            int i19 = i18 == -1 ? i17 : i18;
            int i20 = q0Var4.f13892j;
            h1Var = new o(q0Var4.f13889g, arrayList, i19, i20 == -1 ? i17 : i20, q0Var4.f13886d, q0Var4.f13887e);
        } else {
            w wVar2 = (w) u8.p.A0(arrayList);
            int i21 = q0Var4.f13891i;
            int i22 = i21 == -1 ? i17 : i21;
            int i23 = q0Var4.f13892j;
            h1Var = new h1(q0Var4.f13886d, i22, i23 == -1 ? i17 : i23, q0Var4.f13887e, wVar2);
        }
        if (h1Var == null || !h1Var.m(this.f13997t)) {
            return false;
        }
        z zVarA = a0Var.a(h1Var);
        if (!i9.l.a(zVarA, g())) {
            if (h()) {
                ArrayList arrayList3 = d1Var.f13763b;
                int size4 = arrayList3.size();
                for (int i24 = 0; i24 < size4; i24++) {
                    if (((p) arrayList3.get(i24)).d().f1353b.length() > 0) {
                        g2.a aVar = this.f13983e;
                        if (aVar == null) {
                            break;
                        }
                        aVar.a(9);
                        break;
                    }
                }
            }
            d1Var.k.setValue(h1Var.e(zVarA));
            this.f13982d.invoke(zVarA);
            this.f13998u = false;
        }
        this.f13997t = h1Var;
        return true;
    }

    public final void p() {
        cc.o1 o1Var;
        if (((Boolean) this.f13987i.getValue()).booleanValue()) {
            boolean z10 = this.f14001x;
            l0.o0 o0Var = this.f13985g;
            if (z10 && h()) {
                if (((x1.c) this.f13988j.getValue()) == null) {
                    return;
                }
                o0Var.b0();
            } else {
                r0.f fVar = (r0.f) o0Var.f7772b;
                if (fVar == null || (o1Var = fVar.f11086u) == null) {
                    return;
                }
                o1Var.a(null);
                fVar.f11086u = null;
            }
        }
    }
}
