package y8;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class j implements c, a9.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f15109b = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "result");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f15110a;
    private volatile Object result;

    public j(c cVar) {
        z8.a aVar = z8.a.f15774a;
        this.f15110a = cVar;
        this.result = aVar;
    }

    @Override // a9.d
    public final a9.d getCallerFrame() {
        c cVar = this.f15110a;
        if (cVar instanceof a9.d) {
            return (a9.d) cVar;
        }
        return null;
    }

    @Override // y8.c
    public final h getContext() {
        return this.f15110a.getContext();
    }

    @Override // y8.c
    public final void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            z8.a aVar = z8.a.f15775b;
            if (obj2 == aVar) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15109b;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, aVar, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != aVar) {
                    }
                }
                return;
            }
            z8.a aVar2 = z8.a.f15774a;
            if (obj2 != aVar2) {
                throw new IllegalStateException("Already resumed");
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f15109b;
            z8.a aVar3 = z8.a.f15776c;
            do {
                if (atomicReferenceFieldUpdater2.compareAndSet(this, aVar2, aVar3)) {
                    this.f15110a.resumeWith(obj);
                    return;
                }
            } while (atomicReferenceFieldUpdater2.get(this) == aVar2);
        }
    }

    public final String toString() {
        return "SafeContinuation for " + this.f15110a;
    }
}
