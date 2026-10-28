package a8;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p0 implements h9.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f192a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h9.n f193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f194c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f1.b1 f195d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f1.h1 f196e;

    public /* synthetic */ p0(h9.n nVar, String str, f1.b1 b1Var, f1.h1 h1Var) {
        this.f193b = nVar;
        this.f194c = str;
        this.f195d = b1Var;
        this.f196e = h1Var;
    }

    public /* synthetic */ p0(h9.n nVar, String str, f1.h1 h1Var, f1.b1 b1Var) {
        this.f193b = nVar;
        this.f194c = str;
        this.f196e = h1Var;
        this.f195d = b1Var;
    }

    @Override // h9.k
    public final Object invoke(Object obj) {
        l8.j0 j0Var = (l8.j0) obj;
        switch (this.f192a) {
            case 0:
                i9.l.e(j0Var, "it");
                int iA = j0Var.f8197b.a();
                f1.h1 h1Var = this.f196e;
                h1Var.g(iA);
                f1.b1 b1Var = this.f195d;
                Boolean bool = (Boolean) b1Var.getValue();
                bool.booleanValue();
                this.f193b.invoke(bool, Integer.valueOf(h1Var.f()));
                boolean zBooleanValue = ((Boolean) b1Var.getValue()).booleanValue();
                d8.p.a(this.f194c, h1Var.f(), zBooleanValue);
                break;
            default:
                i9.l.e(j0Var, "it");
                Boolean boolValueOf = Boolean.valueOf(j0Var.f8197b.c());
                f1.b1 b1Var2 = this.f195d;
                b1Var2.setValue(boolValueOf);
                Boolean bool2 = (Boolean) b1Var2.getValue();
                bool2.getClass();
                f1.h1 h1Var2 = this.f196e;
                this.f193b.invoke(bool2, Integer.valueOf(h1Var2.f()));
                boolean zBooleanValue2 = ((Boolean) b1Var2.getValue()).booleanValue();
                d8.p.a(this.f194c, h1Var2.f(), zBooleanValue2);
                break;
        }
        return t8.z.f12851a;
    }
}
