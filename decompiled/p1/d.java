package p1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d extends f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h9.k f10016e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f f10017f;

    public d(long j5, j jVar, h9.k kVar, f fVar) {
        super(j5, jVar);
        this.f10016e = kVar;
        this.f10017f = fVar;
        fVar.k();
    }

    @Override // p1.f
    public final void c() {
        f fVar = this.f10017f;
        if (this.f10032c) {
            return;
        }
        if (this.f10031b != fVar.g()) {
            a();
        }
        fVar.l();
        this.f10032c = true;
        synchronized (l.f10057c) {
            o();
        }
    }

    @Override // p1.f
    public final h9.k e() {
        return this.f10016e;
    }

    @Override // p1.f
    public final boolean f() {
        return true;
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
    }

    @Override // p1.f
    public final void n(z zVar) {
        o7.q qVar = l.f10055a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // p1.f
    public final f u(h9.k kVar) {
        return new d(this.f10031b, this.f10030a, l.l(kVar, this.f10016e, true), this.f10017f);
    }
}
