package l8;

import f1.b1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class h implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m5.l f8161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b1 f8162c;

    public /* synthetic */ h(m5.l lVar, b1 b1Var, int i7) {
        this.f8160a = i7;
        this.f8161b = lVar;
        this.f8162c = b1Var;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f8160a) {
            case 0:
                f1.s sVar = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar.z()) {
                    sVar.Q();
                } else {
                    sVar.W(5004770);
                    Object objK = sVar.K();
                    if (objK == f1.n.f5051a) {
                        objK = new f8.h(this.f8162c, 2);
                        sVar.h0(objK);
                    }
                    sVar.p(false);
                    i2.c.e(this.f8161b, (h9.k) objK, sVar, 48);
                }
                break;
            default:
                f1.s sVar2 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar2.z()) {
                    sVar2.Q();
                } else {
                    g5.a.b(null, n1.h.e(-1804946485, new h(this.f8161b, this.f8162c, 0), sVar2), sVar2, 48, 1);
                }
                break;
        }
        return t8.z.f12851a;
    }
}
