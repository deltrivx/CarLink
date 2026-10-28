package b3;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e0 implements o1.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h9.n f1322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h9.k f1323b;

    public e0(h9.n nVar, h9.k kVar) {
        this.f1322a = nVar;
        this.f1323b = kVar;
    }

    @Override // o1.j
    public final Object W(o1.a aVar, Object obj) {
        return this.f1322a.invoke(aVar, obj);
    }

    @Override // o1.j
    public final Object m(Object obj) {
        return this.f1323b.invoke(obj);
    }
}
