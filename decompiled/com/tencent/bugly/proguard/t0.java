package com.tencent.bugly.proguard;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class t0 extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3501a = 4;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f3503c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f3504d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w f3505e;

    public t0(w wVar) {
        this.f3505e = wVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (this.f3501a != 4) {
            return;
        }
        this.f3505e.a(this.f3502b, this.f3503c, this.f3504d, (v) null);
    }
}
