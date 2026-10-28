package x;

import android.view.KeyEvent;
import r2.r2;
import z.e2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class r extends f {
    public k2.v K;

    @Override // x.f
    public final k2.m0 E0() {
        return null;
    }

    @Override // x.f
    public final boolean K0(KeyEvent keyEvent) {
        return false;
    }

    @Override // x.f
    public final void L0(KeyEvent keyEvent) {
        this.f14355w.invoke();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // x.f, q2.v1
    public final void l0(k2.n nVar, k2.o oVar, long j5) {
        super.l0(nVar, oVar, j5);
        y8.c cVar = null;
        int i7 = 0;
        if (oVar != k2.o.f7270b) {
            if (oVar != k2.o.f7271c || this.K == null) {
                return;
            }
            ?? r8 = nVar.f7264a;
            int size = r8.size();
            while (i7 < size) {
                k2.v vVar = (k2.v) r8.get(i7);
                if (vVar.b() && !vVar.equals(this.K)) {
                    this.K = null;
                    H0();
                    return;
                }
                i7++;
            }
            return;
        }
        k2.v vVar2 = this.K;
        if (vVar2 == null) {
            if (e2.f(nVar, true, false)) {
                k2.v vVar3 = (k2.v) nVar.f7264a.get(0);
                vVar3.a();
                this.K = vVar3;
                if (this.f14354v) {
                    long j10 = vVar3.f7280c;
                    b0.k kVar = this.f14349q;
                    if (kVar != null) {
                        b0.m mVar = new b0.m(j10);
                        if (F0()) {
                            this.H = cc.b0.s(m0(), null, new b1.f(kVar, (b0.j) mVar, (Object) this, cVar, 13), 3);
                            return;
                        } else {
                            this.B = mVar;
                            cc.b0.s(m0(), null, new c(kVar, mVar, null), 3);
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
        ?? r10 = nVar.f7264a;
        int size2 = r10.size();
        for (int i10 = 0; i10 < size2; i10++) {
            if (!k2.u.b((k2.v) r10.get(i10))) {
                long jE0 = q2.f.v(this).f10689x.e0(((r2) q2.f.i(this, r2.j1.f11286s)).d());
                float fMax = Math.max(0.0f, Float.intBitsToFloat((int) (jE0 >> 32)) - ((int) (j5 >> 32))) / 2.0f;
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jE0 & 4294967295L)) - ((int) (j5 & 4294967295L))) / 2.0f)) & 4294967295L) | (Float.floatToRawIntBits(fMax) << 32);
                int size3 = r10.size();
                while (i7 < size3) {
                    k2.v vVar4 = (k2.v) r10.get(i7);
                    if (vVar4.b() || k2.u.e(vVar4, j5, jFloatToRawIntBits)) {
                        this.K = null;
                        H0();
                        return;
                    }
                    i7++;
                }
                return;
            }
        }
        ((k2.v) r10.get(0)).a();
        if (this.f14354v) {
            long j11 = vVar2.f7280c;
            b0.k kVar2 = this.f14349q;
            if (kVar2 != null) {
                cc.o1 o1Var = this.H;
                if (o1Var == null || !o1Var.b()) {
                    b0.m mVar2 = this.B;
                    if (mVar2 != null) {
                        cc.b0.s(m0(), null, new c(mVar2, kVar2, null, 1), 3);
                    }
                } else {
                    cc.b0.s(m0(), null, new l0.i1(this, j11, kVar2, null, 3), 3);
                }
                this.B = null;
            }
            this.f14355w.invoke();
        }
        this.K = null;
    }

    @Override // x.f, q2.v1
    public final void z() {
        super.z();
        if (this.K != null) {
            this.K = null;
            H0();
        }
    }
}
