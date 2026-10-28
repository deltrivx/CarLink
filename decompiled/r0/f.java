package r0;

import a9.i;
import cc.o1;
import f1.f0;
import l0.o0;
import o2.w;
import q2.k;
import q2.m;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class f extends m implements k, s0.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public o0 f11082q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public i f11083r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public h9.k f11084s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public h9.k f11085t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public o1 f11086u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final f0 f11087v = f1.b.o(new a5.e(24, this));

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public x1.c f11088w = x1.c.f14522e;

    /* JADX WARN: Multi-variable type inference failed */
    public f(o0 o0Var, h9.k kVar, h9.k kVar2, h9.k kVar3) {
        this.f11082q = o0Var;
        this.f11083r = (i) kVar;
        this.f11084s = kVar2;
        this.f11085t = kVar3;
    }

    @Override // s0.e
    public final x1.c C(w wVar) {
        x1.c cVar;
        if (this.f11129n && (cVar = (x1.c) this.f11085t.invoke(wVar)) != null) {
            this.f11088w = cVar;
            return cVar;
        }
        return this.f11088w;
    }

    @Override // s0.e
    public final long E(w wVar) {
        return C(wVar).d();
    }

    @Override // s0.e
    public final o0.c K() {
        return (o0.c) this.f11087v.getValue();
    }

    @Override // r1.o
    public final void q0() {
        this.f11082q.f7772b = this;
    }

    @Override // r1.o
    public final void s0() {
        this.f11082q.f7772b = null;
    }
}
