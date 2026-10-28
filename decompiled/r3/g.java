package r3;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class g extends i9.n implements h9.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f11553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h9.a f11554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z f11555c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f11556d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n3.o f11557e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(v vVar, h9.a aVar, z zVar, String str, n3.o oVar) {
        super(1);
        this.f11553a = vVar;
        this.f11554b = aVar;
        this.f11555c = zVar;
        this.f11556d = str;
        this.f11557e = oVar;
    }

    @Override // h9.k
    public final Object invoke(Object obj) {
        v vVar = this.f11553a;
        vVar.f11604n.addView(vVar, vVar.f11605o);
        vVar.j(this.f11554b, this.f11555c, this.f11556d, this.f11557e);
        return new e8.p(10, vVar);
    }
}
