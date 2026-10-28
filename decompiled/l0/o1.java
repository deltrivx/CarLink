package l0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class o1 implements z.n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z.n1 f7773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f1.f0 f7774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f1.f0 f7775c;

    public o1(z.n1 n1Var, final q1 q1Var) {
        this.f7773a = n1Var;
        final int i7 = 0;
        this.f7774b = f1.b.o(new h9.a() { // from class: l0.n1
            @Override // h9.a
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        q1 q1Var2 = q1Var;
                        return Boolean.valueOf(q1Var2.f7803a.f() < q1Var2.f7804b.f());
                    default:
                        return Boolean.valueOf(q1Var.f7803a.f() > 0.0f);
                }
            }
        });
        final int i10 = 1;
        this.f7775c = f1.b.o(new h9.a() { // from class: l0.n1
            @Override // h9.a
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        q1 q1Var2 = q1Var;
                        return Boolean.valueOf(q1Var2.f7803a.f() < q1Var2.f7804b.f());
                    default:
                        return Boolean.valueOf(q1Var.f7803a.f() > 0.0f);
                }
            }
        });
    }

    @Override // z.n1
    public final boolean a() {
        return this.f7773a.a();
    }

    @Override // z.n1
    public final boolean b() {
        return ((Boolean) this.f7775c.getValue()).booleanValue();
    }

    @Override // z.n1
    public final Object c(x.v0 v0Var, h9.n nVar, a9.c cVar) {
        return this.f7773a.c(v0Var, nVar, cVar);
    }

    @Override // z.n1
    public final boolean d() {
        return ((Boolean) this.f7774b.getValue()).booleanValue();
    }

    @Override // z.n1
    public final float e(float f10) {
        return this.f7773a.e(f10);
    }
}
