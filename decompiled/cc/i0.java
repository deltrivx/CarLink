package cc;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class i0 extends hc.p {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f2630e = AtomicIntegerFieldUpdater.newUpdater(i0.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    @Override // hc.p, cc.h1
    public final void A(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f2630e;
            int i7 = atomicIntegerFieldUpdater.get(this);
            if (i7 != 0) {
                if (i7 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                hc.a.h(b0.u(obj), n4.h.L(this.f6533d));
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }

    @Override // hc.p, cc.h1
    public final void y(Object obj) {
        A(obj);
    }
}
