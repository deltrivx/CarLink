package hc;

import cc.m1;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class q extends b implements m1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f6534d = AtomicIntegerFieldUpdater.newUpdater(q.class, "cleanedAndPointers$volatile");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f6535c;
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    public q(long j5, q qVar, int i7) {
        super(qVar);
        this.f6535c = j5;
        this.cleanedAndPointers$volatile = i7 << 16;
    }

    @Override // hc.b
    public final boolean d() {
        return f6534d.get(this) == g() && c() != null;
    }

    public final boolean f() {
        return f6534d.addAndGet(this, -65536) == g() && c() != null;
    }

    public abstract int g();

    public abstract void h(int i7, y8.h hVar);

    public final void i() {
        if (f6534d.incrementAndGet(this) == g()) {
            e();
        }
    }

    public final boolean j() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i7;
        do {
            atomicIntegerFieldUpdater = f6534d;
            i7 = atomicIntegerFieldUpdater.get(this);
            if (i7 == g() && c() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i7, 65536 + i7));
        return true;
    }
}
