package m7;

import a8.e0;
import a8.m;
import a8.n0;
import a8.y;
import android.app.Activity;
import f1.b1;
import f1.h1;
import f1.n;
import f1.s;
import f1.w0;
import f1.w1;
import h9.o;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f8588a = new i();

    public static final boolean b(b1 b1Var) {
        return ((Boolean) b1Var.getValue()).booleanValue();
    }

    public final void a(List list, t8.j jVar, boolean z10, o oVar, s sVar, int i7) {
        h1 h1Var;
        boolean z11;
        Object obj = jVar.f12830a;
        i9.l.e(oVar, "callback");
        sVar.Y(-1786644017);
        if (((i7 | (sVar.f(jVar) ? 32 : 16) | 384) & 1171) == 1170 && sVar.z()) {
            sVar.Q();
            z11 = z10;
        } else {
            sVar.W(1849434622);
            Object objK = sVar.K();
            w0 w0Var = n.f5051a;
            if (objK == w0Var) {
                t8.o oVar2 = n8.d.f8898a;
                objK = f1.b.s(Boolean.valueOf(n8.d.a(obj + "_VERSION", false)));
                sVar.h0(objK);
            }
            b1 b1Var = (b1) objK;
            Object objC = a2.f.C(sVar, false, 1849434622);
            if (objC == w0Var) {
                t8.o oVar3 = n8.d.f8898a;
                objC = f1.b.s(Boolean.valueOf(n8.d.a(obj + "_FOCUS", true)));
                sVar.h0(objC);
            }
            b1 b1Var2 = (b1) objC;
            Object objC2 = a2.f.C(sVar, false, 1849434622);
            if (objC2 == w0Var) {
                t8.o oVar4 = n8.d.f8898a;
                objC2 = new h1(n8.d.b(((Number) jVar.f12831b).intValue(), (String) obj));
                sVar.h0(objC2);
            }
            h1 h1Var2 = (h1) objC2;
            Object objC3 = a2.f.C(sVar, false, 1849434622);
            if (objC3 == w0Var) {
                objC3 = f1.b.s(Boolean.FALSE);
                sVar.h0(objC3);
            }
            b1 b1Var3 = (b1) objC3;
            sVar.p(false);
            n1.c cVarE = n1.h.e(128547974, new y(17, list), sVar);
            n1.c cVarE2 = n1.h.e(-575315001, new n0(b1Var, h1Var2, 1), sVar);
            sVar.W(5004770);
            Object objK2 = sVar.K();
            if (objK2 == w0Var) {
                objK2 = new f0.k(b1Var3, 20);
                sVar.h0(objK2);
            }
            sVar.p(false);
            a.a.h(cVarE, cVarE2, true, (h9.a) objK2, sVar, 3510, 0);
            Boolean boolValueOf = Boolean.valueOf(b(b1Var));
            Integer numValueOf = Integer.valueOf(h1Var2.f());
            sVar.W(-1746271574);
            Object objK3 = sVar.K();
            if (objK3 == w0Var) {
                h1Var = h1Var2;
                e0 e0Var = new e0(b1Var3, b1Var, h1Var, null, 5);
                sVar.h0(e0Var);
                objK3 = e0Var;
            } else {
                h1Var = h1Var2;
            }
            sVar.p(false);
            f1.b.g(boolValueOf, numValueOf, (h9.n) objK3, sVar);
            boolean zBooleanValue = ((Boolean) b1Var3.getValue()).booleanValue();
            sVar.W(5004770);
            Object objK4 = sVar.K();
            if (objK4 == w0Var) {
                objK4 = new f0.k(b1Var3, 21);
                sVar.h0(objK4);
            }
            sVar.p(false);
            l8.n.a(zBooleanValue, (h9.a) objK4, 0L, false, 0, null, null, null, null, n1.h.e(1833792454, new e(jVar, oVar, list, b1Var2, b1Var, h1Var), sVar), sVar, 48, 1020);
            z11 = true;
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new c(this, list, jVar, z11, oVar, i7);
        }
    }

    public final void c(List list, s sVar, int i7) {
        List listJ;
        sVar.Y(1863005946);
        if (((i7 | 6) & 3) == 2 && sVar.z()) {
            sVar.Q();
            listJ = list;
        } else {
            listJ = n3.l.J("音频设置", "CarLife音频相关设置");
            Activity activity = (Activity) sVar.j(d.c.f3530a);
            b1 b1VarK = f1.b.k(j.f8591o, sVar);
            sVar.W(1849434622);
            Object objK = sVar.K();
            w0 w0Var = n.f5051a;
            if (objK == w0Var) {
                objK = f1.b.s(Boolean.FALSE);
                sVar.h0(objK);
            }
            b1 b1Var = (b1) objK;
            sVar.p(false);
            n1.c cVarE = n1.h.e(-1436122127, new y(18, listJ), sVar);
            n1.c cVar = l.f8604a;
            sVar.W(5004770);
            Object objK2 = sVar.K();
            if (objK2 == w0Var) {
                objK2 = new f0.k(b1Var, 18);
                sVar.h0(objK2);
            }
            sVar.p(false);
            a.a.h(cVarE, cVar, false, (h9.a) objK2, sVar, 3126, 4);
            boolean zBooleanValue = ((Boolean) b1Var.getValue()).booleanValue();
            sVar.W(5004770);
            Object objK3 = sVar.K();
            if (objK3 == w0Var) {
                objK3 = new f0.k(b1Var, 19);
                sVar.h0(objK3);
            }
            sVar.p(false);
            l8.n.a(zBooleanValue, (h9.a) objK3, 0L, false, 0, null, null, null, null, n1.h.e(-1554601167, new h(activity, b1VarK, 0), sVar), sVar, 48, 1020);
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new m(i7, 13, this, listJ);
        }
    }
}
