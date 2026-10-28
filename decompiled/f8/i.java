package f8;

import a8.m;
import a8.o0;
import a8.w;
import a8.y;
import f0.k;
import f1.b1;
import f1.n;
import f1.s;
import f1.w0;
import f1.w1;
import java.util.List;
import n8.q;
import t8.o;
import t8.z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f5499a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q f5500b = new q("log", "");

    public final void a(List list, boolean z10, s sVar, int i7) {
        List list2;
        sVar.Y(-763461922);
        if ((i7 & 19) == 18 && sVar.z()) {
            sVar.Q();
            list2 = list;
        } else {
            sVar.W(1849434622);
            Object objK = sVar.K();
            w0 w0Var = n.f5051a;
            if (objK == w0Var) {
                objK = f1.b.s(Boolean.FALSE);
                sVar.h0(objK);
            }
            b1 b1Var = (b1) objK;
            sVar.p(false);
            list2 = list;
            n1.c cVarE = n1.h.e(-742878955, new y(8, list2), sVar);
            n1.c cVar = d.f5481e;
            sVar.W(5004770);
            Object objK2 = sVar.K();
            if (objK2 == w0Var) {
                objK2 = new k(b1Var, 5);
                sVar.h0(objK2);
            }
            sVar.p(false);
            a.a.h(cVarE, cVar, z10, (h9.a) objK2, sVar, 3510, 0);
            boolean zBooleanValue = ((Boolean) b1Var.getValue()).booleanValue();
            sVar.W(5004770);
            Object objK3 = sVar.K();
            if (objK3 == w0Var) {
                objK3 = new k(b1Var, 6);
                sVar.h0(objK3);
            }
            sVar.p(false);
            l8.n.a(zBooleanValue, (h9.a) objK3, 0L, false, 0, null, null, null, null, d.f5483g, sVar, 48, 1020);
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new f(this, list2, z10, i7, 2);
        }
    }

    public final void b(final List list, boolean z10, boolean z11, s sVar, final int i7) {
        final boolean z12;
        final boolean z13;
        sVar.Y(786198487);
        if (((i7 | 3456) & 1171) == 1170 && sVar.z()) {
            sVar.Q();
            z12 = z10;
            z13 = z11;
        } else {
            sVar.W(1849434622);
            Object objK = sVar.K();
            w0 w0Var = n.f5051a;
            if (objK == w0Var) {
                objK = f1.b.s(Boolean.FALSE);
                sVar.h0(objK);
            }
            b1 b1Var = (b1) objK;
            Object objC = a2.f.C(sVar, false, 1849434622);
            if (objC == w0Var) {
                o oVar = n8.d.f8898a;
                objC = f1.b.s(Boolean.valueOf(n8.d.a("TEST_LOGS_SAVE", true)));
                sVar.h0(objC);
            }
            sVar.p(false);
            n1.c cVarE = n1.h.e(1043518926, new y(9, list), sVar);
            n1.c cVarE2 = n1.h.e(1992008655, new w((b1) objC, 26), sVar);
            sVar.W(5004770);
            Object objK2 = sVar.K();
            if (objK2 == w0Var) {
                objK2 = new k(b1Var, 1);
                sVar.h0(objK2);
            }
            sVar.p(false);
            a.a.h(cVarE, cVarE2, true, (h9.a) objK2, sVar, 3510, 0);
            Boolean bool = (Boolean) b1Var.getValue();
            bool.getClass();
            sVar.W(5004770);
            Object objK3 = sVar.K();
            if (objK3 == w0Var) {
                objK3 = new o0(b1Var, null, 1);
                sVar.h0(objK3);
            }
            sVar.p(false);
            f1.b.f(sVar, (h9.n) objK3, bool);
            boolean zBooleanValue = ((Boolean) b1Var.getValue()).booleanValue();
            sVar.W(5004770);
            Object objK4 = sVar.K();
            if (objK4 == w0Var) {
                objK4 = new k(b1Var, 2);
                sVar.h0(objK4);
            }
            sVar.p(false);
            l8.n.a(zBooleanValue, (h9.a) objK4, 0L, false, 0, null, null, null, null, d.k, sVar, 48, 1020);
            z12 = true;
            z13 = true;
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new h9.n(list, z12, z13, i7) { // from class: f8.g

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ List f5494b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ boolean f5495c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ boolean f5496d;

                @Override // h9.n
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iY = f1.b.y(32823);
                    this.f5493a.b(this.f5494b, this.f5495c, this.f5496d, (s) obj, iY);
                    return z.f12851a;
                }
            };
        }
    }

    public final void c(List list, boolean z10, s sVar, int i7) {
        sVar.Y(881514530);
        if (((i7 | 48) & 19) != 18 || !sVar.z()) {
            w1 w1VarR = sVar.r();
            if (w1VarR != null) {
                w1VarR.f5192d = new m(i7, 6, this, list);
                return;
            }
            return;
        }
        sVar.Q();
        w1 w1VarR2 = sVar.r();
        if (w1VarR2 != null) {
            w1VarR2.f5192d = new f(this, list, z10, i7, 0);
        }
    }

    public final void d(int i7, s sVar) {
        sVar.Y(-76621869);
        if ((i7 & 1) == 0 && sVar.z()) {
            sVar.Q();
        } else {
            g5.a.b(null, d.f5477a, sVar, 48, 1);
            g5.a.b("附加设置", d.f5478b, sVar, 54, 0);
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new b3.a(i7, 10, this);
        }
    }

    public final void e(List list, boolean z10, s sVar, int i7) {
        List list2;
        boolean z11;
        sVar.Y(-1982465057);
        if (((i7 | 48) & 19) == 18 && sVar.z()) {
            sVar.Q();
            list2 = list;
            z11 = z10;
        } else {
            sVar.W(1849434622);
            Object objK = sVar.K();
            w0 w0Var = n.f5051a;
            if (objK == w0Var) {
                objK = f1.b.s(Boolean.FALSE);
                sVar.h0(objK);
            }
            b1 b1Var = (b1) objK;
            sVar.p(false);
            list2 = list;
            n1.c cVarE = n1.h.e(-1344393080, new y(10, list2), sVar);
            n1.c cVar = d.f5479c;
            sVar.W(5004770);
            Object objK2 = sVar.K();
            if (objK2 == w0Var) {
                objK2 = new k(b1Var, 3);
                sVar.h0(objK2);
            }
            sVar.p(false);
            a.a.h(cVarE, cVar, true, (h9.a) objK2, sVar, 3510, 0);
            boolean zBooleanValue = ((Boolean) b1Var.getValue()).booleanValue();
            sVar.W(5004770);
            Object objK3 = sVar.K();
            if (objK3 == w0Var) {
                objK3 = new k(b1Var, 4);
                sVar.h0(objK3);
            }
            sVar.p(false);
            l8.n.a(zBooleanValue, (h9.a) objK3, 0L, false, 0, null, null, null, null, d.f5480d, sVar, 48, 1020);
            z11 = true;
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new f(this, list2, z11, i7, 1);
        }
    }
}
