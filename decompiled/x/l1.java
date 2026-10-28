package x;

import f1.v1;
import q2.y1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class l1 extends r1.o implements q2.x, y1 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public o1 f14422o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f14423p;

    @Override // q2.y1
    public final /* synthetic */ boolean B() {
        return false;
    }

    @Override // q2.y1
    public final void Y(y2.j jVar) {
        o9.u[] uVarArr = y2.t.f15077a;
        y2.u uVar = y2.r.f15061m;
        o9.u[] uVarArr2 = y2.t.f15077a;
        o9.u uVar2 = uVarArr2[6];
        uVar.a(jVar, Boolean.TRUE);
        final int i7 = 0;
        final int i10 = 1;
        y2.h hVar = new y2.h(new h9.a(this) { // from class: x.k1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l1 f14404b;

            {
                this.f14404b = this;
            }

            @Override // h9.a
            public final Object invoke() {
                int iF;
                switch (i7) {
                    case 0:
                        iF = this.f14404b.f14422o.f14445a.f();
                        break;
                    default:
                        iF = this.f14404b.f14422o.f14448d.f();
                        break;
                }
                return Float.valueOf(iF);
            }
        }, new h9.a(this) { // from class: x.k1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l1 f14404b;

            {
                this.f14404b = this;
            }

            @Override // h9.a
            public final Object invoke() {
                int iF;
                switch (i10) {
                    case 0:
                        iF = this.f14404b.f14422o.f14445a.f();
                        break;
                    default:
                        iF = this.f14404b.f14422o.f14448d.f();
                        break;
                }
                return Float.valueOf(iF);
            }
        });
        if (this.f14423p) {
            y2.u uVar3 = y2.r.f15069u;
            o9.u uVar4 = uVarArr2[12];
            uVar3.a(jVar, hVar);
        } else {
            y2.u uVar5 = y2.r.f15068t;
            o9.u uVar6 = uVarArr2[11];
            uVar5.a(jVar, hVar);
        }
    }

    @Override // q2.x
    public final o2.n0 b(o2.o0 o0Var, o2.l0 l0Var, long j5) {
        n4.h.n(j5, this.f14423p ? z.x0.f15591a : z.x0.f15592b);
        o2.v0 v0VarU = l0Var.u(n3.a.a(j5, 0, this.f14423p ? n3.a.h(j5) : Integer.MAX_VALUE, 0, this.f14423p ? Integer.MAX_VALUE : n3.a.g(j5), 5));
        int i7 = v0VarU.f9435a;
        int iH = n3.a.h(j5);
        if (i7 > iH) {
            i7 = iH;
        }
        int i10 = v0VarU.f9436b;
        int iG = n3.a.g(j5);
        if (i10 > iG) {
            i10 = iG;
        }
        int i11 = v0VarU.f9436b - i10;
        int i12 = v0VarU.f9435a - i7;
        if (!this.f14423p) {
            i11 = i12;
        }
        o1 o1Var = this.f14422o;
        f1.h1 h1Var = o1Var.f14448d;
        f1.h1 h1Var2 = o1Var.f14445a;
        h1Var.g(i11);
        p1.f fVarH = n4.e.h();
        h9.k kVarE = fVarH != null ? fVarH.e() : null;
        p1.f fVarK = n4.e.k(fVarH);
        try {
            if (h1Var2.f() > i11) {
                h1Var2.g(i11);
            }
            n4.e.r(fVarH, fVarK, kVarE);
            this.f14422o.f14446b.g(this.f14423p ? i10 : i7);
            return o0Var.i(i7, i10, u8.x.f13123a, new v1(i11, 2, this, v0VarU));
        } catch (Throwable th) {
            n4.e.r(fVarH, fVarK, kVarE);
            throw th;
        }
    }

    @Override // q2.x
    public final int c(q2.p0 p0Var, o2.l0 l0Var, int i7) {
        if (this.f14423p) {
            i7 = Integer.MAX_VALUE;
        }
        return l0Var.m(i7);
    }

    @Override // q2.x
    public final int d(q2.p0 p0Var, o2.l0 l0Var, int i7) {
        if (!this.f14423p) {
            i7 = Integer.MAX_VALUE;
        }
        return l0Var.H(i7);
    }

    @Override // q2.x
    public final int e(q2.p0 p0Var, o2.l0 l0Var, int i7) {
        if (!this.f14423p) {
            i7 = Integer.MAX_VALUE;
        }
        return l0Var.c(i7);
    }

    @Override // q2.x
    public final int f(q2.p0 p0Var, o2.l0 l0Var, int i7) {
        if (this.f14423p) {
            i7 = Integer.MAX_VALUE;
        }
        return l0Var.r(i7);
    }

    @Override // q2.y1
    public final /* synthetic */ boolean h() {
        return true;
    }

    @Override // q2.y1
    public final /* synthetic */ boolean j0() {
        return false;
    }
}
