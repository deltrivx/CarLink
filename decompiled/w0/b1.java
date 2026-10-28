package w0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b1 implements h9.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h9.a f13743b;

    public /* synthetic */ b1(h9.a aVar, int i7) {
        this.f13742a = i7;
        this.f13743b = aVar;
    }

    @Override // h9.k
    public final Object invoke(Object obj) {
        switch (this.f13742a) {
            case 0:
                return (x1.b) this.f13743b.invoke();
            case 1:
                return (x1.b) this.f13743b.invoke();
            case 2:
                i9.l.e(obj, "it");
                return this.f13743b.invoke();
            default:
                this.f13743b.invoke();
                return t8.z.f12851a;
        }
    }
}
