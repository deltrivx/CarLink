package h0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m0 implements h9.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p0 f6338b;

    public /* synthetic */ m0(p0 p0Var, int i7) {
        this.f6337a = i7;
        this.f6338b = p0Var;
    }

    @Override // h9.k
    public final Object invoke(Object obj) {
        switch (this.f6337a) {
            case 0:
                v vVar = (v) this.f6338b.f6349o.invoke();
                int iA = vVar.a();
                int i7 = 0;
                while (i7 < iA) {
                    if (vVar.b(i7).equals(obj)) {
                        return Integer.valueOf(i7);
                    }
                    i7++;
                }
                i7 = -1;
                return Integer.valueOf(i7);
            default:
                int iIntValue = ((Integer) obj).intValue();
                p0 p0Var = this.f6338b;
                v vVar2 = (v) p0Var.f6349o.invoke();
                if (iIntValue < 0 || iIntValue >= vVar2.a()) {
                    StringBuilder sbT = ob.a.t("Can't scroll to index ", ", it is out of bounds [0, ", iIntValue);
                    sbT.append(vVar2.a());
                    sbT.append(')');
                    c0.b.a(sbT.toString());
                }
                cc.b0.s(p0Var.m0(), null, new o0(p0Var, iIntValue, null, 0), 3);
                return Boolean.TRUE;
        }
    }
}
