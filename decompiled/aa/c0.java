package aa;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends q implements x9.h0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ o9.u[] f321h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h0 f322c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final wa.c f323d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final mb.i f324e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final mb.i f325f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final gb.k f326g;

    static {
        i9.r rVar = new i9.r(c0.class, "fragments", "getFragments()Ljava/util/List;", 0);
        i9.z zVar = i9.y.f6689a;
        f321h = new o9.u[]{zVar.g(rVar), ob.a.v(c0.class, "empty", "getEmpty()Z", 0, zVar)};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public c0(h0 h0Var, wa.c cVar, mb.k kVar) {
        i9.l.e(cVar, "fqName");
        i9.l.e(kVar, "storageManager");
        wa.d dVar = cVar.f14240a;
        super(y9.g.f15129a, dVar.c() ? wa.d.f14242e : dVar.f());
        this.f322c = h0Var;
        this.f323d = cVar;
        this.f324e = new mb.i(kVar, new b0(this, 0));
        this.f325f = new mb.i(kVar, new b0(this, 1));
        this.f326g = new gb.k(kVar, new b0(this, 2));
    }

    @Override // x9.k
    public final Object J(x9.m mVar, Object obj) {
        return mVar.N(this, obj);
    }

    public final boolean equals(Object obj) {
        x9.h0 h0Var = obj instanceof x9.h0 ? (x9.h0) obj : null;
        if (h0Var == null) {
            return false;
        }
        c0 c0Var = (c0) h0Var;
        return i9.l.a(this.f323d, c0Var.f323d) && i9.l.a(this.f322c, c0Var.f322c);
    }

    public final int hashCode() {
        return this.f323d.hashCode() + (this.f322c.hashCode() * 31);
    }

    @Override // x9.k
    public final x9.k l() {
        wa.c cVar = this.f323d;
        if (cVar.f14240a.c()) {
            return null;
        }
        return this.f322c.F(cVar.b());
    }
}
