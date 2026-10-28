package r9;

/* JADX INFO: loaded from: classes.dex */
public final class j1 implements h9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k1 f11700b;

    public /* synthetic */ j1(k1 k1Var, int i7) {
        this.f11699a = i7;
        this.f11700b = k1Var;
    }

    @Override // h9.a
    public final Object invoke() {
        switch (this.f11699a) {
            case 0:
                k1 k1Var = this.f11700b;
                aa.r0 r0VarC = k1Var.p().j().c();
                return r0VarC == null ? za.k.g(k1Var.p().j(), y9.g.f15129a) : r0VarC;
            default:
                return n3.u.f(this.f11700b, false);
        }
    }
}
