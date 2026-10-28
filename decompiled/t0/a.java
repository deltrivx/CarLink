package t0;

import k2.h0;
import k2.m0;
import k2.n;
import k2.o;
import n3.c;
import q2.b2;
import q2.d;
import q2.f;
import q2.m;
import q2.v1;
import q7.g;
import w1.e;
import w1.p;
import w1.r;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a extends m implements v1, e, p {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public h9.a f12722q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f12723r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final m0 f12724s;

    public a(h9.a aVar) {
        this.f12722q = aVar;
        m0 m0VarA = h0.a(new g(2, this));
        A0(m0VarA);
        this.f12724s = m0VarA;
    }

    @Override // q2.v1
    public final /* synthetic */ void I() {
    }

    @Override // q2.v1
    public final /* synthetic */ boolean d0() {
        return false;
    }

    @Override // q2.v1
    public final void g0() {
        z();
    }

    @Override // q2.v1
    public final void l0(n nVar, o oVar, long j5) {
        this.f12724s.l0(nVar, oVar, j5);
    }

    @Override // q2.v1
    public final long m() {
        q2.n nVar = androidx.compose.foundation.text.handwriting.a.f875a;
        c cVar = f.v(this).f10689x;
        nVar.getClass();
        int i7 = b2.f10597b;
        return d.c(cVar.a0(nVar.f10752a), cVar.a0(nVar.f10753b), cVar.a0(nVar.f10754c), cVar.a0(nVar.f10755d));
    }

    @Override // w1.e
    public final void r(r rVar) {
        this.f12723r = rVar.b();
    }

    @Override // r1.o
    public final void r0() {
        z();
    }

    @Override // q2.v1
    public final void z() {
        this.f12724s.z();
    }
}
