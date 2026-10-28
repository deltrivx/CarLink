package k2;

import q2.b2;
import q2.d2;
import q2.v1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class h extends r1.o implements d2, v1, q2.k {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public q2.n f7214o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public a f7215p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f7216q;

    public h(a aVar, q2.n nVar) {
        this.f7214o = nVar;
        this.f7215p = aVar;
    }

    public final void A0() {
        a aVar;
        i9.x xVar = new i9.x();
        q2.f.z(this, new g(1));
        h hVar = (h) xVar.f6688a;
        if (hVar == null || (aVar = hVar.f7215p) == null) {
            aVar = this.f7215p;
        }
        B0(aVar);
    }

    public abstract void B0(s sVar);

    public final void C0() {
        i9.t tVar = new i9.t();
        tVar.f6684a = true;
        q2.f.A(this, new f(tVar));
        if (tVar.f6684a) {
            A0();
        }
    }

    public abstract boolean D0(int i7);

    public final void E0() {
        if (this.f7216q) {
            this.f7216q = false;
            if (this.f11129n) {
                i9.x xVar = new i9.x();
                q2.f.z(this, new j2.h(xVar, 1));
                h hVar = (h) xVar.f6688a;
                if (hVar != null) {
                    hVar.A0();
                } else {
                    B0(null);
                }
            }
        }
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

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // q2.v1
    public final void l0(n nVar, o oVar, long j5) {
        if (oVar == o.f7270b) {
            ?? r8 = nVar.f7264a;
            int size = r8.size();
            for (int i7 = 0; i7 < size; i7++) {
                if (D0(((v) r8.get(i7)).f7286i)) {
                    int i10 = nVar.f7268e;
                    if (i10 == 4) {
                        this.f7216q = true;
                        C0();
                        return;
                    } else {
                        if (i10 == 5) {
                            E0();
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    @Override // q2.v1
    public final long m() {
        q2.n nVar = this.f7214o;
        if (nVar == null) {
            return b2.f10596a;
        }
        n3.c cVar = q2.f.v(this).f10689x;
        int i7 = b2.f10597b;
        return q2.d.c(cVar.a0(nVar.f10752a), cVar.a0(nVar.f10753b), cVar.a0(nVar.f10754c), cVar.a0(nVar.f10755d));
    }

    @Override // r1.o
    public final void r0() {
        z();
    }

    @Override // r1.o
    public final void s0() {
        E0();
    }

    @Override // q2.v1
    public final void z() {
        E0();
    }
}
