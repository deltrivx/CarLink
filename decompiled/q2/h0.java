package q2;

import f1.x2;
import java.util.List;
import r2.r2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class h0 implements f1.j, r1, j {
    public static final c0 Q = new c0("Undefined intrinsics block and it is required");
    public static final b0 R = new b0();
    public static final b4.c S = new b4.c(5);
    public f1.a0 A;
    public f0 B;
    public f0 C;
    public boolean D;
    public final d1 E;
    public final l0 F;
    public o2.i0 G;
    public h1 H;
    public boolean I;
    public r1.p J;
    public r1.p K;
    public q3.c L;
    public k2.d0 M;
    public boolean N;
    public int O;
    public boolean P;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f10667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f10669c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f10670d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f10671e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f10672f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public h0 f10673g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f10674h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final android.support.v4.media.session.r f10675i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public h1.e f10676j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public h0 f10677l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public q1 f10678m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public q3.q f10679n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f10680o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f10681p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f10682q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public y2.j f10683r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f10684s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final h1.e f10685t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f10686u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public o2.m0 f10687v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public u0.k f10688w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public n3.c f10689x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public n3.o f10690y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public r2 f10691z;

    public h0(int i7) {
        this(y2.k.f15015a.addAndGet(1), (i7 & 1) == 0);
    }

    public h0(int i7, boolean z10) {
        this.f10667a = z10;
        this.f10668b = i7;
        this.f10669c = 9223372034707292159L;
        this.f10670d = 0L;
        this.f10671e = 9223372034707292159L;
        this.f10672f = true;
        this.f10675i = new android.support.v4.media.session.r(22, new h1.e(new h0[16]), new b1.a(12, this));
        this.f10685t = new h1.e(new h0[16]);
        this.f10686u = true;
        this.f10687v = Q;
        this.f10689x = k0.f10725a;
        this.f10690y = n3.o.f8749a;
        this.f10691z = R;
        f1.a0.f4876b0.getClass();
        this.A = f1.z.f5232b;
        f0 f0Var = f0.f10640c;
        this.B = f0Var;
        this.C = f0Var;
        this.E = new d1(this);
        this.F = new l0(this);
        this.I = true;
        this.J = r1.m.f11116a;
    }

    public static void T(h0 h0Var, boolean z10, int i7) {
        h0 h0VarV;
        if ((i7 & 1) != 0) {
            z10 = false;
        }
        boolean z11 = (i7 & 2) != 0;
        boolean z12 = (i7 & 4) != 0;
        if (h0Var.f10673g == null) {
            n2.a.b("Lookahead measure cannot be requested on a node that is not a part of the LookaheadScope");
        }
        h0Var.f10672f = true;
        q1 q1Var = h0Var.f10678m;
        if (q1Var == null || h0Var.f10681p || h0Var.f10667a) {
            return;
        }
        ((r2.u) q1Var).D(h0Var, true, z10, z11);
        if (z12) {
            u0 u0Var = h0Var.F.f10744q;
            i9.l.b(u0Var);
            l0 l0Var = u0Var.f10810f;
            h0 h0VarV2 = l0Var.f10729a.v();
            f0 f0Var = l0Var.f10729a.B;
            if (h0VarV2 == null || f0Var == f0.f10640c) {
                return;
            }
            while (h0VarV2.B == f0Var && (h0VarV = h0VarV2.v()) != null) {
                h0VarV2 = h0VarV;
            }
            int iOrdinal = f0Var.ordinal();
            if (iOrdinal == 0) {
                if (h0VarV2.f10673g != null) {
                    T(h0VarV2, z10, 6);
                    return;
                } else {
                    V(h0VarV2, z10, 6);
                    return;
                }
            }
            if (iOrdinal != 1) {
                throw new IllegalStateException("Intrinsics isn't used by the parent");
            }
            if (h0VarV2.f10673g != null) {
                h0VarV2.S(z10);
            } else {
                h0VarV2.U(z10);
            }
        }
    }

    public static void V(h0 h0Var, boolean z10, int i7) {
        q1 q1Var;
        h0 h0VarV;
        if ((i7 & 1) != 0) {
            z10 = false;
        }
        boolean z11 = (i7 & 2) != 0;
        boolean z12 = (i7 & 4) != 0;
        h0Var.f10672f = true;
        if (h0Var.f10681p || h0Var.f10667a || (q1Var = h0Var.f10678m) == null) {
            return;
        }
        ((r2.u) q1Var).D(h0Var, false, z10, z11);
        if (z12) {
            l0 l0Var = h0Var.F.f10743p.f10849f;
            h0 h0VarV2 = l0Var.f10729a.v();
            f0 f0Var = l0Var.f10729a.B;
            if (h0VarV2 == null || f0Var == f0.f10640c) {
                return;
            }
            while (h0VarV2.B == f0Var && (h0VarV = h0VarV2.v()) != null) {
                h0VarV2 = h0VarV;
            }
            int iOrdinal = f0Var.ordinal();
            if (iOrdinal == 0) {
                V(h0VarV2, z10, 6);
            } else {
                if (iOrdinal != 1) {
                    throw new IllegalStateException("Intrinsics isn't used by the parent");
                }
                h0VarV2.U(z10);
            }
        }
    }

    public static void W(h0 h0Var) {
        l0 l0Var = h0Var.F;
        if (g0.f10653a[l0Var.f10732d.ordinal()] != 1) {
            throw new IllegalStateException("Unexpected state " + l0Var.f10732d);
        }
        if (l0Var.f10733e) {
            T(h0Var, true, 6);
            return;
        }
        if (l0Var.f10734f) {
            h0Var.S(true);
        }
        if (h0Var.r()) {
            V(h0Var, true, 6);
        } else if (h0Var.q()) {
            h0Var.U(true);
        }
    }

    private final String j(h0 h0Var) {
        StringBuilder sb2 = new StringBuilder("Cannot insert ");
        sb2.append(h0Var);
        sb2.append(" because it already has a parent or an owner. This tree: ");
        sb2.append(g(0));
        sb2.append(" Other tree: ");
        h0 h0Var2 = h0Var.f10677l;
        sb2.append(h0Var2 != null ? h0Var2.g(0) : null);
        return sb2.toString();
    }

    public final void A(long j5, r rVar, int i7, boolean z10) {
        d1 d1Var = this.E;
        h1 h1Var = d1Var.f10615d;
        y1.i0 i0Var = h1.J;
        d1Var.f10615d.L0(h1.M, h1Var.D0(j5), rVar, i7, z10);
    }

    public final void B(int i7, h0 h0Var) {
        if (h0Var.f10677l != null && h0Var.f10678m != null) {
            n2.a.b(j(h0Var));
        }
        h0Var.f10677l = this;
        android.support.v4.media.session.r rVar = this.f10675i;
        ((h1.e) rVar.f604b).a(i7, h0Var);
        ((b1.a) rVar.f605c).invoke();
        O();
        if (h0Var.f10667a) {
            this.f10674h++;
        }
        H();
        q1 q1Var = this.f10678m;
        if (q1Var != null) {
            h0Var.d(q1Var);
        }
        if (h0Var.F.f10739l > 0) {
            l0 l0Var = this.F;
            l0Var.d(l0Var.f10739l + 1);
        }
        if (h0Var.O > 0) {
            a0(this.O + 1);
        }
    }

    public final void C() {
        if (this.I) {
            d1 d1Var = this.E;
            h1 h1Var = d1Var.f10614c;
            h1 h1Var2 = d1Var.f10615d.f10694q;
            this.H = null;
            while (!i9.l.a(h1Var, h1Var2)) {
                if ((h1Var != null ? h1Var.I : null) != null) {
                    this.H = h1Var;
                    break;
                }
                h1Var = h1Var != null ? h1Var.f10694q : null;
            }
        }
        h1 h1Var3 = this.H;
        if (h1Var3 != null && h1Var3.I == null) {
            throw ob.a.o("layer was not set");
        }
        if (h1Var3 != null) {
            h1Var3.N0();
            return;
        }
        h0 h0VarV = v();
        if (h0VarV != null) {
            h0VarV.C();
        }
    }

    public final void D() {
        d1 d1Var = this.E;
        h1 h1Var = d1Var.f10615d;
        t tVar = d1Var.f10614c;
        while (h1Var != tVar) {
            i9.l.c(h1Var, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            z zVar = (z) h1Var;
            p1 p1Var = zVar.I;
            if (p1Var != null) {
                p1Var.invalidate();
            }
            h1Var = zVar.f10693p;
        }
        p1 p1Var2 = d1Var.f10614c.I;
        if (p1Var2 != null) {
            p1Var2.invalidate();
        }
    }

    public final void E() {
        if (this.f10667a) {
            h0 h0VarV = v();
            if (h0VarV != null) {
                h0VarV.E();
                return;
            }
            return;
        }
        if (this.f10673g != null) {
            T(this, false, 7);
        } else {
            V(this, false, 7);
        }
    }

    public final void F() {
        if (n3.j.a(this.f10669c, 9223372034707292159L)) {
            return;
        }
        this.f10669c = 9223372034707292159L;
        h1.e eVarZ = z();
        Object[] objArr = eVarZ.f6421a;
        int i7 = eVarZ.f6423c;
        for (int i10 = 0; i10 < i7; i10++) {
            ((h0) objArr[i10]).F();
        }
    }

    public final void G() {
        if (this.f10684s) {
            return;
        }
        if (this.E.f10613b.f11122f != null || this.K != null) {
            this.f10682q = true;
            return;
        }
        y2.j jVar = this.f10683r;
        this.f10684s = true;
        i9.x xVar = new i9.x();
        xVar.f6688a = new y2.j();
        s1 snapshotObserver = ((r2.u) k0.a(this)).getSnapshotObserver();
        snapshotObserver.a(this, snapshotObserver.f10797d, new k2.d(1, this, xVar));
        this.f10684s = false;
        this.f10683r = (y2.j) xVar.f6688a;
        this.f10682q = false;
        r2.u uVar = (r2.u) k0.a(this);
        uVar.getSemanticsOwner().b(this, jVar);
        uVar.F();
    }

    public final void H() {
        h0 h0Var;
        if (this.f10674h > 0) {
            this.k = true;
        }
        if (!this.f10667a || (h0Var = this.f10677l) == null) {
            return;
        }
        h0Var.H();
    }

    public final boolean I() {
        return this.f10678m != null;
    }

    public final boolean J() {
        return this.F.f10743p.f10860r;
    }

    public final Boolean K() {
        u0 u0Var = this.F.f10744q;
        if (u0Var != null) {
            return Boolean.valueOf(u0Var.B());
        }
        return null;
    }

    public final void L() {
        h0 h0VarV;
        if (this.B == f0.f10640c) {
            f();
        }
        u0 u0Var = this.F.f10744q;
        i9.l.b(u0Var);
        try {
            u0Var.f10811g = true;
            if (!u0Var.k) {
                n2.a.b("replace() called on item that was not placed");
            }
            u0Var.f10826w = false;
            boolean zB = u0Var.B();
            u0Var.k0(u0Var.f10817n, u0Var.f10818o);
            if (zB && !u0Var.f10826w && (h0VarV = u0Var.f10810f.f10729a.v()) != null) {
                h0VarV.S(false);
            }
        } finally {
            u0Var.f10811g = false;
        }
    }

    public final void M(int i7, int i10, int i11) {
        if (i7 == i10) {
            return;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = i7 > i10 ? i7 + i12 : i7;
            int i14 = i7 > i10 ? i10 + i12 : (i10 + i11) - 2;
            android.support.v4.media.session.r rVar = this.f10675i;
            h1.e eVar = (h1.e) rVar.f604b;
            b1.a aVar = (b1.a) rVar.f605c;
            Object objL = eVar.l(i13);
            aVar.invoke();
            ((h1.e) rVar.f604b).a(i14, (h0) objL);
            aVar.invoke();
        }
        O();
        H();
        E();
    }

    public final void N(h0 h0Var) {
        if (h0Var.F.f10739l > 0) {
            l0 l0Var = this.F;
            l0Var.d(l0Var.f10739l - 1);
        }
        if (this.f10678m != null) {
            h0Var.h();
        }
        h0Var.f10677l = null;
        if (h0Var.O > 0) {
            a0(this.O - 1);
        }
        h0Var.E.f10615d.f10694q = null;
        if (h0Var.f10667a) {
            this.f10674h--;
            h1.e eVar = (h1.e) h0Var.f10675i.f604b;
            Object[] objArr = eVar.f6421a;
            int i7 = eVar.f6423c;
            for (int i10 = 0; i10 < i7; i10++) {
                ((h0) objArr[i10]).E.f10615d.f10694q = null;
            }
        }
        H();
        O();
    }

    public final void O() {
        if (!this.f10667a) {
            this.f10686u = true;
            return;
        }
        h0 h0VarV = v();
        if (h0VarV != null) {
            h0VarV.O();
        }
    }

    public final void P() {
        android.support.v4.media.session.r rVar = this.f10675i;
        h1.e eVar = (h1.e) rVar.f604b;
        h1.e eVar2 = (h1.e) rVar.f604b;
        int i7 = eVar.f6423c;
        while (true) {
            i7--;
            if (-1 >= i7) {
                eVar2.h();
                ((b1.a) rVar.f605c).invoke();
                return;
            }
            N((h0) eVar2.f6421a[i7]);
        }
    }

    public final void Q(int i7, int i10) {
        if (i10 < 0) {
            n2.a.a("count (" + i10 + ") must be greater than 0");
        }
        int i11 = (i10 + i7) - 1;
        if (i7 > i11) {
            return;
        }
        while (true) {
            android.support.v4.media.session.r rVar = this.f10675i;
            N((h0) ((h1.e) rVar.f604b).f6421a[i11]);
            Object objL = ((h1.e) rVar.f604b).l(i11);
            ((b1.a) rVar.f605c).invoke();
            if (i11 == i7) {
                return;
            } else {
                i11--;
            }
        }
    }

    public final void R() {
        h0 h0VarV;
        if (this.B == f0.f10640c) {
            f();
        }
        y0 y0Var = this.F.f10743p;
        l0 l0Var = y0Var.f10849f;
        try {
            y0Var.f10850g = true;
            if (!y0Var.k) {
                n2.a.b("replace called on unplaced item");
            }
            boolean z10 = y0Var.f10860r;
            y0Var.m0(y0Var.f10855m, y0Var.f10857o, y0Var.f10856n);
            if (z10 && !y0Var.E && (h0VarV = l0Var.f10729a.v()) != null) {
                h0VarV.U(false);
            }
            y0Var.f10850g = false;
        } catch (Throwable th) {
            try {
                l0Var.f10729a.Y(th);
                throw null;
            } catch (Throwable th2) {
                y0Var.f10850g = false;
                throw th2;
            }
        }
    }

    public final void S(boolean z10) {
        q1 q1Var;
        this.f10672f = true;
        if (this.f10667a || (q1Var = this.f10678m) == null) {
            return;
        }
        ((r2.u) q1Var).E(this, true, z10);
    }

    public final void U(boolean z10) {
        q1 q1Var;
        this.f10672f = true;
        if (this.f10667a || (q1Var = this.f10678m) == null) {
            return;
        }
        ((r2.u) q1Var).E(this, false, z10);
    }

    public final void X() {
        h1.e eVarZ = z();
        Object[] objArr = eVarZ.f6421a;
        int i7 = eVarZ.f6423c;
        for (int i10 = 0; i10 < i7; i10++) {
            h0 h0Var = (h0) objArr[i10];
            f0 f0Var = h0Var.C;
            h0Var.B = f0Var;
            if (f0Var != f0.f10640c) {
                h0Var.X();
            }
        }
    }

    public final void Y(Throwable th) throws Throwable {
        f1.a0 a0Var = this.A;
        x2 x2Var = q1.d.f10581a;
        n1.g gVar = (n1.g) a0Var;
        gVar.getClass();
        q1.c cVar = (q1.c) f1.b.t(gVar, x2Var);
        if (cVar == null) {
            throw th;
        }
        n3.r.b0(th, new a8.f1(16, cVar, this));
        throw th;
    }

    public final void Z(n3.c cVar) {
        if (i9.l.a(this.f10689x, cVar)) {
            return;
        }
        this.f10689x = cVar;
        E();
        h0 h0VarV = v();
        if (h0VarV != null) {
            h0VarV.C();
        }
        D();
        for (r1.o oVar = this.E.f10617f; oVar != null; oVar = oVar.f11122f) {
            oVar.r0();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v3, types: [q2.h1, r1.o] */
    public final void a(r1.p pVar) {
        boolean z10;
        c1 c1Var;
        h1.e eVar;
        d1 d1Var;
        boolean z11;
        h1.e eVar2;
        d1 d1Var2;
        boolean z12;
        ?? r8;
        h1.e eVar3;
        h1.e eVar4;
        h1.e eVar5;
        h1.e eVar6;
        h1.e eVar7;
        h1.e eVar8;
        char c10;
        h1.e eVar9;
        b2.a aVar;
        d1 d1Var3 = this.E;
        boolean zD = d1Var3.d(16);
        r1.o oVar = d1Var3.f10616e;
        boolean zD2 = d1Var3.d(1024);
        this.J = pVar;
        t tVar = d1Var3.f10614c;
        h0 h0Var = d1Var3.f10612a;
        r1.o oVar2 = d1Var3.f10617f;
        c1 c1Var2 = d1Var3.f10613b;
        if (oVar2 == c1Var2) {
            n2.a.b("padChain called on already padded chain");
        }
        r1.o oVar3 = d1Var3.f10617f;
        oVar3.f11121e = c1Var2;
        c1Var2.f11122f = oVar3;
        h1.e eVar10 = d1Var3.f10618g;
        int i7 = eVar10 != null ? eVar10.f6423c : 0;
        h1.e eVar11 = d1Var3.f10619h;
        if (eVar11 == null) {
            eVar11 = new h1.e(new r1.n[16]);
        }
        h1.e eVar12 = d1Var3.f10620i;
        eVar12.b(pVar);
        b2.a aVar2 = null;
        while (true) {
            int i10 = eVar12.f6423c;
            if (i10 == 0) {
                break;
            }
            r1.p pVar2 = (r1.p) eVar12.l(i10 - 1);
            if (pVar2 instanceof r1.j) {
                r1.j jVar = (r1.j) pVar2;
                eVar12.b(jVar.f11113b);
                eVar12.b(jVar.f11112a);
            } else if (pVar2 instanceof r1.n) {
                eVar11.b(pVar2);
            } else {
                if (aVar2 == null) {
                    aVar = new b2.a(4, eVar11);
                    aVar2 = aVar;
                } else {
                    aVar = aVar2;
                }
                pVar2.h(aVar);
            }
        }
        int i11 = eVar11.f6423c;
        if (i11 == i7) {
            r1.o oVar4 = c1Var2.f11122f;
            int i12 = 0;
            while (true) {
                if (oVar4 == null) {
                    eVar6 = eVar10;
                } else if (i12 < i7) {
                    if (eVar6 == null) {
                        throw ob.a.o("expected prior modifier list to be non-empty");
                    }
                    r1.n nVar = (r1.n) eVar6.f6421a[i12];
                    r1.n nVar2 = (r1.n) eVar11.f6421a[i12];
                    if (i9.l.a(nVar, nVar2)) {
                        eVar9 = eVar6;
                        c10 = 2;
                    } else {
                        eVar8 = eVar6;
                        c10 = nVar.getClass() == nVar2.getClass() ? (char) 1 : (char) 0;
                    }
                    if (c10 == 0) {
                        eVar9 = eVar8;
                        eVar9 = eVar8;
                        oVar4 = oVar4.f11121e;
                        eVar7 = eVar9;
                        break;
                    }
                    eVar9 = eVar8;
                    eVar9 = eVar8;
                    if (c10 == 1) {
                        d1.h(nVar, nVar2, oVar4);
                    }
                    oVar4 = oVar4.f11122f;
                    i12++;
                    eVar6 = eVar9;
                }
                eVar7 = eVar6;
                break;
            }
            if (i12 >= i7) {
                d1Var3 = d1Var3;
                eVar2 = eVar7;
                z11 = false;
                d1Var2 = d1Var3;
                c1Var = c1Var2;
                eVar = eVar11;
                z12 = false;
                eVar3 = eVar2;
                r8 = z11;
            } else {
                if (eVar7 == null) {
                    throw ob.a.o("expected prior modifier list to be non-empty");
                }
                if (oVar4 == null) {
                    throw ob.a.o("structuralUpdate requires a non-null tail");
                }
                boolean z13 = h0Var.K != null;
                r1.o oVar5 = oVar4;
                d1 d1Var4 = d1Var3;
                eVar = eVar11;
                h1.e eVar13 = eVar7;
                z10 = false;
                d1Var4.f(i12, eVar13, eVar, oVar5, !z13);
                c1Var = c1Var2;
                d1Var = d1Var4;
                eVar5 = eVar13;
                z12 = true;
                d1Var2 = d1Var;
                eVar3 = eVar5;
                r8 = z10;
            }
        } else {
            z10 = false;
            z10 = false;
            z11 = false;
            r1.p pVar3 = h0Var.K;
            if (pVar3 != null && i7 == 0) {
                r1.o oVarB = c1Var2;
                for (int i13 = 0; i13 < eVar11.f6423c; i13++) {
                    oVarB = d1.b((r1.n) eVar11.f6421a[i13], oVarB);
                }
                int i14 = 0;
                for (r1.o oVar6 = oVar.f11121e; oVar6 != null && oVar6 != c1Var2; oVar6 = oVar6.f11121e) {
                    i14 |= oVar6.f11119c;
                    oVar6.f11120d = i14;
                }
                d1Var = d1Var3;
                c1Var = c1Var2;
                eVar = eVar11;
                eVar5 = eVar10;
            } else if (i11 != 0) {
                if (eVar10 == null) {
                    eVar10 = new h1.e(new r1.n[16]);
                }
                d1 d1Var5 = d1Var3;
                c1Var = c1Var2;
                eVar = eVar11;
                d1Var5.f(0, eVar10, eVar, c1Var, !(pVar3 != null));
                d1Var = d1Var5;
                eVar5 = eVar10;
            } else {
                if (eVar10 == null) {
                    throw ob.a.o("expected prior modifier list to be non-empty");
                }
                r1.o oVar7 = c1Var2.f11122f;
                for (int i15 = 0; oVar7 != null && i15 < eVar10.f6423c; i15++) {
                    oVar7 = d1.c(oVar7).f11122f;
                }
                h0 h0VarV = h0Var.v();
                tVar.f10694q = h0VarV != null ? h0VarV.E.f10614c : null;
                d1Var3.f10615d = tVar;
                eVar2 = eVar10;
                d1Var2 = d1Var3;
                c1Var = c1Var2;
                eVar = eVar11;
                z12 = false;
                eVar3 = eVar2;
                r8 = z11;
            }
            z12 = true;
            d1Var2 = d1Var;
            eVar3 = eVar5;
            r8 = z10;
        }
        d1Var2.f10618g = eVar;
        if (eVar3 != null) {
            eVar3.h();
            eVar4 = eVar3;
        } else {
            eVar4 = r8;
        }
        d1Var2.f10619h = eVar4;
        r1.o oVar8 = c1Var.f11122f;
        if (oVar8 != null) {
            oVar = oVar8;
        }
        oVar.f11121e = r8;
        c1Var.f11122f = r8;
        c1Var.f11120d = -1;
        c1Var.f11124h = r8;
        if (oVar == c1Var) {
            n2.a.b("trimChain did not update the head");
        }
        d1Var2.f10617f = oVar;
        if (z12) {
            d1Var2.g();
        }
        boolean zD3 = d1Var2.d(16);
        boolean zD4 = d1Var2.d(1024);
        this.F.j();
        if (this.f10673g == null && d1Var2.d(512)) {
            b0(this);
        }
        if (zD == zD3 && zD2 == zD4) {
            return;
        }
        z2.a rectManager = ((r2.u) k0.a(this)).getRectManager();
        rectManager.getClass();
        if (I()) {
            g7.l lVar = rectManager.f15694a;
            int i16 = this.f10668b & 67108863;
            long[] jArr = (long[]) lVar.f5999c;
            int i17 = lVar.f5998b;
            for (int i18 = 0; i18 < jArr.length - 2 && i18 < i17; i18 += 3) {
                int i19 = i18 + 2;
                long j5 = jArr[i19];
                if ((((int) j5) & 67108863) == i16) {
                    jArr[i19] = ((zD3 ? 1L : 0L) * Long.MIN_VALUE) | (4611686018427387903L & j5) | ((zD4 ? 1L : 0L) * 4611686018427387904L);
                    return;
                }
            }
        }
    }

    public final void a0(int i7) {
        h0 h0VarV;
        h0 h0VarV2;
        int i10 = this.O;
        if (i10 != i7) {
            if (i7 > 0 && i10 == 0 && (h0VarV2 = v()) != null) {
                h0VarV2.a0(h0VarV2.O + 1);
            }
            if (i7 == 0 && this.O > 0 && (h0VarV = v()) != null) {
                h0VarV.a0(h0VarV.O - 1);
            }
            this.O = i7;
        }
    }

    @Override // f1.j
    public final void b() {
        q3.q qVar = this.f10679n;
        if (qVar != null) {
            qVar.b();
        }
        o2.i0 i0Var = this.G;
        if (i0Var != null) {
            i0Var.b();
        }
        d1 d1Var = this.E;
        h1 h1Var = d1Var.f10614c.f10693p;
        for (h1 h1Var2 = d1Var.f10615d; !i9.l.a(h1Var2, h1Var) && h1Var2 != null; h1Var2 = h1Var2.f10693p) {
            h1Var2.f10695r = true;
            h1Var2.G.invoke();
            h1Var2.X0();
        }
    }

    public final void b0(h0 h0Var) {
        if (i9.l.a(h0Var, this.f10673g)) {
            return;
        }
        this.f10673g = h0Var;
        l0 l0Var = this.F;
        if (h0Var != null) {
            if (l0Var.f10744q == null) {
                l0Var.f10744q = new u0(l0Var);
            }
            d1 d1Var = this.E;
            h1 h1Var = d1Var.f10614c.f10693p;
            for (h1 h1Var2 = d1Var.f10615d; !i9.l.a(h1Var2, h1Var) && h1Var2 != null; h1Var2 = h1Var2.f10693p) {
                h1Var2.B0();
            }
        } else {
            l0Var.f10744q = null;
            l0Var.f10734f = false;
            l0Var.f10733e = false;
        }
        E();
    }

    @Override // f1.j
    public final void c() {
        s1.c cVar;
        q3.q qVar = this.f10679n;
        if (qVar != null) {
            qVar.c();
        }
        o2.i0 i0Var = this.G;
        if (i0Var != null) {
            i0Var.f(true);
        }
        this.P = true;
        r1.o oVar = this.E.f10616e;
        for (r1.o oVar2 = oVar; oVar2 != null; oVar2 = oVar2.f11121e) {
            if (oVar2.f11129n) {
                oVar2.v0();
            }
        }
        for (r1.o oVar3 = oVar; oVar3 != null; oVar3 = oVar3.f11121e) {
            if (oVar3.f11129n) {
                oVar3.x0();
            }
        }
        while (oVar != null) {
            if (oVar.f11129n) {
                oVar.p0();
            }
            oVar = oVar.f11121e;
        }
        if (I()) {
            this.f10683r = null;
            this.f10682q = false;
        }
        q1 q1Var = this.f10678m;
        if (q1Var != null) {
            r2.u uVar = (r2.u) q1Var;
            uVar.getRectManager().i(this);
            if (r2.u.l() && (cVar = uVar.F) != null && cVar.f12547h.e(this.f10668b)) {
                cVar.f12540a.Z(cVar.f12542c, this.f10668b, false);
            }
        }
    }

    public final void c0(o2.m0 m0Var) {
        if (i9.l.a(this.f10687v, m0Var)) {
            return;
        }
        this.f10687v = m0Var;
        u0.k kVar = this.f10688w;
        if (kVar != null) {
            ((f1.k1) kVar.f12991c).setValue(m0Var);
        }
        E();
    }

    public final void d(q1 q1Var) {
        h0 h0Var;
        s1.c cVar;
        y2.j jVarX;
        if (this.f10678m != null) {
            n2.a.b("Cannot attach " + this + " as it already is attached.  Tree: " + g(0));
        }
        h0 h0Var2 = this.f10677l;
        if (h0Var2 != null && !i9.l.a(h0Var2.f10678m, q1Var)) {
            StringBuilder sb2 = new StringBuilder("Attaching to a different owner(");
            sb2.append(q1Var);
            sb2.append(") than the parent's owner(");
            h0 h0VarV = v();
            sb2.append(h0VarV != null ? h0VarV.f10678m : null);
            sb2.append("). This tree: ");
            sb2.append(g(0));
            sb2.append(" Parent tree: ");
            h0 h0Var3 = this.f10677l;
            sb2.append(h0Var3 != null ? h0Var3.g(0) : null);
            n2.a.b(sb2.toString());
        }
        h0 h0VarV2 = v();
        l0 l0Var = this.F;
        if (h0VarV2 == null) {
            l0Var.f10743p.f10860r = true;
            u0 u0Var = l0Var.f10744q;
            if (u0Var != null) {
                u0Var.f10819p = r0.f10788a;
            }
        }
        d1 d1Var = this.E;
        d1Var.f10615d.f10694q = h0VarV2 != null ? h0VarV2.E.f10614c : null;
        this.f10678m = q1Var;
        this.f10680o = (h0VarV2 != null ? h0VarV2.f10680o : -1) + 1;
        r1.p pVar = this.K;
        if (pVar != null) {
            a(pVar);
        }
        this.K = null;
        r2.u uVar = (r2.u) q1Var;
        uVar.getLayoutNodes().h(this.f10668b, this);
        h0 h0Var4 = this.f10677l;
        if (h0Var4 == null || (h0Var = h0Var4.f10673g) == null) {
            h0Var = this.f10673g;
        }
        b0(h0Var);
        if (this.f10673g == null && d1Var.d(512)) {
            b0(this);
        }
        if (!this.P) {
            for (r1.o oVar = d1Var.f10617f; oVar != null; oVar = oVar.f11122f) {
                oVar.o0();
            }
        }
        h1.e eVar = (h1.e) this.f10675i.f604b;
        Object[] objArr = eVar.f6421a;
        int i7 = eVar.f6423c;
        for (int i10 = 0; i10 < i7; i10++) {
            ((h0) objArr[i10]).d(q1Var);
        }
        if (!this.P) {
            d1Var.e();
        }
        E();
        if (h0VarV2 != null) {
            h0VarV2.E();
        }
        q3.c cVar2 = this.L;
        if (cVar2 != null) {
            cVar2.invoke(q1Var);
        }
        l0Var.j();
        if (!this.P && d1Var.d(8)) {
            G();
        }
        uVar.getClass();
        if (!r2.u.l() || (cVar = uVar.F) == null || (jVarX = x()) == null || !jVarX.f15011a.b(y2.r.f15065q)) {
            return;
        }
        cVar.f12547h.a(this.f10668b);
        cVar.f12540a.Z(cVar.f12542c, this.f10668b, true);
    }

    public final void d0(r1.p pVar) {
        if (this.f10667a && this.J != r1.m.f11116a) {
            n2.a.a("Modifiers are not supported on virtual LayoutNodes");
        }
        if (this.P) {
            n2.a.a("modifier is updated when deactivated");
        }
        if (!I()) {
            this.K = pVar;
            return;
        }
        a(pVar);
        if (this.f10682q) {
            G();
        }
    }

    public final void e() {
        this.C = this.B;
        this.B = f0.f10640c;
        h1.e eVarZ = z();
        Object[] objArr = eVarZ.f6421a;
        int i7 = eVarZ.f6423c;
        for (int i10 = 0; i10 < i7; i10++) {
            h0 h0Var = (h0) objArr[i10];
            if (h0Var.B != f0.f10640c) {
                h0Var.e();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [r1.o] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [r1.o] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [h1.e] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [h1.e] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v4 */
    public final void e0(r2 r2Var) {
        if (i9.l.a(this.f10691z, r2Var)) {
            return;
        }
        this.f10691z = r2Var;
        r1.o oVar = this.E.f10617f;
        if ((oVar.f11120d & 16) != 0) {
            while (oVar != null) {
                if ((oVar.f11119c & 16) != 0) {
                    ?? F = oVar;
                    ?? eVar = 0;
                    while (F != 0) {
                        if (F instanceof v1) {
                            ((v1) F).g0();
                        } else if ((F.f11119c & 16) != 0 && (F instanceof m)) {
                            r1.o oVar2 = ((m) F).f10746p;
                            int i7 = 0;
                            F = F;
                            eVar = eVar;
                            while (oVar2 != null) {
                                if ((oVar2.f11119c & 16) != 0) {
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
                        F = f.f(eVar);
                    }
                }
                if ((oVar.f11120d & 16) == 0) {
                    return;
                } else {
                    oVar = oVar.f11122f;
                }
            }
        }
    }

    public final void f() {
        this.C = this.B;
        this.B = f0.f10640c;
        h1.e eVarZ = z();
        Object[] objArr = eVarZ.f6421a;
        int i7 = eVarZ.f6423c;
        for (int i10 = 0; i10 < i7; i10++) {
            h0 h0Var = (h0) objArr[i10];
            if (h0Var.B == f0.f10639b) {
                h0Var.f();
            }
        }
    }

    public final void f0() {
        if (this.f10674h <= 0 || !this.k) {
            return;
        }
        this.k = false;
        h1.e eVar = this.f10676j;
        if (eVar == null) {
            eVar = new h1.e(new h0[16]);
            this.f10676j = eVar;
        }
        eVar.h();
        h1.e eVar2 = (h1.e) this.f10675i.f604b;
        Object[] objArr = eVar2.f6421a;
        int i7 = eVar2.f6423c;
        for (int i10 = 0; i10 < i7; i10++) {
            h0 h0Var = (h0) objArr[i10];
            if (h0Var.f10667a) {
                eVar.c(eVar.f6423c, h0Var.z());
            } else {
                eVar.b(h0Var);
            }
        }
        l0 l0Var = this.F;
        l0Var.f10743p.f10867y = true;
        u0 u0Var = l0Var.f10744q;
        if (u0Var != null) {
            u0Var.f10822s = true;
        }
    }

    public final String g(int i7) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < i7; i10++) {
            sb2.append("  ");
        }
        sb2.append("|-");
        sb2.append(toString());
        sb2.append('\n');
        h1.e eVarZ = z();
        Object[] objArr = eVarZ.f6421a;
        int i11 = eVarZ.f6423c;
        for (int i12 = 0; i12 < i11; i12++) {
            sb2.append(((h0) objArr[i12]).g(i7 + 1));
        }
        String string = sb2.toString();
        if (i7 != 0) {
            return string;
        }
        String strSubstring = string.substring(0, string.length() - 1);
        i9.l.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final void h() {
        s1.c cVar;
        i0 i0Var;
        q1 q1Var = this.f10678m;
        if (q1Var == null) {
            StringBuilder sb2 = new StringBuilder("Cannot detach node that is already detached!  Tree: ");
            h0 h0VarV = v();
            sb2.append(h0VarV != null ? h0VarV.g(0) : null);
            n2.a.c(sb2.toString());
            throw new cc.s();
        }
        h0 h0VarV2 = v();
        l0 l0Var = this.F;
        if (h0VarV2 != null) {
            h0VarV2.C();
            h0VarV2.E();
            y0 y0Var = l0Var.f10743p;
            f0 f0Var = f0.f10640c;
            y0Var.f10854l = f0Var;
            u0 u0Var = l0Var.f10744q;
            if (u0Var != null) {
                u0Var.f10814j = f0Var;
            }
        }
        i0 i0Var2 = l0Var.f10743p.f10865w;
        i0Var2.f10711b = true;
        i0Var2.f10712c = false;
        i0Var2.f10713d = false;
        i0Var2.f10714e = false;
        i0Var2.f10715f = null;
        u0 u0Var2 = l0Var.f10744q;
        if (u0Var2 != null && (i0Var = u0Var2.f10820q) != null) {
            i0Var.f10711b = true;
            i0Var.f10712c = false;
            i0Var.f10713d = false;
            i0Var.f10714e = false;
            i0Var.f10715f = null;
        }
        d1 d1Var = this.E;
        r1.o oVar = d1Var.f10616e;
        h1 h1Var = d1Var.f10614c.f10693p;
        for (h1 h1Var2 = d1Var.f10615d; !i9.l.a(h1Var2, h1Var) && h1Var2 != null; h1Var2 = h1Var2.f10693p) {
            h1Var2.X0();
        }
        k2.d0 d0Var = this.M;
        if (d0Var != null) {
            d0Var.invoke(q1Var);
        }
        for (r1.o oVar2 = oVar; oVar2 != null; oVar2 = oVar2.f11121e) {
            if (oVar2.f11129n) {
                oVar2.x0();
            }
        }
        this.f10681p = true;
        h1.e eVar = (h1.e) this.f10675i.f604b;
        Object[] objArr = eVar.f6421a;
        int i7 = eVar.f6423c;
        for (int i10 = 0; i10 < i7; i10++) {
            ((h0) objArr[i10]).h();
        }
        this.f10681p = false;
        while (oVar != null) {
            if (oVar.f11129n) {
                oVar.p0();
            }
            oVar = oVar.f11121e;
        }
        r2.u uVar = (r2.u) q1Var;
        uVar.getLayoutNodes().g(this.f10668b);
        w0 w0Var = uVar.P;
        a2.b bVar = w0Var.f10838b;
        ((l0.o0) bVar.f12b).a0(this);
        ((l0.o0) bVar.f13c).a0(this);
        ((l0.o0) bVar.f14d).a0(this);
        ((h1.e) w0Var.f10841e.f12990b).k(this);
        uVar.G = true;
        uVar.getRectManager().i(this);
        if (r2.u.l() && (cVar = uVar.F) != null && cVar.f12547h.e(this.f10668b)) {
            cVar.f12540a.Z(cVar.f12542c, this.f10668b, false);
        }
        this.f10678m = null;
        this.f10669c = 9223372034707292159L;
        b0(null);
        this.f10680o = 0;
        y0 y0Var2 = l0Var.f10743p;
        y0Var2.f10852i = Integer.MAX_VALUE;
        y0Var2.f10851h = Integer.MAX_VALUE;
        y0Var2.f10860r = false;
        u0 u0Var3 = l0Var.f10744q;
        if (u0Var3 != null) {
            u0Var3.f10813i = Integer.MAX_VALUE;
            u0Var3.f10812h = Integer.MAX_VALUE;
            u0Var3.f10819p = r0.f10790c;
        }
        if (d1Var.d(8)) {
            y2.j jVar = this.f10683r;
            this.f10683r = null;
            this.f10682q = false;
            uVar.getSemanticsOwner().b(this, jVar);
            uVar.F();
        }
    }

    public final void i(y1.o oVar, b2.c cVar) throws Throwable {
        try {
            this.E.f10615d.z0(oVar, cVar);
        } catch (Throwable th) {
            Y(th);
            throw null;
        }
    }

    public final void k() {
        if (this.f10673g != null) {
            T(this, false, 5);
        } else {
            V(this, false, 5);
        }
        y0 y0Var = this.F.f10743p;
        n3.a aVar = y0Var.f10853j ? new n3.a(y0Var.f9438d) : null;
        if (aVar != null) {
            q1 q1Var = this.f10678m;
            if (q1Var != null) {
                ((r2.u) q1Var).z(this, aVar.f8730a);
                return;
            }
            return;
        }
        q1 q1Var2 = this.f10678m;
        if (q1Var2 != null) {
            ((r2.u) q1Var2).y(true);
        }
    }

    public final List l() {
        u0 u0Var = this.F.f10744q;
        i9.l.b(u0Var);
        h1.e eVar = u0Var.f10821r;
        l0 l0Var = u0Var.f10810f;
        l0Var.f10729a.n();
        if (!u0Var.f10822s) {
            return eVar.g();
        }
        h0 h0Var = l0Var.f10729a;
        h1.e eVarZ = h0Var.z();
        Object[] objArr = eVarZ.f6421a;
        int i7 = eVarZ.f6423c;
        for (int i10 = 0; i10 < i7; i10++) {
            h0 h0Var2 = (h0) objArr[i10];
            if (eVar.f6423c <= i10) {
                u0 u0Var2 = h0Var2.F.f10744q;
                i9.l.b(u0Var2);
                eVar.b(u0Var2);
            } else {
                u0 u0Var3 = h0Var2.F.f10744q;
                i9.l.b(u0Var3);
                Object[] objArr2 = eVar.f6421a;
                Object obj = objArr2[i10];
                objArr2[i10] = u0Var3;
            }
        }
        eVar.m(((h1.e) ((h1.b) h0Var.n()).f6413b).f6423c, eVar.f6423c);
        u0Var.f10822s = false;
        return eVar.g();
    }

    public final List m() {
        return this.F.f10743p.Y();
    }

    public final List n() {
        return z().g();
    }

    public final List o() {
        return ((h1.e) this.f10675i.f604b).g();
    }

    @Override // q2.r1
    public final boolean p() {
        return I();
    }

    public final boolean q() {
        return this.F.f10743p.f10863u;
    }

    public final boolean r() {
        return this.F.f10743p.f10862t;
    }

    public final f0 s() {
        return this.F.f10743p.f10854l;
    }

    public final f0 t() {
        f0 f0Var;
        u0 u0Var = this.F.f10744q;
        return (u0Var == null || (f0Var = u0Var.f10814j) == null) ? f0.f10640c : f0Var;
    }

    public final String toString() {
        return r2.j0.v(this) + " children: " + ((h1.e) ((h1.b) n()).f6413b).f6423c + " measurePolicy: " + this.f10687v + " deactivated: " + this.P;
    }

    public final u0.k u() {
        u0.k kVar = this.f10688w;
        if (kVar != null) {
            return kVar;
        }
        u0.k kVar2 = new u0.k(this, this.f10687v);
        this.f10688w = kVar2;
        return kVar2;
    }

    public final h0 v() {
        h0 h0Var = this.f10677l;
        while (h0Var != null && h0Var.f10667a) {
            h0Var = h0Var.f10677l;
        }
        return h0Var;
    }

    public final int w() {
        return this.F.f10743p.f10852i;
    }

    public final y2.j x() {
        if (I() && !this.P && this.E.d(8)) {
            return this.f10683r;
        }
        return null;
    }

    public final h1.e y() {
        boolean z10 = this.f10686u;
        h1.e eVar = this.f10685t;
        if (z10) {
            eVar.h();
            eVar.c(eVar.f6423c, z());
            u8.l.J0(eVar.f6421a, S, 0, eVar.f6423c);
            this.f10686u = false;
        }
        return eVar;
    }

    public final h1.e z() {
        f0();
        if (this.f10674h == 0) {
            return (h1.e) this.f10675i.f604b;
        }
        h1.e eVar = this.f10676j;
        i9.l.b(eVar);
        return eVar;
    }
}
