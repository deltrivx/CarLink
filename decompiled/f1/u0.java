package f1;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class u0 implements d2, cc.w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y8.h f5155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h9.n f5156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hc.c f5157c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public cc.o1 f5158d;

    public u0(y8.h hVar, h9.n nVar) {
        this.f5155a = hVar;
        this.f5156b = nVar;
        this.f5157c = cc.b0.a(hVar.s(hVar.l(q1.c.f10579b) != null ? this : y8.i.f15108a));
    }

    @Override // f1.d2
    public final void c() {
        cc.o1 o1Var = this.f5158d;
        if (o1Var != null) {
            o1Var.C(new k0(1));
        }
        this.f5158d = null;
    }

    @Override // f1.d2
    public final void e() {
        cc.o1 o1Var = this.f5158d;
        if (o1Var != null) {
            o1Var.C(new k0(1));
        }
        this.f5158d = null;
    }

    @Override // f1.d2
    public final void f() {
        cc.o1 o1Var = this.f5158d;
        if (o1Var != null) {
            CancellationException cancellationException = new CancellationException("Old job was still running!");
            cancellationException.initCause(null);
            o1Var.a(cancellationException);
        }
        this.f5158d = cc.b0.s(this.f5157c, null, this.f5156b, 3);
    }

    @Override // y8.f
    public final y8.g getKey() {
        return cc.v.f2677a;
    }

    @Override // y8.h
    public final y8.h h(y8.g gVar) {
        return n3.u.F(this, gVar);
    }

    @Override // y8.h
    public final y8.f l(y8.g gVar) {
        return n3.u.A(this, gVar);
    }

    @Override // cc.w
    public final void p(Throwable th, y8.h hVar) throws Throwable {
        q1.c cVar = (q1.c) hVar.l(q1.c.f10579b);
        if (cVar != null) {
            n3.r.b0(th, new a8.f1(16, cVar, this));
        }
        cc.w wVar = (cc.w) this.f5155a.l(cc.v.f2677a);
        if (wVar == null) {
            throw th;
        }
        wVar.p(th, hVar);
    }

    @Override // y8.h
    public final Object q(h9.n nVar, Object obj) {
        return nVar.invoke(obj, this);
    }

    @Override // y8.h
    public final y8.h s(y8.h hVar) {
        return n3.u.G(this, hVar);
    }
}
