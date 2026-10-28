package ec;

import cc.b0;
import cc.b1;
import cc.g1;
import cc.h1;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class t extends cc.a implements u, l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h f4736d;

    public t(y8.h hVar, h hVar2) {
        super(hVar, true);
        this.f4736d = hVar2;
    }

    @Override // cc.h1
    public final void C(CancellationException cancellationException) {
        this.f4736d.h(cancellationException, true);
        B(cancellationException);
    }

    @Override // cc.h1, cc.a1
    public final void a(CancellationException cancellationException) {
        Object obj = h1.f2628a.get(this);
        if (obj instanceof cc.r) {
            return;
        }
        if ((obj instanceof g1) && ((g1) obj).e()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new b1(E(), null, this);
        }
        C(cancellationException);
    }

    @Override // ec.w
    public final u0.k c() {
        return this.f4736d.c();
    }

    @Override // cc.a
    public final void e0(Throwable th, boolean z10) {
        if (this.f4736d.h(th, false) || z10) {
            return;
        }
        b0.o(th, this.f2587c);
    }

    @Override // cc.a
    public final void f0(Object obj) {
        k9.a.n(this.f4736d);
    }

    @Override // ec.x
    public final Object g(Object obj, y8.c cVar) {
        return this.f4736d.g(obj, cVar);
    }

    @Override // ec.w
    public final Object i(gc.p pVar) {
        h hVar = this.f4736d;
        hVar.getClass();
        return h.C(hVar, pVar);
    }

    @Override // ec.w
    public final c iterator() {
        h hVar = this.f4736d;
        hVar.getClass();
        return new c(hVar);
    }

    @Override // ec.w
    public final Object k() {
        return this.f4736d.k();
    }

    @Override // ec.w
    public final Object v(y8.c cVar) {
        return this.f4736d.v(cVar);
    }

    @Override // ec.x
    public final Object x(Object obj) {
        return this.f4736d.x(obj);
    }
}
