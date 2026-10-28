package x;

import android.view.View;
import q2.y1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class t0 extends r1.o implements q2.p, q2.o, y1, q2.l1 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public h9.k f14477o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public h9.k f14478p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public f1 f14479q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public View f14480r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public n3.c f14481s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public e1 f14482t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public f1.f0 f14484v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public n3.m f14486x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ec.h f14487y;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final f1.k1 f14483u = new f1.k1(null, f1.w0.f5184c);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f14485w = 9205357640488583168L;

    public t0(h9.k kVar, h9.k kVar2, f1 f1Var) {
        this.f14477o = kVar;
        this.f14478p = kVar2;
        this.f14479q = f1Var;
    }

    public final long A0() {
        if (this.f14484v == null) {
            this.f14484v = f1.b.o(new s0(this, 2));
        }
        f1.f0 f0Var = this.f14484v;
        if (f0Var != null) {
            return ((x1.b) f0Var.getValue()).f14521a;
        }
        return 9205357640488583168L;
    }

    @Override // q2.y1
    public final /* synthetic */ boolean B() {
        return false;
    }

    public final void B0() {
        e1 e1Var = this.f14482t;
        if (e1Var != null) {
            ((g1) e1Var).b();
        }
        View viewX = this.f14480r;
        if (viewX == null) {
            viewX = q2.f.x(this);
        }
        this.f14480r = viewX;
        n3.c cVar = this.f14481s;
        if (cVar == null) {
            cVar = q2.f.v(this).f10689x;
        }
        this.f14481s = cVar;
        this.f14482t = this.f14479q.a(viewX, cVar);
        D0();
    }

    public final void C0() {
        n3.c cVar = this.f14481s;
        if (cVar == null) {
            cVar = q2.f.v(this).f10689x;
            this.f14481s = cVar;
        }
        long j5 = ((x1.b) this.f14477o.invoke(cVar)).f14521a;
        if ((j5 & 9223372034707292159L) == 9205357640488583168L || (9223372034707292159L & A0()) == 9205357640488583168L) {
            this.f14485w = 9205357640488583168L;
            e1 e1Var = this.f14482t;
            if (e1Var != null) {
                ((g1) e1Var).b();
                return;
            }
            return;
        }
        this.f14485w = x1.b.h(A0(), j5);
        if (this.f14482t == null) {
            B0();
        }
        e1 e1Var2 = this.f14482t;
        if (e1Var2 != null) {
            e1Var2.a(this.f14485w, 9205357640488583168L);
        }
        D0();
    }

    public final void D0() {
        n3.c cVar;
        e1 e1Var = this.f14482t;
        if (e1Var == null || (cVar = this.f14481s) == null) {
            return;
        }
        g1 g1Var = (g1) e1Var;
        long jC = g1Var.c();
        n3.m mVar = this.f14486x;
        if (ob.a.A(mVar) && jC == mVar.f8746a) {
            return;
        }
        this.f14478p.invoke(new n3.h(cVar.o(n3.n.M0(g1Var.c()))));
        this.f14486x = new n3.m(g1Var.c());
    }

    @Override // q2.o
    public final /* synthetic */ void H() {
    }

    @Override // q2.p
    public final void U(q2.h1 h1Var) {
        this.f14483u.setValue(h1Var);
    }

    @Override // q2.l1
    public final void X() {
        q2.f.r(this, new s0(this, 0));
    }

    @Override // q2.y1
    public final void Y(y2.j jVar) {
        jVar.n(u0.f14488a, new s0(this, 1));
    }

    @Override // q2.y1
    public final /* synthetic */ boolean h() {
        return true;
    }

    @Override // q2.y1
    public final /* synthetic */ boolean j0() {
        return false;
    }

    @Override // r1.o
    public final void q0() {
        X();
        this.f14487y = i2.c.c(0, 7, null);
        cc.b0.s(m0(), null, new a8.c1(this, null, 27), 1);
    }

    @Override // r1.o
    public final void s0() {
        e1 e1Var = this.f14482t;
        if (e1Var != null) {
            ((g1) e1Var).b();
        }
        this.f14482t = null;
    }

    @Override // q2.o
    public final void x(q2.j0 j0Var) {
        j0Var.b();
        ec.h hVar = this.f14487y;
        if (hVar != null) {
            hVar.x(t8.z.f12851a);
        }
    }
}
