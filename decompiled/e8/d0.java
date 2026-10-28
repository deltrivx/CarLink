package e8;

import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d0 implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f4505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f0 f4506c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f1.h1 f4507d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f1.b1 f4508e;

    public /* synthetic */ d0(boolean z10, f0 f0Var, f1.h1 h1Var, f1.b1 b1Var, int i7) {
        this.f4504a = i7;
        this.f4505b = z10;
        this.f4506c = f0Var;
        this.f4507d = h1Var;
        this.f4508e = b1Var;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        int i7 = this.f4504a;
        t8.z zVar = t8.z.f12851a;
        switch (i7) {
            case 0:
                f1.s sVar = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar.z()) {
                    sVar.Q();
                } else {
                    f1.h1 h1Var = this.f4507d;
                    a.a.h(n1.h.e(-1023362314, new a8.h1(h1Var, 4), sVar), n1.h.e(1036560183, new a8.h1(h1Var, 5), sVar), false, null, sVar, 54, 12);
                    int i10 = f0.f4526h;
                    sVar.U(-58889633, Integer.valueOf(h1Var.f()));
                    List listJ = n3.l.J("触发条件", "选择触发条件");
                    List listJ2 = n3.l.J(new l8.j0(a2.f.F("小于", "nit", h1Var.f()), new l8.k0(true), null, null, null, 28), new l8.j0(a2.f.F("大于", "nit", h1Var.f()), new l8.k0(false), null, null, null, 28));
                    sVar.W(5004770);
                    Object objK = sVar.K();
                    if (objK == f1.n.f5051a) {
                        objK = new a8.u(this.f4508e, 16);
                        sVar.h0(objK);
                    }
                    sVar.p(false);
                    k9.a.d(listJ, listJ2, null, 0, false, (h9.k) objK, sVar, ServiceTypes.MSG_MEDIA_DATA, 28);
                    sVar.p(false);
                    boolean z10 = this.f4505b;
                    f0 f0Var = this.f4506c;
                    if (z10) {
                        f0Var.d();
                    }
                    i2.c.j(n3.l.I("当前" + f1.b.k(f0Var.f4531e, sVar).getValue() + "nit 若无变化可能不支持"), sVar, 0);
                }
                break;
            default:
                f1.s sVar2 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar2.z()) {
                    sVar2.Q();
                } else {
                    g5.a.b(null, n1.h.e(-952015553, new d0(this.f4505b, this.f4506c, this.f4507d, this.f4508e, 0), sVar2), sVar2, 48, 1);
                }
                break;
        }
        return zVar;
    }
}
