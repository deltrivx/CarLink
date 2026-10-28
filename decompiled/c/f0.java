package c;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends i9.n implements h9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l0 f1717b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(l0 l0Var, int i7) {
        super(0);
        this.f1716a = i7;
        this.f1717b = l0Var;
    }

    @Override // h9.a
    public final Object invoke() {
        switch (this.f1716a) {
            case 0:
                this.f1717b.c();
                break;
            case 1:
                this.f1717b.b();
                break;
            default:
                this.f1717b.c();
                break;
        }
        return t8.z.f12851a;
    }
}
