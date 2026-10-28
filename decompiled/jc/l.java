package jc;

import cc.u;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class l extends u {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l f7131c = new l();

    @Override // cc.u
    public final void g(y8.h hVar, Runnable runnable) {
        e.f7119d.f7121c.b(runnable, true, false);
    }

    @Override // cc.u
    public final String toString() {
        return "Dispatchers.IO";
    }

    @Override // cc.u
    public final void u(y8.h hVar, Runnable runnable) {
        e.f7119d.f7121c.b(runnable, true, true);
    }

    @Override // cc.u
    public final u w(int i7) {
        hc.a.a(i7);
        return i7 >= k.f7128d ? this : super.w(i7);
    }
}
