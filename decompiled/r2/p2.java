package r2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class p2 extends i9.n implements h9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f11367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o.e f11368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b3.l0 f11369c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(a aVar, o.e eVar, b3.l0 l0Var) {
        super(0);
        this.f11367a = aVar;
        this.f11368b = eVar;
        this.f11369c = l0Var;
    }

    @Override // h9.a
    public final Object invoke() {
        o.e eVar = this.f11368b;
        a aVar = this.f11367a;
        aVar.removeOnAttachStateChangeListener(eVar);
        b3.l0 l0Var = this.f11369c;
        i9.l.e(l0Var, "listener");
        o9.e0.D(aVar).f6952a.remove(l0Var);
        return t8.z.f12851a;
    }
}
