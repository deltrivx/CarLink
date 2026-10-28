package p1;

import a8.j0;
import f1.y0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a extends b {
    @Override // p1.b
    public final b D(h9.k kVar, h9.k kVar2) {
        return (b) ((f) l.f(new j0(new c8.y(10, kVar, kVar2), 10)));
    }

    @Override // p1.b, p1.f
    public final void c() {
        synchronized (l.f10057c) {
            o();
        }
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
        l.a();
    }

    @Override // p1.b, p1.f
    public final f u(h9.k kVar) {
        return (e) ((f) l.f(new j0(new y0(kVar, 2), 10)));
    }

    @Override // p1.b
    public final q w() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
    }
}
