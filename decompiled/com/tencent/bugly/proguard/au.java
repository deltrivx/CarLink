package com.tencent.bugly.proguard;

import android.content.Context;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import com.tencent.bugly.crashreport.crash.CrashDetailBean;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class au {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static au f3218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ac f3219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private aa f3220c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private as f3221d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Context f3222e;

    private au(Context context) {
        at atVarA = at.a();
        if (atVarA == null) {
            return;
        }
        this.f3219b = ac.a();
        this.f3220c = aa.a(context);
        this.f3221d = atVarA.f3202s;
        this.f3222e = context;
        ak.a().a(new c0(1, this));
    }

    public static au a(Context context) {
        if (f3218a == null) {
            f3218a = new au(context);
        }
        return f3218a;
    }

    public static /* synthetic */ void a(au auVar) {
        al.c("[ExtraCrashManager] Trying to notify Bugly agents.", new Object[0]);
        try {
            Class<?> cls = Class.forName("com.tencent.bugly.agent.GameAgent");
            auVar.f3220c.getClass();
            ap.a(cls, "sdkPackageName", "com.tencent.bugly");
            al.c("[ExtraCrashManager] Bugly game agent has been notified.", new Object[0]);
        } catch (Throwable unused) {
            al.a("[ExtraCrashManager] no game agent", new Object[0]);
        }
    }

    public static /* synthetic */ void a(au auVar, Thread thread, int i7, String str, String str2, String str3, Map map) {
        String str4;
        String str5;
        Thread threadCurrentThread = thread == null ? Thread.currentThread() : thread;
        if (i7 == 4) {
            str4 = "Unity";
        } else if (i7 == 5 || i7 == 6) {
            str4 = "Cocos";
        } else {
            if (i7 != 8) {
                al.d("[ExtraCrashManager] Unknown extra crash type: %d", Integer.valueOf(i7));
                return;
            }
            str4 = "H5";
        }
        al.e("[ExtraCrashManager] %s Crash Happen", str4);
        try {
            if (!auVar.f3219b.b()) {
                al.d("[ExtraCrashManager] There is no remote strategy, but still store it.", new Object[0]);
            }
            StrategyBean strategyBeanC = auVar.f3219b.c();
            if (!strategyBeanC.f2977f && auVar.f3219b.b()) {
                al.e("[ExtraCrashManager] Crash report was closed by remote. Will not upload to Bugly , print local for helpful!", new Object[0]);
                as.a(str4, ap.a(), auVar.f3220c.f3054d, threadCurrentThread.getName(), str + "\n" + str2 + "\n" + str3, null);
                al.e("[ExtraCrashManager] Successfully handled.", new Object[0]);
                return;
            }
            if (i7 == 5 || i7 == 6) {
                if (!strategyBeanC.k) {
                    al.e("[ExtraCrashManager] %s report is disabled.", str4);
                    al.e("[ExtraCrashManager] Successfully handled.", new Object[0]);
                    return;
                }
            } else if (i7 == 8 && !strategyBeanC.f2982l) {
                al.e("[ExtraCrashManager] %s report is disabled.", str4);
                al.e("[ExtraCrashManager] Successfully handled.", new Object[0]);
                return;
            }
            int i10 = i7 != 8 ? i7 : 5;
            CrashDetailBean crashDetailBean = new CrashDetailBean();
            crashDetailBean.C = ab.j();
            crashDetailBean.D = ab.f();
            crashDetailBean.E = ab.l();
            crashDetailBean.F = auVar.f3220c.k();
            crashDetailBean.G = auVar.f3220c.j();
            crashDetailBean.H = auVar.f3220c.l();
            crashDetailBean.I = ab.b(auVar.f3222e);
            crashDetailBean.J = ab.g();
            crashDetailBean.K = ab.h();
            crashDetailBean.f2996b = i10;
            crashDetailBean.f2999e = auVar.f3220c.g();
            aa aaVar = auVar.f3220c;
            crashDetailBean.f3000f = aaVar.f3064o;
            crashDetailBean.f3001g = aaVar.q();
            crashDetailBean.f3006m = auVar.f3220c.f();
            crashDetailBean.f3007n = String.valueOf(str);
            crashDetailBean.f3008o = String.valueOf(str2);
            String str6 = "";
            if (str3 != null) {
                String[] strArrSplit = str3.split("\n");
                str6 = strArrSplit.length > 0 ? strArrSplit[0] : "";
                str5 = str3;
            } else {
                str5 = "";
            }
            crashDetailBean.f3009p = str6;
            crashDetailBean.f3010q = str5;
            crashDetailBean.f3011r = System.currentTimeMillis();
            crashDetailBean.f3014u = ap.c(crashDetailBean.f3010q.getBytes());
            crashDetailBean.f3019z = ap.a(auVar.f3220c.Q, at.f3191h);
            crashDetailBean.A = auVar.f3220c.f3054d;
            crashDetailBean.B = threadCurrentThread.getName() + "(" + threadCurrentThread.getId() + ")";
            crashDetailBean.L = auVar.f3220c.s();
            crashDetailBean.f3002h = auVar.f3220c.p();
            aa aaVar2 = auVar.f3220c;
            crashDetailBean.Q = aaVar2.f3048a;
            crashDetailBean.R = aaVar2.a();
            crashDetailBean.U = auVar.f3220c.z();
            aa aaVar3 = auVar.f3220c;
            crashDetailBean.V = aaVar3.f3073x;
            crashDetailBean.W = aaVar3.t();
            crashDetailBean.X = auVar.f3220c.y();
            crashDetailBean.f3018y = ao.a();
            if (crashDetailBean.S == null) {
                crashDetailBean.S = new LinkedHashMap();
            }
            if (map != null) {
                crashDetailBean.S.putAll(map);
            }
            as.a(str4, ap.a(), auVar.f3220c.f3054d, threadCurrentThread.getName(), str + "\n" + str2 + "\n" + str3, crashDetailBean);
            if (!auVar.f3221d.a(crashDetailBean, !at.a().C)) {
                auVar.f3221d.b(crashDetailBean, false);
            }
            al.e("[ExtraCrashManager] Successfully handled.", new Object[0]);
        } catch (Throwable th) {
            try {
                if (!al.a(th)) {
                    th.printStackTrace();
                }
                al.e("[ExtraCrashManager] Successfully handled.", new Object[0]);
            } catch (Throwable th2) {
                al.e("[ExtraCrashManager] Successfully handled.", new Object[0]);
                throw th2;
            }
        }
    }

    public static void a(Thread thread, int i7, String str, String str2, String str3, Map<String, String> map) {
        ak.a().a(new k0(thread, i7, str, str2, str3, map));
    }
}
