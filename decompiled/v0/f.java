package v0;

import b3.r0;
import cc.s;
import o2.l0;
import o2.n0;
import o2.o0;
import q2.h1;
import q2.j0;
import q2.p0;
import q2.x;
import w0.d1;
import w0.e0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class f extends q2.m implements x, q2.o, q2.p {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public h f13529q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final n f13530r;

    public f(b3.h hVar, r0 r0Var, f3.d dVar, h9.k kVar, int i7, boolean z10, int i10, int i11, h hVar2, y1.r rVar) {
        this.f13529q = hVar2;
        n nVar = new n(hVar, r0Var, dVar, kVar, i7, z10, i10, i11, hVar2, rVar);
        A0(nVar);
        this.f13530r = nVar;
        if (this.f13529q != null) {
            return;
        }
        c0.b.b("Do not use SelectionCapableStaticTextModifier unless selectionController != null");
        throw new s();
    }

    @Override // q2.o
    public final /* synthetic */ void H() {
    }

    @Override // q2.p
    public final void U(h1 h1Var) {
        h hVar = this.f13529q;
        if (hVar != null) {
            hVar.f13536d = k.a(hVar.f13536d, h1Var, null, 2);
            d1 d1Var = hVar.f13534b;
            long j5 = hVar.f13533a;
            d1Var.f13762a = false;
            e0 e0Var = d1Var.f13766e;
            if (e0Var != null) {
                e0Var.invoke(Long.valueOf(j5));
            }
        }
    }

    @Override // q2.x
    public final n0 b(o0 o0Var, l0 l0Var, long j5) {
        return this.f13530r.b(o0Var, l0Var, j5);
    }

    @Override // q2.x
    public final int c(p0 p0Var, l0 l0Var, int i7) {
        return this.f13530r.c(p0Var, l0Var, i7);
    }

    @Override // q2.x
    public final int d(p0 p0Var, l0 l0Var, int i7) {
        return this.f13530r.d(p0Var, l0Var, i7);
    }

    @Override // q2.x
    public final int e(p0 p0Var, l0 l0Var, int i7) {
        return this.f13530r.e(p0Var, l0Var, i7);
    }

    @Override // q2.x
    public final int f(p0 p0Var, l0 l0Var, int i7) {
        return this.f13530r.f(p0Var, l0Var, i7);
    }

    @Override // r1.o
    public final boolean n0() {
        return false;
    }

    @Override // q2.o
    public final void x(j0 j0Var) throws Throwable {
        this.f13530r.x(j0Var);
    }
}
