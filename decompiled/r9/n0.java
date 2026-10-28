package r9;

/* JADX INFO: loaded from: classes.dex */
public final class n0 implements h9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s0 f11725b;

    public /* synthetic */ n0(s0 s0Var, int i7) {
        this.f11724a = i7;
        this.f11725b = s0Var;
    }

    @Override // h9.a
    public final Object invoke() {
        switch (this.f11724a) {
            case 0:
                return new q0(this.f11725b);
            default:
                return a.a.w(this.f11725b.f11760b);
        }
    }
}
