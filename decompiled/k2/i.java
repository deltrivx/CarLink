package k2;

import b3.q0;
import java.util.List;
import l0.u0;
import w0.t1;
import x9.r0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class i implements w0.n, ob.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f7218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f7219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f7220c;

    public i(s.q qVar, android.support.v4.media.session.r rVar) {
        this.f7219b = qVar;
        this.f7220c = rVar;
    }

    public i(t1 t1Var) {
        this.f7220c = t1Var;
        this.f7218a = true;
    }

    public i(x9.b bVar, x9.b bVar2, boolean z10) {
        this.f7218a = z10;
        this.f7219b = bVar;
        this.f7220c = bVar2;
    }

    @Override // w0.n
    public void a() {
        if (this.f7218a) {
            t1.a((t1) this.f7220c, (q0) this.f7219b);
        }
    }

    @Override // ob.d
    public boolean b(nb.k0 k0Var, nb.k0 k0Var2) {
        boolean z10 = this.f7218a;
        x9.b bVar = (x9.b) this.f7219b;
        x9.b bVar2 = (x9.b) this.f7220c;
        i9.l.e(k0Var, "c1");
        i9.l.e(k0Var2, "c2");
        if (k0Var.equals(k0Var2)) {
            return true;
        }
        x9.h hVarL = k0Var.l();
        x9.h hVarL2 = k0Var2.l();
        if (!(hVarL instanceof r0) || !(hVarL2 instanceof r0)) {
            return false;
        }
        a8.k0 k0Var3 = new a8.k0(25, bVar, bVar2);
        return za.b.f15790a.d((r0) hVarL, (r0) hVarL2, z10, k0Var3);
    }

    @Override // w0.n
    public boolean c(long j5, w0.a0 a0Var) {
        u0 u0Var;
        t1 t1Var = (t1) this.f7220c;
        if (!t1Var.j() || t1Var.m().f5889a.f1353b.length() == 0 || (u0Var = t1Var.f13942d) == null || u0Var.d() == null) {
            return false;
        }
        f(t1Var.m(), j5, false, a0Var);
        return true;
    }

    @Override // w0.n
    public boolean d(long j5, w0.a0 a0Var, int i7) {
        u0 u0Var;
        t1 t1Var = (t1) this.f7220c;
        if (!t1Var.j() || t1Var.m().f5889a.f1353b.length() == 0 || (u0Var = t1Var.f13942d) == null || u0Var.d() == null) {
            return false;
        }
        w1.o oVar = t1Var.k;
        if (oVar != null) {
            w1.o.b(oVar);
        }
        t1Var.f13951n = j5;
        t1Var.f13956s = -1;
        t1Var.h(true);
        long jF = f(t1Var.m(), t1Var.f13951n, true, a0Var);
        if (i7 >= 2) {
            this.f7218a = true;
            this.f7219b = new q0(jF);
        }
        return true;
    }

    public boolean e(long j5) {
        Object obj;
        List list = (List) ((android.support.v4.media.session.r) this.f7220c).f604b;
        int size = list.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i7);
            if (u.d(((x) obj).f7295a, j5)) {
                break;
            }
            i7++;
        }
        x xVar = (x) obj;
        if (xVar != null) {
            return xVar.f7302h;
        }
        return false;
    }

    public long f(g3.w wVar, long j5, boolean z10, w0.a0 a0Var) {
        t1 t1Var = (t1) this.f7220c;
        long jC = t1.c(t1Var, wVar, j5, z10, false, a0Var, false);
        if (!q0.a(jC, (q0) this.f7219b)) {
            this.f7218a = false;
        }
        t1Var.p(q0.c(jC) ? l0.i0.f7680c : l0.i0.f7679b);
        return jC;
    }
}
