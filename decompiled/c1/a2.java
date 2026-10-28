package c1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a2 extends i9.n implements h9.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o2.v0 f1809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1811c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o2.v0 f1812d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1813e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1814f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(o2.v0 v0Var, int i7, int i10, o2.v0 v0Var2, int i11, int i12) {
        super(1);
        this.f1809a = v0Var;
        this.f1810b = i7;
        this.f1811c = i10;
        this.f1812d = v0Var2;
        this.f1813e = i11;
        this.f1814f = i12;
    }

    @Override // h9.k
    public final Object invoke(Object obj) {
        o2.u0 u0Var = (o2.u0) obj;
        o2.u0.j(u0Var, this.f1809a, this.f1810b, this.f1811c);
        o2.u0.j(u0Var, this.f1812d, this.f1813e, this.f1814f);
        return t8.z.f12851a;
    }
}
