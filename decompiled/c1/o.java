package c1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class o extends i9.n implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r1.p f2030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y1.l0 f2031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f2032c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m f2033d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n1.c f2034e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2035f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2036g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(r1.p pVar, y1.l0 l0Var, l lVar, m mVar, n1.c cVar, int i7, int i10) {
        super(2);
        this.f2030a = pVar;
        this.f2031b = l0Var;
        this.f2032c = lVar;
        this.f2033d = mVar;
        this.f2034e = cVar;
        this.f2035f = i7;
        this.f2036g = i10;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        g1.b(this.f2030a, this.f2031b, this.f2032c, this.f2033d, this.f2034e, (f1.s) obj, f1.b.y(this.f2035f | 1), this.f2036g);
        return t8.z.f12851a;
    }
}
