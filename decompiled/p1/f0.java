package p1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f f10034e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f10035f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f10036g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public h9.k f10037h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f10038i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(f fVar, h9.k kVar, boolean z10, boolean z11) {
        h9.k kVarE;
        super(0L, j.f10047e);
        o7.q qVar = l.f10055a;
        this.f10034e = fVar;
        this.f10035f = z10;
        this.f10036g = z11;
        this.f10037h = l.l(kVar, (fVar == null || (kVarE = fVar.e()) == null) ? l.f10064j.f10001e : kVarE, z10);
        this.f10038i = n1.h.b();
    }

    @Override // p1.f
    public final void c() {
        f fVar;
        this.f10032c = true;
        if (!this.f10036g || (fVar = this.f10034e) == null) {
            return;
        }
        fVar.c();
    }

    @Override // p1.f
    public final j d() {
        return v().d();
    }

    @Override // p1.f
    public final h9.k e() {
        return this.f10037h;
    }

    @Override // p1.f
    public final boolean f() {
        return v().f();
    }

    @Override // p1.f
    public final long g() {
        return v().g();
    }

    @Override // p1.f
    public final h9.k i() {
        return null;
    }

    @Override // p1.f
    public final void k() {
        q.h();
        throw null;
    }

    @Override // p1.f
    public final void l() {
        q.h();
        throw null;
    }

    @Override // p1.f
    public final void m() {
        v().m();
    }

    @Override // p1.f
    public final void n(z zVar) {
        v().n(zVar);
    }

    @Override // p1.f
    public final f u(h9.k kVar) {
        h9.k kVarL = l.l(kVar, this.f10037h, true);
        return !this.f10035f ? l.h(v().u(null), kVarL, true) : v().u(kVarL);
    }

    public final f v() {
        f fVar = this.f10034e;
        return fVar == null ? l.f10064j : fVar;
    }
}
