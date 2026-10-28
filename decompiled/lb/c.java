package lb;

import aa.f0;
import aa.z;
import x9.n0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c extends aa.m implements b {
    public final ra.n E;
    public final ta.f F;
    public final f0 G;
    public final ta.g H;
    public final j I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(x9.e eVar, x9.j jVar, y9.h hVar, boolean z10, int i7, ra.n nVar, ta.f fVar, f0 f0Var, ta.g gVar, j jVar2, n0 n0Var) {
        super(eVar, jVar, hVar, z10, i7, n0Var == null ? n0.f14716e0 : n0Var);
        i9.l.e(eVar, "containingDeclaration");
        i9.l.e(hVar, "annotations");
        a2.f.M(i7, "kind");
        i9.l.e(nVar, "proto");
        i9.l.e(fVar, "nameResolver");
        i9.l.e(f0Var, "typeTable");
        i9.l.e(gVar, "versionRequirementTable");
        this.E = nVar;
        this.F = fVar;
        this.G = f0Var;
        this.H = gVar;
        this.I = jVar2;
    }

    @Override // lb.k
    public final xa.a A() {
        return this.E;
    }

    @Override // aa.m, aa.z
    public final /* bridge */ /* synthetic */ z E0(int i7, wa.e eVar, x9.k kVar, x9.t tVar, n0 n0Var, y9.h hVar) {
        return T0(kVar, tVar, i7, hVar, n0Var);
    }

    @Override // aa.z, x9.t
    public final boolean N() {
        return false;
    }

    @Override // aa.m
    /* JADX INFO: renamed from: N0 */
    public final /* bridge */ /* synthetic */ aa.m E0(int i7, wa.e eVar, x9.k kVar, x9.t tVar, n0 n0Var, y9.h hVar) {
        return T0(kVar, tVar, i7, hVar, n0Var);
    }

    @Override // lb.k
    public final f0 R() {
        return this.G;
    }

    public final c T0(x9.k kVar, x9.t tVar, int i7, y9.h hVar, n0 n0Var) {
        i9.l.e(kVar, "newOwner");
        a2.f.M(i7, "kind");
        i9.l.e(hVar, "annotations");
        c cVar = new c((x9.e) kVar, (x9.j) tVar, hVar, this.D, i7, this.E, this.F, this.G, this.H, this.I, n0Var);
        cVar.f492v = this.f492v;
        return cVar;
    }

    @Override // lb.k
    public final ta.f Y() {
        return this.F;
    }

    @Override // lb.k
    public final j Z() {
        return this.I;
    }

    @Override // aa.z, x9.t
    public final boolean g() {
        return false;
    }

    @Override // aa.z, x9.t
    public final boolean o() {
        return false;
    }

    @Override // aa.z, x9.w
    public final boolean s() {
        return false;
    }
}
