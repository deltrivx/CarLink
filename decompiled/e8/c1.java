package e8;

import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c1 implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f4498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d1 f4499c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f1.h1 f4500d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f1.b1 f4501e;

    public /* synthetic */ c1(boolean z10, d1 d1Var, f1.h1 h1Var, f1.b1 b1Var, int i7) {
        this.f4497a = i7;
        this.f4498b = z10;
        this.f4499c = d1Var;
        this.f4500d = h1Var;
        this.f4501e = b1Var;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        int i7 = this.f4497a;
        t8.z zVar = t8.z.f12851a;
        switch (i7) {
            case 0:
                f1.s sVar = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar.z()) {
                    sVar.Q();
                } else {
                    f1.h1 h1Var = this.f4500d;
                    a.a.h(n1.h.e(-1612970410, new a8.h1(h1Var, 6), sVar), n1.h.e(-1554988137, new a8.h1(h1Var, 7), sVar), false, null, sVar, 54, 12);
                    sVar.U(1550874303, Integer.valueOf(h1Var.f()));
                    List listJ = n3.l.J("触发条件", "选择触发条件");
                    List listJ2 = n3.l.J(new l8.j0(a2.f.F("小于", "lux", h1Var.f()), new l8.k0(true), null, null, null, 28), new l8.j0(a2.f.F("大于", "lux", h1Var.f()), new l8.k0(false), null, null, null, 28));
                    sVar.W(5004770);
                    Object objK = sVar.K();
                    if (objK == f1.n.f5051a) {
                        objK = new a8.u(this.f4501e, 24);
                        sVar.h0(objK);
                    }
                    sVar.p(false);
                    k9.a.d(listJ, listJ2, null, 0, false, (h9.k) objK, sVar, ServiceTypes.MSG_MEDIA_DATA, 28);
                    sVar.p(false);
                    boolean z10 = this.f4498b;
                    d1 d1Var = this.f4499c;
                    if (z10) {
                        d1Var.d();
                    }
                    i2.c.j(n3.l.I("当前" + f1.b.k(d1Var.f4513e, sVar).getValue() + "lux 若无变化可能不支持"), sVar, 0);
                }
                break;
            default:
                f1.s sVar2 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar2.z()) {
                    sVar2.Q();
                } else {
                    g5.a.b(null, n1.h.e(-11794017, new c1(this.f4498b, this.f4499c, this.f4500d, this.f4501e, 0), sVar2), sVar2, 48, 1);
                }
                break;
        }
        return zVar;
    }
}
