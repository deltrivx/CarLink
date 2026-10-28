package x;

import q2.y1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class l extends r1.o implements q2.o, q2.l1, y1 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f14405o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public y1.m f14406p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f14407q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public y1.l0 f14408r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f14409s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public n3.o f14410t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public y1.h0 f14411u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public y1.l0 f14412v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public y1.h0 f14413w;

    @Override // q2.y1
    public final /* synthetic */ boolean B() {
        return false;
    }

    @Override // q2.o
    public final /* synthetic */ void H() {
    }

    @Override // q2.l1
    public final void X() {
        this.f14409s = 9205357640488583168L;
        this.f14410t = null;
        this.f14411u = null;
        this.f14412v = null;
        q2.f.l(this);
    }

    @Override // q2.y1
    public final void Y(y2.j jVar) {
    }

    @Override // q2.y1
    public final boolean h() {
        return false;
    }

    @Override // q2.y1
    public final /* synthetic */ boolean j0() {
        return false;
    }

    @Override // q2.o
    public final void x(q2.j0 j0Var) {
        y1.h0 h0Var;
        y1.m mVar;
        y1.e0 e0Var;
        a2.c cVar = j0Var.f10720a;
        if (this.f14408r == y1.h0.f14898a) {
            if (!y1.q.c(this.f14405o, y1.q.f14958m)) {
                a2.f.w(j0Var, this.f14405o, 0L, 0L, 126);
            }
            y1.m mVar2 = this.f14406p;
            if (mVar2 != null) {
                a2.f.v(j0Var, mVar2, 0L, 0L, this.f14407q, null, 118);
            }
        } else {
            if (x1.e.a(cVar.f16b.J(), this.f14409s) && j0Var.getLayoutDirection() == this.f14410t && i9.l.a(this.f14412v, this.f14408r)) {
                h0Var = this.f14411u;
                i9.l.b(h0Var);
            } else {
                q2.f.r(this, new a8.f1(23, this, j0Var));
                h0Var = this.f14413w;
                this.f14413w = null;
            }
            this.f14411u = h0Var;
            this.f14409s = cVar.f16b.J();
            this.f14410t = j0Var.getLayoutDirection();
            this.f14412v = this.f14408r;
            i9.l.b(h0Var);
            if (!y1.q.c(this.f14405o, y1.q.f14958m)) {
                y1.h0.m(j0Var, h0Var, this.f14405o);
            }
            y1.m mVar3 = this.f14406p;
            if (mVar3 != null) {
                float f10 = this.f14407q;
                boolean z10 = h0Var instanceof y1.c0;
                a2.j jVar = a2.j.f23a;
                if (z10) {
                    x1.c cVar2 = ((y1.c0) h0Var).f14880e;
                    float f11 = cVar2.f14523a;
                    j0Var.d(mVar3, (((long) Float.floatToRawIntBits(cVar2.f14524b)) & 4294967295L) | (Float.floatToRawIntBits(f11) << 32), y1.h0.w(cVar2), f10, jVar);
                } else {
                    if (h0Var instanceof y1.d0) {
                        y1.d0 d0Var = (y1.d0) h0Var;
                        mVar = mVar3;
                        e0Var = d0Var.f14883f;
                        if (e0Var == null) {
                            x1.d dVar = d0Var.f14882e;
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (dVar.f14534h >> 32));
                            float f12 = dVar.f14527a;
                            float f13 = dVar.f14528b;
                            long jFloatToRawIntBits = Float.floatToRawIntBits(f12);
                            long jFloatToRawIntBits2 = Float.floatToRawIntBits(f13);
                            j0Var.e(mVar, (jFloatToRawIntBits << 32) | (jFloatToRawIntBits2 & 4294967295L), (((long) Float.floatToRawIntBits(dVar.b())) << 32) | (((long) Float.floatToRawIntBits(dVar.a())) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32), f10, jVar);
                        }
                    } else {
                        if (!(h0Var instanceof y1.b0)) {
                            throw new cc.s();
                        }
                        y1.e0 e0Var2 = ((y1.b0) h0Var).f14878e;
                        mVar = mVar3;
                        e0Var = e0Var2;
                    }
                    j0Var.S(e0Var, mVar, f10, jVar, 3);
                }
            }
        }
        j0Var.b();
    }
}
