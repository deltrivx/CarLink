package jc;

import hc.s;
import i9.x;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a extends Thread {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f7092i = AtomicIntegerFieldUpdater.newUpdater(a.class, "workerCtl$volatile");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f7093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f7094b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f7095c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f7096d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f7097e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f7098f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f7099g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c f7100h;
    private volatile int indexInArray;
    private volatile Object nextParkedWorker;
    private volatile /* synthetic */ int workerCtl$volatile;

    public a(c cVar, int i7) {
        this.f7100h = cVar;
        setDaemon(true);
        setContextClassLoader(c.class.getClassLoader());
        this.f7093a = new m();
        this.f7094b = new x();
        this.f7095c = b.f7104d;
        this.nextParkedWorker = c.k;
        int iNanoTime = (int) System.nanoTime();
        this.f7098f = iNanoTime == 0 ? 42 : iNanoTime;
        f(i7);
    }

    public final i a(boolean z10) {
        i iVarE;
        i iVarE2;
        long j5;
        b bVar = this.f7095c;
        c cVar = this.f7100h;
        i iVar = null;
        m mVar = this.f7093a;
        b bVar2 = b.f7101a;
        if (bVar != bVar2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = c.f7108i;
            do {
                j5 = atomicLongFieldUpdater.get(cVar);
                if (((int) ((9223367638808264704L & j5) >> 42)) == 0) {
                    mVar.getClass();
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m.f7132b;
                        i iVar2 = (i) atomicReferenceFieldUpdater.get(mVar);
                        if (iVar2 == null || !iVar2.f7123b) {
                            int i7 = m.f7134d.get(mVar);
                            int i10 = m.f7133c.get(mVar);
                            while (i7 != i10 && m.f7135e.get(mVar) != 0) {
                                i10--;
                                i iVarC = mVar.c(i10, true);
                                if (iVarC != null) {
                                    iVar = iVarC;
                                    break;
                                }
                            }
                            break;
                        }
                        do {
                            if (atomicReferenceFieldUpdater.compareAndSet(mVar, iVar2, null)) {
                                iVar = iVar2;
                                break loop1;
                            }
                        } while (atomicReferenceFieldUpdater.get(mVar) == iVar2);
                    }
                    if (iVar != null) {
                        return iVar;
                    }
                    i iVar3 = (i) cVar.f7115f.d();
                    return iVar3 == null ? i(1) : iVar3;
                }
            } while (!c.f7108i.compareAndSet(cVar, j5, j5 - 4398046511104L));
            this.f7095c = bVar2;
        }
        if (z10) {
            boolean z11 = d(cVar.f7110a * 2) == 0;
            if (z11 && (iVarE2 = e()) != null) {
                return iVarE2;
            }
            mVar.getClass();
            i iVarB = (i) m.f7132b.getAndSet(mVar, null);
            if (iVarB == null) {
                iVarB = mVar.b();
            }
            if (iVarB != null) {
                return iVarB;
            }
            if (!z11 && (iVarE = e()) != null) {
                return iVarE;
            }
        } else {
            i iVarE3 = e();
            if (iVarE3 != null) {
                return iVarE3;
            }
        }
        return i(3);
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i7) {
        int i10 = this.f7098f;
        int i11 = i10 ^ (i10 << 13);
        int i12 = i11 ^ (i11 >> 17);
        int i13 = i12 ^ (i12 << 5);
        this.f7098f = i13;
        int i14 = i7 - 1;
        return (i14 & i7) == 0 ? i13 & i14 : (i13 & Integer.MAX_VALUE) % i7;
    }

    public final i e() {
        int iD = d(2);
        c cVar = this.f7100h;
        if (iD == 0) {
            i iVar = (i) cVar.f7114e.d();
            return iVar != null ? iVar : (i) cVar.f7115f.d();
        }
        i iVar2 = (i) cVar.f7115f.d();
        return iVar2 != null ? iVar2 : (i) cVar.f7114e.d();
    }

    public final void f(int i7) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f7100h.f7113d);
        sb2.append("-worker-");
        sb2.append(i7 == 0 ? "TERMINATED" : String.valueOf(i7));
        setName(sb2.toString());
        this.indexInArray = i7;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(b bVar) {
        b bVar2 = this.f7095c;
        boolean z10 = bVar2 == b.f7101a;
        if (z10) {
            c.f7108i.addAndGet(this.f7100h, 4398046511104L);
        }
        if (bVar2 != bVar) {
            this.f7095c = bVar;
        }
        return z10;
    }

    public final i i(int i7) {
        long j5;
        i iVarC;
        long j10;
        long j11;
        i iVar;
        AtomicLongFieldUpdater atomicLongFieldUpdater = c.f7108i;
        c cVar = this.f7100h;
        int i10 = (int) (atomicLongFieldUpdater.get(cVar) & 2097151);
        i iVar2 = null;
        if (i10 < 2) {
            return null;
        }
        int iD = d(i10);
        int i11 = 0;
        long jMin = Long.MAX_VALUE;
        while (i11 < i10) {
            iD++;
            if (iD > i10) {
                iD = 1;
            }
            a aVar = (a) cVar.f7116g.b(iD);
            if (aVar != null && aVar != this) {
                m mVar = aVar.f7093a;
                if (i7 != 3) {
                    mVar.getClass();
                    int i12 = m.f7134d.get(mVar);
                    int i13 = m.f7133c.get(mVar);
                    boolean z10 = i7 == 1;
                    while (true) {
                        if (i12 != i13) {
                            j5 = 0;
                            if (!z10 || m.f7135e.get(mVar) != 0) {
                                int i14 = i12 + 1;
                                iVarC = mVar.c(i12, z10);
                                if (iVarC != null) {
                                    break;
                                }
                                i12 = i14;
                            }
                        } else {
                            j5 = 0;
                        }
                        iVarC = iVar2;
                        break;
                    }
                } else {
                    iVarC = mVar.b();
                    j5 = 0;
                }
                x xVar = this.f7094b;
                if (iVarC == null) {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m.f7132b;
                        i iVar3 = (i) atomicReferenceFieldUpdater.get(mVar);
                        if (iVar3 == null) {
                            j10 = -1;
                        } else {
                            j10 = -1;
                            if (((iVar3.f7123b ? 1 : 2) & i7) != 0) {
                                k.f7130f.getClass();
                                m mVar2 = mVar;
                                long jNanoTime = System.nanoTime() - iVar3.f7122a;
                                long j12 = k.f7126b;
                                if (jNanoTime < j12) {
                                    j11 = j12 - jNanoTime;
                                    iVar = null;
                                    break;
                                }
                                do {
                                    iVar = null;
                                    if (atomicReferenceFieldUpdater.compareAndSet(mVar2, iVar3, null)) {
                                        xVar.f6688a = iVar3;
                                        j11 = -1;
                                        break;
                                    }
                                } while (atomicReferenceFieldUpdater.get(mVar2) == iVar3);
                                mVar = mVar2;
                                iVar2 = null;
                            }
                        }
                        j11 = -2;
                        iVar = iVar2;
                        break;
                    }
                } else {
                    xVar.f6688a = iVarC;
                    iVar = iVar2;
                    j11 = -1;
                    j10 = -1;
                }
                if (j11 == j10) {
                    i iVar4 = (i) xVar.f6688a;
                    xVar.f6688a = iVar;
                    return iVar4;
                }
                if (j11 > j5) {
                    jMin = Math.min(jMin, j11);
                }
            }
            i11++;
            iVar2 = null;
        }
        if (jMin == Long.MAX_VALUE) {
            jMin = 0;
        }
        this.f7097e = jMin;
        return null;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        long j5;
        loop0: while (true) {
            boolean z10 = false;
            while (true) {
                if (c.f7109j.get(this.f7100h) == 0) {
                    b bVar = this.f7095c;
                    b bVar2 = b.f7105e;
                    if (bVar == bVar2) {
                        break loop0;
                    }
                    i iVarA = a(this.f7099g);
                    if (iVarA != null) {
                        this.f7097e = 0L;
                        c cVar = this.f7100h;
                        this.f7096d = 0L;
                        if (this.f7095c == b.f7103c) {
                            this.f7095c = b.f7102b;
                        }
                        if (!iVarA.f7123b) {
                            try {
                                iVarA.run();
                                break;
                            } catch (Throwable th) {
                                Thread threadCurrentThread = Thread.currentThread();
                                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
                                break;
                            }
                        }
                        if (h(b.f7102b) && !cVar.g() && !cVar.e(c.f7108i.get(cVar))) {
                            cVar.g();
                        }
                        try {
                            iVarA.run();
                        } catch (Throwable th2) {
                            Thread threadCurrentThread2 = Thread.currentThread();
                            threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th2);
                        }
                        c.f7108i.addAndGet(cVar, -2097152L);
                        if (this.f7095c == bVar2) {
                            break;
                        }
                        this.f7095c = b.f7104d;
                        break;
                    }
                    this.f7099g = false;
                    if (this.f7097e == 0) {
                        Object obj = this.nextParkedWorker;
                        s sVar = c.k;
                        if (obj != sVar) {
                            f7092i.set(this, -1);
                            while (this.nextParkedWorker != c.k) {
                                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f7092i;
                                if (atomicIntegerFieldUpdater.get(this) != -1) {
                                    break;
                                }
                                c cVar2 = this.f7100h;
                                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = c.f7109j;
                                if (atomicIntegerFieldUpdater2.get(cVar2) != 0) {
                                    break;
                                }
                                b bVar3 = this.f7095c;
                                b bVar4 = b.f7105e;
                                if (bVar3 == bVar4) {
                                    break;
                                }
                                h(b.f7103c);
                                Thread.interrupted();
                                if (this.f7096d == 0) {
                                    j5 = 2097151;
                                    this.f7096d = System.nanoTime() + this.f7100h.f7112c;
                                } else {
                                    j5 = 2097151;
                                }
                                LockSupport.parkNanos(this.f7100h.f7112c);
                                if (System.nanoTime() - this.f7096d >= 0) {
                                    this.f7096d = 0L;
                                    c cVar3 = this.f7100h;
                                    synchronized (cVar3.f7116g) {
                                        try {
                                            if (!(atomicIntegerFieldUpdater2.get(cVar3) != 0)) {
                                                AtomicLongFieldUpdater atomicLongFieldUpdater = c.f7108i;
                                                if (((int) (atomicLongFieldUpdater.get(cVar3) & j5)) > cVar3.f7110a) {
                                                    if (atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                        int i7 = this.indexInArray;
                                                        f(0);
                                                        cVar3.d(this, i7, 0);
                                                        int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(cVar3) & j5);
                                                        if (andDecrement != i7) {
                                                            Object objB = cVar3.f7116g.b(andDecrement);
                                                            i9.l.b(objB);
                                                            a aVar = (a) objB;
                                                            cVar3.f7116g.c(i7, aVar);
                                                            aVar.f(i7);
                                                            cVar3.d(aVar, andDecrement, i7);
                                                        }
                                                        cVar3.f7116g.c(andDecrement, null);
                                                        this.f7095c = bVar4;
                                                    }
                                                }
                                            }
                                        } catch (Throwable th3) {
                                            throw th3;
                                        }
                                    }
                                }
                            }
                        } else {
                            c cVar4 = this.f7100h;
                            if (this.nextParkedWorker == sVar) {
                                AtomicLongFieldUpdater atomicLongFieldUpdater2 = c.f7107h;
                                while (true) {
                                    long j10 = atomicLongFieldUpdater2.get(cVar4);
                                    int i10 = this.indexInArray;
                                    this.nextParkedWorker = cVar4.f7116g.b((int) (j10 & 2097151));
                                    c cVar5 = cVar4;
                                    if (c.f7107h.compareAndSet(cVar5, j10, ((j10 + 2097152) & (-2097152)) | ((long) i10))) {
                                        break;
                                    } else {
                                        cVar4 = cVar5;
                                    }
                                }
                            }
                        }
                    } else {
                        if (z10) {
                            h(b.f7103c);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f7097e);
                            this.f7097e = 0L;
                            break;
                        }
                        z10 = true;
                    }
                } else {
                    break loop0;
                }
            }
        }
        h(b.f7105e);
    }
}
