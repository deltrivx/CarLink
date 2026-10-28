package aa;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class h extends r implements x9.q0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final mb.n f339e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ga.o f340f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List f341g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final g f342h;

    static {
        i9.y.f6689a.g(new i9.r(h.class, "constructors", "getConstructors()Ljava/util/Collection;", 0));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(mb.n nVar, x9.k kVar, y9.h hVar, wa.e eVar, ga.o oVar) {
        super(kVar, hVar, eVar, x9.n0.f14716e0);
        i9.l.e(nVar, "storageManager");
        i9.l.e(kVar, "containingDeclaration");
        i9.l.e(oVar, "visibilityImpl");
        this.f339e = nVar;
        this.f340f = oVar;
        ((mb.k) nVar).a(new e(0, this));
        this.f342h = new g(this);
    }

    @Override // aa.r
    /* JADX INFO: renamed from: B0 */
    public final x9.l a() {
        return this;
    }

    @Override // x9.w
    public final boolean G() {
        return false;
    }

    @Override // x9.i
    public final boolean H() {
        return nb.u0.c(((lb.s) this).E0(), new a(1, this), null);
    }

    @Override // x9.k
    public final Object J(x9.m mVar, Object obj) {
        return mVar.h(this, obj);
    }

    @Override // aa.r, aa.q, x9.k, x9.b
    public final x9.h a() {
        return this;
    }

    @Override // aa.r, aa.q, x9.k, x9.b
    public final x9.k a() {
        return this;
    }

    @Override // x9.w, x9.n
    public final ga.o d() {
        return this.f340f;
    }

    @Override // x9.i
    public final List q() {
        List list = this.f341g;
        if (list != null) {
            return list;
        }
        i9.l.j("declaredTypeParametersImpl");
        throw null;
    }

    @Override // x9.w
    public final boolean s() {
        return false;
    }

    @Override // x9.h
    public final nb.k0 t() {
        return this.f342h;
    }

    @Override // aa.q
    public final String toString() {
        return "typealias " + getName().b();
    }

    @Override // x9.w
    public final boolean u0() {
        return false;
    }
}
