package com.tencent.bugly.proguard;

import android.app.ActivityManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Debug;
import android.os.Environment;
import android.os.Process;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class ab {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ArrayList<b0> f3076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map<Integer, String> f3077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f3078c;

    static {
        c cVar = new c();
        cVar.add(new b0(10));
        cVar.add(new b0(4));
        cVar.add(new b0(5));
        cVar.add(new b0(11));
        cVar.add(new b0(6));
        cVar.add(new b0(7));
        cVar.add(new b0(9));
        cVar.add(new b0(3));
        cVar.add(new b0(8));
        cVar.add(new b0(0));
        cVar.add(new b0(2));
        cVar.add(new b0(1));
        f3076a = cVar;
        a0 a0Var = new a0();
        a0Var.put(1, "GPRS");
        a0Var.put(2, "EDGE");
        a0Var.put(3, "UMTS");
        a0Var.put(8, "HSDPA");
        a0Var.put(9, "HSUPA");
        a0Var.put(10, "HSPA");
        a0Var.put(4, "CDMA");
        a0Var.put(5, "EVDO_0");
        a0Var.put(6, "EVDO_A");
        a0Var.put(7, "1xRTT");
        a0Var.put(11, "iDen");
        a0Var.put(12, "EVDO_B");
        a0Var.put(13, "LTE");
        a0Var.put(14, "eHRPD");
        a0Var.put(15, "HSPA+");
        f3077b = a0Var;
        f3078c = new String[]{"/su", "/su/bin/su", "/sbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/data/local/su", "/system/xbin/su", "/system/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/system/bin/cufsdosck", "/system/xbin/cufsdosck", "/system/bin/cufsmgr", "/system/xbin/cufsmgr", "/system/bin/cufaevdd", "/system/xbin/cufaevdd", "/system/bin/conbb", "/system/xbin/conbb"};
    }

    public static String a() {
        try {
            return Build.MODEL;
        } catch (Throwable th) {
            if (al.a(th)) {
                return "fail";
            }
            th.printStackTrace();
            return "fail";
        }
    }

    public static String a(Context context) {
        if (context == null || context.getApplicationInfo() == null) {
            return "fail";
        }
        String str = context.getApplicationInfo().nativeLibraryDir;
        if (TextUtils.isEmpty(str)) {
            return "fail";
        }
        if (str.endsWith("arm")) {
            return "armeabi-v7a";
        }
        if (str.endsWith("arm64")) {
            return "arm64-v8a";
        }
        if (str.endsWith("x86")) {
            return "x86";
        }
        return str.endsWith("x86_64") ? "x86_64" : "fail";
    }

    public static long b(Context context) {
        long pss;
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager == null) {
                return 0L;
            }
            pss = activityManager.getProcessMemoryInfo(new int[]{Process.myPid()})[0].getTotalPss();
        } catch (Throwable unused) {
            pss = Debug.getPss();
        }
        return pss * 1024;
    }

    public static String b() {
        try {
            return Build.VERSION.RELEASE;
        } catch (Throwable th) {
            if (al.a(th)) {
                return "fail";
            }
            th.printStackTrace();
            return "fail";
        }
    }

    public static int c() {
        try {
            return Build.VERSION.SDK_INT;
        } catch (Throwable th) {
            if (al.a(th)) {
                return -1;
            }
            th.printStackTrace();
            return -1;
        }
    }

    public static String c(Context context) {
        TelephonyManager telephonyManager;
        String str = "unknown";
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return null;
            }
            if (activeNetworkInfo.getType() == 1) {
                return "WIFI";
            }
            if (activeNetworkInfo.getType() != 0 || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null) {
                return "unknown";
            }
            int networkType = telephonyManager.getNetworkType();
            String str2 = f3077b.get(Integer.valueOf(networkType));
            if (str2 != null) {
                return str2;
            }
            try {
                return "MOBILE(" + networkType + ")";
            } catch (Exception e7) {
                e = e7;
                str = str2;
            }
        } catch (Exception e10) {
            e = e10;
        }
        if (!al.a(e)) {
            e.printStackTrace();
        }
        return str;
    }

    public static String d() {
        try {
            return String.valueOf(System.getProperty("os.arch"));
        } catch (Throwable th) {
            if (al.a(th)) {
                return "fail";
            }
            th.printStackTrace();
            return "fail";
        }
    }

    public static long e() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            return ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        } catch (Throwable th) {
            if (al.a(th)) {
                return -1L;
            }
            th.printStackTrace();
            return -1L;
        }
    }

    public static long f() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            return ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
        } catch (Throwable th) {
            if (al.a(th)) {
                return -1L;
            }
            th.printStackTrace();
            return -1L;
        }
    }

    public static long g() {
        BufferedReader bufferedReader;
        Throwable th;
        long j5 = 0;
        try {
            bufferedReader = new BufferedReader(new FileReader("/proc/self/status"));
            try {
                for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                    if (line.startsWith("VmSize")) {
                        j5 = Long.parseLong(line.replaceAll("[^\\d]", ""));
                        break;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                try {
                    al.a(th);
                    if (bufferedReader != null) {
                        break;
                    }
                    return j5 * 1024;
                } finally {
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable th3) {
                            th3.printStackTrace();
                        }
                    }
                }
            }
        } catch (Throwable th4) {
            bufferedReader = null;
            th = th4;
        }
        return j5 * 1024;
    }

    public static long h() {
        return Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
    }

    public static long i() {
        FileReader fileReader;
        Throwable th;
        BufferedReader bufferedReader;
        try {
            fileReader = new FileReader("/proc/meminfo");
            try {
                bufferedReader = new BufferedReader(fileReader, 2048);
                try {
                    String line = bufferedReader.readLine();
                    if (line != null) {
                        long j5 = Long.parseLong(line.split(":\\s+", 2)[1].toLowerCase().replace("kb", "").trim()) * 1024;
                        try {
                            bufferedReader.close();
                        } catch (IOException e7) {
                            if (!al.a(e7)) {
                                e7.printStackTrace();
                            }
                        }
                        try {
                            fileReader.close();
                        } catch (IOException e10) {
                            if (!al.a(e10)) {
                                e10.printStackTrace();
                            }
                        }
                        return j5;
                    }
                    try {
                        bufferedReader.close();
                    } catch (IOException e11) {
                        if (!al.a(e11)) {
                            e11.printStackTrace();
                        }
                    }
                    try {
                        fileReader.close();
                        return -1L;
                    } catch (IOException e12) {
                        if (al.a(e12)) {
                            return -1L;
                        }
                        e12.printStackTrace();
                        return -1L;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        if (!al.a(th)) {
                            th.printStackTrace();
                        }
                        if (fileReader == null) {
                            return -2L;
                        }
                        try {
                            return -2L;
                        } catch (IOException e13) {
                        }
                    } finally {
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException e14) {
                                if (!al.a(e14)) {
                                    e14.printStackTrace();
                                }
                            }
                        }
                        if (fileReader != null) {
                            try {
                                fileReader.close();
                            } catch (IOException e15) {
                                if (!al.a(e15)) {
                                    e15.printStackTrace();
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                bufferedReader = null;
            }
        } catch (Throwable th4) {
            fileReader = null;
            th = th4;
            bufferedReader = null;
        }
    }

    public static long j() {
        FileReader fileReader;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader("/proc/meminfo");
            try {
                BufferedReader bufferedReader2 = new BufferedReader(fileReader, 2048);
                try {
                    bufferedReader2.readLine();
                    String line = bufferedReader2.readLine();
                    if (line == null) {
                        try {
                            bufferedReader2.close();
                        } catch (IOException e7) {
                            if (!al.a(e7)) {
                                e7.printStackTrace();
                            }
                        }
                        try {
                            fileReader.close();
                        } catch (IOException e10) {
                            if (!al.a(e10)) {
                                e10.printStackTrace();
                            }
                        }
                        return -1L;
                    }
                    long j5 = Long.parseLong(line.split(":\\s+", 2)[1].toLowerCase().replace("kb", "").trim()) * 1024;
                    String line2 = bufferedReader2.readLine();
                    if (line2 == null) {
                        try {
                            bufferedReader2.close();
                        } catch (IOException e11) {
                            if (!al.a(e11)) {
                                e11.printStackTrace();
                            }
                        }
                        try {
                            fileReader.close();
                        } catch (IOException e12) {
                            if (!al.a(e12)) {
                                e12.printStackTrace();
                            }
                        }
                        return -1L;
                    }
                    long j10 = Long.parseLong(line2.split(":\\s+", 2)[1].toLowerCase().replace("kb", "").trim());
                    Long.signum(j10);
                    long j11 = (j10 * 1024) + j5;
                    String line3 = bufferedReader2.readLine();
                    if (line3 == null) {
                        try {
                            bufferedReader2.close();
                        } catch (IOException e13) {
                            if (!al.a(e13)) {
                                e13.printStackTrace();
                            }
                        }
                        try {
                            fileReader.close();
                        } catch (IOException e14) {
                            if (!al.a(e14)) {
                                e14.printStackTrace();
                            }
                        }
                        return -1L;
                    }
                    long j12 = (Long.parseLong(line3.split(":\\s+", 2)[1].toLowerCase().replace("kb", "").trim()) * 1024) + j11;
                    try {
                        bufferedReader2.close();
                    } catch (IOException e15) {
                        if (!al.a(e15)) {
                            e15.printStackTrace();
                        }
                    }
                    try {
                        fileReader.close();
                    } catch (IOException e16) {
                        if (!al.a(e16)) {
                            e16.printStackTrace();
                        }
                    }
                    return j12;
                } catch (Throwable th) {
                    th = th;
                    bufferedReader = bufferedReader2;
                    try {
                        if (!al.a(th)) {
                            th.printStackTrace();
                        }
                        if (fileReader == null) {
                            return -2L;
                        }
                        try {
                            return -2L;
                        } catch (IOException e17) {
                        }
                    } finally {
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException e18) {
                                if (!al.a(e18)) {
                                    e18.printStackTrace();
                                }
                            }
                        }
                        if (fileReader != null) {
                            try {
                                fileReader.close();
                            } catch (IOException e19) {
                                if (!al.a(e19)) {
                                    e19.printStackTrace();
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            fileReader = null;
        }
    }

    public static long k() {
        if (!s()) {
            return 0L;
        }
        try {
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            return ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        } catch (Throwable th) {
            if (al.a(th)) {
                return -2L;
            }
            th.printStackTrace();
            return -2L;
        }
    }

    public static long l() {
        if (!s()) {
            return 0L;
        }
        try {
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            return ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
        } catch (Throwable th) {
            if (al.a(th)) {
                return -2L;
            }
            th.printStackTrace();
            return -2L;
        }
    }

    public static String m() {
        return "";
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0049  */
    public static String n() {
        String strConcat;
        Iterator<b0> it = f3076a.iterator();
        while (it.hasNext()) {
            switch (it.next().f3254a) {
                case 0:
                    String strA = ap.a("ro.gn.gnromvernumber");
                    if (ap.b(strA) || strA.equals("fail")) {
                        strConcat = null;
                    } else {
                        strConcat = "amigo/" + strA + "/" + ap.a("ro.build.display.id");
                    }
                    break;
                case 1:
                    strConcat = ap.a("ro.build.fingerprint") + "/" + ap.a("ro.build.rom.id");
                    break;
                case 2:
                    String strA2 = ap.a("ro.build.tyd.kbstyle_version");
                    if (ap.b(strA2) || strA2.equals("fail")) {
                        strConcat = null;
                    } else {
                        strConcat = "dido/".concat(strA2);
                    }
                    break;
                case 3:
                    String strA3 = ap.a("ro.aa.romver");
                    if (ap.b(strA3) || strA3.equals("fail")) {
                        strConcat = null;
                    } else {
                        strConcat = "htc/" + strA3 + "/" + ap.a("ro.build.description");
                    }
                    break;
                case 4:
                    String strA4 = ap.a("ro.build.version.emui");
                    if (ap.b(strA4) || strA4.equals("fail")) {
                        strConcat = null;
                    } else {
                        strConcat = "HuaWei/EMOTION/".concat(strA4);
                    }
                    break;
                case 5:
                    String strA5 = ap.a("ro.lenovo.series");
                    if (ap.b(strA5) || strA5.equals("fail")) {
                        strConcat = null;
                    } else {
                        strConcat = "Lenovo/VIBE/".concat(String.valueOf(ap.a("ro.build.version.incremental")));
                    }
                    break;
                case 6:
                    String strA6 = ap.a("ro.meizu.product.model");
                    if (ap.b(strA6) || strA6.equals("fail")) {
                        strConcat = null;
                    } else {
                        strConcat = "Meizu/FLYME/" + ap.a("ro.build.display.id");
                    }
                    break;
                case 7:
                    String strA7 = ap.a("ro.build.version.opporom");
                    if (ap.b(strA7) || strA7.equals("fail")) {
                        strConcat = null;
                    } else {
                        strConcat = "Oppo/COLOROS/".concat(strA7);
                    }
                    break;
                case 8:
                    String strA8 = ap.a("ro.lewa.version");
                    if (ap.b(strA8) || strA8.equals("fail")) {
                        strConcat = null;
                    } else {
                        strConcat = "tcl/" + strA8 + "/" + ap.a("ro.build.display.id");
                    }
                    break;
                case 9:
                    String strA9 = ap.a("ro.vivo.os.build.display.id");
                    if (ap.b(strA9) || strA9.equals("fail")) {
                        strConcat = null;
                    } else {
                        strConcat = "vivo/FUNTOUCH/".concat(strA9);
                    }
                    break;
                case 10:
                    String strA10 = ap.a("ro.miui.ui.version.name");
                    if (ap.b(strA10) || strA10.equals("fail")) {
                        strConcat = null;
                    } else {
                        strConcat = "XiaoMi/MIUI/".concat(strA10);
                    }
                    break;
                default:
                    String strA11 = ap.a("ro.build.nubia.rom.name");
                    if (ap.b(strA11) || strA11.equals("fail")) {
                        strConcat = null;
                    } else {
                        strConcat = "Zte/NUBIA/" + strA11 + "_" + ap.a("ro.build.nubia.rom.code");
                    }
                    break;
            }
            if (!TextUtils.isEmpty(strConcat)) {
                return strConcat;
            }
        }
        return null;
    }

    public static boolean o() {
        String strA = ap.a("ro.build.version.opporom");
        return !TextUtils.isEmpty((ap.b(strA) || strA.equals("fail")) ? null : "Oppo/COLOROS/".concat(strA));
    }

    public static boolean p() {
        String strA = ap.a("ro.vivo.os.build.display.id");
        return !TextUtils.isEmpty((ap.b(strA) || strA.equals("fail")) ? null : "vivo/FUNTOUCH/".concat(strA));
    }

    public static boolean q() {
        boolean z10;
        String[] strArr = f3078c;
        int length = strArr.length;
        int i7 = 0;
        while (true) {
            if (i7 >= length) {
                z10 = false;
                break;
            }
            if (new File(strArr[i7]).exists()) {
                z10 = true;
                break;
            }
            i7++;
        }
        String str = Build.TAGS;
        return (str != null && str.contains("test-keys")) || z10;
    }

    public static boolean r() {
        float fMaxMemory = (float) ((Runtime.getRuntime().maxMemory() * 1.0d) / 1048576.0d);
        float f10 = (float) ((Runtime.getRuntime().totalMemory() * 1.0d) / 1048576.0d);
        float f11 = fMaxMemory - f10;
        al.c("maxMemory : %f", Float.valueOf(fMaxMemory));
        al.c("totalMemory : %f", Float.valueOf(f10));
        al.c("freeMemory : %f", Float.valueOf(f11));
        return f11 < 10.0f;
    }

    private static boolean s() {
        try {
            return Environment.getExternalStorageState().equals("mounted");
        } catch (Throwable th) {
            if (al.a(th)) {
                return false;
            }
            th.printStackTrace();
            return false;
        }
    }
}
