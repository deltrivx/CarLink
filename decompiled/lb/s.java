package lb;

import aa.f0;
import java.util.List;
import nb.a0;
import nb.h0;
import nb.k0;
import nb.r0;
import nb.x0;
import ra.u0;
import x9.v;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class s extends aa.h implements k {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final u0 f8359i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ta.f f8360j;
    public final f0 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ta.g f8361l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final j f8362m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public a0 f8363n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public a0 f8364o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public List f8365p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public a0 f8366q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(mb.n nVar, x9.k kVar, y9.h hVar, wa.e eVar, ga.o oVar, u0 u0Var, ta.f fVar, f0 f0Var, ta.g gVar, j jVar) {
        super(nVar, kVar, hVar, eVar, oVar);
        i9.l.e(nVar, "storageManager");
        i9.l.e(kVar, "containingDeclaration");
        i9.l.e(oVar, "visibility");
        i9.l.e(u0Var, "proto");
        i9.l.e(fVar, "nameResolver");
        i9.l.e(f0Var, "typeTable");
        i9.l.e(gVar, "versionRequirementTable");
        this.f8359i = u0Var;
        this.f8360j = fVar;
        this.k = f0Var;
        this.f8361l = gVar;
        this.f8362m = jVar;
    }

    @Override // lb.k
    public final xa.a A() {
        return this.f8359i;
    }

    public final x9.e C0() {
        if (nb.c.j(D0())) {
            return null;
        }
        x9.h hVarL = D0().D0().l();
        if (hVarL instanceof x9.e) {
            return (x9.e) hVarL;
        }
        return null;
    }

    public final a0 D0() {
        a0 a0Var = this.f8364o;
        if (a0Var != null) {
            return a0Var;
        }
        i9.l.j("expandedType");
        throw null;
    }

    public final a0 E0() {
        a0 a0Var = this.f8363n;
        if (a0Var != null) {
            return a0Var;
        }
        i9.l.j("underlyingType");
        throw null;
    }

    public final void F0(List list, a0 a0Var, a0 a0Var2) {
        gb.o oVarT0;
        a0 a0VarV;
        i9.l.e(a0Var, "underlyingType");
        i9.l.e(a0Var2, "expandedType");
        this.f341g = list;
        this.f8363n = a0Var;
        this.f8364o = a0Var2;
        this.f8365p = v.c(this);
        x9.e eVarC0 = C0();
        if (eVarC0 == null || (oVarT0 = eVarC0.t0()) == null) {
            oVarT0 = gb.n.f6198b;
        }
        gb.o oVar = oVarT0;
        aa.f fVar = new aa.f();
        pb.i iVar = nb.u0.f9041a;
        if (pb.l.f(this)) {
            a0VarV = pb.l.c(pb.k.UNABLE_TO_SUBSTITUTE_TYPE, toString());
        } else {
            k0 k0VarT = t();
            if (k0VarT == null) {
                nb.u0.a(12);
                throw null;
            }
            List listD = nb.u0.d(((aa.g) k0VarT).n());
            h0.f8997b.getClass();
            a0VarV = nb.c.v(h0.f8998c, k0VarT, listD, false, oVar, fVar);
        }
        this.f8366q = a0VarV;
    }

    @Override // lb.k
    public final f0 R() {
        return this.k;
    }

    @Override // lb.k
    public final ta.f Y() {
        return this.f8360j;
    }

    @Override // lb.k
    public final j Z() {
        return this.f8362m;
    }

    @Override // x9.p0
    public final x9.l e(r0 r0Var) {
        i9.l.e(r0Var, "substitutor");
        if (r0Var.f9029a.e()) {
            return this;
        }
        x9.k kVarL = l();
        i9.l.d(kVarL, "getContainingDeclaration(...)");
        y9.h annotations = getAnnotations();
        i9.l.d(annotations, "<get-annotations>(...)");
        wa.e name = getName();
        i9.l.d(name, "getName(...)");
        s sVar = new s(this.f339e, kVarL, annotations, name, this.f340f, this.f8359i, this.f8360j, this.k, this.f8361l, this.f8362m);
        List listQ = q();
        a0 a0VarE0 = E0();
        x0 x0Var = x0.INVARIANT;
        sVar.F0(listQ, nb.c.b(r0Var.g(a0VarE0, x0Var)), nb.c.b(r0Var.g(D0(), x0Var)));
        return sVar;
    }

    @Override // x9.h
    public final a0 n() {
        a0 a0Var = this.f8366q;
        if (a0Var != null) {
            return a0Var;
        }
        i9.l.j("defaultTypeImpl");
        throw null;
    }
}
