package aa;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class j0 extends r implements x9.d0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final wa.c f364e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f365f;

    /* JADX WARN: Illegal instructions before constructor call */
    public j0(x9.y yVar, wa.c cVar) {
        i9.l.e(yVar, "module");
        i9.l.e(cVar, "fqName");
        wa.d dVar = cVar.f14240a;
        super(yVar, y9.g.f15129a, dVar.c() ? wa.d.f14242e : dVar.f(), x9.n0.f14716e0);
        this.f364e = cVar;
        this.f365f = "package " + cVar + " of " + yVar;
    }

    @Override // aa.r, x9.k
    /* JADX INFO: renamed from: C0, reason: merged with bridge method [inline-methods] */
    public final x9.y l() {
        x9.k kVarL = super.l();
        i9.l.c(kVarL, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ModuleDescriptor");
        return (x9.y) kVarL;
    }

    @Override // x9.k
    public final Object J(x9.m mVar, Object obj) {
        return mVar.C(this, obj);
    }

    @Override // aa.r, x9.l
    public x9.n0 getSource() {
        return x9.n0.f14716e0;
    }

    @Override // aa.q
    public String toString() {
        return this.f365f;
    }
}
