package q2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class s extends q0 {
    @Override // o2.l0
    public final int H(int i7) {
        u0.k kVarU = this.f10779o.f10692o.u();
        o2.m0 m0VarV0 = kVarU.V0();
        h0 h0Var = (h0) kVarU.f12990b;
        return m0VarV0.j(h0Var.E.f10615d, h0Var.l(), i7);
    }

    @Override // o2.l0
    public final int c(int i7) {
        u0.k kVarU = this.f10779o.f10692o.u();
        o2.m0 m0VarV0 = kVarU.V0();
        h0 h0Var = (h0) kVarU.f12990b;
        return m0VarV0.h(h0Var.E.f10615d, h0Var.l(), i7);
    }

    @Override // q2.p0
    public final int d0(o2.m mVar) {
        u0 u0Var = this.f10779o.f10692o.F.f10744q;
        i9.l.b(u0Var);
        i0 i0Var = u0Var.f10820q;
        l0 l0Var = u0Var.f10810f;
        if (l0Var.f10732d == d0.f10607b) {
            i0Var.f10713d = true;
            if (i0Var.f10711b) {
                l0Var.f10734f = true;
                l0Var.f10735g = true;
            }
        } else {
            i0Var.f10714e = true;
        }
        s sVar = u0Var.f().P;
        if (sVar != null) {
            sVar.k = true;
        }
        u0Var.A();
        s sVar2 = u0Var.f().P;
        if (sVar2 != null) {
            sVar2.k = false;
        }
        Integer num = (Integer) i0Var.f10716g.get(mVar);
        int iIntValue = num != null ? num.intValue() : Integer.MIN_VALUE;
        this.f10784t.h(iIntValue, mVar);
        return iIntValue;
    }

    @Override // o2.l0
    public final int m(int i7) {
        u0.k kVarU = this.f10779o.f10692o.u();
        o2.m0 m0VarV0 = kVarU.V0();
        h0 h0Var = (h0) kVarU.f12990b;
        return m0VarV0.a(h0Var.E.f10615d, h0Var.l(), i7);
    }

    @Override // o2.l0
    public final int r(int i7) {
        u0.k kVarU = this.f10779o.f10692o.u();
        o2.m0 m0VarV0 = kVarU.V0();
        h0 h0Var = (h0) kVarU.f12990b;
        return m0VarV0.f(h0Var.E.f10615d, h0Var.l(), i7);
    }

    @Override // o2.l0
    public final o2.v0 u(long j5) {
        X(j5);
        h1 h1Var = this.f10779o;
        h1.e eVarZ = h1Var.f10692o.z();
        Object[] objArr = eVarZ.f6421a;
        int i7 = eVarZ.f6423c;
        for (int i10 = 0; i10 < i7; i10++) {
            u0 u0Var = ((h0) objArr[i10]).F.f10744q;
            i9.l.b(u0Var);
            u0Var.f10814j = f0.f10640c;
        }
        h0 h0Var = h1Var.f10692o;
        q0.v0(this, h0Var.f10687v.c(this, h0Var.l(), j5));
        return this;
    }

    @Override // q2.q0
    public final void w0() {
        u0 u0Var = this.f10779o.f10692o.F.f10744q;
        i9.l.b(u0Var);
        u0Var.j0();
    }
}
