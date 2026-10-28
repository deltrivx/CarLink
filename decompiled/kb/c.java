package kb;

import aa.e;
import aa.j0;
import gb.o;
import i9.l;
import jb.b0;
import jb.i;
import lb.p;
import ra.e0;
import ra.g0;
import ra.m0;
import ra.n0;
import u0.k;
import x9.d0;
import x9.y;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c extends j0 implements d0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final sa.a f7496g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final k f7497h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final da.a f7498i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public g0 f7499j;
    public p k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(wa.c cVar, mb.k kVar, y yVar, g0 g0Var, sa.a aVar) {
        super(yVar, cVar);
        l.e(cVar, "fqName");
        l.e(yVar, "module");
        this.f7496g = aVar;
        n0 n0Var = g0Var.f11952d;
        l.d(n0Var, "getStrings(...)");
        m0 m0Var = g0Var.f11953e;
        l.d(m0Var, "getQualifiedNames(...)");
        k kVar2 = new k(n0Var, m0Var);
        this.f7497h = kVar2;
        this.f7498i = new da.a(g0Var, kVar2, aVar, new b0(this));
        this.f7499j = g0Var;
    }

    public final void D0(i iVar) {
        l.e(iVar, "components");
        g0 g0Var = this.f7499j;
        if (g0Var == null) {
            throw new IllegalStateException("Repeated call to DeserializedPackageFragmentImpl::initialize");
        }
        this.f7499j = null;
        e0 e0Var = g0Var.f11954f;
        l.d(e0Var, "getPackage(...)");
        this.k = new p(this, e0Var, this.f7497h, this.f7496g, null, iVar, "scope of " + this, new e(14, this));
    }

    @Override // x9.d0
    public final o U() {
        p pVar = this.k;
        if (pVar != null) {
            return pVar;
        }
        l.j("_memberScope");
        throw null;
    }

    @Override // aa.j0, aa.q
    public final String toString() {
        return "builtins package fragment for " + this.f364e + " from " + db.e.j(this);
    }
}
