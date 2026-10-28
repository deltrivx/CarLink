package l8;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r implements h9.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f8248b;

    public /* synthetic */ r(int i7, String str) {
        this.f8247a = i7;
        this.f8248b = str;
    }

    @Override // h9.k
    public final Object invoke(Object obj) {
        int i7 = this.f8247a;
        t8.z zVar = t8.z.f12851a;
        String str = this.f8248b;
        switch (i7) {
            case 0:
                j0 j0Var = (j0) obj;
                i9.l.e(j0Var, "it");
                t8.o oVar = n8.d.f8898a;
                n8.d.g(str, j0Var.f8197b.b());
                break;
            case 1:
                j0 j0Var2 = (j0) obj;
                i9.l.e(j0Var2, "it");
                t8.o oVar2 = n8.d.f8898a;
                n8.d.f(j0Var2.f8197b.a(), str);
                break;
            case 2:
                j0 j0Var3 = (j0) obj;
                i9.l.e(j0Var3, "it");
                t8.o oVar3 = n8.d.f8898a;
                n8.d.e(str, j0Var3.f8197b.c());
                break;
            default:
                y2.j jVar = (y2.j) obj;
                o9.u[] uVarArr = y2.t.f15077a;
                jVar.n(y2.r.f15050a, n3.l.I(str));
                y2.t.b(jVar, 5);
                break;
        }
        return zVar;
    }
}
