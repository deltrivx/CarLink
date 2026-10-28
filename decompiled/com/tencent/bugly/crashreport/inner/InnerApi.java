package com.tencent.bugly.crashreport.inner;

import com.tencent.bugly.proguard.al;
import com.tencent.bugly.proguard.au;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class InnerApi {
    public static void postCocos2dxCrashAsync(int i7, String str, String str2, String str3) {
        if (str == null || str2 == null || str3 == null) {
            al.e("post cocos2d-x fail args null", new Object[0]);
        } else if (i7 != 5 && i7 != 6) {
            al.e("post cocos2d-x fail category illeagle: %d", Integer.valueOf(i7));
        } else {
            al.a("post cocos2d-x crash %s %s", str, str2);
            au.a(Thread.currentThread(), i7, str, str2, str3, null);
        }
    }

    public static void postH5CrashAsync(Thread thread, String str, String str2, String str3, Map<String, String> map) {
        if (str == null || str2 == null || str3 == null) {
            al.e("post h5 fail args null", new Object[0]);
        } else {
            al.a("post h5 crash %s %s", str, str2);
            au.a(thread, 8, str, str2, str3, map);
        }
    }

    public static void postU3dCrashAsync(String str, String str2, String str3) {
        if (str == null || str2 == null || str3 == null) {
            al.e("post u3d fail args null", new Object[0]);
        }
        al.a("post u3d crash %s %s", str, str2);
        au.a(Thread.currentThread(), 4, str, str2, str3, null);
    }
}
