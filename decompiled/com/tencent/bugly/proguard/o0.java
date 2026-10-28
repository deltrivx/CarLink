package com.tencent.bugly.proguard;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class o0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f3462b;

    public /* synthetic */ o0(r rVar, int i7) {
        this.f3461a = i7;
        this.f3462b = rVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3461a) {
            case 0:
                try {
                    this.f3462b.a(false);
                } catch (Throwable th) {
                    al.a(th);
                    return;
                }
                break;
            default:
                long jCurrentTimeMillis = System.currentTimeMillis();
                r rVar = this.f3462b;
                if (jCurrentTimeMillis >= rVar.f3476b) {
                    rVar.a(3, false);
                    rVar.a();
                } else {
                    ak.a().a(new o0(rVar, 1), (rVar.f3476b - jCurrentTimeMillis) + 5000);
                }
                break;
        }
    }
}
