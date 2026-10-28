package com.tencent.bugly.proguard;

import android.util.Log;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class al {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f3137a = "CrashReportInfo";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f3138b = "CrashReport";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f3139c = false;

    private static boolean a(int i7, String str, Object... objArr) {
        if (!f3139c) {
            return false;
        }
        if (str == null) {
            str = "null";
        } else if (objArr != null && objArr.length != 0) {
            str = String.format(Locale.US, str, objArr);
        }
        if (i7 == 0) {
            Log.i(f3138b, str);
            return true;
        }
        if (i7 == 1) {
            Log.d(f3138b, str);
            return true;
        }
        if (i7 == 2) {
            Log.w(f3138b, str);
            return true;
        }
        if (i7 == 3) {
            Log.e(f3138b, str);
            return true;
        }
        if (i7 != 5) {
            return false;
        }
        Log.i(f3137a, str);
        return true;
    }

    private static boolean a(int i7, Throwable th) {
        if (f3139c) {
            return a(i7, ap.a(th), new Object[0]);
        }
        return false;
    }

    public static boolean a(Class cls, String str, Object... objArr) {
        Locale locale = Locale.US;
        return a(0, "[" + cls.getSimpleName() + "] " + str, objArr);
    }

    public static boolean a(String str, Object... objArr) {
        return a(0, str, objArr);
    }

    public static boolean a(Throwable th) {
        return a(2, th);
    }

    public static boolean b(String str, Object... objArr) {
        return a(5, str, objArr);
    }

    public static boolean b(Throwable th) {
        return a(3, th);
    }

    public static boolean c(String str, Object... objArr) {
        return a(1, str, objArr);
    }

    public static boolean d(String str, Object... objArr) {
        return a(2, str, objArr);
    }

    public static boolean e(String str, Object... objArr) {
        return a(3, str, objArr);
    }
}
