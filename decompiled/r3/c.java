package r3;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c extends i9.n implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h9.a f11534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f11535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n1.c f11536c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11537d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f11538e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(h9.a aVar, s sVar, n1.c cVar, int i7, int i10) {
        super(2);
        this.f11534a = aVar;
        this.f11535b = sVar;
        this.f11536c = cVar;
        this.f11537d = i7;
        this.f11538e = i10;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        n3.l.b(this.f11534a, this.f11535b, this.f11536c, (f1.s) obj, f1.b.y(this.f11537d | 1), this.f11538e);
        return t8.z.f12851a;
    }
}
