package w0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d0 implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r1.p f13759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n1.c f13760c;

    public /* synthetic */ d0(r1.p pVar, n1.c cVar, int i7, int i10) {
        this.f13758a = i10;
        this.f13759b = pVar;
        this.f13760c = cVar;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        int i7 = this.f13758a;
        f1.s sVar = (f1.s) obj;
        ((Integer) obj2).getClass();
        switch (i7) {
            case 0:
                y0.b(this.f13759b, this.f13760c, sVar, f1.b.y(49));
                break;
            default:
                y0.f(this.f13759b, this.f13760c, sVar, f1.b.y(49));
                break;
        }
        return t8.z.f12851a;
    }
}
