package q2;

import android.os.Build;
import android.view.View;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.Map;
import r2.h2;
import r2.s2;
import r2.t2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class h1 extends p0 implements o2.l0, o2.w, r1 {
    public static final y1.i0 J;
    public static final v K;
    public static final float[] L;
    public static final d M;
    public static final d N;
    public float A;
    public x1.a B;
    public v C;
    public b2.c D;
    public y1.o E;
    public c1.h F;
    public boolean H;
    public p1 I;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final h0 f10692o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public h1 f10693p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public h1 f10694q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f10695r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f10696s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public h9.k f10697t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public n3.c f10698u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public n3.o f10699v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public o2.n0 f10701x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public s.c0 f10702y;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f10700w = 0.8f;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f10703z = 0;
    public final e1 G = new e1(this, 1);

    static {
        y1.i0 i0Var = new y1.i0();
        i0Var.f14904b = 1.0f;
        i0Var.f14905c = 1.0f;
        i0Var.f14906d = 1.0f;
        long j5 = y1.w.f14964a;
        i0Var.f14908f = j5;
        i0Var.f14909g = j5;
        i0Var.f14911i = 8.0f;
        i0Var.f14912j = y1.p0.f14946a;
        i0Var.k = y1.h0.f14898a;
        i0Var.f14914m = 9205357640488583168L;
        i0Var.f14915n = i2.c.h();
        i0Var.f14916o = n3.o.f8749a;
        i0Var.f14917p = 3;
        J = i0Var;
        K = new v();
        L = y1.a0.a();
        M = new d(1);
        N = new d(2);
    }

    public h1(h0 h0Var) {
        this.f10692o = h0Var;
        this.f10698u = h0Var.f10689x;
        this.f10699v = h0Var.f10690y;
    }

    public static h1 Z0(o2.w wVar) {
        h1 h1Var;
        o2.k0 k0Var = wVar instanceof o2.k0 ? (o2.k0) wVar : null;
        if (k0Var != null && (h1Var = k0Var.f9366a.f10779o) != null) {
            return h1Var;
        }
        i9.l.c(wVar, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
        return (h1) wVar;
    }

    public final void A0(y1.o oVar, b2.c cVar) {
        y1.o oVar2;
        b2.c cVar2;
        r1.o oVarH0 = H0(4);
        if (oVarH0 == null) {
            U0(oVar, cVar);
            return;
        }
        h0 h0Var = this.f10692o;
        h0Var.getClass();
        j0 sharedDrawScope = ((r2.u) k0.a(h0Var)).getSharedDrawScope();
        long jM0 = n3.n.M0(this.f9437c);
        sharedDrawScope.getClass();
        h1.e eVar = null;
        while (oVarH0 != null) {
            if (oVarH0 instanceof o) {
                oVar2 = oVar;
                cVar2 = cVar;
                sharedDrawScope.c(oVar2, jM0, this, (o) oVarH0, cVar2);
            } else {
                oVar2 = oVar;
                cVar2 = cVar;
                if ((oVarH0.f11119c & 4) != 0 && (oVarH0 instanceof m)) {
                    int i7 = 0;
                    for (r1.o oVar3 = ((m) oVarH0).f10746p; oVar3 != null; oVar3 = oVar3.f11122f) {
                        if ((oVar3.f11119c & 4) != 0) {
                            i7++;
                            if (i7 == 1) {
                                oVarH0 = oVar3;
                            } else {
                                if (eVar == null) {
                                    eVar = new h1.e(new r1.o[16]);
                                }
                                if (oVarH0 != null) {
                                    eVar.b(oVarH0);
                                    oVarH0 = null;
                                }
                                eVar.b(oVar3);
                            }
                        }
                    }
                    if (i7 == 1) {
                    }
                }
                oVar = oVar2;
                cVar = cVar2;
            }
            oVarH0 = f.f(eVar);
            oVar = oVar2;
            cVar = cVar2;
        }
    }

    public abstract void B0();

    @Override // o2.w
    public final long C(long j5) {
        if (!G0().f11129n) {
            n2.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return P0(o2.d1.g(this), ((r2.u) k0.a(this.f10692o)).L(j5));
    }

    public final h1 C0(h1 h1Var) {
        h0 h0VarV = h1Var.f10692o;
        h0 h0Var = this.f10692o;
        if (h0VarV == h0Var) {
            r1.o oVarG0 = h1Var.G0();
            r1.o oVarG1 = G0();
            if (!oVarG1.f11117a.f11129n) {
                n2.a.b("visitLocalAncestors called on an unattached node");
            }
            for (r1.o oVar = oVarG1.f11117a.f11121e; oVar != null; oVar = oVar.f11121e) {
                if ((oVar.f11119c & 2) != 0 && oVar == oVarG0) {
                    return h1Var;
                }
            }
            return this;
        }
        while (h0VarV.f10680o > h0Var.f10680o) {
            h0VarV = h0VarV.v();
            i9.l.b(h0VarV);
        }
        h0 h0VarV2 = h0Var;
        while (h0VarV2.f10680o > h0VarV.f10680o) {
            h0VarV2 = h0VarV2.v();
            i9.l.b(h0VarV2);
        }
        while (h0VarV != h0VarV2) {
            h0VarV = h0VarV.v();
            h0VarV2 = h0VarV2.v();
            if (h0VarV == null || h0VarV2 == null) {
                throw new IllegalArgumentException("layouts are not part of the same hierarchy");
            }
        }
        if (h0VarV2 != h0Var) {
            if (h0VarV != h1Var.f10692o) {
                return h0VarV.E.f10614c;
            }
            return h1Var;
        }
        return this;
    }

    public final long D0(long j5) {
        long j10 = this.f10703z;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j5 & 4294967295L)) - ((int) (j10 & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j5 >> 32)) - ((int) (j10 >> 32)))) << 32);
        p1 p1Var = this.I;
        return p1Var != null ? p1Var.g(jFloatToRawIntBits, true) : jFloatToRawIntBits;
    }

    @Override // o2.w
    public final long E(long j5) {
        if (!G0().f11129n) {
            n2.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        Q0();
        for (h1 h1Var = this; h1Var != null; h1Var = h1Var.f10694q) {
            p1 p1Var = h1Var.I;
            if (p1Var != null) {
                j5 = p1Var.g(j5, false);
            }
            j5 = o9.e0.N(j5, h1Var.f10703z);
        }
        return j5;
    }

    public abstract q0 E0();

    public final long F0() {
        return this.f10698u.e0(this.f10692o.f10691z.d());
    }

    public abstract r1.o G0();

    public final r1.o H0(int i7) {
        boolean zG = i1.g(i7);
        r1.o oVarG0 = G0();
        if (!zG && (oVarG0 = oVarG0.f11121e) == null) {
            return null;
        }
        for (r1.o oVarI0 = I0(zG); oVarI0 != null && (oVarI0.f11120d & i7) != 0; oVarI0 = oVarI0.f11122f) {
            if ((oVarI0.f11119c & i7) != 0) {
                return oVarI0;
            }
            if (oVarI0 == oVarG0) {
                return null;
            }
        }
        return null;
    }

    public final r1.o I0(boolean z10) {
        r1.o oVarG0;
        d1 d1Var = this.f10692o.E;
        if (d1Var.f10615d == this) {
            return d1Var.f10617f;
        }
        if (!z10) {
            h1 h1Var = this.f10694q;
            if (h1Var != null) {
                return h1Var.G0();
            }
            return null;
        }
        h1 h1Var2 = this.f10694q;
        if (h1Var2 == null || (oVarG0 = h1Var2.G0()) == null) {
            return null;
        }
        return oVarG0.f11122f;
    }

    public final void J0(r1.o oVar, d dVar, long j5, r rVar, int i7, boolean z10) {
        if (oVar == null) {
            M0(dVar, j5, rVar, i7, z10);
            return;
        }
        int i10 = rVar.f10787c;
        s.d0 d0Var = rVar.f10785a;
        rVar.d(i10 + 1, d0Var.f12408b);
        rVar.f10787c++;
        d0Var.a(oVar);
        rVar.f10786b.a(f.a(-1.0f, z10, false));
        J0(f.e(oVar, dVar.b()), dVar, j5, rVar, i7, z10);
        rVar.f10787c = i10;
    }

    public final void K0(r1.o oVar, d dVar, long j5, r rVar, int i7, boolean z10, float f10) {
        if (oVar == null) {
            M0(dVar, j5, rVar, i7, z10);
            return;
        }
        int i10 = rVar.f10787c;
        s.d0 d0Var = rVar.f10785a;
        rVar.d(i10 + 1, d0Var.f12408b);
        rVar.f10787c++;
        d0Var.a(oVar);
        rVar.f10786b.a(f.a(f10, z10, false));
        T0(f.e(oVar, dVar.b()), dVar, j5, rVar, i7, z10, f10, true);
        rVar.f10787c = i10;
    }

    public final void L0(d dVar, long j5, r rVar, int i7, boolean z10) {
        boolean z11;
        boolean z12;
        r1.o oVarH0 = H0(dVar.b());
        if (!f1(j5)) {
            if (i7 == 1) {
                float fY0 = y0(j5, F0());
                if ((Float.floatToRawIntBits(fY0) & Integer.MAX_VALUE) < 2139095040) {
                    if (rVar.f10787c != n3.l.A(rVar)) {
                        if (f.h(rVar.c(), f.a(fY0, false, false)) <= 0) {
                            return;
                        }
                    }
                    K0(oVarH0, dVar, j5, rVar, i7, false, fY0);
                    return;
                }
                return;
            }
            return;
        }
        if (oVarH0 == null) {
            M0(dVar, j5, rVar, i7, z10);
            return;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j5 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j5 & 4294967295L));
        if (fIntBitsToFloat >= 0.0f && fIntBitsToFloat2 >= 0.0f && fIntBitsToFloat < K() && fIntBitsToFloat2 < I()) {
            J0(oVarH0, dVar, j5, rVar, i7, z10);
            return;
        }
        float fY1 = i7 == 1 ? y0(j5, F0()) : Float.POSITIVE_INFINITY;
        if ((Float.floatToRawIntBits(fY1) & Integer.MAX_VALUE) < 2139095040) {
            if (rVar.f10787c != n3.l.A(rVar)) {
                z11 = z10;
                if (f.h(rVar.c(), f.a(fY1, z11, false)) > 0) {
                }
                T0(oVarH0, dVar, j5, rVar, i7, z11, fY1, z12);
            }
            z11 = z10;
            z12 = true;
            T0(oVarH0, dVar, j5, rVar, i7, z11, fY1, z12);
        }
        z11 = z10;
        z12 = false;
        T0(oVarH0, dVar, j5, rVar, i7, z11, fY1, z12);
    }

    public void M0(d dVar, long j5, r rVar, int i7, boolean z10) {
        h1 h1Var = this.f10693p;
        if (h1Var != null) {
            h1Var.L0(dVar, h1Var.D0(j5), rVar, i7, z10);
        }
    }

    public final void N0() {
        p1 p1Var = this.I;
        if (p1Var != null) {
            p1Var.invalidate();
            return;
        }
        h1 h1Var = this.f10694q;
        if (h1Var != null) {
            h1Var.N0();
        }
    }

    @Override // n3.c
    public final float O() {
        return this.f10692o.f10689x.O();
    }

    public final boolean O0() {
        if (this.I != null && this.f10700w <= 0.0f) {
            return true;
        }
        h1 h1Var = this.f10694q;
        if (h1Var != null) {
            return h1Var.O0();
        }
        return false;
    }

    public final long P0(o2.w wVar, long j5) {
        if (wVar instanceof o2.k0) {
            o2.k0 k0Var = (o2.k0) wVar;
            k0Var.f9366a.f10779o.Q0();
            return k0Var.b(this, j5 ^ (-9223372034707292160L)) ^ (-9223372034707292160L);
        }
        h1 h1VarZ0 = Z0(wVar);
        h1VarZ0.Q0();
        h1 h1VarC0 = C0(h1VarZ0);
        while (h1VarZ0 != h1VarC0) {
            p1 p1Var = h1VarZ0.I;
            if (p1Var != null) {
                j5 = p1Var.g(j5, false);
            }
            j5 = o9.e0.N(j5, h1VarZ0.f10703z);
            h1VarZ0 = h1VarZ0.f10694q;
            i9.l.b(h1VarZ0);
        }
        return w0(h1VarC0, j5);
    }

    public final void Q0() {
        this.f10692o.F.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [r1.o] */
    /* JADX WARN: Type inference failed for: r7v7, types: [r1.o] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2, types: [h1.e] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [h1.e] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v5 */
    public final void R0() {
        r1.o oVarG0;
        boolean zG = i1.g(128);
        r1.o oVarI0 = I0(zG);
        if (oVarI0 == null || (oVarI0.f11117a.f11120d & 128) == 0) {
            return;
        }
        p1.f fVarH = n4.e.h();
        h9.k kVarE = fVarH != null ? fVarH.e() : null;
        p1.f fVarK = n4.e.k(fVarH);
        try {
            if (!zG) {
                oVarG0 = G0().f11121e;
                if (oVarG0 == null) {
                }
                n4.e.r(fVarH, fVarK, kVarE);
            }
            oVarG0 = G0();
            for (r1.o oVarI1 = I0(zG); oVarI1 != null && (oVarI1.f11120d & 128) != 0; oVarI1 = oVarI1.f11122f) {
                if ((oVarI1.f11119c & 128) != 0) {
                    ?? F = oVarI1;
                    ?? eVar = 0;
                    while (F != 0) {
                        if (F instanceof w) {
                            ((w) F).n(this.f9437c);
                        } else if ((F.f11119c & 128) != 0 && (F instanceof m)) {
                            r1.o oVar = ((m) F).f10746p;
                            int i7 = 0;
                            F = F;
                            eVar = eVar;
                            while (oVar != null) {
                                if ((oVar.f11119c & 128) != 0) {
                                    i7++;
                                    if (i7 == 1) {
                                        eVar = eVar;
                                        F = oVar;
                                    } else {
                                        if (eVar == 0) {
                                            eVar = new h1.e(new r1.o[16]);
                                        }
                                        if (F != 0) {
                                            eVar.b(F);
                                            F = 0;
                                        }
                                        eVar.b(oVar);
                                    }
                                }
                                oVar = oVar.f11122f;
                                F = F;
                                eVar = eVar;
                            }
                            if (i7 == 1) {
                            }
                        }
                        F = f.f(eVar);
                    }
                }
                if (oVarI1 == oVarG0) {
                    break;
                }
            }
            n4.e.r(fVarH, fVarK, kVarE);
        } catch (Throwable th) {
            n4.e.r(fVarH, fVarK, kVarE);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [r1.o] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [r1.o] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [h1.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [h1.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v4 */
    public final void S0() {
        boolean zG = i1.g(128);
        r1.o oVarG0 = G0();
        if (!zG && (oVarG0 = oVarG0.f11121e) == null) {
            return;
        }
        for (r1.o oVarI0 = I0(zG); oVarI0 != null && (oVarI0.f11120d & 128) != 0; oVarI0 = oVarI0.f11122f) {
            if ((oVarI0.f11119c & 128) != 0) {
                ?? F = oVarI0;
                ?? eVar = 0;
                while (F != 0) {
                    if (F instanceof w) {
                        ((w) F).T(this);
                    } else if ((F.f11119c & 128) != 0 && (F instanceof m)) {
                        r1.o oVar = ((m) F).f10746p;
                        int i7 = 0;
                        F = F;
                        eVar = eVar;
                        while (oVar != null) {
                            if ((oVar.f11119c & 128) != 0) {
                                i7++;
                                if (i7 == 1) {
                                    eVar = eVar;
                                    F = oVar;
                                } else {
                                    if (eVar == 0) {
                                        eVar = new h1.e(new r1.o[16]);
                                    }
                                    if (F != 0) {
                                        eVar.b(F);
                                        F = 0;
                                    }
                                    eVar.b(oVar);
                                }
                            }
                            oVar = oVar.f11122f;
                            F = F;
                            eVar = eVar;
                        }
                        if (i7 == 1) {
                        }
                    }
                    F = f.f(eVar);
                }
            }
            if (oVarI0 == oVarG0) {
                return;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:68:0x018b A[PHI: r5
      0x018b: PHI (r5v12 ??) = (r5v1 ??), (r5v1 ??), (r5v14 ??) binds: [B:50:0x0157, B:52:0x015b, B:66:0x0185] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [r1.o] */
    /* JADX WARN: Type inference failed for: r4v12, types: [r1.o] */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21, types: [r1.o] */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24, types: [r1.o] */
    /* JADX WARN: Type inference failed for: r4v25, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v12, types: [h1.e] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16, types: [h1.e] */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22, types: [h1.e] */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25, types: [h1.e] */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v21 */
    public final void T0(r1.o oVar, d dVar, long j5, r rVar, int i7, boolean z10, float f10, boolean z11) {
        ?? F;
        if (oVar == null) {
            M0(dVar, j5, rVar, i7, z10);
            return;
        }
        int i10 = i7;
        if (i10 == 3 || i10 == 4) {
            ?? r8 = oVar;
            ?? eVar = 0;
            while (r8 != 0) {
                if (r8 instanceof v1) {
                    long jM = ((v1) r8).m();
                    int i11 = (int) (j5 >> 32);
                    float fIntBitsToFloat = Float.intBitsToFloat(i11);
                    h0 h0Var = this.f10692o;
                    n3.o oVar2 = h0Var.f10690y;
                    int i12 = b2.f10597b;
                    long j10 = Long.MIN_VALUE & jM;
                    n3.o oVar3 = n3.o.f8749a;
                    if (fIntBitsToFloat < (-((j10 == 0 || oVar2 == oVar3) ? d.a(0, jM) : d.a(2, jM)))) {
                        break;
                    }
                    if (Float.intBitsToFloat(i11) >= K() + ((j10 == 0 || h0Var.f10690y == oVar3) ? d.a(2, jM) : d.a(0, jM))) {
                        break;
                    }
                    int i13 = (int) (j5 & 4294967295L);
                    if (Float.intBitsToFloat(i13) < (-d.a(1, jM))) {
                        break;
                    }
                    if (Float.intBitsToFloat(i13) >= d.a(3, jM) + I()) {
                        break;
                    }
                    f1 f1Var = new f1(this, oVar, dVar, j5, rVar, i10, z10, f10, z11);
                    s.z zVar = rVar.f10786b;
                    s.d0 d0Var = rVar.f10785a;
                    if (rVar.f10787c == n3.l.A(rVar)) {
                        int i14 = rVar.f10787c;
                        rVar.d(i14 + 1, d0Var.f12408b);
                        rVar.f10787c++;
                        d0Var.a(oVar);
                        zVar.a(f.a(0.0f, z10, true));
                        f1Var.invoke();
                        rVar.f10787c = i14;
                        return;
                    }
                    long jC = rVar.c();
                    int i15 = rVar.f10787c;
                    if (!f.o(jC)) {
                        if (f.k(jC) > 0.0f) {
                            int i16 = rVar.f10787c;
                            rVar.d(i16 + 1, d0Var.f12408b);
                            rVar.f10787c++;
                            d0Var.a(oVar);
                            zVar.a(f.a(0.0f, z10, true));
                            f1Var.invoke();
                            rVar.f10787c = i16;
                            return;
                        }
                        return;
                    }
                    int iA = n3.l.A(rVar);
                    rVar.f10787c = iA;
                    rVar.d(iA + 1, d0Var.f12408b);
                    rVar.f10787c++;
                    d0Var.a(oVar);
                    zVar.a(f.a(0.0f, z10, true));
                    f1Var.invoke();
                    rVar.f10787c = iA;
                    if (f.k(rVar.c()) < 0.0f) {
                        rVar.d(i15 + 1, rVar.f10787c + 1);
                    }
                    rVar.f10787c = i15;
                    return;
                }
                if ((r8.f11119c & 16) == 0 || !(r8 instanceof m)) {
                    F = r8;
                    eVar = eVar;
                    F = f.f(eVar);
                } else {
                    r1.o oVar4 = ((m) r8).f10746p;
                    int i17 = 0;
                    while (oVar4 != null) {
                        if ((oVar4.f11119c & 16) != 0) {
                            i17++;
                            if (i17 == 1) {
                                F = r8;
                                eVar = eVar;
                                eVar = eVar;
                                F = oVar4;
                            } else {
                                if (eVar == 0) {
                                    eVar = new h1.e(new r1.o[16]);
                                }
                                if (F != 0) {
                                    eVar.b(F);
                                    F = 0;
                                }
                                eVar.b(oVar4);
                            }
                        } else {
                            F = r8;
                            eVar = eVar;
                        }
                        oVar4 = oVar4.f11122f;
                        F = F;
                        eVar = eVar;
                    }
                    if (i17 == 1) {
                        F = r8;
                        eVar = eVar;
                    } else {
                        F = r8;
                        eVar = eVar;
                        F = f.f(eVar);
                    }
                }
                i10 = i7;
                r8 = F;
                eVar = eVar;
            }
        }
        if (z11) {
            K0(oVar, dVar, j5, rVar, i7, z10, f10);
            return;
        }
        switch (dVar.f10605a) {
            case 1:
                ?? F2 = oVar;
                ?? eVar2 = 0;
                while (F2 != 0) {
                    if (F2 instanceof v1) {
                        ((v1) F2).I();
                    } else if ((F2.f11119c & 16) != 0 && (F2 instanceof m)) {
                        r1.o oVar5 = ((m) F2).f10746p;
                        int i18 = 0;
                        while (oVar5 != null) {
                            if ((oVar5.f11119c & 16) != 0) {
                                i18++;
                                if (i18 == 1) {
                                    F2 = F2;
                                    eVar2 = eVar2;
                                    eVar2 = eVar2;
                                    F2 = oVar5;
                                } else {
                                    if (eVar2 == 0) {
                                        eVar2 = new h1.e(new r1.o[16]);
                                    }
                                    if (F2 != 0) {
                                        eVar2.b(F2);
                                        F2 = 0;
                                    }
                                    eVar2.b(oVar5);
                                }
                            } else {
                                F2 = F2;
                                eVar2 = eVar2;
                            }
                            oVar5 = oVar5.f11122f;
                            F2 = F2;
                            eVar2 = eVar2;
                        }
                        if (i18 == 1) {
                            F2 = F2;
                            eVar2 = eVar2;
                        } else {
                            F2 = F2;
                            eVar2 = eVar2;
                        }
                    }
                    F2 = f.f(eVar2);
                }
                break;
        }
        T0(f.e(oVar, dVar.b()), dVar, j5, rVar, i7, z10, f10, false);
    }

    public abstract void U0(y1.o oVar, b2.c cVar);

    public final void V0(long j5, float f10, h9.k kVar) {
        d1(kVar, false);
        boolean zA = n3.j.a(this.f10703z, j5);
        h0 h0Var = this.f10692o;
        if (!zA) {
            ((r2.u) k0.a(h0Var)).Q(-4.0f);
            this.f10703z = j5;
            h0Var.F.f10743p.g0();
            p1 p1Var = this.I;
            if (p1Var != null) {
                p1Var.j(j5);
            } else {
                h1 h1Var = this.f10694q;
                if (h1Var != null) {
                    h1Var.N0();
                }
            }
            h1.e eVarZ = h0Var.z();
            Object[] objArr = eVarZ.f6421a;
            int i7 = eVarZ.f6423c;
            for (int i10 = 0; i10 < i7; i10++) {
                ((h0) objArr[i10]).F();
            }
            p0.s0(this);
            q1 q1Var = h0Var.f10678m;
            if (q1Var != null) {
                ((r2.u) q1Var).C(h0Var);
            }
        }
        this.A = f10;
        if (!this.k) {
            g0(o0());
        }
        if (this == h0Var.E.f10615d) {
            ((r2.u) k0.a(h0Var)).getRectManager().f(h0Var, !h0Var.F.f10743p.k);
        }
    }

    public final void W0(x1.a aVar, boolean z10, boolean z11) {
        p1 p1Var = this.I;
        if (p1Var != null) {
            if (this.f10696s) {
                if (z11) {
                    long jF0 = F0();
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (jF0 >> 32)) / 2.0f;
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jF0 & 4294967295L)) / 2.0f;
                    long j5 = this.f9437c;
                    aVar.a(-fIntBitsToFloat, -fIntBitsToFloat2, ((int) (j5 >> 32)) + fIntBitsToFloat, ((int) (j5 & 4294967295L)) + fIntBitsToFloat2);
                } else if (z10) {
                    long j10 = this.f9437c;
                    aVar.a(0.0f, 0.0f, (int) (j10 >> 32), (int) (j10 & 4294967295L));
                }
                if (aVar.b()) {
                    return;
                }
            }
            p1Var.c(aVar, false);
        }
        long j11 = this.f10703z;
        float f10 = (int) (j11 >> 32);
        aVar.f14517a += f10;
        aVar.f14519c += f10;
        float f11 = (int) (j11 & 4294967295L);
        aVar.f14518b += f11;
        aVar.f14520d += f11;
    }

    public final void X0() {
        if (this.I != null) {
            d1(null, false);
            this.f10692o.U(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [r1.o] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [r1.o] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [h1.e] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [h1.e] */
    public final void Y0(o2.n0 n0Var) {
        h1 h1Var;
        o2.n0 n0Var2 = this.f10701x;
        if (n0Var != n0Var2) {
            this.f10701x = n0Var;
            h0 h0Var = this.f10692o;
            if (n0Var2 == null || n0Var.getWidth() != n0Var2.getWidth() || n0Var.getHeight() != n0Var2.getHeight()) {
                int width = n0Var.getWidth();
                int height = n0Var.getHeight();
                p1 p1Var = this.I;
                if (p1Var != null) {
                    p1Var.h((((long) width) << 32) | (((long) height) & 4294967295L));
                } else if (h0Var.J() && (h1Var = this.f10694q) != null) {
                    h1Var.N0();
                }
                U((((long) height) & 4294967295L) | (((long) width) << 32));
                if (this.f10697t != null) {
                    e1(false);
                }
                boolean zG = i1.g(4);
                r1.o oVarG0 = G0();
                if (zG || (oVarG0 = oVarG0.f11121e) != null) {
                    for (r1.o oVarI0 = I0(zG); oVarI0 != null && (oVarI0.f11120d & 4) != 0; oVarI0 = oVarI0.f11122f) {
                        if ((oVarI0.f11119c & 4) != 0) {
                            ?? F = oVarI0;
                            ?? eVar = 0;
                            while (F != 0) {
                                if (F instanceof o) {
                                    ((o) F).H();
                                } else if ((F.f11119c & 4) != 0 && (F instanceof m)) {
                                    r1.o oVar = ((m) F).f10746p;
                                    int i7 = 0;
                                    F = F;
                                    eVar = eVar;
                                    while (oVar != null) {
                                        if ((oVar.f11119c & 4) != 0) {
                                            i7++;
                                            if (i7 == 1) {
                                                eVar = eVar;
                                                F = oVar;
                                            } else {
                                                if (eVar == 0) {
                                                    eVar = new h1.e(new r1.o[16]);
                                                }
                                                if (F != 0) {
                                                    eVar.b(F);
                                                    F = 0;
                                                }
                                                eVar.b(oVar);
                                            }
                                        }
                                        oVar = oVar.f11122f;
                                        F = F;
                                        eVar = eVar;
                                    }
                                    if (i7 == 1) {
                                    }
                                }
                                F = f.f(eVar);
                            }
                        }
                        if (oVarI0 == oVarG0) {
                            break;
                        }
                    }
                }
                q1 q1Var = h0Var.f10678m;
                if (q1Var != null) {
                    ((r2.u) q1Var).C(h0Var);
                }
            }
            s.c0 c0Var = this.f10702y;
            if ((c0Var == null || c0Var.f12401e == 0) && n0Var.b().isEmpty()) {
                return;
            }
            s.c0 c0Var2 = this.f10702y;
            Map mapB = n0Var.b();
            if (c0Var2 != null && c0Var2.f12401e == mapB.size()) {
                Object[] objArr = c0Var2.f12398b;
                int[] iArr = c0Var2.f12399c;
                long[] jArr = c0Var2.f12397a;
                int length = jArr.length - 2;
                if (length < 0) {
                    return;
                }
                int i10 = 0;
                loop0: while (true) {
                    long j5 = jArr[i10];
                    if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i11 = 8 - ((~(i10 - length)) >>> 31);
                        for (int i12 = 0; i12 < i11; i12++) {
                            if ((255 & j5) < 128) {
                                int i13 = (i10 << 3) + i12;
                                Object obj = objArr[i13];
                                int i14 = iArr[i13];
                                Integer num = (Integer) mapB.get((o2.m) obj);
                                if (num == null || num.intValue() != i14) {
                                    break loop0;
                                }
                            }
                            j5 >>= 8;
                        }
                        if (i11 != 8) {
                            return;
                        }
                    }
                    if (i10 == length) {
                        return;
                    } else {
                        i10++;
                    }
                }
            }
            h0Var.F.f10743p.f10865w.f();
            s.c0 c0Var3 = this.f10702y;
            if (c0Var3 == null) {
                s.c0 c0Var4 = s.l0.f12469a;
                c0Var3 = new s.c0();
                this.f10702y = c0Var3;
            }
            c0Var3.a();
            for (Map.Entry entry : n0Var.b().entrySet()) {
                c0Var3.h(((Number) entry.getValue()).intValue(), entry.getKey());
            }
        }
    }

    @Override // n3.c
    public final float a() {
        return this.f10692o.f10689x.a();
    }

    public final x1.c a1() {
        if (G0().f11129n) {
            o2.w wVarG = o2.d1.g(this);
            x1.a aVar = this.B;
            if (aVar == null) {
                aVar = new x1.a();
                this.B = aVar;
            }
            long jX0 = x0(F0());
            int i7 = (int) (jX0 >> 32);
            aVar.f14517a = -Float.intBitsToFloat(i7);
            int i10 = (int) (jX0 & 4294967295L);
            aVar.f14518b = -Float.intBitsToFloat(i10);
            aVar.f14519c = Float.intBitsToFloat(i7) + K();
            aVar.f14520d = Float.intBitsToFloat(i10) + I();
            h1 h1Var = this;
            while (h1Var != wVarG) {
                h1Var.W0(aVar, false, true);
                if (!aVar.b()) {
                    h1Var = h1Var.f10694q;
                    i9.l.b(h1Var);
                }
            }
            return new x1.c(aVar.f14517a, aVar.f14518b, aVar.f14519c, aVar.f14520d);
        }
        return x1.c.f14522e;
    }

    public final void b1(h1 h1Var, float[] fArr) {
        if (i9.l.a(h1Var, this)) {
            return;
        }
        h1 h1Var2 = this.f10694q;
        i9.l.b(h1Var2);
        h1Var2.b1(h1Var, fArr);
        if (!n3.j.a(this.f10703z, 0L)) {
            float[] fArr2 = L;
            y1.a0.d(fArr2);
            long j5 = this.f10703z;
            y1.a0.f(fArr2, -((int) (j5 >> 32)), -((int) (j5 & 4294967295L)));
            y1.a0.e(fArr, fArr2);
        }
        p1 p1Var = this.I;
        if (p1Var != null) {
            p1Var.i(fArr);
        }
    }

    public final void c1(h1 h1Var, float[] fArr) {
        h1 h1Var2 = this;
        while (!h1Var2.equals(h1Var)) {
            p1 p1Var = h1Var2.I;
            if (p1Var != null) {
                p1Var.a(fArr);
            }
            long j5 = h1Var2.f10703z;
            if (!n3.j.a(j5, 0L)) {
                float[] fArr2 = L;
                y1.a0.d(fArr2);
                y1.a0.f(fArr2, (int) (j5 >> 32), (int) (j5 & 4294967295L));
                y1.a0.e(fArr, fArr2);
            }
            h1Var2 = h1Var2.f10694q;
            i9.l.b(h1Var2);
        }
    }

    @Override // o2.w
    public final long d(long j5) {
        long jE = E(j5);
        r2.u uVar = (r2.u) k0.a(this.f10692o);
        uVar.G();
        return y1.a0.b(jE, uVar.T);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d3  */
    public final void d1(h9.k kVar, boolean z10) {
        q1 q1Var;
        c1.h hVar;
        h1.e eVar;
        Reference referencePoll;
        Object obj;
        r2.o1 t2Var;
        h0 h0Var = this.f10692o;
        boolean z11 = (!z10 && this.f10697t == kVar && i9.l.a(this.f10698u, h0Var.f10689x) && this.f10699v == h0Var.f10690y) ? false : true;
        this.f10698u = h0Var.f10689x;
        this.f10699v = h0Var.f10690y;
        boolean zI = h0Var.I();
        e1 e1Var = this.G;
        if (!zI || kVar == null) {
            this.f10697t = null;
            p1 p1Var = this.I;
            if (p1Var != null) {
                p1Var.destroy();
                h0Var.I = true;
                e1Var.invoke();
                if (G0().f11129n && h0Var.J() && (q1Var = h0Var.f10678m) != null) {
                    ((r2.u) q1Var).C(h0Var);
                }
            }
            this.I = null;
            this.H = false;
            return;
        }
        this.f10697t = kVar;
        if (this.I != null) {
            if (z11 && e1(true)) {
                ((r2.u) k0.a(h0Var)).getRectManager().e(h0Var);
                return;
            }
            return;
        }
        q1 q1VarA = k0.a(h0Var);
        c1.h hVar2 = this.F;
        if (hVar2 == null) {
            c1.h hVar3 = new c1.h(4, this, new e1(this, 0));
            this.F = hVar3;
            hVar = hVar3;
        } else {
            hVar = hVar2;
        }
        r2.u uVar = (r2.u) q1VarA;
        u0.k kVar2 = uVar.B0;
        do {
            ReferenceQueue referenceQueue = (ReferenceQueue) kVar2.f12991c;
            eVar = (h1.e) kVar2.f12990b;
            referencePoll = referenceQueue.poll();
            if (referencePoll != null) {
                eVar.k(referencePoll);
            }
        } while (referencePoll != null);
        do {
            int i7 = eVar.f6423c;
            if (i7 == 0) {
                obj = null;
                break;
            }
            obj = ((Reference) eVar.l(i7 - 1)).get();
        } while (obj == null);
        p1 s2Var = (p1) obj;
        if (s2Var != null) {
            s2Var.b(hVar, e1Var);
        } else {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 23) {
                s2Var = new r2.t1(uVar.getGraphicsContext().b(), uVar.getGraphicsContext(), uVar, hVar, e1Var);
            } else if (uVar.isHardwareAccelerated() && i10 >= 23 && uVar.f11456g0) {
                try {
                    s2Var = new h2(uVar, hVar, e1Var);
                } catch (Throwable unused) {
                    uVar.f11456g0 = false;
                    if (uVar.M == null) {
                        if (!s2.f11405u) {
                            r2.j0.x(new View(uVar.getContext()));
                        }
                        if (s2.f11406v) {
                            t2Var = new r2.o1(uVar.getContext());
                        } else {
                            t2Var = new t2(uVar.getContext());
                        }
                        uVar.M = t2Var;
                        uVar.addView(t2Var, -1);
                    }
                    r2.o1 o1Var = uVar.M;
                    i9.l.b(o1Var);
                    s2Var = new s2(uVar, o1Var, hVar, e1Var);
                }
            } else {
                if (uVar.M == null) {
                    if (!s2.f11405u) {
                        r2.j0.x(new View(uVar.getContext()));
                    }
                    if (s2.f11406v) {
                        t2Var = new r2.o1(uVar.getContext());
                    } else {
                        t2Var = new t2(uVar.getContext());
                    }
                    uVar.M = t2Var;
                    uVar.addView(t2Var, -1);
                }
                r2.o1 o1Var2 = uVar.M;
                i9.l.b(o1Var2);
                s2Var = new s2(uVar, o1Var2, hVar, e1Var);
            }
        }
        s2Var.h(this.f9437c);
        s2Var.j(this.f10703z);
        this.I = s2Var;
        e1(true);
        h0Var.I = true;
        e1Var.invoke();
    }

    @Override // o2.w
    public final void e(o2.w wVar, float[] fArr) {
        h1 h1VarZ0 = Z0(wVar);
        h1VarZ0.Q0();
        h1 h1VarC0 = C0(h1VarZ0);
        y1.a0.d(fArr);
        h1VarZ0.c1(h1VarC0, fArr);
        b1(h1VarC0, fArr);
    }

    public final boolean e1(boolean z10) {
        q1 q1Var;
        p1 p1Var = this.I;
        boolean z11 = false;
        if (p1Var == null) {
            if (this.f10697t == null) {
                return false;
            }
            n2.a.b("null layer with a non-null layerBlock");
            return false;
        }
        h9.k kVar = this.f10697t;
        if (kVar == null) {
            throw ob.a.o("updateLayerParameters requires a non-null layerBlock");
        }
        y1.i0 i0Var = J;
        if (i0Var.f14904b != 1.0f) {
            i0Var.f14903a |= 1;
            i0Var.f14904b = 1.0f;
        }
        if (i0Var.f14905c != 1.0f) {
            i0Var.f14903a |= 2;
            i0Var.f14905c = 1.0f;
        }
        i0Var.b(1.0f);
        i0Var.d(0.0f);
        long j5 = y1.w.f14964a;
        i0Var.c(j5);
        i0Var.f(j5);
        if (i0Var.f14910h != 0.0f) {
            i0Var.f14903a |= 1024;
            i0Var.f14910h = 0.0f;
        }
        if (i0Var.f14911i != 8.0f) {
            i0Var.f14903a |= 2048;
            i0Var.f14911i = 8.0f;
        }
        long j10 = y1.p0.f14946a;
        if (i0Var.f14912j != j10) {
            i0Var.f14903a |= ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_LEFT;
            i0Var.f14912j = j10;
        }
        i0Var.e(y1.h0.f14898a);
        if (i0Var.f14913l) {
            i0Var.f14903a |= 16384;
            i0Var.f14913l = false;
        }
        if (i0Var.f14917p != 3) {
            i0Var.f14903a |= 524288;
            i0Var.f14917p = 3;
        }
        i0Var.f14914m = 9205357640488583168L;
        i0Var.f14918q = null;
        i0Var.f14903a = 0;
        h0 h0Var = this.f10692o;
        i0Var.f14915n = h0Var.f10689x;
        i0Var.f14916o = h0Var.f10690y;
        i0Var.f14914m = n3.n.M0(this.f9437c);
        ((r2.u) k0.a(h0Var)).getSnapshotObserver().a(this, e.f10625e, new b1.a(13, kVar));
        v vVar = this.C;
        if (vVar == null) {
            vVar = new v();
            this.C = vVar;
        }
        v vVar2 = K;
        vVar2.getClass();
        vVar2.f10829a = vVar.f10829a;
        vVar2.f10830b = vVar.f10830b;
        vVar2.f10831c = vVar.f10831c;
        vVar2.f10832d = vVar.f10832d;
        vVar2.f10833e = vVar.f10833e;
        vVar.f10829a = i0Var.f14904b;
        vVar.f10830b = i0Var.f14905c;
        vVar.f10831c = i0Var.f14910h;
        vVar.f10832d = i0Var.f14911i;
        vVar.f10833e = i0Var.f14912j;
        p1Var.d(i0Var);
        boolean z12 = this.f10696s;
        boolean z13 = i0Var.f14913l;
        this.f10696s = z13;
        this.f10700w = i0Var.f14906d;
        if (vVar2.f10829a == vVar.f10829a && vVar2.f10830b == vVar.f10830b && vVar2.f10831c == vVar.f10831c && vVar2.f10832d == vVar.f10832d && vVar2.f10833e == vVar.f10833e) {
            z11 = true;
        }
        boolean z14 = !z11;
        if (z10 && ((!z11 || z12 != z13) && (q1Var = h0Var.f10678m) != null)) {
            ((r2.u) q1Var).C(h0Var);
        }
        return z14;
    }

    public final boolean f1(long j5) {
        if ((((9187343241974906880L ^ (j5 & 9187343241974906880L)) - 4294967297L) & (-9223372034707292160L)) != 0) {
            return false;
        }
        p1 p1Var = this.I;
        return p1Var == null || !this.f10696s || p1Var.f(j5);
    }

    @Override // o2.r
    public final n3.o getLayoutDirection() {
        return this.f10692o.f10690y;
    }

    @Override // o2.w
    public final x1.c h(o2.w wVar, boolean z10) {
        if (!G0().f11129n) {
            n2.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if (!wVar.isAttached()) {
            n2.a.b("LayoutCoordinates " + wVar + " is not attached!");
        }
        h1 h1VarZ0 = Z0(wVar);
        h1VarZ0.Q0();
        h1 h1VarC0 = C0(h1VarZ0);
        x1.a aVar = this.B;
        if (aVar == null) {
            aVar = new x1.a();
            this.B = aVar;
        }
        aVar.f14517a = 0.0f;
        aVar.f14518b = 0.0f;
        aVar.f14519c = (int) (wVar.l() >> 32);
        aVar.f14520d = (int) (wVar.l() & 4294967295L);
        while (h1VarZ0 != h1VarC0) {
            h1VarZ0.W0(aVar, z10, false);
            if (aVar.b()) {
                return x1.c.f14522e;
            }
            h1VarZ0 = h1VarZ0.f10694q;
            i9.l.b(h1VarZ0);
        }
        v0(h1VarC0, aVar, z10);
        return new x1.c(aVar.f14517a, aVar.f14518b, aVar.f14519c, aVar.f14520d);
    }

    @Override // o2.w
    public final boolean isAttached() {
        return G0().f11129n;
    }

    @Override // o2.w
    public final void k(float[] fArr) {
        q1 q1VarA = k0.a(this.f10692o);
        h1 h1VarZ0 = Z0(o2.d1.g(this));
        c1(h1VarZ0, fArr);
        if (q1VarA instanceof k2.j) {
            ((r2.u) ((k2.j) q1VarA)).w(fArr);
            return;
        }
        long jT = h1VarZ0.t(0L);
        if ((9223372034707292159L & jT) != 9205357640488583168L) {
            y1.a0.f(fArr, Float.intBitsToFloat((int) (jT >> 32)), Float.intBitsToFloat((int) (jT & 4294967295L)));
        }
    }

    @Override // q2.p0
    public final p0 k0() {
        return this.f10693p;
    }

    @Override // o2.w
    public final long l() {
        return this.f9437c;
    }

    @Override // q2.p0
    public final o2.w l0() {
        return this;
    }

    @Override // q2.p0
    public final boolean m0() {
        return this.f10701x != null;
    }

    @Override // o2.w
    public final long n(o2.w wVar, long j5) {
        return P0(wVar, j5);
    }

    @Override // q2.p0
    public final h0 n0() {
        return this.f10692o;
    }

    @Override // q2.p0
    public final o2.n0 o0() {
        o2.n0 n0Var = this.f10701x;
        if (n0Var != null) {
            return n0Var;
        }
        throw new IllegalStateException("Asking for measurement result of unmeasured layout modifier");
    }

    @Override // q2.r1
    public final boolean p() {
        return (this.I == null || this.f10695r || !this.f10692o.I()) ? false : true;
    }

    @Override // q2.p0
    public final p0 p0() {
        return this.f10694q;
    }

    @Override // q2.p0
    public final long q0() {
        return this.f10703z;
    }

    @Override // o2.w
    public final long t(long j5) {
        if (!G0().f11129n) {
            n2.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return ((r2.u) k0.a(this.f10692o)).x(E(j5));
    }

    @Override // q2.p0
    public final void u0() {
        T(this.f10703z, this.A, this.f10697t);
    }

    @Override // o2.w
    public final long v(long j5) {
        if (!G0().f11129n) {
            n2.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        o2.w wVarG = o2.d1.g(this);
        r2.u uVar = (r2.u) k0.a(this.f10692o);
        uVar.G();
        return P0(wVarG, x1.b.g(y1.a0.b(j5, uVar.U), wVarG.E(0L)));
    }

    public final void v0(h1 h1Var, x1.a aVar, boolean z10) {
        if (h1Var == this) {
            return;
        }
        h1 h1Var2 = this.f10694q;
        if (h1Var2 != null) {
            h1Var2.v0(h1Var, aVar, z10);
        }
        long j5 = this.f10703z;
        float f10 = (int) (j5 >> 32);
        aVar.f14517a -= f10;
        aVar.f14519c -= f10;
        float f11 = (int) (j5 & 4294967295L);
        aVar.f14518b -= f11;
        aVar.f14520d -= f11;
        p1 p1Var = this.I;
        if (p1Var != null) {
            p1Var.c(aVar, true);
            if (this.f10696s && z10) {
                long j10 = this.f9437c;
                aVar.a(0.0f, 0.0f, (int) (j10 >> 32), (int) (j10 & 4294967295L));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [r1.o] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [r1.o] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [h1.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [h1.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v4 */
    @Override // o2.v0, o2.l0
    public final Object w() {
        h0 h0Var = this.f10692o;
        if (!h0Var.E.d(64)) {
            return null;
        }
        G0();
        Object objK0 = null;
        for (r1.o oVar = h0Var.E.f10616e; oVar != null; oVar = oVar.f11121e) {
            if ((oVar.f11119c & 64) != 0) {
                ?? F = oVar;
                ?? eVar = 0;
                while (F != 0) {
                    if (F instanceof t1) {
                        objK0 = ((t1) F).k0(objK0);
                    } else if ((F.f11119c & 64) != 0 && (F instanceof m)) {
                        r1.o oVar2 = ((m) F).f10746p;
                        int i7 = 0;
                        F = F;
                        eVar = eVar;
                        while (oVar2 != null) {
                            if ((oVar2.f11119c & 64) != 0) {
                                i7++;
                                if (i7 == 1) {
                                    eVar = eVar;
                                    F = oVar2;
                                } else {
                                    if (eVar == 0) {
                                        eVar = new h1.e(new r1.o[16]);
                                    }
                                    if (F != 0) {
                                        eVar.b(F);
                                        F = 0;
                                    }
                                    eVar.b(oVar2);
                                }
                            }
                            oVar2 = oVar2.f11122f;
                            F = F;
                            eVar = eVar;
                        }
                        if (i7 == 1) {
                        }
                    }
                    F = f.f(eVar);
                }
            }
        }
        return objK0;
    }

    public final long w0(h1 h1Var, long j5) {
        if (h1Var == this) {
            return j5;
        }
        h1 h1Var2 = this.f10694q;
        return (h1Var2 == null || i9.l.a(h1Var, h1Var2)) ? D0(j5) : D0(h1Var2.w0(h1Var, j5));
    }

    @Override // o2.w
    public final o2.w x() {
        if (!G0().f11129n) {
            n2.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        Q0();
        return this.f10692o.E.f10615d.f10694q;
    }

    public final long x0(long j5) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j5 >> 32)) - K();
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j5 & 4294967295L)) - I();
        float fMax = Math.max(0.0f, fIntBitsToFloat / 2.0f);
        return (((long) Float.floatToRawIntBits(Math.max(0.0f, fIntBitsToFloat2 / 2.0f))) & 4294967295L) | (Float.floatToRawIntBits(fMax) << 32);
    }

    public final float y0(long j5, long j10) {
        if (K() >= Float.intBitsToFloat((int) (j10 >> 32)) && I() >= Float.intBitsToFloat((int) (j10 & 4294967295L))) {
            return Float.POSITIVE_INFINITY;
        }
        long jX0 = x0(j10);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jX0 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jX0 & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j5 >> 32));
        float fMax = Math.max(0.0f, fIntBitsToFloat3 < 0.0f ? -fIntBitsToFloat3 : fIntBitsToFloat3 - K());
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j5 & 4294967295L));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Math.max(0.0f, fIntBitsToFloat4 < 0.0f ? -fIntBitsToFloat4 : fIntBitsToFloat4 - I()))) & 4294967295L) | (((long) Float.floatToRawIntBits(fMax)) << 32);
        if (fIntBitsToFloat > 0.0f || fIntBitsToFloat2 > 0.0f) {
            int i7 = (int) (jFloatToRawIntBits >> 32);
            if (Float.intBitsToFloat(i7) <= fIntBitsToFloat) {
                int i10 = (int) (jFloatToRawIntBits & 4294967295L);
                if (Float.intBitsToFloat(i10) <= fIntBitsToFloat2) {
                    float fIntBitsToFloat5 = Float.intBitsToFloat(i7);
                    float fIntBitsToFloat6 = Float.intBitsToFloat(i10);
                    return (fIntBitsToFloat6 * fIntBitsToFloat6) + (fIntBitsToFloat5 * fIntBitsToFloat5);
                }
            }
        }
        return Float.POSITIVE_INFINITY;
    }

    public final void z0(y1.o oVar, b2.c cVar) {
        p1 p1Var = this.I;
        if (p1Var != null) {
            p1Var.e(oVar, cVar);
            return;
        }
        long j5 = this.f10703z;
        float f10 = (int) (j5 >> 32);
        float f11 = (int) (j5 & 4294967295L);
        oVar.n(f10, f11);
        A0(oVar, cVar);
        oVar.n(-f10, -f11);
    }
}
