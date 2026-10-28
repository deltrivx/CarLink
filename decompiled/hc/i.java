package hc;

import c1.q0;
import cc.b0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f6519a = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f6520b = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "_prev$volatile");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f6521c = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    public final boolean e(i iVar, int i7) {
        while (true) {
            i iVarF = f();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6520b;
            if (iVarF == null) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                while (true) {
                    iVarF = (i) obj;
                    if (!iVarF.i()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(iVarF);
                }
            }
            if (iVarF instanceof h) {
                return (((h) iVarF).f6518d & i7) == 0 && iVarF.e(iVar, i7);
            }
            atomicReferenceFieldUpdater.set(iVar, iVarF);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f6519a;
            atomicReferenceFieldUpdater2.set(iVar, this);
            do {
                if (atomicReferenceFieldUpdater2.compareAndSet(iVarF, this, iVar)) {
                    iVar.g(this);
                    return true;
                }
            } while (atomicReferenceFieldUpdater2.get(iVarF) == this);
        }
    }

    public final i f() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f6520b;
            i iVar = (i) atomicReferenceFieldUpdater2.get(this);
            i iVar2 = iVar;
            while (true) {
                i iVar3 = null;
                while (true) {
                    atomicReferenceFieldUpdater = f6519a;
                    obj = atomicReferenceFieldUpdater.get(iVar2);
                    if (obj == this) {
                        if (iVar == iVar2) {
                            return iVar2;
                        }
                        while (!atomicReferenceFieldUpdater2.compareAndSet(this, iVar, iVar2)) {
                            if (atomicReferenceFieldUpdater2.get(this) != iVar) {
                                break;
                            }
                        }
                        return iVar2;
                    }
                    if (i()) {
                        return null;
                    }
                    if (!(obj instanceof n)) {
                        i9.l.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                        iVar3 = iVar2;
                        iVar2 = (i) obj;
                    } else {
                        if (iVar3 != null) {
                            break;
                        }
                        iVar2 = (i) atomicReferenceFieldUpdater2.get(iVar2);
                    }
                }
                i iVar4 = ((n) obj).f6532a;
                while (!atomicReferenceFieldUpdater.compareAndSet(iVar3, iVar2, iVar4)) {
                    if (atomicReferenceFieldUpdater.get(iVar3) != iVar2) {
                        break;
                    }
                }
                iVar2 = iVar3;
            }
        }
    }

    public final void g(i iVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6520b;
            i iVar2 = (i) atomicReferenceFieldUpdater.get(iVar);
            if (f6519a.get(this) != iVar) {
                return;
            }
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(iVar, iVar2, this)) {
                    if (i()) {
                        iVar.f();
                        return;
                    }
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(iVar) == iVar2);
        }
    }

    public final i h() {
        i iVar;
        Object obj = f6519a.get(this);
        n nVar = obj instanceof n ? (n) obj : null;
        if (nVar != null && (iVar = nVar.f6532a) != null) {
            return iVar;
        }
        i9.l.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        return (i) obj;
    }

    public boolean i() {
        return f6519a.get(this) instanceof n;
    }

    public String toString() {
        return new q0(1, 3, b0.class, this, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;") + '@' + b0.l(this);
    }
}
