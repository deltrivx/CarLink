package g8;

import a8.y;
import androidx.compose.foundation.layout.FillElement;
import c8.k;
import com.muyetuge.carlifevehicle.activity.MainActivity;
import d0.m;
import f1.b1;
import f1.n;
import f1.q1;
import f1.s;
import f1.w0;
import f1.w1;
import i9.l;
import java.util.List;
import o2.m0;
import q2.a0;
import r1.p;
import t8.j;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f6011a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f6012b = new d();

    public void a(int i7, s sVar) {
        Boolean bool;
        p pVarK;
        p pVarB;
        r1.h hVar = r1.c.f11092a;
        sVar.Y(-186404066);
        if ((i7 & 1) == 0 && sVar.z()) {
            sVar.Q();
        } else {
            b1 b1VarK = f1.b.k(i.f6025j, sVar);
            b1 b1VarK2 = f1.b.k(q7.i.f10982g, sVar);
            b1 b1VarK3 = f1.b.k(MainActivity.f2913z, sVar);
            Object obj = null;
            if (((i) b1VarK.getValue()).f6032g || ((q7.i) b1VarK2.getValue()).f10983a != 0) {
                bool = (Boolean) b1VarK3.getValue();
                bool.getClass();
            } else {
                bool = null;
            }
            j jVarE = n8.h.e();
            int iIntValue = ((Number) jVarE.f12830a).intValue();
            int iIntValue2 = ((Number) jVarE.f12831b).intValue();
            sVar.U(1254332093, bool);
            FillElement fillElement = androidx.compose.foundation.layout.c.f822c;
            m0 m0VarD = m.d(hVar, false);
            long j5 = sVar.T;
            int i10 = (int) (j5 ^ (j5 >>> 32));
            q1 q1VarL = sVar.l();
            p pVarC = r1.a.c(sVar, fillElement);
            q2.j.f10719d0.getClass();
            a0 a0Var = q2.i.f10705b;
            sVar.a0();
            if (sVar.S) {
                sVar.k(a0Var);
            } else {
                sVar.k0();
            }
            f1.b.w(sVar, q2.i.f10708e, m0VarD);
            f1.b.w(sVar, q2.i.f10707d, q1VarL);
            q2.h hVar2 = q2.i.f10709f;
            if (sVar.S || !l.a(sVar.K(), Integer.valueOf(i10))) {
                ob.a.w(i10, sVar, i10, hVar2);
            }
            f1.b.w(sVar, q2.i.f10706c, pVarC);
            d dVar = c.f6005d;
            int i11 = ((i) b1VarK.getValue()).f6028c;
            dVar.getClass();
            for (Object obj2 : c.f6007f) {
                if (((c) obj2).f6009b == i11) {
                    obj = obj2;
                    break;
                }
            }
            c cVar = (c) obj;
            r1.h hVar3 = cVar != null ? cVar.f6010c : r1.c.f11096e;
            androidx.compose.foundation.layout.b bVar = androidx.compose.foundation.layout.b.f819a;
            r1.m mVar = r1.m.f11116a;
            p pVarA = bVar.a(mVar, hVar3);
            int i12 = ((i) b1VarK.getValue()).f6026a;
            if (1 > i12 || i12 >= iIntValue) {
                pVarK = androidx.compose.foundation.layout.c.f820a;
            } else {
                hc.c cVar2 = n8.c.f8897a;
                pVarK = androidx.compose.foundation.layout.c.k(mVar, n8.c.h(((i) b1VarK.getValue()).f6026a));
            }
            p pVarA2 = pVarA.a(pVarK);
            int i13 = ((i) b1VarK.getValue()).f6027b;
            if (1 > i13 || i13 >= iIntValue2) {
                pVarB = androidx.compose.foundation.layout.c.f821b;
            } else {
                hc.c cVar3 = n8.c.f8897a;
                pVarB = androidx.compose.foundation.layout.c.b(mVar, n8.c.h(((i) b1VarK.getValue()).f6027b));
            }
            p pVarA3 = pVarA2.a(pVarB);
            m0 m0VarD2 = m.d(hVar, false);
            long j10 = sVar.T;
            int i14 = (int) (j10 ^ (j10 >>> 32));
            q1 q1VarL2 = sVar.l();
            p pVarC2 = r1.a.c(sVar, pVarA3);
            q2.j.f10719d0.getClass();
            a0 a0Var2 = q2.i.f10705b;
            sVar.a0();
            if (sVar.S) {
                sVar.k(a0Var2);
            } else {
                sVar.k0();
            }
            f1.b.w(sVar, q2.i.f10708e, m0VarD2);
            f1.b.w(sVar, q2.i.f10707d, q1VarL2);
            q2.h hVar4 = q2.i.f10709f;
            if (sVar.S || !l.a(sVar.K(), Integer.valueOf(i14))) {
                ob.a.w(i14, sVar, i14, hVar4);
            }
            f1.b.w(sVar, q2.i.f10706c, pVarC2);
            f6011a.b((i) b1VarK.getValue(), sVar, 48);
            sVar.p(true);
            sVar.p(true);
            sVar.p(false);
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new b3.a(i7, 11, this);
        }
    }

    public void b(i iVar, s sVar, int i7) {
        l.e(iVar, "state");
        sVar.Y(1729921402);
        int i10 = (sVar.f(iVar) ? 4 : 2) | i7;
        if ((i10 & 3) == 2 && sVar.z()) {
            sVar.Q();
        } else {
            FillElement fillElement = androidx.compose.foundation.layout.c.f822c;
            sVar.W(5004770);
            boolean z10 = (i10 & 14) == 4;
            Object objK = sVar.K();
            if (z10 || objK == n.f5051a) {
                objK = new k(12, iVar);
                sVar.h0(objK);
            }
            sVar.p(false);
            androidx.compose.ui.viewinterop.a.b((h9.k) objK, fillElement, null, sVar, 48);
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new a8.m(i7, 8, this, iVar);
        }
    }

    public void c(List list, s sVar, int i7) {
        List listJ;
        sVar.Y(-1348632469);
        if (((i7 | 6) & 3) == 2 && sVar.z()) {
            sVar.Q();
            listJ = list;
        } else {
            listJ = n3.l.J("视频设置", "CarLife显示画面设置");
            b1 b1VarK = f1.b.k(i.f6025j, sVar);
            sVar.W(1849434622);
            Object objK = sVar.K();
            w0 w0Var = n.f5051a;
            if (objK == w0Var) {
                objK = f1.b.s(Boolean.FALSE);
                sVar.h0(objK);
            }
            b1 b1Var = (b1) objK;
            sVar.p(false);
            n1.c cVarE = n1.h.e(-352793246, new y(11, listJ), sVar);
            n1.c cVar = b.f6004a;
            sVar.W(5004770);
            Object objK2 = sVar.K();
            if (objK2 == w0Var) {
                objK2 = new f0.k(b1Var, 8);
                sVar.h0(objK2);
            }
            sVar.p(false);
            a.a.h(cVarE, cVar, false, (h9.a) objK2, sVar, 3126, 4);
            boolean zBooleanValue = ((Boolean) b1Var.getValue()).booleanValue();
            sVar.W(5004770);
            Object objK3 = sVar.K();
            if (objK3 == w0Var) {
                objK3 = new f0.k(b1Var, 9);
                sVar.h0(objK3);
            }
            sVar.p(false);
            l8.n.a(zBooleanValue, (h9.a) objK3, 0L, false, 0, null, null, null, null, n1.h.e(-471272286, new h(b1VarK, 2), sVar), sVar, 48, 1020);
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new a8.m(i7, 9, this, listJ);
        }
    }
}
