package com.tencent.bugly.crashreport.crash.jni;

import com.tencent.bugly.crashreport.crash.CrashDetailBean;
import com.tencent.bugly.proguard.al;
import com.tencent.bugly.proguard.ap;
import com.tencent.bugly.proguard.at;
import com.tencent.bugly.proguard.be;
import java.io.File;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NativeCrashHandler f3047a;

    public a(NativeCrashHandler nativeCrashHandler) {
        this.f3047a = nativeCrashHandler;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        File[] fileArr;
        NativeCrashHandler nativeCrashHandler = this.f3047a;
        if (!ap.a(nativeCrashHandler.f3038d, "native_record_lock")) {
            al.a("[Native] Failed to lock file for handling native crash record.", new Object[0]);
            return;
        }
        if (!NativeCrashHandler.f3037n) {
            nativeCrashHandler.a(999, "false");
        }
        CrashDetailBean crashDetailBeanA = be.a(nativeCrashHandler.f3038d, NativeCrashHandler.f3034a, nativeCrashHandler.f3041g);
        if (crashDetailBeanA != null) {
            al.a("[Native] Get crash from native record.", new Object[0]);
            if (!nativeCrashHandler.f3046m.a(crashDetailBeanA, true)) {
                nativeCrashHandler.f3046m.b(crashDetailBeanA, false);
            }
            be.a(false, NativeCrashHandler.f3034a);
        }
        long jB = ap.b() - at.f3193j;
        long jB2 = ap.b() + 86400000;
        File file = new File(NativeCrashHandler.f3034a);
        if (file.exists() && file.isDirectory()) {
            try {
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles != null && fileArrListFiles.length != 0) {
                    Arrays.sort(fileArrListFiles, new b());
                    int length = fileArrListFiles.length;
                    long length2 = 0;
                    int i7 = 0;
                    int i10 = 0;
                    int i11 = 0;
                    while (i7 < length) {
                        File file2 = fileArrListFiles[i7];
                        long jLastModified = file2.lastModified();
                        length2 += file2.length();
                        if (jLastModified < jB || jLastModified >= jB2 || length2 >= at.f3192i) {
                            fileArr = fileArrListFiles;
                            al.a("[Native] Delete record file: %s", file2.getAbsolutePath());
                            i10++;
                            if (file2.delete()) {
                                i11++;
                            }
                        } else {
                            fileArr = fileArrListFiles;
                        }
                        i7++;
                        fileArrListFiles = fileArr;
                    }
                    al.c("[Native] Number of record files overdue: %d, has deleted: %d", Integer.valueOf(i10), Integer.valueOf(i11));
                }
            } catch (Throwable th) {
                al.a(th);
            }
        }
        ap.b(nativeCrashHandler.f3038d, "native_record_lock");
    }
}
