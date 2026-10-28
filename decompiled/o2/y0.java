package o2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class y0 extends i9.n implements h9.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v0 f9447b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y0(v0 v0Var, int i7) {
        super(1);
        this.f9446a = i7;
        this.f9447b = v0Var;
    }

    @Override // h9.k
    public final Object invoke(Object obj) {
        switch (this.f9446a) {
            case 0:
                u0.k((u0) obj, this.f9447b, 0, 0);
                break;
            case 1:
                u0.f((u0) obj, this.f9447b, 0, 0);
                break;
            case 2:
                u0.j((u0) obj, this.f9447b, 0, 0);
                break;
            default:
                u0.j((u0) obj, this.f9447b, 0, 0);
                break;
        }
        return t8.z.f12851a;
    }
}
