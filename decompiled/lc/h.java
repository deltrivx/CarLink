package lc;

import cc.z1;
import hc.q;
import hc.s;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import t8.z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8375c = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "head$volatile");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f8376d = AtomicLongFieldUpdater.newUpdater(h.class, "deqIdx$volatile");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8377e = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "tail$volatile");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f8378f = AtomicLongFieldUpdater.newUpdater(h.class, "enqIdx$volatile");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f8379g = AtomicIntegerFieldUpdater.newUpdater(h.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cc.k f8381b;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    public h(int i7) {
        this.f8380a = i7;
        if (i7 <= 0) {
            throw new IllegalArgumentException(a2.f.E(i7, "Semaphore should have at least 1 permit, but had ").toString());
        }
        if (i7 < 0) {
            throw new IllegalArgumentException(a2.f.E(i7, "The number of acquired permits should be in 0..").toString());
        }
        k kVar = new k(0L, null, 2);
        this.head$volatile = kVar;
        this.tail$volatile = kVar;
        this._availablePermits$volatile = i7;
        this.f8381b = new cc.k(3, this);
    }

    public final boolean a(z1 z1Var) {
        Object objB;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8377e;
        k kVar = (k) atomicReferenceFieldUpdater.get(this);
        long andIncrement = f8378f.getAndIncrement(this);
        f fVar = f.f8373i;
        long j5 = andIncrement / ((long) j.f8387f);
        loop0: while (true) {
            objB = hc.a.b(kVar, j5, fVar);
            if (!hc.a.e(objB)) {
                q qVarC = hc.a.c(objB);
                while (true) {
                    q qVar = (q) atomicReferenceFieldUpdater.get(this);
                    if (qVar.f6535c >= qVarC.f6535c) {
                        break loop0;
                    }
                    if (!qVarC.j()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, qVar, qVarC)) {
                            if (!qVar.f()) {
                                break loop0;
                            }
                            qVar.e();
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == qVar);
                    if (qVarC.f()) {
                        qVarC.e();
                    }
                }
            } else {
                break;
            }
        }
        k kVar2 = (k) hc.a.c(objB);
        AtomicReferenceArray atomicReferenceArray = kVar2.f8388e;
        int i7 = (int) (andIncrement % ((long) j.f8387f));
        while (!atomicReferenceArray.compareAndSet(i7, null, z1Var)) {
            if (atomicReferenceArray.get(i7) != null) {
                s sVar = j.f8383b;
                s sVar2 = j.f8384c;
                while (!atomicReferenceArray.compareAndSet(i7, sVar, sVar2)) {
                    if (atomicReferenceArray.get(i7) != sVar) {
                        return false;
                    }
                }
                ((cc.j) z1Var).e(z.f12851a, this.f8381b);
                return true;
            }
        }
        z1Var.a(kVar2, i7);
        return true;
    }

    public final void b() {
        int i7;
        Object objB;
        boolean z10;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f8379g;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            int i10 = this.f8380a;
            if (andIncrement >= i10) {
                do {
                    i7 = atomicIntegerFieldUpdater.get(this);
                    if (i7 <= i10) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i7, i10));
                throw new IllegalStateException(("The number of released permits cannot be greater than " + i10).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8375c;
            k kVar = (k) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = f8376d.getAndIncrement(this);
            long j5 = andIncrement2 / ((long) j.f8387f);
            g gVar = g.f8374i;
            while (true) {
                objB = hc.a.b(kVar, j5, gVar);
                if (!hc.a.e(objB)) {
                    q qVarC = hc.a.c(objB);
                    while (true) {
                        q qVar = (q) atomicReferenceFieldUpdater.get(this);
                        if (qVar.f6535c >= qVarC.f6535c) {
                            break;
                        }
                        if (!qVarC.j()) {
                            break;
                        }
                        do {
                            if (atomicReferenceFieldUpdater.compareAndSet(this, qVar, qVarC)) {
                                if (!qVar.f()) {
                                    break;
                                }
                                qVar.e();
                                break;
                            }
                        } while (atomicReferenceFieldUpdater.get(this) == qVar);
                        if (qVarC.f()) {
                            qVarC.e();
                        }
                    }
                } else {
                    break;
                }
            }
            k kVar2 = (k) hc.a.c(objB);
            AtomicReferenceArray atomicReferenceArray = kVar2.f8388e;
            kVar2.a();
            long j10 = kVar2.f6535c;
            z10 = false;
            if (j10 <= j5) {
                int i11 = (int) (andIncrement2 % ((long) j.f8387f));
                Object andSet = atomicReferenceArray.getAndSet(i11, j.f8383b);
                if (andSet == null) {
                    int i12 = j.f8382a;
                    int i13 = 0;
                    while (true) {
                        if (i13 >= i12) {
                            s sVar = j.f8383b;
                            s sVar2 = j.f8385d;
                            do {
                                if (atomicReferenceArray.compareAndSet(i11, sVar, sVar2)) {
                                    z10 = true;
                                    break;
                                }
                            } while (atomicReferenceArray.get(i11) == sVar);
                            z10 = !z10;
                            break;
                        }
                        if (atomicReferenceArray.get(i11) == j.f8384c) {
                            z10 = true;
                            break;
                        }
                        i13++;
                    }
                } else if (andSet != j.f8386e) {
                    boolean z11 = andSet instanceof cc.j;
                    z zVar = z.f12851a;
                    if (z11) {
                        cc.j jVar = (cc.j) andSet;
                        s sVarF = jVar.f(zVar, this.f8381b);
                        if (sVarF != null) {
                            jVar.z(sVarF);
                            z10 = true;
                            break;
                            break;
                        }
                    } else {
                        if (!(andSet instanceof kc.f)) {
                            throw new IllegalStateException(("unexpected: " + andSet).toString());
                        }
                        if (((kc.e) ((kc.f) andSet)).g(this, zVar) == 0) {
                            z10 = true;
                            break;
                            break;
                        }
                    }
                }
            }
        } while (!z10);
    }
}
