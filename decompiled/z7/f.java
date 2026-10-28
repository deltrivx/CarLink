package z7;

import android.app.Activity;
import com.baidu.carlife.sdk.util.Logger;
import com.muyetuge.carlifevehicle.activity.MainActivity;
import d0.m;
import f1.b1;
import f1.n;
import f1.q1;
import f1.s;
import f1.u0;
import f1.w0;
import f1.w1;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import o2.m0;
import o7.o;
import r1.p;
import u8.w;
import y1.h0;
import y1.q;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f15751a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f15752b = new f();

    public void a(int i7, s sVar) {
        Object objB;
        sVar.Y(-569981351);
        if ((i7 & 1) == 0 && sVar.z()) {
            sVar.Q();
        } else {
            Activity activity = (Activity) sVar.j(d.c.f3530a);
            b1 b1VarK = f1.b.k(k.f15763m, sVar);
            if (activity != null) {
                activity.getWindow().addFlags(128);
            }
            Boolean boolValueOf = Boolean.valueOf(((k) b1VarK.getValue()).f15773j);
            sVar.W(-1633490746);
            boolean zH = sVar.h(activity) | sVar.f(b1VarK);
            Object objK = sVar.K();
            Object obj = n.f5051a;
            y8.c cVar = null;
            int i10 = 0;
            if (zH || objK == obj) {
                objK = new c(activity, b1VarK, cVar, i10);
                sVar.h0(objK);
            }
            sVar.p(false);
            f1.b.f(sVar, (h9.n) objK, boolValueOf);
            Boolean bool = (Boolean) f1.b.k(MainActivity.f2913z, sVar).getValue();
            bool.getClass();
            int i11 = 1;
            Object[] objArr = {bool, Boolean.valueOf(((k) b1VarK.getValue()).f15765b), Boolean.valueOf(((k) b1VarK.getValue()).f15768e), ((k) b1VarK.getValue()).f15767d, ((k) b1VarK.getValue()).f15771h, Boolean.valueOf(((k) b1VarK.getValue()).f15772i)};
            sVar.W(-1633490746);
            boolean zF = sVar.f(b1VarK) | sVar.h(activity);
            Object objK2 = sVar.K();
            if (zF || objK2 == obj) {
                objK2 = new c(activity, b1VarK, cVar, i11);
                sVar.h0(objK2);
            }
            h9.n nVar = (h9.n) objK2;
            sVar.p(false);
            y8.h hVar = sVar.R;
            boolean zF2 = false;
            for (Object obj2 : Arrays.copyOf(objArr, 6)) {
                zF2 |= sVar.f(obj2);
            }
            Object objK3 = sVar.K();
            if (zF2 || objK3 == obj) {
                sVar.h0(new u0(hVar, nVar));
            }
            p pVarO = n4.h.o(androidx.compose.foundation.a.b(androidx.compose.foundation.layout.c.f822c, q.f14948b, h0.f14898a), k0.e.a(((k) b1VarK.getValue()).f15764a));
            hc.c cVar2 = n8.c.f8897a;
            p pVarK = androidx.compose.foundation.layout.a.k(pVarO, n8.c.h((!((k) b1VarK.getValue()).f15768e || ((k) b1VarK.getValue()).f15770g) ? 0 : ((k) b1VarK.getValue()).f15769f), n8.c.h(((k) b1VarK.getValue()).f15765b ? ((k) b1VarK.getValue()).f15766c : 0), 0.0f, n8.c.h((((k) b1VarK.getValue()).f15768e && ((k) b1VarK.getValue()).f15770g) ? ((k) b1VarK.getValue()).f15769f : 0), 4);
            m0 m0VarD = m.d(r1.c.f11092a, false);
            long j5 = sVar.T;
            int i12 = (int) (j5 ^ (j5 >>> 32));
            q1 q1VarL = sVar.l();
            p pVarC = r1.a.c(sVar, pVarK);
            q2.j.f10719d0.getClass();
            h9.a aVar = q2.i.f10705b;
            sVar.a0();
            if (sVar.S) {
                sVar.k(aVar);
            } else {
                sVar.k0();
            }
            f1.b.w(sVar, q2.i.f10708e, m0VarD);
            f1.b.w(sVar, q2.i.f10707d, q1VarL);
            q2.h hVar2 = q2.i.f10709f;
            if (sVar.S || !i9.l.a(sVar.K(), Integer.valueOf(i12))) {
                ob.a.w(i12, sVar, i12, hVar2);
            }
            f1.b.w(sVar, q2.i.f10706c, pVarC);
            sVar.W(1849434622);
            Object objK4 = sVar.K();
            if (objK4 == obj) {
                try {
                    ServiceLoader serviceLoaderLoad = ServiceLoader.load(v7.e.class);
                    i9.l.d(serviceLoaderLoad, "load(...)");
                    objB = yb.l.U(new yb.c(2, new yb.c(0, new yb.h(u8.p.f0(serviceLoaderLoad), true, new d(1)), d.f15749b), new e()));
                } catch (Throwable th) {
                    objB = t8.a.b(th);
                }
                Throwable thA = t8.m.a(objB);
                if (thA != null) {
                    Logger.INSTANCE.e("OptionLoader", ob.a.q("模块加载失败: ", thA.getMessage()));
                    objB = w.f13122a;
                }
                objK4 = f1.b.s((List) objB);
                sVar.h0(objK4);
            }
            sVar.p(false);
            sVar.W(-1882715115);
            Iterator it = ((List) ((b1) objK4).getValue()).iterator();
            while (it.hasNext()) {
                ((v7.e) it.next()).c(0, sVar);
            }
            sVar.p(false);
            sVar.p(true);
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new y7.a(i7, 3, this);
        }
    }

    public void b(List list, s sVar, int i7) {
        List listJ;
        sVar.Y(1335974662);
        if (((i7 | 6) & 3) == 2 && sVar.z()) {
            sVar.Q();
            listJ = list;
        } else {
            listJ = n3.l.J("系统栏设置", "系统栏显示隐藏设置");
            b1 b1VarK = f1.b.k(k.f15763m, sVar);
            sVar.W(1849434622);
            Object objK = sVar.K();
            w0 w0Var = n.f5051a;
            if (objK == w0Var) {
                objK = f1.b.s(Boolean.FALSE);
                sVar.h0(objK);
            }
            b1 b1Var = (b1) objK;
            sVar.p(false);
            t8.j jVarE = n8.h.e();
            int iIntValue = ((Number) jVarE.f12830a).intValue();
            int iIntValue2 = ((Number) jVarE.f12831b).intValue();
            n1.c cVarE = n1.h.e(1356557629, new h(0, listJ), sVar);
            n1.c cVar = b.f15744a;
            sVar.W(5004770);
            Object objK2 = sVar.K();
            if (objK2 == w0Var) {
                objK2 = new o(b1Var, 20);
                sVar.h0(objK2);
            }
            sVar.p(false);
            a.a.h(cVarE, cVar, false, (h9.a) objK2, sVar, 3126, 4);
            boolean zBooleanValue = ((Boolean) b1Var.getValue()).booleanValue();
            sVar.W(5004770);
            Object objK3 = sVar.K();
            if (objK3 == w0Var) {
                objK3 = new o(b1Var, 21);
                sVar.h0(objK3);
            }
            sVar.p(false);
            l8.n.a(zBooleanValue, (h9.a) objK3, 0L, false, 0, null, null, null, null, n1.h.e(768214141, new i(b1VarK, iIntValue, iIntValue2, 2), sVar), sVar, 48, 1020);
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new a8.m(i7, 19, this, listJ);
        }
    }
}
