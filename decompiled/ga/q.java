package ga;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class q implements za.e {
    @Override // za.e
    public final int a() {
        return 1;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0044  */
    /* JADX WARN: Code duplicated, block: B:16:0x004f  */
    /* JADX WARN: Code duplicated, block: B:17:0x0053  */
    /* JADX WARN: Code duplicated, block: B:28:0x006e  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ad A[RETURN] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // za.e
    public final int b(x9.b bVar, x9.b bVar2, x9.e eVar) {
        boolean z10;
        x9.t tVar;
        i9.l.e(bVar, "superDescriptor");
        i9.l.e(bVar2, "subDescriptor");
        if ((bVar instanceof x9.c) && (bVar2 instanceof x9.t) && !u9.i.A(bVar2)) {
            int i7 = e.f6066l;
            x9.t tVar2 = (x9.t) bVar2;
            aa.q qVar = (aa.q) tVar2;
            wa.e name = qVar.getName();
            i9.l.d(name, "getName(...)");
            if (e.b(name)) {
                x9.c cVarI = i2.c.I((x9.c) bVar);
                z10 = bVar instanceof x9.t;
                if (z10) {
                    tVar = (x9.t) bVar;
                } else {
                    tVar = null;
                }
                if (tVar == null) {
                    if (eVar instanceof ia.c) {
                        if (a.a.A(bVar, bVar2)) {
                            return 3;
                        }
                    } else if (a.a.A(bVar, bVar2)) {
                        return 3;
                    }
                } else if (eVar instanceof ia.c) {
                    if (a.a.A(bVar, bVar2)) {
                        return 3;
                    }
                } else if (a.a.A(bVar, bVar2)) {
                    return 3;
                }
            } else {
                ArrayList arrayList = h0.f6082a;
                wa.e name2 = qVar.getName();
                i9.l.d(name2, "getName(...)");
                if (h0.f6091j.contains(name2)) {
                    x9.c cVarI2 = i2.c.I((x9.c) bVar);
                    z10 = bVar instanceof x9.t;
                    if (z10) {
                        tVar = (x9.t) bVar;
                    } else {
                        tVar = null;
                    }
                    if ((tVar == null && tVar2.l0() == tVar.l0()) || (cVarI2 != null && tVar2.l0())) {
                        if ((eVar instanceof ia.c) || tVar2.a0() != null || cVarI2 == null || i2.c.L(eVar, cVarI2)) {
                            if (a.a.A(bVar, bVar2)) {
                                return 3;
                            }
                        } else if ((cVarI2 instanceof x9.t) && z10 && e.a((x9.t) cVarI2) != null) {
                            String strY = n3.n.Y(tVar2, 2);
                            x9.t tVarA = ((x9.t) bVar).a();
                            i9.l.d(tVarA, "getOriginal(...)");
                            if (i9.l.a(strY, n3.n.Y(tVarA, 2))) {
                                if (a.a.A(bVar, bVar2)) {
                                    return 3;
                                }
                            }
                        }
                    }
                } else if (a.a.A(bVar, bVar2)) {
                    return 3;
                }
            }
        } else if (a.a.A(bVar, bVar2)) {
            return 3;
        }
        return 2;
    }
}
