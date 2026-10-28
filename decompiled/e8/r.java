package e8;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class r implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f4609b;

    public /* synthetic */ r(w wVar, int i7) {
        this.f4608a = i7;
        this.f4609b = wVar;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f4608a) {
            case 0:
                f1.s sVar = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar.z()) {
                    sVar.Q();
                } else {
                    this.f4609b.d(null, sVar, 0);
                }
                break;
            default:
                f1.s sVar2 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar2.z()) {
                    sVar2.Q();
                } else {
                    g5.a.b(null, n1.h.e(-946006658, new r(this.f4609b, 0), sVar2), sVar2, 48, 1);
                    a2.f.L(16, sVar2, r1.m.f11116a, sVar2);
                }
                break;
        }
        return t8.z.f12851a;
    }
}
