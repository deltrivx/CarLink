package com.tencent.bugly.proguard;

import android.content.Context;
import android.os.Process;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import com.tencent.bugly.crashreport.crash.CrashDetailBean;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class av implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static String f3223h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Object f3224i = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final Context f3225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final as f3226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final ac f3227c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final aa f3228d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected Thread.UncaughtExceptionHandler f3229e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected Thread.UncaughtExceptionHandler f3230f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected boolean f3231g = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f3232j;

    public av(Context context, as asVar, ac acVar, aa aaVar) {
        this.f3225a = context;
        this.f3226b = asVar;
        this.f3227c = acVar;
        this.f3228d = aaVar;
    }

    private static String a(Throwable th) {
        String message = th.getMessage();
        if (message == null) {
            return "";
        }
        if (message.length() <= 1000) {
            return message;
        }
        return message.substring(0, 1000) + "\n[Message over limit size:1000, has been cutted!]";
    }

    private static String a(Throwable th, int i7) {
        if (th == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        try {
            if (th.getStackTrace() != null) {
                for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                    if (i7 > 0 && sb2.length() >= i7) {
                        sb2.append("\n[Stack over limit size :" + i7 + " , has been cutted !]");
                        return sb2.toString();
                    }
                    sb2.append(stackTraceElement.toString());
                    sb2.append("\n");
                }
            }
        } catch (Throwable th2) {
            al.e("gen stack error %s", th2.toString());
        }
        return sb2.toString();
    }

    private static void a(CrashDetailBean crashDetailBean, Throwable th, boolean z10) {
        String strA;
        String name = th.getClass().getName();
        String strA2 = a(th);
        al.e("stack frame :%d, has cause %b", Integer.valueOf(th.getStackTrace().length), Boolean.valueOf(th.getCause() != null));
        String str = "";
        String string = th.getStackTrace().length > 0 ? th.getStackTrace()[0].toString() : "";
        Throwable cause = th;
        while (cause != null && cause.getCause() != null) {
            cause = cause.getCause();
        }
        if (cause == null || cause == th) {
            crashDetailBean.f3007n = name;
            if (at.a().i() && z10) {
                al.e("This Crash Caused By ANR , PLS To Fix ANR , This Trace May Be Not Useful!", new Object[0]);
                str = " This Crash Caused By ANR , PLS To Fix ANR , This Trace May Be Not Useful![Bugly]";
            }
            crashDetailBean.f3008o = ob.a.B(strA2, str);
            crashDetailBean.f3009p = string;
            strA = a(th, at.f3191h);
            crashDetailBean.f3010q = strA;
        } else {
            crashDetailBean.f3007n = cause.getClass().getName();
            crashDetailBean.f3008o = a(cause);
            if (cause.getStackTrace().length > 0) {
                crashDetailBean.f3009p = cause.getStackTrace()[0].toString();
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(name);
            sb2.append(":");
            sb2.append(strA2);
            sb2.append("\n");
            sb2.append(string);
            sb2.append("\n......\nCaused by:\n");
            sb2.append(crashDetailBean.f3007n);
            sb2.append(":");
            sb2.append(crashDetailBean.f3008o);
            sb2.append("\n");
            strA = a(cause, at.f3191h);
            sb2.append(strA);
            crashDetailBean.f3010q = sb2.toString();
        }
        crashDetailBean.f3014u = ap.c(crashDetailBean.f3010q.getBytes());
        crashDetailBean.f3019z.put(crashDetailBean.B, strA);
    }

    private static boolean a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        if (uncaughtExceptionHandler == null) {
            return true;
        }
        String name = uncaughtExceptionHandler.getClass().getName();
        for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
            String className = stackTraceElement.getClassName();
            String methodName = stackTraceElement.getMethodName();
            if (name.equals(className) && "uncaughtException".equals(methodName)) {
                return false;
            }
        }
        return true;
    }

    private static boolean a(Thread thread) {
        synchronized (f3224i) {
            try {
                if (f3223h != null && thread.getName().equals(f3223h)) {
                    return true;
                }
                f3223h = thread.getName();
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0106  */
    /* JADX WARN: Code duplicated, block: B:33:0x010e  */
    /* JADX WARN: Code duplicated, block: B:35:0x0111 A[Catch: all -> 0x0104, TryCatch #0 {all -> 0x0104, blocks: (B:23:0x00fc, B:30:0x0109, B:35:0x0111, B:37:0x011f, B:38:0x0121), top: B:42:0x00fc }] */
    /* JADX WARN: Code duplicated, block: B:37:0x011f A[Catch: all -> 0x0104, TryCatch #0 {all -> 0x0104, blocks: (B:23:0x00fc, B:30:0x0109, B:35:0x0111, B:37:0x011f, B:38:0x0121), top: B:42:0x00fc }] */
    private CrashDetailBean b(Thread thread, Throwable th, boolean z10, String str, byte[] bArr, boolean z11) {
        boolean z12;
        boolean z13;
        if (th == null) {
            al.d("We can do nothing with a null throwable.", new Object[0]);
            return null;
        }
        CrashDetailBean crashDetailBean = new CrashDetailBean();
        crashDetailBean.f3011r = System.currentTimeMillis();
        crashDetailBean.C = ab.j();
        crashDetailBean.D = ab.f();
        crashDetailBean.E = ab.l();
        crashDetailBean.F = this.f3228d.k();
        crashDetailBean.G = this.f3228d.j();
        crashDetailBean.H = this.f3228d.l();
        if (z10 || aa.B() < 31) {
            crashDetailBean.I = ab.b(this.f3225a);
        } else {
            crashDetailBean.I = 0L;
        }
        crashDetailBean.J = ab.g();
        crashDetailBean.K = ab.h();
        byte[] bArrA = ao.a();
        crashDetailBean.f3018y = bArrA;
        al.a("user log size:%d", Integer.valueOf(bArrA == null ? 0 : bArrA.length));
        crashDetailBean.f2996b = z10 ? 0 : 2;
        crashDetailBean.f2999e = this.f3228d.g();
        aa aaVar = this.f3228d;
        crashDetailBean.f3000f = aaVar.f3064o;
        crashDetailBean.f3001g = aaVar.q();
        crashDetailBean.f3006m = this.f3228d.f();
        crashDetailBean.f3019z = ap.a(z11, at.f3191h);
        crashDetailBean.A = this.f3228d.f3054d;
        crashDetailBean.B = thread.getName() + "(" + thread.getId() + ")";
        crashDetailBean.L = this.f3228d.s();
        crashDetailBean.f3002h = this.f3228d.p();
        crashDetailBean.f3003i = this.f3228d.A();
        aa aaVar2 = this.f3228d;
        crashDetailBean.Q = aaVar2.f3048a;
        crashDetailBean.R = aaVar2.a();
        a(crashDetailBean, th, z10);
        if (!z10) {
            if (str != null) {
                try {
                    if (str.length() > 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (bArr != null || bArr.length <= 0) {
                        z13 = false;
                    } else {
                        z13 = true;
                    }
                    if (z12) {
                        HashMap map = new HashMap(1);
                        crashDetailBean.S = map;
                        map.put("UserData", str);
                    }
                    if (z13) {
                        crashDetailBean.Y = bArr;
                    }
                } catch (Throwable th2) {
                    al.e("handle crash error %s", th2.toString());
                    return crashDetailBean;
                }
            } else {
                z12 = false;
                if (bArr != null) {
                    z13 = false;
                } else {
                    z13 = false;
                }
                if (z12) {
                    HashMap map2 = new HashMap(1);
                    crashDetailBean.S = map2;
                    map2.put("UserData", str);
                }
                if (z13) {
                    crashDetailBean.Y = bArr;
                }
            }
        }
        crashDetailBean.U = this.f3228d.z();
        aa aaVar3 = this.f3228d;
        crashDetailBean.V = aaVar3.f3073x;
        crashDetailBean.W = aaVar3.t();
        crashDetailBean.X = this.f3228d.y();
        return crashDetailBean;
    }

    private static void c() {
        al.e("current process die", new Object[0]);
        Process.killProcess(Process.myPid());
        System.exit(1);
    }

    public final synchronized void a() {
        if (this.f3232j >= 10) {
            al.a("java crash handler over %d, no need set.", 10);
            return;
        }
        this.f3231g = true;
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        if (defaultUncaughtExceptionHandler != null) {
            if (av.class.getName().equals(defaultUncaughtExceptionHandler.getClass().getName())) {
                return;
            }
            if ("com.android.internal.os.RuntimeInit$UncaughtHandler".equals(defaultUncaughtExceptionHandler.getClass().getName())) {
                al.a("backup system java handler: %s", defaultUncaughtExceptionHandler.toString());
                this.f3230f = defaultUncaughtExceptionHandler;
                this.f3229e = defaultUncaughtExceptionHandler;
            } else {
                al.a("backup java handler: %s", defaultUncaughtExceptionHandler.toString());
                this.f3229e = defaultUncaughtExceptionHandler;
            }
        }
        Thread.setDefaultUncaughtExceptionHandler(this);
        this.f3232j++;
        al.a("registered java monitor: %s", toString());
    }

    public final synchronized void a(StrategyBean strategyBean) {
        if (strategyBean != null) {
            boolean z10 = strategyBean.f2977f;
            if (z10 != this.f3231g) {
                al.a("java changed to %b", Boolean.valueOf(z10));
                if (strategyBean.f2977f) {
                    a();
                    return;
                }
                b();
            }
        }
    }

    public final void a(Thread thread, Throwable th, boolean z10, String str, byte[] bArr, boolean z11) {
        if (z10) {
            al.e("Java Crash Happen cause by %s(%d)", thread.getName(), Long.valueOf(thread.getId()));
            if (a(thread)) {
                al.a("this class has handled this exception", new Object[0]);
                if (this.f3230f != null) {
                    al.a("call system handler", new Object[0]);
                    this.f3230f.uncaughtException(thread, th);
                } else {
                    c();
                }
            }
        } else {
            al.e("Java Catch Happen", new Object[0]);
        }
        try {
            if (!this.f3231g) {
                al.c("Java crash handler is disable. Just return.", new Object[0]);
                if (z10) {
                    Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f3229e;
                    if (uncaughtExceptionHandler != null && a(uncaughtExceptionHandler)) {
                        al.e("sys default last handle start!", new Object[0]);
                        this.f3229e.uncaughtException(thread, th);
                        al.e("sys default last handle end!", new Object[0]);
                        return;
                    } else if (this.f3230f != null) {
                        al.e("system handle start!", new Object[0]);
                        this.f3230f.uncaughtException(thread, th);
                        al.e("system handle end!", new Object[0]);
                        return;
                    } else {
                        al.e("crashreport last handle start!", new Object[0]);
                        c();
                        al.e("crashreport last handle end!", new Object[0]);
                        return;
                    }
                }
                return;
            }
            if (!this.f3227c.b()) {
                al.d("no remote but still store!", new Object[0]);
            }
            if (!this.f3227c.c().f2977f && this.f3227c.b()) {
                al.e("crash report was closed by remote , will not upload to Bugly , print local for helpful!", new Object[0]);
                as.a(z10 ? "JAVA_CRASH" : "JAVA_CATCH", ap.a(), this.f3228d.f3054d, thread.getName(), ap.a(th), null);
                if (z10) {
                    Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.f3229e;
                    if (uncaughtExceptionHandler2 != null && a(uncaughtExceptionHandler2)) {
                        al.e("sys default last handle start!", new Object[0]);
                        this.f3229e.uncaughtException(thread, th);
                        al.e("sys default last handle end!", new Object[0]);
                        return;
                    } else if (this.f3230f != null) {
                        al.e("system handle start!", new Object[0]);
                        this.f3230f.uncaughtException(thread, th);
                        al.e("system handle end!", new Object[0]);
                        return;
                    } else {
                        al.e("crashreport last handle start!", new Object[0]);
                        c();
                        al.e("crashreport last handle end!", new Object[0]);
                        return;
                    }
                }
                return;
            }
            CrashDetailBean crashDetailBeanB = b(thread, th, z10, str, bArr, z11);
            if (crashDetailBeanB == null) {
                al.e("pkg crash datas fail!", new Object[0]);
                if (z10) {
                    Thread.UncaughtExceptionHandler uncaughtExceptionHandler3 = this.f3229e;
                    if (uncaughtExceptionHandler3 != null && a(uncaughtExceptionHandler3)) {
                        al.e("sys default last handle start!", new Object[0]);
                        this.f3229e.uncaughtException(thread, th);
                        al.e("sys default last handle end!", new Object[0]);
                        return;
                    } else if (this.f3230f != null) {
                        al.e("system handle start!", new Object[0]);
                        this.f3230f.uncaughtException(thread, th);
                        al.e("system handle end!", new Object[0]);
                        return;
                    } else {
                        al.e("crashreport last handle start!", new Object[0]);
                        c();
                        al.e("crashreport last handle end!", new Object[0]);
                        return;
                    }
                }
                return;
            }
            as.a(z10 ? "JAVA_CRASH" : "JAVA_CATCH", ap.a(), this.f3228d.f3054d, thread.getName(), ap.a(th), crashDetailBeanB);
            if (!this.f3226b.a(crashDetailBeanB, z10)) {
                this.f3226b.b(crashDetailBeanB, z10);
            }
            if (z10) {
                this.f3226b.a(crashDetailBeanB);
            }
            if (z10) {
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler4 = this.f3229e;
                if (uncaughtExceptionHandler4 != null && a(uncaughtExceptionHandler4)) {
                    al.e("sys default last handle start!", new Object[0]);
                    this.f3229e.uncaughtException(thread, th);
                    al.e("sys default last handle end!", new Object[0]);
                } else if (this.f3230f != null) {
                    al.e("system handle start!", new Object[0]);
                    this.f3230f.uncaughtException(thread, th);
                    al.e("system handle end!", new Object[0]);
                } else {
                    al.e("crashreport last handle start!", new Object[0]);
                    c();
                    al.e("crashreport last handle end!", new Object[0]);
                }
            }
        } catch (Throwable th2) {
            try {
                if (!al.a(th2)) {
                    th2.printStackTrace();
                }
                if (z10) {
                    Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = this.f3229e;
                    if (uncaughtExceptionHandler5 != null && a(uncaughtExceptionHandler5)) {
                        al.e("sys default last handle start!", new Object[0]);
                        this.f3229e.uncaughtException(thread, th);
                        al.e("sys default last handle end!", new Object[0]);
                    } else if (this.f3230f != null) {
                        al.e("system handle start!", new Object[0]);
                        this.f3230f.uncaughtException(thread, th);
                        al.e("system handle end!", new Object[0]);
                    } else {
                        al.e("crashreport last handle start!", new Object[0]);
                        c();
                        al.e("crashreport last handle end!", new Object[0]);
                    }
                }
            } catch (Throwable th3) {
                if (z10) {
                    Thread.UncaughtExceptionHandler uncaughtExceptionHandler6 = this.f3229e;
                    if (uncaughtExceptionHandler6 != null && a(uncaughtExceptionHandler6)) {
                        al.e("sys default last handle start!", new Object[0]);
                        this.f3229e.uncaughtException(thread, th);
                        al.e("sys default last handle end!", new Object[0]);
                    } else if (this.f3230f != null) {
                        al.e("system handle start!", new Object[0]);
                        this.f3230f.uncaughtException(thread, th);
                        al.e("system handle end!", new Object[0]);
                    } else {
                        al.e("crashreport last handle start!", new Object[0]);
                        c();
                        al.e("crashreport last handle end!", new Object[0]);
                    }
                }
                throw th3;
            }
        }
    }

    public final synchronized void b() {
        this.f3231g = false;
        al.a("close java monitor!", new Object[0]);
        if ("bugly".equals(Thread.getDefaultUncaughtExceptionHandler().getClass().getName())) {
            al.a("Java monitor to unregister: %s", toString());
            Thread.setDefaultUncaughtExceptionHandler(this.f3229e);
            this.f3232j--;
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        synchronized (f3224i) {
            a(thread, th, true, null, null, this.f3228d.Q);
        }
    }
}
