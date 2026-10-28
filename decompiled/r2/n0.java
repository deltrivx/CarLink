package r2;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import com.baidu.carlifevehicle.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f1.c0 f11342a = new f1.c0(k0.f11292b);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f1.x2 f11343b = new f1.x2(k0.f11293c);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f1.c0 f11344c = new f1.c0(n.f11339e);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f1.x2 f11345d = new f1.x2(k0.f11294d);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f1.x2 f11346e = new f1.x2(k0.f11295e);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final f1.x2 f11347f = new f1.x2(k0.f11296f);

    public static final void a(u uVar, h9.n nVar, f1.s sVar, int i7) {
        f1.b1 b1Var;
        char c10;
        char c11;
        LinkedHashMap linkedHashMap;
        boolean z10;
        sVar.Y(-520299287);
        int i10 = (sVar.h(uVar) ? 4 : 2) | i7 | (sVar.h(nVar) ? 32 : 16);
        if (sVar.N(i10 & 1, (i10 & 19) != 18)) {
            Context context = uVar.getContext();
            Object objK = sVar.K();
            Object obj = f1.n.f5051a;
            if (objK == obj) {
                objK = f1.b.s(new Configuration(context.getResources().getConfiguration()));
                sVar.h0(objK);
            }
            f1.b1 b1Var2 = (f1.b1) objK;
            Object objK2 = sVar.K();
            int i11 = 8;
            if (objK2 == obj) {
                objK2 = new b2.a(i11, b1Var2);
                sVar.h0(objK2);
            }
            uVar.setConfigurationChangeObserver((h9.k) objK2);
            Object objK3 = sVar.K();
            if (objK3 == obj) {
                objK3 = new u0();
                sVar.h0(objK3);
            }
            u0 u0Var = (u0) objK3;
            l viewTreeOwners = uVar.getViewTreeOwners();
            if (viewTreeOwners == null) {
                throw new IllegalStateException("Called when the ViewTreeOwnersAvailability is not yet in Available state");
            }
            a5.g gVar = viewTreeOwners.f11319b;
            Object objK4 = sVar.K();
            if (objK4 == obj) {
                Object parent = uVar.getParent();
                c10 = '\b';
                i9.l.c(parent, "null cannot be cast to non-null type android.view.View");
                View view = (View) parent;
                Object tag = view.getTag(R.id.compose_view_saveable_id_tag);
                c11 = 5;
                String strValueOf = tag instanceof String ? (String) tag : null;
                if (strValueOf == null) {
                    strValueOf = String.valueOf(view.getId());
                }
                String str = o1.f.class.getSimpleName() + ':' + strValueOf;
                android.support.v4.media.session.r rVarD = gVar.d();
                Bundle bundleS = rVarD.s(str);
                if (bundleS != null) {
                    linkedHashMap = new LinkedHashMap();
                    for (String str2 : bundleS.keySet()) {
                        ArrayList parcelableArrayList = bundleS.getParcelableArrayList(str2);
                        i9.l.c(parcelableArrayList, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>");
                        linkedHashMap.put(str2, parcelableArrayList);
                        b1Var2 = b1Var2;
                    }
                } else {
                    linkedHashMap = null;
                }
                b1Var = b1Var2;
                n nVar2 = n.f11340f;
                f1.x2 x2Var = o1.h.f9281a;
                o1.g gVar2 = new o1.g(linkedHashMap, nVar2);
                try {
                    rVarD.H(str, new c.f(3, gVar2));
                    z10 = true;
                } catch (IllegalArgumentException unused) {
                    z10 = false;
                }
                Object m1Var = new m1(gVar2, new n1(z10, rVarD, str));
                sVar.h0(m1Var);
                objK4 = m1Var;
            } else {
                b1Var = b1Var2;
                c10 = '\b';
                c11 = 5;
            }
            Object obj2 = (m1) objK4;
            boolean zH = sVar.h(obj2);
            Object objK5 = sVar.K();
            int i12 = 9;
            if (zH || objK5 == obj) {
                objK5 = new b2.a(i12, obj2);
                sVar.h0(objK5);
            }
            f1.b.c(t8.z.f12851a, (h9.k) objK5, sVar);
            Object objK6 = sVar.K();
            if (objK6 == obj) {
                objK6 = (Build.VERSION.SDK_INT < 31 || !((Vibrator) context.getSystemService(Vibrator.class)).areAllPrimitivesSupported(1, 7, 2)) ? new z1() : new g2.b(uVar.getView(), 1);
                sVar.h0(objK6);
            }
            g2.a aVar = (g2.a) objK6;
            Configuration configuration = (Configuration) b1Var.getValue();
            Object objK7 = sVar.K();
            if (objK7 == obj) {
                objK7 = new w2.c();
                sVar.h0(objK7);
            }
            w2.c cVar = (w2.c) objK7;
            Object objK8 = sVar.K();
            Object obj3 = objK8;
            if (objK8 == obj) {
                Configuration configuration2 = new Configuration();
                if (configuration != null) {
                    configuration2.setTo(configuration);
                }
                sVar.h0(configuration2);
                obj3 = configuration2;
            }
            Configuration configuration3 = (Configuration) obj3;
            Object objK9 = sVar.K();
            if (objK9 == obj) {
                objK9 = new l0(configuration3, cVar);
                sVar.h0(objK9);
            }
            l0 l0Var = (l0) objK9;
            boolean zH2 = sVar.h(context);
            Object objK10 = sVar.K();
            int i13 = 6;
            if (zH2 || objK10 == obj) {
                objK10 = new c1.a1(i13, context, l0Var);
                sVar.h0(objK10);
            }
            f1.b.c(cVar, (h9.k) objK10, sVar);
            Object objK11 = sVar.K();
            if (objK11 == obj) {
                objK11 = new w2.d();
                sVar.h0(objK11);
            }
            w2.d dVar = (w2.d) objK11;
            Object objK12 = sVar.K();
            if (objK12 == obj) {
                objK12 = new m0(dVar);
                sVar.h0(objK12);
            }
            m0 m0Var = (m0) objK12;
            boolean zH3 = sVar.h(context);
            Object objK13 = sVar.K();
            if (zH3 || objK13 == obj) {
                objK13 = new c1.a1(7, context, m0Var);
                sVar.h0(objK13);
            }
            f1.b.c(dVar, (h9.k) objK13, sVar);
            f1.t1 t1Var = j1.f11289v;
            boolean zBooleanValue = ((Boolean) sVar.j(t1Var)).booleanValue() | uVar.getScrollCaptureInProgress$ui_release();
            f1.u1 u1VarA = f11342a.a((Configuration) b1Var.getValue());
            f1.u1 u1VarA2 = f11343b.a(context);
            f1.u1 u1VarA3 = s4.a.f12577a.a(viewTreeOwners.f11318a);
            f1.u1 u1VarA4 = b5.a.f1515a.a(gVar);
            f1.u1 u1VarA5 = o1.h.f9281a.a(obj2);
            f1.u1 u1VarA6 = f11347f.a(uVar.getView());
            f1.u1 u1VarA7 = f11345d.a(cVar);
            f1.u1 u1VarA8 = f11346e.a(dVar);
            f1.u1 u1VarA9 = t1Var.a(Boolean.valueOf(zBooleanValue));
            f1.u1 u1VarA10 = j1.f11279l.a(aVar);
            f1.u1[] u1VarArr = new f1.u1[10];
            u1VarArr[0] = u1VarA;
            u1VarArr[1] = u1VarA2;
            u1VarArr[2] = u1VarA3;
            u1VarArr[3] = u1VarA4;
            u1VarArr[4] = u1VarA5;
            u1VarArr[c11] = u1VarA6;
            u1VarArr[6] = u1VarA7;
            u1VarArr[7] = u1VarA8;
            u1VarArr[c10] = u1VarA9;
            u1VarArr[9] = u1VarA10;
            f1.b.b(u1VarArr, n1.h.e(1059770793, new d1.k(uVar, u0Var, nVar, 3), sVar), sVar, 56);
        } else {
            sVar.Q();
        }
        f1.w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new c1.h(uVar, nVar, i7, 5);
        }
    }

    public static final void b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
