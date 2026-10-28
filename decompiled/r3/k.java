package r3;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class k extends i9.n implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y f11565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h9.a f11566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z f11567c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n1.c f11568d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f11569e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f11570f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(y yVar, h9.a aVar, z zVar, n1.c cVar, int i7, int i10) {
        super(2);
        this.f11565a = yVar;
        this.f11566b = aVar;
        this.f11567c = zVar;
        this.f11568d = cVar;
        this.f11569e = i7;
        this.f11570f = i10;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        l.a(this.f11565a, this.f11566b, this.f11567c, this.f11568d, (f1.s) obj, f1.b.y(this.f11569e | 1), this.f11570f);
        return t8.z.f12851a;
    }
}
