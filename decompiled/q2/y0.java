package q2;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class y0 extends o2.v0 implements o2.l0, a, a1 {
    public float D;
    public boolean E;
    public h9.k F;
    public float H;
    public boolean J;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l0 f10849f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f10850g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f10853j;
    public boolean k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public h9.k f10856n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f10857o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Object f10859q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f10860r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f10861s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f10862t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f10863u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f10864v;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f10868z;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f10851h = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f10852i = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public f0 f10854l = f0.f10640c;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f10855m = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f10858p = true;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final i0 f10865w = new i0(this, 0);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final h1.e f10866x = new h1.e(new y0[16]);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f10867y = true;
    public long A = n3.b.b(0, 0, 15);
    public final x0 B = new x0(this, 1);
    public final x0 C = new x0(this, 0);
    public long G = 0;
    public final x0 I = new x0(this, 2);

    public y0(l0 l0Var) {
        this.f10849f = l0Var;
    }

    @Override // q2.a
    public final void A() throws Throwable {
        boolean zN0;
        this.f10868z = true;
        i0 i0Var = this.f10865w;
        i0Var.h();
        boolean z10 = this.f10863u;
        l0 l0Var = this.f10849f;
        if (z10) {
            h1.e eVarZ = l0Var.f10729a.z();
            Object[] objArr = eVarZ.f6421a;
            int i7 = eVarZ.f6423c;
            for (int i10 = 0; i10 < i7; i10++) {
                h0 h0Var = (h0) objArr[i10];
                boolean zR = h0Var.r();
                l0 l0Var2 = h0Var.F;
                if (zR && h0Var.s() == f0.f10638a) {
                    y0 y0Var = l0Var2.f10743p;
                    n3.a aVar = y0Var.f10853j ? new n3.a(y0Var.f9438d) : null;
                    if (aVar != null) {
                        if (h0Var.B == f0.f10640c) {
                            h0Var.e();
                        }
                        zN0 = l0Var2.f10743p.n0(aVar.f8730a);
                    } else {
                        zN0 = false;
                    }
                    if (zN0) {
                        h0.V(l0Var.f10729a, false, 7);
                    }
                }
            }
        }
        if (this.f10864v || (!f().k && this.f10863u)) {
            this.f10863u = false;
            d0 d0Var = l0Var.f10732d;
            l0Var.f10732d = d0.f10608c;
            l0Var.g(false);
            h0 h0Var2 = l0Var.f10729a;
            s1 snapshotObserver = ((r2.u) k0.a(h0Var2)).getSnapshotObserver();
            snapshotObserver.a(h0Var2, snapshotObserver.f10798e, this.C);
            l0Var.f10732d = d0Var;
            if (f().k && l0Var.f10738j) {
                requestLayout();
            }
            this.f10864v = false;
        }
        if (i0Var.f10711b && i0Var.e()) {
            i0Var.g();
        }
        this.f10868z = false;
    }

    @Override // q2.a
    public final boolean B() {
        return this.f10860r;
    }

    @Override // q2.a
    public final void D(b2.a aVar) {
        h1.e eVarZ = this.f10849f.f10729a.z();
        Object[] objArr = eVarZ.f6421a;
        int i7 = eVarZ.f6423c;
        for (int i10 = 0; i10 < i7; i10++) {
            aVar.invoke(((h0) objArr[i10]).F.f10743p);
        }
    }

    @Override // q2.a
    public final void G() {
        h0.V(this.f10849f.f10729a, false, 7);
    }

    @Override // o2.l0
    public final int H(int i7) {
        l0 l0Var = this.f10849f;
        if (!f.q(l0Var.f10729a)) {
            j0();
            return l0Var.a().H(i7);
        }
        u0 u0Var = l0Var.f10744q;
        i9.l.b(u0Var);
        return u0Var.H(i7);
    }

    @Override // o2.v0
    public final int I() {
        return this.f10849f.a().I();
    }

    @Override // o2.v0
    public final int K() {
        return this.f10849f.a().K();
    }

    @Override // o2.v0
    public final void T(long j5, float f10, h9.k kVar) throws Throwable {
        boolean z10;
        o2.u0 placementScope;
        l0 l0Var = this.f10849f;
        h0 h0Var = l0Var.f10729a;
        h0 h0Var2 = l0Var.f10729a;
        boolean z11 = true;
        try {
            this.f10861s = true;
            if (!n3.j.a(j5, this.f10855m) || this.J) {
                if (l0Var.k || l0Var.f10738j || this.J) {
                    this.f10863u = true;
                    this.J = false;
                }
                g0();
            }
            u0 u0Var = l0Var.f10744q;
            if (u0Var != null) {
                l0 l0Var2 = u0Var.f10810f;
                if (f.q(l0Var2.f10729a)) {
                    z10 = true;
                } else {
                    if (u0Var.f10819p == r0.f10790c && !l0Var2.f10730b) {
                        l0Var2.f10731c = true;
                    }
                    z10 = l0Var2.f10731c;
                }
                if (z10) {
                    h1 h1Var = l0Var.a().f10694q;
                    if (h1Var == null || (placementScope = h1Var.f10773l) == null) {
                        placementScope = ((r2.u) k0.a(h0Var2)).getPlacementScope();
                    }
                    u0 u0Var2 = l0Var.f10744q;
                    i9.l.b(u0Var2);
                    h0 h0VarV = h0Var2.v();
                    if (h0VarV != null) {
                        h0VarV.F.f10736h = 0;
                    }
                    u0Var2.f10813i = Integer.MAX_VALUE;
                    o2.u0.f(placementScope, u0Var2, (int) (j5 >> 32), (int) (4294967295L & j5));
                }
            }
            u0 u0Var3 = l0Var.f10744q;
            if (u0Var3 == null || u0Var3.k) {
                z11 = false;
            }
            if (z11) {
                n2.a.b("Error: Placement happened before lookahead.");
            }
            m0(j5, f10, kVar);
        } catch (Throwable th) {
            h0Var.Y(th);
            throw null;
        }
    }

    public final List Y() {
        l0 l0Var = this.f10849f;
        l0Var.f10729a.f0();
        boolean z10 = this.f10867y;
        h1.e eVar = this.f10866x;
        if (!z10) {
            return eVar.g();
        }
        h0 h0Var = l0Var.f10729a;
        h1.e eVarZ = h0Var.z();
        Object[] objArr = eVarZ.f6421a;
        int i7 = eVarZ.f6423c;
        for (int i10 = 0; i10 < i7; i10++) {
            h0 h0Var2 = (h0) objArr[i10];
            if (eVar.f6423c <= i10) {
                eVar.b(h0Var2.F.f10743p);
            } else {
                y0 y0Var = h0Var2.F.f10743p;
                Object[] objArr2 = eVar.f6421a;
                Object obj = objArr2[i10];
                objArr2[i10] = y0Var;
            }
        }
        eVar.m(((h1.e) ((h1.b) h0Var.n()).f6413b).f6423c, eVar.f6423c);
        this.f10867y = false;
        return eVar.g();
    }

    @Override // q2.a
    public final i0 b() {
        return this.f10865w;
    }

    @Override // o2.l0
    public final int c(int i7) {
        l0 l0Var = this.f10849f;
        if (!f.q(l0Var.f10729a)) {
            j0();
            return l0Var.a().c(i7);
        }
        u0 u0Var = l0Var.f10744q;
        i9.l.b(u0Var);
        return u0Var.c(i7);
    }

    public final void d0() {
        boolean z10 = this.f10860r;
        this.f10860r = true;
        h0 h0Var = this.f10849f.f10729a;
        d1 d1Var = h0Var.E;
        if (!z10) {
            d1Var.f10614c.S0();
            if (h0Var.r()) {
                h0.V(h0Var, true, 6);
            } else if (h0Var.F.f10733e) {
                h0.T(h0Var, true, 6);
            }
        }
        h1 h1Var = d1Var.f10614c.f10693p;
        for (h1 h1Var2 = d1Var.f10615d; !i9.l.a(h1Var2, h1Var) && h1Var2 != null; h1Var2 = h1Var2.f10693p) {
            if (h1Var2.H) {
                h1Var2.N0();
            }
        }
        h1.e eVarZ = h0Var.z();
        Object[] objArr = eVarZ.f6421a;
        int i7 = eVarZ.f6423c;
        for (int i10 = 0; i10 < i7; i10++) {
            h0 h0Var2 = (h0) objArr[i10];
            if (h0Var2.w() != Integer.MAX_VALUE) {
                h0Var2.F.f10743p.d0();
                h0.W(h0Var2);
            }
        }
    }

    @Override // q2.a
    public final t f() {
        return this.f10849f.f10729a.E.f10614c;
    }

    public final void f0() {
        if (this.f10860r) {
            this.f10860r = false;
            l0 l0Var = this.f10849f;
            d1 d1Var = l0Var.f10729a.E;
            h1 h1Var = d1Var.f10614c.f10693p;
            for (h1 h1Var2 = d1Var.f10615d; !i9.l.a(h1Var2, h1Var) && h1Var2 != null; h1Var2 = h1Var2.f10693p) {
                r1.o oVarI0 = h1Var2.I0(i1.g(1048576));
                if (oVarI0 != null && (oVarI0.f11117a.f11120d & 1048576) != 0) {
                    boolean zG = i1.g(1048576);
                    r1.o oVarG0 = h1Var2.G0();
                    if (zG || (oVarG0 = oVarG0.f11121e) != null) {
                        for (r1.o oVarI1 = h1Var2.I0(zG); oVarI1 != null && (oVarI1.f11120d & 1048576) != 0; oVarI1 = oVarI1.f11122f) {
                            if ((oVarI1.f11119c & 1048576) != 0) {
                                r1.o oVarF = oVarI1;
                                h1.e eVar = null;
                                while (oVarF != null) {
                                    if ((oVarF.f11119c & 1048576) != 0 && (oVarF instanceof m)) {
                                        int i7 = 0;
                                        for (r1.o oVar = ((m) oVarF).f10746p; oVar != null; oVar = oVar.f11122f) {
                                            if ((oVar.f11119c & 1048576) != 0) {
                                                i7++;
                                                if (i7 == 1) {
                                                    oVarF = oVar;
                                                } else {
                                                    if (eVar == null) {
                                                        eVar = new h1.e(new r1.o[16]);
                                                    }
                                                    if (oVarF != null) {
                                                        eVar.b(oVarF);
                                                        oVarF = null;
                                                    }
                                                    eVar.b(oVar);
                                                }
                                            }
                                        }
                                        if (i7 == 1) {
                                        }
                                    }
                                    oVarF = f.f(eVar);
                                }
                            }
                            if (oVarI1 == oVarG0) {
                                break;
                            }
                        }
                    }
                }
                h1Var2.X0();
            }
            h1.e eVarZ = l0Var.f10729a.z();
            Object[] objArr = eVarZ.f6421a;
            int i10 = eVarZ.f6423c;
            for (int i11 = 0; i11 < i10; i11++) {
                ((h0) objArr[i11]).F.f10743p.f0();
            }
        }
    }

    public final void g0() {
        l0 l0Var = this.f10849f;
        if (l0Var.f10739l > 0) {
            h1.e eVarZ = l0Var.f10729a.z();
            Object[] objArr = eVarZ.f6421a;
            int i7 = eVarZ.f6423c;
            for (int i10 = 0; i10 < i7; i10++) {
                h0 h0Var = (h0) objArr[i10];
                l0 l0Var2 = h0Var.F;
                boolean z10 = l0Var2.f10738j;
                y0 y0Var = l0Var2.f10743p;
                if ((z10 || l0Var2.k) && !y0Var.f10863u) {
                    h0Var.U(false);
                }
                y0Var.g0();
            }
        }
    }

    @Override // q2.a
    public final a j() {
        l0 l0Var;
        h0 h0VarV = this.f10849f.f10729a.v();
        if (h0VarV == null || (l0Var = h0VarV.F) == null) {
            return null;
        }
        return l0Var.f10743p;
    }

    public final void j0() {
        f0 f0Var;
        l0 l0Var = this.f10849f;
        h0.V(l0Var.f10729a, false, 7);
        h0 h0Var = l0Var.f10729a;
        h0 h0VarV = h0Var.v();
        if (h0VarV == null || h0Var.B != f0.f10640c) {
            return;
        }
        int iOrdinal = h0VarV.F.f10732d.ordinal();
        if (iOrdinal != 0) {
            f0Var = iOrdinal != 2 ? h0VarV.B : f0.f10639b;
        } else {
            f0Var = f0.f10638a;
        }
        h0Var.B = f0Var;
    }

    public final void k0() throws Throwable {
        this.E = true;
        l0 l0Var = this.f10849f;
        h0 h0VarV = l0Var.f10729a.v();
        float f10 = f().A;
        h0 h0Var = l0Var.f10729a;
        d1 d1Var = h0Var.E;
        h1 h1Var = d1Var.f10615d;
        t tVar = d1Var.f10614c;
        while (h1Var != tVar) {
            i9.l.c(h1Var, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            z zVar = (z) h1Var;
            f10 += zVar.A;
            h1Var = zVar.f10693p;
        }
        if (f10 != this.D) {
            this.D = f10;
            if (h0VarV != null) {
                h0VarV.O();
            }
            if (h0VarV != null) {
                h0VarV.C();
            }
        }
        if (this.f10860r) {
            h0Var.E.f10614c.S0();
        } else {
            if (h0VarV != null) {
                h0VarV.C();
            }
            d0();
            if (this.f10850g && h0VarV != null) {
                h0VarV.U(false);
            }
        }
        if (h0VarV != null) {
            l0 l0Var2 = h0VarV.F;
            if (!this.f10850g && l0Var2.f10732d == d0.f10608c) {
                if (this.f10852i != Integer.MAX_VALUE) {
                    n2.a.b("Place was called on a node which was placed already");
                }
                int i7 = l0Var2.f10737i;
                this.f10852i = i7;
                l0Var2.f10737i = i7 + 1;
            }
        } else {
            this.f10852i = 0;
        }
        A();
    }

    public final void l0(long j5) {
        l0 l0Var = this.f10849f;
        d0 d0Var = l0Var.f10732d;
        h0 h0Var = l0Var.f10729a;
        d0 d0Var2 = d0.f10610e;
        if (d0Var != d0Var2) {
            n2.a.b("layout state is not idle before measure starts");
        }
        this.A = j5;
        d0 d0Var3 = d0.f10606a;
        l0Var.f10732d = d0Var3;
        this.f10862t = false;
        s1 snapshotObserver = ((r2.u) k0.a(h0Var)).getSnapshotObserver();
        snapshotObserver.a(h0Var, snapshotObserver.f10796c, this.B);
        if (l0Var.f10732d == d0Var3) {
            this.f10863u = true;
            this.f10864v = true;
            l0Var.f10732d = d0Var2;
        }
    }

    @Override // o2.l0
    public final int m(int i7) {
        l0 l0Var = this.f10849f;
        if (!f.q(l0Var.f10729a)) {
            j0();
            return l0Var.a().m(i7);
        }
        u0 u0Var = l0Var.f10744q;
        i9.l.b(u0Var);
        return u0Var.m(i7);
    }

    public final void m0(long j5, float f10, h9.k kVar) throws Throwable {
        l0 l0Var = this.f10849f;
        h0 h0Var = l0Var.f10729a;
        h0 h0Var2 = l0Var.f10729a;
        if (h0Var.P) {
            n2.a.a("place is called on a deactivated node");
        }
        l0Var.f10732d = d0.f10608c;
        this.f10855m = j5;
        this.f10857o = f10;
        this.f10856n = kVar;
        this.E = false;
        q1 q1VarA = k0.a(h0Var2);
        if (this.f10863u || !this.f10860r) {
            this.f10865w.f10714e = false;
            l0Var.f(false);
            this.F = kVar;
            this.G = j5;
            this.H = f10;
            s1 snapshotObserver = ((r2.u) q1VarA).getSnapshotObserver();
            snapshotObserver.a(h0Var2, snapshotObserver.f10799f, this.I);
        } else {
            h1 h1VarA = l0Var.a();
            h1VarA.V0(n3.j.c(j5, h1VarA.f9439e), f10, kVar);
            k0();
        }
        l0Var.f10732d = d0.f10610e;
        this.k = true;
    }

    public final boolean n0(long j5) throws Throwable {
        l0 l0Var = this.f10849f;
        h0 h0Var = l0Var.f10729a;
        h0 h0Var2 = l0Var.f10729a;
        try {
            if (h0Var.P) {
                n2.a.a("measure is called on a deactivated node");
            }
            q1 q1VarA = k0.a(h0Var2);
            h0 h0VarV = h0Var2.v();
            boolean z10 = true;
            h0Var2.D = h0Var2.D || (h0VarV != null && h0VarV.D);
            if (!h0Var2.r() && n3.a.b(this.f9438d, j5)) {
                ((r2.u) q1VarA).p(h0Var2, false);
                h0Var2.X();
                return false;
            }
            this.f10865w.f10713d = false;
            h1.e eVarZ = h0Var2.z();
            Object[] objArr = eVarZ.f6421a;
            int i7 = eVarZ.f6423c;
            for (int i10 = 0; i10 < i7; i10++) {
                ((h0) objArr[i10]).F.f10743p.f10865w.getClass();
            }
            this.f10853j = true;
            long j10 = l0Var.a().f9437c;
            X(j5);
            l0(j5);
            if (n3.m.a(l0Var.a().f9437c, j10) && l0Var.a().f9435a == this.f9435a && l0Var.a().f9436b == this.f9436b) {
                z10 = false;
            }
            U((((long) l0Var.a().f9436b) & 4294967295L) | (((long) l0Var.a().f9435a) << 32));
            return z10;
        } catch (Throwable th) {
            h0Var.Y(th);
            throw null;
        }
    }

    @Override // o2.l0
    public final int r(int i7) {
        l0 l0Var = this.f10849f;
        if (!f.q(l0Var.f10729a)) {
            j0();
            return l0Var.a().r(i7);
        }
        u0 u0Var = l0Var.f10744q;
        i9.l.b(u0Var);
        return u0Var.r(i7);
    }

    @Override // q2.a
    public final void requestLayout() {
        this.f10849f.f10729a.U(false);
    }

    @Override // o2.l0
    public final o2.v0 u(long j5) throws Throwable {
        f0 f0Var;
        l0 l0Var = this.f10849f;
        h0 h0Var = l0Var.f10729a;
        f0 f0Var2 = h0Var.B;
        f0 f0Var3 = f0.f10640c;
        if (f0Var2 == f0Var3) {
            h0Var.e();
        }
        if (f.q(l0Var.f10729a)) {
            u0 u0Var = l0Var.f10744q;
            i9.l.b(u0Var);
            u0Var.f10814j = f0Var3;
            u0Var.u(j5);
        }
        h0 h0Var2 = l0Var.f10729a;
        h0 h0VarV = h0Var2.v();
        if (h0VarV != null) {
            l0 l0Var2 = h0VarV.F;
            if (this.f10854l != f0Var3 && !h0Var2.D) {
                n2.a.b("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int iOrdinal = l0Var2.f10732d.ordinal();
            if (iOrdinal == 0) {
                f0Var = f0.f10638a;
            } else {
                if (iOrdinal != 2) {
                    throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + l0Var2.f10732d);
                }
                f0Var = f0.f10639b;
            }
            this.f10854l = f0Var;
        } else {
            this.f10854l = f0Var3;
        }
        n0(j5);
        return this;
    }

    @Override // o2.v0, o2.l0
    public final Object w() {
        return this.f10859q;
    }

    @Override // q2.a1
    public final void z(boolean z10) {
        l0 l0Var = this.f10849f;
        if (z10 != l0Var.a().f10771i) {
            l0Var.a().f10771i = z10;
            this.J = true;
        }
    }
}
