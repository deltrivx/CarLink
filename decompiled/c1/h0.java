package c1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class h0 extends i9.n implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e2.f f1900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f1901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r1.p f1902c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f1903d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1904e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1905f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(e2.f fVar, String str, r1.p pVar, long j5, int i7, int i10) {
        super(2);
        this.f1900a = fVar;
        this.f1901b = str;
        this.f1902c = pVar;
        this.f1903d = j5;
        this.f1904e = i7;
        this.f1905f = i10;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        k0.b(this.f1900a, this.f1901b, this.f1902c, this.f1903d, (f1.s) obj, f1.b.y(this.f1904e | 1), this.f1905f);
        return t8.z.f12851a;
    }
}
