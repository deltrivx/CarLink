package a8;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g1 implements h9.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f1.h1 f129b;

    public /* synthetic */ g1(f1.h1 h1Var, int i7) {
        this.f128a = i7;
        this.f129b = h1Var;
    }

    @Override // h9.k
    public final Object invoke(Object obj) {
        int i7 = this.f128a;
        t8.z zVar = t8.z.f12851a;
        f1.h1 h1Var = this.f129b;
        switch (i7) {
            case 0:
                h1Var.g((int) ((Float) obj).floatValue());
                break;
            case 1:
                l8.j0 j0Var = (l8.j0) obj;
                i9.l.e(j0Var, "it");
                int iA = j0Var.f8197b.a();
                int i10 = e8.b0.f4485e;
                h1Var.g(iA);
                break;
            case 2:
                int iFloatValue = (int) ((Float) obj).floatValue();
                int i11 = e8.f0.f4526h;
                h1Var.g(iFloatValue);
                break;
            case 3:
                l8.j0 j0Var2 = (l8.j0) obj;
                i9.l.e(j0Var2, "it");
                h1Var.g(j0Var2.f8197b.a());
                break;
            case 4:
                l8.j0 j0Var3 = (l8.j0) obj;
                i9.l.e(j0Var3, "it");
                int iA2 = j0Var3.f8197b.a();
                int i12 = e8.b1.f4490e;
                h1Var.g(iA2);
                break;
            case 5:
                h1Var.g((int) ((Float) obj).floatValue());
                break;
            case 6:
                h1Var.g(((Integer) obj).intValue());
                break;
            case 7:
                h1Var.g(((Integer) obj).intValue());
                break;
            default:
                h1Var.g(k9.a.M(((Float) obj).floatValue()));
                break;
        }
        return zVar;
    }
}
