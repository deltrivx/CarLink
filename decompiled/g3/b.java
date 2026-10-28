package g3;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b extends i9.n implements h9.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f5824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f5825c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f5826d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f5827e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f5828f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f5829g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5830a;

    static {
        int i7 = 1;
        f5824b = new b(i7, 0);
        f5825c = new b(i7, 1);
        f5826d = new b(i7, 2);
        f5827e = new b(i7, 3);
        f5828f = new b(i7, 4);
        f5829g = new b(i7, 5);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i7, int i10) {
        super(i7);
        this.f5830a = i10;
    }

    @Override // h9.k
    public final /* synthetic */ Object invoke(Object obj) {
        switch (this.f5830a) {
            case 0:
                float[] fArr = ((y1.a0) obj).f14874a;
                break;
            case 1:
                float[] fArr2 = ((y1.a0) obj).f14874a;
                break;
            case 2:
                break;
            case 3:
                int i7 = ((j) obj).f5864a;
                break;
            case 4:
                break;
            default:
                int i10 = ((j) obj).f5864a;
                break;
        }
        return t8.z.f12851a;
    }
}
