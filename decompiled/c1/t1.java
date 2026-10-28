package c1;

import androidx.compose.foundation.layout.FillElement;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t1 f2165a = new t1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f2166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f2167c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final y1.h f2168d;

    static {
        float f10 = e1.m.f4023e;
        f2166b = f10;
        f2167c = f10;
        f2168d = y1.j.a();
    }

    public static m1 c(f1.s sVar) {
        w wVar = (w) sVar.j(y.f2319a);
        m1 m1Var = wVar.N;
        if (m1Var != null) {
            return m1Var;
        }
        float f10 = e1.m.f4019a;
        m1 m1Var2 = new m1(y.c(wVar, 26), y.c(wVar, 26), y.c(wVar, 32), y.c(wVar, 32), y.c(wVar, 26), y1.h0.k(y1.q.b(0.38f, y.c(wVar, 18)), wVar.f2239p), y1.q.b(0.38f, y.c(wVar, 18)), y1.q.b(0.12f, y.c(wVar, 18)), y1.q.b(0.12f, y.c(wVar, 18)), y1.q.b(0.38f, y.c(wVar, 18)));
        wVar.N = m1Var2;
        return m1Var2;
    }

    public static void d(a2.g gVar, long j5, long j10, long j11, float f10, float f11) {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(f10)) & 4294967295L);
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(f11)) << 32) | (((long) Float.floatToRawIntBits(f11)) & 4294967295L);
        x1.c cVarC = n3.u.c(n3.r.a(x1.b.d(j5), 0.0f), n3.l.h(x1.e.d(j10), x1.e.b(j10)));
        x1.d dVar = new x1.d(cVarC.f14523a, cVarC.f14524b, cVarC.f14525c, cVarC.f14526d, jFloatToRawIntBits, jFloatToRawIntBits2, jFloatToRawIntBits2, jFloatToRawIntBits);
        y1.h hVar = f2168d;
        ob.a.i(hVar, dVar);
        a2.f.u(gVar, hVar, j11, null, 60);
        hVar.f14895a.rewind();
    }

    public final void a(b0.k kVar, r1.p pVar, m1 m1Var, boolean z10, long j5, f1.s sVar, int i7) {
        long j10;
        r1.p pVar2;
        long jFloatToRawIntBits;
        long j11;
        r1.p pVar3;
        sVar.Y(-290277409);
        int i10 = i7 | (sVar.f(kVar) ? 4 : 2) | 48 | (sVar.f(m1Var) ? 256 : 128) | (sVar.g(z10) ? 2048 : 1024) | 24576;
        if ((74899 & i10) == 74898 && sVar.z()) {
            sVar.Q();
            pVar3 = pVar;
            j11 = j5;
        } else {
            sVar.S();
            if ((i7 & 1) == 0 || sVar.x()) {
                j10 = g2.f1894c;
                pVar2 = r1.m.f11116a;
            } else {
                sVar.Q();
                pVar2 = pVar;
                j10 = j5;
            }
            sVar.q();
            Object objK = sVar.K();
            f1.w0 w0Var = f1.n.f5051a;
            if (objK == w0Var) {
                objK = new p1.p();
                sVar.h0(objK);
            }
            p1.p pVar4 = (p1.p) objK;
            boolean z11 = (i10 & 14) == 4;
            Object objK2 = sVar.K();
            if (z11 || objK2 == w0Var) {
                objK2 = new d(kVar, pVar4, null, 1);
                sVar.h0(objK2);
            }
            f1.b.f(sVar, (h9.n) objK2, kVar);
            if (pVar4.isEmpty()) {
                jFloatToRawIntBits = j10;
            } else {
                jFloatToRawIntBits = (((long) Float.floatToRawIntBits(n3.h.b(j10) / 2)) << 32) | (((long) Float.floatToRawIntBits(n3.h.a(j10))) & 4294967295L);
            }
            FillElement fillElement = androidx.compose.foundation.layout.c.f820a;
            r1.p pVarG = androidx.compose.foundation.a.g(androidx.compose.foundation.layout.c.i(pVar2, n3.h.b(jFloatToRawIntBits), n3.h.a(jFloatToRawIntBits)), kVar);
            long j12 = z10 ? m1Var.f1999a : m1Var.f2004f;
            float f10 = e1.m.f4019a;
            d0.c.a(sVar, androidx.compose.foundation.a.b(pVarG, j12, l1.a(5, sVar)));
            j11 = j10;
            pVar3 = pVar2;
        }
        f1.w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new o1(this, kVar, pVar3, m1Var, z10, j11, i7);
        }
    }

    public final void b(i2 i2Var, r1.p pVar, boolean z10, m1 m1Var, h9.n nVar, h9.o oVar, float f10, float f11, f1.s sVar, int i7) {
        int i10;
        float f12;
        float f13;
        h9.o oVar2;
        h9.n nVar2;
        int i11;
        r1.p pVar2;
        f1.s sVar2;
        float f14;
        float f15;
        float f16;
        float f17;
        h9.n nVar3;
        h9.o oVar3;
        r1.p pVar3;
        sVar.Y(49984771);
        if ((i7 & 6) == 0) {
            i10 = (sVar.h(i2Var) ? 4 : 2) | i7;
        } else {
            i10 = i7;
        }
        int i12 = i10 | 48;
        if ((i7 & 384) == 0) {
            i12 |= sVar.g(z10) ? 256 : 128;
        }
        if ((i7 & 3072) == 0) {
            i12 |= sVar.f(m1Var) ? 2048 : 1024;
        }
        if ((i7 & 24576) == 0) {
            i12 |= ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT;
        }
        int i13 = i12 | 14352384;
        if ((100663296 & i7) == 0) {
            i13 |= sVar.f(this) ? 67108864 : ServiceTypes.MSG_VEHICLE_CONTROL_AREA_ID_ZONE;
        }
        if ((38347923 & i13) == 38347922 && sVar.z()) {
            sVar.Q();
            pVar3 = pVar;
            nVar3 = nVar;
            oVar3 = oVar;
            f16 = f10;
            f17 = f11;
            sVar2 = sVar;
        } else {
            sVar.S();
            int i14 = i7 & 1;
            f1.w0 w0Var = f1.n.f5051a;
            if (i14 == 0 || sVar.x()) {
                boolean z11 = ((i13 & 896) == 256) | ((((i13 & 7168) ^ 3072) > 2048 && sVar.f(m1Var)) || (i13 & 3072) == 2048);
                Object objK = sVar.K();
                if (z11 || objK == w0Var) {
                    objK = new p1(m1Var, z10);
                    sVar.h0(objK);
                }
                h9.n nVar4 = (h9.n) objK;
                f12 = g2.f1895d;
                f13 = g2.f1896e;
                r1.m mVar = r1.m.f11116a;
                oVar2 = q1.f2076a;
                nVar2 = nVar4;
                i11 = i13 & (-57345);
                pVar2 = mVar;
            } else {
                sVar.Q();
                nVar2 = nVar;
                oVar2 = oVar;
                f12 = f10;
                f13 = f11;
                i11 = i13 & (-57345);
                pVar2 = pVar;
            }
            sVar.q();
            int i15 = i11;
            long jA = m1Var.a(z10, false);
            float f18 = f12;
            float f19 = f13;
            long jA2 = m1Var.a(z10, true);
            long j5 = z10 ? m1Var.f2003e : m1Var.f2008j;
            long j10 = z10 ? m1Var.f2001c : m1Var.f2006h;
            r1.p pVar4 = pVar2;
            r1.p pVarP = n3.l.P(androidx.compose.foundation.layout.c.b(pVar2.a(androidx.compose.foundation.layout.c.f820a), g2.f1892a), sVar.j(r2.j1.f11281n) == n3.o.f8750b ? 180.0f : 0.0f);
            long j11 = j5;
            boolean zH = ((i15 & 3670016) == 1048576) | sVar.h(i2Var) | sVar.e(jA) | sVar.e(jA2) | sVar.e(j11) | sVar.e(j10) | ((i15 & 29360128) == 8388608) | sVar.f(nVar2) | ((i15 & 458752) == 131072);
            Object objK2 = sVar.K();
            if (zH || objK2 == w0Var) {
                sVar2 = sVar;
                f14 = f18;
                f15 = f19;
                r1 r1Var = new r1(i2Var, jA, jA2, j11, j10, f14, f15, nVar2, oVar2);
                sVar2.h0(r1Var);
                objK2 = r1Var;
            } else {
                f14 = f18;
                sVar2 = sVar;
                f15 = f19;
            }
            n3.u.a(0, sVar2, (h9.k) objK2, pVarP);
            f16 = f14;
            f17 = f15;
            nVar3 = nVar2;
            oVar3 = oVar2;
            pVar3 = pVar4;
        }
        f1.w1 w1VarR = sVar2.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new s1(this, i2Var, pVar3, z10, m1Var, nVar3, oVar3, f16, f17, i7);
        }
    }
}
