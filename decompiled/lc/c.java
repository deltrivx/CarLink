package lc;

import cc.b0;
import cc.l;
import hc.s;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import t8.z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c extends h implements a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8371h = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "owner$volatile");
    private volatile /* synthetic */ Object owner$volatile;

    public c() {
        super(1);
        this.owner$volatile = d.f8372a;
    }

    public final boolean c() {
        return Math.max(h.f8379g.get(this), 0) == 0;
    }

    public final Object d(a9.c cVar) {
        boolean zE = e();
        z zVar = z.f12851a;
        if (!zE) {
            l lVarN = b0.n(n4.h.L(cVar));
            try {
                b bVar = new b(this, lVarN);
                while (true) {
                    int andDecrement = h.f8379g.getAndDecrement(this);
                    if (andDecrement <= this.f8380a) {
                        if (andDecrement > 0) {
                            c cVar2 = bVar.f8370b;
                            f8371h.set(cVar2, null);
                            l lVar = bVar.f8369a;
                            lVar.x(zVar, lVar.f2632c, new cc.k(0, new c8.k(19, cVar2, bVar)));
                            break;
                        }
                        if (a(bVar)) {
                            break;
                        }
                    }
                }
                Object objO = lVarN.o();
                z8.a aVar = z8.a.f15774a;
                if (objO != aVar) {
                    objO = zVar;
                }
                if (objO == aVar) {
                    return objO;
                }
            } catch (Throwable th) {
                lVarN.v();
                throw th;
            }
        }
        return zVar;
    }

    public final boolean e() {
        int i7;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = h.f8379g;
            int i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = this.f8380a;
            if (i10 > i11) {
                do {
                    i7 = atomicIntegerFieldUpdater.get(this);
                    if (i7 <= i11) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i7, i11));
            } else {
                if (i10 <= 0) {
                    return false;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i10, i10 - 1)) {
                    f8371h.set(this, null);
                    return true;
                }
            }
        }
    }

    public final void f(Object obj) {
        while (c()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8371h;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            s sVar = d.f8372a;
            if (obj2 != sVar) {
                if (obj2 != obj && obj != null) {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                }
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, sVar)) {
                        b();
                        return;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == obj2);
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    public final String toString() {
        return "Mutex@" + b0.l(this) + "[isLocked=" + c() + ",owner=" + f8371h.get(this) + ']';
    }
}
