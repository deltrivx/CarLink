package z;

import c1.i2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class j0 extends f0 {
    public x0 A;
    public boolean B;
    public h9.o C;
    public h9.o D;
    public boolean E;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public i2 f15414z;

    @Override // z.f0
    public final Object H0(e0 e0Var, e0 e0Var2) {
        i2 i2Var = this.f15414z;
        y8.c cVar = null;
        b1.f fVar = new b1.f(e0Var, this, cVar, 17);
        i2Var.getClass();
        Object objG = cc.b0.g(new b0.g(i2Var, fVar, cVar, 4), e0Var2);
        t8.z zVar = t8.z.f12851a;
        z8.a aVar = z8.a.f15774a;
        if (objG != aVar) {
            objG = zVar;
        }
        return objG == aVar ? objG : zVar;
    }

    @Override // z.f0
    public final void I0(long j5) {
        if (!this.f11129n || i9.l.a(this.C, h0.f15396a)) {
            return;
        }
        cc.b0.s(m0(), null, new i0(this, j5, null, 0), 1);
    }

    @Override // z.f0
    public final void J0(long j5) {
        if (!this.f11129n || i9.l.a(this.D, h0.f15397b)) {
            return;
        }
        cc.b0.s(m0(), null, new i0(this, j5, null, 1), 1);
    }

    @Override // z.f0
    public final boolean K0() {
        return this.B;
    }
}
