package c1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends i9.n implements h9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d0 f1826b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(d0 d0Var, int i7) {
        super(0);
        this.f1825a = i7;
        this.f1826b = d0Var;
    }

    @Override // h9.a
    public final Object invoke() {
        int i7 = this.f1825a;
        d0 d0Var = this.f1826b;
        switch (i7) {
            case 0:
                return g1.f1891a;
            default:
                if (((f1) q2.f.i(d0Var, h1.f1907b)) == null) {
                    b1.c cVar = d0Var.f1847u;
                    if (cVar != null) {
                        d0Var.B0(cVar);
                    }
                } else if (d0Var.f1847u == null) {
                    int i10 = 0;
                    b0 b0Var = new b0(i10, d0Var);
                    c0 c0Var = new c0(d0Var, i10);
                    b0.k kVar = d0Var.f1843q;
                    boolean z10 = d0Var.f1844r;
                    float f10 = d0Var.f1845s;
                    v.v0 v0Var = b1.l.f1171a;
                    b1.c cVar2 = new b1.c(kVar, z10, f10, b0Var, c0Var);
                    d0Var.A0(cVar2);
                    d0Var.f1847u = cVar2;
                }
                return t8.z.f12851a;
        }
    }
}
