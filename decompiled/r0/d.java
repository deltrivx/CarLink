package r0;

import cc.s;
import n3.u;
import n4.h;
import o2.w;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d implements s0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f11079b;

    public d(e eVar, long j5) {
        this.f11079b = eVar;
        this.f11078a = j5;
    }

    @Override // s0.e
    public final x1.c C(w wVar) {
        return u.c(E(wVar), 0L);
    }

    @Override // s0.e
    public final long E(w wVar) {
        w wVar2 = (w) this.f11079b.f11081r.getValue();
        if (wVar2 != null) {
            return wVar.n(wVar2, this.f11078a);
        }
        c0.b.d("Tried to open context menu before the anchor was placed.");
        throw new s();
    }

    @Override // s0.e
    public final o0.c K() {
        return h.r(this.f11079b);
    }
}
