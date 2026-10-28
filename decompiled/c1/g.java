package c1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class g extends i9.n implements h9.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f1884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g f1885c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g f1886d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1887a;

    static {
        int i7 = 1;
        f1884b = new g(i7, 0);
        f1885c = new g(i7, 1);
        f1886d = new g(i7, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i7, int i10) {
        super(i7);
        this.f1887a = i10;
    }

    @Override // h9.k
    public final Object invoke(Object obj) {
        int i7 = this.f1887a;
        t8.z zVar = t8.z.f12851a;
        switch (i7) {
            case 0:
                y2.t.b((y2.j) obj, 0);
                break;
            case 1:
                break;
            default:
                o9.u[] uVarArr = y2.t.f15077a;
                y2.u uVar = y2.r.f15060l;
                o9.u uVar2 = y2.t.f15077a[5];
                uVar.a((y2.j) obj, Boolean.TRUE);
                break;
        }
        return zVar;
    }
}
