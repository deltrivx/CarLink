package c1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class r0 extends i9.n implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t0 f2106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f2107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f2108c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b0.k f2109d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r1.p f2110e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q2 f2111f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ y1.l0 f2112g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f2113h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f2114i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f2115j;
    public final /* synthetic */ int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(t0 t0Var, boolean z10, boolean z11, b0.k kVar, r1.p pVar, q2 q2Var, y1.l0 l0Var, float f10, float f11, int i7, int i10) {
        super(2);
        this.f2106a = t0Var;
        this.f2107b = z10;
        this.f2108c = z11;
        this.f2109d = kVar;
        this.f2110e = pVar;
        this.f2111f = q2Var;
        this.f2112g = l0Var;
        this.f2113h = f10;
        this.f2114i = f11;
        this.f2115j = i7;
        this.k = i10;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        this.f2106a.a(this.f2107b, this.f2108c, this.f2109d, this.f2110e, this.f2111f, this.f2112g, this.f2113h, this.f2114i, (f1.s) obj, f1.b.y(this.f2115j | 1), this.k);
        return t8.z.f12851a;
    }
}
