package c8;

import f1.b1;
import f1.w0;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class h implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b1 f2505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b1 f2506c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List f2507d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p1.p f2508e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b1 f2509f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ b1 f2510g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ List f2511h;

    public /* synthetic */ h(b1 b1Var, b1 b1Var2, List list, p1.p pVar, b1 b1Var3, b1 b1Var4, List list2, int i7) {
        this.f2504a = i7;
        this.f2505b = b1Var;
        this.f2506c = b1Var2;
        this.f2507d = list;
        this.f2508e = pVar;
        this.f2509f = b1Var3;
        this.f2510g = b1Var4;
        this.f2511h = list2;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        int i7 = this.f2504a;
        t8.z zVar = t8.z.f12851a;
        int i10 = 16;
        switch (i7) {
            case 0:
                f1.s sVar = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar.z()) {
                    sVar.Q();
                } else {
                    b1 b1Var = this.f2506c;
                    List list = this.f2507d;
                    b1 b1Var2 = this.f2505b;
                    p1.p pVar = this.f2508e;
                    n1.c cVarE = n1.h.e(1363707863, new g(b1Var2, b1Var, list, pVar), sVar);
                    b1 b1Var3 = this.f2509f;
                    n1.c cVarE2 = n1.h.e(-1115771944, new a8.w(b1Var3, i10), sVar);
                    sVar.W(5004770);
                    Object objK = sVar.K();
                    b1 b1Var4 = this.f2510g;
                    w0 w0Var = f1.n.f5051a;
                    if (objK == w0Var) {
                        objK = new a8.k(b1Var4, 12);
                        sVar.h0(objK);
                    }
                    sVar.p(false);
                    a.a.h(cVarE, cVarE2, false, (h9.a) objK, sVar, 3510, 0);
                    n nVar = n.f2521a;
                    boolean zBooleanValue = ((Boolean) b1Var4.getValue()).booleanValue();
                    sVar.W(5004770);
                    Object objK2 = sVar.K();
                    if (objK2 == w0Var) {
                        objK2 = new a8.k(b1Var4, 13);
                        sVar.h0(objK2);
                    }
                    sVar.p(false);
                    l8.n.a(zBooleanValue, (h9.a) objK2, 0L, false, 0, null, null, null, null, n1.h.e(1798106903, new g(this.f2511h, b1Var3, pVar, b1Var4, 2), sVar), sVar, 48, 1020);
                }
                break;
            default:
                f1.s sVar2 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar2.z()) {
                    sVar2.Q();
                } else {
                    g5.a.b(null, n1.h.e(-370006048, new h(this.f2505b, this.f2506c, this.f2507d, this.f2508e, this.f2509f, this.f2510g, this.f2511h, 0), sVar2), sVar2, 48, 1);
                    a2.f.L(16, sVar2, r1.m.f11116a, sVar2);
                }
                break;
        }
        return zVar;
    }
}
