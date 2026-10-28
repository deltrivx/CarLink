package c1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class w2 extends i9.n implements h9.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o2.v0 f2269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x2 f2270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f2271c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(o2.v0 v0Var, x2 x2Var, float f10) {
        super(1);
        this.f2269a = v0Var;
        this.f2270b = x2Var;
        this.f2271c = f10;
    }

    @Override // h9.k
    public final Object invoke(Object obj) {
        o2.u0 u0Var = (o2.u0) obj;
        v.c cVar = this.f2270b.f2315r;
        o2.u0.j(u0Var, this.f2269a, (int) (cVar != null ? ((Number) cVar.d()).floatValue() : this.f2271c), 0);
        return t8.z.f12851a;
    }
}
