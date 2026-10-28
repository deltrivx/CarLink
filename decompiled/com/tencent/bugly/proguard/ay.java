package com.tencent.bugly.proguard;

import android.app.ActivityManager;
import android.content.Context;
import android.os.FileObserver;
import android.os.Looper;
import android.text.TextUtils;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import com.tencent.bugly.crashreport.crash.CrashDetailBean;
import com.tencent.bugly.crashreport.crash.anr.TraceFileHelper;
import com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class ay {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static ay f3240f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ActivityManager f3242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final aa f3243c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final ak f3244d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    String f3245e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Context f3246g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ac f3247h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final as f3248i;
    private FileObserver k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private bg f3251m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f3252n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f3241a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Object f3249j = new Object();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f3250l = true;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f3253o = 0;

    public ay(Context context, ac acVar, aa aaVar, ak akVar, as asVar) {
        Context contextA = ap.a(context);
        this.f3246g = contextA;
        this.f3242b = (ActivityManager) contextA.getSystemService("activity");
        if (ap.b(NativeCrashHandler.getDumpFilePath())) {
            this.f3245e = context.getDir("bugly", 0).getAbsolutePath();
        } else {
            this.f3245e = NativeCrashHandler.getDumpFilePath();
        }
        this.f3243c = aaVar;
        this.f3244d = akVar;
        this.f3247h = acVar;
        this.f3248i = asVar;
    }

    private CrashDetailBean a(ax axVar) {
        CrashDetailBean crashDetailBean = new CrashDetailBean();
        try {
            crashDetailBean.C = ab.j();
            crashDetailBean.D = ab.f();
            crashDetailBean.E = ab.l();
            crashDetailBean.F = this.f3243c.k();
            crashDetailBean.G = this.f3243c.j();
            crashDetailBean.H = this.f3243c.l();
            crashDetailBean.I = ab.b(this.f3246g);
            crashDetailBean.J = ab.g();
            crashDetailBean.K = ab.h();
            crashDetailBean.f2996b = 3;
            crashDetailBean.f2999e = this.f3243c.g();
            aa aaVar = this.f3243c;
            crashDetailBean.f3000f = aaVar.f3064o;
            crashDetailBean.f3001g = aaVar.q();
            crashDetailBean.f3006m = this.f3243c.f();
            crashDetailBean.f3007n = "ANR_EXCEPTION";
            crashDetailBean.f3008o = axVar.f3238f;
            crashDetailBean.f3010q = axVar.f3239g;
            HashMap map = new HashMap();
            crashDetailBean.T = map;
            map.put("BUGLY_CR_01", axVar.f3237e);
            String str = crashDetailBean.f3010q;
            int iIndexOf = str != null ? str.indexOf("\n") : -1;
            crashDetailBean.f3009p = iIndexOf > 0 ? crashDetailBean.f3010q.substring(0, iIndexOf) : "GET_FAIL";
            crashDetailBean.f3011r = axVar.f3235c;
            String str2 = crashDetailBean.f3010q;
            if (str2 != null) {
                crashDetailBean.f3014u = ap.c(str2.getBytes());
            }
            crashDetailBean.f3019z = axVar.f3234b;
            crashDetailBean.A = axVar.f3233a;
            crashDetailBean.B = "main(1)";
            crashDetailBean.L = this.f3243c.s();
            crashDetailBean.f3002h = this.f3243c.p();
            crashDetailBean.f3003i = this.f3243c.A();
            crashDetailBean.f3015v = axVar.f3236d;
            aa aaVar2 = this.f3243c;
            crashDetailBean.P = aaVar2.f3070u;
            crashDetailBean.Q = aaVar2.f3048a;
            crashDetailBean.R = aaVar2.a();
            crashDetailBean.U = this.f3243c.z();
            aa aaVar3 = this.f3243c;
            crashDetailBean.V = aaVar3.f3073x;
            crashDetailBean.W = aaVar3.t();
            crashDetailBean.X = this.f3243c.y();
            crashDetailBean.f3018y = ao.a();
            return crashDetailBean;
        } catch (Throwable th) {
            if (!al.a(th)) {
                th.printStackTrace();
            }
            return crashDetailBean;
        }
    }

    public static synchronized ay a() {
        return f3240f;
    }

    private static String a(List<ba> list, long j5) {
        if (list == null || list.isEmpty()) {
            return "main thread stack not enable";
        }
        StringBuilder sb2 = new StringBuilder(ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_LEFT);
        sb2.append("\n>>>>> 以下为anr过程中主线程堆栈记录，可根据堆栈出现次数推测在该堆栈阻塞的时间，出现次数越多对anr贡献越大，越可能是造成anr的原因 >>>>>\n\n>>>>> Thread Stack Traces Records Start >>>>>\n");
        for (int i7 = 0; i7 < list.size(); i7++) {
            ba baVar = list.get(i7);
            sb2.append("Thread name:");
            sb2.append(baVar.f3255a);
            sb2.append("\n");
            long j10 = baVar.f3256b - j5;
            String str = j10 <= 0 ? "before " : "after ";
            sb2.append("Got ");
            sb2.append(str);
            sb2.append("anr:");
            sb2.append(Math.abs(j10));
            sb2.append("ms\n");
            sb2.append(baVar.f3257c);
            sb2.append("\n");
            if (sb2.length() * 2 >= 101376) {
                break;
            }
        }
        sb2.append("\n<<<<< Thread Stack Traces Records End <<<<<\n");
        return sb2.toString();
    }

    public static /* synthetic */ void a(ay ayVar) {
        long jCurrentTimeMillis = (System.currentTimeMillis() + at.f3193j) - ap.b();
        am.a(ayVar.f3245e, "bugly_trace_", ".txt", jCurrentTimeMillis);
        am.a(ayVar.f3245e, "manual_bugly_trace_", ".txt", jCurrentTimeMillis);
        am.a(ayVar.f3245e, "main_stack_record_", ".txt", jCurrentTimeMillis);
        am.a(ayVar.f3245e, "main_stack_record_", ".txt.merged", jCurrentTimeMillis);
    }

    private static boolean a(String str, String str2, String str3) {
        Map<String, String[]> map;
        TraceFileHelper.a targetDumpInfo = TraceFileHelper.readTargetDumpInfo(str3, str, true);
        if (targetDumpInfo == null || (map = targetDumpInfo.f3023d) == null || map.isEmpty()) {
            al.e("not found trace dump for %s", str3);
            return false;
        }
        StringBuilder sb2 = new StringBuilder(1024);
        String[] strArr = targetDumpInfo.f3023d.get("main");
        if (strArr != null && strArr.length >= 3) {
            sb2.append("\"main\" tid=");
            sb2.append(strArr[2]);
            sb2.append(" :\n");
            sb2.append(strArr[0]);
            sb2.append("\n");
            sb2.append(strArr[1]);
            sb2.append("\n\n");
        }
        for (Map.Entry<String, String[]> entry : targetDumpInfo.f3023d.entrySet()) {
            if (!entry.getKey().equals("main") && entry.getValue() != null && entry.getValue().length >= 3) {
                sb2.append("\"");
                sb2.append(entry.getKey());
                sb2.append("\" tid=");
                sb2.append(entry.getValue()[2]);
                sb2.append(" :\n");
                sb2.append(entry.getValue()[0]);
                sb2.append("\n");
                sb2.append(entry.getValue()[1]);
                sb2.append("\n\n");
            }
        }
        return am.a(str2, sb2.toString(), sb2.length() * 2);
    }

    private synchronized void c() {
        if (e()) {
            al.d("start when started!", new Object[0]);
            return;
        }
        l0 l0Var = new l0(this);
        this.k = l0Var;
        try {
            l0Var.startWatching();
            al.a("start anr monitor!", new Object[0]);
            this.f3244d.a(new m0(this, 0));
        } catch (Throwable th) {
            this.k = null;
            al.d("start anr monitor failed!", new Object[0]);
            if (al.a(th)) {
                return;
            }
            th.printStackTrace();
        }
    }

    private synchronized void c(boolean z10) {
        try {
            if (z10) {
                g();
            } else {
                h();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private synchronized void d() {
        if (!e()) {
            al.d("close when closed!", new Object[0]);
            return;
        }
        try {
            this.k.stopWatching();
            this.k = null;
            al.d("close anr monitor!", new Object[0]);
        } catch (Throwable th) {
            al.d("stop anr monitor failed!", new Object[0]);
            if (al.a(th)) {
                return;
            }
            th.printStackTrace();
        }
    }

    private synchronized void d(boolean z10) {
        if (this.f3250l != z10) {
            al.a("user change anr %b", Boolean.valueOf(z10));
            this.f3250l = z10;
        }
    }

    private synchronized boolean e() {
        return this.k != null;
    }

    private synchronized boolean f() {
        return this.f3250l;
    }

    private synchronized void g() {
        if (e()) {
            al.d("start when started!", new Object[0]);
            return;
        }
        if (TextUtils.isEmpty(this.f3245e)) {
            return;
        }
        synchronized (this.f3249j) {
            try {
                bg bgVar = this.f3251m;
                if (bgVar == null || !bgVar.isAlive()) {
                    bg bgVar2 = new bg();
                    this.f3251m = bgVar2;
                    boolean z10 = this.f3243c.S;
                    bgVar2.f3285b = z10;
                    al.c("set record stack trace enable:".concat(String.valueOf(z10)), new Object[0]);
                    bg bgVar3 = this.f3251m;
                    StringBuilder sb2 = new StringBuilder("Bugly-ThreadMonitor");
                    int i7 = this.f3252n;
                    this.f3252n = i7 + 1;
                    sb2.append(i7);
                    bgVar3.setName(sb2.toString());
                    this.f3251m.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        l0 l0Var = new l0(this, this.f3245e);
        this.k = l0Var;
        try {
            l0Var.startWatching();
            al.a("startWatchingPrivateAnrDir! dumFilePath is %s", this.f3245e);
            this.f3244d.a(new m0(this, 1));
        } catch (Throwable th2) {
            this.k = null;
            al.d("startWatchingPrivateAnrDir failed!", new Object[0]);
            if (al.a(th2)) {
                return;
            }
            th2.printStackTrace();
        }
    }

    private synchronized void h() {
        if (!e()) {
            al.d("close when closed!", new Object[0]);
            return;
        }
        synchronized (this.f3249j) {
            try {
                bg bgVar = this.f3251m;
                if (bgVar != null) {
                    bgVar.a();
                    this.f3251m = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        al.a("stopWatchingPrivateAnrDir", new Object[0]);
        try {
            this.k.stopWatching();
            this.k = null;
            al.d("close anr monitor!", new Object[0]);
        } catch (Throwable th2) {
            al.d("stop anr monitor failed!", new Object[0]);
            if (al.a(th2)) {
                return;
            }
            th2.printStackTrace();
        }
    }

    public final void a(long j5, String str) {
        ActivityManager.ProcessErrorStateInfo processErrorStateInfoA;
        List<ba> listC;
        try {
            al.c("anr time:%s", Long.valueOf(j5));
            synchronized (this.f3249j) {
                try {
                    if (this.f3251m != null) {
                        al.c("Disable record main stack trace.", new Object[0]);
                        this.f3251m.c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            String strA = ap.a(Looper.getMainLooper().getThread());
            Map<String, String> mapA = ap.a(this.f3243c.R, at.f3191h);
            if (this.f3243c.a()) {
                boolean z10 = ab.o() || ab.p();
                al.c("isAnrCrashDevice:%s", Boolean.valueOf(z10));
                processErrorStateInfoA = z10 ? az.a(this.f3242b, 0L) : az.a(this.f3242b, 21000L);
            }
            if (processErrorStateInfoA == null) {
                al.c("proc state is invisible or not my proc!", new Object[0]);
                a(false);
                return;
            }
            ax axVar = new ax();
            axVar.f3235c = j5;
            axVar.f3233a = processErrorStateInfoA.processName;
            axVar.f3238f = processErrorStateInfoA.shortMsg;
            axVar.f3237e = processErrorStateInfoA.longMsg;
            axVar.f3234b = mapA;
            axVar.f3239g = strA;
            if (TextUtils.isEmpty(strA)) {
                axVar.f3239g = "main stack is null , some error may be encountered.";
            }
            Long lValueOf = Long.valueOf(axVar.f3235c);
            String str2 = axVar.f3236d;
            String str3 = axVar.f3233a;
            String str4 = axVar.f3239g;
            String str5 = axVar.f3238f;
            String str6 = axVar.f3237e;
            Map<String, String> map = axVar.f3234b;
            al.c("anr time:%d\ntrace file:%s\nproc:%s\nmain stack:%s\nshort msg:%s\nlong msg:%s\n threads:%d", lValueOf, str2, str3, str4, str5, str6, Integer.valueOf(map == null ? 0 : map.size()));
            al.a("found visible anr , start to upload!", new Object[0]);
            al.c("trace file:%s", str);
            if (TextUtils.isEmpty(str) || !new File(str).exists()) {
                al.c("trace file is null or not exists, just ignore", new Object[0]);
            } else {
                File file = new File(this.f3245e, "bugly_trace_" + j5 + ".txt");
                al.c("trace file exists", new Object[0]);
                if (str.startsWith("/data/anr/")) {
                    al.a("backup trace isOK:%s", Boolean.valueOf(a(str, file.getAbsolutePath(), axVar.f3233a)));
                } else {
                    al.a("trace file rename :%s", Boolean.valueOf(new File(str).renameTo(file)));
                }
                synchronized (this.f3249j) {
                    try {
                        bg bgVar = this.f3251m;
                        listC = bgVar != null ? bgVar.f3284a.c() : null;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (listC != null) {
                    String strA2 = a(listC, j5);
                    al.c("save main stack trace", new Object[0]);
                    am.a(file, strA2, 2147483647L, true);
                }
                axVar.f3236d = file.getAbsolutePath();
            }
            CrashDetailBean crashDetailBeanA = a(axVar);
            at.a().a(crashDetailBeanA);
            if (crashDetailBeanA.f2994a >= 0) {
                al.a("backup anr record success!", new Object[0]);
            } else {
                al.d("backup anr record fail!", new Object[0]);
            }
            as.a("ANR", ap.a(j5), axVar.f3233a, "main", axVar.f3239g, crashDetailBeanA);
            if (!this.f3248i.a(crashDetailBeanA, !ab.r())) {
                this.f3248i.b(crashDetailBeanA, true);
            }
            this.f3248i.a(crashDetailBeanA);
            synchronized (this.f3249j) {
                try {
                    if (this.f3251m != null) {
                        al.c("Finish anr process.", new Object[0]);
                        this.f3251m.d();
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            a(false);
        } catch (Throwable th4) {
            try {
                al.b(th4);
            } finally {
                a(false);
            }
        }
    }

    public final boolean a(long j5) {
        if (Math.abs(j5 - this.f3253o) < 10000) {
            al.d("should not process ANR too Fre in %dms", 10000);
            return true;
        }
        this.f3253o = j5;
        return false;
    }

    public final boolean a(boolean z10) {
        boolean zCompareAndSet = this.f3241a.compareAndSet(!z10, z10);
        al.c("tryChangeAnrState to %s, success:%s", Boolean.valueOf(z10), Boolean.valueOf(zCompareAndSet));
        return zCompareAndSet;
    }

    public final synchronized void b() {
        al.d("customer decides whether to open or close.", new Object[0]);
    }

    public final void b(boolean z10) {
        d(z10);
        boolean zF = f();
        ac acVarA = ac.a();
        if (acVarA != null) {
            zF = zF && acVarA.c().f2977f;
        }
        if (zF != e()) {
            al.a("anr changed to %b", Boolean.valueOf(zF));
            c(zF);
        }
    }
}
