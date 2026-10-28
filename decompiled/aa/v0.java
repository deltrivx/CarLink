package aa;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class v0 extends z implements u0 {
    public static final k0 G;
    public final mb.n D;
    public final x9.q0 E;
    public m F;

    static {
        i9.y.f6689a.g(new i9.r(v0.class, "withDispatchReceiver", "getWithDispatchReceiver()Lorg/jetbrains/kotlin/descriptors/impl/TypeAliasConstructorDescriptor;", 0));
        G = new k0();
    }

    public v0(mb.n nVar, x9.q0 q0Var, m mVar, u0 u0Var, y9.h hVar, int i7, x9.n0 n0Var) {
        super(i7, wa.g.f14255e, q0Var, u0Var, n0Var, hVar);
        this.D = nVar;
        this.E = q0Var;
        j jVar = new j(2, this, mVar);
        mb.k kVar = (mb.k) nVar;
        kVar.getClass();
        new mb.h(kVar, jVar);
        this.F = mVar;
    }

    @Override // aa.z
    public final z E0(int i7, wa.e eVar, x9.k kVar, x9.t tVar, x9.n0 n0Var, y9.h hVar) {
        i9.l.e(kVar, "newOwner");
        a2.f.M(i7, "kind");
        i9.l.e(hVar, "annotations");
        if (i7 != 1) {
        }
        return new v0(this.D, this.E, this.F, this, hVar, 1, n0Var);
    }

    @Override // aa.z, aa.r, aa.q, x9.k, x9.b
    /* JADX INFO: renamed from: N0, reason: merged with bridge method [inline-methods] */
    public final u0 a() {
        x9.t tVarA = super.a();
        i9.l.c(tVarA, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
        return (u0) tVarA;
    }

    @Override // aa.z, x9.t, x9.p0
    /* JADX INFO: renamed from: O0, reason: merged with bridge method [inline-methods] */
    public final v0 e(nb.r0 r0Var) {
        i9.l.e(r0Var, "substitutor");
        x9.t tVarE = super.e(r0Var);
        i9.l.c(tVarE, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptorImpl");
        v0 v0Var = (v0) tVarE;
        nb.w wVar = v0Var.f478g;
        i9.l.b(wVar);
        m mVarE = this.F.B0().e(nb.r0.d(wVar));
        if (mVarE == null) {
            return null;
        }
        v0Var.F = mVarE;
        return v0Var;
    }

    @Override // aa.z, x9.c
    public final x9.c W(x9.e eVar, x9.x xVar, ga.o oVar) {
        i9.l.e(eVar, "newOwner");
        i9.l.e(oVar, "visibility");
        a2.f.M(2, "kind");
        y yVarI0 = I0(nb.r0.f9028b);
        yVarI0.f449b = eVar;
        yVarI0.f450c = xVar;
        yVarI0.f451d = oVar;
        yVarI0.f453f = 2;
        yVarI0.f459m = false;
        hb.d dVarF0 = yVarI0.f470x.F0(yVarI0);
        i9.l.c(dVarF0, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
        return (u0) dVarF0;
    }

    @Override // aa.r, x9.k
    public final x9.i l() {
        return this.E;
    }

    @Override // aa.r, x9.k
    public final x9.k l() {
        return this.E;
    }

    @Override // aa.z, x9.b
    public final nb.w p() {
        nb.w wVar = this.f478g;
        i9.l.b(wVar);
        return wVar;
    }

    @Override // x9.j
    public final boolean x() {
        return this.F.D;
    }

    @Override // x9.j
    public final x9.e y() {
        x9.e eVarY = this.F.y();
        i9.l.d(eVarY, "getConstructedClass(...)");
        return eVarY;
    }
}
