package c1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c2 extends i9.n implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r1.p f1832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i2 f1833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f1834c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b0.k f1835d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n1.c f1836e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n1.c f1837f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1838g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(r1.p pVar, i2 i2Var, boolean z10, b0.k kVar, n1.c cVar, n1.c cVar2, int i7) {
        super(2);
        this.f1832a = pVar;
        this.f1833b = i2Var;
        this.f1834c = z10;
        this.f1835d = kVar;
        this.f1836e = cVar;
        this.f1837f = cVar2;
        this.f1838g = i7;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        g2.d(this.f1832a, this.f1833b, this.f1834c, this.f1835d, this.f1836e, this.f1837f, (f1.s) obj, f1.b.y(this.f1838g | 1));
        return t8.z.f12851a;
    }
}
