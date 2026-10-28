package hc;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f6502a = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f6503b = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    public b(q qVar) {
        this._prev$volatile = qVar;
    }

    public final void a() {
        f6503b.set(this, null);
    }

    public final b c() {
        Object obj = f6502a.get(this);
        if (obj == a.f6495a) {
            return null;
        }
        return (b) obj;
    }

    public abstract boolean d();

    public final void e() {
        b bVarC;
        if (c() == null) {
            return;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6503b;
            b bVar = (b) atomicReferenceFieldUpdater.get(this);
            while (bVar != null && bVar.d()) {
                bVar = (b) atomicReferenceFieldUpdater.get(bVar);
            }
            b bVarC2 = c();
            i9.l.b(bVarC2);
            while (bVarC2.d() && (bVarC = bVarC2.c()) != null) {
                bVarC2 = bVarC;
            }
            while (true) {
                Object obj = atomicReferenceFieldUpdater.get(bVarC2);
                b bVar2 = ((b) obj) == null ? null : bVar;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(bVarC2, obj, bVar2)) {
                        break;
                    } else if (atomicReferenceFieldUpdater.get(bVarC2) != obj) {
                    }
                }
            }
            if (bVar != null) {
                f6502a.set(bVar, bVarC2);
            }
            if (!bVarC2.d() || bVarC2.c() == null) {
                if (bVar == null || !bVar.d()) {
                    return;
                }
            }
        }
    }
}
