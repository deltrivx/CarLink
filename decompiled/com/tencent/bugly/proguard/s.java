package com.tencent.bugly.proguard;

import android.app.Application;
import android.content.Context;
import com.tencent.bugly.BuglyStrategy;
import com.tencent.bugly.crashreport.biz.UserInfoBean;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f3479a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static r f3480b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f3481c = 10;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long f3482d = 300000;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static long f3483e = 30000;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static long f3484f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f3485g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static long f3486h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static long f3487i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static long f3488j = 0;
    private static Application.ActivityLifecycleCallbacks k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static Class<?> f3489l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static boolean f3490m = true;

    public static /* synthetic */ String a(String str, String str2) {
        return ap.a() + "  " + str + "  " + str2 + "\n";
    }

    public static void a() {
        r rVar = f3480b;
        if (rVar != null) {
            rVar.a(2, false);
        }
    }

    public static void a(long j5) {
        if (j5 < 0) {
            j5 = ac.a().c().f2986p;
        }
        f3484f = j5;
    }

    public static void a(Context context) {
        if (!f3479a || context == null) {
            return;
        }
        Application application = context.getApplicationContext() instanceof Application ? (Application) context.getApplicationContext() : null;
        if (application != null) {
            try {
                Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = k;
                if (activityLifecycleCallbacks != null) {
                    application.unregisterActivityLifecycleCallbacks(activityLifecycleCallbacks);
                }
            } catch (Exception e7) {
                if (!al.a(e7)) {
                    e7.printStackTrace();
                }
            }
        }
        f3479a = false;
    }

    public static void a(Context context, BuglyStrategy buglyStrategy) {
        long appReportDelay;
        if (f3479a) {
            return;
        }
        boolean z10 = aa.a(context).f3056f;
        f3490m = z10;
        f3480b = new r(context, z10);
        f3479a = true;
        if (buglyStrategy != null) {
            f3489l = buglyStrategy.getUserInfoActivity();
            appReportDelay = buglyStrategy.getAppReportDelay();
        } else {
            appReportDelay = 0;
        }
        if (appReportDelay <= 0) {
            c(context, buglyStrategy);
        } else {
            ak.a().a(new b4.a(5, context, buglyStrategy), appReportDelay);
        }
    }

    public static void a(StrategyBean strategyBean, boolean z10) {
        r rVar = f3480b;
        if (rVar != null && !z10) {
            rVar.b();
        }
        if (strategyBean == null) {
            return;
        }
        long j5 = strategyBean.f2986p;
        if (j5 > 0) {
            f3483e = j5;
        }
        int i7 = strategyBean.f2991u;
        if (i7 > 0) {
            f3481c = i7;
        }
        long j10 = strategyBean.f2992v;
        if (j10 > 0) {
            f3482d = j10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(Context context, BuglyStrategy buglyStrategy) {
        boolean zIsEnableUserInfo;
        boolean zRecordUserInfoOnceADay;
        if (buglyStrategy != null) {
            zRecordUserInfoOnceADay = buglyStrategy.recordUserInfoOnceADay();
            zIsEnableUserInfo = buglyStrategy.isEnableUserInfo();
        } else {
            zIsEnableUserInfo = true;
            zRecordUserInfoOnceADay = false;
        }
        if (zRecordUserInfoOnceADay) {
            aa aaVarA = aa.a(context);
            List<UserInfoBean> listA = r.a(aaVarA.f3054d);
            if (listA != null) {
                for (int i7 = 0; i7 < listA.size(); i7++) {
                    UserInfoBean userInfoBean = listA.get(i7);
                    if (userInfoBean.f2963n.equals(aaVarA.f3064o) && userInfoBean.f2952b == 1) {
                        long jB = ap.b();
                        if (jB <= 0) {
                            break;
                        }
                        if (userInfoBean.f2955e >= jB) {
                            if (userInfoBean.f2956f <= 0) {
                                f3480b.b();
                                return;
                            }
                            return;
                        }
                    }
                }
            }
            zIsEnableUserInfo = false;
        }
        aa aaVarB = aa.b();
        if (aaVarB != null && z.a()) {
            aaVarB.a(0, true);
        }
        if (zIsEnableUserInfo) {
            Application application = context.getApplicationContext() instanceof Application ? (Application) context.getApplicationContext() : null;
            if (application != null) {
                try {
                    if (k == null) {
                        k = new r0();
                    }
                    application.registerActivityLifecycleCallbacks(k);
                } catch (Exception e7) {
                    if (!al.a(e7)) {
                        e7.printStackTrace();
                    }
                }
            }
        }
        if (f3490m) {
            f3487i = System.currentTimeMillis();
            f3480b.a(1, false);
            al.a("[session] launch app, new start", new Object[0]);
            f3480b.a();
            f3480b.a(21600000L);
        }
    }

    public static /* synthetic */ int g() {
        int i7 = f3485g;
        f3485g = i7 + 1;
        return i7;
    }
}
