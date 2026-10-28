package cc;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class s0 extends t0 implements g0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2664g = AtomicReferenceFieldUpdater.newUpdater(s0.class, Object.class, "_queue$volatile");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2665h = AtomicReferenceFieldUpdater.newUpdater(s0.class, Object.class, "_delayed$volatile");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f2666i = AtomicIntegerFieldUpdater.newUpdater(s0.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;

    @Override // cc.t0
    public final long B() {
        Runnable runnable;
        q0 q0Var;
        hc.s sVar = b0.f2592c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2664g;
        if (!C()) {
            F();
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                if (obj != null) {
                    if (obj instanceof hc.l) {
                        hc.l lVar = (hc.l) obj;
                        Object objD = lVar.d();
                        if (objD != hc.l.f6526g) {
                            runnable = (Runnable) objD;
                            break;
                        }
                        hc.l lVarC = lVar.c();
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, lVarC) && atomicReferenceFieldUpdater.get(this) == obj) {
                        }
                    } else if (obj != sVar) {
                        do {
                            if (atomicReferenceFieldUpdater.compareAndSet(this, obj, null)) {
                                runnable = (Runnable) obj;
                                break loop0;
                            }
                        } while (atomicReferenceFieldUpdater.get(this) == obj);
                    }
                }
                runnable = null;
                break;
            }
            if (runnable != null) {
                runnable.run();
                return 0L;
            }
            u8.k kVar = this.f2673e;
            if (((kVar == null || kVar.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
                Object obj2 = atomicReferenceFieldUpdater.get(this);
                if (obj2 != null) {
                    if (obj2 instanceof hc.l) {
                        long j5 = hc.l.f6525f.get((hc.l) obj2);
                        if (((int) (1073741823 & j5)) != ((int) ((j5 & 1152921503533105152L) >> 30))) {
                            return 0L;
                        }
                    } else if (obj2 == sVar) {
                        return Long.MAX_VALUE;
                    }
                }
                r0 r0Var = (r0) f2665h.get(this);
                if (r0Var != null) {
                    synchronized (r0Var) {
                        q0[] q0VarArr = r0Var.f6541a;
                        q0Var = q0VarArr != null ? q0VarArr[0] : null;
                    }
                    if (q0Var != null) {
                        long jNanoTime = q0Var.f2659a - System.nanoTime();
                        if (jNanoTime >= 0) {
                            return jNanoTime;
                        }
                    }
                }
                return Long.MAX_VALUE;
            }
        }
        return 0L;
    }

    public void E(Runnable runnable) {
        F();
        if (!G(runnable)) {
            c0.f2605j.E(runnable);
            return;
        }
        Thread threadZ = z();
        if (Thread.currentThread() != threadZ) {
            LockSupport.unpark(threadZ);
        }
    }

    public final void F() {
        q0 q0VarC;
        r0 r0Var = (r0) f2665h.get(this);
        if (r0Var == null || hc.u.f6540b.get(r0Var) == 0) {
            return;
        }
        long jNanoTime = System.nanoTime();
        do {
            synchronized (r0Var) {
                try {
                    q0[] q0VarArr = r0Var.f6541a;
                    q0VarC = null;
                    q0 q0Var = q0VarArr != null ? q0VarArr[0] : null;
                    if (q0Var != null) {
                        q0VarC = ((jNanoTime - q0Var.f2659a) > 0L ? 1 : ((jNanoTime - q0Var.f2659a) == 0L ? 0 : -1)) >= 0 ? G(q0Var) : false ? r0Var.c(0) : null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (q0VarC != null);
    }

    public final boolean G(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2664g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (f2666i.get(this) != 0) {
                return false;
            }
            if (obj == null) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                    if (atomicReferenceFieldUpdater.get(this) != null) {
                    }
                }
                return true;
            }
            if (!(obj instanceof hc.l)) {
                if (obj == b0.f2592c) {
                    return false;
                }
                hc.l lVar = new hc.l(8, true);
                lVar.a((Runnable) obj);
                lVar.a(runnable);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, lVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
                return true;
            }
            hc.l lVar2 = (hc.l) obj;
            int iA = lVar2.a(runnable);
            if (iA == 0) {
                return true;
            }
            if (iA == 1) {
                hc.l lVarC = lVar2.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, lVarC) && atomicReferenceFieldUpdater.get(this) == obj) {
                }
            } else if (iA == 2) {
                return false;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0027  */
    /* JADX WARN: Code duplicated, block: B:20:0x0030  */
    /* JADX WARN: Code duplicated, block: B:22:0x0034  */
    /* JADX WARN: Code duplicated, block: B:24:0x004d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x004e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x004f  */
    public final boolean H() {
        Object obj;
        long j5;
        u8.k kVar = this.f2673e;
        if (kVar != null ? kVar.isEmpty() : true) {
            r0 r0Var = (r0) f2665h.get(this);
            if (r0Var == null) {
                obj = f2664g.get(this);
                if (obj != null) {
                    if (obj instanceof hc.l) {
                        j5 = hc.l.f6525f.get((hc.l) obj);
                        if (((int) (1073741823 & j5)) == ((int) ((j5 & 1152921503533105152L) >> 30))) {
                            return true;
                        }
                        return false;
                    }
                    if (obj == b0.f2592c) {
                    }
                }
                return true;
            }
            if (hc.u.f6540b.get(r0Var) == 0) {
                obj = f2664g.get(this);
                if (obj != null) {
                    if (obj instanceof hc.l) {
                        j5 = hc.l.f6525f.get((hc.l) obj);
                        if (((int) (1073741823 & j5)) == ((int) ((j5 & 1152921503533105152L) >> 30))) {
                            return true;
                        }
                        return false;
                    }
                    if (obj == b0.f2592c) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void I(long j5, q0 q0Var) {
        int iD;
        Thread threadZ;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2665h;
        q0 q0Var2 = null;
        if (f2666i.get(this) != 0) {
            iD = 1;
        } else {
            r0 r0Var = (r0) atomicReferenceFieldUpdater.get(this);
            if (r0Var == null) {
                r0 r0Var2 = new r0();
                r0Var2.f2663c = j5;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, r0Var2) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj = atomicReferenceFieldUpdater.get(this);
                i9.l.b(obj);
                r0Var = (r0) obj;
            }
            iD = q0Var.d(j5, r0Var, this);
        }
        if (iD != 0) {
            if (iD == 1) {
                D(j5, q0Var);
                return;
            } else {
                if (iD != 2) {
                    throw new IllegalStateException("unexpected result");
                }
                return;
            }
        }
        r0 r0Var3 = (r0) atomicReferenceFieldUpdater.get(this);
        if (r0Var3 != null) {
            synchronized (r0Var3) {
                q0[] q0VarArr = r0Var3.f6541a;
                q0Var2 = q0VarArr != null ? q0VarArr[0] : null;
            }
        }
        if (q0Var2 != q0Var || Thread.currentThread() == (threadZ = z())) {
            return;
        }
        LockSupport.unpark(threadZ);
    }

    public l0 c(long j5, Runnable runnable, y8.h hVar) {
        return d0.f2608a.c(j5, runnable, hVar);
    }

    @Override // cc.g0
    public final void e(long j5, l lVar) {
        long j10 = 0;
        if (j5 > 0) {
            j10 = j5 >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j5;
        }
        if (j10 < 4611686018427387903L) {
            long jNanoTime = System.nanoTime();
            o0 o0Var = new o0(this, j10 + jNanoTime, lVar);
            I(jNanoTime, o0Var);
            lVar.s(new h(1, o0Var));
        }
    }

    @Override // cc.u
    public final void g(y8.h hVar, Runnable runnable) {
        E(runnable);
    }

    @Override // cc.t0
    public void shutdown() {
        q0 q0VarC;
        s1.f2667a.set(null);
        f2666i.set(this, 1);
        hc.s sVar = b0.f2592c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2664g;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, null, sVar)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == null);
            } else if (obj instanceof hc.l) {
                ((hc.l) obj).b();
                break;
            } else {
                if (obj == sVar) {
                    break;
                }
                hc.l lVar = new hc.l(8, true);
                lVar.a((Runnable) obj);
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj, lVar)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == obj);
            }
        }
        while (B() <= 0) {
        }
        long jNanoTime = System.nanoTime();
        while (true) {
            r0 r0Var = (r0) f2665h.get(this);
            if (r0Var == null) {
                return;
            }
            synchronized (r0Var) {
                q0VarC = hc.u.f6540b.get(r0Var) > 0 ? r0Var.c(0) : null;
            }
            if (q0VarC == null) {
                return;
            } else {
                D(jNanoTime, q0VarC);
            }
        }
    }
}
