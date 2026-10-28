package n8;

import t8.z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class v implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f8948b;

    public /* synthetic */ v(w wVar, int i7) {
        this.f8947a = i7;
        this.f8948b = wVar;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f8947a) {
            case 0:
                f1.s sVar = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar.z()) {
                    sVar.Q();
                } else {
                    this.f8948b.f8952d.invoke(sVar, 0);
                }
                break;
            default:
                f1.s sVar2 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar2.z()) {
                    sVar2.Q();
                } else {
                    m8.b.a(false, n1.h.e(1366039913, new v(this.f8948b, 0), sVar2), sVar2, 384);
                }
                break;
        }
        return z.f12851a;
    }
}
