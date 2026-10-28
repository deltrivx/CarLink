package l0;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class w implements o2.m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u0 f7881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h9.k f7882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g3.w f7883c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g3.q f7884d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n3.c f7885e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f7886f;

    public w(u0 u0Var, h9.k kVar, g3.w wVar, g3.q qVar, n3.c cVar, int i7) {
        this.f7881a = u0Var;
        this.f7882b = kVar;
        this.f7883c = wVar;
        this.f7884d = qVar;
        this.f7885e = cVar;
        this.f7886f = i7;
    }

    @Override // o2.m0
    public final /* synthetic */ int a(o2.r rVar, List list, int i7) {
        return a2.f.i(this, rVar, list, i7);
    }

    /* JADX WARN: Code duplicated, block: B:75:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:77:0x01be  */
    /* JADX WARN: Code duplicated, block: B:78:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:80:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:83:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:84:0x01f5  */
    @Override // o2.m0
    public final o2.n0 c(o2.o0 o0Var, List list, long j5) {
        u0 u0Var;
        b3.o0 o0Var2;
        b3.o0 o0Var3;
        b3.o0 o0Var4;
        w wVar;
        u0 u0Var2;
        int i7;
        int iK;
        o2.w wVar2;
        u0 u0Var3 = this.f7881a;
        p1.f fVarH = n4.e.h();
        h9.k kVarE = fVarH != null ? fVarH.e() : null;
        p1.f fVarK = n4.e.k(fVarH);
        try {
            s1 s1VarD = u0Var3.d();
            n4.e.r(fVarH, fVarK, kVarE);
            b3.o0 o0Var5 = s1VarD != null ? s1VarD.f7828a : null;
            a1 a1Var = u0Var3.f7848a;
            n3.o layoutDirection = o0Var.getLayoutDirection();
            int i10 = a1Var.f7596f;
            boolean z10 = a1Var.f7595e;
            int i11 = a1Var.f7593c;
            if (o0Var5 != null) {
                b3.p pVar = o0Var5.f1409b;
                b3.n0 n0Var = o0Var5.f1408a;
                b3.h hVar = a1Var.f7591a;
                b3.r0 r0Var = a1Var.f7592b;
                List list2 = a1Var.f7599i;
                n3.c cVar = a1Var.f7597g;
                f3.d dVar = a1Var.f7598h;
                o0Var3 = o0Var5;
                if (!pVar.f1414a.a()) {
                    b3.h hVar2 = n0Var.f1393a;
                    u0Var = u0Var3;
                    long j10 = n0Var.f1402j;
                    if (i9.l.a(hVar2, hVar) && n0Var.f1394b.c(r0Var) && i9.l.a(n0Var.f1395c, list2) && n0Var.f1396d == i11 && n0Var.f1397e == z10 && n0Var.f1398f == i10 && i9.l.a(n0Var.f1399g, cVar) && n0Var.f1400h == layoutDirection && i9.l.a(n0Var.f1401i, dVar) && n3.a.j(j5) == n3.a.j(j10) && ((!z10 && i10 != 2) || (n3.a.h(j5) == n3.a.h(j10) && n3.a.g(j5) == n3.a.g(j10)))) {
                        o0Var4 = new b3.o0(new b3.n0(n0Var.f1393a, a1Var.f7592b, n0Var.f1395c, n0Var.f1396d, n0Var.f1397e, n0Var.f1398f, n0Var.f1399g, n0Var.f1400h, n0Var.f1401i, j5), pVar, n3.b.d(j5, (((long) q0.k(pVar.f1418e)) & 4294967295L) | (((long) q0.k(pVar.f1417d)) << 32)));
                    }
                    long j11 = o0Var4.f1410c;
                    Integer numValueOf = Integer.valueOf((int) (j11 >> 32));
                    Integer numValueOf2 = Integer.valueOf((int) (j11 & 4294967295L));
                    int iIntValue = numValueOf.intValue();
                    int iIntValue2 = numValueOf2.intValue();
                    if (i9.l.a(o0Var3, o0Var4)) {
                        wVar = this;
                        u0Var2 = u0Var;
                        i7 = 0;
                    } else {
                        if (s1VarD != 0) {
                            wVar2 = s1VarD.f7830c;
                        } else {
                            wVar2 = null;
                        }
                        u0Var2 = u0Var;
                        u0Var2.f7856i.setValue(new s1(o0Var4, wVar2));
                        i7 = 0;
                        u0Var2.f7862p = false;
                        wVar = this;
                        wVar.f7882b.invoke(o0Var4);
                        q0.u(u0Var2, wVar.f7883c, wVar.f7884d);
                    }
                    if (wVar.f7886f == 1) {
                        iK = q0.k(o0Var4.f1409b.b(i7));
                    } else {
                        iK = 0;
                    }
                    u0Var2.f7854g.setValue(new n3.f(wVar.f7885e.J(iK)));
                    return o0Var.i(iIntValue, iIntValue2, u8.b0.W0(new t8.j(o2.c.f9302a, Integer.valueOf(Math.round(o0Var4.f1411d))), new t8.j(o2.c.f9303b, Integer.valueOf(Math.round(o0Var4.f1412e)))), new u7.d(27));
                }
                u0Var = u0Var3;
                o0Var2 = o0Var3;
            } else {
                j5 = j5;
                u0Var = u0Var3;
                o0Var2 = o0Var5;
            }
            a1Var.a(layoutDirection);
            int iJ = n3.a.j(j5);
            int iH = ((z10 || i10 == 2) && n3.a.d(j5)) ? n3.a.h(j5) : Integer.MAX_VALUE;
            int i12 = (z10 || i10 != 2) ? i11 : 1;
            if (iJ != iH) {
                b3.r rVar = a1Var.f7600j;
                if (rVar == null) {
                    throw new IllegalStateException("layoutIntrinsics must be called first");
                }
                iH = n3.r.m(q0.k(rVar.d()), iJ, iH);
            }
            b3.r rVar2 = a1Var.f7600j;
            if (rVar2 == null) {
                throw new IllegalStateException("layoutIntrinsics must be called first");
            }
            b3.p pVar2 = new b3.p(rVar2, g5.a.D(0, iH, 0, n3.a.g(j5)), i12, a1Var.f7596f);
            o0Var3 = o0Var2;
            o0Var4 = new b3.o0(new b3.n0(a1Var.f7591a, a1Var.f7592b, a1Var.f7599i, a1Var.f7593c, a1Var.f7595e, a1Var.f7596f, a1Var.f7597g, layoutDirection, a1Var.f7598h, j5), pVar2, n3.b.d(j5, (((long) q0.k(pVar2.f1417d)) << 32) | (((long) q0.k(pVar2.f1418e)) & 4294967295L)));
            long j12 = o0Var4.f1410c;
            Integer numValueOf3 = Integer.valueOf((int) (j12 >> 32));
            Integer numValueOf4 = Integer.valueOf((int) (j12 & 4294967295L));
            int iIntValue3 = numValueOf3.intValue();
            int iIntValue4 = numValueOf4.intValue();
            if (i9.l.a(o0Var3, o0Var4)) {
                if (s1VarD != 0) {
                    wVar2 = s1VarD.f7830c;
                } else {
                    wVar2 = null;
                }
                u0Var2 = u0Var;
                u0Var2.f7856i.setValue(new s1(o0Var4, wVar2));
                i7 = 0;
                u0Var2.f7862p = false;
                wVar = this;
                wVar.f7882b.invoke(o0Var4);
                q0.u(u0Var2, wVar.f7883c, wVar.f7884d);
            } else {
                wVar = this;
                u0Var2 = u0Var;
                i7 = 0;
            }
            if (wVar.f7886f == 1) {
                iK = q0.k(o0Var4.f1409b.b(i7));
            } else {
                iK = 0;
            }
            u0Var2.f7854g.setValue(new n3.f(wVar.f7885e.J(iK)));
            return o0Var.i(iIntValue3, iIntValue4, u8.b0.W0(new t8.j(o2.c.f9302a, Integer.valueOf(Math.round(o0Var4.f1411d))), new t8.j(o2.c.f9303b, Integer.valueOf(Math.round(o0Var4.f1412e)))), new u7.d(27));
        } catch (Throwable th) {
            n4.e.r(fVarH, fVarK, kVarE);
            throw th;
        }
    }

    @Override // o2.m0
    public final int f(o2.r rVar, List list, int i7) {
        u0 u0Var = this.f7881a;
        u0Var.f7848a.a(rVar.getLayoutDirection());
        b3.r rVar2 = u0Var.f7848a.f7600j;
        if (rVar2 != null) {
            return q0.k(rVar2.d());
        }
        throw new IllegalStateException("layoutIntrinsics must be called first");
    }

    @Override // o2.m0
    public final /* synthetic */ int h(o2.r rVar, List list, int i7) {
        return a2.f.b(this, rVar, list, i7);
    }

    @Override // o2.m0
    public final /* synthetic */ int j(o2.r rVar, List list, int i7) {
        return a2.f.g(this, rVar, list, i7);
    }
}
