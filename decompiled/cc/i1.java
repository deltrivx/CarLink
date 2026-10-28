package cc;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class i1 extends o1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y8.c f2631d;

    public i1(y8.h hVar, h9.n nVar) {
        super(hVar, false);
        this.f2631d = n4.h.x(nVar, this, this);
    }

    @Override // cc.h1
    public final void X() {
        try {
            hc.a.h(t8.z.f12851a, n4.h.L(this.f2631d));
        } catch (Throwable th) {
            resumeWith(t8.a.b(th));
            throw th;
        }
    }
}
