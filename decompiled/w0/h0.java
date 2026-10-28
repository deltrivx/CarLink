package w0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class h0 implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13797a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w0 f13798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d1 f13799c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n1.c f13800d;

    public h0(d1 d1Var, n1.c cVar, w0 w0Var) {
        this.f13799c = d1Var;
        this.f13800d = cVar;
        this.f13798b = w0Var;
    }

    public h0(w0 w0Var, d1 d1Var, n1.c cVar) {
        this.f13798b = w0Var;
        this.f13799c = d1Var;
        this.f13800d = cVar;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f13797a) {
            case 0:
                f1.s sVar = (f1.s) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (sVar.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    f1.b.a(f1.f13786a.a(this.f13799c), n1.h.e(610483127, new a8.k0(24, this.f13800d, this.f13798b), sVar), sVar, 56);
                } else {
                    sVar.Q();
                }
                break;
            default:
                f1.s sVar2 = (f1.s) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (sVar2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    d1 d1Var = this.f13799c;
                    n1.c cVar = this.f13800d;
                    w0 w0Var = this.f13798b;
                    l0.q0.c(w0Var, n1.h.e(-284825865, new h0(d1Var, cVar, w0Var), sVar2), sVar2, 48);
                } else {
                    sVar2.Q();
                }
                break;
        }
        return t8.z.f12851a;
    }
}
