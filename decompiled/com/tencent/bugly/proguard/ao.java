package com.tencent.bugly.proguard;

import android.content.Context;
import android.os.Process;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class ao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f3141a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f3142b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static SimpleDateFormat f3143c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f3144d = 30720;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static StringBuilder f3145e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static StringBuilder f3146f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static boolean f3147g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static a f3148h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static String f3149i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static String f3150j = null;
    private static Context k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static String f3151l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static boolean f3152m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static boolean f3153n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static ExecutorService f3154o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static int f3155p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final Object f3156q = new Object();

    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f3157a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        File f3158b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f3159c = 30720;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f3160d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f3161e;

        public a(String str) {
            if (str == null || str.equals("")) {
                return;
            }
            this.f3160d = str;
            this.f3157a = a();
        }

        public final boolean a() {
            try {
                File file = new File(this.f3160d);
                this.f3158b = file;
                if (file.exists() && !this.f3158b.delete()) {
                    this.f3157a = false;
                    return false;
                }
                if (this.f3158b.createNewFile()) {
                    return true;
                }
                this.f3157a = false;
                return false;
            } catch (Throwable th) {
                al.a(th);
                this.f3157a = false;
                return false;
            }
        }

        public final boolean a(String str) {
            if (!this.f3157a) {
                return false;
            }
            FileOutputStream fileOutputStream = null;
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(this.f3158b, true);
                try {
                    byte[] bytes = str.getBytes("UTF-8");
                    fileOutputStream2.write(bytes);
                    fileOutputStream2.flush();
                    fileOutputStream2.close();
                    this.f3161e += (long) bytes.length;
                    this.f3157a = true;
                    try {
                        fileOutputStream2.close();
                    } catch (IOException unused) {
                    }
                    return true;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    try {
                        al.a(th);
                        this.f3157a = false;
                        return false;
                    } finally {
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    static {
        try {
            f3143c = new SimpleDateFormat("MM-dd HH:mm:ss");
        } catch (Throwable th) {
            al.b(th.getCause());
        }
    }

    private static String a(String str, String str2, String str3, long j5) {
        f3145e.setLength(0);
        if (str3.length() > 30720) {
            str3 = str3.substring(str3.length() - 30720, str3.length() - 1);
        }
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = f3143c;
        String string = simpleDateFormat != null ? simpleDateFormat.format(date) : date.toString();
        StringBuilder sb2 = f3145e;
        sb2.append(string);
        sb2.append(" ");
        sb2.append(f3155p);
        sb2.append(" ");
        sb2.append(j5);
        sb2.append(" ");
        sb2.append(str);
        sb2.append(" ");
        sb2.append(str2);
        sb2.append(": ");
        sb2.append(str3);
        sb2.append("\u0001\r\n");
        return f3145e.toString();
    }

    public static void a(int i7) {
        synchronized (f3156q) {
            try {
                f3144d = i7;
                if (i7 < 0) {
                    f3144d = 0;
                } else if (i7 > 30720) {
                    f3144d = 30720;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized void a(Context context) {
        if (f3152m || context == null || !f3142b) {
            return;
        }
        try {
            f3154o = Executors.newSingleThreadExecutor();
            f3146f = new StringBuilder(0);
            f3145e = new StringBuilder(0);
            k = context;
            f3149i = aa.a(context).f3054d;
            f3150j = "";
            f3151l = k.getFilesDir().getPath() + "/buglylog_" + f3149i + "_" + f3150j + ".txt";
            f3155p = Process.myPid();
        } catch (Throwable unused) {
        }
        f3152m = true;
    }

    public static synchronized void a(String str, String str2, String str3) {
        if (f3152m && f3142b) {
            try {
                if (f3153n) {
                    f3154o.execute(new e0(0, str, str2, str3));
                } else {
                    f3154o.execute(new e0(1, str, str2, str3));
                }
            } catch (Exception e7) {
                al.b(e7);
            }
        }
    }

    public static void a(String str, String str2, Throwable th) {
        if (th == null) {
            return;
        }
        String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        a(str, str2, message + '\n' + ap.b(th));
    }

    public static byte[] a() {
        if (!f3141a) {
            return c();
        }
        if (f3142b) {
            return ap.a(f3146f.toString(), "BuglyLog.txt");
        }
        return null;
    }

    private static String b() {
        q qVar;
        try {
            aa aaVarB = aa.b();
            if (aaVarB == null || (qVar = aaVarB.N) == null) {
                return null;
            }
            return qVar.getLogFromNative();
        } catch (Throwable th) {
            if (al.a(th)) {
                return null;
            }
            th.printStackTrace();
            return null;
        }
    }

    private static byte[] c() {
        File file;
        if (!f3142b) {
            return null;
        }
        if (f3153n) {
            al.a("[LogUtil] Get user log from native.", new Object[0]);
            String strB = b();
            if (strB != null) {
                al.a("[LogUtil] Got user log from native: %d bytes", Integer.valueOf(strB.length()));
                return ap.a(strB, "BuglyNativeLog.txt");
            }
        }
        StringBuilder sb2 = new StringBuilder();
        synchronized (f3156q) {
            try {
                a aVar = f3148h;
                if (aVar != null && aVar.f3157a && (file = aVar.f3158b) != null && file.length() > 0) {
                    sb2.append(ap.a(f3148h.f3158b, 30720, true));
                }
                StringBuilder sb3 = f3146f;
                if (sb3 != null && sb3.length() > 0) {
                    sb2.append(f3146f.toString());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return ap.a(sb2.toString(), "BuglyLog.txt");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean d(String str, String str2, String str3) {
        q qVar;
        try {
            aa aaVarB = aa.b();
            if (aaVarB == null || (qVar = aaVarB.N) == null) {
                return false;
            }
            return qVar.appendLogToNative(str, str2, str3);
        } catch (Throwable th) {
            if (al.a(th)) {
                return false;
            }
            th.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void e(String str, String str2, String str3) {
        if (f3141a) {
            f(str, str2, str3);
        } else {
            g(str, str2, str3);
        }
    }

    private static synchronized void f(String str, String str2, String str3) {
        String strA = a(str, str2, str3, Process.myTid());
        synchronized (f3156q) {
            try {
                f3146f.append(strA);
                if (f3146f.length() >= f3144d) {
                    StringBuilder sb2 = f3146f;
                    f3146f = sb2.delete(0, sb2.indexOf("\u0001\r\n") + 1);
                }
            } catch (Throwable th) {
                try {
                    if (!al.b(th)) {
                        th.printStackTrace();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    private static synchronized void g(String str, String str2, String str3) {
        String strA = a(str, str2, str3, Process.myTid());
        try {
            synchronized (f3156q) {
                try {
                    f3146f.append(strA);
                    if (f3146f.length() <= f3144d) {
                        return;
                    }
                    if (f3147g) {
                        return;
                    }
                    f3147g = true;
                    a aVar = f3148h;
                    if (aVar == null) {
                        f3148h = new a(f3151l);
                    } else {
                        File file = aVar.f3158b;
                        if (file == null || file.length() + ((long) f3146f.length()) > f3148h.f3159c) {
                            f3148h.a();
                        }
                    }
                    if (f3148h.a(f3146f.toString())) {
                        f3146f.setLength(0);
                        f3147g = false;
                    }
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
