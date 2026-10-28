package jc;

import cc.b0;
import hc.o;
import hc.s;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Executor, Closeable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f7107h = AtomicLongFieldUpdater.newUpdater(c.class, "parkedWorkersStack$volatile");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f7108i = AtomicLongFieldUpdater.newUpdater(c.class, "controlState$volatile");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f7109j = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isTerminated$volatile");
    public static final s k = new s(0, "NOT_IN_STACK");
    private volatile /* synthetic */ int _isTerminated$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f7112c;
    private volatile /* synthetic */ long controlState$volatile;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f7113d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f f7114e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f f7115f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o f7116g;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    public c(int i7, int i10, long j5, String str) {
        this.f7110a = i7;
        this.f7111b = i10;
        this.f7112c = j5;
        this.f7113d = str;
        if (i7 < 1) {
            throw new IllegalArgumentException(a2.f.F("Core pool size ", " should be at least 1", i7).toString());
        }
        if (i10 < i7) {
            throw new IllegalArgumentException(a2.f.D(i10, i7, "Max pool size ", " should be greater than or equals to core pool size ").toString());
        }
        if (i10 > 2097150) {
            throw new IllegalArgumentException(a2.f.F("Max pool size ", " should not exceed maximal supported number of threads 2097150", i10).toString());
        }
        if (j5 <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j5 + " must be positive").toString());
        }
        this.f7114e = new f();
        this.f7115f = new f();
        this.f7116g = new o((i7 + 1) * 2);
        this.controlState$volatile = ((long) i7) << 42;
        this._isTerminated$volatile = 0;
    }

    public static /* synthetic */ void c(c cVar, Runnable runnable, int i7) {
        cVar.b(runnable, false, (i7 & 4) == 0);
    }

    public final int a() {
        synchronized (this.f7116g) {
            try {
                if (f7109j.get(this) != 0) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f7108i;
                long j5 = atomicLongFieldUpdater.get(this);
                int i7 = (int) (j5 & 2097151);
                int i10 = i7 - ((int) ((j5 & 4398044413952L) >> 21));
                if (i10 < 0) {
                    i10 = 0;
                }
                if (i10 >= this.f7110a) {
                    return 0;
                }
                if (i7 >= this.f7111b) {
                    return 0;
                }
                int i11 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i11 <= 0 || this.f7116g.b(i11) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                a aVar = new a(this, i11);
                this.f7116g.c(i11, aVar);
                if (i11 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i12 = i10 + 1;
                aVar.start();
                return i12;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(Runnable runnable, boolean z10, boolean z11) {
        i jVar;
        b bVar;
        k.f7130f.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof i) {
            jVar = (i) runnable;
            jVar.f7122a = jNanoTime;
            jVar.f7123b = z10;
        } else {
            jVar = new j(runnable, jNanoTime, z10);
        }
        boolean z12 = jVar.f7123b;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f7108i;
        long jAddAndGet = z12 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread threadCurrentThread = Thread.currentThread();
        a aVar = threadCurrentThread instanceof a ? (a) threadCurrentThread : null;
        if (aVar == null || !i9.l.a(aVar.f7100h, this)) {
            aVar = null;
        }
        if (aVar != null && (bVar = aVar.f7095c) != b.f7105e && (jVar.f7123b || bVar != b.f7102b)) {
            aVar.f7099g = true;
            m mVar = aVar.f7093a;
            if (z11) {
                jVar = mVar.a(jVar);
            } else {
                mVar.getClass();
                i iVar = (i) m.f7132b.getAndSet(mVar, jVar);
                jVar = iVar == null ? null : mVar.a(iVar);
            }
        }
        if (jVar != null) {
            if (!(jVar.f7123b ? this.f7115f.a(jVar) : this.f7114e.a(jVar))) {
                throw new RejectedExecutionException(ob.a.s(new StringBuilder(), this.f7113d, " was terminated"));
            }
        }
        boolean z13 = z11 && aVar != null;
        if (z12) {
            if (z13 || g() || e(jAddAndGet)) {
                return;
            }
            g();
            return;
        }
        if (z13 || g() || e(atomicLongFieldUpdater.get(this))) {
            return;
        }
        g();
    }

    /* JADX WARN: Code duplicated, block: B:39:0x008a  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws InterruptedException {
        int i7;
        i iVarA;
        if (f7109j.compareAndSet(this, 0, 1)) {
            Thread threadCurrentThread = Thread.currentThread();
            a aVar = threadCurrentThread instanceof a ? (a) threadCurrentThread : null;
            if (aVar == null || !i9.l.a(aVar.f7100h, this)) {
                aVar = null;
            }
            synchronized (this.f7116g) {
                i7 = (int) (f7108i.get(this) & 2097151);
            }
            if (1 <= i7) {
                int i10 = 1;
                while (true) {
                    Object objB = this.f7116g.b(i10);
                    i9.l.b(objB);
                    a aVar2 = (a) objB;
                    if (aVar2 != aVar) {
                        while (aVar2.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(aVar2);
                            aVar2.join(10000L);
                        }
                        m mVar = aVar2.f7093a;
                        f fVar = this.f7115f;
                        mVar.getClass();
                        i iVar = (i) m.f7132b.getAndSet(mVar, null);
                        if (iVar != null) {
                            fVar.a(iVar);
                        }
                        while (true) {
                            i iVarB = mVar.b();
                            if (iVarB == null) {
                                break;
                            } else {
                                fVar.a(iVarB);
                            }
                        }
                    }
                    if (i10 == i7) {
                        break;
                    } else {
                        i10++;
                    }
                }
            }
            this.f7115f.b();
            this.f7114e.b();
            while (true) {
                if (aVar != null) {
                    iVarA = aVar.a(true);
                    if (iVarA == null) {
                        iVarA = (i) this.f7114e.d();
                        if (iVarA == null) {
                            break;
                            break;
                        }
                    }
                } else {
                    iVarA = (i) this.f7114e.d();
                    if (iVarA == null && (iVarA = (i) this.f7115f.d()) == null) {
                        break;
                    }
                }
                try {
                    iVarA.run();
                } catch (Throwable th) {
                    Thread threadCurrentThread2 = Thread.currentThread();
                    threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
                }
            }
            if (aVar != null) {
                aVar.h(b.f7105e);
            }
            f7107h.set(this, 0L);
            f7108i.set(this, 0L);
        }
    }

    public final void d(a aVar, int i7, int i10) {
        while (true) {
            long j5 = f7107h.get(this);
            int iB = (int) (2097151 & j5);
            long j10 = (2097152 + j5) & (-2097152);
            if (iB == i7) {
                if (i10 == 0) {
                    Object objC = aVar.c();
                    while (true) {
                        if (objC == k) {
                            iB = -1;
                            break;
                        }
                        if (objC == null) {
                            iB = 0;
                            break;
                        }
                        a aVar2 = (a) objC;
                        iB = aVar2.b();
                        if (iB != 0) {
                            break;
                        } else {
                            objC = aVar2.c();
                        }
                    }
                } else {
                    iB = i10;
                }
            }
            if (iB >= 0) {
                if (f7107h.compareAndSet(this, j5, j10 | ((long) iB))) {
                    return;
                }
            }
        }
    }

    public final boolean e(long j5) {
        int i7 = ((int) (2097151 & j5)) - ((int) ((j5 & 4398044413952L) >> 21));
        if (i7 < 0) {
            i7 = 0;
        }
        int i10 = this.f7110a;
        if (i7 < i10) {
            int iA = a();
            if (iA == 1 && i10 > 1) {
                a();
            }
            if (iA > 0) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        c(this, runnable, 6);
    }

    public final boolean g() {
        s sVar;
        int iB;
        while (true) {
            long j5 = f7107h.get(this);
            a aVar = (a) this.f7116g.b((int) (2097151 & j5));
            if (aVar == null) {
                aVar = null;
            } else {
                long j10 = (2097152 + j5) & (-2097152);
                Object objC = aVar.c();
                while (true) {
                    sVar = k;
                    if (objC == sVar) {
                        iB = -1;
                        break;
                    }
                    if (objC == null) {
                        iB = 0;
                        break;
                    }
                    a aVar2 = (a) objC;
                    iB = aVar2.b();
                    if (iB != 0) {
                        break;
                    }
                    objC = aVar2.c();
                }
                if (iB >= 0) {
                    if (f7107h.compareAndSet(this, j5, ((long) iB) | j10)) {
                        aVar.g(sVar);
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            if (aVar == null) {
                return false;
            }
            if (a.f7092i.compareAndSet(aVar, -1, 0)) {
                LockSupport.unpark(aVar);
                return true;
            }
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        o oVar = this.f7116g;
        int iA = oVar.a();
        int i7 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 1; i14 < iA; i14++) {
            a aVar = (a) oVar.b(i14);
            if (aVar != null) {
                m mVar = aVar.f7093a;
                mVar.getClass();
                int i15 = m.f7132b.get(mVar) != null ? (m.f7133c.get(mVar) - m.f7134d.get(mVar)) + 1 : m.f7133c.get(mVar) - m.f7134d.get(mVar);
                int iOrdinal = aVar.f7095c.ordinal();
                if (iOrdinal == 0) {
                    i7++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i15);
                    sb2.append('c');
                    arrayList.add(sb2.toString());
                } else if (iOrdinal == 1) {
                    i10++;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(i15);
                    sb3.append('b');
                    arrayList.add(sb3.toString());
                } else if (iOrdinal == 2) {
                    i11++;
                } else if (iOrdinal == 3) {
                    i12++;
                    if (i15 > 0) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(i15);
                        sb4.append('d');
                        arrayList.add(sb4.toString());
                    }
                } else {
                    if (iOrdinal != 4) {
                        throw new cc.s();
                    }
                    i13++;
                }
            }
        }
        long j5 = f7108i.get(this);
        StringBuilder sb5 = new StringBuilder();
        sb5.append(this.f7113d);
        sb5.append('@');
        sb5.append(b0.l(this));
        sb5.append("[Pool Size {core = ");
        int i16 = this.f7110a;
        sb5.append(i16);
        sb5.append(", max = ");
        sb5.append(this.f7111b);
        sb5.append("}, Worker States {CPU = ");
        sb5.append(i7);
        sb5.append(", blocking = ");
        sb5.append(i10);
        sb5.append(", parked = ");
        sb5.append(i11);
        sb5.append(", dormant = ");
        sb5.append(i12);
        sb5.append(", terminated = ");
        sb5.append(i13);
        sb5.append("}, running workers queues = ");
        sb5.append(arrayList);
        sb5.append(", global CPU queue size = ");
        sb5.append(this.f7114e.c());
        sb5.append(", global blocking queue size = ");
        sb5.append(this.f7115f.c());
        sb5.append(", Control State {created workers= ");
        sb5.append((int) (2097151 & j5));
        sb5.append(", blocking tasks = ");
        sb5.append((int) ((4398044413952L & j5) >> 21));
        sb5.append(", CPUs acquired = ");
        sb5.append(i16 - ((int) ((j5 & 9223367638808264704L) >> 42)));
        sb5.append("}]");
        return sb5.toString();
    }
}
