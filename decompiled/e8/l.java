package e8;

import java.util.Date;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements h9.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f1.b1 f4575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f1.b1 f4576c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f1.b1 f4577d;

    public /* synthetic */ l(int i7, f1.b1 b1Var, f1.b1 b1Var2, f1.b1 b1Var3) {
        this.f4574a = i7;
        this.f4575b = b1Var;
        this.f4576c = b1Var2;
        this.f4577d = b1Var3;
    }

    @Override // h9.k
    public final Object invoke(Object obj) {
        int i7 = this.f4574a;
        u8.w wVar = u8.w.f13122a;
        t8.z zVar = t8.z.f12851a;
        f1.b1 b1Var = this.f4577d;
        f1.b1 b1Var2 = this.f4576c;
        f1.b1 b1Var3 = this.f4575b;
        switch (i7) {
            case 0:
                l8.j0 j0Var = (l8.j0) obj;
                i9.l.e(j0Var, "option");
                int i10 = w.f4641e;
                b1Var3.setValue(j0Var);
                b1Var2.setValue(Boolean.FALSE);
                b1Var.setValue(wVar);
                break;
            case 1:
                l8.j0 j0Var2 = (l8.j0) obj;
                i9.l.e(j0Var2, "option");
                int i11 = w.f4641e;
                b1Var3.setValue(j0Var2);
                b1Var2.setValue(Boolean.FALSE);
                b1Var.setValue(wVar);
                break;
            case 2:
                String str = (String) obj;
                if (!zb.j.r0(str, "任务触发", false) && zb.j.r0(str, (String) b1Var3.getValue(), ((Boolean) b1Var2.getValue()).booleanValue())) {
                    b1Var.setValue(str);
                }
                break;
            case 3:
                l8.j0 j0Var3 = (l8.j0) obj;
                i9.l.e(j0Var3, "it");
                String strB = j0Var3.f8197b.b();
                int i12 = f1.f4534f;
                b1Var3.setValue(strB);
                List listJ0 = zb.j.J0(j0Var3.f8198c, new String[]{"|"}, 2);
                b1Var2.setValue(new t8.j(Double.valueOf(Double.parseDouble((String) u8.p.k0(listJ0))), Double.valueOf(Double.parseDouble((String) u8.p.s0(listJ0)))));
                b1Var.setValue(o9.e0.F(((Number) ((t8.j) b1Var2.getValue()).f12830a).doubleValue(), ((Number) ((t8.j) b1Var2.getValue()).f12831b).doubleValue(), new Date()));
                break;
            default:
                i9.l.e(b1Var3, "$size$delegate");
                i9.l.e(b1Var2, "$radius$delegate");
                i9.l.e(b1Var, "$center$delegate");
                b1Var3.setValue(new n3.m(((n3.m) obj).f8746a));
                long j5 = ((n3.m) b1Var3.getValue()).f8746a;
                b1Var2.setValue(Float.valueOf(Math.min((int) (j5 >> 32), (int) (j5 & 4294967295L)) * 0.5f));
                b1Var.setValue(new x1.b(k9.a.u(((n3.m) b1Var3.getValue()).f8746a)));
                break;
        }
        return zVar;
    }
}
