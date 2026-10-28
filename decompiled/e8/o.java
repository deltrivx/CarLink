package e8;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class o implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l8.j0 f4595b;

    public /* synthetic */ o(l8.j0 j0Var, int i7) {
        this.f4594a = i7;
        this.f4595b = j0Var;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f4594a) {
            case 0:
                f1.s sVar = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar.z()) {
                    sVar.Q();
                } else {
                    i2.c.m(this.f4595b.f8196a, null, sVar, 0, 2);
                }
                break;
            default:
                f1.s sVar2 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar2.z()) {
                    sVar2.Q();
                } else {
                    i2.c.m(this.f4595b.f8197b.b(), null, sVar2, 0, 2);
                }
                break;
        }
        return t8.z.f12851a;
    }
}
