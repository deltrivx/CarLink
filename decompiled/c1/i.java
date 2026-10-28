package c1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class i extends i9.n implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f1911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d0.h0 f1912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n1.c f1913c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(long j5, d0.h0 h0Var, n1.c cVar) {
        super(2);
        this.f1911a = j5;
        this.f1912b = h0Var;
        this.f1913c = cVar;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        f1.s sVar = (f1.s) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && sVar.z()) {
            sVar.Q();
        } else {
            d1.e.a(this.f1911a, ((y2) sVar.j(z2.f2365a)).f2358m, n1.h.e(1327513942, new h(0, this.f1912b, this.f1913c), sVar), sVar, 384);
        }
        return t8.z.f12851a;
    }
}
