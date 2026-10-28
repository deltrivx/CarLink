package p1;

import s.i0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends b {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final b f10024o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f10025p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f10026q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public h9.k f10027r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public h9.k f10028s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final long f10029t;

    /* JADX WARN: Illegal instructions before constructor call */
    public e0(b bVar, h9.k kVar, h9.k kVar2, boolean z10, boolean z11) {
        h9.k kVarI;
        h9.k kVarE;
        o7.q qVar = l.f10055a;
        super(0L, j.f10047e, l.l(kVar, (bVar == null || (kVarE = bVar.e()) == null) ? l.f10064j.f10001e : kVarE, z10), l.b(kVar2, (bVar == null || (kVarI = bVar.i()) == null) ? l.f10064j.f10002f : kVarI));
        this.f10024o = bVar;
        this.f10025p = z10;
        this.f10026q = z11;
        this.f10027r = this.f10001e;
        this.f10028s = this.f10002f;
        this.f10029t = n1.h.b();
    }

    @Override // p1.b
    public final void C(i0 i0Var) {
        q.h();
        throw null;
    }

    @Override // p1.b
    public final b D(h9.k kVar, h9.k kVar2) {
        h9.k kVarL = l.l(kVar, this.f10027r, true);
        h9.k kVarB = l.b(kVar2, this.f10028s);
        return !this.f10025p ? new e0(E().D(null, kVarB), kVarL, kVarB, false, true) : E().D(kVarL, kVarB);
    }

    public final b E() {
        b bVar = this.f10024o;
        return bVar == null ? l.f10064j : bVar;
    }

    @Override // p1.b, p1.f
    public final void c() {
        b bVar;
        this.f10032c = true;
        if (!this.f10026q || (bVar = this.f10024o) == null) {
            return;
        }
        bVar.c();
    }

    @Override // p1.f
    public final j d() {
        return E().d();
    }

    @Override // p1.b, p1.f
    public final h9.k e() {
        return this.f10027r;
    }

    @Override // p1.b, p1.f
    public final boolean f() {
        return E().f();
    }

    @Override // p1.f
    public final long g() {
        return E().g();
    }

    @Override // p1.b, p1.f
    public final int h() {
        return E().h();
    }

    @Override // p1.b, p1.f
    public final h9.k i() {
        return this.f10028s;
    }

    @Override // p1.b, p1.f
    public final void k() {
        q.h();
        throw null;
    }

    @Override // p1.b, p1.f
    public final void l() {
        q.h();
        throw null;
    }

    @Override // p1.b, p1.f
    public final void m() {
        E().m();
    }

    @Override // p1.b, p1.f
    public final void n(z zVar) {
        E().n(zVar);
    }

    @Override // p1.f
    public final void r(j jVar) {
        q.h();
        throw null;
    }

    @Override // p1.f
    public final void s(long j5) {
        q.h();
        throw null;
    }

    @Override // p1.b, p1.f
    public final void t(int i7) {
        E().t(i7);
    }

    @Override // p1.b, p1.f
    public final f u(h9.k kVar) {
        h9.k kVarL = l.l(kVar, this.f10027r, true);
        return !this.f10025p ? l.h(E().u(null), kVarL, true) : E().u(kVarL);
    }

    @Override // p1.b
    public final q w() {
        return E().w();
    }

    @Override // p1.b
    public final i0 x() {
        return E().x();
    }

    @Override // p1.b
    /* JADX INFO: renamed from: y */
    public final h9.k e() {
        return this.f10027r;
    }
}
