package hc;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f6522a = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile = new l(8, false);

    public final boolean a(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6522a;
            l lVar = (l) atomicReferenceFieldUpdater.get(this);
            int iA = lVar.a(runnable);
            if (iA == 0) {
                return true;
            }
            if (iA == 1) {
                l lVarC = lVar.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, lVar, lVarC) && atomicReferenceFieldUpdater.get(this) == lVar) {
                }
            } else if (iA == 2) {
                return false;
            }
        }
    }

    public final void b() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6522a;
            l lVar = (l) atomicReferenceFieldUpdater.get(this);
            if (lVar.b()) {
                return;
            }
            l lVarC = lVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, lVar, lVarC) && atomicReferenceFieldUpdater.get(this) == lVar) {
            }
        }
    }

    public final int c() {
        l lVar = (l) f6522a.get(this);
        lVar.getClass();
        long j5 = l.f6525f.get(lVar);
        return 1073741823 & (((int) ((j5 & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j5)));
    }

    public final Object d() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6522a;
            l lVar = (l) atomicReferenceFieldUpdater.get(this);
            Object objD = lVar.d();
            if (objD != l.f6526g) {
                return objD;
            }
            l lVarC = lVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, lVar, lVarC) && atomicReferenceFieldUpdater.get(this) == lVar) {
            }
        }
    }
}
