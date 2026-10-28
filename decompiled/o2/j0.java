package o2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class j0 extends u0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f9358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f9359c;

    public /* synthetic */ j0(int i7, Object obj) {
        this.f9358b = i7;
        this.f9359c = obj;
    }

    @Override // n3.c
    public final float O() {
        switch (this.f9358b) {
            case 0:
                return ((q2.p0) this.f9359c).O();
            default:
                return ((r2.u) this.f9359c).getDensity().O();
        }
    }

    @Override // n3.c
    public final float a() {
        switch (this.f9358b) {
            case 0:
                return ((q2.p0) this.f9359c).a();
            default:
                return ((r2.u) this.f9359c).getDensity().a();
        }
    }

    @Override // o2.u0
    public float c(o oVar) {
        float fIntBitsToFloat;
        int iC0;
        switch (this.f9358b) {
            case 0:
                h9.n nVar = oVar.f9387a;
                if (nVar != null) {
                    return ((Number) nVar.invoke(this, Float.valueOf(Float.NaN))).floatValue();
                }
                q2.p0 p0Var = (q2.p0) this.f9359c;
                if (p0Var.k) {
                    return Float.NaN;
                }
                q2.p0 p0Var2 = p0Var;
                while (true) {
                    p.p pVar = p0Var2.f10774m;
                    float f10 = (pVar == null || (iC0 = u8.l.C0(oVar, (o[]) pVar.f9860b)) < 0) ? Float.NaN : ((float[]) pVar.f9861c)[iC0];
                    if (!Float.isNaN(f10)) {
                        p0Var2.Y(p0Var.n0(), oVar);
                        w wVarL0 = p0Var2.l0();
                        w wVarL1 = p0Var.l0();
                        switch (oVar.f9388b) {
                            case 0:
                                fIntBitsToFloat = Float.intBitsToFloat((int) (wVarL1.n(wVarL0, (((long) Float.floatToRawIntBits(f10)) & 4294967295L) | (((long) Float.floatToRawIntBits(((int) (wVarL0.l() >> 32)) / 2.0f)) << 32)) & 4294967295L));
                                break;
                            default:
                                fIntBitsToFloat = Float.intBitsToFloat((int) (wVarL1.n(wVarL0, (((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(((int) (wVarL0.l() & 4294967295L)) / 2.0f)) & 4294967295L)) >> 32));
                                break;
                        }
                        return fIntBitsToFloat;
                    }
                    q2.p0 p0VarP0 = p0Var2.p0();
                    if (p0VarP0 == null) {
                        p0Var2.Y(p0Var.n0(), oVar);
                        return Float.NaN;
                    }
                    p0Var2 = p0VarP0;
                }
                break;
            default:
                return super.c(oVar);
        }
    }

    @Override // o2.u0
    public final n3.o d() {
        switch (this.f9358b) {
            case 0:
                return ((q2.p0) this.f9359c).getLayoutDirection();
            default:
                return ((r2.u) this.f9359c).getLayoutDirection();
        }
    }

    @Override // o2.u0
    public final int e() {
        switch (this.f9358b) {
            case 0:
                return ((q2.p0) this.f9359c).K();
            default:
                return ((r2.u) this.f9359c).getRoot().F.f10743p.f9435a;
        }
    }
}
