package e8;

import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class s0 implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w1.o f4618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f1.b1 f4619c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f1.b1 f4620d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f1.h1 f4621e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f1.b1 f4622f;

    public /* synthetic */ s0(w1.o oVar, f1.b1 b1Var, f1.b1 b1Var2, f1.h1 h1Var, f1.b1 b1Var3, int i7) {
        this.f4617a = i7;
        this.f4618b = oVar;
        this.f4619c = b1Var;
        this.f4620d = b1Var2;
        this.f4621e = h1Var;
        this.f4622f = b1Var3;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        int i7 = this.f4617a;
        t8.z zVar = t8.z.f12851a;
        y8.c cVar = null;
        int i10 = 3;
        int i11 = 2;
        switch (i7) {
            case 0:
                f1.s sVar = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar.z()) {
                    sVar.Q();
                } else {
                    r1.m mVar = r1.m.f11116a;
                    w1.o oVar = this.f4618b;
                    r1.p pVarF = androidx.compose.foundation.a.f(androidx.compose.ui.focus.a.a(mVar, oVar), true, null);
                    sVar.W(5004770);
                    Object objK = sVar.K();
                    f1.w0 w0Var = f1.n.f5051a;
                    f1.b1 b1Var = this.f4619c;
                    if (objK == w0Var) {
                        objK = new aa.a(6, b1Var);
                        sVar.h0(objK);
                    }
                    sVar.p(false);
                    d0.m.a(androidx.compose.ui.input.key.a.a(pVarF, (h9.k) objK), sVar, 0);
                    sVar.W(5004770);
                    Object objK2 = sVar.K();
                    if (objK2 == w0Var) {
                        objK2 = new c8.b0(oVar, cVar, i11);
                        sVar.h0(objK2);
                    }
                    sVar.p(false);
                    f1.b.f(sVar, (h9.n) objK2, zVar);
                    float f10 = 4;
                    r1.p pVarK = androidx.compose.foundation.layout.a.k(androidx.compose.foundation.layout.c.f820a, 0.0f, f10, 0.0f, f10, 5);
                    sVar.W(5004770);
                    Object objK3 = sVar.K();
                    f1.b1 b1Var2 = this.f4620d;
                    if (objK3 == w0Var) {
                        objK3 = new a8.u(b1Var2, 17);
                        sVar.h0(objK3);
                    }
                    sVar.p(false);
                    r1.p pVarB = androidx.compose.ui.focus.a.b(pVarK, (h9.k) objK3);
                    String str = (String) b1Var.getValue();
                    sVar.W(5004770);
                    Object objK4 = sVar.K();
                    if (objK4 == w0Var) {
                        objK4 = new a8.u(b1Var, 18);
                        sVar.h0(objK4);
                    }
                    sVar.p(false);
                    c1.b1.a(str, (h9.k) objK4, pVarB, false, null, f.f4525a, n1.h.e(-1336638282, new a8.k0(11, oVar, b1Var2), sVar), false, null, null, null, true, 0, 0, null, null, sVar, 806879280, 12582912, 8256952);
                    List listJ = n3.l.J("按键动作", "选择按键动作");
                    b9.b<b8.a> bVar = b8.a.f1561e;
                    ArrayList arrayList = new ArrayList(u8.q.a0(bVar, 10));
                    for (b8.a aVar : bVar) {
                        arrayList.add(new l8.j0(aVar.f1562a, new l8.l0(aVar.f1563b), null, null, null, 28));
                    }
                    sVar.W(5004770);
                    Object objK5 = sVar.K();
                    if (objK5 == w0Var) {
                        objK5 = new a8.g1(this.f4621e, i10);
                        sVar.h0(objK5);
                    }
                    sVar.p(false);
                    k9.a.d(listJ, arrayList, null, 0, false, (h9.k) objK5, sVar, ServiceTypes.MSG_MEDIA_DATA, 28);
                    List listJ2 = n3.l.J("按键拦截", "阻止其他事件执行");
                    List listJ3 = n3.l.J(new l8.j0("拦截", new l8.k0(true), null, null, null, 28), new l8.j0("不拦截", new l8.k0(false), null, null, null, 28));
                    sVar.W(5004770);
                    Object objK6 = sVar.K();
                    if (objK6 == w0Var) {
                        objK6 = new a8.u(this.f4622f, 19);
                        sVar.h0(objK6);
                    }
                    sVar.p(false);
                    k9.a.d(listJ2, listJ3, null, 0, false, (h9.k) objK6, sVar, 221190, 12);
                }
                break;
            default:
                f1.s sVar2 = (f1.s) obj;
                if ((3 & ((Number) obj2).intValue()) == 2 && sVar2.z()) {
                    sVar2.Q();
                } else {
                    g5.a.b(null, n1.h.e(1820130879, new s0(this.f4618b, this.f4619c, this.f4620d, this.f4621e, this.f4622f, 0), sVar2), sVar2, 48, 1);
                }
                break;
        }
        return zVar;
    }
}
