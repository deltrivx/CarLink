package com.tencent.bugly.proguard;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.bugly.crashreport.crash.CrashDetailBean;
import com.tencent.bugly.crashreport.crash.jni.NativeExceptionHandler;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class be {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static List<File> f3276a = new ArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v3, types: [boolean] */
    public static CrashDetailBean a(Context context, String str, NativeExceptionHandler nativeExceptionHandler) throws Throwable {
        BufferedInputStream bufferedInputStream;
        String str2;
        String strA;
        BufferedInputStream bufferedInputStream2 = 0;
        if (context == null || str == null || nativeExceptionHandler == null) {
            al.e("get eup record file args error", new Object[0]);
            return null;
        }
        File file = new File(str, "rqd_record.eup");
        if (file.exists()) {
            ?? CanRead = file.canRead();
            try {
                if (CanRead != 0) {
                    try {
                        bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                        try {
                            String strA2 = a(bufferedInputStream);
                            if (strA2 != null && strA2.equals("NATIVE_RQD_REPORT")) {
                                HashMap map = new HashMap();
                                loop0: while (true) {
                                    str2 = null;
                                    while (true) {
                                        strA = a(bufferedInputStream);
                                        if (strA == null) {
                                            break loop0;
                                        }
                                        if (str2 == null) {
                                            str2 = strA;
                                        }
                                    }
                                    map.put(str2, strA);
                                }
                                if (str2 != null) {
                                    al.e("record not pair! drop! %s", str2);
                                    try {
                                        bufferedInputStream.close();
                                    } catch (IOException e7) {
                                        e7.printStackTrace();
                                    }
                                    return null;
                                }
                                CrashDetailBean crashDetailBeanA = a(context, map, nativeExceptionHandler);
                                try {
                                    bufferedInputStream.close();
                                    return crashDetailBeanA;
                                } catch (IOException e10) {
                                    e10.printStackTrace();
                                    return crashDetailBeanA;
                                }
                            }
                            al.e("record read fail! %s", strA2);
                            try {
                                bufferedInputStream.close();
                            } catch (IOException e11) {
                                e11.printStackTrace();
                            }
                            return null;
                        } catch (IOException e12) {
                            e = e12;
                            e.printStackTrace();
                            if (bufferedInputStream != null) {
                                try {
                                    bufferedInputStream.close();
                                } catch (IOException e13) {
                                    e13.printStackTrace();
                                }
                            }
                            return null;
                        }
                    } catch (IOException e14) {
                        e = e14;
                        bufferedInputStream = null;
                    } catch (Throwable th) {
                        th = th;
                        if (bufferedInputStream2 != 0) {
                            try {
                                bufferedInputStream2.close();
                            } catch (IOException e15) {
                                e15.printStackTrace();
                            }
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedInputStream2 = CanRead;
            }
        }
        return null;
    }

    private static CrashDetailBean a(Context context, Map<String, String> map, NativeExceptionHandler nativeExceptionHandler) {
        boolean zEqualsIgnoreCase;
        if (aa.a(context) == null) {
            al.e("abnormal com info not created", new Object[0]);
        } else {
            String str = map.get("intStateStr");
            if (str != null && str.trim().length() > 0) {
                Map<String, Integer> mapD = d(map.get("intStateStr"));
                if (mapD == null) {
                    al.e("parse intSateMap fail", Integer.valueOf(map.size()));
                    return null;
                }
                try {
                    mapD.get("sino").getClass();
                    mapD.get("sud").getClass();
                    String str2 = map.get("soVersion");
                    if (TextUtils.isEmpty(str2)) {
                        al.e("error format at version", new Object[0]);
                        return null;
                    }
                    String str3 = (String) a(map, "codeMsg", "unknown");
                    String str4 = (String) a(map, "signalName", "unknown");
                    map.get("errnoMsg");
                    String str5 = (String) a(map, "stack", "unknown");
                    String str6 = map.get("jstack");
                    if (str6 != null) {
                        str5 = str5 + "java:\n" + str6;
                    }
                    Integer num = mapD.get("sico");
                    if (num != null && num.intValue() > 0) {
                        str4 = str4 + "(" + str3 + ")";
                        str3 = "KERNEL";
                    }
                    String str7 = str3;
                    String str8 = str4;
                    String str9 = map.get("nativeLog");
                    byte[] bArrA = (str9 == null || str9.isEmpty()) ? null : ap.a(str9, "BuglyNativeLog.txt");
                    String str10 = (String) a(map, "sendingProcess", "unknown");
                    Integer num2 = mapD.get("spd");
                    if (num2 != null) {
                        str10 = str10 + "(" + num2 + ")";
                    }
                    String str11 = str10;
                    String str12 = (String) a(map, "threadName", "unknown");
                    Integer num3 = mapD.get("et");
                    if (num3 != null) {
                        str12 = str12 + "(" + num3 + ")";
                    }
                    String str13 = str12;
                    String str14 = (String) a(map, "processName", "unknown");
                    Integer num4 = mapD.get("ep");
                    if (num4 != null) {
                        str14 = str14 + "(" + num4 + ")";
                    }
                    CrashDetailBean crashDetailBeanPackageCrashDatas = nativeExceptionHandler.packageCrashDatas(str14, str13, (((long) mapD.get("ets").intValue()) * 1000) + (((long) mapD.get("etms").intValue()) / 1000), str8, (String) a(map, "errorAddr", "unknown"), a(str5), str7, str11, (String) a(map, "tombPath", "unknown"), map.get("sysLogPath"), map.get("jniLogPath"), str2, bArrA, a(map), false, false);
                    if (crashDetailBeanPackageCrashDatas != null) {
                        String str15 = (String) a(map, "userId", crashDetailBeanPackageCrashDatas.f3006m);
                        crashDetailBeanPackageCrashDatas.f3006m = str15;
                        al.c("[Native record info] userId: %s", str15);
                        String str16 = (String) a(map, "sysLog", crashDetailBeanPackageCrashDatas.f3016w);
                        crashDetailBeanPackageCrashDatas.f3016w = str16;
                        String str17 = (String) a(map, "appVersion", str16);
                        crashDetailBeanPackageCrashDatas.f3000f = str17;
                        al.c("[Native record info] appVersion: %s", str17);
                        String str18 = map.get("isAppForeground");
                        if (str18 != null) {
                            al.c("[Native record info] isAppForeground: %s", str18);
                            zEqualsIgnoreCase = str18.equalsIgnoreCase("true");
                        } else {
                            zEqualsIgnoreCase = false;
                        }
                        crashDetailBeanPackageCrashDatas.R = zEqualsIgnoreCase;
                        crashDetailBeanPackageCrashDatas.Q = b(map);
                        crashDetailBeanPackageCrashDatas.f3019z = null;
                        crashDetailBeanPackageCrashDatas.k = true;
                    }
                    return crashDetailBeanPackageCrashDatas;
                } catch (Throwable th) {
                    al.e("error format", new Object[0]);
                    th.printStackTrace();
                    return null;
                }
            }
            al.e("no intStateStr", new Object[0]);
        }
        return null;
    }

    private static <KeyT, ValueT> ValueT a(Map<KeyT, ValueT> map, KeyT keyt, ValueT valuet) {
        try {
            ValueT valuet2 = map.get(keyt);
            return valuet2 != null ? valuet2 : valuet;
        } catch (Exception e7) {
            al.a(e7);
            return valuet;
        }
    }

    private static String a(BufferedInputStream bufferedInputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream(1024);
            while (true) {
                try {
                    int i7 = bufferedInputStream.read();
                    if (i7 == -1) {
                        break;
                    }
                    if (i7 == 0) {
                        String str = new String(byteArrayOutputStream.toByteArray(), "UTf-8");
                        byteArrayOutputStream.close();
                        return str;
                    }
                    byteArrayOutputStream.write(i7);
                } catch (Throwable th) {
                    th = th;
                    try {
                        al.a(th);
                        if (byteArrayOutputStream != null) {
                            break;
                        }
                        return null;
                    } finally {
                        if (byteArrayOutputStream != null) {
                            byteArrayOutputStream.close();
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
            byteArrayOutputStream = null;
        }
        return null;
    }

    public static String a(String str) {
        if (str == null) {
            return "";
        }
        String[] strArrSplit = str.split("\n");
        if (strArrSplit == null || strArrSplit.length == 0) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : strArrSplit) {
            if (!str2.contains("java.lang.Thread.getStackTrace(")) {
                sb2.append(str2);
                sb2.append("\n");
            }
        }
        return sb2.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v7 */
    public static String a(String str, int i7, String str2, boolean z10) {
        BufferedReader bufferedReader = null;
        if (str != null && i7 > 0) {
            File file = new File(str);
            if (file.exists() && file.canRead()) {
                al.a("Read system log from native record file(length: %s bytes): %s", Long.valueOf(file.length()), file.getAbsolutePath());
                f3276a.add(file);
                al.c("Add this record file to list for cleaning lastly.", new Object[0]);
                if (str2 == null) {
                    return ap.a(new File(str), i7, z10);
                }
                String sb2 = new StringBuilder();
                try {
                    try {
                        BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new FileInputStream(file), "utf-8"));
                        while (true) {
                            try {
                                String line = bufferedReader2.readLine();
                                if (line == null) {
                                    break;
                                }
                                if (Pattern.compile(str2 + "[ ]*:").matcher(line).find()) {
                                    sb2.append(line);
                                    sb2.append("\n");
                                }
                                if (i7 > 0 && sb2.length() > i7) {
                                    if (z10) {
                                        sb2.delete(i7, sb2.length());
                                        break;
                                    }
                                    sb2.delete(0, sb2.length() - i7);
                                }
                            } catch (Throwable th) {
                                th = th;
                                bufferedReader = bufferedReader2;
                                try {
                                    al.a(th);
                                    sb2.append("\n[error:" + th.toString() + "]");
                                    sb2 = sb2.toString();
                                    if (bufferedReader != null) {
                                        bufferedReader.close();
                                        sb2 = sb2;
                                    }
                                    return sb2;
                                } catch (Throwable th2) {
                                    if (bufferedReader != null) {
                                        try {
                                            bufferedReader.close();
                                        } catch (Exception e7) {
                                            al.a(e7);
                                        }
                                    }
                                    throw th2;
                                }
                            }
                        }
                        String string = sb2.toString();
                        bufferedReader2.close();
                        sb2 = string;
                    } catch (Exception e10) {
                        al.a(e10);
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
                return sb2;
            }
        }
        return null;
    }

    public static String a(String str, String str2) {
        if (str == null || str2 == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        String strB = b(str, str2);
        if (strB != null && !strB.isEmpty()) {
            sb2.append("Register infos:\n");
            sb2.append(strB);
        }
        String strC = c(str, str2);
        if (strC != null && !strC.isEmpty()) {
            if (sb2.length() > 0) {
                sb2.append("\n");
            }
            sb2.append("System SO infos:\n");
            sb2.append(strC);
        }
        return sb2.toString();
    }

    private static Map<String, String> a(Map<String, String> map) {
        String str = map.get("key-value");
        if (str == null) {
            return null;
        }
        HashMap map2 = new HashMap();
        for (String str2 : str.split("\n")) {
            String[] strArrSplit = str2.split("=");
            if (strArrSplit.length == 2) {
                map2.put(strArrSplit[0], strArrSplit[1]);
            }
        }
        return map2;
    }

    public static void a(boolean z10, String str) {
        if (str != null) {
            f3276a.add(new File(str, "rqd_record.eup"));
            f3276a.add(new File(str, "reg_record.txt"));
            f3276a.add(new File(str, "map_record.txt"));
            f3276a.add(new File(str, "backup_record.txt"));
            if (z10) {
                c(str);
            }
        }
        List<File> list = f3276a;
        if (list == null || list.size() <= 0) {
            return;
        }
        for (File file : f3276a) {
            if (file.exists() && file.canWrite()) {
                file.delete();
                al.c("Delete record file %s", file.getAbsoluteFile());
            }
        }
    }

    private static long b(Map<String, String> map) {
        String str = map.get("launchTime");
        if (str == null) {
            return -1L;
        }
        al.c("[Native record info] launchTime: %s", str);
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException e7) {
            if (al.a(e7)) {
                return -1L;
            }
            e7.printStackTrace();
            return -1L;
        }
    }

    public static String b(String str) {
        if (str == null) {
            return null;
        }
        File file = new File(str, "backup_record.txt");
        if (file.exists()) {
            return file.getAbsolutePath();
        }
        return null;
    }

    private static String b(String str, String str2) {
        BufferedReader bufferedReaderB = ap.b(str, "reg_record.txt");
        if (bufferedReaderB == null) {
            return null;
        }
        try {
            StringBuilder sb2 = new StringBuilder();
            String line = bufferedReaderB.readLine();
            if (line != null && line.startsWith(str2)) {
                int i7 = 18;
                int i10 = 0;
                int length = 0;
                while (true) {
                    String line2 = bufferedReaderB.readLine();
                    if (line2 == null) {
                        sb2.append("\n");
                        String string = sb2.toString();
                        try {
                            bufferedReaderB.close();
                            return string;
                        } catch (Exception e7) {
                            al.a(e7);
                            return string;
                        }
                    }
                    if (i10 % 4 == 0) {
                        if (i10 > 0) {
                            sb2.append("\n");
                        }
                        sb2.append("  ");
                    } else {
                        if (line2.length() > 16) {
                            i7 = 28;
                        }
                        sb2.append("                ".substring(0, i7 - length));
                    }
                    length = line2.length();
                    sb2.append(line2);
                    i10++;
                }
            }
            try {
                bufferedReaderB.close();
            } catch (Exception e10) {
                al.a(e10);
            }
            return null;
        } catch (Throwable th) {
            try {
                al.a(th);
                return null;
            } finally {
                try {
                    bufferedReaderB.close();
                } catch (Exception e11) {
                    al.a(e11);
                }
            }
        }
    }

    private static String c(String str, String str2) {
        BufferedReader bufferedReaderB = ap.b(str, "map_record.txt");
        if (bufferedReaderB == null) {
            return null;
        }
        try {
            StringBuilder sb2 = new StringBuilder();
            String line = bufferedReaderB.readLine();
            if (line != null && line.startsWith(str2)) {
                while (true) {
                    String line2 = bufferedReaderB.readLine();
                    if (line2 == null) {
                        String string = sb2.toString();
                        try {
                            bufferedReaderB.close();
                            return string;
                        } catch (Exception e7) {
                            al.a(e7);
                            return string;
                        }
                    }
                    sb2.append("  ");
                    sb2.append(line2);
                    sb2.append("\n");
                }
            }
            try {
                bufferedReaderB.close();
            } catch (Exception e10) {
                al.a(e10);
            }
            return null;
        } catch (Throwable th) {
            try {
                al.a(th);
                return null;
            } finally {
                try {
                    bufferedReaderB.close();
                } catch (Exception e11) {
                    al.a(e11);
                }
            }
        }
    }

    public static void c(String str) {
        File[] fileArrListFiles;
        if (str == null) {
            return;
        }
        try {
            File file = new File(str);
            if (file.canRead() && file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
                for (File file2 : fileArrListFiles) {
                    if (file2.canRead() && file2.canWrite() && file2.length() == 0) {
                        file2.delete();
                        al.c("Delete empty record file %s", file2.getAbsoluteFile());
                    }
                }
            }
        } catch (Throwable th) {
            al.a(th);
        }
    }

    private static Map<String, Integer> d(String str) {
        if (str == null) {
            return null;
        }
        try {
            HashMap map = new HashMap();
            for (String str2 : str.split(",")) {
                String[] strArrSplit = str2.split(":");
                if (strArrSplit.length != 2) {
                    al.e("error format at %s", str2);
                    return null;
                }
                map.put(strArrSplit[0], Integer.valueOf(Integer.parseInt(strArrSplit[1])));
            }
            return map;
        } catch (Exception e7) {
            al.e("error format intStateStr %s", str);
            e7.printStackTrace();
            return null;
        }
    }
}
