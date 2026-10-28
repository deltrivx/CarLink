package com.tencent.bugly.crashreport.crash.jni;

import a2.f;
import android.content.Context;
import android.text.TextUtils;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import com.tencent.bugly.proguard.aa;
import com.tencent.bugly.proguard.ab;
import com.tencent.bugly.proguard.ac;
import com.tencent.bugly.proguard.ak;
import com.tencent.bugly.proguard.al;
import com.tencent.bugly.proguard.ap;
import com.tencent.bugly.proguard.as;
import com.tencent.bugly.proguard.at;
import com.tencent.bugly.proguard.bd;
import com.tencent.bugly.proguard.be;
import com.tencent.bugly.proguard.q;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class NativeCrashHandler implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static String f3034a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static NativeCrashHandler f3035b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f3036c = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static boolean f3037n = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Context f3038d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final aa f3039e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ak f3040f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private NativeExceptionHandler f3041g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f3042h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f3043i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f3044j = false;
    private boolean k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f3045l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private as f3046m;

    private NativeCrashHandler(Context context, aa aaVar, as asVar, ak akVar, boolean z10, String str) {
        this.f3038d = ap.a(context);
        if (ap.b(f3034a)) {
            try {
                if (ap.b(str)) {
                    str = context.getDir("bugly", 0).getAbsolutePath();
                }
            } catch (Throwable unused) {
                str = f.G("/data/data/", aa.a(context).f3053c, "/app_bugly");
            }
            f3034a = str;
        }
        this.f3046m = asVar;
        this.f3039e = aaVar;
        this.f3040f = akVar;
        this.f3042h = z10;
        this.f3041g = new bd(context, aaVar, asVar, ac.a());
    }

    private synchronized void a(boolean z10) {
        if (this.k) {
            al.d("[Native] Native crash report has already registered.", new Object[0]);
            return;
        }
        if (this.f3044j) {
            try {
                String strRegist = regist(f3034a, z10, f3036c);
                if (strRegist != null) {
                    al.a("[Native] Native Crash Report enable.", new Object[0]);
                    this.f3039e.f3070u = strRegist;
                    String strConcat = "-".concat(strRegist);
                    if (!at.f3186b && !this.f3039e.f3058h.contains(strConcat)) {
                        aa aaVar = this.f3039e;
                        aaVar.f3058h = aaVar.f3058h.concat("-").concat(this.f3039e.f3070u);
                    }
                    al.a("comInfo.sdkVersion %s", this.f3039e.f3058h);
                    this.k = true;
                    String runningCpuAbi = getRunningCpuAbi();
                    if (!TextUtils.isEmpty(runningCpuAbi)) {
                        this.f3039e.e(runningCpuAbi);
                    }
                    return;
                }
            } catch (Throwable unused) {
                al.c("[Native] Failed to load Bugly SO file.", new Object[0]);
            }
        } else if (this.f3043i) {
            try {
                Class cls = Integer.TYPE;
                String str = (String) ap.a("com.tencent.feedback.eup.jni.NativeExceptionUpload", "registNativeExceptionHandler2", new Class[]{String.class, String.class, cls, cls}, new Object[]{f3034a, ab.d(), Integer.valueOf(z10 ? 1 : 5), 1});
                if (str == null) {
                    String strD = ab.d();
                    aa.b();
                    str = (String) ap.a("com.tencent.feedback.eup.jni.NativeExceptionUpload", "registNativeExceptionHandler", new Class[]{String.class, String.class, cls}, new Object[]{f3034a, strD, Integer.valueOf(aa.B())});
                }
                if (str != null) {
                    this.k = true;
                    this.f3039e.f3070u = str;
                    ap.a("com.tencent.feedback.eup.jni.NativeExceptionUpload", "enableHandler", new Class[]{Boolean.TYPE}, new Object[]{Boolean.TRUE});
                    ap.a("com.tencent.feedback.eup.jni.NativeExceptionUpload", "setLogMode", new Class[]{cls}, new Object[]{Integer.valueOf(z10 ? 1 : 5)});
                    String runningCpuAbi2 = getRunningCpuAbi();
                    if (!TextUtils.isEmpty(runningCpuAbi2)) {
                        this.f3039e.e(runningCpuAbi2);
                    }
                    return;
                }
            } catch (Throwable unused2) {
            }
        }
        this.f3044j = false;
        this.f3043i = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(int i7, String str) {
        if (!this.f3044j) {
            return false;
        }
        try {
            setNativeInfo(i7, str);
            return true;
        } catch (UnsatisfiedLinkError unused) {
            return false;
        } catch (Throwable th) {
            if (!al.a(th)) {
                th.printStackTrace();
            }
            return false;
        }
    }

    private static boolean a(String str, boolean z10) {
        boolean z11;
        try {
            al.a("[Native] Trying to load so: %s", str);
            if (z10) {
                System.load(str);
            } else {
                System.loadLibrary(str);
            }
            try {
                al.a("[Native] Successfully loaded SO: %s", str);
                return true;
            } catch (Throwable th) {
                th = th;
                z11 = true;
                al.d(th.getMessage(), new Object[0]);
                al.d("[Native] Failed to load so: %s", str);
                return z11;
            }
        } catch (Throwable th2) {
            th = th2;
            z11 = false;
        }
    }

    private synchronized void b(boolean z10) {
        try {
            if (z10) {
                startNativeMonitor();
            } else {
                c();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private synchronized void c() {
        if (!this.k) {
            al.d("[Native] Native crash report has already unregistered.", new Object[0]);
            return;
        }
        try {
            if (unregist() != null) {
                al.a("[Native] Successfully closed native crash report.", new Object[0]);
                this.k = false;
                return;
            }
            try {
                ap.a("com.tencent.feedback.eup.jni.NativeExceptionUpload", "enableHandler", new Class[]{Boolean.TYPE}, new Object[]{Boolean.FALSE});
                this.k = false;
                al.a("[Native] Successfully closed native crash report.", new Object[0]);
                return;
            } catch (Throwable unused) {
                al.c("[Native] Failed to close native crash report.", new Object[0]);
                this.f3044j = false;
                this.f3043i = false;
                return;
            }
        } catch (Throwable unused2) {
            al.c("[Native] Failed to close native crash report.", new Object[0]);
        }
        throw th;
    }

    private synchronized void c(boolean z10) {
        if (this.f3045l != z10) {
            al.a("user change native %b", Boolean.valueOf(z10));
            this.f3045l = z10;
        }
    }

    public static synchronized String getDumpFilePath() {
        return f3034a;
    }

    public static synchronized NativeCrashHandler getInstance() {
        return f3035b;
    }

    public static synchronized NativeCrashHandler getInstance(Context context, aa aaVar, as asVar, ac acVar, ak akVar, boolean z10, String str) {
        try {
            if (f3035b == null) {
                f3035b = new NativeCrashHandler(context, aaVar, asVar, akVar, z10, str);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f3035b;
    }

    private native String getProperties(String str);

    private native String getSoCpuAbi();

    public static boolean isShouldHandleInJava() {
        return f3037n;
    }

    public static synchronized void setDumpFilePath(String str) {
        f3034a = str;
    }

    public static void setShouldHandleInJava(boolean z10) {
        f3037n = z10;
        NativeCrashHandler nativeCrashHandler = f3035b;
        if (nativeCrashHandler != null) {
            nativeCrashHandler.a(999, String.valueOf(z10));
        }
    }

    @Override // com.tencent.bugly.proguard.q
    public boolean appendLogToNative(String str, String str2, String str3) {
        if ((this.f3043i || this.f3044j) && str != null && str2 != null && str3 != null) {
            try {
                if (this.f3044j) {
                    return appendNativeLog(str, str2, str3);
                }
                Boolean bool = (Boolean) ap.a("com.tencent.feedback.eup.jni.NativeExceptionUpload", "appendNativeLog", new Class[]{String.class, String.class, String.class}, new Object[]{str, str2, str3});
                if (bool != null) {
                    return bool.booleanValue();
                }
                return false;
            } catch (UnsatisfiedLinkError unused) {
            } catch (Throwable th) {
                if (!al.a(th)) {
                    th.printStackTrace();
                }
            }
        }
        return false;
    }

    public native boolean appendNativeLog(String str, String str2, String str3);

    public native boolean appendWholeNativeLog(String str);

    public void checkUploadRecordCrash() {
        this.f3040f.a(new a(this));
    }

    public void disableCatchAnrTrace() {
        f3036c = 1;
    }

    public void dumpAnrNativeStack() {
        a(19, "1");
    }

    public void enableCatchAnrTrace() {
        f3036c |= 2;
    }

    public boolean filterSigabrtSysLog() {
        return a(998, "true");
    }

    @Override // com.tencent.bugly.proguard.q
    public String getLogFromNative() {
        if (!this.f3043i && !this.f3044j) {
            return null;
        }
        try {
            return this.f3044j ? getNativeLog() : (String) ap.a("com.tencent.feedback.eup.jni.NativeExceptionUpload", "getNativeLog", null, null);
        } catch (UnsatisfiedLinkError unused) {
            return null;
        } catch (Throwable th) {
            if (!al.a(th)) {
                th.printStackTrace();
            }
            return null;
        }
    }

    public NativeExceptionHandler getNativeExceptionHandler() {
        return this.f3041g;
    }

    public native String getNativeKeyValueList();

    public native String getNativeLog();

    public String getRunningCpuAbi() {
        try {
            return getSoCpuAbi();
        } catch (Throwable unused) {
            al.d("get so cpu abi failed，please upgrade bugly so version", new Object[0]);
            return "";
        }
    }

    public String getSystemProperty(String str) {
        return (this.f3044j || this.f3043i) ? getProperties(str) : "fail";
    }

    public boolean isEnableCatchAnrTrace() {
        return (f3036c & 2) == 2;
    }

    public synchronized boolean isUserOpened() {
        return this.f3045l;
    }

    public synchronized void onStrategyChanged(StrategyBean strategyBean) {
        if (strategyBean != null) {
            try {
                boolean z10 = strategyBean.f2977f;
                if (z10 != this.k) {
                    al.d("server native changed to %b", Boolean.valueOf(z10));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        boolean z11 = ac.a().c().f2977f && this.f3045l;
        if (z11 != this.k) {
            al.a("native changed to %b", Boolean.valueOf(z11));
            b(z11);
        }
    }

    public boolean putKeyValueToNative(String str, String str2) {
        if ((this.f3043i || this.f3044j) && str != null && str2 != null) {
            try {
                if (this.f3044j) {
                    return putNativeKeyValue(str, str2);
                }
                Boolean bool = (Boolean) ap.a("com.tencent.feedback.eup.jni.NativeExceptionUpload", "putNativeKeyValue", new Class[]{String.class, String.class}, new Object[]{str, str2});
                if (bool != null) {
                    return bool.booleanValue();
                }
                return false;
            } catch (UnsatisfiedLinkError unused) {
            } catch (Throwable th) {
                if (!al.a(th)) {
                    th.printStackTrace();
                }
            }
        }
        return false;
    }

    public native boolean putNativeKeyValue(String str, String str2);

    public native String regist(String str, boolean z10, int i7);

    public void removeEmptyNativeRecordFiles() {
        be.c(f3034a);
    }

    public native String removeNativeKeyValue(String str);

    public void resendSigquit() {
        a(20, "");
    }

    public boolean setNativeAppChannel(String str) {
        return a(12, str);
    }

    public boolean setNativeAppPackage(String str) {
        return a(13, str);
    }

    public boolean setNativeAppVersion(String str) {
        return a(10, str);
    }

    public native void setNativeInfo(int i7, String str);

    @Override // com.tencent.bugly.proguard.q
    public boolean setNativeIsAppForeground(boolean z10) {
        return a(14, z10 ? "true" : "false");
    }

    public boolean setNativeLaunchTime(long j5) {
        try {
            return a(15, String.valueOf(j5));
        } catch (NumberFormatException e7) {
            if (al.a(e7)) {
                return false;
            }
            e7.printStackTrace();
            return false;
        }
    }

    public boolean setNativeUserId(String str) {
        return a(11, str);
    }

    public synchronized void setUserOpened(boolean z10) {
        try {
            c(z10);
            boolean zIsUserOpened = isUserOpened();
            ac acVarA = ac.a();
            if (acVarA != null) {
                zIsUserOpened = zIsUserOpened && acVarA.c().f2977f;
            }
            if (zIsUserOpened != this.k) {
                al.a("native changed to %b", Boolean.valueOf(zIsUserOpened));
                b(zIsUserOpened);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void startNativeMonitor() {
        try {
            if (!this.f3044j && !this.f3043i) {
                boolean zB = ap.b(this.f3039e.f3069t);
                boolean z10 = !zB;
                if (at.f3186b) {
                    boolean zA = a(zB ? "Bugly_Native" : this.f3039e.f3069t, z10);
                    this.f3044j = zA;
                    if (!zA && zB) {
                        this.f3043i = a("NativeRQD", false);
                    }
                } else {
                    String str = "Bugly_Native";
                    aa aaVar = this.f3039e;
                    String str2 = aaVar.f3069t;
                    if (zB) {
                        aaVar.getClass();
                    } else {
                        str = str2;
                    }
                    this.f3044j = a(str, z10);
                }
                if (this.f3044j || this.f3043i) {
                    a(this.f3042h);
                    setNativeAppVersion(this.f3039e.f3064o);
                    setNativeAppChannel(this.f3039e.f3068s);
                    setNativeAppPackage(this.f3039e.f3053c);
                    setNativeUserId(this.f3039e.f());
                    setNativeIsAppForeground(this.f3039e.a());
                    setNativeLaunchTime(this.f3039e.f3048a);
                    return;
                }
                return;
            }
            a(this.f3042h);
        } catch (Throwable th) {
            throw th;
        }
    }

    public native void testCrash();

    public void testNativeCrash() {
        if (this.f3044j) {
            testCrash();
        } else {
            al.d("[Native] Bugly SO file has not been load.", new Object[0]);
        }
    }

    public void testNativeCrash(boolean z10, boolean z11, boolean z12) {
        a(16, String.valueOf(z10));
        a(17, String.valueOf(z11));
        a(18, String.valueOf(z12));
        testNativeCrash();
    }

    public void unBlockSigquit(boolean z10) {
        if (z10) {
            a(21, "true");
        } else {
            a(21, "false");
        }
    }

    public native String unregist();
}
