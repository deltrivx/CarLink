package com.tencent.bugly.proguard;

import com.tencent.bugly.crashreport.crash.CrashDetailBean;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class g0 implements ah {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f3428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f3429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f3430c;

    public g0(long j5, List list, boolean z10) {
        this.f3428a = j5;
        this.f3429b = list;
        this.f3430c = z10;
    }

    @Override // com.tencent.bugly.proguard.ah
    public final void a(boolean z10, String str) {
        as.a(this.f3429b, z10, System.currentTimeMillis() - this.f3428a, this.f3430c ? "realtime" : "cache", str);
        as.a(z10, (List<CrashDetailBean>) this.f3429b);
    }
}
