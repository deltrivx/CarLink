package o7;

import a8.a1;
import a8.k0;
import a8.o0;
import a8.x1;
import androidx.compose.foundation.layout.FillElement;
import c1.g1;
import f1.b1;
import f1.w0;
import f1.w1;
import java.util.List;
import l8.y;
import t8.z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f9489a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n8.q f9490b = new n8.q("cover", ".jpg,.jpeg,.png,.webp");

    public final void a(boolean z10, h9.a aVar, String str, h9.n nVar, f1.s sVar, int i7) {
        int i10;
        i9.l.e(str, "currentKey");
        i9.l.e(nVar, "callback");
        sVar.Y(-2047987729);
        if ((i7 & 6) == 0) {
            i10 = (sVar.g(z10) ? 4 : 2) | i7;
        } else {
            i10 = i7;
        }
        if ((i7 & 48) == 0) {
            i10 |= sVar.h(aVar) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i10 |= sVar.f(str) ? 256 : 128;
        }
        if ((i7 & 3072) == 0) {
            i10 |= sVar.h(nVar) ? 2048 : 1024;
        }
        int i11 = i10;
        if ((i11 & 1171) == 1170 && sVar.z()) {
            sVar.Q();
        } else {
            sVar.W(1849434622);
            Object objK = sVar.K();
            Object obj = f1.n.f5051a;
            if (objK == obj) {
                objK = f1.b.s(f9490b.i());
                sVar.h0(objK);
            }
            b1 b1Var = (b1) objK;
            Object objC = a2.f.C(sVar, false, 1849434622);
            if (objC == obj) {
                t8.o oVar = n8.d.f8898a;
                objC = f1.b.s(n8.d.d(str, ""));
                sVar.h0(objC);
            }
            b1 b1Var2 = (b1) objC;
            sVar.p(false);
            b1 b1VarK = f1.b.k(n8.q.f8931l, sVar);
            String str2 = (String) b1VarK.getValue();
            sVar.W(-1633490746);
            boolean zF = sVar.f(b1VarK);
            Object objK2 = sVar.K();
            if (zF || objK2 == obj) {
                objK2 = new l8.t(b1VarK, b1Var, null);
                sVar.h0(objK2);
            }
            sVar.p(false);
            f1.b.f(sVar, (h9.n) objK2, str2);
            sVar.W(5004770);
            boolean z11 = (i11 & 112) == 32;
            Object objK3 = sVar.K();
            if (z11 || objK3 == obj) {
                objK3 = new y(aVar, 3);
                sVar.h0(objK3);
            }
            sVar.p(false);
            l8.n.a(z10, (h9.a) objK3, 0L, false, 0, null, n1.h.e(1057906280, new a8.o(aVar, 18), sVar), n1.h.e(664907335, new a1(nVar, aVar, b1Var2, 9), sVar), n1.h.e(271908390, new k0(17, nVar, b1Var2), sVar), n1.h.e(-36809704, new x1(nVar, aVar, b1Var, b1Var2, 9), sVar), sVar, (i11 & 14) | 918552576, 124);
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new c8.o(this, z10, aVar, str, nVar, i7);
        }
    }

    public final void b(t8.j jVar, final int i7, h9.k kVar, f1.s sVar, int i10) {
        b1 b1Var;
        h9.k kVar2;
        t8.j jVar2;
        i9.l.e(kVar, "callback");
        sVar.Y(-1506214950);
        int i11 = i10 | (sVar.f(jVar) ? 4 : 2) | (sVar.d(i7) ? 32 : 16) | (sVar.h(this) ? 2048 : 1024);
        if ((i11 & 1171) == 1170 && sVar.z()) {
            sVar.Q();
            jVar2 = jVar;
            kVar2 = kVar;
        } else {
            sVar.W(1849434622);
            Object objK = sVar.K();
            w0 w0Var = f1.n.f5051a;
            if (objK == w0Var) {
                objK = f1.b.s(null);
                sVar.h0(objK);
            }
            final b1 b1Var2 = (b1) objK;
            Object objC = a2.f.C(sVar, false, 1849434622);
            if (objC == w0Var) {
                objC = f1.b.s(Boolean.FALSE);
                sVar.h0(objC);
            }
            final b1 b1Var3 = (b1) objC;
            Object objC2 = a2.f.C(sVar, false, 1849434622);
            if (objC2 == w0Var) {
                objC2 = f1.b.s(Boolean.FALSE);
                sVar.h0(objC2);
            }
            final b1 b1Var4 = (b1) objC2;
            sVar.p(false);
            k0.d dVarA = k0.e.a(g5.a.n(12, sVar));
            FillElement fillElement = androidx.compose.foundation.layout.c.f820a;
            sVar.W(1849434622);
            Object objK2 = sVar.K();
            if (objK2 == w0Var) {
                objK2 = ob.a.m(sVar);
            }
            b0.k kVar3 = (b0.k) objK2;
            sVar.p(false);
            sVar.W(-1224400529);
            int i12 = i11 & 112;
            boolean z10 = i12 == 32;
            Object objK3 = sVar.K();
            if (z10 || objK3 == w0Var) {
                objK3 = new h9.a() { // from class: o7.e
                    @Override // h9.a
                    public final Object invoke() {
                        if (g.f9490b.i().length == 0) {
                            b1Var3.setValue(Boolean.TRUE);
                        } else {
                            b1Var4.setValue(Boolean.TRUE);
                        }
                        b1Var2.setValue(Integer.valueOf(i7));
                        return z.f12851a;
                    }
                };
                sVar.h0(objK3);
            }
            sVar.p(false);
            g1.b(androidx.compose.foundation.a.c(fillElement, kVar3, null, false, (h9.a) objK3, 28), dVarA, null, null, n1.h.e(559302568, new f(jVar, i7), sVar), sVar, 196608, 28);
            Boolean bool = (Boolean) b1Var3.getValue();
            bool.getClass();
            sVar.W(5004770);
            Object objK4 = sVar.K();
            if (objK4 == w0Var) {
                b1Var = b1Var3;
                objK4 = new o0(b1Var, null, 2);
                sVar.h0(objK4);
            } else {
                b1Var = b1Var3;
            }
            sVar.p(false);
            f1.b.f(sVar, (h9.n) objK4, bool);
            boolean zBooleanValue = ((Boolean) b1Var.getValue()).booleanValue();
            sVar.W(5004770);
            Object objK5 = sVar.K();
            if (objK5 == w0Var) {
                objK5 = new f0.k(b1Var, 22);
                sVar.h0(objK5);
            }
            h9.a aVar = (h9.a) objK5;
            sVar.p(false);
            sVar.W(-1224400529);
            int i13 = i11 & 14;
            boolean z11 = (i12 == 32) | (i13 == 4);
            Object objK6 = sVar.K();
            if (z11 || objK6 == w0Var) {
                d0.r rVar = new d0.r(i7, jVar, kVar, b1Var2, b1Var4);
                sVar.h0(rVar);
                objK6 = rVar;
            }
            sVar.p(false);
            kVar2 = kVar;
            l8.n.b(zBooleanValue, aVar, f9490b, (h9.k) objK6, sVar, 48);
            boolean zBooleanValue2 = ((Boolean) b1Var4.getValue()).booleanValue();
            sVar.W(5004770);
            Object objK7 = sVar.K();
            if (objK7 == w0Var) {
                objK7 = new f0.k(b1Var4, 23);
                sVar.h0(objK7);
            }
            h9.a aVar2 = (h9.a) objK7;
            sVar.p(false);
            String str = (String) jVar2.f12830a;
            sVar.W(-1746271574);
            boolean z12 = i13 == 4;
            Object objK8 = sVar.K();
            if (z12 || objK8 == w0Var) {
                objK8 = new a8.l(jVar, kVar2, b1Var);
                sVar.h0(objK8);
            }
            sVar.p(false);
            a(zBooleanValue2, aVar2, str, (h9.n) objK8, sVar, ((i11 << 3) & 57344) | 48);
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new h0.u(this, jVar2, i7, kVar2, i10, 5);
        }
    }

    public final void c(List list, f1.s sVar, int i7) {
        List listJ;
        sVar.Y(-557751855);
        if (((i7 | 6) & 3) == 2 && sVar.z()) {
            sVar.Q();
            listJ = list;
        } else {
            listJ = n3.l.J("封面图设置", "连接进度图片设置(分辨率推荐: 840x488)");
            sVar.W(1849434622);
            Object objK = sVar.K();
            w0 w0Var = f1.n.f5051a;
            if (objK == w0Var) {
                objK = f1.b.s(Boolean.FALSE);
                sVar.h0(objK);
            }
            b1 b1Var = (b1) objK;
            sVar.p(false);
            b1 b1VarK = f1.b.k(u.f9520p, sVar);
            n1.c cVarE = n1.h.e(-2123869446, new a8.y(19, listJ), sVar);
            n1.c cVar = b.f9473a;
            sVar.W(5004770);
            Object objK2 = sVar.K();
            if (objK2 == w0Var) {
                objK2 = new f0.k(b1Var, 24);
                sVar.h0(objK2);
            }
            sVar.p(false);
            a.a.h(cVarE, cVar, false, (h9.a) objK2, sVar, 3126, 4);
            boolean zBooleanValue = ((Boolean) b1Var.getValue()).booleanValue();
            sVar.W(5004770);
            Object objK3 = sVar.K();
            if (objK3 == w0Var) {
                objK3 = new f0.k(b1Var, 25);
                sVar.h0(objK3);
            }
            sVar.p(false);
            l8.n.a(zBooleanValue, (h9.a) objK3, 0L, false, 0, null, null, null, null, n1.h.e(747832250, new g8.h(b1VarK, 5), sVar), sVar, 48, 1020);
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new a8.m(i7, 14, this, listJ);
        }
    }
}
