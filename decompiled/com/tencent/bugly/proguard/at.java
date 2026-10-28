package com.tencent.bugly.proguard;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.tencent.bugly.BuglyStrategy;
import com.tencent.bugly.CrashModule;
import com.tencent.bugly.crashreport.crash.CrashDetailBean;
import com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class at {
    private static at D = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f3185a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f3186b = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f3187d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f3188e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f3189f = 20480;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f3190g = 3000;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f3191h = 20480;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static long f3192i = 209715200;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static long f3193j = 604800000;
    public static String k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static boolean f3194l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static String f3195m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static int f3196n = 5000;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static boolean f3197o = true;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static boolean f3198p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static String f3199q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static String f3200r;
    public Boolean A;
    public int B = 31;
    public boolean C = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f3201c;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final as f3202s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final av f3203t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final NativeCrashHandler f3204u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ac f3205v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ak f3206w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ay f3207x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public BuglyStrategy.a f3208y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public aw f3209z;

    private at(Context context, ak akVar, boolean z10, BuglyStrategy.a aVar) {
        f3185a = CrashModule.MODULE_ID;
        Context contextA = ap.a(context);
        this.f3201c = contextA;
        ac acVarA = ac.a();
        this.f3205v = acVarA;
        this.f3206w = akVar;
        this.f3208y = aVar;
        this.f3209z = null;
        as asVar = new as(contextA, ai.a(), w.a(), acVarA, aVar);
        this.f3202s = asVar;
        aa aaVarA = aa.a(contextA);
        this.f3203t = new av(contextA, asVar, acVarA, aaVarA);
        NativeCrashHandler nativeCrashHandler = NativeCrashHandler.getInstance(contextA, aaVarA, asVar, acVarA, akVar, z10, null);
        this.f3204u = nativeCrashHandler;
        aaVarA.N = nativeCrashHandler;
        if (ay.f3240f == null) {
            ay.f3240f = new ay(contextA, acVarA, aaVarA, akVar, asVar);
        }
        this.f3207x = ay.f3240f;
    }

    public static synchronized at a() {
        return D;
    }

    public static synchronized at a(Context context, boolean z10, BuglyStrategy.a aVar) {
        try {
            if (D == null) {
                D = new at(context, ak.a(), z10, aVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return D;
    }

    public final void a(long j5) {
        ak.a().a(new j0(0, this), j5);
    }

    public final void a(CrashDetailBean crashDetailBean) {
        this.f3202s.b(crashDetailBean);
    }

    public final synchronized void a(boolean z10, boolean z11, boolean z12) {
        this.f3204u.testNativeCrash(z10, z11, z12);
    }

    public final synchronized void b() {
        this.f3203t.a();
        e();
        f();
    }

    public final synchronized void c() {
        this.f3203t.b();
        d();
        g();
    }

    public final void d() {
        this.f3204u.setUserOpened(false);
    }

    public final void e() {
        this.f3204u.setUserOpened(true);
    }

    public final void f() {
        new Handler(Looper.getMainLooper()).post(new i0(0));
        this.f3207x.b(true);
    }

    public final void g() {
        new Handler(Looper.getMainLooper()).post(new i0(1));
        this.f3207x.b(false);
    }

    public final synchronized void h() {
        int i7 = 0;
        while (true) {
            int i10 = i7 + 1;
            if (i7 < 30) {
                try {
                    al.a("try main sleep for make a test anr! try:%d/30 , kill it if you don't want to wait!", Integer.valueOf(i10));
                    ap.b(5000L);
                    i7 = i10;
                } catch (Throwable th) {
                    if (al.a(th)) {
                        return;
                    }
                    th.printStackTrace();
                    return;
                }
            }
        }
    }

    public final boolean i() {
        return this.f3207x.f3241a.get();
    }

    public final boolean j() {
        return (this.B & 16) > 0;
    }

    public final boolean k() {
        return (this.B & 8) > 0;
    }
}
