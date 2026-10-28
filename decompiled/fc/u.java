package fc;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class u implements f0, d, gc.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h0 f5597a;

    public u(h0 h0Var) {
        this.f5597a = h0Var;
    }

    @Override // gc.r
    public final d g(y8.h hVar, int i7, ec.a aVar) {
        return ((((i7 < 0 || i7 >= 2) && i7 != -2) || aVar != ec.a.f4686b) && !((i7 == 0 || i7 == -3) && aVar == ec.a.f4685a)) ? new gc.g(this, hVar, i7, aVar) : this;
    }

    @Override // fc.f0
    public final Object getValue() {
        return this.f5597a.getValue();
    }

    @Override // fc.d
    public final Object l(e eVar, y8.c cVar) {
        this.f5597a.l(eVar, cVar);
        return z8.a.f15774a;
    }
}
