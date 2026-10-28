package e2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends i9.n implements h9.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f4145b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0(f0 f0Var, int i7) {
        super(1);
        this.f4144a = i7;
        this.f4145b = f0Var;
    }

    /* JADX WARN: Type inference failed for: r10v3, types: [h9.a, i9.n] */
    @Override // h9.k
    public final Object invoke(Object obj) {
        switch (this.f4144a) {
            case 0:
                f0 f0Var = this.f4145b;
                f0Var.f4159d = true;
                f0Var.f4161f.invoke();
                return t8.z.f12851a;
            default:
                a2.g gVar = (a2.g) obj;
                f0 f0Var2 = this.f4145b;
                c cVar = f0Var2.f4157b;
                float f10 = f0Var2.k;
                float f11 = f0Var2.f4166l;
                a2.b bVarW = gVar.W();
                long J = bVarW.J();
                bVarW.z().h();
                try {
                    ((a2.d) bVarW.f12b).y(f10, f11, 0L);
                    cVar.a(gVar);
                    return t8.z.f12851a;
                } finally {
                    ob.a.y(bVarW, J);
                }
        }
    }
}
