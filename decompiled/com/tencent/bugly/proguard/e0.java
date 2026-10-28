package com.tencent.bugly.proguard;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f3411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f3412c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f3413d;

    public /* synthetic */ e0(int i7, String str, String str2, String str3) {
        this.f3410a = i7;
        this.f3411b = str;
        this.f3412c = str2;
        this.f3413d = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3410a) {
            case 0:
                ao.d(this.f3411b, this.f3412c, this.f3413d);
                break;
            default:
                ao.e(this.f3411b, this.f3412c, this.f3413d);
                break;
        }
    }
}
