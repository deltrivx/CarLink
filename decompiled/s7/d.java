package s7;

import a2.f;
import a8.c0;
import a8.c1;
import a8.f0;
import android.app.Activity;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.baidu.carlifevehicle.R;
import f1.b1;
import f1.g1;
import f1.n;
import f1.q1;
import f1.s;
import f1.w1;
import h9.k;
import i9.l;
import java.io.IOException;
import k2.h0;
import l0.l1;
import l8.t;
import l8.y;
import n1.h;
import n3.m;
import n3.u;
import o2.m0;
import org.xmlpull.v1.XmlPullParserException;
import q2.i;
import q2.j;
import r1.p;
import r2.n0;
import t7.g;
import t8.z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d implements g {
    @Override // t7.g
    public final void a() {
        hc.c cVar = n8.c.f8897a;
        y8.c cVar2 = null;
        n8.c.d(new c1(this, cVar2, 21));
        n8.c.d(new c0(2, cVar2, 15));
    }

    @Override // t7.g
    public final String b() {
        return "悬浮图标";
    }

    @Override // t7.g
    public final void c(int i7, s sVar) {
        sVar.W(62540749);
        sVar.p(false);
    }

    @Override // t7.g
    public final void d(boolean z10, h9.a aVar, s sVar, int i7) {
        l.e(aVar, "onDismissRequest");
        sVar.Y(-1419198917);
        int i10 = i7 | (sVar.g(z10) ? 4 : 2);
        if ((i10 & 19) == 18 && sVar.z()) {
            sVar.Q();
        } else {
            Activity activity = (Activity) sVar.j(d.c.f3530a);
            b1 b1VarK = f1.b.k(e.f12588f, sVar);
            Boolean boolValueOf = Boolean.valueOf(z10);
            Boolean boolValueOf2 = Boolean.valueOf(((e) b1VarK.getValue()).f12589a);
            sVar.W(-1633490746);
            int i11 = i10 & 14;
            boolean zF = (i11 == 4) | sVar.f(b1VarK);
            Object objK = sVar.K();
            Object obj = n.f5051a;
            if (zF || objK == obj) {
                objK = new f0(z10, b1VarK, null, 1);
                sVar.h0(objK);
            }
            sVar.p(false);
            f1.b.g(boolValueOf, boolValueOf2, (h9.n) objK, sVar);
            sVar.W(5004770);
            Object objK2 = sVar.K();
            if (objK2 == obj) {
                objK2 = new y(aVar, 7);
                sVar.h0(objK2);
            }
            sVar.p(false);
            l8.n.a(z10, (h9.a) objK2, 0L, false, 0, null, null, null, null, h.e(-89653070, new b(activity, b1VarK, 1), sVar), sVar, i11, 1020);
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new q7.c(this, z10, aVar, i7, 2);
        }
    }

    @Override // t7.g
    public final String e() {
        return "应用后台时显示悬浮图标";
    }

    public final void f(final int i7, final int i10, s sVar, final int i11) throws XmlPullParserException, IOException {
        char c10;
        sVar.Y(2020782138);
        if ((((sVar.d(i7) ? 4 : 2) | i11 | (sVar.d(i10) ? 32 : 16)) & 19) == 18 && sVar.z()) {
            sVar.Q();
        } else {
            b1 b1VarK = f1.b.k(e.f12588f, sVar);
            DisplayMetrics displayMetrics = ((Resources) sVar.j(n0.f11344c)).getDisplayMetrics();
            sVar.W(1849434622);
            Object objK = sVar.K();
            Object obj = n.f5051a;
            if (objK == obj) {
                objK = f1.b.s(new m(0L));
                sVar.h0(objK);
            }
            b1 b1Var = (b1) objK;
            Object objC = f.C(sVar, false, 1849434622);
            if (objC == obj) {
                Object g1Var = new g1(i7);
                sVar.h0(g1Var);
                objC = g1Var;
            }
            g1 g1Var2 = (g1) objC;
            Object objC2 = f.C(sVar, false, 1849434622);
            if (objC2 == obj) {
                Object g1Var3 = new g1(i10);
                sVar.h0(g1Var3);
                objC2 = g1Var3;
            }
            g1 g1Var4 = (g1) objC2;
            sVar.p(false);
            Float fValueOf = Float.valueOf(g1Var2.f());
            Float fValueOf2 = Float.valueOf(g1Var4.f());
            sVar.W(-1633490746);
            Object objK2 = sVar.K();
            if (objK2 == obj) {
                c10 = ' ';
                objK2 = new t(g1Var2, g1Var4, null, 3);
                sVar.h0(objK2);
            } else {
                c10 = ' ';
            }
            sVar.p(false);
            f1.b.g(fValueOf, fValueOf2, (h9.n) objK2, sVar);
            r1.m mVar = r1.m.f11116a;
            p pVarO = n4.h.o(androidx.compose.foundation.layout.c.n(mVar, 3), k0.e.a(g5.a.n(((e) b1VarK.getValue()).f12591c, sVar)));
            sVar.W(5004770);
            Object objK3 = sVar.K();
            if (objK3 == obj) {
                objK3 = new f8.h(b1Var, 6);
                sVar.h0(objK3);
            }
            sVar.p(false);
            p pVarE = androidx.compose.ui.layout.a.e(pVarO, (k) objK3);
            sVar.W(-1224400529);
            boolean zH = sVar.h(displayMetrics);
            Object objK4 = sVar.K();
            if (zH || objK4 == obj) {
                objK4 = new l1(displayMetrics, g1Var2, b1Var, g1Var4);
                sVar.h0(objK4);
            }
            sVar.p(false);
            p pVarC = h0.c(pVarE, z.f12851a, (PointerInputEventHandler) objK4);
            m0 m0VarD = d0.m.d(r1.c.f11092a, false);
            long j5 = sVar.T;
            int i12 = (int) (j5 ^ (j5 >>> c10));
            q1 q1VarL = sVar.l();
            p pVarC2 = r1.a.c(sVar, pVarC);
            j.f10719d0.getClass();
            h9.a aVar = i.f10705b;
            sVar.a0();
            if (sVar.S) {
                sVar.k(aVar);
            } else {
                sVar.k0();
            }
            f1.b.w(sVar, i.f10708e, m0VarD);
            f1.b.w(sVar, i.f10707d, q1VarL);
            q2.h hVar = i.f10709f;
            if (sVar.S || !l.a(sVar.K(), Integer.valueOf(i12))) {
                ob.a.w(i12, sVar, i12, hVar);
            }
            f1.b.w(sVar, i.f10706c, pVarC2);
            d2.b bVarN = n3.l.N(R.mipmap.ic_launcher, sVar);
            p pVarI = u.i(androidx.compose.foundation.layout.c.h(mVar, g5.a.n(((e) b1VarK.getValue()).f12590b, sVar)), ((e) b1VarK.getValue()).f12592d / 10.0f);
            sVar.W(1849434622);
            Object objK5 = sVar.K();
            if (objK5 == obj) {
                objK5 = ob.a.m(sVar);
            }
            b0.k kVar = (b0.k) objK5;
            Object objC3 = f.C(sVar, false, 1849434622);
            if (objC3 == obj) {
                objC3 = new n8.f(24);
                sVar.h0(objC3);
            }
            h9.a aVar2 = (h9.a) objC3;
            Object objC4 = f.C(sVar, false, 1849434622);
            if (objC4 == obj) {
                objC4 = new n8.f(25);
                sVar.h0(objC4);
            }
            sVar.p(false);
            n3.n.B(bVarN, null, androidx.compose.foundation.a.e(pVarI, kVar, aVar2, (h9.a) objC4), null, null, 0.0f, sVar, 48, 120);
            sVar.p(true);
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new h9.n(i7, i10, i11) { // from class: s7.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ int f12581b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ int f12582c;

                @Override // h9.n
                public final Object invoke(Object obj2, Object obj3) throws XmlPullParserException, IOException {
                    ((Integer) obj3).getClass();
                    int iY = f1.b.y(1);
                    this.f12580a.f(this.f12581b, this.f12582c, (s) obj2, iY);
                    return z.f12851a;
                }
            };
        }
    }

    @Override // t7.g
    public final String getName() {
        return "Icon";
    }
}
