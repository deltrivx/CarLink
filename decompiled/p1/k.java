package p1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements h9.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h9.k f10053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h9.k f10054c;

    public /* synthetic */ k(h9.k kVar, h9.k kVar2, int i7) {
        this.f10052a = i7;
        this.f10053b = kVar;
        this.f10054c = kVar2;
    }

    @Override // h9.k
    public final Object invoke(Object obj) {
        switch (this.f10052a) {
            case 0:
                this.f10053b.invoke(obj);
                this.f10054c.invoke(obj);
                break;
            default:
                this.f10053b.invoke(obj);
                this.f10054c.invoke(obj);
                break;
        }
        return t8.z.f12851a;
    }
}
