package com.tencent.bugly;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.bugly.crashreport.CrashReport;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import com.tencent.bugly.proguard.aa;
import com.tencent.bugly.proguard.al;
import com.tencent.bugly.proguard.aq;
import com.tencent.bugly.proguard.at;
import com.tencent.bugly.proguard.au;
import com.tencent.bugly.proguard.o;
import com.tencent.bugly.proguard.u;
import com.tencent.bugly.proguard.z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class CrashModule extends o {
    public static final int MODULE_ID = 1004;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f2943c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static CrashModule f2944e = new CrashModule();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f2945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private BuglyStrategy.a f2946b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f2947d = false;

    private synchronized void a(Context context, BuglyStrategy buglyStrategy) {
        if (buglyStrategy == null) {
            return;
        }
        try {
            String libBuglySOFilePath = buglyStrategy.getLibBuglySOFilePath();
            if (!TextUtils.isEmpty(libBuglySOFilePath)) {
                aa.a(context).f3069t = libBuglySOFilePath;
                al.a("setted libBugly.so file path :%s", libBuglySOFilePath);
            }
            if (buglyStrategy.getCrashHandleCallback() != null) {
                this.f2946b = buglyStrategy.getCrashHandleCallback();
                al.a("setted CrashHanldeCallback", new Object[0]);
            }
            if (buglyStrategy.getAppReportDelay() > 0) {
                long appReportDelay = buglyStrategy.getAppReportDelay();
                this.f2945a = appReportDelay;
                al.a("setted delay: %d", Long.valueOf(appReportDelay));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static CrashModule getInstance() {
        CrashModule crashModule = f2944e;
        crashModule.id = MODULE_ID;
        return crashModule;
    }

    @Override // com.tencent.bugly.proguard.o
    public String[] getTables() {
        return new String[]{"t_cr"};
    }

    public synchronized boolean hasInitialized() {
        return this.f2947d;
    }

    @Override // com.tencent.bugly.proguard.o
    public synchronized void init(Context context, boolean z10, BuglyStrategy buglyStrategy) {
        if (context != null) {
            try {
                if (!this.f2947d) {
                    al.a("Initializing crash module.", new Object[0]);
                    u uVarA = u.a();
                    int i7 = f2943c + 1;
                    f2943c = i7;
                    uVarA.a(i7);
                    this.f2947d = true;
                    CrashReport.setContext(context);
                    a(context, buglyStrategy);
                    at atVarA = at.a(context, z10, this.f2946b);
                    atVarA.f3203t.a();
                    if (buglyStrategy != null) {
                        atVarA.B = buglyStrategy.getCallBackType();
                        atVarA.C = buglyStrategy.getCloseErrorCallback();
                        at.f3197o = buglyStrategy.isUploadSpotCrash();
                        aa.a(context).S = buglyStrategy.isEnableRecordAnrMainStack();
                        if (buglyStrategy.isEnableCatchAnrTrace()) {
                            atVarA.f3204u.enableCatchAnrTrace();
                        } else {
                            atVarA.f3204u.disableCatchAnrTrace();
                        }
                    } else {
                        atVarA.f3204u.enableCatchAnrTrace();
                    }
                    if (aa.b().f3054d.equals(z.a(atVarA.f3201c))) {
                        atVarA.f3204u.removeEmptyNativeRecordFiles();
                    }
                    if (buglyStrategy == null || buglyStrategy.isEnableNativeCrashMonitor()) {
                        atVarA.e();
                    } else {
                        al.a("[crash] Closed native crash monitor!", new Object[0]);
                        atVarA.d();
                    }
                    if (buglyStrategy == null || buglyStrategy.isEnableANRCrashMonitor()) {
                        atVarA.f();
                    } else {
                        al.a("[crash] Closed ANR monitor!", new Object[0]);
                        atVarA.g();
                    }
                    if (buglyStrategy != null) {
                        at.f3188e = buglyStrategy.isMerged();
                    }
                    atVarA.a(buglyStrategy != null ? buglyStrategy.getAppReportDelay() : 0L);
                    atVarA.f3204u.checkUploadRecordCrash();
                    au.a(context);
                    aq aqVarA = aq.a();
                    aqVarA.a("android.net.conn.CONNECTIVITY_CHANGE");
                    aqVarA.a(context);
                    u uVarA2 = u.a();
                    int i10 = f2943c - 1;
                    f2943c = i10;
                    uVarA2.a(i10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.tencent.bugly.proguard.o
    public void onServerStrategyChanged(StrategyBean strategyBean) {
        at atVarA;
        if (strategyBean == null || (atVarA = at.a()) == null) {
            return;
        }
        atVarA.f3203t.a(strategyBean);
        atVarA.f3204u.onStrategyChanged(strategyBean);
        atVarA.f3207x.b();
    }
}
