package hc;

import cc.b0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class p extends cc.a implements a9.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y8.c f6533d;

    public p(y8.c cVar, y8.h hVar) {
        super(hVar, true);
        this.f6533d = cVar;
    }

    @Override // cc.h1
    public void A(Object obj) {
        this.f6533d.resumeWith(b0.u(obj));
    }

    @Override // cc.h1
    public final boolean R() {
        return true;
    }

    @Override // a9.d
    public final a9.d getCallerFrame() {
        y8.c cVar = this.f6533d;
        if (cVar instanceof a9.d) {
            return (a9.d) cVar;
        }
        return null;
    }

    @Override // cc.h1
    public void y(Object obj) {
        a.h(b0.u(obj), n4.h.L(this.f6533d));
    }
}
