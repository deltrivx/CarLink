package cc;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class z0 extends e1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f2694f = AtomicIntegerFieldUpdater.newUpdater(z0.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d1 f2695e;

    public z0(d1 d1Var) {
        this.f2695e = d1Var;
    }

    @Override // cc.e1
    public final boolean k() {
        return true;
    }

    @Override // cc.e1
    public final void l(Throwable th) {
        if (f2694f.compareAndSet(this, 0, 1)) {
            this.f2695e.invoke(th);
        }
    }
}
