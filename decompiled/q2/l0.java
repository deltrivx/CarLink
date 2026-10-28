package q2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f10729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f10730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f10731c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f10733e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f10734f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f10735g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f10736h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f10737i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f10738j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f10739l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f10740m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f10741n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f10742o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public u0 f10744q;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d0 f10732d = d0.f10610e;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y0 f10743p = new y0(this);

    public l0(h0 h0Var) {
        this.f10729a = h0Var;
    }

    public final h1 a() {
        return this.f10729a.E.f10615d;
    }

    public final void b() {
        d0 d0Var = this.f10729a.F.f10732d;
        d0 d0Var2 = d0.f10608c;
        d0 d0Var3 = d0.f10609d;
        if (d0Var == d0Var2 || d0Var == d0Var3) {
            if (this.f10743p.f10868z) {
                g(true);
            } else {
                f(true);
            }
        }
        if (d0Var == d0Var3) {
            u0 u0Var = this.f10744q;
            if (u0Var == null || !u0Var.f10823t) {
                h(true);
            } else {
                i(true);
            }
        }
    }

    public final void c(long j5) {
        u0 u0Var = this.f10744q;
        if (u0Var != null) {
            l0 l0Var = u0Var.f10810f;
            l0Var.f10732d = d0.f10607b;
            y0 y0Var = l0Var.f10743p;
            h0 h0Var = l0Var.f10729a;
            l0Var.f10733e = false;
            s1 snapshotObserver = ((r2.u) k0.a(h0Var)).getSnapshotObserver();
            s0 s0Var = new s0(u0Var, j5);
            snapshotObserver.getClass();
            if (h0Var.f10673g != null) {
                snapshotObserver.a(h0Var, snapshotObserver.f10795b, s0Var);
            } else {
                snapshotObserver.a(h0Var, snapshotObserver.f10796c, s0Var);
            }
            l0Var.f10734f = true;
            l0Var.f10735g = true;
            if (f.q(h0Var)) {
                y0Var.f10863u = true;
                y0Var.f10864v = true;
            } else {
                y0Var.f10862t = true;
            }
            l0Var.f10732d = d0.f10610e;
        }
    }

    public final void d(int i7) {
        int i10 = this.f10739l;
        this.f10739l = i7;
        if ((i10 == 0) != (i7 == 0)) {
            h0 h0VarV = this.f10729a.v();
            l0 l0Var = h0VarV != null ? h0VarV.F : null;
            if (l0Var != null) {
                if (i7 == 0) {
                    l0Var.d(l0Var.f10739l - 1);
                } else {
                    l0Var.d(l0Var.f10739l + 1);
                }
            }
        }
    }

    public final void e(int i7) {
        int i10 = this.f10742o;
        this.f10742o = i7;
        if ((i10 == 0) != (i7 == 0)) {
            h0 h0VarV = this.f10729a.v();
            l0 l0Var = h0VarV != null ? h0VarV.F : null;
            if (l0Var != null) {
                if (i7 == 0) {
                    l0Var.e(l0Var.f10742o - 1);
                } else {
                    l0Var.e(l0Var.f10742o + 1);
                }
            }
        }
    }

    public final void f(boolean z10) {
        if (this.k != z10) {
            this.k = z10;
            if (z10 && !this.f10738j) {
                d(this.f10739l + 1);
            } else {
                if (z10 || this.f10738j) {
                    return;
                }
                d(this.f10739l - 1);
            }
        }
    }

    public final void g(boolean z10) {
        if (this.f10738j != z10) {
            this.f10738j = z10;
            if (z10 && !this.k) {
                d(this.f10739l + 1);
            } else {
                if (z10 || this.k) {
                    return;
                }
                d(this.f10739l - 1);
            }
        }
    }

    public final void h(boolean z10) {
        if (this.f10741n != z10) {
            this.f10741n = z10;
            if (z10 && !this.f10740m) {
                e(this.f10742o + 1);
            } else {
                if (z10 || this.f10740m) {
                    return;
                }
                e(this.f10742o - 1);
            }
        }
    }

    public final void i(boolean z10) {
        if (this.f10740m != z10) {
            this.f10740m = z10;
            if (z10 && !this.f10741n) {
                e(this.f10742o + 1);
            } else {
                if (z10 || this.f10741n) {
                    return;
                }
                e(this.f10742o - 1);
            }
        }
    }

    public final void j() {
        y0 y0Var = this.f10743p;
        l0 l0Var = y0Var.f10849f;
        Object obj = y0Var.f10859q;
        h0 h0Var = this.f10729a;
        if ((obj != null || l0Var.a().w() != null) && y0Var.f10858p) {
            y0Var.f10858p = false;
            y0Var.f10859q = l0Var.a().w();
            h0 h0VarV = h0Var.v();
            if (h0VarV != null) {
                h0.V(h0VarV, false, 7);
            }
        }
        u0 u0Var = this.f10744q;
        if (u0Var != null) {
            l0 l0Var2 = u0Var.f10810f;
            if (u0Var.f10825v == null) {
                q0 q0VarE0 = l0Var2.a().E0();
                i9.l.b(q0VarE0);
                if (q0VarE0.f10779o.w() == null) {
                    return;
                }
            }
            if (u0Var.f10824u) {
                u0Var.f10824u = false;
                q0 q0VarE1 = l0Var2.a().E0();
                i9.l.b(q0VarE1);
                u0Var.f10825v = q0VarE1.f10779o.w();
                if (f.q(h0Var)) {
                    h0 h0VarV2 = h0Var.v();
                    if (h0VarV2 != null) {
                        h0.V(h0VarV2, false, 7);
                        return;
                    }
                    return;
                }
                h0 h0VarV3 = h0Var.v();
                if (h0VarV3 != null) {
                    h0.T(h0VarV3, false, 7);
                }
            }
        }
    }
}
