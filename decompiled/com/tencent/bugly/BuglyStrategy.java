package com.tencent.bugly;

import com.tencent.bugly.proguard.aa;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class BuglyStrategy {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f2924c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f2925d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f2926e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f2927f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f2928g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f2929h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f2930i;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private a f2941u;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f2931j = true;
    private boolean k = true;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f2932l = true;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f2933m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f2934n = true;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Class<?> f2935o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f2936p = true;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f2937q = true;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f2938r = true;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f2939s = true;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f2940t = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int f2922a = 31;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected boolean f2923b = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f2942v = false;

    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    public static class a {
        public static final int CRASHTYPE_ANR = 4;
        public static final int CRASHTYPE_BLOCK = 7;
        public static final int CRASHTYPE_COCOS2DX_JS = 5;
        public static final int CRASHTYPE_COCOS2DX_LUA = 6;
        public static final int CRASHTYPE_JAVA_CATCH = 1;
        public static final int CRASHTYPE_JAVA_CRASH = 0;
        public static final int CRASHTYPE_NATIVE = 2;
        public static final int CRASHTYPE_U3D = 3;
        public static final int MAX_USERDATA_KEY_LENGTH = 100;
        public static final int MAX_USERDATA_VALUE_LENGTH = 100000;

        public synchronized Map<String, String> onCrashHandleStart(int i7, String str, String str2, String str3) {
            return null;
        }

        public synchronized byte[] onCrashHandleStart2GetExtraDatas(int i7, String str, String str2, String str3) {
            return null;
        }
    }

    public synchronized String getAppChannel() {
        String str = this.f2925d;
        if (str != null) {
            return str;
        }
        return aa.b().f3068s;
    }

    public synchronized String getAppPackageName() {
        String str = this.f2926e;
        if (str != null) {
            return str;
        }
        return aa.b().f3053c;
    }

    public synchronized long getAppReportDelay() {
        return this.f2927f;
    }

    public synchronized String getAppVersion() {
        String str = this.f2924c;
        if (str != null) {
            return str;
        }
        return aa.b().f3064o;
    }

    public synchronized int getCallBackType() {
        return this.f2922a;
    }

    public synchronized boolean getCloseErrorCallback() {
        return this.f2923b;
    }

    public synchronized a getCrashHandleCallback() {
        return this.f2941u;
    }

    public synchronized String getDeviceID() {
        return this.f2929h;
    }

    public synchronized String getDeviceModel() {
        return this.f2930i;
    }

    public synchronized String getLibBuglySOFilePath() {
        return this.f2928g;
    }

    public synchronized Class<?> getUserInfoActivity() {
        return this.f2935o;
    }

    public synchronized boolean isBuglyLogUpload() {
        return this.f2936p;
    }

    public synchronized boolean isEnableANRCrashMonitor() {
        return this.k;
    }

    public synchronized boolean isEnableCatchAnrTrace() {
        return this.f2932l;
    }

    public synchronized boolean isEnableNativeCrashMonitor() {
        return this.f2931j;
    }

    public boolean isEnableRecordAnrMainStack() {
        return this.f2933m;
    }

    public synchronized boolean isEnableUserInfo() {
        return this.f2934n;
    }

    public boolean isMerged() {
        return this.f2942v;
    }

    public boolean isReplaceOldChannel() {
        return this.f2937q;
    }

    public synchronized boolean isUploadProcess() {
        return this.f2938r;
    }

    public synchronized boolean isUploadSpotCrash() {
        return this.f2939s;
    }

    public synchronized boolean recordUserInfoOnceADay() {
        return this.f2940t;
    }

    public synchronized BuglyStrategy setAppChannel(String str) {
        this.f2925d = str;
        return this;
    }

    public synchronized BuglyStrategy setAppPackageName(String str) {
        this.f2926e = str;
        return this;
    }

    public synchronized BuglyStrategy setAppReportDelay(long j5) {
        this.f2927f = j5;
        return this;
    }

    public synchronized BuglyStrategy setAppVersion(String str) {
        this.f2924c = str;
        return this;
    }

    public synchronized BuglyStrategy setBuglyLogUpload(boolean z10) {
        this.f2936p = z10;
        return this;
    }

    public synchronized void setCallBackType(int i7) {
        this.f2922a = i7;
    }

    public synchronized void setCloseErrorCallback(boolean z10) {
        this.f2923b = z10;
    }

    public synchronized BuglyStrategy setCrashHandleCallback(a aVar) {
        this.f2941u = aVar;
        return this;
    }

    public synchronized BuglyStrategy setDeviceID(String str) {
        this.f2929h = str;
        return this;
    }

    public synchronized BuglyStrategy setDeviceModel(String str) {
        this.f2930i = str;
        return this;
    }

    public synchronized BuglyStrategy setEnableANRCrashMonitor(boolean z10) {
        this.k = z10;
        return this;
    }

    public void setEnableCatchAnrTrace(boolean z10) {
        this.f2932l = z10;
    }

    public synchronized BuglyStrategy setEnableNativeCrashMonitor(boolean z10) {
        this.f2931j = z10;
        return this;
    }

    public void setEnableRecordAnrMainStack(boolean z10) {
        this.f2933m = z10;
    }

    public synchronized BuglyStrategy setEnableUserInfo(boolean z10) {
        this.f2934n = z10;
        return this;
    }

    public synchronized BuglyStrategy setLibBuglySOFilePath(String str) {
        this.f2928g = str;
        return this;
    }

    @Deprecated
    public void setMerged(boolean z10) {
        this.f2942v = z10;
    }

    public synchronized BuglyStrategy setRecordUserInfoOnceADay(boolean z10) {
        this.f2940t = z10;
        return this;
    }

    public void setReplaceOldChannel(boolean z10) {
        this.f2937q = z10;
    }

    public synchronized BuglyStrategy setUploadProcess(boolean z10) {
        this.f2938r = z10;
        return this;
    }

    public synchronized void setUploadSpotCrash(boolean z10) {
        this.f2939s = z10;
    }

    public synchronized BuglyStrategy setUserInfoActivity(Class<?> cls) {
        this.f2935o = cls;
        return this;
    }
}
