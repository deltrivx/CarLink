package v1;

import o2.d1;
import o2.i;
import o2.l0;
import o2.n0;
import o2.o0;
import o2.v0;
import o2.y0;
import q2.j0;
import q2.p0;
import q2.x;
import r1.o;
import y1.k;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class g extends o implements x, q2.o {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public d2.b f13599o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f13600p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public r1.d f13601q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public i f13602r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f13603s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public k f13604t;

    public static boolean B0(long j5) {
        return !x1.e.a(j5, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j5 & 4294967295L))) & Integer.MAX_VALUE) < 2139095040;
    }

    public static boolean C0(long j5) {
        return !x1.e.a(j5, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j5 >> 32))) & Integer.MAX_VALUE) < 2139095040;
    }

    public final boolean A0() {
        return this.f13600p && this.f13599o.d() != 9205357640488583168L;
    }

    public final long D0(long j5) {
        boolean z10 = false;
        boolean z11 = n3.a.d(j5) && n3.a.c(j5);
        if (n3.a.f(j5) && n3.a.e(j5)) {
            z10 = true;
        }
        if ((!A0() && z11) || z10) {
            return n3.a.a(j5, n3.a.h(j5), 0, n3.a.g(j5), 0, 10);
        }
        long jD = this.f13599o.d();
        int iRound = C0(jD) ? Math.round(Float.intBitsToFloat((int) (jD >> 32))) : n3.a.j(j5);
        int iRound2 = B0(jD) ? Math.round(Float.intBitsToFloat((int) (jD & 4294967295L))) : n3.a.i(j5);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(n3.b.f(iRound2, j5))) & 4294967295L) | (((long) Float.floatToRawIntBits(n3.b.g(iRound, j5))) << 32);
        if (A0()) {
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(!C0(this.f13599o.d()) ? Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) : Float.intBitsToFloat((int) (this.f13599o.d() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(!B0(this.f13599o.d()) ? Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) : Float.intBitsToFloat((int) (this.f13599o.d() & 4294967295L)))) & 4294967295L);
            jFloatToRawIntBits = (Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) == 0.0f || Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) == 0.0f) ? 0L : d1.i(jFloatToRawIntBits2, this.f13602r.a(jFloatToRawIntBits2, jFloatToRawIntBits));
        }
        return n3.a.a(j5, n3.b.g(Math.round(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32))), j5), 0, n3.b.f(Math.round(Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L))), j5), 0, 10);
    }

    @Override // q2.o
    public final /* synthetic */ void H() {
    }

    @Override // q2.x
    public final n0 b(o0 o0Var, l0 l0Var, long j5) {
        v0 v0VarU = l0Var.u(D0(j5));
        return o0Var.i(v0VarU.f9435a, v0VarU.f9436b, u8.x.f13123a, new y0(v0VarU, 3));
    }

    @Override // q2.x
    public final int c(p0 p0Var, l0 l0Var, int i7) {
        if (!A0()) {
            return l0Var.m(i7);
        }
        long jD0 = D0(n3.b.b(0, i7, 7));
        return Math.max(n3.a.j(jD0), l0Var.m(i7));
    }

    @Override // q2.x
    public final int d(p0 p0Var, l0 l0Var, int i7) {
        if (!A0()) {
            return l0Var.H(i7);
        }
        long jD0 = D0(n3.b.b(i7, 0, 13));
        return Math.max(n3.a.i(jD0), l0Var.H(i7));
    }

    @Override // q2.x
    public final int e(p0 p0Var, l0 l0Var, int i7) {
        if (!A0()) {
            return l0Var.c(i7);
        }
        long jD0 = D0(n3.b.b(i7, 0, 13));
        return Math.max(n3.a.i(jD0), l0Var.c(i7));
    }

    @Override // q2.x
    public final int f(p0 p0Var, l0 l0Var, int i7) {
        if (!A0()) {
            return l0Var.r(i7);
        }
        long jD0 = D0(n3.b.b(0, i7, 7));
        return Math.max(n3.a.j(jD0), l0Var.r(i7));
    }

    @Override // r1.o
    public final boolean n0() {
        return false;
    }

    public final String toString() {
        return "PainterModifier(painter=" + this.f13599o + ", sizeToIntrinsics=" + this.f13600p + ", alignment=" + this.f13601q + ", alpha=" + this.f13603s + ", colorFilter=" + this.f13604t + ')';
    }

    @Override // q2.o
    public final void x(j0 j0Var) {
        a2.c cVar = j0Var.f10720a;
        long jD = this.f13599o.d();
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(C0(jD) ? Float.intBitsToFloat((int) (jD >> 32)) : Float.intBitsToFloat((int) (cVar.f16b.J() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(B0(jD) ? Float.intBitsToFloat((int) (jD & 4294967295L)) : Float.intBitsToFloat((int) (cVar.f16b.J() & 4294967295L)))) & 4294967295L);
        long jI = (Float.intBitsToFloat((int) (cVar.f16b.J() >> 32)) == 0.0f || Float.intBitsToFloat((int) (cVar.f16b.J() & 4294967295L)) == 0.0f) ? 0L : d1.i(jFloatToRawIntBits, this.f13602r.a(jFloatToRawIntBits, cVar.f16b.J()));
        long jA = this.f13601q.a((((long) Math.round(Float.intBitsToFloat((int) (jI >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (jI & 4294967295L)))) & 4294967295L), (((long) Math.round(Float.intBitsToFloat((int) (cVar.f16b.J() >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (cVar.f16b.J() & 4294967295L)))) & 4294967295L), j0Var.getLayoutDirection());
        float f10 = (int) (jA >> 32);
        float f11 = (int) (jA & 4294967295L);
        ((a2.d) cVar.f16b.f12b).B(f10, f11);
        try {
            this.f13599o.c(j0Var, jI, this.f13603s, this.f13604t);
            ((a2.d) cVar.f16b.f12b).B(-f10, -f11);
            j0Var.b();
        } catch (Throwable th) {
            ((a2.d) cVar.f16b.f12b).B(-f10, -f11);
            throw th;
        }
    }
}
