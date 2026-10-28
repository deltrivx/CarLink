package v1;

import h9.k;
import i9.l;
import l0.o0;
import n3.n;
import q2.j0;
import q2.l1;
import r1.o;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b extends o implements l1, a, q2.o {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final c f13589o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f13590p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public k f13591q;

    public b(c cVar, k kVar) {
        this.f13589o = cVar;
        this.f13591q = kVar;
        cVar.f13592a = this;
    }

    public final void A0() {
        this.f13590p = false;
        this.f13589o.f13593b = null;
        q2.f.l(this);
    }

    @Override // q2.o
    public final void H() {
        A0();
    }

    @Override // q2.l1
    public final void X() {
        A0();
    }

    @Override // v1.a
    public final n3.c a() {
        return q2.f.v(this).f10689x;
    }

    @Override // v1.a
    public final long g() {
        return n.M0(q2.f.t(this, 128).f9437c);
    }

    @Override // v1.a
    public final n3.o getLayoutDirection() {
        return q2.f.v(this).f10690y;
    }

    @Override // r1.o
    public final void r0() {
        A0();
    }

    @Override // r1.o
    public final void s0() {
    }

    @Override // r1.o
    public final void t0() {
        A0();
    }

    @Override // r1.o
    public final void u0() {
        A0();
    }

    @Override // q2.o
    public final void x(j0 j0Var) {
        boolean z10 = this.f13590p;
        c cVar = this.f13589o;
        if (!z10) {
            cVar.f13593b = null;
            q2.f.r(this, new k2.d(6, this, cVar));
            if (cVar.f13593b == null) {
                throw ob.a.o("DrawResult not defined, did you forget to call onDraw?");
            }
            this.f13590p = true;
        }
        o0 o0Var = cVar.f13593b;
        l.b(o0Var);
        ((k) o0Var.f7772b).invoke(j0Var);
    }
}
