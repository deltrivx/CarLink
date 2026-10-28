package w0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13744a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f13745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f13746c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f13747d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f13748e;

    public /* synthetic */ c(r1.p pVar, h9.a aVar, boolean z10, int i7) {
        this.f13747d = pVar;
        this.f13748e = aVar;
        this.f13745b = z10;
        this.f13746c = i7;
    }

    public /* synthetic */ c(boolean z10, m3.j jVar, t1 t1Var, int i7) {
        this.f13745b = z10;
        this.f13747d = jVar;
        this.f13748e = t1Var;
        this.f13746c = i7;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f13744a) {
            case 0:
                ((Integer) obj2).getClass();
                int iY = f1.b.y(this.f13746c | 1);
                y0.e((r1.p) this.f13747d, (h9.a) this.f13748e, this.f13745b, (f1.s) obj, iY);
                break;
            default:
                ((Integer) obj2).getClass();
                int iY2 = f1.b.y(this.f13746c | 1);
                y0.g(this.f13745b, (m3.j) this.f13747d, (t1) this.f13748e, (f1.s) obj, iY2);
                break;
        }
        return t8.z.f12851a;
    }
}
