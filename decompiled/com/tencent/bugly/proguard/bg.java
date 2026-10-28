package com.tencent.bugly.proguard;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class bg extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public bf f3284a;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private a f3290g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f3286c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f3287d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f3288e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f3289f = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f3285b = true;

    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    public interface a {
    }

    private synchronized void a(bf bfVar) {
        if (this.f3287d) {
            return;
        }
        if (this.f3288e && !bfVar.a()) {
            al.c("Restart getting main stack trace.", new Object[0]);
            this.f3287d = true;
            this.f3288e = false;
        }
    }

    public final boolean a() {
        this.f3286c = true;
        if (!isAlive()) {
            return false;
        }
        try {
            interrupt();
        } catch (Exception e7) {
            al.b(e7);
        }
        al.d("MainHandlerChecker is reset to null.", new Object[0]);
        this.f3284a = null;
        return true;
    }

    public final boolean b() {
        Handler handler = new Handler(Looper.getMainLooper());
        bf bfVar = this.f3284a;
        if (bfVar != null) {
            bfVar.f3278b = 5000L;
        } else {
            this.f3284a = new bf(handler, handler.getLooper().getThread().getName());
        }
        if (isAlive()) {
            return false;
        }
        try {
            start();
            return true;
        } catch (Exception e7) {
            al.b(e7);
            return false;
        }
    }

    public final synchronized void c() {
        this.f3287d = false;
        al.c("Record stack trace is disabled.", new Object[0]);
    }

    public final synchronized void d() {
        this.f3288e = true;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        while (!this.f3286c) {
            try {
                bf bfVar = this.f3284a;
                boolean z10 = false;
                if (bfVar == null) {
                    al.c("Main handler checker is null. Stop thread monitor.", new Object[0]);
                    return;
                }
                if (bfVar.f3279c) {
                    bfVar.f3279c = false;
                    bfVar.f3280d = SystemClock.uptimeMillis();
                    bfVar.f3277a.post(bfVar);
                }
                a(bfVar);
                if (this.f3285b && this.f3287d) {
                    long jB = bfVar.b();
                    if (jB > 1510 && jB < 199990) {
                        boolean z11 = true;
                        if (jB <= 5010) {
                            this.f3289f = 1;
                            al.c("timeSinceMsgSent in [2s, 5s], record stack", new Object[0]);
                            z10 = true;
                        } else {
                            int i7 = this.f3289f;
                            int i10 = i7 + 1;
                            this.f3289f = i10;
                            if ((i7 & i10) != 0) {
                                z11 = false;
                            }
                            if (z11) {
                                al.c("timeSinceMsgSent in (5s, 200s), should record stack:true", new Object[0]);
                            }
                            z10 = z11;
                        }
                    }
                }
                if (z10) {
                    bfVar.d();
                }
                if (this.f3290g != null && this.f3287d) {
                    bfVar.a();
                    bfVar.b();
                }
                ap.b(500 - ((System.currentTimeMillis() - jCurrentTimeMillis) % 500));
            } catch (Exception e7) {
                al.b(e7);
            } catch (OutOfMemoryError e10) {
                al.b(e10);
            }
        }
    }
}
