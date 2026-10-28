package v;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t0 implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f13460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f13461c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f13462d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f13463e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f13464f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f13465g;

    public /* synthetic */ t0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i7, int i10) {
        this.f13459a = i10;
        this.f13461c = obj;
        this.f13462d = obj2;
        this.f13463e = obj3;
        this.f13464f = obj4;
        this.f13465g = obj5;
        this.f13460b = i7;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f13459a) {
            case 0:
                ((Integer) obj2).intValue();
                u0.a((s0) this.f13461c, (p0) this.f13462d, this.f13463e, this.f13464f, (v) this.f13465g, (f1.s) obj, f1.b.y(this.f13460b | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                y.g.c((String) this.f13461c, (y.c) this.f13462d, (r1.p) this.f13463e, (h9.o) this.f13464f, (h9.a) this.f13465g, (f1.s) obj, f1.b.y(this.f13460b | 1));
                break;
        }
        return t8.z.f12851a;
    }
}
