package lc;

import cc.l;
import cc.z1;
import h9.o;
import hc.q;
import hc.s;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import t8.z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b implements cc.j, z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f8369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f8370b;

    public b(c cVar, l lVar) {
        this.f8370b = cVar;
        this.f8369a = lVar;
    }

    @Override // cc.z1
    public final void a(q qVar, int i7) {
        this.f8369a.a(qVar, i7);
    }

    @Override // cc.j
    public final void e(Object obj, o oVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c.f8371h;
        c cVar = this.f8370b;
        atomicReferenceFieldUpdater.set(cVar, null);
        c8.k kVar = new c8.k(19, cVar, this);
        l lVar = this.f8369a;
        lVar.x(z.f12851a, lVar.f2632c, new cc.k(0, kVar));
    }

    @Override // cc.j
    public final s f(Object obj, o oVar) {
        c cVar = this.f8370b;
        cc.k kVar = new cc.k(cVar, this);
        s sVarB = this.f8369a.B((z) obj, kVar);
        if (sVarB != null) {
            c.f8371h.set(cVar, null);
        }
        return sVarB;
    }

    @Override // y8.c
    public final y8.h getContext() {
        return this.f8369a.f2641e;
    }

    @Override // y8.c
    public final void resumeWith(Object obj) {
        this.f8369a.resumeWith(obj);
    }

    @Override // cc.j
    public final boolean w(Throwable th) {
        return this.f8369a.w(th);
    }

    @Override // cc.j
    public final void z(Object obj) {
        this.f8369a.z(obj);
    }
}
