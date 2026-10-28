package com.tencent.bugly.proguard;

import android.content.Context;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class ac {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f3079a = 1000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static long f3080b = 259200000;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static ac f3081d;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static String f3082i;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ak f3083c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<o> f3084e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final StrategyBean f3085f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private StrategyBean f3086g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Context f3087h;

    private ac(Context context, List<o> list) {
        this.f3087h = context;
        if (aa.a(context) != null) {
            String str = aa.a(context).H;
            if ("oversea".equals(str)) {
                StrategyBean.f2972a = "https://astat.bugly.qcloud.com/rqd/async";
                StrategyBean.f2973b = "https://astat.bugly.qcloud.com/rqd/async";
            } else if ("na_https".equals(str)) {
                StrategyBean.f2972a = "https://astat.bugly.cros.wr.pvp.net/:8180/rqd/async";
                StrategyBean.f2973b = "https://astat.bugly.cros.wr.pvp.net/:8180/rqd/async";
            }
        }
        this.f3085f = new StrategyBean();
        this.f3084e = list;
        this.f3083c = ak.a();
    }

    public static synchronized ac a() {
        return f3081d;
    }

    public static synchronized ac a(Context context, List<o> list) {
        try {
            if (f3081d == null) {
                f3081d = new ac(context, list);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f3081d;
    }

    public static void a(String str) {
        if (ap.b(str) || !ap.d(str)) {
            al.d("URL user set is invalid.", new Object[0]);
        } else {
            f3082i = str;
        }
    }

    public static StrategyBean d() {
        byte[] bArr;
        List<y> listA = w.a().a(2);
        if (listA == null || listA.size() <= 0 || (bArr = listA.get(0).f3525g) == null) {
            return null;
        }
        return (StrategyBean) ap.a(bArr, StrategyBean.CREATOR);
    }

    public final void a(StrategyBean strategyBean, boolean z10) {
        al.c("[Strategy] Notify %s", s.class.getName());
        s.a(strategyBean, z10);
        for (o oVar : this.f3084e) {
            try {
                al.c("[Strategy] Notify %s", oVar.getClass().getName());
                oVar.onServerStrategyChanged(strategyBean);
            } catch (Throwable th) {
                if (!al.a(th)) {
                    th.printStackTrace();
                }
            }
        }
    }

    public final void a(bt btVar) {
        if (btVar == null) {
            return;
        }
        StrategyBean strategyBean = this.f3086g;
        if (strategyBean == null || btVar.f3379h != strategyBean.f2985o) {
            StrategyBean strategyBean2 = new StrategyBean();
            strategyBean2.f2977f = btVar.f3372a;
            strategyBean2.f2979h = btVar.f3374c;
            strategyBean2.f2978g = btVar.f3373b;
            if (ap.b(f3082i) || !ap.d(f3082i)) {
                if (ap.d(btVar.f3375d)) {
                    al.c("[Strategy] Upload url changes to %s", btVar.f3375d);
                    strategyBean2.f2987q = btVar.f3375d;
                }
                if (ap.d(btVar.f3376e)) {
                    al.c("[Strategy] Exception upload url changes to %s", btVar.f3376e);
                    strategyBean2.f2988r = btVar.f3376e;
                }
            }
            bs bsVar = btVar.f3377f;
            if (bsVar != null && !ap.b(bsVar.f3367a)) {
                strategyBean2.f2989s = btVar.f3377f.f3367a;
            }
            long j5 = btVar.f3379h;
            if (j5 != 0) {
                strategyBean2.f2985o = j5;
            }
            Map<String, String> map = btVar.f3378g;
            if (map != null && map.size() > 0) {
                Map<String, String> map2 = btVar.f3378g;
                strategyBean2.f2990t = map2;
                String str = map2.get("B11");
                strategyBean2.f2980i = str != null && str.equals("1");
                String str2 = btVar.f3378g.get("B3");
                if (str2 != null) {
                    strategyBean2.f2993w = Long.parseLong(str2);
                }
                int i7 = btVar.f3382l;
                strategyBean2.f2986p = i7;
                strategyBean2.f2992v = i7;
                String str3 = btVar.f3378g.get("B27");
                if (str3 != null && str3.length() > 0) {
                    try {
                        int i10 = Integer.parseInt(str3);
                        if (i10 > 0) {
                            strategyBean2.f2991u = i10;
                        }
                    } catch (Exception e7) {
                        if (!al.a(e7)) {
                            e7.printStackTrace();
                        }
                    }
                }
                String str4 = btVar.f3378g.get("B25");
                strategyBean2.k = str4 != null && str4.equals("1");
            }
            al.a("[Strategy] enableCrashReport:%b, enableQuery:%b, enableUserInfo:%b, enableAnr:%b, enableBlock:%b, enableSession:%b, enableSessionTimer:%b, sessionOverTime:%d, enableCocos:%b, strategyLastUpdateTime:%d", Boolean.valueOf(strategyBean2.f2977f), Boolean.valueOf(strategyBean2.f2979h), Boolean.valueOf(strategyBean2.f2978g), Boolean.valueOf(strategyBean2.f2980i), Boolean.valueOf(strategyBean2.f2981j), Boolean.valueOf(strategyBean2.f2983m), Boolean.valueOf(strategyBean2.f2984n), Long.valueOf(strategyBean2.f2986p), Boolean.valueOf(strategyBean2.k), Long.valueOf(strategyBean2.f2985o));
            this.f3086g = strategyBean2;
            if (!ap.d(btVar.f3375d)) {
                al.c("[Strategy] download url is null", new Object[0]);
                this.f3086g.f2987q = "";
            }
            if (!ap.d(btVar.f3376e)) {
                al.c("[Strategy] download crashurl is null", new Object[0]);
                this.f3086g.f2988r = "";
            }
            w.a().b(2);
            y yVar = new y();
            yVar.f3520b = 2;
            yVar.f3519a = strategyBean2.f2975d;
            yVar.f3523e = strategyBean2.f2976e;
            yVar.f3525g = ap.a(strategyBean2);
            w.a().a(yVar);
            a(strategyBean2, true);
        }
    }

    public final synchronized boolean b() {
        return this.f3086g != null;
    }

    public final StrategyBean c() {
        StrategyBean strategyBean = this.f3086g;
        if (strategyBean != null) {
            if (!ap.d(strategyBean.f2987q)) {
                this.f3086g.f2987q = StrategyBean.f2972a;
            }
            if (!ap.d(this.f3086g.f2988r)) {
                this.f3086g.f2988r = StrategyBean.f2973b;
            }
            return this.f3086g;
        }
        if (!ap.b(f3082i) && ap.d(f3082i)) {
            StrategyBean strategyBean2 = this.f3085f;
            String str = f3082i;
            strategyBean2.f2987q = str;
            strategyBean2.f2988r = str;
        }
        return this.f3085f;
    }
}
