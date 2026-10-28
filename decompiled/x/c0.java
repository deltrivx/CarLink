package x;

import q2.d2;
import q2.y1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends q2.m implements y1, q2.p, q2.k, q2.l1, d2 {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final a1 f14330w = new a1();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public b0.k f14331q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final h9.k f14332r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public b0.d f14333s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public h0.d0 f14334t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public q2.h1 f14335u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final w1.s f14336v;

    public c0(b0.k kVar, int i7, cc.d1 d1Var) {
        this.f14331q = kVar;
        this.f14332r = d1Var;
        w1.s sVar = new w1.s(i7, new ob.t(2, this, c0.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0, 0, 3), 4);
        A0(sVar);
        this.f14336v = sVar;
    }

    @Override // q2.y1
    public final /* synthetic */ boolean B() {
        return false;
    }

    public final void D0(b0.k kVar, b0.j jVar) {
        if (!this.f11129n) {
            kVar.b(jVar);
            return;
        }
        cc.a1 a1Var = (cc.a1) ((hc.c) m0()).f6504a.l(cc.v.f2678b);
        cc.b0.s(m0(), null, new b1.f(kVar, jVar, (Object) (a1Var != null ? a1Var.t(new c8.p(25, kVar, jVar)) : null), (y8.c) null, 14), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [r1.o] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13, types: [r1.o] */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [h1.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [h1.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v6 */
    public final d0 E0() {
        d2 d2Var;
        q2.d1 d1Var;
        if (this.f11129n) {
            if (!this.f11117a.f11129n) {
                n2.a.b("visitAncestors called on an unattached node");
            }
            r1.o oVar = this.f11117a.f11121e;
            q2.h0 h0VarV = q2.f.v(this);
            loop0: while (true) {
                if (h0VarV == null) {
                    d2Var = null;
                    break;
                }
                if ((h0VarV.E.f10617f.f11120d & 262144) != 0) {
                    while (oVar != null) {
                        if ((oVar.f11119c & 262144) != 0) {
                            ?? F = oVar;
                            ?? eVar = 0;
                            while (F != 0) {
                                if (F instanceof d2) {
                                    d2Var = (d2) F;
                                    if (d0.f14342p.equals(d2Var.k())) {
                                        break loop0;
                                    }
                                } else if ((F.f11119c & 262144) != 0 && (F instanceof q2.m)) {
                                    r1.o oVar2 = ((q2.m) F).f10746p;
                                    int i7 = 0;
                                    F = F;
                                    eVar = eVar;
                                    while (oVar2 != null) {
                                        if ((oVar2.f11119c & 262144) != 0) {
                                            i7++;
                                            if (i7 == 1) {
                                                eVar = eVar;
                                                F = oVar2;
                                            } else {
                                                if (eVar == 0) {
                                                    eVar = new h1.e(new r1.o[16]);
                                                }
                                                if (F != 0) {
                                                    eVar.b(F);
                                                    F = 0;
                                                }
                                                eVar.b(oVar2);
                                            }
                                        }
                                        oVar2 = oVar2.f11122f;
                                        F = F;
                                        eVar = eVar;
                                    }
                                    if (i7 == 1) {
                                    }
                                }
                                F = q2.f.f(eVar);
                            }
                        }
                        oVar = oVar.f11121e;
                    }
                }
                h0VarV = h0VarV.v();
                oVar = (h0VarV == null || (d1Var = h0VarV.E) == null) ? null : d1Var.f10616e;
            }
            if (d2Var instanceof d0) {
                return (d0) d2Var;
            }
        }
        return null;
    }

    public final void F0(b0.k kVar) {
        b0.d dVar;
        if (i9.l.a(this.f14331q, kVar)) {
            return;
        }
        b0.k kVar2 = this.f14331q;
        if (kVar2 != null && (dVar = this.f14333s) != null) {
            kVar2.b(new b0.e(dVar));
        }
        this.f14333s = null;
        this.f14331q = kVar;
    }

    @Override // q2.p
    public final void U(q2.h1 h1Var) {
        d0 d0VarE0;
        this.f14335u = h1Var;
        if (this.f14336v.C0().b()) {
            if (!h1Var.G0().f11129n) {
                d0 d0VarE1 = E0();
                if (d0VarE1 != null) {
                    d0VarE1.A0(null);
                    return;
                }
                return;
            }
            q2.h1 h1Var2 = this.f14335u;
            if (h1Var2 == null || !h1Var2.G0().f11129n || (d0VarE0 = E0()) == null) {
                return;
            }
            d0VarE0.A0(this.f14335u);
        }
    }

    @Override // q2.l1
    public final void X() {
        i9.x xVar = new i9.x();
        q2.f.r(this, new a8.f1(24, xVar, this));
        h0.d0 d0Var = (h0.d0) xVar.f6688a;
        if (this.f14336v.C0().b()) {
            h0.d0 d0Var2 = this.f14334t;
            if (d0Var2 != null) {
                d0Var2.b();
            }
            if (d0Var != null) {
                d0Var.a();
            } else {
                d0Var = null;
            }
            this.f14334t = d0Var;
        }
    }

    @Override // q2.y1
    public final void Y(y2.j jVar) {
        boolean zB = this.f14336v.C0().b();
        o9.u[] uVarArr = y2.t.f15077a;
        y2.u uVar = y2.r.k;
        o9.u uVar2 = y2.t.f15077a[4];
        uVar.a(jVar, Boolean.valueOf(zB));
        jVar.n(y2.i.f15006v, new y2.a(null, new c.k0(0, this, c0.class, "requestFocus", "requestFocus()Z", 0, 0, 5)));
    }

    @Override // q2.y1
    public final /* synthetic */ boolean h() {
        return true;
    }

    @Override // q2.y1
    public final /* synthetic */ boolean j0() {
        return false;
    }

    @Override // q2.d2
    public final Object k() {
        return f14330w;
    }

    @Override // r1.o
    public final boolean n0() {
        return false;
    }

    @Override // r1.o
    public final void u0() {
        h0.d0 d0Var = this.f14334t;
        if (d0Var != null) {
            d0Var.b();
        }
        this.f14334t = null;
    }
}
