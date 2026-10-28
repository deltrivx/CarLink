package com.baidu.carlife.sdk.util;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import i9.l;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0002¨\u0006\u0005"}, d2 = {"currentProcess", "", "Landroid/content/Context;", "isMainProcess", "", "carlife-sdk_release"}, k = 2, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
public final class ApplicationUtilsKt {
    public static final String currentProcess(Context context) {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        Object next;
        l.e(context, "<this>");
        if (Build.VERSION.SDK_INT >= 28) {
            String processName = Application.getProcessName();
            l.d(processName, "getProcessName()");
            return processName;
        }
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread", false, Application.class.getClassLoader()).getDeclaredMethod("currentProcessName", null);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(null, null);
            if (objInvoke instanceof String) {
                return (String) objInvoke;
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        int iMyPid = Process.myPid();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            runningAppProcessInfo = null;
        } else {
            Iterator<T> it = runningAppProcesses.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((ActivityManager.RunningAppProcessInfo) next).pid != iMyPid);
            runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) next;
        }
        String str = runningAppProcessInfo != null ? runningAppProcessInfo.processName : null;
        return str == null ? "" : str;
    }

    public static final boolean isMainProcess(Context context) {
        l.e(context, "<this>");
        return l.a(currentProcess(context), context.getPackageName());
    }
}
