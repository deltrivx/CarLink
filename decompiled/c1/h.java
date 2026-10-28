package c1;

import androidx.compose.ui.semantics.AppendedSemanticsElement;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class h extends i9.n implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1899c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i7, Object obj, Object obj2) {
        super(2);
        this.f1897a = i7;
        this.f1899c = obj;
        this.f1898b = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(Object obj, h9.n nVar, int i7, int i10) {
        super(2);
        this.f1897a = i10;
        this.f1899c = obj;
        this.f1898b = nVar;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        int i7 = this.f1897a;
        Object obj3 = this.f1899c;
        Object obj4 = this.f1898b;
        t8.z zVar = t8.z.f12851a;
        switch (i7) {
            case 0:
                f1.s sVar = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar.z()) {
                    sVar.Q();
                } else {
                    r1.p pVarG = androidx.compose.foundation.layout.a.g(androidx.compose.foundation.layout.c.a(r1.m.f11116a, b.f1816b, b.f1817c), (d0.h0) obj3);
                    n1.c cVar = (n1.c) obj4;
                    d0.n0 n0VarA = d0.l0.a(d0.h.f3569d, r1.c.k, sVar, 54);
                    int iP = f1.b.p(sVar);
                    f1.q1 q1VarL = sVar.l();
                    r1.p pVarC = r1.a.c(sVar, pVarG);
                    q2.j.f10719d0.getClass();
                    q2.a0 a0Var = q2.i.f10705b;
                    sVar.a0();
                    if (sVar.S) {
                        sVar.k(a0Var);
                    } else {
                        sVar.k0();
                    }
                    f1.b.w(sVar, q2.i.f10708e, n0VarA);
                    f1.b.w(sVar, q2.i.f10707d, q1VarL);
                    q2.h hVar = q2.i.f10709f;
                    if (sVar.S || !i9.l.a(sVar.K(), Integer.valueOf(iP))) {
                        ob.a.w(iP, sVar, iP, hVar);
                    }
                    f1.b.w(sVar, q2.i.f10706c, pVarC);
                    cVar.invoke(d0.o0.f3608a, sVar, 6);
                    sVar.p(true);
                }
                break;
            case 1:
                f1.s sVar2 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar2.z()) {
                    sVar2.Q();
                } else {
                    u2.a(((y2) obj3).f2356j, (n1.c) obj4, sVar2, 0);
                }
                break;
            case 2:
                ((Number) obj2).intValue();
                u2.a((b3.r0) obj3, (n1.c) obj4, (f1.s) obj, f1.b.y(1));
                break;
            case 3:
                f1.s sVar3 = (f1.s) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (!sVar3.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    sVar3.Q();
                } else {
                    Boolean bool = (Boolean) ((o2.b0) obj3).f9298g.getValue();
                    boolean zBooleanValue = bool.booleanValue();
                    h9.n nVar = (h9.n) obj4;
                    sVar3.Z(bool);
                    boolean zG = sVar3.g(zBooleanValue);
                    if (zBooleanValue) {
                        nVar.invoke(sVar3, 0);
                    } else {
                        if (sVar3.f5116l != 0) {
                            f1.t.c("No nodes can be emitted before calling dactivateToEndGroup");
                        }
                        if (!sVar3.S) {
                            if (zG) {
                                f1.h2 h2Var = sVar3.G;
                                int i10 = h2Var.f4976g;
                                int i11 = h2Var.f4977h;
                                g1.b bVar = sVar3.M;
                                bVar.getClass();
                                bVar.d(false);
                                bVar.f5764b.f5761g.a0(g1.i.f5788d);
                                f1.t.a(sVar3.f5123s, i10, i11);
                                sVar3.G.t();
                            } else {
                                sVar3.P();
                            }
                        }
                    }
                    if (sVar3.f5129y && sVar3.G.f4978i == sVar3.f5130z) {
                        sVar3.f5130z = -1;
                        sVar3.f5129y = false;
                    }
                    sVar3.p(false);
                }
                break;
            case 4:
                y1.o oVar = (y1.o) obj;
                b2.c cVar2 = (b2.c) obj2;
                q2.h1 h1Var = (q2.h1) obj3;
                q2.h0 h0Var = h1Var.f10692o;
                if (!h0Var.J()) {
                    h1Var.H = true;
                } else {
                    h1Var.E = oVar;
                    h1Var.D = cVar2;
                    q2.s1 snapshotObserver = ((r2.u) q2.k0.a(h0Var)).getSnapshotObserver();
                    y1.i0 i0Var = q2.h1.J;
                    snapshotObserver.a(h1Var, q2.e.f10624d, (q2.e1) obj4);
                    h1Var.H = false;
                }
                break;
            case 5:
                ((Number) obj2).intValue();
                r2.n0.a((r2.u) obj3, (h9.n) obj4, (f1.s) obj, f1.b.y(1));
                break;
            case 6:
                f1.s sVar4 = (f1.s) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                r3.v vVar = (r3.v) obj3;
                if (!sVar4.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    sVar4.Q();
                } else {
                    Object objK = sVar4.K();
                    f1.w0 w0Var = f1.n.f5051a;
                    if (objK == w0Var) {
                        objK = r3.d.f11542e;
                        sVar4.h0(objK);
                    }
                    AppendedSemanticsElement appendedSemanticsElement = new AppendedSemanticsElement((h9.k) objK, false);
                    boolean zH = sVar4.h(vVar);
                    Object objK2 = sVar4.K();
                    if (zH || objK2 == w0Var) {
                        objK2 = new r3.j(vVar, 1);
                        sVar4.h0(objK2);
                    }
                    r1.p pVarI = n3.u.i(androidx.compose.ui.layout.a.e(appendedSemanticsElement, (h9.k) objK2), vVar.getCanCalculatePosition() ? 1.0f : 0.0f);
                    h9.n nVar2 = (h9.n) ((f1.b1) obj4).getValue();
                    Object objK3 = sVar4.K();
                    if (objK3 == w0Var) {
                        objK3 = r3.f.f11551c;
                        sVar4.h0(objK3);
                    }
                    o2.m0 m0Var = (o2.m0) objK3;
                    long j5 = sVar4.T;
                    int i12 = (int) (j5 ^ (j5 >>> 32));
                    f1.q1 q1VarL2 = sVar4.l();
                    r1.p pVarC2 = r1.a.c(sVar4, pVarI);
                    q2.j.f10719d0.getClass();
                    q2.a0 a0Var2 = q2.i.f10705b;
                    sVar4.a0();
                    if (sVar4.S) {
                        sVar4.k(a0Var2);
                    } else {
                        sVar4.k0();
                    }
                    f1.b.w(sVar4, q2.i.f10708e, m0Var);
                    f1.b.w(sVar4, q2.i.f10707d, q1VarL2);
                    q2.h hVar2 = q2.i.f10709f;
                    if (sVar4.S || !i9.l.a(sVar4.K(), Integer.valueOf(i12))) {
                        ob.a.w(i12, sVar4, i12, hVar2);
                    }
                    f1.b.w(sVar4, q2.i.f10706c, pVarC2);
                    nVar2.invoke(sVar4, 0);
                    sVar4.p(true);
                }
                break;
            default:
                int iIntValue3 = ((Number) obj).intValue();
                y2.m mVar = (y2.m) obj2;
                t1.c cVar3 = (t1.c) obj4;
                if (!((r2.m2) obj3).f11335b.b(mVar.f15023g)) {
                    cVar3.p(iIntValue3, mVar);
                    cVar3.f12740h.x(zVar);
                }
                break;
        }
        return zVar;
    }
}
