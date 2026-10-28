package c8;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class u implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f2555b;

    public /* synthetic */ u(int i7, String str) {
        this.f2554a = i7;
        this.f2555b = str;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        int i7 = this.f2554a;
        t8.z zVar = t8.z.f12851a;
        String str = this.f2555b;
        switch (i7) {
            case 0:
                f1.s sVar = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar.z()) {
                    sVar.Q();
                } else {
                    i2.c.m(str, null, sVar, 0, 2);
                }
                break;
            case 1:
                f1.s sVar2 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar2.z()) {
                    sVar2.Q();
                } else {
                    i2.c.m(str, null, sVar2, 0, 2);
                    i2.c.b(0, sVar2);
                }
                break;
            default:
                f1.s sVar3 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar3.z()) {
                    sVar3.Q();
                } else {
                    r1.p pVarJ = androidx.compose.foundation.layout.a.j(androidx.compose.foundation.layout.a.c(r1.m.f11116a, 2.0f), 0.0f, g5.a.n(18, sVar3), 1);
                    hc.c cVar = n8.c.f8897a;
                    n3.n.C(new y1.f(n8.c.b(str)), "二维码", pVarJ, sVar3, 48, 248);
                }
                break;
        }
        return zVar;
    }
}
