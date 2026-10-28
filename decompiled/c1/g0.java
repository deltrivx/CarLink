package c1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class g0 extends i9.n implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r1.p f1888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f1889b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f1890c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(r1.p pVar, float f10, long j5, int i7) {
        super(2);
        this.f1888a = pVar;
        this.f1889b = f10;
        this.f1890c = j5;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iY = f1.b.y(49);
        g1.d(this.f1888a, this.f1889b, this.f1890c, (f1.s) obj, iY);
        return t8.z.f12851a;
    }
}
