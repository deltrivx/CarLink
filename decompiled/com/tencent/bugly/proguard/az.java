package com.tencent.bugly.proguard;

import android.app.ActivityManager;
import android.os.Process;
import android.text.TextUtils;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class az {
    public static ActivityManager.ProcessErrorStateInfo a(ActivityManager activityManager, long j5) {
        if (activityManager == null) {
            al.c("get anr state, ActivityManager is null", new Object[0]);
            return null;
        }
        al.c("get anr state, timeout:%d", Long.valueOf(j5));
        long j10 = j5 / 500;
        int i7 = 0;
        while (true) {
            ActivityManager.ProcessErrorStateInfo processErrorStateInfoA = a(activityManager.getProcessesInErrorState());
            if (processErrorStateInfoA == null) {
                al.c("found proc state is null", new Object[0]);
            } else {
                int i10 = processErrorStateInfoA.condition;
                if (i10 == 2) {
                    al.c("found proc state is anr! proc:%s", processErrorStateInfoA.processName);
                    return processErrorStateInfoA;
                }
                if (i10 == 1) {
                    al.c("found proc state is crashed!", new Object[0]);
                    return null;
                }
            }
            int i11 = i7 + 1;
            if (i7 >= j10) {
                return a("Find process anr, but unable to get anr message.");
            }
            al.c("try the %s times:", Integer.valueOf(i11));
            ap.b(500L);
            i7 = i11;
        }
    }

    private static ActivityManager.ProcessErrorStateInfo a(String str) {
        ActivityManager.ProcessErrorStateInfo processErrorStateInfo = new ActivityManager.ProcessErrorStateInfo();
        processErrorStateInfo.pid = Process.myPid();
        processErrorStateInfo.processName = z.a(Process.myPid());
        processErrorStateInfo.shortMsg = str;
        return processErrorStateInfo;
    }

    private static ActivityManager.ProcessErrorStateInfo a(List<ActivityManager.ProcessErrorStateInfo> list) {
        if (list == null || list.isEmpty()) {
            al.c("error state info list is null", new Object[0]);
            return null;
        }
        int iMyPid = Process.myPid();
        for (ActivityManager.ProcessErrorStateInfo processErrorStateInfo : list) {
            if (processErrorStateInfo.pid == iMyPid) {
                if (TextUtils.isEmpty(processErrorStateInfo.longMsg)) {
                    return null;
                }
                al.c("found current proc in the error state", new Object[0]);
                return processErrorStateInfo;
            }
        }
        al.c("current proc not in the error state", new Object[0]);
        return null;
    }
}
