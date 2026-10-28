package r9;

/* JADX INFO: loaded from: classes.dex */
public final class z0 implements h9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b1 f11799b;

    public /* synthetic */ z0(b1 b1Var, int i7) {
        this.f11798a = i7;
        this.f11799b = b1Var;
    }

    @Override // h9.a
    public final Object invoke() {
        switch (this.f11798a) {
            case 0:
                return new a1(this.f11799b);
            default:
                return this.f11799b.n();
        }
    }
}
