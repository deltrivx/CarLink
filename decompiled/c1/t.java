package c1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class t extends i9.n implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f2155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a3.a f2156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r1.p f2157c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q f2158d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2159e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(boolean z10, a3.a aVar, r1.p pVar, q qVar, int i7) {
        super(2);
        this.f2155a = z10;
        this.f2156b = aVar;
        this.f2157c = pVar;
        this.f2158d = qVar;
        this.f2159e = i7;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        v.b(this.f2155a, this.f2156b, this.f2157c, this.f2158d, (f1.s) obj, f1.b.y(this.f2159e | 1));
        return t8.z.f12851a;
    }
}
