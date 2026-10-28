package c;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class i0 implements androidx.lifecycle.r, c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.lifecycle.v f1730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m0 f1731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public j0 f1732c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l0 f1733d;

    public i0(l0 l0Var, androidx.lifecycle.v vVar, m0 m0Var) {
        i9.l.e(m0Var, "onBackPressedCallback");
        this.f1733d = l0Var;
        this.f1730a = vVar;
        this.f1731b = m0Var;
        vVar.a(this);
    }

    @Override // androidx.lifecycle.r
    public final void c(androidx.lifecycle.t tVar, androidx.lifecycle.n nVar) {
        if (nVar != androidx.lifecycle.n.ON_START) {
            if (nVar != androidx.lifecycle.n.ON_STOP) {
                if (nVar == androidx.lifecycle.n.ON_DESTROY) {
                    cancel();
                    return;
                }
                return;
            } else {
                j0 j0Var = this.f1732c;
                if (j0Var != null) {
                    j0Var.cancel();
                    return;
                }
                return;
            }
        }
        m0 m0Var = this.f1731b;
        i9.l.e(m0Var, "onBackPressedCallback");
        l0 l0Var = this.f1733d;
        l0Var.f1754b.addLast(m0Var);
        j0 j0Var2 = new j0(l0Var, m0Var);
        m0Var.f1763b.add(j0Var2);
        l0Var.e();
        m0Var.f1764c = new k0(0, l0Var, l0.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 0, 1);
        this.f1732c = j0Var2;
    }

    @Override // c.c
    public final void cancel() {
        this.f1730a.f(this);
        this.f1731b.f1763b.remove(this);
        j0 j0Var = this.f1732c;
        if (j0Var != null) {
            j0Var.cancel();
        }
        this.f1732c = null;
    }
}
