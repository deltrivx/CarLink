package q2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class u0 extends o2.v0 implements o2.l0, a, a1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l0 f10810f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f10811g;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f10815l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public n3.a f10816m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public h9.k f10818o;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f10823t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Object f10825v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f10826w;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f10812h = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f10813i = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public f0 f10814j = f0.f10640c;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f10817n = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public r0 f10819p = r0.f10790c;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final i0 f10820q = new i0(this, 1);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final h1.e f10821r = new h1.e(new u0[16]);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f10822s = true;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f10824u = true;

    public u0(l0 l0Var) {
        this.f10810f = l0Var;
        this.f10825v = l0Var.f10743p.f10859q;
    }

    @Override // q2.a
    public final void A() {
        this.f10823t = true;
        i0 i0Var = this.f10820q;
        i0Var.h();
        l0 l0Var = this.f10810f;
        boolean z10 = l0Var.f10734f;
        h0 h0Var = l0Var.f10729a;
        if (z10) {
            h1.e eVarZ = h0Var.z();
            Object[] objArr = eVarZ.f6421a;
            int i7 = eVarZ.f6423c;
            for (int i10 = 0; i10 < i7; i10++) {
                h0 h0Var2 = (h0) objArr[i10];
                l0 l0Var2 = h0Var2.F;
                if (l0Var2.f10733e && h0Var2.t() == f0.f10638a) {
                    u0 u0Var = l0Var2.f10744q;
                    i9.l.b(u0Var);
                    u0 u0Var2 = l0Var2.f10744q;
                    n3.a aVar = u0Var2 != null ? u0Var2.f10816m : null;
                    i9.l.b(aVar);
                    if (u0Var.l0(aVar.f8730a)) {
                        h0.T(h0Var, false, 7);
                    }
                }
            }
        }
        s sVar = f().P;
        i9.l.b(sVar);
        if (l0Var.f10735g || (!sVar.k && l0Var.f10734f)) {
            l0Var.f10734f = false;
            d0 d0Var = l0Var.f10732d;
            l0Var.f10732d = d0.f10609d;
            q1 q1VarA = k0.a(h0Var);
            l0Var.i(false);
            s1 snapshotObserver = ((r2.u) q1VarA).getSnapshotObserver();
            k2.d dVar = new k2.d(2, this, sVar);
            snapshotObserver.getClass();
            if (h0Var.f10673g != null) {
                snapshotObserver.a(h0Var, snapshotObserver.f10801h, dVar);
            } else {
                snapshotObserver.a(h0Var, snapshotObserver.f10798e, dVar);
            }
            l0Var.f10732d = d0Var;
            if (l0Var.f10740m && sVar.k) {
                requestLayout();
            }
            l0Var.f10735g = false;
        }
        if (i0Var.f10711b && i0Var.e()) {
            i0Var.g();
        }
        this.f10823t = false;
    }

    @Override // q2.a
    public final boolean B() {
        return this.f10819p != r0.f10790c;
    }

    @Override // q2.a
    public final void D(b2.a aVar) {
        h1.e eVarZ = this.f10810f.f10729a.z();
        Object[] objArr = eVarZ.f6421a;
        int i7 = eVarZ.f6423c;
        for (int i10 = 0; i10 < i7; i10++) {
            u0 u0Var = ((h0) objArr[i10]).F.f10744q;
            i9.l.b(u0Var);
            aVar.invoke(u0Var);
        }
    }

    @Override // q2.a
    public final void G() {
        h0.T(this.f10810f.f10729a, false, 7);
    }

    @Override // o2.l0
    public final int H(int i7) {
        g0();
        q0 q0VarE0 = this.f10810f.a().E0();
        i9.l.b(q0VarE0);
        return q0VarE0.H(i7);
    }

    @Override // o2.v0
    public final void T(long j5, float f10, h9.k kVar) throws Throwable {
        k0(j5, kVar);
    }

    public final void Y(boolean z10) {
        l0 l0Var = this.f10810f;
        if (z10 && l0Var.f10731c) {
            return;
        }
        if (z10 || l0Var.f10731c) {
            this.f10819p = r0.f10790c;
            h1.e eVarZ = l0Var.f10729a.z();
            Object[] objArr = eVarZ.f6421a;
            int i7 = eVarZ.f6423c;
            for (int i10 = 0; i10 < i7; i10++) {
                u0 u0Var = ((h0) objArr[i10]).F.f10744q;
                i9.l.b(u0Var);
                u0Var.Y(true);
            }
        }
    }

    @Override // q2.a
    public final i0 b() {
        return this.f10820q;
    }

    @Override // o2.l0
    public final int c(int i7) {
        g0();
        q0 q0VarE0 = this.f10810f.a().E0();
        i9.l.b(q0VarE0);
        return q0VarE0.c(i7);
    }

    public final void d0() {
        r0 r0Var = this.f10819p;
        l0 l0Var = this.f10810f;
        boolean z10 = l0Var.f10731c;
        h0 h0Var = l0Var.f10729a;
        r0 r0Var2 = r0.f10788a;
        if (z10) {
            this.f10819p = r0.f10789b;
        } else {
            this.f10819p = r0Var2;
        }
        if (r0Var != r0Var2 && l0Var.f10733e) {
            h0.T(h0Var, true, 6);
        }
        h1.e eVarZ = h0Var.z();
        Object[] objArr = eVarZ.f6421a;
        int i7 = eVarZ.f6423c;
        for (int i10 = 0; i10 < i7; i10++) {
            h0 h0Var2 = (h0) objArr[i10];
            u0 u0Var = h0Var2.F.f10744q;
            if (u0Var == null) {
                throw new IllegalArgumentException("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.");
            }
            if (u0Var.f10813i != Integer.MAX_VALUE) {
                u0Var.d0();
                h0.W(h0Var2);
            }
        }
    }

    @Override // q2.a
    public final t f() {
        return this.f10810f.f10729a.E.f10614c;
    }

    public final void f0() {
        l0 l0Var = this.f10810f;
        if (l0Var.f10742o > 0) {
            h1.e eVarZ = l0Var.f10729a.z();
            Object[] objArr = eVarZ.f6421a;
            int i7 = eVarZ.f6423c;
            for (int i10 = 0; i10 < i7; i10++) {
                h0 h0Var = (h0) objArr[i10];
                l0 l0Var2 = h0Var.F;
                if ((l0Var2.f10740m || l0Var2.f10741n) && !l0Var2.f10734f) {
                    h0Var.S(false);
                }
                u0 u0Var = l0Var2.f10744q;
                if (u0Var != null) {
                    u0Var.f0();
                }
            }
        }
    }

    public final void g0() {
        f0 f0Var;
        l0 l0Var = this.f10810f;
        h0.T(l0Var.f10729a, false, 7);
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

    @Override // q2.a
    public final a j() {
        l0 l0Var;
        h0 h0VarV = this.f10810f.f10729a.v();
        if (h0VarV == null || (l0Var = h0VarV.F) == null) {
            return null;
        }
        return l0Var.f10744q;
    }

    public final void j0() {
        d0 d0Var;
        this.f10826w = true;
        l0 l0Var = this.f10810f;
        h0 h0VarV = l0Var.f10729a.v();
        r0 r0Var = this.f10819p;
        if ((r0Var != r0.f10788a && !l0Var.f10731c) || (r0Var != r0.f10789b && l0Var.f10731c)) {
            d0();
            if (this.f10811g && h0VarV != null) {
                h0VarV.S(false);
            }
        }
        if (h0VarV != null) {
            l0 l0Var2 = h0VarV.F;
            if (!this.f10811g && ((d0Var = l0Var2.f10732d) == d0.f10608c || d0Var == d0.f10609d)) {
                if (this.f10813i != Integer.MAX_VALUE) {
                    n2.a.b("Place was called on a node which was placed already");
                }
                int i7 = l0Var2.f10736h;
                this.f10813i = i7;
                l0Var2.f10736h = i7 + 1;
            }
        } else {
            this.f10813i = 0;
        }
        A();
    }

    public final void k0(long j5, h9.k kVar) throws Throwable {
        l0 l0Var = this.f10810f;
        h0 h0Var = l0Var.f10729a;
        h0 h0Var2 = l0Var.f10729a;
        try {
            h0 h0VarV = h0Var.v();
            d0 d0Var = h0VarV != null ? h0VarV.F.f10732d : null;
            d0 d0Var2 = d0.f10609d;
            if (d0Var == d0Var2) {
                l0Var.f10731c = false;
            }
            if (h0Var2.P) {
                n2.a.a("place is called on a deactivated node");
            }
            l0Var.f10732d = d0Var2;
            this.k = true;
            this.f10826w = false;
            if (!n3.j.a(j5, this.f10817n)) {
                if (l0Var.f10741n || l0Var.f10740m) {
                    l0Var.f10734f = true;
                }
                f0();
            }
            q1 q1VarA = k0.a(h0Var2);
            if (l0Var.f10734f || !B()) {
                l0Var.h(false);
                this.f10820q.f10714e = false;
                s1 snapshotObserver = ((r2.u) q1VarA).getSnapshotObserver();
                t0 t0Var = new t0(this, q1VarA, j5);
                snapshotObserver.getClass();
                if (h0Var2.f10673g != null) {
                    snapshotObserver.a(h0Var2, snapshotObserver.f10800g, t0Var);
                } else {
                    snapshotObserver.a(h0Var2, snapshotObserver.f10799f, t0Var);
                }
            } else {
                q0 q0VarE0 = l0Var.a().E0();
                i9.l.b(q0VarE0);
                q0VarE0.x0(n3.j.c(j5, q0VarE0.f9439e));
                j0();
            }
            this.f10817n = j5;
            this.f10818o = kVar;
            l0Var.f10732d = d0.f10610e;
        } catch (Throwable th) {
            h0Var.Y(th);
            throw null;
        }
    }

    public final boolean l0(long j5) {
        long j10;
        l0 l0Var = this.f10810f;
        h0 h0Var = l0Var.f10729a;
        h0 h0Var2 = l0Var.f10729a;
        try {
            if (h0Var.P) {
                n2.a.a("measure is called on a deactivated node");
            }
            h0 h0VarV = h0Var2.v();
            h0Var2.D = h0Var2.D || (h0VarV != null && h0VarV.D);
            if (!h0Var2.F.f10733e) {
                n3.a aVar = this.f10816m;
                if (aVar == null ? false : n3.a.b(aVar.f8730a, j5)) {
                    q1 q1Var = h0Var2.f10678m;
                    if (q1Var != null) {
                        ((r2.u) q1Var).p(h0Var2, true);
                    }
                    h0Var2.X();
                    return false;
                }
            }
            this.f10816m = new n3.a(j5);
            X(j5);
            this.f10820q.f10713d = false;
            h1.e eVarZ = h0Var2.z();
            Object[] objArr = eVarZ.f6421a;
            int i7 = eVarZ.f6423c;
            for (int i10 = 0; i10 < i7; i10++) {
                u0 u0Var = ((h0) objArr[i10]).F.f10744q;
                i9.l.b(u0Var);
                u0Var.f10820q.getClass();
            }
            if (this.f10815l) {
                j10 = this.f9437c;
            } else {
                long j11 = Integer.MIN_VALUE;
                j10 = (j11 & 4294967295L) | (j11 << 32);
            }
            this.f10815l = true;
            q0 q0VarE0 = l0Var.a().E0();
            if (!(q0VarE0 != null)) {
                n2.a.b("Lookahead result from lookaheadRemeasure cannot be null");
            }
            l0Var.c(j5);
            U((((long) q0VarE0.f9436b) & 4294967295L) | (((long) q0VarE0.f9435a) << 32));
            return (((int) (j10 >> 32)) == q0VarE0.f9435a && ((int) (j10 & 4294967295L)) == q0VarE0.f9436b) ? false : true;
        } catch (Throwable th) {
            h0Var.Y(th);
            throw null;
        }
    }

    @Override // o2.l0
    public final int m(int i7) {
        g0();
        q0 q0VarE0 = this.f10810f.a().E0();
        i9.l.b(q0VarE0);
        return q0VarE0.m(i7);
    }

    @Override // o2.l0
    public final int r(int i7) {
        g0();
        q0 q0VarE0 = this.f10810f.a().E0();
        i9.l.b(q0VarE0);
        return q0VarE0.r(i7);
    }

    @Override // q2.a
    public final void requestLayout() {
        this.f10810f.f10729a.S(false);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0025  */
    @Override // o2.l0
    public final o2.v0 u(long j5) {
        f0 f0Var;
        l0 l0Var = this.f10810f;
        h0 h0VarV = l0Var.f10729a.v();
        if ((h0VarV != null ? h0VarV.F.f10732d : null) == d0.f10607b) {
            l0Var.f10730b = false;
        } else {
            h0 h0VarV2 = l0Var.f10729a.v();
            if ((h0VarV2 != null ? h0VarV2.F.f10732d : null) == d0.f10609d) {
                l0Var.f10730b = false;
            }
        }
        h0 h0Var = l0Var.f10729a;
        h0 h0VarV3 = h0Var.v();
        if (h0VarV3 != null) {
            l0 l0Var2 = h0VarV3.F;
            if (this.f10814j != f0.f10640c && !h0Var.D) {
                n2.a.b("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int iOrdinal = l0Var2.f10732d.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1) {
                f0Var = f0.f10638a;
            } else {
                if (iOrdinal != 2 && iOrdinal != 3) {
                    throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + l0Var2.f10732d);
                }
                f0Var = f0.f10639b;
            }
            this.f10814j = f0Var;
        } else {
            this.f10814j = f0.f10640c;
        }
        h0 h0Var2 = l0Var.f10729a;
        if (h0Var2.B == f0.f10640c) {
            h0Var2.e();
        }
        l0(j5);
        return this;
    }

    @Override // o2.v0, o2.l0
    public final Object w() {
        return this.f10825v;
    }

    @Override // q2.a1
    public final void z(boolean z10) {
        q0 q0VarE0;
        l0 l0Var = this.f10810f;
        q0 q0VarE1 = l0Var.a().E0();
        if (Boolean.valueOf(z10).equals(q0VarE1 != null ? Boolean.valueOf(q0VarE1.f10771i) : null) || (q0VarE0 = l0Var.a().E0()) == null) {
            return;
        }
        q0VarE0.f10771i = z10;
    }
}
