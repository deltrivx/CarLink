package o2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class k0 implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q2.q0 f9366a;

    public k0(q2.q0 q0Var) {
        this.f9366a = q0Var;
    }

    @Override // o2.w
    public final long C(long j5) {
        return x1.b.h(this.f9366a.f10779o.C(j5), a());
    }

    @Override // o2.w
    public final long E(long j5) {
        return this.f9366a.f10779o.E(x1.b.h(j5, a()));
    }

    public final long a() {
        q2.q0 q0Var = this.f9366a;
        q2.q0 q0VarH = d1.h(q0Var);
        return x1.b.g(b(q0VarH.f10782r, 0L), q0Var.f10779o.P0(q0VarH.f10779o, 0L));
    }

    public final long b(w wVar, long j5) {
        boolean z10 = wVar instanceof k0;
        q2.q0 q0Var = this.f9366a;
        if (!z10) {
            q2.q0 q0VarH = d1.h(q0Var);
            q2.h1 h1Var = q0VarH.f10779o;
            long jB = b(q0VarH.f10782r, j5);
            long j10 = q0VarH.f10780p;
            long jG = x1.b.g(jB, (4294967295L & ((long) Float.floatToRawIntBits((int) (j10 & 4294967295L)))) | (Float.floatToRawIntBits((int) (j10 >> 32)) << 32));
            if (!h1Var.G0().f11129n) {
                n2.a.b("LayoutCoordinate operations are only valid when isAttached is true");
            }
            h1Var.Q0();
            q2.h1 h1Var2 = h1Var.f10694q;
            if (h1Var2 != null) {
                h1Var = h1Var2;
            }
            return x1.b.h(jG, h1Var.P0(wVar, 0L));
        }
        q2.q0 q0Var2 = ((k0) wVar).f9366a;
        q2.h1 h1Var3 = q0Var2.f10779o;
        h1Var3.Q0();
        q2.q0 q0VarE0 = q0Var.f10779o.C0(h1Var3).E0();
        if (q0VarE0 != null) {
            long jB2 = n3.j.b(n3.j.c(q0Var2.y0(q0VarE0, false), o9.e0.O(j5)), q0Var.y0(q0VarE0, false));
            return (((long) Float.floatToRawIntBits((int) (jB2 >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (jB2 & 4294967295L))) & 4294967295L);
        }
        q2.q0 q0VarH2 = d1.h(q0Var2);
        long jC = n3.j.c(n3.j.c(q0Var2.y0(q0VarH2, false), q0VarH2.f10780p), o9.e0.O(j5));
        q2.q0 q0VarH3 = d1.h(q0Var);
        long jB3 = n3.j.b(jC, n3.j.c(q0Var.y0(q0VarH3, false), q0VarH3.f10780p));
        long jFloatToRawIntBits = Float.floatToRawIntBits((int) (jB3 >> 32));
        long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits((int) (jB3 & 4294967295L))) & 4294967295L;
        q2.h1 h1Var4 = q0VarH3.f10779o.f10694q;
        i9.l.b(h1Var4);
        q2.h1 h1Var5 = q0VarH2.f10779o.f10694q;
        i9.l.b(h1Var5);
        return h1Var4.P0(h1Var5, jFloatToRawIntBits2 | (jFloatToRawIntBits << 32));
    }

    @Override // o2.w
    public final long d(long j5) {
        return this.f9366a.f10779o.d(x1.b.h(j5, a()));
    }

    @Override // o2.w
    public final void e(w wVar, float[] fArr) {
        this.f9366a.f10779o.e(wVar, fArr);
    }

    @Override // o2.w
    public final x1.c h(w wVar, boolean z10) {
        return this.f9366a.f10779o.h(wVar, z10);
    }

    @Override // o2.w
    public final boolean isAttached() {
        return this.f9366a.f10779o.G0().f11129n;
    }

    @Override // o2.w
    public final void k(float[] fArr) {
        this.f9366a.f10779o.k(fArr);
    }

    @Override // o2.w
    public final long l() {
        q2.q0 q0Var = this.f9366a;
        return (((long) q0Var.f9435a) << 32) | (((long) q0Var.f9436b) & 4294967295L);
    }

    @Override // o2.w
    public final long n(w wVar, long j5) {
        return b(wVar, j5);
    }

    @Override // o2.w
    public final long t(long j5) {
        return this.f9366a.f10779o.t(x1.b.h(0L, a()));
    }

    @Override // o2.w
    public final long v(long j5) {
        return x1.b.h(this.f9366a.f10779o.v(j5), a());
    }

    @Override // o2.w
    public final w x() {
        q2.q0 q0VarE0;
        if (!isAttached()) {
            n2.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        q2.h1 h1Var = this.f9366a.f10779o.f10692o.E.f10615d.f10694q;
        if (h1Var == null || (q0VarE0 = h1Var.E0()) == null) {
            return null;
        }
        return q0VarE0.f10782r;
    }
}
