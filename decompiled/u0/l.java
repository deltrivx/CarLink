package u0;

import f1.k1;
import l0.u0;
import q2.h1;
import w0.t1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class l extends r1.o implements q2.k, q2.p, q2.l {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public b f12992o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public u0 f12993p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public t1 f12994q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final k1 f12995r = f1.b.s(null);

    public l(b bVar, u0 u0Var, t1 t1Var) {
        this.f12992o = bVar;
        this.f12993p = u0Var;
        this.f12994q = t1Var;
    }

    @Override // q2.p
    public final void U(h1 h1Var) {
        this.f12995r.setValue(h1Var);
    }

    @Override // r1.o
    public final void q0() {
        b bVar = this.f12992o;
        if (bVar.f12967a != null) {
            c0.b.c("Expected textInputModifierNode to be null");
        }
        bVar.f12967a = this;
    }

    @Override // r1.o
    public final void s0() {
        this.f12992o.k(this);
    }
}
