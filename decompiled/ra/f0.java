package ra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends xa.j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f11934d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public n0 f11935e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public m0 f11936f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public e0 f11937g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List f11938h;

    public static f0 f() {
        f0 f0Var = new f0();
        f0Var.f11935e = n0.f12103e;
        f0Var.f11936f = m0.f12088e;
        f0Var.f11937g = e0.k;
        f0Var.f11938h = Collections.EMPTY_LIST;
        return f0Var;
    }

    @Override // xa.i
    public final xa.a a() {
        g0 g0VarE = e();
        if (g0VarE.isInitialized()) {
            return g0VarE;
        }
        throw new cc.s();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // xa.i
    public final xa.i b(xa.e eVar, xa.g gVar) throws Throwable {
        g0 g0Var = null;
        try {
            try {
                g0.k.getClass();
                g(new g0(eVar, gVar));
                return this;
            } catch (xa.q e7) {
                g0 g0Var2 = (g0) e7.f14823a;
                try {
                    throw e7;
                } catch (Throwable th) {
                    th = th;
                    g0Var = g0Var2;
                    if (g0Var != null) {
                        g(g0Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (g0Var != null) {
                g(g0Var);
            }
            throw th;
        }
    }

    @Override // xa.i
    public final /* bridge */ /* synthetic */ xa.i c(xa.n nVar) {
        g((g0) nVar);
        return this;
    }

    public final Object clone() {
        f0 f0VarF = f();
        f0VarF.g(e());
        return f0VarF;
    }

    public final g0 e() {
        g0 g0Var = new g0(this);
        int i7 = this.f11934d;
        int i10 = (i7 & 1) != 1 ? 0 : 1;
        g0Var.f11952d = this.f11935e;
        if ((i7 & 2) == 2) {
            i10 |= 2;
        }
        g0Var.f11953e = this.f11936f;
        if ((i7 & 4) == 4) {
            i10 |= 4;
        }
        g0Var.f11954f = this.f11937g;
        if ((i7 & 8) == 8) {
            this.f11938h = Collections.unmodifiableList(this.f11938h);
            this.f11934d &= -9;
        }
        g0Var.f11955g = this.f11938h;
        g0Var.f11951c = i10;
        return g0Var;
    }

    public final void g(g0 g0Var) {
        e0 e0Var;
        m0 m0Var;
        n0 n0Var;
        if (g0Var == g0.f11949j) {
            return;
        }
        if ((g0Var.f11951c & 1) == 1) {
            n0 n0Var2 = g0Var.f11952d;
            if ((this.f11934d & 1) != 1 || (n0Var = this.f11935e) == n0.f12103e) {
                this.f11935e = n0Var2;
            } else {
                o oVar = new o(3);
                oVar.f12111d = xa.r.f14824b;
                oVar.j(n0Var);
                oVar.j(n0Var2);
                this.f11935e = oVar.f();
            }
            this.f11934d |= 1;
        }
        if ((g0Var.f11951c & 2) == 2) {
            m0 m0Var2 = g0Var.f11953e;
            if ((this.f11934d & 2) != 2 || (m0Var = this.f11936f) == m0.f12088e) {
                this.f11936f = m0Var2;
            } else {
                o oVar2 = new o(1);
                oVar2.f12111d = Collections.EMPTY_LIST;
                oVar2.i(m0Var);
                oVar2.i(m0Var2);
                this.f11936f = oVar2.e();
            }
            this.f11934d |= 2;
        }
        if ((g0Var.f11951c & 4) == 4) {
            e0 e0Var2 = g0Var.f11954f;
            if ((this.f11934d & 4) != 4 || (e0Var = this.f11937g) == e0.k) {
                this.f11937g = e0Var2;
            } else {
                d0 d0VarF = d0.f();
                d0VarF.g(e0Var);
                d0VarF.g(e0Var2);
                this.f11937g = d0VarF.e();
            }
            this.f11934d |= 4;
        }
        if (!g0Var.f11955g.isEmpty()) {
            if (this.f11938h.isEmpty()) {
                this.f11938h = g0Var.f11955g;
                this.f11934d &= -9;
            } else {
                if ((this.f11934d & 8) != 8) {
                    this.f11938h = new ArrayList(this.f11938h);
                    this.f11934d |= 8;
                }
                this.f11938h.addAll(g0Var.f11955g);
            }
        }
        d(g0Var);
        this.f14792a = this.f14792a.d(g0Var.f11950b);
    }
}
