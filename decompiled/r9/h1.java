package r9;

/* JADX INFO: loaded from: classes.dex */
public final class h1 implements h9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i1 f11691b;

    public /* synthetic */ h1(i1 i1Var, int i7) {
        this.f11690a = i7;
        this.f11691b = i1Var;
    }

    @Override // h9.a
    public final Object invoke() {
        switch (this.f11690a) {
            case 0:
                i1 i1Var = this.f11691b;
                aa.q0 q0VarB = i1Var.p().j().b();
                return q0VarB == null ? za.k.f(i1Var.p().j(), y9.g.f15129a) : q0VarB;
            default:
                return n3.u.f(this.f11691b, true);
        }
    }
}
