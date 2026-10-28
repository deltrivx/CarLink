package x;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class p1 extends q2.m implements q2.k, q2.l1 {
    public h A;
    public boolean B;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public z.n1 f14459q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public z.x0 f14460r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f14461s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public z.h f14462t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public b0.k f14463u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f14464v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public h f14465w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public z.m1 f14466x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public q2.l f14467y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public i f14468z;

    public final void D0() {
        q2.l lVar = this.f14467y;
        if (lVar != null) {
            if (((r1.o) lVar).f11117a.f11129n) {
                return;
            }
            A0(lVar);
            return;
        }
        if (this.f14464v) {
            q2.f.r(this, new v0.p(2, this));
        }
        h hVar = this.f14464v ? this.A : this.f14465w;
        if (hVar != null) {
            q2.m mVar = hVar.f14379i;
            if (mVar.f11117a.f11129n) {
                return;
            }
            A0(mVar);
            this.f14467y = mVar;
        }
    }

    public final boolean E0() {
        return (this.f11129n ? q2.f.v(this).f10690y : n3.o.f8749a) != n3.o.f8750b || this.f14460r == z.x0.f15591a;
    }

    public final void F0(b0.k kVar, h hVar, z.h hVar2, z.x0 x0Var, z.n1 n1Var, boolean z10, boolean z11) {
        boolean z12;
        this.f14459q = n1Var;
        this.f14460r = x0Var;
        boolean z13 = true;
        if (this.f14464v != z10) {
            this.f14464v = z10;
            z12 = true;
        } else {
            z12 = false;
        }
        if (i9.l.a(this.f14465w, hVar)) {
            z13 = false;
        } else {
            this.f14465w = hVar;
        }
        if (z12 || (z13 && !z10)) {
            q2.l lVar = this.f14467y;
            if (lVar != null) {
                B0(lVar);
            }
            this.f14467y = null;
            D0();
        }
        this.f14461s = z11;
        this.f14462t = hVar2;
        this.f14463u = kVar;
        boolean zE0 = E0();
        this.B = zE0;
        z.m1 m1Var = this.f14466x;
        if (m1Var != null) {
            m1Var.M0(kVar, this.f14464v ? this.A : this.f14465w, hVar2, x0Var, n1Var, z11, zE0);
        }
    }

    @Override // q2.l1
    public final void X() {
        i iVar = (i) q2.f.i(this, d1.f14344a);
        if (i9.l.a(iVar, this.f14468z)) {
            return;
        }
        this.f14468z = iVar;
        this.A = null;
        q2.l lVar = this.f14467y;
        if (lVar != null) {
            B0(lVar);
        }
        this.f14467y = null;
        D0();
        z.m1 m1Var = this.f14466x;
        if (m1Var != null) {
            z.n1 n1Var = this.f14459q;
            z.x0 x0Var = this.f14460r;
            h hVar = this.f14464v ? this.A : this.f14465w;
            m1Var.M0(this.f14463u, hVar, this.f14462t, x0Var, n1Var, this.f14461s, this.B);
        }
    }

    @Override // r1.o
    public final boolean n0() {
        return false;
    }

    @Override // r1.o
    public final void q0() {
        this.B = E0();
        D0();
        if (this.f14466x == null) {
            z.n1 n1Var = this.f14459q;
            z.m1 m1Var = new z.m1(this.f14463u, this.f14464v ? this.A : this.f14465w, this.f14462t, this.f14460r, n1Var, this.f14461s, this.B);
            A0(m1Var);
            this.f14466x = m1Var;
        }
    }

    @Override // r1.o
    public final void s0() {
        q2.l lVar = this.f14467y;
        if (lVar != null) {
            B0(lVar);
        }
    }

    @Override // r1.o
    public final void t0() {
        boolean zE0 = E0();
        if (this.B != zE0) {
            this.B = zE0;
            z.n1 n1Var = this.f14459q;
            z.x0 x0Var = this.f14460r;
            boolean z10 = this.f14464v;
            h hVar = z10 ? this.A : this.f14465w;
            F0(this.f14463u, hVar, this.f14462t, x0Var, n1Var, z10, this.f14461s);
        }
    }
}
