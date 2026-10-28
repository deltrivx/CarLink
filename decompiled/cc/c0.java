package cc;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends s0 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final c0 f2605j;
    public static final long k;

    static {
        Long l10;
        c0 c0Var = new c0();
        f2605j = c0Var;
        c0Var.A(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l10 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l10 = 1000L;
        }
        k = timeUnit.toNanos(l10.longValue());
    }

    @Override // cc.t0
    public final void D(long j5, q0 q0Var) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // cc.s0
    public final void E(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.E(runnable);
    }

    public final synchronized void J() {
        int i7 = debugStatus;
        if (i7 == 2 || i7 == 3) {
            debugStatus = 3;
            s0.f2664g.set(this, null);
            s0.f2665h.set(this, null);
            notifyAll();
        }
    }

    @Override // cc.s0, cc.g0
    public final l0 c(long j5, Runnable runnable, y8.h hVar) {
        long j10 = 0;
        if (j5 > 0) {
            j10 = j5 >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j5;
        }
        if (j10 >= 4611686018427387903L) {
            return l1.f2642a;
        }
        long jNanoTime = System.nanoTime();
        p0 p0Var = new p0(runnable, j10 + jNanoTime);
        I(jNanoTime, p0Var);
        return p0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        s1.f2667a.set(this);
        try {
            synchronized (this) {
                int i7 = debugStatus;
                if (i7 == 2 || i7 == 3) {
                    _thread = null;
                    J();
                    if (H()) {
                        return;
                    }
                    z();
                    return;
                }
                debugStatus = 1;
                notifyAll();
                long j5 = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long jB = B();
                    if (jB == Long.MAX_VALUE) {
                        long jNanoTime = System.nanoTime();
                        if (j5 == Long.MAX_VALUE) {
                            j5 = k + jNanoTime;
                        }
                        long j10 = j5 - jNanoTime;
                        if (j10 <= 0) {
                            _thread = null;
                            J();
                            if (H()) {
                                return;
                            }
                            z();
                            return;
                        }
                        if (jB > j10) {
                            jB = j10;
                        }
                    } else {
                        j5 = Long.MAX_VALUE;
                    }
                    if (jB > 0) {
                        int i10 = debugStatus;
                        if (i10 == 2 || i10 == 3) {
                            _thread = null;
                            J();
                            if (H()) {
                                return;
                            }
                            z();
                            return;
                        }
                        LockSupport.parkNanos(this, jB);
                    }
                }
            }
        } catch (Throwable th) {
            _thread = null;
            J();
            if (!H()) {
                z();
            }
            throw th;
        }
    }

    @Override // cc.s0, cc.t0
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // cc.u
    public final String toString() {
        return "DefaultExecutor";
    }

    @Override // cc.t0
    public final Thread z() {
        Thread thread;
        Thread thread2 = _thread;
        if (thread2 != null) {
            return thread2;
        }
        synchronized (this) {
            thread = _thread;
            if (thread == null) {
                thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                _thread = thread;
                thread.setContextClassLoader(f2605j.getClass().getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }
}
