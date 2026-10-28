package f8;

import f1.s;
import h9.n;
import t8.z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f5474b;

    public /* synthetic */ b(c cVar, int i7) {
        this.f5473a = i7;
        this.f5474b = cVar;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f5473a) {
            case 0:
                s sVar = (s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar.z()) {
                    sVar.Q();
                } else {
                    i2.c.m(this.f5474b.f5475a, null, sVar, 0, 2);
                }
                break;
            default:
                s sVar2 = (s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar2.z()) {
                    sVar2.Q();
                } else {
                    i2.c.m(this.f5474b.f5476b, null, sVar2, 0, 2);
                }
                break;
        }
        return z.f12851a;
    }
}
