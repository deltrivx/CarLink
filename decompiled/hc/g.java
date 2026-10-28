package hc;

import cc.d0;
import cc.g0;
import cc.l0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class g extends cc.u implements g0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f6512h = AtomicIntegerFieldUpdater.newUpdater(g.class, "runningWorkers$volatile");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g0 f6513c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final cc.u f6514d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f6515e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j f6516f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f6517g;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX WARN: Multi-variable type inference failed */
    public g(cc.u uVar, int i7) {
        g0 g0Var = uVar instanceof g0 ? (g0) uVar : null;
        this.f6513c = g0Var == null ? d0.f2608a : g0Var;
        this.f6514d = uVar;
        this.f6515e = i7;
        this.f6516f = new j();
        this.f6517g = new Object();
    }

    @Override // cc.g0
    public final l0 c(long j5, Runnable runnable, y8.h hVar) {
        return this.f6513c.c(j5, runnable, hVar);
    }

    @Override // cc.g0
    public final void e(long j5, cc.l lVar) {
        this.f6513c.e(j5, lVar);
    }

    @Override // cc.u
    public final void g(y8.h hVar, Runnable runnable) {
        Runnable runnableX;
        this.f6516f.a(runnable);
        if (f6512h.get(this) >= this.f6515e || !y() || (runnableX = x()) == null) {
            return;
        }
        this.f6514d.g(this, new b4.a(7, this, runnableX, false));
    }

    @Override // cc.u
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f6514d);
        sb2.append(".limitedParallelism(");
        return a2.f.H(sb2, this.f6515e, ')');
    }

    @Override // cc.u
    public final void u(y8.h hVar, Runnable runnable) {
        Runnable runnableX;
        this.f6516f.a(runnable);
        if (f6512h.get(this) >= this.f6515e || !y() || (runnableX = x()) == null) {
            return;
        }
        this.f6514d.u(this, new b4.a(7, this, runnableX, false));
    }

    public final Runnable x() {
        while (true) {
            Runnable runnable = (Runnable) this.f6516f.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f6517g) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f6512h;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f6516f.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    public final boolean y() {
        synchronized (this.f6517g) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f6512h;
            if (atomicIntegerFieldUpdater.get(this) >= this.f6515e) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }
}
