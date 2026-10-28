package ec;

import cc.b0;
import cc.z1;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c implements z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f4689a = j.f4725p;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public cc.l f4690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f4691c;

    public c(h hVar) {
        this.f4691c = hVar;
    }

    @Override // cc.z1
    public final void a(hc.q qVar, int i7) {
        cc.l lVar = this.f4690b;
        if (lVar != null) {
            lVar.a(qVar, i7);
        }
    }

    public final Object b(a9.c cVar) throws Throwable {
        p pVarO;
        Object obj = this.f4689a;
        boolean z10 = true;
        if (obj == j.f4725p || obj == j.f4721l) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h.f4705g;
            h hVar = this.f4691c;
            p pVar = (p) atomicReferenceFieldUpdater.get(hVar);
            while (!hVar.w()) {
                long andIncrement = h.f4701c.getAndIncrement(hVar);
                long j5 = j.f4712b;
                long j10 = andIncrement / j5;
                int i7 = (int) (andIncrement % j5);
                if (pVar.f6535c != j10) {
                    pVarO = hVar.o(j10, pVar);
                    if (pVarO == null) {
                        continue;
                    }
                } else {
                    pVarO = pVar;
                }
                Object objH = hVar.H(pVarO, i7, andIncrement, null);
                hc.s sVar = j.f4722m;
                if (objH == sVar) {
                    throw new IllegalStateException("unreachable");
                }
                hc.s sVar2 = j.f4724o;
                if (objH == sVar2) {
                    if (andIncrement < hVar.s()) {
                        pVarO.a();
                    }
                    pVar = pVarO;
                } else {
                    if (objH == j.f4723n) {
                        h hVar2 = this.f4691c;
                        cc.l lVarN = b0.n(n4.h.L(cVar));
                        try {
                            this.f4690b = lVarN;
                            Object objH2 = hVar2.H(pVarO, i7, andIncrement, this);
                            if (objH2 != sVar) {
                                if (objH2 == sVar2) {
                                    if (andIncrement < hVar2.s()) {
                                        pVarO.a();
                                    }
                                    p pVar2 = (p) h.f4705g.get(hVar2);
                                    while (true) {
                                        if (hVar2.w()) {
                                            cc.l lVar = this.f4690b;
                                            i9.l.b(lVar);
                                            this.f4690b = null;
                                            this.f4689a = j.f4721l;
                                            Throwable thP = hVar.p();
                                            if (thP != null) {
                                                lVar.resumeWith(t8.a.b(thP));
                                                break;
                                            }
                                            lVar.resumeWith(Boolean.FALSE);
                                            break;
                                        }
                                        long andIncrement2 = h.f4701c.getAndIncrement(hVar2);
                                        long j11 = j.f4712b;
                                        long j12 = andIncrement2 / j11;
                                        int i10 = (int) (andIncrement2 % j11);
                                        if (pVar2.f6535c != j12) {
                                            p pVarO2 = hVar2.o(j12, pVar2);
                                            if (pVarO2 != null) {
                                                pVar2 = pVarO2;
                                            }
                                        }
                                        Object objH3 = hVar2.H(pVar2, i10, andIncrement2, this);
                                        if (objH3 == j.f4722m) {
                                            a(pVar2, i10);
                                            break;
                                        }
                                        if (objH3 == j.f4724o) {
                                            if (andIncrement2 < hVar2.s()) {
                                                pVar2.a();
                                            }
                                        } else {
                                            if (objH3 == j.f4723n) {
                                                throw new IllegalStateException("unexpected");
                                            }
                                            pVar2.a();
                                            this.f4689a = objH3;
                                            this.f4690b = null;
                                        }
                                    }
                                } else {
                                    pVarO.a();
                                    this.f4689a = objH2;
                                    this.f4690b = null;
                                }
                                lVarN.e(Boolean.TRUE, null);
                                break;
                            }
                            a(pVarO, i7);
                            return lVarN.o();
                        } catch (Throwable th) {
                            lVarN.v();
                            throw th;
                        }
                    }
                    pVarO.a();
                    this.f4689a = objH;
                }
            }
            this.f4689a = j.f4721l;
            Throwable thP2 = hVar.p();
            if (thP2 != null) {
                int i11 = hc.r.f6536a;
                throw thP2;
            }
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    public final Object c() throws Throwable {
        Object obj = this.f4689a;
        hc.s sVar = j.f4725p;
        if (obj == sVar) {
            throw new IllegalStateException("`hasNext()` has not been invoked");
        }
        this.f4689a = sVar;
        if (obj != j.f4721l) {
            return obj;
        }
        Throwable thQ = this.f4691c.q();
        int i7 = hc.r.f6536a;
        throw thQ;
    }
}
