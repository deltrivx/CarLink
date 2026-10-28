package c8;

import f1.b1;
import f1.h1;
import f1.u0;
import f1.w1;
import java.util.List;
import l8.j0;
import l8.k0;
import l8.m0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f2521a = new n();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n8.s f2522b = new n8.s();

    public final void a(List list, f1.s sVar, int i7) {
        b1 b1Var;
        p1.p pVar;
        sVar.Y(-688929903);
        if ((i7 & 3) == 2 && sVar.z()) {
            sVar.Q();
        } else {
            int i10 = 0;
            List listJ = n3.l.J(new j0("应用日志", new k0(true), null, null, null, 28), new j0("系统日志", new k0(false), null, null, null, 28));
            sVar.W(1849434622);
            Object objK = sVar.K();
            Object obj = f1.n.f5051a;
            if (objK == obj) {
                objK = f1.b.s(u8.p.k0(listJ));
                sVar.h0(objK);
            }
            b1 b1Var2 = (b1) objK;
            Object objC = a2.f.C(sVar, false, 1849434622);
            if (objC == obj) {
                objC = f1.b.s(Boolean.FALSE);
                sVar.h0(objC);
            }
            b1 b1Var3 = (b1) objC;
            sVar.p(false);
            int i11 = 3;
            List listJ2 = n3.l.J(new j0("全部信息", new m0(""), null, null, null, 28), new j0("详细信息", new m0(" V/"), null, null, null, 28), new j0("调试信息", new m0(" D/"), null, null, null, 28), new j0("普通信息", new m0(" I/"), null, null, null, 28), new j0("警告信息", new m0(" W/"), null, null, null, 28), new j0("错误信息", new m0(" E/"), null, null, null, 28));
            sVar.W(1849434622);
            Object objK2 = sVar.K();
            if (objK2 == obj) {
                objK2 = f1.b.s(u8.p.k0(listJ2));
                sVar.h0(objK2);
            }
            b1 b1Var4 = (b1) objK2;
            Object objC2 = a2.f.C(sVar, false, 1849434622);
            if (objC2 == obj) {
                objC2 = f1.b.s(Boolean.FALSE);
                sVar.h0(objC2);
            }
            b1 b1Var5 = (b1) objC2;
            Object objC3 = a2.f.C(sVar, false, 1849434622);
            if (objC3 == obj) {
                objC3 = f1.b.s(Boolean.FALSE);
                sVar.h0(objC3);
            }
            b1 b1Var6 = (b1) objC3;
            Object objC4 = a2.f.C(sVar, false, 1849434622);
            if (objC4 == obj) {
                objC4 = f1.b.s(Boolean.TRUE);
                sVar.h0(objC4);
            }
            b1 b1Var7 = (b1) objC4;
            Object objC5 = a2.f.C(sVar, false, 1849434622);
            if (objC5 == obj) {
                objC5 = new p1.p();
                sVar.h0(objC5);
            }
            p1.p pVar2 = (p1.p) objC5;
            Object objC6 = a2.f.C(sVar, false, 1849434622);
            if (objC6 == obj) {
                Object h1Var = new h1(pVar2.size());
                sVar.h0(h1Var);
                objC6 = h1Var;
            }
            h1 h1Var2 = (h1) objC6;
            sVar.p(false);
            Boolean bool = (Boolean) b1Var6.getValue();
            bool.booleanValue();
            Boolean bool2 = (Boolean) b1Var7.getValue();
            bool2.booleanValue();
            Object obj2 = (j0) b1Var2.getValue();
            sVar.W(-1224400529);
            Object objK3 = sVar.K();
            if (objK3 == obj) {
                b1Var = b1Var4;
                pVar = pVar2;
                objK3 = new e(pVar, b1Var6, b1Var2, b1Var, b1Var7, h1Var2, null);
                sVar.h0(objK3);
            } else {
                b1Var = b1Var4;
                pVar = pVar2;
            }
            h9.n nVar = (h9.n) objK3;
            sVar.p(false);
            y8.h hVar = sVar.R;
            boolean zF = sVar.f(bool) | sVar.f(bool2) | sVar.f(obj2);
            Object objK4 = sVar.K();
            if (zF || objK4 == obj) {
                objK4 = new u0(hVar, nVar);
                sVar.h0(objK4);
            }
            n1.c cVarE = n1.h.e(-1411915192, new a8.y(i11, list), sVar);
            n1.c cVar = b.f2467a;
            sVar.W(5004770);
            Object objK5 = sVar.K();
            if (objK5 == obj) {
                objK5 = new a8.k(b1Var6, 11);
                sVar.h0(objK5);
            }
            sVar.p(false);
            a.a.h(cVarE, cVar, true, (h9.a) objK5, sVar, 3510, 0);
            p1.p pVar3 = pVar;
            l8.n.a(((Boolean) b1Var6.getValue()).booleanValue(), null, 0L, false, h1Var2.f(), n1.h.e(1541327415, new h(b1Var3, b1Var2, listJ, pVar3, b1Var, b1Var5, listJ2, 1), sVar), n1.h.e(1576151352, new a8.w(b1Var6, 17), sVar), n1.h.e(1610975289, new j(pVar3, i10), sVar), n1.h.e(1645799226, new a8.w(b1Var7, 18), sVar), n1.h.e(-1255614072, new j(pVar3, i11), sVar), sVar, 920128512, 22);
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new a8.m(i7, 2, this, list);
        }
    }
}
