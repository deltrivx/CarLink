package o2;

import f1.q1;
import f1.w1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f9316a = new i(3);

    public static final void a(h1 h1Var, r1.p pVar, h9.n nVar, f1.s sVar, int i7) {
        sVar.Y(-511989831);
        int i10 = (sVar.h(h1Var) ? 4 : 2) | i7 | (sVar.f(pVar) ? 32 : 16) | (sVar.h(nVar) ? 256 : 128);
        if (sVar.N(i10 & 1, (i10 & 147) != 146)) {
            long j5 = sVar.T;
            int i11 = (int) (j5 ^ (j5 >>> 32));
            f1.q qVarU = f1.b.u(sVar);
            r1.p pVarC = r1.a.c(sVar, pVar);
            q1 q1VarL = sVar.l();
            sVar.a0();
            if (sVar.S) {
                sVar.k(q2.a0.f10586a);
            } else {
                sVar.k0();
            }
            f1.b.w(sVar, h1Var.f9337c, h1Var);
            f1.b.w(sVar, h1Var.f9338d, qVarU);
            f1.b.w(sVar, h1Var.f9339e, nVar);
            q2.j.f10719d0.getClass();
            f1.b.w(sVar, q2.i.f10707d, q1VarL);
            f1.b.w(sVar, q2.i.f10706c, pVarC);
            q2.h hVar = q2.i.f10709f;
            if (sVar.S || !i9.l.a(sVar.K(), Integer.valueOf(i11))) {
                ob.a.w(i11, sVar, i11, hVar);
            }
            sVar.p(true);
            if (sVar.z()) {
                sVar.W(-1259216055);
                sVar.p(false);
            } else {
                sVar.W(-1259274676);
                boolean zH = sVar.h(h1Var);
                Object objK = sVar.K();
                if (zH || objK == f1.n.f5051a) {
                    objK = new b1.a(10, h1Var);
                    sVar.h0(objK);
                }
                f1.b.h((h9.a) objK, sVar);
                sVar.p(false);
            }
        } else {
            sVar.Q();
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new d1.k(h1Var, pVar, nVar, i7, 1);
        }
    }

    public static final float b(long j5, long j10) {
        return Math.min(Float.intBitsToFloat((int) (j10 >> 32)) / Float.intBitsToFloat((int) (j5 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)) / Float.intBitsToFloat((int) (j5 & 4294967295L)));
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001c  */
    public static final float c(u0 u0Var, boolean z10, o[] oVarArr, float f10) {
        float f11 = Float.NaN;
        for (o oVar : oVarArr) {
            float fC = u0Var.c(oVar);
            if (Float.isNaN(f11)) {
                f11 = fC;
            } else if (z10 == (fC > f11)) {
                f11 = fC;
            }
        }
        return Float.isNaN(f11) ? f10 : f11;
    }

    public static final x1.c d(w wVar) {
        w wVarX = wVar.x();
        return wVarX != null ? wVarX.h(wVar, true) : new x1.c(0.0f, 0.0f, (int) (wVar.l() >> 32), (int) (wVar.l() & 4294967295L));
    }

    public static final x1.c e(w wVar) {
        w wVarG = g(wVar);
        float fL = (int) (wVarG.l() >> 32);
        float fL2 = (int) (wVarG.l() & 4294967295L);
        x1.c cVarH = wVarG.h(wVar, true);
        float f10 = cVarH.f14523a;
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f10 > fL) {
            f10 = fL;
        }
        float f11 = cVarH.f14524b;
        if (f11 < 0.0f) {
            f11 = 0.0f;
        }
        if (f11 > fL2) {
            f11 = fL2;
        }
        float f12 = cVarH.f14525c;
        if (f12 < 0.0f) {
            f12 = 0.0f;
        }
        if (f12 <= fL) {
            fL = f12;
        }
        float f13 = cVarH.f14526d;
        float f14 = f13 >= 0.0f ? f13 : 0.0f;
        if (f14 <= fL2) {
            fL2 = f14;
        }
        if (f10 == fL || f11 == fL2) {
            return x1.c.f14522e;
        }
        long jD = wVarG.d((((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(f11)) & 4294967295L));
        long jD2 = wVarG.d((((long) Float.floatToRawIntBits(f11)) & 4294967295L) | (((long) Float.floatToRawIntBits(fL)) << 32));
        long jD3 = wVarG.d((((long) Float.floatToRawIntBits(fL)) << 32) | (((long) Float.floatToRawIntBits(fL2)) & 4294967295L));
        long jD4 = wVarG.d((((long) Float.floatToRawIntBits(fL2)) & 4294967295L) | (((long) Float.floatToRawIntBits(f10)) << 32));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jD >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jD2 >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jD4 >> 32));
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jD3 >> 32));
        float fMin = Math.min(fIntBitsToFloat, Math.min(fIntBitsToFloat2, Math.min(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fMax = Math.max(fIntBitsToFloat, Math.max(fIntBitsToFloat2, Math.max(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (jD & 4294967295L));
        float fIntBitsToFloat6 = Float.intBitsToFloat((int) (jD2 & 4294967295L));
        float fIntBitsToFloat7 = Float.intBitsToFloat((int) (jD4 & 4294967295L));
        float fIntBitsToFloat8 = Float.intBitsToFloat((int) (4294967295L & jD3));
        return new x1.c(fMin, Math.min(fIntBitsToFloat5, Math.min(fIntBitsToFloat6, Math.min(fIntBitsToFloat7, fIntBitsToFloat8))), fMax, Math.max(fIntBitsToFloat5, Math.max(fIntBitsToFloat6, Math.max(fIntBitsToFloat7, fIntBitsToFloat8))));
    }

    public static final boolean f(long j5, long j10) {
        return j5 == j10;
    }

    public static final w g(w wVar) {
        w wVar2;
        w wVarX = wVar.x();
        while (true) {
            w wVar3 = wVarX;
            wVar2 = wVar;
            wVar = wVar3;
            if (wVar == null) {
                break;
            }
            wVarX = wVar.x();
        }
        q2.h1 h1Var = wVar2 instanceof q2.h1 ? (q2.h1) wVar2 : null;
        if (h1Var == null) {
            return wVar2;
        }
        q2.h1 h1Var2 = h1Var.f10694q;
        while (true) {
            q2.h1 h1Var3 = h1Var2;
            q2.h1 h1Var4 = h1Var;
            h1Var = h1Var3;
            if (h1Var == null) {
                return h1Var4;
            }
            h1Var2 = h1Var.f10694q;
        }
    }

    public static final q2.q0 h(q2.q0 q0Var) {
        q2.h0 h0Var = q0Var.f10779o.f10692o;
        while (true) {
            q2.h0 h0VarV = h0Var.v();
            q2.h0 h0Var2 = null;
            if ((h0VarV != null ? h0VarV.f10673g : null) == null) {
                q2.q0 q0VarE0 = h0Var.E.f10615d.E0();
                i9.l.b(q0VarE0);
                return q0VarE0;
            }
            q2.h0 h0VarV2 = h0Var.v();
            if (h0VarV2 != null) {
                h0Var2 = h0VarV2.f10673g;
            }
            i9.l.b(h0Var2);
            q2.h0 h0VarV3 = h0Var.v();
            i9.l.b(h0VarV3);
            h0Var = h0VarV3.f10673g;
            i9.l.b(h0Var);
        }
    }

    public static final long i(long j5, long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) * Float.intBitsToFloat((int) (j5 >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j10 & 4294967295L)) * Float.intBitsToFloat((int) (j5 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }
}
