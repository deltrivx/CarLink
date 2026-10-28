package a8;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class s0 implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0 f228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f1.b1 f229c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f1.b1 f230d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f1.b1 f231e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f1.h1 f232f;

    public /* synthetic */ s0(x0 x0Var, f1.b1 b1Var, f1.b1 b1Var2, f1.b1 b1Var3, f1.h1 h1Var, int i7) {
        this.f227a = i7;
        this.f228b = x0Var;
        this.f229c = b1Var;
        this.f230d = b1Var2;
        this.f231e = b1Var3;
        this.f232f = h1Var;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f227a) {
            case 0:
                f1.s sVar = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar.z()) {
                    sVar.Q();
                } else {
                    f1.b1 b1Var = this.f229c;
                    boolean zBooleanValue = ((Boolean) b1Var.getValue()).booleanValue();
                    sVar.W(5004770);
                    Object objK = sVar.K();
                    f1.w0 w0Var = f1.n.f5051a;
                    if (objK == w0Var) {
                        objK = new k(b1Var, 6);
                        sVar.h0(objK);
                    }
                    h9.a aVar = (h9.a) objK;
                    sVar.p(false);
                    x0 x0Var = this.f228b;
                    n8.q qVar = x0Var.f277b;
                    sVar.W(5004770);
                    Object objK2 = sVar.K();
                    f1.b1 b1Var2 = this.f230d;
                    if (objK2 == w0Var) {
                        objK2 = new u(b1Var2, 3);
                        sVar.h0(objK2);
                    }
                    sVar.p(false);
                    l8.n.b(zBooleanValue, aVar, qVar, (h9.k) objK2, sVar, 3120);
                    n8.q qVar2 = x0Var.f277b;
                    sVar.W(-1633490746);
                    Object objK3 = sVar.K();
                    if (objK3 == w0Var) {
                        objK3 = new t(b1Var, b1Var2, 1);
                        sVar.h0(objK3);
                    }
                    sVar.p(false);
                    x0Var.e(qVar2, (h9.n) objK3, sVar, 48);
                    String str = (String) b1Var2.getValue();
                    sVar.W(-1633490746);
                    Object objK4 = sVar.K();
                    if (objK4 == w0Var) {
                        objK4 = new m(1, this.f231e, this.f232f);
                        sVar.h0(objK4);
                    }
                    sVar.p(false);
                    x0Var.d(str, (h9.n) objK4, sVar, 48);
                }
                break;
            default:
                f1.s sVar2 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar2.z()) {
                    sVar2.Q();
                } else {
                    g5.a.b(null, n1.h.e(714501229, new s0(this.f228b, this.f229c, this.f230d, this.f231e, this.f232f, 0), sVar2), sVar2, 48, 1);
                }
                break;
        }
        return t8.z.f12851a;
    }
}
