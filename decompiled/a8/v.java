package a8;

import android.content.pm.PackageManager;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class v implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g0 f255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f1.b1 f256c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f1.b1 f257d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f1.b1 f258e;

    public /* synthetic */ v(g0 g0Var, f1.b1 b1Var, f1.b1 b1Var2, f1.b1 b1Var3, int i7) {
        this.f254a = i7;
        this.f255b = g0Var;
        this.f256c = b1Var;
        this.f257d = b1Var2;
        this.f258e = b1Var3;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f254a) {
            case 0:
                f1.s sVar = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar.z()) {
                    sVar.Q();
                } else {
                    sVar.W(888137363);
                    try {
                        n8.a.b().getPackageManager().getPermissionInfo("com.android.permission.GET_INSTALLED_APPS", 0);
                        List listJ = n3.l.J("应用列表权限", "获取应用列表权限");
                        s.s sVar2 = x6.a.f14604a;
                        Object gVar = (z6.a) sVar2.a("com.android.permission.GET_INSTALLED_APPS");
                        if (gVar == null) {
                            gVar = new a7.g(0);
                            sVar2.b("com.android.permission.GET_INSTALLED_APPS", gVar);
                        }
                        w7.f.f14170a.f(listJ, n3.l.I(gVar), false, sVar, 3078, 4);
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                    sVar.p(false);
                    sVar.W(-1633490746);
                    Object objK = sVar.K();
                    f1.b1 b1Var = this.f256c;
                    f1.w0 w0Var = f1.n.f5051a;
                    if (objK == w0Var) {
                        objK = new t(b1Var, this.f257d, 0);
                        sVar.h0(objK);
                    }
                    sVar.p(false);
                    g0 g0Var = this.f255b;
                    g0Var.e((h9.n) objK, sVar, 6);
                    String str = (String) b1Var.getValue();
                    sVar.W(5004770);
                    Object objK2 = sVar.K();
                    if (objK2 == w0Var) {
                        objK2 = new u(this.f258e, 0);
                        sVar.h0(objK2);
                    }
                    sVar.p(false);
                    g0Var.d(str, (h9.k) objK2, sVar, 48);
                }
                break;
            default:
                f1.s sVar3 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar3.z()) {
                    sVar3.Q();
                } else {
                    g5.a.b(null, n1.h.e(-289578291, new v(this.f255b, this.f256c, this.f257d, this.f258e, 0), sVar3), sVar3, 48, 1);
                }
                break;
        }
        return t8.z.f12851a;
    }
}
