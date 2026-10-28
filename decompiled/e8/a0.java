package e8;

import a8.x1;
import android.app.Activity;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a0 implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f1.b1 f4472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Activity f4473c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List f4474d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Set f4475e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f1.b1 f4476f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f1.h1 f4477g;

    public /* synthetic */ a0(f1.b1 b1Var, Activity activity, List list, Set set, f1.b1 b1Var2, f1.h1 h1Var, int i7) {
        this.f4471a = i7;
        this.f4472b = b1Var;
        this.f4473c = activity;
        this.f4474d = list;
        this.f4475e = set;
        this.f4476f = b1Var2;
        this.f4477g = h1Var;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        f1.b1 b1Var;
        int i7 = this.f4471a;
        t8.z zVar = t8.z.f12851a;
        switch (i7) {
            case 0:
                f1.s sVar = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar.z()) {
                    sVar.Q();
                } else {
                    float f10 = 4;
                    r1.p pVarK = androidx.compose.foundation.layout.a.k(androidx.compose.foundation.layout.c.f820a, 0.0f, f10, 0.0f, f10, 5);
                    int i10 = b0.f4485e;
                    f1.b1 b1Var2 = this.f4472b;
                    String str = (String) b1Var2.getValue();
                    sVar.W(5004770);
                    Object objK = sVar.K();
                    f1.w0 w0Var = f1.n.f5051a;
                    if (objK == w0Var) {
                        objK = new a8.u(b1Var2, 15);
                        sVar.h0(objK);
                    }
                    sVar.p(false);
                    n1.c cVar = c.f4495a;
                    Activity activity = this.f4473c;
                    Set set = this.f4475e;
                    f1.b1 b1Var3 = this.f4476f;
                    c1.b1.a(str, (h9.k) objK, pVarK, false, null, cVar, n1.h.e(-513575082, new x1(activity, this.f4474d, (Collection) set, b1Var3, 4), sVar), false, null, null, null, true, 0, 0, null, null, sVar, 806879664, 12582912, 8256952);
                    boolean zBooleanValue = ((Boolean) b1Var3.getValue()).booleanValue();
                    sVar.W(5004770);
                    Object objK2 = sVar.K();
                    if (objK2 == w0Var) {
                        b1Var = b1Var3;
                        objK2 = new a8.k(b1Var, 27);
                        sVar.h0(objK2);
                    } else {
                        b1Var = b1Var3;
                    }
                    sVar.p(false);
                    l8.n.a(zBooleanValue, (h9.a) objK2, 0L, false, 0, null, null, null, null, n1.h.e(-21589674, new a8.a1((Object) set, b1Var2, (Object) b1Var, 8), sVar), sVar, 48, 1020);
                    List listJ = n3.l.J("连接状态", "选择连接状态");
                    int i11 = 1;
                    List listJ2 = n3.l.J(new l8.j0("连接后", new l8.l0(1), null, null, null, 28), new l8.j0("断开后", new l8.l0(0), null, null, null, 28));
                    sVar.W(5004770);
                    Object objK3 = sVar.K();
                    if (objK3 == w0Var) {
                        objK3 = new a8.g1(this.f4477g, i11);
                        sVar.h0(objK3);
                    }
                    sVar.p(false);
                    k9.a.d(listJ, listJ2, null, 0, false, (h9.k) objK3, sVar, 221190, 12);
                }
                break;
            default:
                f1.s sVar2 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar2.z()) {
                    sVar2.Q();
                } else {
                    g5.a.b(null, n1.h.e(-1651773217, new a0(this.f4472b, this.f4473c, this.f4474d, this.f4475e, this.f4476f, this.f4477g, 0), sVar2), sVar2, 48, 1);
                }
                break;
        }
        return zVar;
    }
}
