package com.tencent.bugly.proguard;

import android.os.Handler;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class bf implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Handler f3277a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    long f3280d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f3281e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List<ba> f3282f = new LinkedList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    long f3278b = 5000;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f3283g = 5000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f3279c = true;

    public bf(Handler handler, String str) {
        this.f3277a = handler;
        this.f3281e = str;
    }

    private Thread e() {
        return this.f3277a.getLooper().getThread();
    }

    public final boolean a() {
        return !this.f3279c && SystemClock.uptimeMillis() >= this.f3280d + this.f3278b;
    }

    public final long b() {
        return SystemClock.uptimeMillis() - this.f3280d;
    }

    public final List<ba> c() {
        ArrayList arrayList;
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (this.f3282f) {
            try {
                arrayList = new ArrayList(this.f3282f.size());
                for (int i7 = 0; i7 < this.f3282f.size(); i7++) {
                    ba baVar = this.f3282f.get(i7);
                    if (!baVar.f3259e && jCurrentTimeMillis - baVar.f3256b < 200000) {
                        arrayList.add(baVar);
                        baVar.f3259e = true;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return arrayList;
    }

    public final void d() {
        StringBuilder sb2 = new StringBuilder(1024);
        long jNanoTime = System.nanoTime();
        try {
            StackTraceElement[] stackTrace = e().getStackTrace();
            if (stackTrace.length == 0) {
                sb2.append("Thread does not have stack trace.\n");
            } else {
                for (StackTraceElement stackTraceElement : stackTrace) {
                    sb2.append(stackTraceElement);
                    sb2.append("\n");
                }
            }
        } catch (SecurityException e7) {
            sb2.append("getStackTrace() encountered:\n");
            sb2.append(e7.getMessage());
            sb2.append("\n");
            al.a(e7);
        }
        long jNanoTime2 = System.nanoTime();
        ba baVar = new ba(sb2.toString(), System.currentTimeMillis());
        baVar.f3258d = jNanoTime2 - jNanoTime;
        String name = e().getName();
        if (name == null) {
            name = "";
        }
        baVar.f3255a = name;
        synchronized (this.f3282f) {
            while (this.f3282f.size() >= 32) {
                try {
                    this.f3282f.remove(0);
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f3282f.add(baVar);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f3279c = true;
        this.f3278b = this.f3283g;
    }
}
