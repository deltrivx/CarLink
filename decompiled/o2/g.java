package o2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class g extends i9.n implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f9328a = new g(2);

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        f1.s sVar = (f1.s) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (!sVar.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            sVar.Q();
        }
        return t8.z.f12851a;
    }
}
