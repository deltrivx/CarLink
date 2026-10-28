package com.tencent.bugly.crashreport.crash.anr;

import com.tencent.bugly.proguard.al;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a implements TraceFileHelper.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TraceFileHelper.a f3024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f3025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f3026c;

    public a(TraceFileHelper.a aVar, String str, boolean z10) {
        this.f3024a = aVar;
        this.f3025b = str;
        this.f3026c = z10;
    }

    @Override // com.tencent.bugly.crashreport.crash.anr.TraceFileHelper.b
    public final boolean a(long j5) {
        al.c("process end %d", Long.valueOf(j5));
        TraceFileHelper.a aVar = this.f3024a;
        return aVar.f3020a <= 0 || aVar.f3022c <= 0 || aVar.f3021b == null;
    }

    @Override // com.tencent.bugly.crashreport.crash.anr.TraceFileHelper.b
    public final boolean a(long j5, long j10, String str) {
        al.c("new process %s", str);
        if (!str.equals(this.f3025b)) {
            return true;
        }
        TraceFileHelper.a aVar = this.f3024a;
        aVar.f3020a = j5;
        aVar.f3021b = str;
        aVar.f3022c = j10;
        return this.f3026c;
    }

    @Override // com.tencent.bugly.crashreport.crash.anr.TraceFileHelper.b
    public final boolean a(String str, int i7, String str2, String str3) {
        al.c("new thread %s", str);
        TraceFileHelper.a aVar = this.f3024a;
        if (aVar.f3020a > 0 && aVar.f3022c > 0 && aVar.f3021b != null) {
            if (aVar.f3023d == null) {
                aVar.f3023d = new HashMap();
            }
            aVar.f3023d.put(str, new String[]{str2, str3, String.valueOf(i7)});
        }
        return true;
    }
}
