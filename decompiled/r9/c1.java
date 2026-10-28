package r9;

/* JADX INFO: loaded from: classes.dex */
public final class c1 implements h9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e1 f11670b;

    public /* synthetic */ c1(e1 e1Var, int i7) {
        this.f11669a = i7;
        this.f11670b = e1Var;
    }

    @Override // h9.a
    public final Object invoke() {
        switch (this.f11669a) {
            case 0:
                return new d1(this.f11670b);
            default:
                return this.f11670b.n();
        }
    }
}
