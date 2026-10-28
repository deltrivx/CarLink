package com.tencent.bugly.proguard;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class m0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ay f3453b;

    public /* synthetic */ m0(ay ayVar, int i7) {
        this.f3452a = i7;
        this.f3453b = ayVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3452a) {
            case 0:
                ay.a(this.f3453b);
                break;
            default:
                ay.a(this.f3453b);
                break;
        }
    }
}
