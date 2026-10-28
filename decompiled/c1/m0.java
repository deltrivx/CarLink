package c1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class m0 extends i9.n implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w f1994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k1 f1995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y2 f1996c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n1.c f1997d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1998e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(w wVar, k1 k1Var, y2 y2Var, n1.c cVar, int i7) {
        super(2);
        this.f1994a = wVar;
        this.f1995b = k1Var;
        this.f1996c = y2Var;
        this.f1997d = cVar;
        this.f1998e = i7;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        n0.a(this.f1994a, this.f1995b, this.f1996c, this.f1997d, (f1.s) obj, f1.b.y(this.f1998e | 1));
        return t8.z.f12851a;
    }
}
