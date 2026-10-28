package lb;

import aa.f0;
import aa.s0;
import aa.z;
import ra.a0;
import x9.n0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class r extends s0 implements b {
    public final a0 D;
    public final ta.f E;
    public final f0 F;
    public final ta.g G;
    public final j H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(x9.k kVar, s0 s0Var, y9.h hVar, wa.e eVar, int i7, a0 a0Var, ta.f fVar, f0 f0Var, ta.g gVar, j jVar, n0 n0Var) {
        super(kVar, s0Var, hVar, eVar, i7, n0Var == null ? n0.f14716e0 : n0Var);
        i9.l.e(kVar, "containingDeclaration");
        i9.l.e(hVar, "annotations");
        a2.f.M(i7, "kind");
        i9.l.e(a0Var, "proto");
        i9.l.e(fVar, "nameResolver");
        i9.l.e(f0Var, "typeTable");
        i9.l.e(gVar, "versionRequirementTable");
        this.D = a0Var;
        this.E = fVar;
        this.F = f0Var;
        this.G = gVar;
        this.H = jVar;
    }

    @Override // lb.k
    public final xa.a A() {
        return this.D;
    }

    @Override // aa.s0, aa.z
    public final z E0(int i7, wa.e eVar, x9.k kVar, x9.t tVar, n0 n0Var, y9.h hVar) {
        i9.l.e(kVar, "newOwner");
        a2.f.M(i7, "kind");
        i9.l.e(hVar, "annotations");
        s0 s0Var = (s0) tVar;
        if (eVar == null) {
            eVar = getName();
            i9.l.d(eVar, "getName(...)");
        }
        r rVar = new r(kVar, s0Var, hVar, eVar, i7, this.D, this.E, this.F, this.G, this.H, n0Var);
        rVar.f492v = this.f492v;
        return rVar;
    }

    @Override // lb.k
    public final f0 R() {
        return this.F;
    }

    @Override // lb.k
    public final ta.f Y() {
        return this.E;
    }

    @Override // lb.k
    public final j Z() {
        return this.H;
    }
}
