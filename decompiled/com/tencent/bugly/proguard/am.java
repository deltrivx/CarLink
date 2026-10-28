package com.tencent.bugly.proguard;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class am {
    public static long a(String str, String str2, String str3) {
        if (str == null) {
            al.d("File name is null.", new Object[0]);
            return -1L;
        }
        try {
            if (str.startsWith(str2) && str.endsWith(str3)) {
                return Long.parseLong(str.substring(str2.length(), str.indexOf(str3)));
            }
        } catch (Throwable th) {
            al.a(th);
        }
        return -1L;
    }

    private static List<File> a(File[] fileArr, String str, String str2, long j5) {
        ArrayList arrayList = new ArrayList();
        for (File file : fileArr) {
            long jA = a(file.getName(), str, str2);
            if (jA >= 0 && 0 <= jA && jA <= j5) {
                arrayList.add(file);
            }
        }
        return arrayList;
    }

    public static void a(String str, String str2, String str3, long j5) {
        try {
            int i7 = 0;
            for (File file : b(str, str2, str3, j5)) {
                al.c("File %s is to be deleted.", file.getName());
                if (file.delete()) {
                    i7++;
                }
            }
            al.c("Number of overdue trace files that has deleted: ".concat(String.valueOf(i7)), new Object[0]);
        } catch (Throwable th) {
            al.a(th);
        }
    }

    public static boolean a(File file, String str, long j5, boolean z10) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, z10));
            boolean zA = a(bufferedWriter, str.toCharArray(), str.length(), file.length(), j5);
            bufferedWriter.close();
            return zA;
        } catch (Throwable th) {
            al.a(th);
            return false;
        }
    }

    private static boolean a(Writer writer, char[] cArr, int i7, long j5, long j10) {
        if (j5 >= j10) {
            return false;
        }
        try {
            if (((long) (i7 * 2)) + j5 <= j10) {
                writer.write(cArr, 0, i7);
            } else {
                writer.write(cArr, 0, (int) ((j10 - j5) / 2));
            }
            writer.flush();
            return true;
        } catch (IOException e7) {
            al.a(e7);
            return false;
        }
    }

    public static boolean a(String str, String str2, int i7) {
        boolean z10 = true;
        al.c("rqdp{  sv sd start} %s", str);
        if (str2 != null && str2.trim().length() > 0) {
            File file = new File(str);
            try {
                if (!file.exists()) {
                    if (file.getParentFile() != null) {
                        file.getParentFile().mkdirs();
                    }
                    file.createNewFile();
                }
                long j5 = i7;
                if (file.length() >= j5) {
                    z10 = false;
                }
                return a(file, str2, j5, z10);
            } catch (Throwable th) {
                if (!al.a(th)) {
                    th.printStackTrace();
                }
            }
        }
        return false;
    }

    private static List<File> b(String str, String str2, String str3, long j5) {
        ArrayList arrayList = new ArrayList();
        if (str2 == null || str3 == null) {
            al.d("prefix %s and/or postfix %s is null.", str2, str3);
            return arrayList;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        File file = new File(str);
        if (file.exists() && file.isDirectory()) {
            try {
                File[] fileArrListFiles = file.listFiles(new d0(str2, str3));
                if (fileArrListFiles != null && fileArrListFiles.length != 0) {
                    return a(fileArrListFiles, str2, str3, jCurrentTimeMillis - j5);
                }
            } catch (Throwable th) {
                al.a(th);
            }
        }
        return arrayList;
    }
}
