package e8;

import a8.k1;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import b8.g2;
import b8.h2;
import b8.v1;
import com.baidu.carlife.sdk.util.Logger;
import f1.w1;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class h1 extends BroadcastReceiver implements h2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f4551f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4552a = "Time";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4553b = "指定时间";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g2 f4554c = g2.f1593a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f4555d = u8.w.f13122a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f4556e;

    @Override // b8.h2
    public final void a() {
        hc.c cVar = n8.c.f8897a;
        n8.c.d(new a8.c1(this, null, 14));
    }

    @Override // b8.h2
    public final String b() {
        return this.f4553b;
    }

    @Override // b8.h2
    public final void c(boolean z10, h9.a aVar, h9.k kVar, f1.s sVar, int i7) {
        i9.l.e(aVar, "onDismissRequest");
        i9.l.e(kVar, "onConfigured");
        sVar.Y(374305893);
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
                objC = f1.b.s("06:00");
                sVar.h0(objC);
            }
            f1.b1 b1Var2 = (f1.b1) objC;
            Object objC2 = a2.f.C(sVar, false, 1849434622);
            if (objC2 == w0Var) {
                objC2 = f1.b.s("18:00");
                sVar.h0(objC2);
            }
            f1.b1 b1Var3 = (f1.b1) objC2;
            sVar.p(false);
            l8.n.a(z10, null, 0L, false, 0, null, n1.h.e(-833503650, new a8.o(aVar, 17), sVar), null, n1.h.e(1736855324, new a8.s(kVar, this, b1Var2, b1Var3, b1Var, 8), sVar), n1.h.e(-1681957874, new k1(5, b1Var2, b1Var3, b1Var), sVar), sVar, (i10 & 14) | 817889280, 382);
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new a8.i(this, z10, aVar, kVar, i7, 25);
        }
    }

    public final synchronized void d() {
        try {
            if (!this.f4556e) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.TIME_TICK");
                u3.f.g(n8.a.b(), this, intentFilter);
                this.f4556e = true;
                onReceive(n8.a.b(), new Intent("android.intent.action.TIME_TICK"));
            }
        } catch (Exception e7) {
            Logger.INSTANCE.d("CarLife_Vehicle", "【指定时间】注册异常: " + e7.getMessage());
        }
    }

    @Override // b8.h2
    public final String getName() {
        return this.f4552a;
    }

    @Override // b8.h2
    public final g2 getType() {
        return this.f4554c;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Iterable, java.lang.Object] */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        i9.l.e(context, "context");
        i9.l.e(intent, "intent");
        Calendar calendar = Calendar.getInstance();
        String str = String.format(Locale.CHINA, "%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(calendar.get(11)), Integer.valueOf(calendar.get(12))}, 2));
        for (v1 v1Var : this.f4555d) {
            String str2 = v1Var.f1662c;
            String str3 = v1Var.f1663d;
            i9.l.e(str2, "start");
            i9.l.e(str3, "end");
            int iL = o9.e0.L(str);
            int iL2 = o9.e0.L(str2);
            int iL3 = o9.e0.L(str3);
            boolean z10 = iL2 > iL3 ? iL3 + 1 > iL || iL >= iL2 : iL2 <= iL && iL <= iL3;
            if (v1Var.f1661b == z10) {
                hc.c cVar = d8.v.f3842a;
                String str4 = v1Var.f1662c;
                i9.l.e(str4, "start");
                d8.v.a(new v1(str4, str3, z10));
            }
        }
    }
}
