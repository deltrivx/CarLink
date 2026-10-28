package cc;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class f1 extends e1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h1 f2615e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g1 f2616f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p f2617g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f2618h;

    public f1(h1 h1Var, g1 g1Var, p pVar, Object obj) {
        this.f2615e = h1Var;
        this.f2616f = g1Var;
        this.f2617g = pVar;
        this.f2618h = obj;
    }

    @Override // cc.e1
    public final boolean k() {
        return false;
    }

    @Override // cc.e1
    public final void l(Throwable th) {
        p pVar = this.f2617g;
        p pVarU = h1.U(pVar);
        h1 h1Var = this.f2615e;
        g1 g1Var = this.f2616f;
        Object obj = this.f2618h;
        if (pVarU == null || !h1Var.d0(g1Var, pVarU, obj)) {
            g1Var.f2623a.e(new hc.h(2), 2);
            p pVarU2 = h1.U(pVar);
            if (pVarU2 == null || !h1Var.d0(g1Var, pVarU2, obj)) {
                h1Var.y(h1Var.I(g1Var, obj));
            }
        }
    }
}
