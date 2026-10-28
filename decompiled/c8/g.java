package c8;

import d0.l0;
import d0.n0;
import f1.b1;
import f1.q1;
import f1.w0;
import java.util.List;
import l8.j0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class g implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b1 f2500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b1 f2501c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List f2502d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p1.p f2503e;

    public g(b1 b1Var, b1 b1Var2, List list, p1.p pVar) {
        this.f2499a = 1;
        this.f2500b = b1Var;
        this.f2501c = b1Var2;
        this.f2502d = list;
        this.f2503e = pVar;
    }

    public /* synthetic */ g(List list, b1 b1Var, p1.p pVar, b1 b1Var2, int i7) {
        this.f2499a = i7;
        this.f2502d = list;
        this.f2500b = b1Var;
        this.f2503e = pVar;
        this.f2501c = b1Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        boolean z10;
        int i7 = this.f2499a;
        final int i10 = 1;
        final b1 b1Var = this.f2501c;
        final p1.p pVar = this.f2503e;
        final b1 b1Var2 = this.f2500b;
        t8.z zVar = t8.z.f12851a;
        w0 w0Var = f1.n.f5051a;
        switch (i7) {
            case 0:
                f1.s sVar = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar.z()) {
                    sVar.Q();
                } else {
                    n nVar = n.f2521a;
                    j0 j0Var = (j0) b1Var2.getValue();
                    sVar.W(-1746271574);
                    Object objK = sVar.K();
                    if (objK == w0Var) {
                        z10 = false;
                        final Object[] objArr = 0 == true ? 1 : 0;
                        objK = new h9.k() { // from class: c8.f
                            @Override // h9.k
                            public final Object invoke(Object obj3) {
                                int i11 = objArr;
                                t8.z zVar2 = t8.z.f12851a;
                                b1 b1Var3 = b1Var;
                                b1 b1Var4 = b1Var2;
                                p1.p pVar2 = pVar;
                                j0 j0Var2 = (j0) obj3;
                                switch (i11) {
                                    case 0:
                                        i9.l.e(j0Var2, "option");
                                        n nVar2 = n.f2521a;
                                        b1Var4.setValue(j0Var2);
                                        b1Var3.setValue(Boolean.FALSE);
                                        pVar2.clear();
                                        break;
                                    default:
                                        i9.l.e(j0Var2, "option");
                                        n nVar3 = n.f2521a;
                                        b1Var4.setValue(j0Var2);
                                        b1Var3.setValue(Boolean.FALSE);
                                        pVar2.clear();
                                        break;
                                }
                                return zVar2;
                            }
                        };
                        sVar.h0(objK);
                    } else {
                        z10 = false;
                    }
                    sVar.p(z10);
                    g5.a.c(this.f2502d, j0Var, 0, null, 0.0f, 0.0f, (h9.k) objK, sVar, 1572864, 60);
                }
                break;
            case 1:
                f1.s sVar2 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar2.z()) {
                    sVar2.Q();
                } else {
                    sVar2.W(1849434622);
                    Object objK2 = sVar2.K();
                    if (objK2 == w0Var) {
                        objK2 = ob.a.m(sVar2);
                    }
                    b0.k kVar = (b0.k) objK2;
                    Object objC = a2.f.C(sVar2, false, 5004770);
                    b1 b1Var3 = this.f2500b;
                    if (objC == w0Var) {
                        objC = new a8.k(b1Var3, 14);
                        sVar2.h0(objC);
                    }
                    sVar2.p(false);
                    r1.m mVar = r1.m.f11116a;
                    r1.p pVarC = androidx.compose.foundation.a.c(mVar, kVar, null, false, (h9.a) objC, 28);
                    d0.s sVarA = d0.q.a(d0.h.f3568c, r1.c.f11103m, sVar2, 0);
                    long j5 = sVar2.T;
                    int i11 = (int) (j5 ^ (j5 >>> 32));
                    q1 q1VarL = sVar2.l();
                    r1.p pVarC2 = r1.a.c(sVar2, pVarC);
                    q2.j.f10719d0.getClass();
                    q2.a0 a0Var = q2.i.f10705b;
                    sVar2.a0();
                    if (sVar2.S) {
                        sVar2.k(a0Var);
                    } else {
                        sVar2.k0();
                    }
                    q2.h hVar = q2.i.f10708e;
                    f1.b.w(sVar2, hVar, sVarA);
                    q2.h hVar2 = q2.i.f10707d;
                    f1.b.w(sVar2, hVar2, q1VarL);
                    q2.h hVar3 = q2.i.f10709f;
                    if (sVar2.S || !i9.l.a(sVar2.K(), Integer.valueOf(i11))) {
                        ob.a.w(i11, sVar2, i11, hVar3);
                    }
                    q2.h hVar4 = q2.i.f10706c;
                    f1.b.w(sVar2, hVar4, pVarC2);
                    i2.c.m("实时日志", null, sVar2, 6, 2);
                    d0.c.a(sVar2, androidx.compose.foundation.layout.c.b(mVar, g5.a.n(5, sVar2)));
                    n0 n0VarA = l0.a(d0.h.f3566a, r1.c.f11101j, sVar2, 0);
                    long j10 = sVar2.T;
                    int i12 = (int) (j10 ^ (j10 >>> 32));
                    q1 q1VarL2 = sVar2.l();
                    r1.p pVarC3 = r1.a.c(sVar2, mVar);
                    sVar2.a0();
                    if (sVar2.S) {
                        sVar2.k(a0Var);
                    } else {
                        sVar2.k0();
                    }
                    f1.b.w(sVar2, hVar, n0VarA);
                    f1.b.w(sVar2, hVar2, q1VarL2);
                    if (sVar2.S || !i9.l.a(sVar2.K(), Integer.valueOf(i12))) {
                        ob.a.w(i12, sVar2, i12, hVar3);
                    }
                    f1.b.w(sVar2, hVar4, pVarC3);
                    n nVar2 = n.f2521a;
                    b1 b1Var4 = this.f2501c;
                    i2.c.p(((j0) b1Var4.getValue()).f8196a, sVar2, 0);
                    i2.c.i(0, sVar2);
                    sVar2.p(true);
                    sVar2.p(true);
                    boolean zBooleanValue = ((Boolean) b1Var3.getValue()).booleanValue();
                    sVar2.W(5004770);
                    Object objK3 = sVar2.K();
                    if (objK3 == w0Var) {
                        objK3 = new a8.k(b1Var3, 15);
                        sVar2.h0(objK3);
                    }
                    sVar2.p(false);
                    l8.n.a(zBooleanValue, (h9.a) objK3, 0L, false, 0, null, null, null, null, n1.h.e(-1824614258, new g(this.f2502d, b1Var4, this.f2503e, b1Var3, 0), sVar2), sVar2, 48, 1020);
                }
                break;
            default:
                f1.s sVar3 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar3.z()) {
                    sVar3.Q();
                } else {
                    n nVar3 = n.f2521a;
                    j0 j0Var2 = (j0) b1Var2.getValue();
                    sVar3.W(-1746271574);
                    Object objK4 = sVar3.K();
                    if (objK4 == w0Var) {
                        objK4 = new h9.k() { // from class: c8.f
                            @Override // h9.k
                            public final Object invoke(Object obj3) {
                                int i13 = i10;
                                t8.z zVar2 = t8.z.f12851a;
                                b1 b1Var5 = b1Var;
                                b1 b1Var6 = b1Var2;
                                p1.p pVar2 = pVar;
                                j0 j0Var3 = (j0) obj3;
                                switch (i13) {
                                    case 0:
                                        i9.l.e(j0Var3, "option");
                                        n nVar4 = n.f2521a;
                                        b1Var6.setValue(j0Var3);
                                        b1Var5.setValue(Boolean.FALSE);
                                        pVar2.clear();
                                        break;
                                    default:
                                        i9.l.e(j0Var3, "option");
                                        n nVar5 = n.f2521a;
                                        b1Var6.setValue(j0Var3);
                                        b1Var5.setValue(Boolean.FALSE);
                                        pVar2.clear();
                                        break;
                                }
                                return zVar2;
                            }
                        };
                        sVar3.h0(objK4);
                    }
                    sVar3.p(false);
                    g5.a.c(this.f2502d, j0Var2, 0, null, 0.0f, 0.0f, (h9.k) objK4, sVar3, 1572864, 60);
                }
                break;
        }
        return zVar;
    }
}
