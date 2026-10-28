package w0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z0 implements h9.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h9.a f14022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h9.a f14023c;

    public /* synthetic */ z0(h9.a aVar, h9.a aVar2, int i7) {
        this.f14021a = i7;
        this.f14022b = aVar;
        this.f14023c = aVar2;
    }

    @Override // h9.k
    public final Object invoke(Object obj) {
        o0.g gVar = (o0.g) obj;
        switch (this.f14021a) {
            case 0:
                this.f14022b.invoke();
                h9.a aVar = this.f14023c;
                if (aVar != null ? ((Boolean) aVar.invoke()).booleanValue() : true) {
                    gVar.close();
                }
                break;
            default:
                this.f14022b.invoke();
                h9.a aVar2 = this.f14023c;
                if (aVar2 != null ? ((Boolean) aVar2.invoke()).booleanValue() : true) {
                    gVar.close();
                }
                break;
        }
        return t8.z.f12851a;
    }
}
