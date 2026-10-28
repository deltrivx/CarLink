package c1;

import androidx.compose.ui.semantics.AppendedSemanticsElement;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class n extends i9.n implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2011b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(int i7, Object obj) {
        super(2);
        this.f2010a = i7;
        this.f2011b = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(r2.a aVar, int i7, int i10) {
        super(2);
        this.f2010a = i10;
        this.f2011b = aVar;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f2010a) {
            case 0:
                f1.s sVar = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar.z()) {
                    sVar.Q();
                } else {
                    n1.c cVar = (n1.c) this.f2011b;
                    d0.s sVarA = d0.q.a(d0.h.f3568c, r1.c.f11103m, sVar, 0);
                    int iP = f1.b.p(sVar);
                    f1.q1 q1VarL = sVar.l();
                    r1.p pVarC = r1.a.c(sVar, r1.m.f11116a);
                    q2.j.f10719d0.getClass();
                    q2.a0 a0Var = q2.i.f10705b;
                    sVar.a0();
                    if (sVar.S) {
                        sVar.k(a0Var);
                    } else {
                        sVar.k0();
                    }
                    f1.b.w(sVar, q2.i.f10708e, sVarA);
                    f1.b.w(sVar, q2.i.f10707d, q1VarL);
                    q2.h hVar = q2.i.f10709f;
                    if (sVar.S || !i9.l.a(sVar.K(), Integer.valueOf(iP))) {
                        ob.a.w(iP, sVar, iP, hVar);
                    }
                    f1.b.w(sVar, q2.i.f10706c, pVarC);
                    cVar.invoke(d0.t.f3631a, sVar, 6);
                    sVar.p(true);
                }
                return t8.z.f12851a;
            case 1:
                r1.p pVar = (r1.p) obj;
                r1.p pVarB = (r1.n) obj2;
                f1.s sVar2 = (f1.s) this.f2011b;
                if (pVarB instanceof r1.k) {
                    h9.o oVar = ((r1.k) pVarB).f11114a;
                    i9.b0.d(3, oVar);
                    pVarB = r1.a.b(sVar2, (r1.p) oVar.invoke(r1.m.f11116a, sVar2, 0));
                }
                return pVar.a(pVarB);
            case 2:
                f1.s sVar3 = (f1.s) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (sVar3.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ((r2.a) this.f2011b).a(0, sVar3);
                } else {
                    sVar3.Q();
                }
                return t8.z.f12851a;
            case 3:
                ((Number) obj2).intValue();
                ((r2.i1) this.f2011b).a(f1.b.y(1), (f1.s) obj);
                return t8.z.f12851a;
            case 4:
                f1.s sVar4 = (f1.s) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (sVar4.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    Object objK = sVar4.K();
                    if (objK == f1.n.f5051a) {
                        objK = r3.d.f11539b;
                        sVar4.h0(objK);
                    }
                    n3.l.j(new AppendedSemanticsElement((h9.k) objK, false), (h9.n) ((f1.b1) this.f2011b).getValue(), sVar4, 0);
                } else {
                    sVar4.Q();
                }
                return t8.z.f12851a;
            case 5:
                ((Number) obj2).intValue();
                ((r3.r) this.f2011b).a(f1.b.y(1), (f1.s) obj);
                return t8.z.f12851a;
            case 6:
                ((Number) obj2).intValue();
                ((r3.v) this.f2011b).a(f1.b.y(1), (f1.s) obj);
                return t8.z.f12851a;
            default:
                ((t1.c) this.f2011b).p(((Number) obj).intValue(), (y2.m) obj2);
                return t8.z.f12851a;
        }
    }
}
