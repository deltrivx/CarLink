package l0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class p1 implements h9.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q1 f7780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f7781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b0.k f7782c;

    public p1(q1 q1Var, boolean z10, b0.k kVar) {
        this.f7780a = q1Var;
        this.f7781b = z10;
        this.f7782c = kVar;
    }

    @Override // h9.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        f1.s sVar = (f1.s) obj2;
        ((Number) obj3).intValue();
        q1 q1Var = this.f7780a;
        f1.k1 k1Var = q1Var.f7808f;
        sVar.W(805428266);
        boolean z10 = ((z.x0) k1Var.getValue()) == z.x0.f15591a || !(sVar.j(r2.j1.f11281n) == n3.o.f8750b);
        boolean zF = sVar.f(q1Var);
        Object objK = sVar.K();
        f1.w0 w0Var = f1.n.f5051a;
        if (zF || objK == w0Var) {
            objK = new c8.k(18, q1Var);
            sVar.h0(objK);
        }
        f1.b1 b1VarV = f1.b.v((h9.k) objK, sVar);
        Object objK2 = sVar.K();
        if (objK2 == w0Var) {
            z.j jVar = new z.j(new f8.h(b1VarV, 8));
            sVar.h0(jVar);
            objK2 = jVar;
        }
        z.n1 n1Var = (z.n1) objK2;
        boolean zF2 = sVar.f(n1Var) | sVar.f(q1Var);
        Object objK3 = sVar.K();
        if (zF2 || objK3 == w0Var) {
            objK3 = new o1(n1Var, q1Var);
            sVar.h0(objK3);
        }
        r1.p pVarB = androidx.compose.foundation.gestures.a.b((o1) objK3, (z.x0) k1Var.getValue(), this.f7781b && q1Var.f7804b.f() != 0.0f, z10, this.f7782c);
        sVar.p(false);
        return pVarB;
    }
}
