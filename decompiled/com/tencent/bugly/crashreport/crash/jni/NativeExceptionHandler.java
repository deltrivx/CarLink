package com.tencent.bugly.crashreport.crash.jni;

import com.tencent.bugly.crashreport.crash.CrashDetailBean;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public interface NativeExceptionHandler {
    boolean getAndUpdateAnrState();

    void handleNativeException(int i7, int i10, long j5, long j10, String str, String str2, String str3, String str4, int i11, String str5, int i12, int i13, int i14, String str6, String str7);

    void handleNativeException2(int i7, int i10, long j5, long j10, String str, String str2, String str3, String str4, int i11, String str5, int i12, int i13, int i14, String str6, String str7, String[] strArr);

    CrashDetailBean packageCrashDatas(String str, String str2, long j5, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, byte[] bArr, Map<String, String> map, boolean z10, boolean z11);
}
