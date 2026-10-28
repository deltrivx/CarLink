package n8;

import t8.z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class m implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n1.c f8926b;

    public /* synthetic */ m(n1.c cVar, int i7) {
        this.f8925a = i7;
        this.f8926b = cVar;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f8925a) {
            case 0:
                f1.s sVar = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar.z()) {
                    sVar.Q();
                } else {
                    this.f8926b.invoke(sVar, 0);
                }
                break;
            default:
                f1.s sVar2 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar2.z()) {
                    sVar2.Q();
                } else {
                    m8.b.a(false, n1.h.e(-975741715, new m(this.f8926b, 0), sVar2), sVar2, 384);
                }
                break;
        }
        return z.f12851a;
    }
}
