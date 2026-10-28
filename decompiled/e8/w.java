package e8;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import b8.g2;
import b8.h2;
import com.baidu.carlife.sdk.util.Logger;
import f1.w1;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class w extends BroadcastReceiver implements h2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f4641e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4642a = "Amap";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4643b = "高德广播";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g2 f4644c = g2.f1593a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f4645d;

    @Override // b8.h2
    public final void a() {
        hc.c cVar = n8.c.f8897a;
        y8.c cVar2 = null;
        n8.c.d(new a8.c1(this, cVar2, 6));
        n8.c.d(new a8.c0(2, cVar2, 10));
    }

    @Override // b8.h2
    public final String b() {
        return this.f4643b;
    }

    @Override // b8.h2
    public final void c(boolean z10, h9.a aVar, h9.k kVar, f1.s sVar, int i7) {
        i9.l.e(aVar, "onDismissRequest");
        i9.l.e(kVar, "onConfigured");
        sVar.Y(285618669);
        int i10 = i7 | (sVar.g(z10) ? 4 : 2) | (sVar.h(kVar) ? 256 : 128) | (sVar.h(this) ? 2048 : 1024);
        if ((i10 & 1171) == 1170 && sVar.z()) {
            sVar.Q();
        } else {
            sVar.W(5004770);
            Object objK = sVar.K();
            if (objK == f1.n.f5051a) {
                objK = new a8.n(aVar, 12);
                sVar.h0(objK);
            }
            sVar.p(false);
            l8.n.a(z10, (h9.a) objK, 0L, false, 0, n1.h.e(165448711, new r(this, 1), sVar), null, null, null, n1.h.e(-331683626, new a8.k0(6, kVar, this), sVar), sVar, (i10 & 14) | 1572864, 956);
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new a8.i(this, z10, aVar, kVar, i7, 12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(List list, f1.s sVar, int i7) {
        List listJ;
        Object[] objArr;
        sVar.Y(-1893813644);
        if (((i7 | 54) & 19) == 18 && sVar.z()) {
            sVar.Q();
            listJ = list;
        } else {
            listJ = n3.l.J("高德广播", "高德广播接收测试");
            int i10 = 1;
            List listJ2 = n3.l.J(new l8.j0("高德接收的广播", new l8.m0("AUTONAVI_STANDARD_BROADCAST_RECV"), null, null, null, 28), new l8.j0("高德发送的广播", new l8.m0("AUTONAVI_STANDARD_BROADCAST_SEND"), null, null, null, 28));
            sVar.W(1849434622);
            Object objK = sVar.K();
            f1.w0 w0Var = f1.n.f5051a;
            if (objK == w0Var) {
                objK = f1.b.s(u8.p.k0(listJ2));
                sVar.h0(objK);
            }
            f1.b1 b1Var = (f1.b1) objK;
            Object objC = a2.f.C(sVar, false, 1849434622);
            if (objC == w0Var) {
                objC = f1.b.s(Boolean.FALSE);
                sVar.h0(objC);
            }
            f1.b1 b1Var2 = (f1.b1) objC;
            sVar.p(false);
            b9.b bVar = s.f4614e;
            ArrayList arrayList = new ArrayList(u8.q.a0(bVar, 10));
            i9.b bVar2 = new i9.b(6, bVar);
            while (true) {
                objArr = 0;
                if (!bVar2.hasNext()) {
                    break;
                }
                s sVar2 = (s) bVar2.next();
                String str = sVar2.f4615a;
                int i11 = sVar2.f4616b;
                Object objValueOf = i11 != 0 ? Integer.valueOf(i11) : null;
                if (objValueOf == null) {
                    objValueOf = "";
                }
                arrayList.add(new l8.j0(str + objValueOf, new l8.l0(i11), null, null, null, 28));
            }
            sVar.W(1849434622);
            Object objK2 = sVar.K();
            if (objK2 == w0Var) {
                objK2 = f1.b.s(u8.p.k0(arrayList));
                sVar.h0(objK2);
            }
            f1.b1 b1Var3 = (f1.b1) objK2;
            Object objC2 = a2.f.C(sVar, false, 1849434622);
            if (objC2 == w0Var) {
                objC2 = f1.b.s(Boolean.FALSE);
                sVar.h0(objC2);
            }
            f1.b1 b1Var4 = (f1.b1) objC2;
            Object objC3 = a2.f.C(sVar, false, 1849434622);
            if (objC3 == w0Var) {
                objC3 = f1.b.s(Boolean.FALSE);
                sVar.h0(objC3);
            }
            f1.b1 b1Var5 = (f1.b1) objC3;
            Object objC4 = a2.f.C(sVar, false, 1849434622);
            if (objC4 == w0Var) {
                objC4 = f1.b.s(u8.w.f13122a);
                sVar.h0(objC4);
            }
            f1.b1 b1Var6 = (f1.b1) objC4;
            sVar.p(false);
            q qVar = new q(b1Var, b1Var3, b1Var6);
            sVar.W(5004770);
            boolean zH = sVar.h(qVar);
            Object objK3 = sVar.K();
            if (zH || objK3 == w0Var) {
                objK3 = new c8.b0(qVar, objArr == true ? 1 : 0, i10);
                sVar.h0(objK3);
            }
            sVar.p(false);
            t8.z zVar = t8.z.f12851a;
            f1.b.f(sVar, (h9.n) objK3, zVar);
            sVar.W(5004770);
            boolean zH2 = sVar.h(qVar);
            Object objK4 = sVar.K();
            if (zH2 || objK4 == w0Var) {
                objK4 = new c8.k(i10, qVar);
                sVar.h0(objK4);
            }
            sVar.p(false);
            f1.b.c(zVar, (h9.k) objK4, sVar);
            n1.c cVarE = n1.h.e(577992363, new a8.y(5, listJ), sVar);
            n1.c cVar = b.f4482a;
            sVar.W(5004770);
            Object objK5 = sVar.K();
            if (objK5 == w0Var) {
                objK5 = new a8.k(b1Var5, 21);
                sVar.h0(objK5);
            }
            sVar.p(false);
            a.a.h(cVarE, cVar, false, (h9.a) objK5, sVar, 3510, 0);
            boolean zBooleanValue = ((Boolean) b1Var5.getValue()).booleanValue();
            sVar.W(5004770);
            Object objK6 = sVar.K();
            if (objK6 == w0Var) {
                objK6 = new a8.k(b1Var5, 22);
                sVar.h0(objK6);
            }
            sVar.p(false);
            l8.n.a(zBooleanValue, (h9.a) objK6, 0L, false, 0, n1.h.e(-525668326, new n(b1Var2, b1Var, listJ2, b1Var6, b1Var3, b1Var4, arrayList, 1), sVar), null, null, null, n1.h.e(-1077178901, new a8.w(b1Var6, 24), sVar), sVar, 1572912, 956);
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new a8.m(i7, 4, this, listJ);
        }
    }

    public final synchronized void e() {
        try {
            if (!this.f4645d) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("AUTONAVI_STANDARD_BROADCAST_RECV");
                intentFilter.addAction("AUTONAVI_STANDARD_BROADCAST_SEND");
                u3.f.g(n8.a.b(), this, intentFilter);
                this.f4645d = true;
            }
        } catch (Exception e7) {
            Logger.INSTANCE.d("CarLife_Vehicle", "【高德广播】注册异常: " + e7.getMessage());
        }
    }

    @Override // b8.h2
    public final String getName() {
        return this.f4642a;
    }

    @Override // b8.h2
    public final g2 getType() {
        return this.f4644c;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        i9.l.e(context, "context");
        i9.l.e(intent, "intent");
        int intExtra = intent.getIntExtra("KEY_TYPE", -1);
        j jVar = k.f4567d;
        if (intExtra == 10017) {
            int intExtra2 = intent.getIntExtra("EXTRA_HEADLIGHT_STATE", 1);
            hc.c cVar = d8.v.f3842a;
            d8.v.a(new b8.d(intExtra, intExtra2));
            Logger.Companion companion = Logger.INSTANCE;
            jVar.getClass();
            companion.d("CarLife_Vehicle", "【高德广播】".concat(j.b(intExtra, intExtra2)));
            return;
        }
        if (intExtra != 10048) {
            return;
        }
        int intExtra3 = intent.getIntExtra("EXTRA_DAY_NIGHT_MODE", 1);
        hc.c cVar2 = d8.v.f3842a;
        d8.v.a(new b8.d(intExtra, intExtra3));
        Logger.Companion companion2 = Logger.INSTANCE;
        jVar.getClass();
        companion2.d("CarLife_Vehicle", "【高德广播】".concat(j.b(intExtra, intExtra3)));
    }
}
