package e8;

import a8.x1;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class n implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f1.b1 f4587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f1.b1 f4588c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List f4589d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f1.b1 f4590e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f1.b1 f4591f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f1.b1 f4592g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ArrayList f4593h;

    public /* synthetic */ n(f1.b1 b1Var, f1.b1 b1Var2, List list, f1.b1 b1Var3, f1.b1 b1Var4, f1.b1 b1Var5, ArrayList arrayList, int i7) {
        this.f4586a = i7;
        this.f4587b = b1Var;
        this.f4588c = b1Var2;
        this.f4589d = list;
        this.f4590e = b1Var3;
        this.f4591f = b1Var4;
        this.f4592g = b1Var5;
        this.f4593h = arrayList;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        int i7 = this.f4586a;
        t8.z zVar = t8.z.f12851a;
        switch (i7) {
            case 0:
                f1.s sVar = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar.z()) {
                    sVar.Q();
                } else {
                    f1.b1 b1Var = this.f4588c;
                    List list = this.f4589d;
                    f1.b1 b1Var2 = this.f4587b;
                    f1.b1 b1Var3 = this.f4590e;
                    n1.c cVarE = n1.h.e(-834323014, new m(b1Var2, b1Var, list, b1Var3), sVar);
                    f1.b1 b1Var4 = this.f4591f;
                    n1.c cVarE2 = n1.h.e(-186095557, new a8.w(b1Var4, 22), sVar);
                    sVar.W(5004770);
                    Object objK = sVar.K();
                    f1.b1 b1Var5 = this.f4592g;
                    f1.w0 w0Var = f1.n.f5051a;
                    if (objK == w0Var) {
                        objK = new a8.k(b1Var5, 23);
                        sVar.h0(objK);
                    }
                    sVar.p(false);
                    a.a.h(cVarE, cVarE2, false, (h9.a) objK, sVar, 3510, 0);
                    int i10 = w.f4641e;
                    boolean zBooleanValue = ((Boolean) b1Var5.getValue()).booleanValue();
                    sVar.W(5004770);
                    Object objK2 = sVar.K();
                    if (objK2 == w0Var) {
                        objK2 = new a8.k(b1Var5, 24);
                        sVar.h0(objK2);
                    }
                    sVar.p(false);
                    l8.n.a(zBooleanValue, (h9.a) objK2, 0L, false, 0, null, null, null, null, n1.h.e(-1970748166, new x1(this.f4593h, b1Var4, b1Var5, b1Var3), sVar), sVar, 48, 1020);
                }
                break;
            default:
                f1.s sVar2 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar2.z()) {
                    sVar2.Q();
                } else {
                    g5.a.b(null, n1.h.e(-132507581, new n(this.f4587b, this.f4588c, this.f4589d, this.f4590e, this.f4591f, this.f4592g, this.f4593h, 0), sVar2), sVar2, 48, 1);
                    a2.f.L(16, sVar2, r1.m.f11116a, sVar2);
                }
                break;
        }
        return zVar;
    }
}
