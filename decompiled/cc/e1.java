package cc;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class e1 extends hc.i implements l0, x0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public h1 f2612d;

    @Override // cc.l0
    public final void a() {
        h1 h1VarJ = j();
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h1.f2628a;
            Object obj = atomicReferenceFieldUpdater.get(h1VarJ);
            if (obj instanceof e1) {
                if (obj != this) {
                    return;
                }
                n0 n0Var = b0.f2599j;
                while (!atomicReferenceFieldUpdater.compareAndSet(h1VarJ, obj, n0Var)) {
                    if (atomicReferenceFieldUpdater.get(h1VarJ) != obj) {
                    }
                }
                return;
            }
            if (!(obj instanceof x0) || ((x0) obj).d() == null) {
                return;
            }
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = hc.i.f6519a;
                Object obj2 = atomicReferenceFieldUpdater2.get(this);
                if (obj2 instanceof hc.n) {
                    return;
                }
                if (obj2 == this) {
                    return;
                }
                i9.l.c(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                hc.i iVar = (hc.i) obj2;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = hc.i.f6521c;
                hc.n nVar = (hc.n) atomicReferenceFieldUpdater3.get(iVar);
                if (nVar == null) {
                    nVar = new hc.n(iVar);
                    atomicReferenceFieldUpdater3.set(iVar, nVar);
                }
                do {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, obj2, nVar)) {
                        iVar.f();
                        return;
                    }
                } while (atomicReferenceFieldUpdater2.get(this) == obj2);
            }
        }
    }

    @Override // cc.x0
    public final boolean b() {
        return true;
    }

    @Override // cc.x0
    public final j1 d() {
        return null;
    }

    public a1 getParent() {
        return j();
    }

    public final h1 j() {
        h1 h1Var = this.f2612d;
        if (h1Var != null) {
            return h1Var;
        }
        i9.l.j("job");
        throw null;
    }

    public abstract boolean k();

    public abstract void l(Throwable th);

    @Override // hc.i
    public final String toString() {
        return getClass().getSimpleName() + '@' + b0.l(this) + "[job@" + b0.l(j()) + ']';
    }
}
