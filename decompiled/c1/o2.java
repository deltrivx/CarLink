package c1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class o2 extends i9.n implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f2046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h9.k f2047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r1.p f2048c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f2049d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n2 f2050e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2051f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(boolean z10, h9.k kVar, r1.p pVar, boolean z11, n2 n2Var, int i7) {
        super(2);
        this.f2046a = z10;
        this.f2047b = kVar;
        this.f2048c = pVar;
        this.f2049d = z11;
        this.f2050e = n2Var;
        this.f2051f = i7;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        androidx.compose.material3.a.a(this.f2046a, this.f2047b, this.f2048c, this.f2049d, this.f2050e, (f1.s) obj, f1.b.y(this.f2051f | 1));
        return t8.z.f12851a;
    }
}
