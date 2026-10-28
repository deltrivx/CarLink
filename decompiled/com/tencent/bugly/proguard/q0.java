package com.tencent.bugly.proguard;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class q0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f3472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f3473b;

    public q0(r rVar, long j5) {
        this.f3473b = rVar;
        this.f3472a = j5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r rVar = this.f3473b;
        rVar.b();
        rVar.a(this.f3472a);
    }
}
