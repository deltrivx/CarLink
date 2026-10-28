package q2;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class q0 extends p0 implements o2.l0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final h1 f10779o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public LinkedHashMap f10781q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public o2.n0 f10783s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final s.c0 f10784t;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f10780p = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final o2.k0 f10782r = new o2.k0(this);

    public q0(h1 h1Var) {
        this.f10779o = h1Var;
        s.c0 c0Var = s.l0.f12469a;
        this.f10784t = new s.c0();
    }

    public static final void v0(q0 q0Var, o2.n0 n0Var) {
        LinkedHashMap linkedHashMap;
        if (n0Var != null) {
            q0Var.U((((long) n0Var.getHeight()) & 4294967295L) | (((long) n0Var.getWidth()) << 32));
        } else {
            q0Var.U(0L);
        }
        if (!i9.l.a(q0Var.f10783s, n0Var) && n0Var != null && ((((linkedHashMap = q0Var.f10781q) != null && !linkedHashMap.isEmpty()) || !n0Var.b().isEmpty()) && !i9.l.a(n0Var.b(), q0Var.f10781q))) {
            u0 u0Var = q0Var.f10779o.f10692o.F.f10744q;
            i9.l.b(u0Var);
            u0Var.f10820q.f();
            LinkedHashMap linkedHashMap2 = q0Var.f10781q;
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                q0Var.f10781q = linkedHashMap2;
            }
            linkedHashMap2.clear();
            linkedHashMap2.putAll(n0Var.b());
        }
        q0Var.f10783s = n0Var;
    }

    @Override // n3.c
    public final float O() {
        return this.f10779o.O();
    }

    @Override // q2.p0, o2.r
    public final boolean Q() {
        return true;
    }

    @Override // o2.v0
    public final void T(long j5, float f10, h9.k kVar) {
        x0(j5);
        if (this.f10772j) {
            return;
        }
        w0();
    }

    @Override // n3.c
    public final float a() {
        return this.f10779o.a();
    }

    @Override // o2.r
    public final n3.o getLayoutDirection() {
        return this.f10779o.f10692o.f10690y;
    }

    @Override // q2.p0
    public final p0 k0() {
        h1 h1Var = this.f10779o.f10693p;
        if (h1Var != null) {
            return h1Var.E0();
        }
        return null;
    }

    @Override // q2.p0
    public final o2.w l0() {
        return this.f10782r;
    }

    @Override // q2.p0
    public final boolean m0() {
        return this.f10783s != null;
    }

    @Override // q2.p0
    public final h0 n0() {
        return this.f10779o.f10692o;
    }

    @Override // q2.p0
    public final o2.n0 o0() {
        o2.n0 n0Var = this.f10783s;
        if (n0Var != null) {
            return n0Var;
        }
        throw ob.a.o("LookaheadDelegate has not been measured yet when measureResult is requested.");
    }

    @Override // q2.p0
    public final p0 p0() {
        h1 h1Var = this.f10779o.f10694q;
        if (h1Var != null) {
            return h1Var.E0();
        }
        return null;
    }

    @Override // q2.p0
    public final long q0() {
        return this.f10780p;
    }

    @Override // q2.p0
    public final void u0() {
        T(this.f10780p, 0.0f, null);
    }

    @Override // o2.v0, o2.l0
    public final Object w() {
        return this.f10779o.w();
    }

    public void w0() {
        o0().c();
    }

    public final void x0(long j5) {
        if (!n3.j.a(this.f10780p, j5)) {
            this.f10780p = j5;
            h1 h1Var = this.f10779o;
            u0 u0Var = h1Var.f10692o.F.f10744q;
            if (u0Var != null) {
                u0Var.f0();
            }
            p0.s0(h1Var);
        }
        if (this.k) {
            return;
        }
        g0(o0());
    }

    public final long y0(q0 q0Var, boolean z10) {
        long jC = 0;
        q0 q0VarE0 = this;
        while (!q0VarE0.equals(q0Var)) {
            if (!q0VarE0.f10771i || !z10) {
                jC = n3.j.c(jC, q0VarE0.f10780p);
            }
            h1 h1Var = q0VarE0.f10779o.f10694q;
            i9.l.b(h1Var);
            q0VarE0 = h1Var.E0();
            i9.l.b(q0VarE0);
        }
        return jC;
    }
}
