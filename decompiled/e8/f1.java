package e8;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import b8.g2;
import b8.h2;
import b8.m1;
import com.baidu.carlife.sdk.util.Logger;
import f1.w1;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class f1 extends BroadcastReceiver implements h2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f4534f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4535a = "SunCycle";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4536b = "日出日落";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g2 f4537c = g2.f1593a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f4538d = u8.w.f13122a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f4539e;

    @Override // b8.h2
    public final void a() {
        hc.c cVar = n8.c.f8897a;
        n8.c.d(new a8.c1(this, null, 12));
    }

    @Override // b8.h2
    public final String b() {
        return this.f4536b;
    }

    @Override // b8.h2
    public final void c(boolean z10, h9.a aVar, h9.k kVar, f1.s sVar, int i7) {
        Double dValueOf = Double.valueOf(0.0d);
        i9.l.e(aVar, "onDismissRequest");
        i9.l.e(kVar, "onConfigured");
        sVar.Y(-2121132595);
        int i10 = i7 | (sVar.g(z10) ? 4 : 2) | (sVar.h(kVar) ? 256 : 128) | (sVar.h(this) ? 2048 : 1024);
        if ((i10 & 1171) == 1170 && sVar.z()) {
            sVar.Q();
        } else {
            sVar.W(1849434622);
            Object objK = sVar.K();
            f1.w0 w0Var = f1.n.f5051a;
            if (objK == w0Var) {
                objK = f1.b.s(Boolean.TRUE);
                sVar.h0(objK);
            }
            f1.b1 b1Var = (f1.b1) objK;
            Object objC = a2.f.C(sVar, false, 1849434622);
            if (objC == w0Var) {
                objC = f1.b.s(new t8.j(dValueOf, dValueOf));
                sVar.h0(objC);
            }
            f1.b1 b1Var2 = (f1.b1) objC;
            Object objC2 = a2.f.C(sVar, false, 1849434622);
            if (objC2 == w0Var) {
                objC2 = f1.b.s("北京市");
                sVar.h0(objC2);
            }
            f1.b1 b1Var3 = (f1.b1) objC2;
            Object objC3 = a2.f.C(sVar, false, 1849434622);
            if (objC3 == w0Var) {
                objC3 = f1.b.s("北京市");
                sVar.h0(objC3);
            }
            f1.b1 b1Var4 = (f1.b1) objC3;
            sVar.p(false);
            l8.n.a(z10, null, 0L, false, 0, null, n1.h.e(1935706630, new a8.o(aVar, 16), sVar), null, n1.h.e(-1788988860, new a8.a0(kVar, this, b1Var, b1Var3, b1Var4, b1Var2, 1), sVar), n1.h.e(-2114333770, new v0(b1Var3, b1Var4, b1Var2, b1Var, 3), sVar), sVar, (i10 & 14) | 817889280, 382);
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new a8.i(this, z10, aVar, kVar, i7, 23);
        }
    }

    public final synchronized void d() {
        try {
            if (!this.f4539e) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.TIME_TICK");
                u3.f.g(n8.a.b(), this, intentFilter);
                this.f4539e = true;
                onReceive(n8.a.b(), new Intent("android.intent.action.TIME_TICK"));
            }
        } catch (Exception e7) {
            Logger.INSTANCE.d("CarLife_Vehicle", "【日出日落】注册异常: " + e7.getMessage());
        }
    }

    @Override // b8.h2
    public final String getName() {
        return this.f4535a;
    }

    @Override // b8.h2
    public final g2 getType() {
        return this.f4537c;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Iterable, java.lang.Object] */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Serializable serializableB;
        t8.j jVar;
        i9.l.e(context, "context");
        i9.l.e(intent, "intent");
        Calendar calendar = Calendar.getInstance();
        String str = String.format(Locale.CHINA, "%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(calendar.get(11)), Integer.valueOf(calendar.get(12))}, 2));
        for (m1 m1Var : this.f4538d) {
            double d10 = m1Var.f1611c;
            double d11 = m1Var.f1612d;
            LocalDate localDateNow = LocalDate.now();
            t8.o oVar = n8.d.f8898a;
            String strD = n8.d.d("TASKER_SUN_CYCLE", "");
            if (zb.j.B0(strD)) {
                jVar = o9.e0.H(d10, d11, localDateNow);
            } else {
                List listJ0 = zb.j.J0(strD, new String[]{"|"}, 6);
                if (listJ0.size() != 3) {
                    jVar = o9.e0.H(d10, d11, localDateNow);
                } else {
                    try {
                        serializableB = LocalDate.parse((CharSequence) listJ0.get(0));
                    } catch (Throwable th) {
                        serializableB = t8.a.b(th);
                    }
                    if (serializableB instanceof t8.l) {
                        serializableB = null;
                    }
                    LocalDate localDateP = a8.w1.p(serializableB);
                    jVar = (localDateP != null && localDateP.equals(localDateNow)) ? new t8.j(listJ0.get(1), listJ0.get(2)) : o9.e0.H(d10, d11, localDateNow);
                }
            }
            String str2 = (String) jVar.f12830a;
            String str3 = (String) jVar.f12831b;
            i9.l.e(str2, "start");
            i9.l.e(str3, "end");
            int iL = o9.e0.L(str);
            int iL2 = o9.e0.L(str2);
            int iL3 = o9.e0.L(str3);
            boolean z10 = iL2 > iL3 ? iL3 + 1 > iL || iL >= iL2 : iL2 <= iL && iL <= iL3;
            if (m1Var.f1610b == z10) {
                hc.c cVar = d8.v.f3842a;
                d8.v.a(new m1(z10, m1Var.f1611c, m1Var.f1612d));
            }
        }
    }
}
