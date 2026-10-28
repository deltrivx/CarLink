package l8;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f8147b;

    public /* synthetic */ f(String str, int i7, int i10) {
        this.f8146a = i10;
        this.f8147b = str;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        int i7 = this.f8146a;
        f1.s sVar = (f1.s) obj;
        ((Integer) obj2).getClass();
        switch (i7) {
            case 0:
                i2.c.d(this.f8147b, sVar, f1.b.y(1));
                break;
            default:
                i2.c.q(this.f8147b, sVar, f1.b.y(1));
                break;
        }
        return t8.z.f12851a;
    }
}
