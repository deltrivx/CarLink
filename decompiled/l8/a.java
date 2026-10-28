package l8;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f8090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f8091c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8092d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t8.e f8093e;

    public /* synthetic */ a(String str, t8.e eVar, int i7, int i10, int i11) {
        this.f8089a = i11;
        this.f8090b = str;
        this.f8093e = eVar;
        this.f8091c = i7;
        this.f8092d = i10;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f8089a) {
            case 0:
                ((Integer) obj2).getClass();
                int iY = f1.b.y(this.f8091c | 1);
                g5.a.b(this.f8090b, (h9.n) this.f8093e, (f1.s) obj, iY, this.f8092d);
                break;
            default:
                ((Integer) obj2).getClass();
                int iY2 = f1.b.y(this.f8091c | 1);
                i2.c.m(this.f8090b, (h9.a) this.f8093e, (f1.s) obj, iY2, this.f8092d);
                break;
        }
        return t8.z.f12851a;
    }
}
