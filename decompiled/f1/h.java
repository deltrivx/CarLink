package f1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class h implements h9.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h f4966b = new h(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h f4967c = new h(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4968a;

    public /* synthetic */ h(int i7) {
        this.f4968a = i7;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f4968a) {
            case 0:
                s sVar = (s) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (!sVar.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    sVar.Q();
                }
                break;
            default:
                s sVar2 = (s) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (!sVar2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    sVar2.Q();
                }
                break;
        }
        return t8.z.f12851a;
    }
}
