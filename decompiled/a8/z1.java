package a8;

import android.app.Activity;
import androidx.compose.foundation.layout.FillElement;
import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class z1 implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f1.b1 f298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Activity f299c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List f300d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f301e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f1.b1 f302f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f1.b1 f303g;

    public /* synthetic */ z1(f1.b1 b1Var, Activity activity, List list, List list2, f1.b1 b1Var2, f1.b1 b1Var3, int i7) {
        this.f297a = i7;
        this.f298b = b1Var;
        this.f299c = activity;
        this.f300d = list;
        this.f301e = list2;
        this.f302f = b1Var2;
        this.f303g = b1Var3;
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.Object, java.util.List] */
    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        f1.b1 b1Var;
        switch (this.f297a) {
            case 0:
                f1.s sVar = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar.z()) {
                    sVar.Q();
                } else {
                    FillElement fillElement = androidx.compose.foundation.layout.c.f820a;
                    float f10 = 4;
                    r1.p pVarK = androidx.compose.foundation.layout.a.k(fillElement, 0.0f, f10, 0.0f, f10, 5);
                    f1.b1 b1Var2 = this.f298b;
                    String str = (String) b1Var2.getValue();
                    sVar.W(5004770);
                    Object objK = sVar.K();
                    f1.w0 w0Var = f1.n.f5051a;
                    if (objK == w0Var) {
                        objK = new u(b1Var2, 9);
                        sVar.h0(objK);
                    }
                    sVar.p(false);
                    n1.c cVar = h.f130a;
                    Activity activity = this.f299c;
                    ?? r10 = this.f301e;
                    f1.b1 b1Var3 = this.f302f;
                    c1.b1.a(str, (h9.k) objK, pVarK, false, null, cVar, n1.h.e(698331126, new x1(activity, this.f300d, (Collection) r10, b1Var3, 1), sVar), false, null, null, null, true, 0, 0, null, null, sVar, 806879664, 12582912, 8256952);
                    boolean zBooleanValue = ((Boolean) b1Var3.getValue()).booleanValue();
                    sVar.W(5004770);
                    Object objK2 = sVar.K();
                    if (objK2 == w0Var) {
                        b1Var = b1Var3;
                        objK2 = new k(b1Var, 9);
                        sVar.h0(objK2);
                    } else {
                        b1Var = b1Var3;
                    }
                    sVar.p(false);
                    l8.n.a(zBooleanValue, (h9.a) objK2, 0L, false, 0, null, null, null, null, n1.h.e(-970140170, new a1((Object) r10, b1Var2, (Object) b1Var, 4), sVar), sVar, 48, 1020);
                    r1.p pVarK2 = androidx.compose.foundation.layout.a.k(fillElement, 0.0f, f10, 0.0f, 12, 5);
                    f1.b1 b1Var4 = this.f303g;
                    String str2 = (String) b1Var4.getValue();
                    sVar.W(5004770);
                    Object objK3 = sVar.K();
                    if (objK3 == w0Var) {
                        objK3 = new u(b1Var4, 10);
                        sVar.h0(objK3);
                    }
                    sVar.p(false);
                    c1.b1.a(str2, (h9.k) objK3, pVarK2, false, null, h.f131b, null, false, null, null, null, true, 0, 0, null, null, sVar, 1573296, 12582912, 8257464);
                }
                break;
            default:
                f1.s sVar2 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar2.z()) {
                    sVar2.Q();
                } else {
                    g5.a.b(null, n1.h.e(715310093, new z1(this.f298b, this.f299c, this.f300d, this.f301e, this.f302f, this.f303g, 0), sVar2), sVar2, 48, 1);
                }
                break;
        }
        return t8.z.f12851a;
    }
}
