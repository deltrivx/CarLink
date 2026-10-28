package d1;

import c1.a1;
import c1.b1;
import d0.h0;
import f1.q1;
import o2.d1;
import o2.h1;
import o2.m0;
import q2.a0;
import r2.j1;
import r2.u;
import r2.u0;
import t8.z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class k extends i9.n implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3705c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t8.e f3706d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(Object obj, Object obj2, h9.n nVar, int i7) {
        super(2);
        this.f3703a = i7;
        this.f3704b = obj;
        this.f3705c = obj2;
        this.f3706d = nVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(Object obj, Object obj2, t8.e eVar, int i7, int i10) {
        super(2);
        this.f3703a = i10;
        this.f3704b = obj;
        this.f3705c = obj2;
        this.f3706d = eVar;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        int i7 = this.f3703a;
        int i10 = 0;
        z zVar = z.f12851a;
        t8.e eVar = this.f3706d;
        Object obj3 = this.f3705c;
        Object obj4 = this.f3704b;
        switch (i7) {
            case 0:
                f1.s sVar = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar.z()) {
                    sVar.Q();
                } else {
                    r1.p pVarC = androidx.compose.ui.layout.a.c(r1.m.f11116a, "Container");
                    float f10 = b1.f1820a;
                    r1.p pVarC2 = androidx.compose.ui.draw.a.c(pVarC, new a1(i10, new j((f1.b1) obj4, f1.b1.class, "value", "getValue()Ljava/lang/Object;", 0), (h0) obj3));
                    n1.c cVar = (n1.c) eVar;
                    m0 m0VarD = d0.m.d(r1.c.f11092a, true);
                    int iP = f1.b.p(sVar);
                    q1 q1VarL = sVar.l();
                    r1.p pVarC3 = r1.a.c(sVar, pVarC2);
                    q2.j.f10719d0.getClass();
                    a0 a0Var = q2.i.f10705b;
                    sVar.a0();
                    if (sVar.S) {
                        sVar.k(a0Var);
                    } else {
                        sVar.k0();
                    }
                    f1.b.w(sVar, q2.i.f10708e, m0VarD);
                    f1.b.w(sVar, q2.i.f10707d, q1VarL);
                    q2.h hVar = q2.i.f10709f;
                    if (sVar.S || !i9.l.a(sVar.K(), Integer.valueOf(iP))) {
                        ob.a.w(iP, sVar, iP, hVar);
                    }
                    f1.b.w(sVar, q2.i.f10706c, pVarC3);
                    cVar.invoke(sVar, 0);
                    sVar.p(true);
                }
                break;
            case 1:
                ((Number) obj2).intValue();
                d1.a((h1) obj4, (r1.p) obj3, (h9.n) eVar, (f1.s) obj, f1.b.y(9));
                break;
            case 2:
                ((Number) obj2).intValue();
                androidx.compose.ui.viewinterop.a.b((h9.k) obj4, (r1.p) obj3, (h9.k) eVar, (f1.s) obj, f1.b.y(49));
                break;
            case 3:
                f1.s sVar2 = (f1.s) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (!sVar2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    sVar2.Q();
                } else {
                    j1.a((u) obj4, (u0) obj3, (h9.n) eVar, sVar2, 0);
                }
                break;
            default:
                ((Number) obj2).intValue();
                j1.a((q2.q1) obj4, (u0) obj3, (h9.n) eVar, (f1.s) obj, f1.b.y(1));
                break;
        }
        return zVar;
    }
}
