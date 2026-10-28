package r3;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class o extends i9.n implements h9.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o f11574b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o f11575c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11576a;

    static {
        int i7 = 2;
        f11574b = new o(i7, 0);
        f11575c = new o(i7, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(int i7, int i10) {
        super(i7);
        this.f11576a = i10;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f11576a) {
            case 0:
                f1.s sVar = (f1.s) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (!sVar.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    sVar.Q();
                }
                break;
            default:
                f1.s sVar2 = (f1.s) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (!sVar2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    sVar2.Q();
                }
                break;
        }
        return t8.z.f12851a;
    }
}
