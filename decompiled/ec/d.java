package ec;

import cc.z1;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import t8.z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d extends i9.j implements h9.o {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final d f4692i = new d(3, h.class, "registerSelectForReceive", "registerSelectForReceive(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // h9.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        p pVar;
        h hVar = (h) obj;
        kc.f fVar = (kc.f) obj2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = h.f4700b;
        hVar.getClass();
        p pVar2 = (p) h.f4705g.get(hVar);
        while (!hVar.w()) {
            long andIncrement = h.f4701c.getAndIncrement(hVar);
            long j5 = j.f4712b;
            long j10 = andIncrement / j5;
            int i7 = (int) (andIncrement % j5);
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
            Object objH = hVar.H(pVar, i7, andIncrement, fVar);
            p pVar3 = pVar;
            if (objH == j.f4722m) {
                z1 z1Var = fVar instanceof z1 ? (z1) fVar : null;
                if (z1Var != null) {
                    z1Var.a(pVar3, i7);
                }
            } else if (objH == j.f4724o) {
                if (andIncrement < hVar.s()) {
                    pVar3.a();
                }
                pVar2 = pVar3;
            } else {
                if (objH == j.f4723n) {
                    throw new IllegalStateException("unexpected");
                }
                pVar3.a();
                ((kc.e) fVar).f7525e = objH;
            }
            return z.f12851a;
        }
        ((kc.e) fVar).f7525e = j.f4721l;
        return z.f12851a;
    }
}
