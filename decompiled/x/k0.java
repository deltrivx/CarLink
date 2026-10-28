package x;

import q2.b2;
import q2.v1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class k0 extends r1.o implements v1 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public b0.k f14401o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public b0.h f14402p;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object A0(k0 k0Var, a9.c cVar) {
        h0 h0Var;
        b0.h hVar;
        if (cVar instanceof h0) {
            h0Var = (h0) cVar;
            int i7 = h0Var.f14383d;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                h0Var.f14383d = i7 - Integer.MIN_VALUE;
            } else {
                h0Var = new h0(k0Var, cVar);
            }
        } else {
            h0Var = new h0(k0Var, cVar);
        }
        Object obj = h0Var.f14381b;
        int i10 = h0Var.f14383d;
        if (i10 == 0) {
            t8.a.e(obj);
            if (k0Var.f14402p == null) {
                b0.h hVar2 = new b0.h();
                b0.k kVar = k0Var.f14401o;
                h0Var.f14380a = hVar2;
                h0Var.f14383d = 1;
                Object objA = kVar.a(hVar2, h0Var);
                z8.a aVar = z8.a.f15774a;
                if (objA == aVar) {
                    return aVar;
                }
                hVar = hVar2;
            }
            return t8.z.f12851a;
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        hVar = h0Var.f14380a;
        t8.a.e(obj);
        k0Var.f14402p = hVar;
        return t8.z.f12851a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object B0(k0 k0Var, a9.c cVar) {
        i0 i0Var;
        if (cVar instanceof i0) {
            i0Var = (i0) cVar;
            int i7 = i0Var.f14393c;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                i0Var.f14393c = i7 - Integer.MIN_VALUE;
            } else {
                i0Var = new i0(k0Var, cVar);
            }
        } else {
            i0Var = new i0(k0Var, cVar);
        }
        Object obj = i0Var.f14391a;
        int i10 = i0Var.f14393c;
        if (i10 == 0) {
            t8.a.e(obj);
            b0.h hVar = k0Var.f14402p;
            if (hVar != null) {
                b0.i iVar = new b0.i(hVar);
                b0.k kVar = k0Var.f14401o;
                i0Var.f14393c = 1;
                Object objA = kVar.a(iVar, i0Var);
                z8.a aVar = z8.a.f15774a;
                if (objA == aVar) {
                    return aVar;
                }
            }
            return t8.z.f12851a;
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t8.a.e(obj);
        k0Var.f14402p = null;
        return t8.z.f12851a;
    }

    public final void C0() {
        b0.h hVar = this.f14402p;
        if (hVar != null) {
            this.f14401o.b(new b0.i(hVar));
            this.f14402p = null;
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

    @Override // q2.v1
    public final void l0(k2.n nVar, k2.o oVar, long j5) {
        if (oVar == k2.o.f7270b) {
            int i7 = nVar.f7268e;
            y8.c cVar = null;
            if (i7 == 4) {
                cc.b0.s(m0(), null, new j0(this, cVar, 0), 3);
            } else if (i7 == 5) {
                cc.b0.s(m0(), null, new j0(this, cVar, 1), 3);
            }
        }
    }

    @Override // q2.v1
    public final long m() {
        return b2.f10596a;
    }

    @Override // r1.o
    public final void r0() {
        z();
    }

    @Override // r1.o
    public final void s0() {
        C0();
    }

    @Override // q2.v1
    public final void z() {
        C0();
    }
}
