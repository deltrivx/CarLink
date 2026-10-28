package com.tencent.bugly.proguard;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class ak {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AtomicInteger f3134a = new AtomicInteger(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static ak f3135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ScheduledExecutorService f3136c;

    public ak() {
        this.f3136c = null;
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(3, new b4.o(1));
        this.f3136c = scheduledExecutorServiceNewScheduledThreadPool;
        if (scheduledExecutorServiceNewScheduledThreadPool == null || scheduledExecutorServiceNewScheduledThreadPool.isShutdown()) {
            al.d("[AsyncTaskHandler] ScheduledExecutorService is not valiable!", new Object[0]);
        }
    }

    public static synchronized ak a() {
        try {
            if (f3135b == null) {
                f3135b = new ak();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f3135b;
    }

    public final synchronized boolean a(Runnable runnable) {
        if (!c()) {
            al.d("[AsyncTaskHandler] Async handler was closed, should not post task.", new Object[0]);
            return false;
        }
        if (runnable == null) {
            al.d("[AsyncTaskHandler] Task input is null.", new Object[0]);
            return false;
        }
        al.c("[AsyncTaskHandler] Post a normal task: %s", runnable.getClass().getName());
        try {
            this.f3136c.execute(runnable);
            return true;
        } catch (Throwable th) {
            if (p.f3465c) {
                th.printStackTrace();
            }
            return false;
        }
    }

    public final synchronized boolean a(Runnable runnable, long j5) {
        if (!c()) {
            al.d("[AsyncTaskHandler] Async handler was closed, should not post task.", new Object[0]);
            return false;
        }
        if (j5 <= 0) {
            j5 = 0;
        }
        al.c("[AsyncTaskHandler] Post a delay(time: %dms) task: %s", Long.valueOf(j5), runnable.getClass().getName());
        try {
            this.f3136c.schedule(runnable, j5, TimeUnit.MILLISECONDS);
            return true;
        } catch (Throwable th) {
            if (p.f3465c) {
                th.printStackTrace();
            }
            return false;
        }
    }

    public final synchronized void b() {
        ScheduledExecutorService scheduledExecutorService = this.f3136c;
        if (scheduledExecutorService != null && !scheduledExecutorService.isShutdown()) {
            al.c("[AsyncTaskHandler] Close async handler.", new Object[0]);
            this.f3136c.shutdownNow();
        }
    }

    public final synchronized boolean c() {
        ScheduledExecutorService scheduledExecutorService = this.f3136c;
        return (scheduledExecutorService == null || scheduledExecutorService.isShutdown()) ? false : true;
    }
}
