package c1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class v1 extends i9.n implements h9.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b0.k f2218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m1 f2219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f2220c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(b0.k kVar, m1 m1Var, boolean z10) {
        super(3);
        this.f2218a = kVar;
        this.f2219b = m1Var;
        this.f2220c = z10;
    }

    @Override // h9.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        t1.f2165a.a(this.f2218a, null, this.f2219b, this.f2220c, 0L, (f1.s) obj2, 196608);
        return t8.z.f12851a;
    }
}
