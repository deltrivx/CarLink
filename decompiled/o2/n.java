package o2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class n extends i9.n implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o[] f9383b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(o[] oVarArr, int i7) {
        super(2);
        this.f9382a = i7;
        this.f9383b = oVarArr;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f9382a) {
            case 0:
                return Float.valueOf(d1.c((u0) obj, true, this.f9383b, ((Number) obj2).floatValue()));
            default:
                return Float.valueOf(d1.c((u0) obj, false, this.f9383b, ((Number) obj2).floatValue()));
        }
    }
}
