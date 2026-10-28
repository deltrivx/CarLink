package c1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class z1 extends i9.n implements h9.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i2 f2364b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z1(i2 i2Var, int i7) {
        super(1);
        this.f2363a = i7;
        this.f2364b = i2Var;
    }

    @Override // h9.k
    public final Object invoke(Object obj) {
        int i7;
        switch (this.f2363a) {
            case 0:
                this.f2364b.f1931j.g((int) (((n3.m) obj).f8746a >> 32));
                return t8.z.f12851a;
            case 1:
                float fFloatValue = ((Number) obj).floatValue();
                i2 i2Var = this.f2364b;
                f1.g1 g1Var = i2Var.f1925d;
                n9.a aVar = i2Var.f1924c;
                float fL = n3.r.l(fFloatValue, aVar.f8963a, aVar.f8964b);
                int i10 = i2Var.f1922a;
                boolean z10 = false;
                if (i10 > 0 && (i7 = i10 + 1) >= 0) {
                    float fAbs = fL;
                    float f10 = fAbs;
                    int i11 = 0;
                    while (true) {
                        float fE = n3.r.E(aVar.f8963a, aVar.f8964b, i11 / i7);
                        float f11 = fE - fL;
                        if (Math.abs(f11) <= fAbs) {
                            fAbs = Math.abs(f11);
                            f10 = fE;
                        }
                        if (i11 != i7) {
                            i11++;
                        } else {
                            fL = f10;
                        }
                    }
                }
                if (fL != g1Var.f()) {
                    if (fL != g1Var.f()) {
                        h9.k kVar = i2Var.f1926e;
                        if (kVar != null) {
                            kVar.invoke(Float.valueOf(fL));
                        } else {
                            i2Var.c(fL);
                        }
                    }
                    h9.a aVar2 = i2Var.f1923b;
                    if (aVar2 != null) {
                        aVar2.invoke();
                    }
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            default:
                long j5 = ((x1.b) obj).f14521a;
                i2 i2Var2 = this.f2364b;
                i2Var2.a(0.0f);
                i2Var2.f1932l.invoke();
                return t8.z.f12851a;
        }
    }
}
