package c1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class r extends i9.n implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f2102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r1.p f2103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f2104c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q f2105d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(boolean z10, r1.p pVar, boolean z11, q qVar, int i7) {
        super(2);
        this.f2102a = z10;
        this.f2103b = pVar;
        this.f2104c = z11;
        this.f2105d = qVar;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iY = f1.b.y(49);
        v.a(this.f2102a, this.f2103b, this.f2104c, this.f2105d, (f1.s) obj, iY);
        return t8.z.f12851a;
    }
}
