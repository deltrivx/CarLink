package q2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class j0 implements a2.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a2.c f10720a = new a2.c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o f10721b;

    @Override // n3.c
    public final long F(float f10) {
        return this.f10720a.F(f10);
    }

    @Override // n3.c
    public final float J(int i7) {
        return this.f10720a.J(i7);
    }

    @Override // n3.c
    public final float L(float f10) {
        return f10 / this.f10720a.a();
    }

    @Override // n3.c
    public final float O() {
        return this.f10720a.O();
    }

    @Override // a2.g
    public final void P(float f10, long j5, long j10) {
        this.f10720a.P(f10, j5, j10);
    }

    @Override // n3.c
    public final float R(float f10) {
        return this.f10720a.a() * f10;
    }

    @Override // a2.g
    public final void S(y1.e0 e0Var, y1.m mVar, float f10, a2.h hVar, int i7) {
        this.f10720a.S(e0Var, mVar, f10, hVar, i7);
    }

    @Override // a2.g
    public final void V(y1.e0 e0Var, long j5, a2.h hVar) {
        this.f10720a.V(e0Var, j5, hVar);
    }

    @Override // a2.g
    public final a2.b W() {
        return this.f10720a.f16b;
    }

    @Override // a2.g
    public final void Z(long j5, long j10, long j11, int i7) {
        this.f10720a.Z(j5, j10, j11, i7);
    }

    @Override // n3.c
    public final float a() {
        return this.f10720a.a();
    }

    @Override // n3.c
    public final int a0(float f10) {
        a2.c cVar = this.f10720a;
        cVar.getClass();
        return a2.f.j(f10, cVar);
    }

    public final void b() {
        a2.c cVar = this.f10720a;
        y1.o oVarZ = cVar.f16b.z();
        l lVar = this.f10721b;
        if (lVar == null) {
            throw ob.a.o("Attempting to drawContent for a `null` node. This usually means that a call to ContentDrawScope#drawContent() has been captured inside a lambda, and is being invoked outside of the draw pass. Capturing the scope this way is unsupported - if you are trying to record drawContent with graphicsLayer.record(), make sure you are using the GraphicsLayer#record function within DrawScope, instead of the member function on GraphicsLayer.");
        }
        r1.o oVar = (r1.o) lVar;
        r1.o oVarF = oVar.f11117a.f11122f;
        if (oVarF != null && (oVarF.f11120d & 4) != 0) {
            while (true) {
                if (oVarF != null) {
                    int i7 = oVarF.f11119c;
                    if ((i7 & 2) == 0) {
                        if ((i7 & 4) != 0) {
                            break;
                        } else {
                            oVarF = oVarF.f11122f;
                        }
                    }
                }
                oVarF = null;
                break;
            }
        } else {
            oVarF = null;
            break;
        }
        if (oVarF == null) {
            h1 h1VarT = f.t(lVar, 4);
            if (h1VarT.G0() == oVar.f11117a) {
                h1VarT = h1VarT.f10693p;
                i9.l.b(h1VarT);
            }
            h1VarT.U0(oVarZ, (b2.c) cVar.f16b.f13c);
            return;
        }
        h1.e eVar = null;
        while (oVarF != null) {
            if (oVarF instanceof o) {
                o oVar2 = (o) oVarF;
                b2.c cVar2 = (b2.c) cVar.f16b.f13c;
                h1 h1VarT2 = f.t(oVar2, 4);
                long jM0 = n3.n.M0(h1VarT2.f9437c);
                h0 h0Var = h1VarT2.f10692o;
                h0Var.getClass();
                ((r2.u) k0.a(h0Var)).getSharedDrawScope().c(oVarZ, jM0, h1VarT2, oVar2, cVar2);
            } else if ((oVarF.f11119c & 4) != 0 && (oVarF instanceof m)) {
                int i10 = 0;
                for (r1.o oVar3 = ((m) oVarF).f10746p; oVar3 != null; oVar3 = oVar3.f11122f) {
                    if ((oVar3.f11119c & 4) != 0) {
                        i10++;
                        if (i10 == 1) {
                            oVarF = oVar3;
                        } else {
                            if (eVar == null) {
                                eVar = new h1.e(new r1.o[16]);
                            }
                            if (oVarF != null) {
                                eVar.b(oVarF);
                                oVarF = null;
                            }
                            eVar.b(oVar3);
                        }
                    }
                }
                if (i10 == 1) {
                }
            }
            oVarF = f.f(eVar);
        }
    }

    public final void c(y1.o oVar, long j5, h1 h1Var, o oVar2, b2.c cVar) {
        o oVar3 = this.f10721b;
        this.f10721b = oVar2;
        n3.o oVar4 = h1Var.f10692o.f10690y;
        a2.c cVar2 = this.f10720a;
        n3.c cVarC = cVar2.f16b.C();
        a2.b bVar = cVar2.f16b;
        n3.o oVarH = bVar.H();
        y1.o oVarZ = bVar.z();
        long J = bVar.J();
        b2.c cVar3 = (b2.c) bVar.f13c;
        bVar.Z(h1Var);
        bVar.a0(oVar4);
        bVar.Y(oVar);
        bVar.b0(j5);
        bVar.f13c = cVar;
        oVar.h();
        try {
            oVar2.x(this);
            oVar.r();
            bVar.Z(cVarC);
            bVar.a0(oVarH);
            bVar.Y(oVarZ);
            bVar.b0(J);
            bVar.f13c = cVar3;
            this.f10721b = oVar3;
        } catch (Throwable th) {
            oVar.r();
            bVar.Z(cVarC);
            bVar.a0(oVarH);
            bVar.Y(oVarZ);
            bVar.b0(J);
            bVar.f13c = cVar3;
            throw th;
        }
    }

    @Override // a2.g
    public final long c0() {
        return this.f10720a.c0();
    }

    public final void d(y1.m mVar, long j5, long j10, float f10, a2.h hVar) {
        a2.c cVar = this.f10720a;
        int i7 = (int) (j5 >> 32);
        int i10 = (int) (j5 & 4294967295L);
        cVar.f15a.f8c.d(Float.intBitsToFloat(i7), Float.intBitsToFloat(i10), Float.intBitsToFloat((int) (j10 >> 32)) + Float.intBitsToFloat(i7), Float.intBitsToFloat(i10) + Float.intBitsToFloat((int) (j10 & 4294967295L)), cVar.c(mVar, hVar, f10, null, 3, 1));
    }

    public final void e(y1.m mVar, long j5, long j10, long j11, float f10, a2.h hVar) {
        a2.c cVar = this.f10720a;
        int i7 = (int) (j5 >> 32);
        int i10 = (int) (j5 & 4294967295L);
        cVar.f15a.f8c.c(Float.intBitsToFloat(i7), Float.intBitsToFloat(i10), Float.intBitsToFloat((int) (j10 >> 32)) + Float.intBitsToFloat(i7), Float.intBitsToFloat((int) (j10 & 4294967295L)) + Float.intBitsToFloat(i10), Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat((int) (j11 & 4294967295L)), cVar.c(mVar, hVar, f10, null, 3, 1));
    }

    @Override // n3.c
    public final long e0(long j5) {
        a2.c cVar = this.f10720a;
        cVar.getClass();
        return a2.f.n(j5, cVar);
    }

    @Override // a2.g
    public final long g() {
        return this.f10720a.f16b.J();
    }

    @Override // a2.g
    public final n3.o getLayoutDirection() {
        return this.f10720a.f15a.f7b;
    }

    @Override // n3.c
    public final float h0(long j5) {
        a2.c cVar = this.f10720a;
        cVar.getClass();
        return a2.f.m(j5, cVar);
    }

    @Override // a2.g
    public final void i0(long j5, long j10, long j11, long j12, a2.h hVar) {
        this.f10720a.i0(j5, j10, j11, j12, hVar);
    }

    @Override // n3.c
    public final long o(long j5) {
        a2.c cVar = this.f10720a;
        cVar.getClass();
        return a2.f.l(j5, cVar);
    }

    @Override // a2.g
    public final void q(y1.f fVar, long j5, long j10, long j11, float f10, y1.k kVar, int i7) {
        this.f10720a.q(fVar, j5, j10, j11, f10, kVar, i7);
    }

    @Override // n3.c
    public final float s(long j5) {
        a2.c cVar = this.f10720a;
        cVar.getClass();
        return a2.f.k(j5, cVar);
    }

    @Override // a2.g
    public final void y(long j5, long j10, long j11, float f10) {
        this.f10720a.y(j5, j10, j11, f10);
    }
}
