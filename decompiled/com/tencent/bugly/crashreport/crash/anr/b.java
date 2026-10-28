package com.tencent.bugly.crashreport.crash.anr;

import com.tencent.bugly.proguard.al;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b implements TraceFileHelper.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TraceFileHelper.a f3027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f3028b;

    public b(TraceFileHelper.a aVar, boolean z10) {
        this.f3027a = aVar;
        this.f3028b = z10;
    }

    @Override // com.tencent.bugly.crashreport.crash.anr.TraceFileHelper.b
    public final boolean a(long j5) {
        al.c("process end %d", Long.valueOf(j5));
        return false;
    }

    @Override // com.tencent.bugly.crashreport.crash.anr.TraceFileHelper.b
    public final boolean a(long j5, long j10, String str) {
        al.c("new process %s", str);
        TraceFileHelper.a aVar = this.f3027a;
        aVar.f3020a = j5;
        aVar.f3021b = str;
        aVar.f3022c = j10;
        return this.f3028b;
    }

    @Override // com.tencent.bugly.crashreport.crash.anr.TraceFileHelper.b
    public final boolean a(String str, int i7, String str2, String str3) {
        al.c("new thread %s", str);
        TraceFileHelper.a aVar = this.f3027a;
        if (aVar.f3023d == null) {
            aVar.f3023d = new HashMap();
        }
        aVar.f3023d.put(str, new String[]{str2, str3, String.valueOf(i7)});
        return true;
    }
}
