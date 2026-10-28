package c1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c1 extends i9.n implements h9.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c1 f1827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c1 f1828c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c1 f1829d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c1 f1830e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1831a;

    static {
        int i7 = 2;
        f1827b = new c1(i7, 0);
        f1828c = new c1(i7, 1);
        f1829d = new c1(i7, 2);
        f1830e = new c1(i7, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c1(int i7, int i10) {
        super(i7);
        this.f1831a = i10;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f1831a) {
            case 0:
                return Integer.valueOf(((o2.l0) obj).c(((Number) obj2).intValue()));
            case 1:
                return Integer.valueOf(((o2.l0) obj).r(((Number) obj2).intValue()));
            case 2:
                return Integer.valueOf(((o2.l0) obj).H(((Number) obj2).intValue()));
            default:
                return Integer.valueOf(((o2.l0) obj).m(((Number) obj2).intValue()));
        }
    }
}
