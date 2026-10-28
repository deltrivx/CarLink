package com.tencent.bugly.crashreport.crash.anr;

import com.tencent.bugly.proguard.al;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class TraceFileHelper {

    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f3020a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f3021b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f3022c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Map<String, String[]> f3023d;
    }

    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    public interface b {
        boolean a(long j5);

        boolean a(long j5, long j10, String str);

        boolean a(String str, int i7, String str2, String str3);
    }

    private static String a(BufferedReader bufferedReader) throws IOException {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i7 = 0; i7 < 3; i7++) {
            String line = bufferedReader.readLine();
            if (line == null) {
                return null;
            }
            stringBuffer.append(line.concat("\n"));
        }
        return stringBuffer.toString();
    }

    private static Object[] a(BufferedReader bufferedReader, Pattern... patternArr) throws IOException {
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                return null;
            }
            for (Pattern pattern : patternArr) {
                if (pattern.matcher(line).matches()) {
                    return new Object[]{pattern, line};
                }
            }
        }
    }

    private static String b(BufferedReader bufferedReader) throws IOException {
        StringBuffer stringBuffer = new StringBuffer();
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null || line.trim().length() <= 0) {
                break;
            }
            stringBuffer.append(line.concat("\n"));
        }
        return stringBuffer.toString();
    }

    public static a readFirstDumpInfo(String str, boolean z10) throws Throwable {
        if (str == null) {
            al.e("path:%s", str);
            return null;
        }
        a aVar = new a();
        readTraceFile(str, new com.tencent.bugly.crashreport.crash.anr.b(aVar, z10));
        if (aVar.f3020a > 0 && aVar.f3022c > 0 && aVar.f3021b != null) {
            return aVar;
        }
        al.e("first dump error %s", aVar.f3020a + " " + aVar.f3022c + " " + aVar.f3021b);
        return null;
    }

    public static a readTargetDumpInfo(String str, String str2, boolean z10) {
        if (str == null || str2 == null) {
            return null;
        }
        a aVar = new a();
        readTraceFile(str2, new com.tencent.bugly.crashreport.crash.anr.a(aVar, str, z10));
        if (aVar.f3020a <= 0 || aVar.f3022c <= 0 || aVar.f3021b == null) {
            return null;
        }
        return aVar;
    }

    public static void readTraceFile(String str, b bVar) throws Throwable {
        Throwable th;
        if (str == null || bVar == null) {
            return;
        }
        File file = new File(str);
        if (!file.exists()) {
            return;
        }
        file.lastModified();
        file.length();
        BufferedReader bufferedReader = null;
        try {
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file));
                try {
                    Pattern patternCompile = Pattern.compile("-{5}\\spid\\s\\d+\\sat\\s\\d+-\\d+-\\d+\\s\\d{2}:\\d{2}:\\d{2}\\s-{5}");
                    Pattern patternCompile2 = Pattern.compile("-{5}\\send\\s\\d+\\s-{5}");
                    Pattern patternCompile3 = Pattern.compile("Cmd\\sline:\\s(\\S+)");
                    Pattern patternCompile4 = Pattern.compile("\".+\"\\s(daemon\\s){0,1}prio=\\d+\\stid=\\d+\\s.*");
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
                    while (true) {
                        Object[] objArrA = a(bufferedReader2, patternCompile);
                        if (objArrA != null) {
                            Object[] objArrA2 = a(bufferedReader2, patternCompile3);
                            if (objArrA2 != null) {
                                String[] strArrSplit = objArrA[1].toString().split("\\s");
                                long j5 = Long.parseLong(strArrSplit[2]);
                                long time = simpleDateFormat.parse(strArrSplit[4] + " " + strArrSplit[5]).getTime();
                                Matcher matcher = patternCompile3.matcher(objArrA2[1].toString());
                                matcher.find();
                                matcher.group(1);
                                if (bVar.a(j5, time, matcher.group(1))) {
                                    while (true) {
                                        Object[] objArrA3 = a(bufferedReader2, patternCompile4, patternCompile2);
                                        if (objArrA3 != null) {
                                            if (objArrA3[0] != patternCompile4) {
                                                if (bVar.a(Long.parseLong(objArrA3[1].toString().split("\\s")[2]))) {
                                                    break;
                                                }
                                                try {
                                                    bufferedReader2.close();
                                                    return;
                                                } catch (IOException e7) {
                                                    e = e7;
                                                    if (al.a(e)) {
                                                        return;
                                                    }
                                                }
                                            } else {
                                                String string = objArrA3[1].toString();
                                                Matcher matcher2 = Pattern.compile("\".+\"").matcher(string);
                                                matcher2.find();
                                                String strGroup = matcher2.group();
                                                String strSubstring = strGroup.substring(1, strGroup.length() - 1);
                                                string.contains("NATIVE");
                                                Matcher matcher3 = Pattern.compile("tid=\\d+").matcher(string);
                                                matcher3.find();
                                                String strGroup2 = matcher3.group();
                                                bVar.a(strSubstring, Integer.parseInt(strGroup2.substring(strGroup2.indexOf("=") + 1)), a(bufferedReader2), b(bufferedReader2));
                                            }
                                        } else {
                                            break;
                                        }
                                    }
                                } else {
                                    try {
                                        bufferedReader2.close();
                                        return;
                                    } catch (IOException e10) {
                                        e = e10;
                                        if (al.a(e)) {
                                            return;
                                        }
                                    }
                                }
                            } else {
                                al.d("Failed to find process name.", new Object[0]);
                                try {
                                    bufferedReader2.close();
                                    return;
                                } catch (IOException e11) {
                                    e = e11;
                                    if (al.a(e)) {
                                        return;
                                    }
                                }
                            }
                        } else {
                            try {
                                bufferedReader2.close();
                                return;
                            } catch (IOException e12) {
                                e = e12;
                                if (al.a(e)) {
                                    return;
                                }
                            }
                        }
                        e.printStackTrace();
                        return;
                    }
                } catch (Exception e13) {
                    e = e13;
                    bufferedReader = bufferedReader2;
                    if (!al.a(e)) {
                        e.printStackTrace();
                    }
                    al.d("trace open fail:%s : %s", e.getClass().getName(), e.getMessage());
                    if (bufferedReader == null) {
                        return;
                    }
                    try {
                        bufferedReader.close();
                    } catch (IOException e14) {
                        e = e14;
                        if (al.a(e)) {
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bufferedReader = bufferedReader2;
                    if (bufferedReader == null) {
                        throw th;
                    }
                    try {
                        bufferedReader.close();
                        throw th;
                    } catch (IOException e15) {
                        if (al.a(e15)) {
                            throw th;
                        }
                        e15.printStackTrace();
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e16) {
            e = e16;
        }
    }
}
