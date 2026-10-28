package c1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class i0 extends i9.n implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d2.b f1914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f1915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r1.p f1916c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f1917d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1918e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(d2.b bVar, String str, r1.p pVar, long j5, int i7) {
        super(2);
        this.f1914a = bVar;
        this.f1915b = str;
        this.f1916c = pVar;
        this.f1917d = j5;
        this.f1918e = i7;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        k0.a(this.f1914a, this.f1915b, this.f1916c, this.f1917d, (f1.s) obj, f1.b.y(this.f1918e | 1));
        return t8.z.f12851a;
    }
}
