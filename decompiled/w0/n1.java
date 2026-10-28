package w0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class n1 implements l0.b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t1 f13861a;

    public n1(t1 t1Var) {
        this.f13861a = t1Var;
    }

    @Override // l0.b1
    public final void a(long j5) {
        l0.s1 s1VarD;
        t1 t1Var = this.f13861a;
        long jA = o0.a(t1Var.k(true));
        l0.u0 u0Var = t1Var.f13942d;
        if (u0Var == null || (s1VarD = u0Var.d()) == null) {
            return;
        }
        long jE = s1VarD.e(jA);
        t1Var.f13951n = jE;
        t1Var.f13955r.setValue(new x1.b(jE));
        t1Var.f13953p = 0L;
        t1Var.f13954q.setValue(l0.h0.f7651a);
        t1Var.s(false);
    }

    @Override // l0.b1
    public final void b() {
        t1 t1Var = this.f13861a;
        t1Var.f13954q.setValue(null);
        t1Var.f13955r.setValue(null);
    }

    @Override // l0.b1
    public final void c() {
        t1 t1Var = this.f13861a;
        t1Var.f13954q.setValue(null);
        t1Var.f13955r.setValue(null);
    }

    @Override // l0.b1
    public final void d() {
    }

    @Override // l0.b1
    public final void e(long j5) {
        l0.s1 s1VarD;
        g2.a aVar;
        t1 t1Var = this.f13861a;
        t1Var.f13953p = x1.b.h(t1Var.f13953p, j5);
        l0.u0 u0Var = t1Var.f13942d;
        if (u0Var == null || (s1VarD = u0Var.d()) == null) {
            return;
        }
        t1Var.f13955r.setValue(new x1.b(x1.b.h(t1Var.f13951n, t1Var.f13953p)));
        g3.q qVar = t1Var.f13940b;
        x1.b bVarI = t1Var.i();
        i9.l.b(bVarI);
        int iA = qVar.a(s1VarD.b(bVarI.f14521a, true));
        long jB = b3.g0.b(iA, iA);
        if (b3.q0.b(jB, t1Var.m().f5890b)) {
            return;
        }
        l0.u0 u0Var2 = t1Var.f13942d;
        if ((u0Var2 == null || ((Boolean) u0Var2.f7863q.getValue()).booleanValue()) && (aVar = t1Var.f13948j) != null) {
            aVar.a(9);
        }
        t1Var.f13941c.invoke(t1.e(t1Var.m().f5889a, jB));
        t1Var.f13959v = new b3.q0(jB);
    }

    @Override // l0.b1
    public final void onCancel() {
    }
}
