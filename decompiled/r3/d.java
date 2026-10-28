package r3;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d extends i9.n implements h9.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f11539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f11540c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f11541d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d f11542e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final d f11543f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final d f11544g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11545a;

    static {
        int i7 = 1;
        f11539b = new d(i7, 0);
        f11540c = new d(i7, 1);
        f11541d = new d(i7, 2);
        f11542e = new d(i7, 3);
        f11543f = new d(i7, 4);
        f11544g = new d(i7, 5);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i7, int i10) {
        super(i7);
        this.f11545a = i10;
    }

    @Override // h9.k
    public final Object invoke(Object obj) {
        int i7 = this.f11545a;
        t8.z zVar = t8.z.f12851a;
        switch (i7) {
            case 0:
                o9.u[] uVarArr = y2.t.f15077a;
                ((y2.j) obj).n(y2.r.f15071w, zVar);
                break;
            case 1:
                ((Number) obj).longValue();
                break;
            case 2:
                break;
            case 3:
                o9.u[] uVarArr2 = y2.t.f15077a;
                ((y2.j) obj).n(y2.r.f15070v, zVar);
                break;
            case 4:
                break;
            default:
                v vVar = (v) obj;
                if (vVar.isAttachedToWindow()) {
                    vVar.m();
                }
                break;
        }
        return zVar;
    }
}
