package e8;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a1 implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b1 f4479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f1.b1 f4480c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f1.h1 f4481d;

    public /* synthetic */ a1(b1 b1Var, f1.b1 b1Var2, f1.h1 h1Var, int i7) {
        this.f4478a = i7;
        this.f4479b = b1Var;
        this.f4480c = b1Var2;
        this.f4481d = h1Var;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        int i7 = this.f4478a;
        t8.z zVar = t8.z.f12851a;
        f1.h1 h1Var = this.f4481d;
        f1.b1 b1Var = this.f4480c;
        b1 b1Var2 = this.f4479b;
        y8.c cVar = null;
        int i10 = 0;
        int i11 = 3;
        switch (i7) {
            case 0:
                f1.s sVar = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar.z()) {
                    sVar.Q();
                } else {
                    z0 z0Var = new z0(b1Var2, b1Var);
                    sVar.W(5004770);
                    boolean zH = sVar.h(z0Var);
                    Object objK = sVar.K();
                    f1.w0 w0Var = f1.n.f5051a;
                    if (zH || objK == w0Var) {
                        objK = new c8.b0(z0Var, cVar, i11);
                        sVar.h0(objK);
                    }
                    sVar.p(false);
                    f1.b.f(sVar, (h9.n) objK, zVar);
                    sVar.W(5004770);
                    boolean zH2 = sVar.h(z0Var);
                    Object objK2 = sVar.K();
                    if (zH2 || objK2 == w0Var) {
                        objK2 = new c8.k(2, z0Var);
                        sVar.h0(objK2);
                    }
                    sVar.p(false);
                    f1.b.c(zVar, (h9.k) objK2, sVar);
                    int i12 = 4;
                    float f10 = 4;
                    r1.p pVarK = androidx.compose.foundation.layout.a.k(androidx.compose.foundation.layout.c.f820a, 0.0f, f10, 0.0f, f10, 5);
                    int i13 = b1.f4490e;
                    String str = (String) b1Var.getValue();
                    sVar.W(5004770);
                    Object objK3 = sVar.K();
                    if (objK3 == w0Var) {
                        objK3 = new a8.u(b1Var, 23);
                        sVar.h0(objK3);
                    }
                    sVar.p(false);
                    c1.b1.a(str, (h9.k) objK3, pVarK, false, null, h.f4549a, null, false, null, null, null, true, 0, 0, null, null, sVar, 1573296, 12582912, 8257464);
                    List listJ = n3.l.J("按键动作", "选择按键动作");
                    List listJ2 = n3.l.J(new l8.j0("单击", new l8.l0(0), null, null, null, 28), new l8.j0("双击", new l8.l0(1), null, null, null, 28), new l8.j0("长按", new l8.l0(2), null, null, null, 28));
                    sVar.W(5004770);
                    Object objK4 = sVar.K();
                    if (objK4 == w0Var) {
                        objK4 = new a8.g1(h1Var, i12);
                        sVar.h0(objK4);
                    }
                    sVar.p(false);
                    k9.a.d(listJ, listJ2, null, 0, false, (h9.k) objK4, sVar, 221190, 12);
                }
                break;
            default:
                f1.s sVar2 = (f1.s) obj;
                if ((3 & ((Number) obj2).intValue()) == 2 && sVar2.z()) {
                    sVar2.Q();
                } else {
                    g5.a.b(null, n1.h.e(-1702250325, new a1(b1Var2, b1Var, h1Var, i10), sVar2), sVar2, 48, 1);
                }
                break;
        }
        return zVar;
    }
}
