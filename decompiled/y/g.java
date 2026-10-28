package y;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.ui.draw.ShadowGraphicsLayerElement;
import b3.r0;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import d0.h;
import d0.l0;
import d0.n0;
import d0.t;
import f1.c0;
import f1.n;
import f1.q1;
import f1.s;
import f1.w1;
import h0.u;
import h9.k;
import h9.o;
import l0.m1;
import l0.q0;
import l8.y;
import n3.r;
import o2.m0;
import q2.a0;
import q2.i;
import q2.j;
import r1.m;
import r1.p;
import r3.l;
import v.t0;
import y1.h0;
import y1.q;
import y1.w;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f14873a;

    static {
        c0 c0Var = l.f11571a;
        long j5 = q.f14951e;
        long j10 = q.f14948b;
        f14873a = new c(j5, j10, j10, q.b(0.38f, j10), q.b(0.38f, j10));
    }

    public static final void a(c cVar, p pVar, n1.c cVar2, s sVar, int i7) {
        int i10;
        sVar.Y(621449936);
        if ((i7 & 6) == 0) {
            i10 = (sVar.f(cVar) ? 4 : 2) | i7;
        } else {
            i10 = i7;
        }
        if ((i7 & 48) == 0) {
            i10 |= sVar.f(pVar) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i10 |= sVar.h(cVar2) ? 256 : 128;
        }
        if (sVar.N(i10 & 1, (i10 & 147) != 146)) {
            float f10 = f.f14861d;
            k0.d dVarA = k0.e.a(f.f14862e);
            float f11 = 0;
            boolean z10 = Float.compare(f10, f11) > 0;
            long j5 = w.f14964a;
            p pVarU = r.U(androidx.compose.foundation.layout.a.j(androidx.compose.foundation.layout.a.l(androidx.compose.foundation.a.b((Float.compare(f10, f11) > 0 || z10) ? pVar.a(new ShadowGraphicsLayerElement(dVarA, z10, j5, j5)) : pVar, cVar.f14849a, h0.f14898a)), 0.0f, f.f14866i, 1), r.N(sVar), true);
            int i11 = (i10 << 3) & 7168;
            d0.s sVarA = d0.q.a(h.f3568c, r1.c.f11103m, sVar, 0);
            long j10 = sVar.T;
            int i12 = (int) (j10 ^ (j10 >>> 32));
            q1 q1VarL = sVar.l();
            p pVarC = r1.a.c(sVar, pVarU);
            j.f10719d0.getClass();
            a0 a0Var = i.f10705b;
            sVar.a0();
            if (sVar.S) {
                sVar.k(a0Var);
            } else {
                sVar.k0();
            }
            f1.b.w(sVar, i.f10708e, sVarA);
            f1.b.w(sVar, i.f10707d, q1VarL);
            q2.h hVar = i.f10709f;
            if (sVar.S || !i9.l.a(sVar.K(), Integer.valueOf(i12))) {
                ob.a.w(i12, sVar, i12, hVar);
            }
            f1.b.w(sVar, i.f10706c, pVarC);
            cVar2.invoke(t.f3631a, sVar, Integer.valueOf(((i11 >> 6) & 112) | 6));
            sVar.p(true);
        } else {
            sVar.Q();
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new u(cVar, pVar, cVar2, i7, 10);
        }
    }

    public static final void b(p pVar, c cVar, k kVar, s sVar, int i7, int i10) {
        int i11;
        int i12;
        sVar.Y(-1430784946);
        int i13 = i10 & 1;
        if (i13 != 0) {
            i11 = i7 | 6;
        } else {
            i11 = (sVar.f(pVar) ? 4 : 2) | i7;
        }
        int i14 = i10 & 2;
        if (i14 != 0) {
            i12 = i11 | 48;
        } else {
            i12 = i11 | (sVar.f(cVar) ? 32 : 16);
        }
        int i15 = i12 | (sVar.h(kVar) ? 256 : 128);
        if (sVar.N(i15 & 1, (i15 & 147) != 146)) {
            if (i13 != 0) {
                pVar = m.f11116a;
            }
            if (i14 != 0) {
                cVar = f14873a;
            }
            a(cVar, pVar, n1.h.e(860259975, new m1(4, kVar, cVar), sVar), sVar, ((i15 << 3) & 112) | ((i15 >> 3) & 14) | 384);
        } else {
            sVar.Q();
        }
        p pVar2 = pVar;
        c cVar2 = cVar;
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new u(pVar2, cVar2, kVar, i7, i10);
        }
    }

    public static final void c(String str, c cVar, p pVar, o oVar, h9.a aVar, s sVar, int i7) {
        int i10;
        sVar.Y(-1027365588);
        if ((i7 & 6) == 0) {
            i10 = (sVar.f(str) ? 4 : 2) | i7;
        } else {
            i10 = i7;
        }
        if ((i7 & 48) == 0) {
            i10 |= sVar.g(true) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i10 |= sVar.f(cVar) ? 256 : 128;
        }
        if ((i7 & 3072) == 0) {
            i10 |= sVar.f(pVar) ? 2048 : 1024;
        }
        if ((i7 & 24576) == 0) {
            i10 |= sVar.h(oVar) ? 16384 : ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT;
        }
        if ((196608 & i7) == 0) {
            i10 |= sVar.h(aVar) ? 131072 : 65536;
        }
        if (sVar.N(i10 & 1, (74899 & i10) != 74898)) {
            r1.g gVar = f.f14863f;
            d0.b bVar = h.f3566a;
            float f10 = f.f14865h;
            d0.f fVarG = h.g(f10);
            boolean z10 = ((i10 & 458752) == 131072) | ((i10 & 112) == 32);
            Object objK = sVar.K();
            if (z10 || objK == n.f5051a) {
                objK = new y(aVar, 11);
                sVar.h0(objK);
            }
            p pVarJ = androidx.compose.foundation.layout.a.j(androidx.compose.foundation.layout.c.j(androidx.compose.foundation.a.d(pVar, str, (h9.a) objK, 12).a(androidx.compose.foundation.layout.c.f820a)), f10, 0.0f, 2);
            n0 n0VarA = l0.a(fVarG, gVar, sVar, 54);
            long j5 = sVar.T;
            int i11 = (int) (j5 ^ (j5 >>> 32));
            q1 q1VarL = sVar.l();
            p pVarC = r1.a.c(sVar, pVarJ);
            j.f10719d0.getClass();
            a0 a0Var = i.f10705b;
            sVar.a0();
            if (sVar.S) {
                sVar.k(a0Var);
            } else {
                sVar.k0();
            }
            q2.h hVar = i.f10708e;
            f1.b.w(sVar, hVar, n0VarA);
            q2.h hVar2 = i.f10707d;
            f1.b.w(sVar, hVar2, q1VarL);
            q2.h hVar3 = i.f10709f;
            if (sVar.S || !i9.l.a(sVar.K(), Integer.valueOf(i11))) {
                ob.a.w(i11, sVar, i11, hVar3);
            }
            q2.h hVar4 = i.f10706c;
            f1.b.w(sVar, hVar4, pVarC);
            if (oVar == null) {
                sVar.W(-1483499797);
                sVar.p(false);
            } else {
                sVar.W(-1483499796);
                float f11 = f.f14867j;
                p pVarG = androidx.compose.foundation.layout.c.g(m.f11116a, f11, 0.0f, f11, f11, 2);
                m0 m0VarD = d0.m.d(r1.c.f11092a, false);
                long j10 = sVar.T;
                int i12 = (int) (j10 ^ (j10 >>> 32));
                q1 q1VarL2 = sVar.l();
                p pVarC2 = r1.a.c(sVar, pVarG);
                sVar.a0();
                if (sVar.S) {
                    sVar.k(a0Var);
                } else {
                    sVar.k0();
                }
                f1.b.w(sVar, hVar, m0VarD);
                f1.b.w(sVar, hVar2, q1VarL2);
                if (sVar.S || !i9.l.a(sVar.K(), Integer.valueOf(i12))) {
                    ob.a.w(i12, sVar, i12, hVar3);
                }
                f1.b.w(sVar, hVar4, pVarC2);
                oVar.invoke(new q(cVar.f14851c), sVar, 0);
                sVar.p(true);
                sVar.p(false);
            }
            r0 r0Var = new r0(cVar.f14850b, f.f14869m, f.f14870n, f.f14872p, f.f14864g, f.f14871o, 16613240);
            if (1.0f <= 0.0d) {
                e0.a.a("invalid weight; must be greater than zero");
            }
            q0.a(str, new LayoutWeightElement(1.0f, true), r0Var, 0, false, 1, 0, sVar, (i10 & 14) | 1572864, 952);
            sVar.p(true);
        } else {
            sVar.Q();
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new t0(str, cVar, pVar, oVar, aVar, i7, 1);
        }
    }
}
