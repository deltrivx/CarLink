package ec;

import cc.b0;
import cc.z1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import t8.z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class h implements l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f4700b = AtomicLongFieldUpdater.newUpdater(h.class, "sendersAndCloseStatus$volatile");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f4701c = AtomicLongFieldUpdater.newUpdater(h.class, "receivers$volatile");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f4702d = AtomicLongFieldUpdater.newUpdater(h.class, "bufferEnd$volatile");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f4703e = AtomicLongFieldUpdater.newUpdater(h.class, "completedExpandBuffersAndPauseFlag$volatile");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4704f = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "sendSegment$volatile");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4705g = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "receiveSegment$volatile");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4706h = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "bufferEndSegment$volatile");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4707i = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_closeCause$volatile");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4708j = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "closeHandler$volatile");
    private volatile /* synthetic */ Object _closeCause$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4709a;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    public h(int i7) {
        this.f4709a = i7;
        if (i7 < 0) {
            throw new IllegalArgumentException(a2.f.F("Invalid channel capacity: ", ", should be >=0", i7).toString());
        }
        p pVar = j.f4711a;
        this.bufferEnd$volatile = i7 != 0 ? i7 != Integer.MAX_VALUE ? i7 : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = f4702d.get(this);
        p pVar2 = new p(0L, null, this, 3);
        this.sendSegment$volatile = pVar2;
        this.receiveSegment$volatile = pVar2;
        if (z()) {
            pVar2 = j.f4711a;
            i9.l.c(pVar2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment$volatile = pVar2;
        this._closeCause$volatile = j.f4728s;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public static Object C(h hVar, a9.c cVar) {
        f fVar;
        p pVar;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i7 = fVar.f4696c;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                fVar.f4696c = i7 - Integer.MIN_VALUE;
            } else {
                fVar = new f(hVar, cVar);
            }
        } else {
            fVar = new f(hVar, cVar);
        }
        f fVar2 = fVar;
        Object obj = fVar2.f4694a;
        int i10 = fVar2.f4696c;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t8.a.e(obj);
            return ((o) obj).f4733a;
        }
        t8.a.e(obj);
        p pVar2 = (p) f4705g.get(hVar);
        while (!hVar.w()) {
            long andIncrement = f4701c.getAndIncrement(hVar);
            long j5 = j.f4712b;
            long j10 = andIncrement / j5;
            int i11 = (int) (andIncrement % j5);
            if (pVar2.f6535c != j10) {
                p pVarO = hVar.o(j10, pVar2);
                if (pVarO == null) {
                    continue;
                } else {
                    pVar = pVarO;
                }
            } else {
                pVar = pVar2;
            }
            h hVar2 = hVar;
            Object objH = hVar2.H(pVar, i11, andIncrement, null);
            if (objH == j.f4722m) {
                throw new IllegalStateException("unexpected");
            }
            if (objH != j.f4724o) {
                if (objH != j.f4723n) {
                    pVar.a();
                    return objH;
                }
                fVar2.f4696c = 1;
                Object objD = hVar2.D(pVar, i11, andIncrement, fVar2);
                z8.a aVar = z8.a.f15774a;
                return objD == aVar ? aVar : objD;
            }
            if (andIncrement < hVar2.s()) {
                pVar.a();
            }
            pVar2 = pVar;
            hVar = hVar2;
        }
        return new m(hVar.p());
    }

    public static final p b(h hVar, long j5, p pVar) {
        Object objB;
        h hVar2;
        p pVar2 = j.f4711a;
        i iVar = i.f4710i;
        loop0: while (true) {
            objB = hc.a.b(pVar, j5, iVar);
            if (!hc.a.e(objB)) {
                hc.q qVarC = hc.a.c(objB);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4704f;
                    hc.q qVar = (hc.q) atomicReferenceFieldUpdater.get(hVar);
                    if (qVar.f6535c >= qVarC.f6535c) {
                        break loop0;
                    }
                    if (!qVarC.j()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(hVar, qVar, qVarC)) {
                            if (!qVar.f()) {
                                break loop0;
                            }
                            qVar.e();
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(hVar) == qVar);
                    if (qVarC.f()) {
                        qVarC.e();
                    }
                }
            } else {
                break;
            }
        }
        boolean zE = hc.a.e(objB);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f4701c;
        if (zE) {
            hVar.l();
            if (pVar.f6535c * ((long) j.f4712b) < atomicLongFieldUpdater.get(hVar)) {
                pVar.a();
                return null;
            }
        } else {
            p pVar3 = (p) hc.a.c(objB);
            long j10 = pVar3.f6535c;
            if (j10 <= j5) {
                return pVar3;
            }
            long j11 = ((long) j.f4712b) * j10;
            while (true) {
                long j12 = f4700b.get(hVar);
                long j13 = 1152921504606846975L & j12;
                if (j13 >= j11) {
                    hVar2 = hVar;
                    break;
                }
                hVar2 = hVar;
                if (f4700b.compareAndSet(hVar2, j12, (((long) ((int) (j12 >> 60))) << 60) + j13)) {
                    break;
                }
                hVar = hVar2;
            }
            if (j10 * ((long) j.f4712b) < atomicLongFieldUpdater.get(hVar2)) {
                pVar3.a();
            }
        }
        return null;
    }

    public static final void d(h hVar, Object obj, cc.l lVar) {
        lVar.resumeWith(t8.a.b(hVar.r()));
    }

    public static final int e(h hVar, p pVar, int i7, Object obj, long j5, Object obj2, boolean z10) {
        pVar.n(i7, obj);
        if (z10) {
            return hVar.I(pVar, i7, obj, j5, obj2, z10);
        }
        Object objL = pVar.l(i7);
        if (objL == null) {
            if (hVar.f(j5)) {
                if (pVar.k(i7, null, j.f4714d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (pVar.k(i7, null, obj2)) {
                    return 2;
                }
            }
        } else if (objL instanceof z1) {
            pVar.n(i7, null);
            if (hVar.F(objL, obj)) {
                pVar.o(i7, j.f4719i);
                return 0;
            }
            hc.s sVar = j.k;
            if (pVar.f4735f.getAndSet((i7 * 2) + 1, sVar) == sVar) {
                return 5;
            }
            pVar.m(i7, true);
            return 5;
        }
        return hVar.I(pVar, i7, obj, j5, obj2, z10);
    }

    public static void t(h hVar) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f4703e;
        if ((atomicLongFieldUpdater.addAndGet(hVar, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(hVar) & 4611686018427387904L) != 0) {
            }
        }
    }

    public final void A(long j5, p pVar) {
        p pVar2;
        p pVar3;
        while (pVar.f6535c < j5 && (pVar3 = (p) pVar.c()) != null) {
            pVar = pVar3;
        }
        while (true) {
            if (!pVar.d() || (pVar2 = (p) pVar.c()) == null) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4706h;
                    hc.q qVar = (hc.q) atomicReferenceFieldUpdater.get(this);
                    if (qVar.f6535c >= pVar.f6535c) {
                        return;
                    }
                    if (!pVar.j()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, qVar, pVar)) {
                            if (qVar.f()) {
                                qVar.e();
                                return;
                            }
                            return;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == qVar);
                    if (pVar.f()) {
                        pVar.e();
                    }
                }
            } else {
                pVar = pVar2;
            }
        }
    }

    public final Object B(Object obj, y8.c cVar) {
        cc.l lVar = new cc.l(1, n4.h.L(cVar));
        lVar.p();
        lVar.resumeWith(t8.a.b(r()));
        Object objO = lVar.o();
        return objO == z8.a.f15774a ? objO : z.f12851a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object D(p pVar, int i7, long j5, a9.c cVar) {
        g gVar;
        p pVar2;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i10 = gVar.f4699c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                gVar.f4699c = i10 - Integer.MIN_VALUE;
            } else {
                gVar = new g(this, cVar);
            }
        } else {
            gVar = new g(this, cVar);
        }
        Object objO = gVar.f4697a;
        int i11 = gVar.f4699c;
        if (i11 == 0) {
            t8.a.e(objO);
            gVar.f4699c = 1;
            cc.l lVarN = b0.n(n4.h.L(gVar));
            try {
                v vVar = new v(lVarN);
                Object objH = H(pVar, i7, j5, vVar);
                if (objH == j.f4722m) {
                    vVar.a(pVar, i7);
                } else if (objH == j.f4724o) {
                    if (j5 < s()) {
                        pVar.a();
                    }
                    p pVar3 = (p) f4705g.get(this);
                    while (true) {
                        if (w()) {
                            lVarN.resumeWith(new o(new m(p())));
                            break;
                        }
                        long andIncrement = f4701c.getAndIncrement(this);
                        long j10 = j.f4712b;
                        long j11 = andIncrement / j10;
                        int i12 = (int) (andIncrement % j10);
                        if (pVar3.f6535c != j11) {
                            p pVarO = o(j11, pVar3);
                            if (pVarO != null) {
                                pVar2 = pVarO;
                            }
                        } else {
                            pVar2 = pVar3;
                        }
                        Object objH2 = H(pVar2, i12, andIncrement, vVar);
                        p pVar4 = pVar2;
                        if (objH2 == j.f4722m) {
                            vVar.a(pVar4, i12);
                            break;
                        }
                        if (objH2 != j.f4724o) {
                            if (objH2 == j.f4723n) {
                                throw new IllegalStateException("unexpected");
                            }
                            pVar4.a();
                            lVarN.e(new o(objH2), null);
                            break;
                        }
                        if (andIncrement < s()) {
                            pVar4.a();
                        }
                        pVar3 = pVar4;
                    }
                } else {
                    pVar.a();
                    lVarN.e(new o(objH), null);
                }
                objO = lVarN.o();
                z8.a aVar = z8.a.f15774a;
                if (objO == aVar) {
                    return aVar;
                }
            } catch (Throwable th) {
                lVarN.v();
                throw th;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t8.a.e(objO);
        }
        return ((o) objO).f4733a;
    }

    public final void E(z1 z1Var, boolean z10) {
        if (z1Var instanceof cc.j) {
            ((y8.c) z1Var).resumeWith(t8.a.b(z10 ? q() : r()));
            return;
        }
        if (z1Var instanceof v) {
            ((v) z1Var).f4737a.resumeWith(new o(new m(p())));
            return;
        }
        if (!(z1Var instanceof c)) {
            if (z1Var instanceof kc.f) {
                ((kc.e) ((kc.f) z1Var)).g(this, j.f4721l);
                return;
            } else {
                throw new IllegalStateException(("Unexpected waiter: " + z1Var).toString());
            }
        }
        c cVar = (c) z1Var;
        cc.l lVar = cVar.f4690b;
        i9.l.b(lVar);
        cVar.f4690b = null;
        cVar.f4689a = j.f4721l;
        Throwable thP = cVar.f4691c.p();
        if (thP == null) {
            lVar.resumeWith(Boolean.FALSE);
        } else {
            lVar.resumeWith(t8.a.b(thP));
        }
    }

    public final boolean F(Object obj, Object obj2) {
        if (obj instanceof kc.f) {
            return ((kc.e) ((kc.f) obj)).g(this, obj2) == 0;
        }
        if (obj instanceof v) {
            return j.a(((v) obj).f4737a, new o(obj2), null);
        }
        if (!(obj instanceof c)) {
            if (obj instanceof cc.j) {
                return j.a((cc.j) obj, obj2, null);
            }
            throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
        }
        c cVar = (c) obj;
        cc.l lVar = cVar.f4690b;
        i9.l.b(lVar);
        cVar.f4690b = null;
        cVar.f4689a = obj2;
        Boolean bool = Boolean.TRUE;
        cVar.f4691c.getClass();
        return j.a(lVar, bool, null);
    }

    public final boolean G(Object obj, p pVar, int i7) {
        kc.i iVar;
        boolean z10 = obj instanceof cc.j;
        z zVar = z.f12851a;
        if (z10) {
            return j.a((cc.j) obj, zVar, null);
        }
        if (!(obj instanceof kc.f)) {
            throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
        }
        int iG = ((kc.e) obj).g(this, zVar);
        kc.i iVar2 = kc.i.f7532a;
        kc.i iVar3 = kc.i.f7533b;
        if (iG == 0) {
            iVar = iVar2;
        } else if (iG == 1) {
            iVar = iVar3;
        } else if (iG == 2) {
            iVar = kc.i.f7534c;
        } else {
            if (iG != 3) {
                throw new IllegalStateException(("Unexpected internal result: " + iG).toString());
            }
            iVar = kc.i.f7535d;
        }
        if (iVar == iVar3) {
            pVar.n(i7, null);
        }
        return iVar == iVar2;
    }

    public final Object H(p pVar, int i7, long j5, Object obj) {
        Object objL = pVar.l(i7);
        AtomicReferenceArray atomicReferenceArray = pVar.f4735f;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f4700b;
        if (objL == null) {
            if (j5 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return j.f4723n;
                }
                if (pVar.k(i7, objL, obj)) {
                    n();
                    return j.f4722m;
                }
            }
        } else if (objL == j.f4714d && pVar.k(i7, objL, j.f4719i)) {
            n();
            Object obj2 = atomicReferenceArray.get(i7 * 2);
            pVar.n(i7, null);
            return obj2;
        }
        while (true) {
            Object objL2 = pVar.l(i7);
            if (objL2 == null || objL2 == j.f4715e) {
                if (j5 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (pVar.k(i7, objL2, j.f4718h)) {
                        n();
                        return j.f4724o;
                    }
                } else {
                    if (obj == null) {
                        return j.f4723n;
                    }
                    if (pVar.k(i7, objL2, obj)) {
                        n();
                        return j.f4722m;
                    }
                }
            } else {
                if (objL2 != j.f4714d) {
                    hc.s sVar = j.f4720j;
                    if (objL2 != sVar && objL2 != j.f4718h) {
                        if (objL2 == j.f4721l) {
                            n();
                            return j.f4724o;
                        }
                        if (objL2 != j.f4717g && pVar.k(i7, objL2, j.f4716f)) {
                            boolean z10 = objL2 instanceof y;
                            if (z10) {
                                objL2 = ((y) objL2).f4738a;
                            }
                            if (G(objL2, pVar, i7)) {
                                pVar.o(i7, j.f4719i);
                                n();
                                Object obj3 = atomicReferenceArray.get(i7 * 2);
                                pVar.n(i7, null);
                                return obj3;
                            }
                            pVar.o(i7, sVar);
                            pVar.i();
                            if (z10) {
                                n();
                            }
                            return j.f4724o;
                        }
                    }
                    return j.f4724o;
                }
                if (pVar.k(i7, objL2, j.f4719i)) {
                    n();
                    Object obj4 = atomicReferenceArray.get(i7 * 2);
                    pVar.n(i7, null);
                    return obj4;
                }
            }
        }
    }

    public final int I(p pVar, int i7, Object obj, long j5, Object obj2, boolean z10) {
        while (true) {
            Object objL = pVar.l(i7);
            if (objL == null) {
                if (!f(j5) || z10) {
                    if (z10) {
                        if (pVar.k(i7, null, j.f4720j)) {
                            pVar.i();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (pVar.k(i7, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (pVar.k(i7, null, j.f4714d)) {
                    break;
                }
            } else {
                if (objL != j.f4715e) {
                    hc.s sVar = j.k;
                    if (objL == sVar) {
                        pVar.n(i7, null);
                        return 5;
                    }
                    if (objL == j.f4718h) {
                        pVar.n(i7, null);
                        return 5;
                    }
                    if (objL == j.f4721l) {
                        pVar.n(i7, null);
                        l();
                        return 4;
                    }
                    pVar.n(i7, null);
                    if (objL instanceof y) {
                        objL = ((y) objL).f4738a;
                    }
                    if (F(objL, obj)) {
                        pVar.o(i7, j.f4719i);
                        return 0;
                    }
                    if (pVar.f4735f.getAndSet((i7 * 2) + 1, sVar) != sVar) {
                        pVar.m(i7, true);
                    }
                    return 5;
                }
                if (pVar.k(i7, objL, j.f4714d)) {
                    break;
                }
            }
        }
        return 1;
    }

    public final void J(long j5) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        h hVar = this;
        if (hVar.z()) {
            return;
        }
        while (true) {
            atomicLongFieldUpdater = f4702d;
            if (atomicLongFieldUpdater.get(hVar) > j5) {
                break;
            } else {
                hVar = this;
            }
        }
        int i7 = j.f4713c;
        int i10 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f4703e;
            if (i10 < i7) {
                long j10 = atomicLongFieldUpdater.get(hVar);
                if (j10 == (4611686018427387903L & atomicLongFieldUpdater2.get(hVar)) && j10 == atomicLongFieldUpdater.get(hVar)) {
                    return;
                } else {
                    i10++;
                }
            } else {
                while (true) {
                    long j11 = atomicLongFieldUpdater2.get(hVar);
                    if (atomicLongFieldUpdater2.compareAndSet(hVar, j11, (j11 & 4611686018427387903L) + 4611686018427387904L)) {
                        break;
                    } else {
                        hVar = this;
                    }
                }
                while (true) {
                    long j12 = atomicLongFieldUpdater.get(hVar);
                    long j13 = atomicLongFieldUpdater2.get(hVar);
                    long j14 = j13 & 4611686018427387903L;
                    boolean z10 = (j13 & 4611686018427387904L) != 0;
                    if (j12 == j14 && j12 == atomicLongFieldUpdater.get(hVar)) {
                        break;
                    }
                    if (z10) {
                        hVar = this;
                    } else {
                        hVar = this;
                        atomicLongFieldUpdater2.compareAndSet(hVar, j13, 4611686018427387904L + j14);
                    }
                }
                while (true) {
                    long j15 = atomicLongFieldUpdater2.get(hVar);
                    if (atomicLongFieldUpdater2.compareAndSet(hVar, j15, j15 & 4611686018427387903L)) {
                        return;
                    } else {
                        hVar = this;
                    }
                }
            }
        }
    }

    @Override // ec.w
    public final void a(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        h(cancellationException, true);
    }

    @Override // ec.w
    public final u0.k c() {
        i9.b0.d(3, d.f4692i);
        i9.b0.d(3, e.f4693i);
        return new u0.k(this, (b) null);
    }

    public final boolean f(long j5) {
        return j5 < f4702d.get(this) || j5 < f4701c.get(this) + ((long) this.f4709a);
    }

    /* JADX WARN: Code duplicated, block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x0165  */
    /* JADX WARN: Code duplicated, block: B:96:0x0168 A[RETURN] */
    @Override // ec.x
    public Object g(Object obj, y8.c cVar) throws Throwable {
        Object objO;
        Object obj2;
        h hVar;
        p pVar;
        int i7;
        h hVar2 = this;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4704f;
        p pVar2 = (p) atomicReferenceFieldUpdater.get(hVar2);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f4700b;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(hVar2);
            long j5 = andIncrement & 1152921504606846975L;
            boolean zU = hVar2.u(andIncrement, false);
            int i10 = j.f4712b;
            long j10 = i10;
            long j11 = j5 / j10;
            int i11 = (int) (j5 % j10);
            long j12 = pVar2.f6535c;
            z8.a aVar = z8.a.f15774a;
            z zVar = z.f12851a;
            if (j12 != j11) {
                p pVarB = b(hVar2, j11, pVar2);
                if (pVarB != null) {
                    pVar2 = pVarB;
                } else if (zU) {
                    Object objB = B(obj, cVar);
                    return objB == aVar ? objB : zVar;
                }
            }
            int iE = e(hVar2, pVar2, i11, obj, j5, null, zU);
            if (iE == 0) {
                pVar2.a();
                return zVar;
            }
            if (iE != 1) {
                if (iE == 2) {
                    if (!zU) {
                        return zVar;
                    }
                    pVar2.i();
                    Object objB2 = B(obj, cVar);
                    return objB2 == aVar ? objB2 : zVar;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = f4701c;
                if (iE == 3) {
                    cc.l lVarN = b0.n(n4.h.L(cVar));
                    Object obj3 = obj;
                    try {
                        int iE2 = e(hVar2, pVar2, i11, obj3, j5, lVarN, false);
                        try {
                            if (iE2 != 0) {
                                if (iE2 == 1) {
                                    lVarN.resumeWith(zVar);
                                } else if (iE2 != 2) {
                                    if (iE2 != 4) {
                                        String str = "unexpected";
                                        if (iE2 != 5) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        pVar2.a();
                                        p pVar3 = (p) atomicReferenceFieldUpdater.get(hVar2);
                                        while (true) {
                                            long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(hVar2);
                                            long j13 = andIncrement2 & 1152921504606846975L;
                                            boolean zU2 = hVar2.u(andIncrement2, false);
                                            int i12 = j.f4712b;
                                            long j14 = i12;
                                            str = str;
                                            long j15 = j13 / j14;
                                            int i13 = (int) (j13 % j14);
                                            if (pVar3.f6535c != j15) {
                                                p pVarB2 = b(hVar2, j15, pVar3);
                                                if (pVarB2 != null) {
                                                    i7 = i12;
                                                    pVar = pVarB2;
                                                } else if (zU2) {
                                                    d(hVar2, obj3, lVarN);
                                                    break;
                                                }
                                            } else {
                                                pVar = pVar3;
                                                i7 = i12;
                                            }
                                            int iE3 = e(hVar2, pVar, i13, obj3, j13, lVarN, zU2);
                                            Object obj4 = obj3;
                                            hVar = hVar2;
                                            p pVar4 = pVar;
                                            obj2 = obj4;
                                            if (iE3 == 0) {
                                                pVar4.a();
                                            } else if (iE3 != 1) {
                                                if (iE3 == 2) {
                                                    if (!zU2) {
                                                        lVarN.a(pVar4, i13 + i7);
                                                        break;
                                                    }
                                                    pVar4.i();
                                                } else {
                                                    if (iE3 == 3) {
                                                        throw new IllegalStateException(str);
                                                    }
                                                    if (iE3 != 4) {
                                                        if (iE3 == 5) {
                                                            pVar4.a();
                                                        }
                                                        pVar3 = pVar4;
                                                        hVar2 = hVar;
                                                        obj3 = obj2;
                                                    } else if (j13 < atomicLongFieldUpdater2.get(hVar)) {
                                                        pVar4.a();
                                                    }
                                                }
                                            }
                                        }
                                        lVarN.v();
                                        throw th;
                                    }
                                    obj2 = obj3;
                                    hVar = hVar2;
                                    if (j5 < atomicLongFieldUpdater2.get(hVar)) {
                                        pVar2.a();
                                    }
                                    d(hVar, obj2, lVarN);
                                    break;
                                } else {
                                    lVarN.a(pVar2, i11 + i10);
                                }
                                objO = lVarN.o();
                                if (objO != aVar) {
                                }
                                if (objO == aVar) {
                                    objO = zVar;
                                    return objO;
                                }
                                objO = zVar;
                                return zVar;
                            }
                            pVar2.a();
                            lVarN.resumeWith(zVar);
                            objO = lVarN.o();
                            if (objO != aVar) {
                            }
                            if (objO == aVar) {
                                objO = zVar;
                                return objO;
                            }
                            objO = zVar;
                            return zVar;
                        } catch (Throwable th) {
                            th = th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } else if (iE == 4) {
                    if (j5 < atomicLongFieldUpdater2.get(hVar2)) {
                        pVar2.a();
                    }
                    Object objB3 = B(obj, cVar);
                    if (objB3 == aVar) {
                        return objB3;
                    }
                } else if (iE == 5) {
                    pVar2.a();
                }
            }
            return zVar;
        }
    }

    public final boolean h(Throwable th, boolean z10) {
        h hVar;
        boolean z11;
        long j5;
        long j10;
        long j11;
        Object obj;
        long j12;
        long j13;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f4700b;
        if (!z10) {
            hVar = this;
            break;
        }
        do {
            j13 = atomicLongFieldUpdater.get(this);
            if (((int) (j13 >> 60)) != 0) {
                hVar = this;
                break;
            }
            p pVar = j.f4711a;
            hVar = this;
        } while (!atomicLongFieldUpdater.compareAndSet(hVar, j13, (j13 & 1152921504606846975L) + (((long) 1) << 60)));
        hc.s sVar = j.f4728s;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4707i;
            if (atomicReferenceFieldUpdater.compareAndSet(this, sVar, th)) {
                z11 = true;
                break;
            }
            if (atomicReferenceFieldUpdater.get(this) != sVar) {
                z11 = false;
                break;
            }
        }
        if (z10) {
            do {
                j12 = atomicLongFieldUpdater.get(this);
            } while (!atomicLongFieldUpdater.compareAndSet(hVar, j12, (((long) 3) << 60) + (j12 & 1152921504606846975L)));
        } else {
            do {
                j5 = atomicLongFieldUpdater.get(this);
                int i7 = (int) (j5 >> 60);
                if (i7 == 0) {
                    j10 = j5 & 1152921504606846975L;
                    j11 = 2;
                } else {
                    if (i7 != 1) {
                        break;
                    }
                    j10 = j5 & 1152921504606846975L;
                    j11 = 3;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(hVar, j5, (j11 << 60) + j10));
        }
        l();
        if (z11) {
            loop3: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f4708j;
                obj = atomicReferenceFieldUpdater2.get(this);
                hc.s sVar2 = obj == null ? j.f4726q : j.f4727r;
                do {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, obj, sVar2)) {
                        break loop3;
                    }
                } while (atomicReferenceFieldUpdater2.get(this) == obj);
            }
            if (obj != null) {
                i9.b0.d(1, obj);
                ((h9.k) obj).invoke(p());
                return z11;
            }
        }
        return z11;
    }

    @Override // ec.w
    public final Object i(gc.p pVar) {
        return C(this, pVar);
    }

    @Override // ec.w
    public final c iterator() {
        return new c(this);
    }

    public final p j(long j5) {
        Object objF;
        long j10;
        Object obj = f4706h.get(this);
        p pVar = (p) f4704f.get(this);
        if (pVar.f6535c > ((p) obj).f6535c) {
            obj = pVar;
        }
        p pVar2 = (p) f4705g.get(this);
        if (pVar2.f6535c > ((p) obj).f6535c) {
            obj = pVar2;
        }
        hc.b bVar = (hc.b) obj;
        loop0: while (true) {
            bVar.getClass();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = hc.b.f6502a;
            Object obj2 = atomicReferenceFieldUpdater.get(bVar);
            hc.s sVar = hc.a.f6495a;
            objF = null;
            if (obj2 == sVar) {
                break;
            }
            hc.b bVar2 = (hc.b) obj2;
            if (bVar2 == null) {
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(bVar, null, sVar)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(bVar) == null);
            } else {
                bVar = bVar2;
            }
        }
        p pVar3 = (p) bVar;
        if (y()) {
            p pVar4 = pVar3;
            loop2: while (true) {
                int i7 = j.f4712b - 1;
                while (true) {
                    if (-1 < i7) {
                        j10 = (pVar4.f6535c * ((long) j.f4712b)) + ((long) i7);
                        if (j10 >= f4701c.get(this)) {
                            while (true) {
                                Object objL = pVar4.l(i7);
                                if (objL != null && objL != j.f4715e) {
                                    if (objL != j.f4714d) {
                                        break;
                                    }
                                    break loop2;
                                }
                                if (pVar4.k(i7, objL, j.f4721l)) {
                                    pVar4.i();
                                    break;
                                }
                            }
                            i7--;
                        }
                    } else {
                        pVar4 = (p) ((hc.b) hc.b.f6503b.get(pVar4));
                        if (pVar4 == null) {
                        }
                    }
                    j10 = -1;
                    break;
                }
            }
            if (j10 != -1) {
                m(j10);
            }
        }
        loop5: for (p pVar5 = pVar3; pVar5 != null; pVar5 = (p) ((hc.b) hc.b.f6503b.get(pVar5))) {
            for (int i10 = j.f4712b - 1; -1 < i10; i10--) {
                if ((pVar5.f6535c * ((long) j.f4712b)) + ((long) i10) < j5) {
                    break loop5;
                }
                while (true) {
                    Object objL2 = pVar5.l(i10);
                    if (objL2 != null && objL2 != j.f4715e) {
                        if (!(objL2 instanceof y)) {
                            if (!(objL2 instanceof z1)) {
                                break;
                            }
                            if (pVar5.k(i10, objL2, j.f4721l)) {
                                objF = hc.a.f(objF, objL2);
                                pVar5.m(i10, true);
                                break;
                            }
                        } else {
                            if (pVar5.k(i10, objL2, j.f4721l)) {
                                objF = hc.a.f(objF, ((y) objL2).f4738a);
                                pVar5.m(i10, true);
                                break;
                            }
                        }
                    } else {
                        if (pVar5.k(i10, objL2, j.f4721l)) {
                            pVar5.i();
                            break;
                        }
                    }
                }
            }
        }
        if (objF != null) {
            if (!(objF instanceof ArrayList)) {
                E((z1) objF, true);
                return pVar3;
            }
            ArrayList arrayList = (ArrayList) objF;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                E((z1) arrayList.get(size), true);
            }
        }
        return pVar3;
    }

    @Override // ec.w
    public final Object k() {
        p pVar;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f4701c;
        long j5 = atomicLongFieldUpdater.get(this);
        long j10 = f4700b.get(this);
        if (u(j10, true)) {
            return new m(p());
        }
        long j11 = j10 & 1152921504606846975L;
        n nVar = o.f4732b;
        if (j5 >= j11) {
            return nVar;
        }
        Object obj = j.k;
        p pVar2 = (p) f4705g.get(this);
        while (!w()) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j12 = j.f4712b;
            long j13 = andIncrement / j12;
            int i7 = (int) (andIncrement % j12);
            if (pVar2.f6535c != j13) {
                p pVarO = o(j13, pVar2);
                if (pVarO == null) {
                    continue;
                } else {
                    pVar = pVarO;
                }
            } else {
                pVar = pVar2;
            }
            Object objH = H(pVar, i7, andIncrement, obj);
            p pVar3 = pVar;
            if (objH == j.f4722m) {
                z1 z1Var = obj instanceof z1 ? (z1) obj : null;
                if (z1Var != null) {
                    z1Var.a(pVar3, i7);
                }
                J(andIncrement);
                pVar3.i();
                return nVar;
            }
            if (objH != j.f4724o) {
                if (objH == j.f4723n) {
                    throw new IllegalStateException("unexpected");
                }
                pVar3.a();
                return objH;
            }
            if (andIncrement < s()) {
                pVar3.a();
            }
            pVar2 = pVar3;
        }
        return new m(p());
    }

    public final void l() {
        u(f4700b.get(this), false);
    }

    public final void m(long j5) {
        p pVar = (p) f4705g.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f4701c;
            long j10 = atomicLongFieldUpdater.get(this);
            if (j5 < Math.max(((long) this.f4709a) + j10, f4702d.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j10, 1 + j10)) {
                long j11 = j.f4712b;
                long j12 = j10 / j11;
                int i7 = (int) (j10 % j11);
                if (pVar.f6535c != j12) {
                    p pVarO = o(j12, pVar);
                    if (pVarO != null) {
                        pVar = pVarO;
                    }
                }
                p pVar2 = pVar;
                if (H(pVar2, i7, j10, null) != j.f4724o || j10 < s()) {
                    pVar2.a();
                }
                pVar = pVar2;
            }
        }
    }

    public final void n() {
        Object objB;
        if (z()) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4706h;
        p pVar = (p) atomicReferenceFieldUpdater.get(this);
        while (true) {
            long andIncrement = f4702d.getAndIncrement(this);
            long j5 = andIncrement / ((long) j.f4712b);
            if (s() <= andIncrement) {
                if (pVar.f6535c < j5 && pVar.c() != null) {
                    A(j5, pVar);
                }
                t(this);
                return;
            }
            if (pVar.f6535c != j5) {
                i iVar = i.f4710i;
                while (true) {
                    objB = hc.a.b(pVar, j5, iVar);
                    if (!hc.a.e(objB)) {
                        hc.q qVarC = hc.a.c(objB);
                        while (true) {
                            hc.q qVar = (hc.q) atomicReferenceFieldUpdater.get(this);
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
                p pVar2 = null;
                if (hc.a.e(objB)) {
                    l();
                    A(j5, pVar);
                    t(this);
                } else {
                    p pVar3 = (p) hc.a.c(objB);
                    long j10 = pVar3.f6535c;
                    if (j10 > j5) {
                        long j11 = j10 * ((long) j.f4712b);
                        if (f4702d.compareAndSet(this, 1 + andIncrement, j11)) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater = f4703e;
                            if ((atomicLongFieldUpdater.addAndGet(this, j11 - andIncrement) & 4611686018427387904L) != 0) {
                                while ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0) {
                                }
                            }
                        } else {
                            t(this);
                        }
                    } else {
                        pVar2 = pVar3;
                    }
                }
                if (pVar2 == null) {
                    continue;
                } else {
                    pVar = pVar2;
                }
            }
            int i7 = (int) (andIncrement % ((long) j.f4712b));
            Object objL = pVar.l(i7);
            boolean z10 = objL instanceof z1;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f4701c;
            if (!z10 || andIncrement < atomicLongFieldUpdater2.get(this) || !pVar.k(i7, objL, j.f4717g)) {
                while (true) {
                    Object objL2 = pVar.l(i7);
                    if (objL2 instanceof z1) {
                        if (andIncrement < atomicLongFieldUpdater2.get(this)) {
                            if (pVar.k(i7, objL2, new y((z1) objL2))) {
                                t(this);
                                return;
                            }
                        } else if (pVar.k(i7, objL2, j.f4717g)) {
                            if (!G(objL2, pVar, i7)) {
                                pVar.o(i7, j.f4720j);
                                pVar.i();
                                break;
                            } else {
                                pVar.o(i7, j.f4714d);
                                t(this);
                                return;
                            }
                        }
                    } else {
                        if (objL2 == j.f4720j) {
                            break;
                        }
                        if (objL2 == null) {
                            if (pVar.k(i7, objL2, j.f4715e)) {
                                t(this);
                                return;
                            }
                        } else if (objL2 == j.f4714d || objL2 == j.f4718h || objL2 == j.f4719i || objL2 == j.k || objL2 == j.f4721l) {
                            t(this);
                            return;
                        } else if (objL2 != j.f4716f) {
                            throw new IllegalStateException(("Unexpected cell state: " + objL2).toString());
                        }
                    }
                }
                t(this);
            } else if (G(objL, pVar, i7)) {
                pVar.o(i7, j.f4714d);
                t(this);
                return;
            } else {
                pVar.o(i7, j.f4720j);
                pVar.i();
                t(this);
            }
        }
    }

    public final p o(long j5, p pVar) {
        Object objB;
        long j10;
        p pVar2 = j.f4711a;
        i iVar = i.f4710i;
        loop0: while (true) {
            objB = hc.a.b(pVar, j5, iVar);
            if (!hc.a.e(objB)) {
                hc.q qVarC = hc.a.c(objB);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4705g;
                    hc.q qVar = (hc.q) atomicReferenceFieldUpdater.get(this);
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
        if (hc.a.e(objB)) {
            l();
            if (pVar.f6535c * ((long) j.f4712b) < s()) {
                pVar.a();
                return null;
            }
        } else {
            p pVar3 = (p) hc.a.c(objB);
            long j11 = pVar3.f6535c;
            if (!z() && j5 <= f4702d.get(this) / ((long) j.f4712b)) {
                loop3: while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f4706h;
                    hc.q qVar2 = (hc.q) atomicReferenceFieldUpdater2.get(this);
                    if (qVar2.f6535c >= j11 || !pVar3.j()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater2.compareAndSet(this, qVar2, pVar3)) {
                            if (!qVar2.f()) {
                                break loop3;
                            }
                            qVar2.e();
                            break loop3;
                        }
                    } while (atomicReferenceFieldUpdater2.get(this) == qVar2);
                    if (pVar3.f()) {
                        pVar3.e();
                    }
                }
            }
            if (j11 <= j5) {
                return pVar3;
            }
            long j12 = j11 * ((long) j.f4712b);
            do {
                j10 = f4701c.get(this);
                if (j10 >= j12) {
                    break;
                }
            } while (!f4701c.compareAndSet(this, j10, j12));
            if (j11 * ((long) j.f4712b) < s()) {
                pVar3.a();
            }
        }
        return null;
    }

    public final Throwable p() {
        return (Throwable) f4707i.get(this);
    }

    public final Throwable q() {
        Throwable thP = p();
        return thP == null ? new q("Channel was closed") : thP;
    }

    public final Throwable r() {
        Throwable thP = p();
        return thP == null ? new r("Channel was closed") : thP;
    }

    public final long s() {
        return f4700b.get(this) & 1152921504606846975L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String string;
        StringBuilder sb2 = new StringBuilder();
        int i7 = (int) (f4700b.get(this) >> 60);
        if (i7 == 2) {
            sb2.append("closed,");
        } else if (i7 == 3) {
            sb2.append("cancelled,");
        }
        sb2.append("capacity=" + this.f4709a + ',');
        sb2.append("data=[");
        List listJ = n3.l.J(f4705g.get(this), f4704f.get(this), f4706h.get(this));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listJ) {
            if (((p) obj) != j.f4711a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j5 = ((p) next).f6535c;
            do {
                Object next2 = it.next();
                long j10 = ((p) next2).f6535c;
                if (j5 > j10) {
                    next = next2;
                    j5 = j10;
                }
            } while (it.hasNext());
        }
        p pVar = (p) next;
        long j11 = f4701c.get(this);
        long jS = s();
        loop2: do {
            int i10 = j.f4712b;
            for (int i11 = 0; i11 < i10; i11++) {
                long j12 = (pVar.f6535c * ((long) j.f4712b)) + ((long) i11);
                if (j12 >= jS && j12 >= j11) {
                    break loop2;
                }
                Object objL = pVar.l(i11);
                Object obj2 = pVar.f4735f.get(i11 * 2);
                if (objL instanceof cc.j) {
                    string = (j12 >= j11 || j12 < jS) ? (j12 >= jS || j12 < j11) ? "cont" : "send" : "receive";
                } else if (objL instanceof kc.f) {
                    string = (j12 >= j11 || j12 < jS) ? (j12 >= jS || j12 < j11) ? "select" : "onSend" : "onReceive";
                } else if (objL instanceof v) {
                    string = "receiveCatching";
                } else if (objL instanceof y) {
                    string = "EB(" + objL + ')';
                } else if (i9.l.a(objL, j.f4716f) || i9.l.a(objL, j.f4717g)) {
                    string = "resuming_sender";
                } else {
                    if (objL != null && !objL.equals(j.f4715e) && !objL.equals(j.f4719i) && !objL.equals(j.f4718h) && !objL.equals(j.k) && !objL.equals(j.f4720j) && !objL.equals(j.f4721l)) {
                        string = objL.toString();
                    }
                }
                if (obj2 != null) {
                    sb2.append("(" + string + ',' + obj2 + "),");
                } else {
                    sb2.append(string + ',');
                }
            }
            pVar = (p) pVar.c();
        } while (pVar != null);
        if (zb.j.C0(sb2) == ',') {
            i9.l.d(sb2.deleteCharAt(sb2.length() - 1), "deleteCharAt(...)");
        }
        sb2.append("]");
        return sb2.toString();
    }

    public final boolean u(long j5, boolean z10) {
        int i7 = (int) (j5 >> 60);
        if (i7 != 0 && i7 != 1) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f4701c;
            if (i7 == 2) {
                j(1152921504606846975L & j5);
                if (z10) {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4705g;
                        p pVarO = (p) atomicReferenceFieldUpdater.get(this);
                        long j10 = atomicLongFieldUpdater.get(this);
                        if (s() <= j10) {
                            break;
                        }
                        long j11 = j.f4712b;
                        long j12 = j10 / j11;
                        if (pVarO.f6535c != j12 && (pVarO = o(j12, pVarO)) == null) {
                            if (((p) atomicReferenceFieldUpdater.get(this)).f6535c < j12) {
                                break;
                            }
                        } else {
                            pVarO.a();
                            int i10 = (int) (j10 % j11);
                            while (true) {
                                Object objL = pVarO.l(i10);
                                if (objL != null && objL != j.f4715e) {
                                    if (objL != j.f4714d && (objL == j.f4720j || objL == j.f4721l || objL == j.f4719i || objL == j.f4718h || (objL != j.f4717g && (objL == j.f4716f || j10 != atomicLongFieldUpdater.get(this))))) {
                                        break;
                                        break;
                                        break;
                                        break;
                                        break;
                                        break;
                                    }
                                } else if (pVarO.k(i10, objL, j.f4718h)) {
                                    n();
                                    break;
                                }
                            }
                            f4701c.compareAndSet(this, j10, j10 + 1);
                        }
                    }
                }
            } else {
                if (i7 != 3) {
                    throw new IllegalStateException(a2.f.E(i7, "unexpected close status: ").toString());
                }
                p pVarJ = j(1152921504606846975L & j5);
                Object objF = null;
                loop0: do {
                    for (int i11 = j.f4712b - 1; -1 < i11; i11--) {
                        long j13 = (pVarJ.f6535c * ((long) j.f4712b)) + ((long) i11);
                        while (true) {
                            Object objL2 = pVarJ.l(i11);
                            if (objL2 == j.f4719i) {
                                break loop0;
                            }
                            if (objL2 != j.f4714d) {
                                if (objL2 != j.f4715e && objL2 != null) {
                                    if (!(objL2 instanceof z1) && !(objL2 instanceof y)) {
                                        hc.s sVar = j.f4717g;
                                        if (objL2 == sVar || objL2 == j.f4716f) {
                                            break loop0;
                                        }
                                        if (objL2 != sVar) {
                                            break;
                                        }
                                    } else {
                                        if (j13 < atomicLongFieldUpdater.get(this)) {
                                            break loop0;
                                        }
                                        z1 z1Var = objL2 instanceof y ? ((y) objL2).f4738a : (z1) objL2;
                                        if (pVarJ.k(i11, objL2, j.f4721l)) {
                                            objF = hc.a.f(objF, z1Var);
                                            pVarJ.n(i11, null);
                                            pVarJ.i();
                                            break;
                                        }
                                    }
                                } else {
                                    if (pVarJ.k(i11, objL2, j.f4721l)) {
                                        pVarJ.i();
                                        break;
                                    }
                                }
                            } else {
                                if (j13 < atomicLongFieldUpdater.get(this)) {
                                    break loop0;
                                }
                                if (pVarJ.k(i11, objL2, j.f4721l)) {
                                    pVarJ.n(i11, null);
                                    pVarJ.i();
                                    break;
                                }
                            }
                        }
                    }
                    pVarJ = (p) ((hc.b) hc.b.f6503b.get(pVarJ));
                } while (pVarJ != null);
                if (objF != null) {
                    if (objF instanceof ArrayList) {
                        ArrayList arrayList = (ArrayList) objF;
                        for (int size = arrayList.size() - 1; -1 < size; size--) {
                            E((z1) arrayList.get(size), false);
                        }
                    } else {
                        E((z1) objF, false);
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // ec.w
    public final Object v(y8.c cVar) throws Throwable {
        p pVar;
        Throwable th;
        p pVar2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4705g;
        p pVar3 = (p) atomicReferenceFieldUpdater.get(this);
        while (!w()) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f4701c;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j5 = j.f4712b;
            long j10 = andIncrement / j5;
            int i7 = (int) (andIncrement % j5);
            if (pVar3.f6535c != j10) {
                p pVarO = o(j10, pVar3);
                if (pVarO == null) {
                    continue;
                } else {
                    pVar = pVarO;
                }
            } else {
                pVar = pVar3;
            }
            Object objH = H(pVar, i7, andIncrement, null);
            hc.s sVar = j.f4722m;
            if (objH == sVar) {
                throw new IllegalStateException("unexpected");
            }
            hc.s sVar2 = j.f4724o;
            if (objH == sVar2) {
                if (andIncrement < s()) {
                    pVar.a();
                }
                pVar3 = pVar;
            } else {
                if (objH != j.f4723n) {
                    pVar.a();
                    return objH;
                }
                cc.l lVarN = b0.n(n4.h.L(cVar));
                h hVar = this;
                try {
                    Object objH2 = hVar.H(pVar, i7, andIncrement, lVarN);
                    if (objH2 != sVar) {
                        if (objH2 == sVar2) {
                            if (andIncrement < s()) {
                                pVar.a();
                            }
                            p pVar4 = (p) atomicReferenceFieldUpdater.get(this);
                            while (true) {
                                if (w()) {
                                    lVarN.resumeWith(t8.a.b(q()));
                                    break;
                                }
                                cc.l lVar = lVarN;
                                try {
                                    long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(this);
                                    long j11 = j.f4712b;
                                    long j12 = andIncrement2 / j11;
                                    int i10 = (int) (andIncrement2 % j11);
                                    if (pVar4.f6535c != j12) {
                                        try {
                                            p pVarO2 = o(j12, pVar4);
                                            if (pVarO2 == null) {
                                                lVarN = lVar;
                                            } else {
                                                pVar2 = pVarO2;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            lVarN = lVar;
                                            lVarN.v();
                                            throw th;
                                        }
                                    } else {
                                        pVar2 = pVar4;
                                    }
                                    objH2 = hVar.H(pVar2, i10, andIncrement2, lVar);
                                    p pVar5 = pVar2;
                                    lVarN = lVar;
                                    if (objH2 == j.f4722m) {
                                        lVarN.a(pVar5, i10);
                                        break;
                                    }
                                    if (objH2 == j.f4724o) {
                                        if (andIncrement2 < s()) {
                                            pVar5.a();
                                        }
                                        hVar = this;
                                        pVar4 = pVar5;
                                    } else {
                                        if (objH2 == j.f4723n) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        pVar5.a();
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    lVarN = lVar;
                                    th = th;
                                    lVarN.v();
                                    throw th;
                                }
                            }
                        } else {
                            pVar.a();
                        }
                        lVarN.e(objH2, null);
                        break;
                    }
                    lVarN.a(pVar, i7);
                    return lVarN.o();
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        }
        Throwable thQ = q();
        int i11 = hc.r.f6536a;
        throw thQ;
    }

    public final boolean w() {
        return u(f4700b.get(this), true);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0068  */
    /* JADX WARN: Code duplicated, block: B:24:0x006b  */
    /* JADX WARN: Code duplicated, block: B:26:0x006e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0071  */
    /* JADX WARN: Code duplicated, block: B:30:0x0074  */
    /* JADX WARN: Code duplicated, block: B:33:0x0078  */
    /* JADX WARN: Code duplicated, block: B:37:0x0087  */
    /* JADX WARN: Code duplicated, block: B:43:0x009e  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:47:0x00af  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:57:0x00be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x009c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x0094 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x007d A[SYNTHETIC] */
    @Override // ec.x
    public Object x(Object obj) {
        int iE;
        z zVar;
        z1 z1Var;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f4700b;
        long j5 = atomicLongFieldUpdater.get(this);
        boolean z10 = false;
        long j10 = 1152921504606846975L;
        boolean z11 = u(j5, false) ? false : !f(j5 & 1152921504606846975L);
        n nVar = o.f4732b;
        if (z11) {
            return nVar;
        }
        l4.o oVar = j.f4720j;
        p pVar = (p) f4704f.get(this);
        while (true) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j11 = andIncrement & j10;
            boolean zU = u(andIncrement, z10);
            int i7 = j.f4712b;
            long j12 = i7;
            long j13 = j11 / j12;
            int i10 = (int) (j11 % j12);
            if (pVar.f6535c == j13) {
                iE = e(this, pVar, i10, obj, j11, oVar, zU);
                zVar = z.f12851a;
                if (iE != 0) {
                    pVar.a();
                    return zVar;
                }
                if (iE != 1) {
                    return zVar;
                }
                if (iE != 2) {
                    if (zU) {
                        pVar.i();
                        return new m(r());
                    }
                    if (oVar instanceof z1) {
                        z1Var = (z1) oVar;
                    } else {
                        z1Var = null;
                    }
                    if (z1Var != null) {
                        z1Var.a(pVar, i10 + i7);
                    }
                    pVar.i();
                    return nVar;
                }
                if (iE != 3) {
                    throw new IllegalStateException("unexpected");
                }
                if (iE != 4) {
                    if (j11 < f4701c.get(this)) {
                        pVar.a();
                    }
                    return new m(r());
                }
                if (iE == 5) {
                    pVar.a();
                }
                z10 = false;
            } else {
                p pVarB = b(this, j13, pVar);
                if (pVarB != null) {
                    pVar = pVarB;
                    iE = e(this, pVar, i10, obj, j11, oVar, zU);
                    zVar = z.f12851a;
                    if (iE != 0) {
                        pVar.a();
                        return zVar;
                    }
                    if (iE != 1) {
                        return zVar;
                    }
                    if (iE != 2) {
                        if (zU) {
                            pVar.i();
                            return new m(r());
                        }
                        if (oVar instanceof z1) {
                            z1Var = (z1) oVar;
                        } else {
                            z1Var = null;
                        }
                        if (z1Var != null) {
                            z1Var.a(pVar, i10 + i7);
                        }
                        pVar.i();
                        return nVar;
                    }
                    if (iE != 3) {
                        throw new IllegalStateException("unexpected");
                    }
                    if (iE != 4) {
                        if (j11 < f4701c.get(this)) {
                            pVar.a();
                        }
                        return new m(r());
                    }
                    if (iE == 5) {
                        pVar.a();
                    }
                    z10 = false;
                } else {
                    if (zU) {
                        return new m(r());
                    }
                    z10 = false;
                }
            }
            j10 = 1152921504606846975L;
        }
    }

    public boolean y() {
        return false;
    }

    public final boolean z() {
        long j5 = f4702d.get(this);
        return j5 == 0 || j5 == Long.MAX_VALUE;
    }
}
