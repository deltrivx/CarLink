package z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class j implements n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h9.k f15408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f15409b = new i(this);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x.z0 f15410c = new x.z0();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f1.k1 f15411d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f1.k1 f15412e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f1.k1 f15413f;

    public j(h9.k kVar) {
        this.f15408a = kVar;
        Boolean bool = Boolean.FALSE;
        this.f15411d = f1.b.s(bool);
        this.f15412e = f1.b.s(bool);
        this.f15413f = f1.b.s(bool);
    }

    @Override // z.n1
    public final boolean a() {
        return ((Boolean) this.f15411d.getValue()).booleanValue();
    }

    @Override // z.n1
    public final /* synthetic */ boolean b() {
        return true;
    }

    @Override // z.n1
    public final Object c(x.v0 v0Var, h9.n nVar, a9.c cVar) {
        Object objG = cc.b0.g(new b1.f(this, v0Var, nVar, (y8.c) null, 16), cVar);
        return objG == z8.a.f15774a ? objG : t8.z.f12851a;
    }

    @Override // z.n1
    public final /* synthetic */ boolean d() {
        return true;
    }

    @Override // z.n1
    public final float e(float f10) {
        return ((Number) this.f15408a.invoke(Float.valueOf(f10))).floatValue();
    }
}
