package cc;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class f extends a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Thread f2613d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t0 f2614e;

    public f(y8.h hVar, Thread thread, t0 t0Var) {
        super(hVar, true);
        this.f2613d = thread;
        this.f2614e = t0Var;
    }

    @Override // cc.h1
    public final void y(Object obj) {
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = this.f2613d;
        if (i9.l.a(threadCurrentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
