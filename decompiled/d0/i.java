package d0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements h9.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o2.v0 f3576b;

    public /* synthetic */ i(o2.v0 v0Var, int i7) {
        this.f3575a = i7;
        this.f3576b = v0Var;
    }

    @Override // h9.k
    public final Object invoke(Object obj) {
        o2.u0 u0Var = (o2.u0) obj;
        switch (this.f3575a) {
            case 0:
                o2.u0.j(u0Var, this.f3576b, 0, 0);
                break;
            case 1:
                o2.u0.j(u0Var, this.f3576b, 0, 0);
                break;
            case 2:
                n3.o oVarD = u0Var.d();
                n3.o oVar = n3.o.f8749a;
                o2.v0 v0Var = this.f3576b;
                if (oVarD == oVar || u0Var.e() == 0) {
                    o2.u0.b(u0Var, v0Var);
                    v0Var.T(n3.j.c(0L, v0Var.f9439e), 0.0f, null);
                } else {
                    int i7 = (int) 0;
                    long jE = ((long) ((u0Var.e() - v0Var.f9435a) - i7)) << 32;
                    o2.u0.b(u0Var, v0Var);
                    v0Var.T(n3.j.c((((long) i7) & 4294967295L) | jE, v0Var.f9439e), 0.0f, null);
                }
                return t8.z.f12851a;
            case 3:
                o2.u0.j(u0Var, this.f3576b, 0, 0);
                break;
            case 4:
                o2.u0.j(u0Var, this.f3576b, 0, 0);
                break;
            case 5:
                o2.u0.f(u0Var, this.f3576b, 0, 0);
                break;
            case 6:
                o2.u0.j(u0Var, this.f3576b, 0, 0);
                break;
            case 7:
                o2.u0.f(u0Var, this.f3576b, 0, 0);
                break;
            default:
                o2.u0.f(u0Var, this.f3576b, 0, 0);
                break;
        }
        return t8.z.f12851a;
    }
}
