package lb;

import aa.f0;
import aa.p0;
import ra.i0;
import x9.k0;
import x9.n0;
import x9.x;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class q extends p0 implements b {
    public final i0 A;
    public final ta.f B;
    public final f0 C;
    public final ta.g D;
    public final j E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(x9.k kVar, k0 k0Var, y9.h hVar, x xVar, ga.o oVar, boolean z10, wa.e eVar, int i7, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, i0 i0Var, ta.f fVar, f0 f0Var, ta.g gVar, j jVar) {
        super(kVar, k0Var, hVar, xVar, oVar, z10, eVar, i7, n0.f14716e0, z11, z12, z15, z13, z14);
        i9.l.e(kVar, "containingDeclaration");
        i9.l.e(hVar, "annotations");
        i9.l.e(xVar, "modality");
        i9.l.e(oVar, "visibility");
        i9.l.e(eVar, "name");
        a2.f.M(i7, "kind");
        i9.l.e(i0Var, "proto");
        i9.l.e(fVar, "nameResolver");
        i9.l.e(f0Var, "typeTable");
        i9.l.e(gVar, "versionRequirementTable");
        this.A = i0Var;
        this.B = fVar;
        this.C = f0Var;
        this.D = gVar;
        this.E = jVar;
    }

    @Override // lb.k
    public final xa.a A() {
        return this.A;
    }

    @Override // aa.p0
    public final p0 E0(x9.k kVar, x xVar, ga.o oVar, k0 k0Var, int i7, wa.e eVar) {
        i9.l.e(kVar, "newOwner");
        i9.l.e(xVar, "newModality");
        i9.l.e(oVar, "newVisibility");
        a2.f.M(i7, "kind");
        i9.l.e(eVar, "newName");
        return new q(kVar, k0Var, getAnnotations(), xVar, oVar, this.f404f, eVar, i7, this.f411n, this.f412o, s(), this.f415r, this.f413p, this.A, this.B, this.C, this.D, this.E);
    }

    @Override // lb.k
    public final f0 R() {
        return this.C;
    }

    @Override // lb.k
    public final ta.f Y() {
        return this.B;
    }

    @Override // lb.k
    public final j Z() {
        return this.E;
    }

    @Override // aa.p0, x9.w
    public final boolean s() {
        return ta.d.E.i(this.A.f12009d).booleanValue();
    }
}
