package c1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e2 extends i9.n implements h9.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f1872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i2 f1873b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(boolean z10, i2 i2Var) {
        super(1);
        this.f1872a = z10;
        this.f1873b = i2Var;
    }

    @Override // h9.k
    public final Object invoke(Object obj) {
        y2.j jVar = (y2.j) obj;
        boolean z10 = this.f1872a;
        t8.z zVar = t8.z.f12851a;
        if (!z10) {
            o9.u[] uVarArr = y2.t.f15077a;
            jVar.n(y2.r.f15058i, zVar);
        }
        z1 z1Var = new z1(this.f1873b, 1);
        o9.u[] uVarArr2 = y2.t.f15077a;
        jVar.n(y2.i.f14993h, new y2.a(null, z1Var));
        return zVar;
    }
}
