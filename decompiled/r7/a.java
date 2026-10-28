package r7;

import a2.f;
import androidx.compose.foundation.layout.c;
import b0.k;
import d0.m;
import d0.w0;
import f1.b1;
import f1.n;
import f1.q1;
import f1.s;
import f1.w1;
import i9.l;
import k0.e;
import l8.y;
import o2.m0;
import q2.a0;
import q2.i;
import q2.j;
import r1.h;
import r1.p;
import t7.g;
import y1.q;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a implements g {
    @Override // t7.g
    public final void a() {
    }

    @Override // t7.g
    public final String b() {
        return "小白条";
    }

    @Override // t7.g
    public final void c(int i7, s sVar) {
        sVar.Y(-336296173);
        if ((i7 & 1) == 0 && sVar.z()) {
            sVar.Q();
        } else {
            b1 b1VarK = f1.b.k(b.f11641f, sVar);
            if (((b) b1VarK.getValue()).f11642a) {
                p pVarA = r1.a.a(c.f822c, new w0(0));
                h hVar = r1.c.f11092a;
                m0 m0VarD = m.d(hVar, false);
                long j5 = sVar.T;
                int i10 = (int) (j5 ^ (j5 >>> 32));
                q1 q1VarL = sVar.l();
                p pVarC = r1.a.c(sVar, pVarA);
                j.f10719d0.getClass();
                a0 a0Var = i.f10705b;
                sVar.a0();
                if (sVar.S) {
                    sVar.k(a0Var);
                } else {
                    sVar.k0();
                }
                q2.h hVar2 = i.f10708e;
                f1.b.w(sVar, hVar2, m0VarD);
                q2.h hVar3 = i.f10707d;
                f1.b.w(sVar, hVar3, q1VarL);
                q2.h hVar4 = i.f10709f;
                if (sVar.S || !l.a(sVar.K(), Integer.valueOf(i10))) {
                    ob.a.w(i10, sVar, i10, hVar4);
                }
                q2.h hVar5 = i.f10706c;
                f1.b.w(sVar, hVar5, pVarC);
                h hVar6 = r1.c.f11099h;
                androidx.compose.foundation.layout.b bVar = androidx.compose.foundation.layout.b.f819a;
                r1.m mVar = r1.m.f11116a;
                p pVarA2 = bVar.a(mVar, hVar6);
                sVar.W(1849434622);
                Object objK = sVar.K();
                f1.w0 w0Var = n.f5051a;
                if (objK == w0Var) {
                    objK = ob.a.m(sVar);
                }
                k kVar = (k) objK;
                Object objC = f.C(sVar, false, 1849434622);
                if (objC == w0Var) {
                    objC = new n8.f(20);
                    sVar.h0(objC);
                }
                h9.a aVar = (h9.a) objC;
                Object objC2 = f.C(sVar, false, 1849434622);
                if (objC2 == w0Var) {
                    objC2 = new n8.f(21);
                    sVar.h0(objC2);
                }
                sVar.p(false);
                p pVarE = androidx.compose.foundation.a.e(pVarA2, kVar, aVar, (h9.a) objC2);
                m0 m0VarD2 = m.d(hVar, false);
                long j10 = sVar.T;
                int i11 = (int) (j10 ^ (j10 >>> 32));
                q1 q1VarL2 = sVar.l();
                p pVarC2 = r1.a.c(sVar, pVarE);
                sVar.a0();
                if (sVar.S) {
                    sVar.k(a0Var);
                } else {
                    sVar.k0();
                }
                f1.b.w(sVar, hVar2, m0VarD2);
                f1.b.w(sVar, hVar3, q1VarL2);
                if (sVar.S || !l.a(sVar.K(), Integer.valueOf(i11))) {
                    ob.a.w(i11, sVar, i11, hVar4);
                }
                f1.b.w(sVar, hVar5, pVarC2);
                m.a(c.b(c.k(androidx.compose.foundation.a.b(androidx.compose.foundation.layout.a.k(androidx.compose.foundation.layout.a.j(bVar.a(mVar, r1.c.f11096e), g5.a.n(50, sVar), 0.0f, 2), 0.0f, g5.a.n(10, sVar), 0.0f, g5.a.n(((b) b1VarK.getValue()).f11645d, sVar), 5), q.b(0.5f, q.f14949c), e.a(g5.a.n(3, sVar))), g5.a.n(((b) b1VarK.getValue()).f11643b, sVar)), g5.a.n(((b) b1VarK.getValue()).f11644c, sVar)), sVar, 0);
                sVar.p(true);
                sVar.p(true);
            }
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new b3.a(i7, 21, this);
        }
    }

    @Override // t7.g
    public final void d(boolean z10, h9.a aVar, s sVar, int i7) {
        l.e(aVar, "onDismissRequest");
        sVar.Y(-1754299493);
        int i10 = i7 | (sVar.g(z10) ? 4 : 2);
        if ((i10 & 19) == 18 && sVar.z()) {
            sVar.Q();
        } else {
            b1 b1VarK = f1.b.k(b.f11641f, sVar);
            sVar.W(5004770);
            Object objK = sVar.K();
            if (objK == n.f5051a) {
                objK = new y(aVar, 6);
                sVar.h0(objK);
            }
            sVar.p(false);
            l8.n.a(z10, (h9.a) objK, 0L, false, 0, null, null, null, null, n1.h.e(2086541060, new g8.h(b1VarK, 11), sVar), sVar, i10 & 14, 1020);
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new q7.c(this, z10, aVar, i7, 1);
        }
    }

    @Override // t7.g
    public final String e() {
        return "屏幕底部小白条";
    }

    @Override // t7.g
    public final String getName() {
        return "Gesture";
    }
}
