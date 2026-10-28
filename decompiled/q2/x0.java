package q2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class x0 extends i9.n implements h9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y0 f10847b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x0(y0 y0Var, int i7) {
        super(0);
        this.f10846a = i7;
        this.f10847b = y0Var;
    }

    @Override // h9.a
    public final Object invoke() {
        o2.u0 placementScope;
        switch (this.f10846a) {
            case 0:
                y0 y0Var = this.f10847b;
                l0 l0Var = y0Var.f10849f;
                l0Var.f10737i = 0;
                h1.e eVarZ = l0Var.f10729a.z();
                Object[] objArr = eVarZ.f6421a;
                int i7 = eVarZ.f6423c;
                for (int i10 = 0; i10 < i7; i10++) {
                    y0 y0Var2 = ((h0) objArr[i10]).F.f10743p;
                    y0Var2.f10851h = y0Var2.f10852i;
                    y0Var2.f10852i = Integer.MAX_VALUE;
                    y0Var2.f10861s = false;
                    if (y0Var2.f10854l == f0.f10639b) {
                        y0Var2.f10854l = f0.f10640c;
                    }
                }
                h0 h0Var = l0Var.f10729a;
                h0 h0Var2 = l0Var.f10729a;
                h1.e eVarZ2 = h0Var.z();
                Object[] objArr2 = eVarZ2.f6421a;
                int i11 = eVarZ2.f6423c;
                for (int i12 = 0; i12 < i11; i12++) {
                    ((h0) objArr2[i12]).F.f10743p.f10865w.getClass();
                }
                y0Var.f().o0().c();
                h1.e eVarZ3 = h0Var2.z();
                Object[] objArr3 = eVarZ3.f6421a;
                int i13 = eVarZ3.f6423c;
                for (int i14 = 0; i14 < i13; i14++) {
                    h0 h0Var3 = (h0) objArr3[i14];
                    l0 l0Var2 = h0Var3.F;
                    if (l0Var2.f10743p.f10851h != h0Var3.w()) {
                        h0Var2.O();
                        h0Var2.C();
                        if (h0Var3.w() == Integer.MAX_VALUE) {
                            if (l0Var2.f10731c) {
                                u0 u0Var = l0Var2.f10744q;
                                i9.l.b(u0Var);
                                u0Var.Y(false);
                            }
                            l0Var2.f10743p.f0();
                        }
                    }
                }
                h1.e eVarZ4 = h0Var2.z();
                Object[] objArr4 = eVarZ4.f6421a;
                int i15 = eVarZ4.f6423c;
                for (int i16 = 0; i16 < i15; i16++) {
                    i0 i0Var = ((h0) objArr4[i16]).F.f10743p.f10865w;
                    i0Var.getClass();
                    i0Var.f10712c = false;
                }
                break;
            case 1:
                y0 y0Var3 = this.f10847b;
                y0Var3.f10849f.a().u(y0Var3.A);
                break;
            default:
                y0 y0Var4 = this.f10847b;
                l0 l0Var3 = y0Var4.f10849f;
                h1 h1Var = l0Var3.a().f10694q;
                if (h1Var == null || (placementScope = h1Var.f10773l) == null) {
                    placementScope = ((r2.u) k0.a(l0Var3.f10729a)).getPlacementScope();
                }
                h9.k kVar = y0Var4.F;
                if (kVar == null) {
                    h1 h1VarA = l0Var3.a();
                    long j5 = y0Var4.G;
                    float f10 = y0Var4.H;
                    placementScope.getClass();
                    o2.u0.b(placementScope, h1VarA);
                    h1VarA.T(n3.j.c(j5, h1VarA.f9439e), f10, null);
                } else {
                    h1 h1VarA2 = l0Var3.a();
                    long j10 = y0Var4.G;
                    float f11 = y0Var4.H;
                    placementScope.getClass();
                    o2.u0.b(placementScope, h1VarA2);
                    h1VarA2.T(n3.j.c(j10, h1VarA2.f9439e), f11, kVar);
                }
                break;
        }
        return t8.z.f12851a;
    }
}
