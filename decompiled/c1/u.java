package c1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class u extends i9.n implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a3.a f2184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h9.a f2185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r1.p f2186c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f2187d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q f2188e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2189f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(a3.a aVar, h9.a aVar2, r1.p pVar, boolean z10, q qVar, int i7) {
        super(2);
        this.f2184a = aVar;
        this.f2185b = aVar2;
        this.f2186c = pVar;
        this.f2187d = z10;
        this.f2188e = qVar;
        this.f2189f = i7;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        v.c(this.f2184a, this.f2185b, this.f2186c, this.f2187d, this.f2188e, (f1.s) obj, f1.b.y(this.f2189f | 1));
        return t8.z.f12851a;
    }
}
