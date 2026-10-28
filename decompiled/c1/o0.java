package c1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class o0 extends i9.n implements h9.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o2.v0 f2038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f2039c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(int i7, o2.v0 v0Var, int i10) {
        super(1);
        this.f2037a = i7;
        this.f2038b = v0Var;
        this.f2039c = i10;
    }

    @Override // h9.k
    public final Object invoke(Object obj) {
        o2.v0 v0Var = this.f2038b;
        o2.u0.f((o2.u0) obj, v0Var, k9.a.M((this.f2037a - v0Var.f9435a) / 2.0f), k9.a.M((this.f2039c - v0Var.f9436b) / 2.0f));
        return t8.z.f12851a;
    }
}
