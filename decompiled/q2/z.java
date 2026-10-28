package q2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class z extends h1 {
    public static final f7.q Q;
    public x O;
    public y P;

    static {
        f7.q qVarH = y1.h0.h();
        qVarH.k(y1.q.f14954h);
        qVarH.q(1.0f);
        qVarH.r(1);
        Q = qVarH;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public z(h0 h0Var, x xVar) {
        super(h0Var);
        this.O = xVar;
        this.P = h0Var.f10673g != null ? new y(this) : null;
        if ((((r1.o) xVar).f11117a.f11119c & 512) != 0) {
            throw new ClassCastException();
        }
    }

    @Override // q2.h1
    public final void B0() {
        if (this.P == null) {
            this.P = new y(this);
        }
    }

    @Override // q2.h1
    public final q0 E0() {
        return this.P;
    }

    @Override // q2.h1
    public final r1.o G0() {
        return ((r1.o) this.O).f11117a;
    }

    @Override // o2.l0
    public final int H(int i7) {
        x xVar = this.O;
        h1 h1Var = this.f10693p;
        i9.l.b(h1Var);
        return xVar.d(this, h1Var, i7);
    }

    @Override // o2.v0
    public final void T(long j5, float f10, h9.k kVar) {
        V0(j5, f10, kVar);
        if (this.f10772j) {
            return;
        }
        S0();
        o0().c();
        i9.l.b(this.f10693p);
    }

    @Override // q2.h1
    public final void U0(y1.o oVar, b2.c cVar) {
        h1 h1Var;
        h1 h1Var2 = this.f10693p;
        i9.l.b(h1Var2);
        h1Var2.z0(oVar, cVar);
        if (!((r2.u) k0.a(this.f10692o)).getShowLayoutBounds() || (h1Var = this.f10693p) == null) {
            return;
        }
        if (n3.m.a(this.f9437c, h1Var.f9437c) && n3.j.a(h1Var.f10703z, 0L)) {
            return;
        }
        long j5 = this.f9437c;
        oVar.d(0.5f, 0.5f, ((int) (j5 >> 32)) - 0.5f, ((int) (j5 & 4294967295L)) - 0.5f, Q);
    }

    @Override // o2.l0
    public final int c(int i7) {
        x xVar = this.O;
        h1 h1Var = this.f10693p;
        i9.l.b(h1Var);
        return xVar.e(this, h1Var, i7);
    }

    @Override // q2.p0
    public final int d0(o2.m mVar) {
        y yVar = this.P;
        if (yVar == null) {
            return f.c(this, mVar);
        }
        s.c0 c0Var = yVar.f10784t;
        int iD = c0Var.d(mVar);
        if (iD >= 0) {
            return c0Var.f12399c[iD];
        }
        return Integer.MIN_VALUE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g1(x xVar) {
        if (!xVar.equals(this.O) && (((r1.o) xVar).f11117a.f11119c & 512) != 0) {
            throw new ClassCastException();
        }
        this.O = xVar;
    }

    @Override // o2.l0
    public final int m(int i7) {
        x xVar = this.O;
        h1 h1Var = this.f10693p;
        i9.l.b(h1Var);
        return xVar.c(this, h1Var, i7);
    }

    @Override // o2.l0
    public final int r(int i7) {
        x xVar = this.O;
        h1 h1Var = this.f10693p;
        i9.l.b(h1Var);
        return xVar.f(this, h1Var, i7);
    }

    @Override // o2.l0
    public final o2.v0 u(long j5) {
        X(j5);
        x xVar = this.O;
        h1 h1Var = this.f10693p;
        i9.l.b(h1Var);
        Y0(xVar.b(this, h1Var, j5));
        R0();
        return this;
    }
}
