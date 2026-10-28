package com.tencent.bugly.crashreport;

import android.util.Log;
import com.tencent.bugly.proguard.ao;
import com.tencent.bugly.proguard.p;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class BuglyLog {
    public static void d(String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "null";
        }
        if (p.f3465c) {
            Log.d(str, str2);
        }
        ao.a("D", str, str2);
    }

    public static void e(String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "null";
        }
        if (p.f3465c) {
            Log.e(str, str2);
        }
        ao.a("E", str, str2);
    }

    public static void e(String str, String str2, Throwable th) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "null";
        }
        if (p.f3465c) {
            Log.e(str, str2, th);
        }
        ao.a("E", str, th);
    }

    public static void i(String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "null";
        }
        if (p.f3465c) {
            Log.i(str, str2);
        }
        ao.a("I", str, str2);
    }

    public static void setCache(int i7) {
        ao.a(i7);
    }

    public static void v(String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "null";
        }
        if (p.f3465c) {
            Log.v(str, str2);
        }
        ao.a("V", str, str2);
    }

    public static void w(String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "null";
        }
        if (p.f3465c) {
            Log.w(str, str2);
        }
        ao.a("W", str, str2);
    }
}
