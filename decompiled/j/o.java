package j;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class o implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f6835a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayDeque f6836b = new ArrayDeque();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f6837c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Runnable f6838d;

    public o(p pVar) {
        this.f6837c = pVar;
    }

    public final void a() {
        synchronized (this.f6835a) {
            try {
                Runnable runnable = (Runnable) this.f6836b.poll();
                this.f6838d = runnable;
                if (runnable != null) {
                    this.f6837c.execute(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.f6835a) {
            try {
                this.f6836b.add(new c.n(3, this, runnable));
                if (this.f6838d == null) {
                    a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
