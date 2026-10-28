package e8;

import android.content.pm.PackageManager;
import b8.r2;
import b8.s2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class m0 implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d8.f f4585b;

    public /* synthetic */ m0(d8.f fVar, int i7) {
        this.f4584a = i7;
        this.f4585b = fVar;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f4584a) {
            case 0:
                f1.s sVar = (f1.s) obj;
                int iIntValue = ((Number) obj2).intValue();
                d8.f fVar = this.f4585b;
                if ((iIntValue & 3) == 2 && sVar.z()) {
                    sVar.Q();
                } else {
                    sVar.W(1849434622);
                    Object objK = sVar.K();
                    f1.w0 w0Var = f1.n.f5051a;
                    if (objK == w0Var) {
                        objK = f1.b.s("不支持");
                        sVar.h0(objK);
                    }
                    final f1.b1 b1Var = (f1.b1) objK;
                    sVar.p(false);
                    sVar.W(-1551077674);
                    try {
                        PackageManager packageManager = n8.a.b().getPackageManager();
                        i9.l.d(packageManager, "getPackageManager(...)");
                        packageManager.getPackageInfo("com.desay.svcarinfo", 0);
                        r2 r2Var = s2.f1649c;
                        boolean zC = fVar.c();
                        r2Var.getClass();
                        b1Var.setValue(r2.a(zC ? 1 : 0));
                        sVar.W(5004770);
                        Object objK2 = sVar.K();
                        if (objK2 == w0Var) {
                            objK2 = new d8.a() { // from class: e8.l0
                                @Override // d8.a
                                public final void a(boolean z10) {
                                    s2.f1649c.getClass();
                                    b1Var.setValue(r2.a(z10 ? 1 : 0));
                                }
                            };
                            sVar.h0(objK2);
                        }
                        d8.a aVar = (d8.a) objK2;
                        sVar.p(false);
                        i9.l.e(aVar, "listener");
                        fVar.f3801c = aVar;
                        fVar.a();
                    } catch (Exception unused) {
                    }
                    sVar.p(false);
                    i2.c.m(ob.a.q("当前: ", (String) b1Var.getValue()), null, sVar, 0, 2);
                    i2.c.b(0, sVar);
                }
                break;
            case 1:
                f1.s sVar2 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar2.z()) {
                    sVar2.Q();
                } else {
                    a.a.h(e.f4516a, n1.h.e(677714826, new m0(this.f4585b, 0), sVar2), false, null, sVar2, 438, 8);
                }
                break;
            default:
                f1.s sVar3 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar3.z()) {
                    sVar3.Q();
                } else {
                    g5.a.b(null, n1.h.e(1777783426, new m0(this.f4585b, 1), sVar3), sVar3, 48, 1);
                    a2.f.L(16, sVar3, r1.m.f11116a, sVar3);
                }
                break;
        }
        return t8.z.f12851a;
    }
}
