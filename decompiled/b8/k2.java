package b8;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k2 implements pc.w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k2 f1606a;
    private static final nc.e descriptor;

    static {
        k2 k2Var = new k2();
        f1606a = k2Var;
        pc.o0 o0Var = new pc.o0("com.muyetuge.carlifevehicle.feature.tasker.model.TaskerOption.Item", k2Var, 4);
        o0Var.b("name", false);
        o0Var.b("label", false);
        o0Var.b("info", false);
        o0Var.b("event", false);
        descriptor = o0Var;
    }

    @Override // mc.a
    public final void a(rc.s sVar, Object obj) {
        m2 m2Var = (m2) obj;
        i9.l.e(m2Var, "value");
        nc.e eVar = descriptor;
        rc.s sVarA = sVar.a(eVar);
        t8.h[] hVarArr = m2.f1613e;
        sVarA.s(eVar, 0, m2Var.f1614a);
        sVarA.s(eVar, 1, m2Var.f1615b);
        sVarA.s(eVar, 2, m2Var.f1616c);
        sVarA.o(eVar, 3, (mc.a) hVarArr[3].getValue(), m2Var.f1617d);
        sVarA.t(eVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // pc.w
    public final mc.a[] b() {
        t8.h[] hVarArr = m2.f1613e;
        pc.x0 x0Var = pc.x0.f10518a;
        return new mc.a[]{x0Var, x0Var, x0Var, hVarArr[3].getValue()};
    }

    @Override // mc.a
    public final Object c(oc.b bVar) {
        nc.e eVar = descriptor;
        oc.a aVarM = bVar.m(eVar);
        t8.h[] hVarArr = m2.f1613e;
        String strS = null;
        String strS2 = null;
        String strS3 = null;
        c2 c2Var = null;
        boolean z10 = true;
        int i7 = 0;
        while (z10) {
            int iW = aVarM.w(eVar);
            if (iW == -1) {
                z10 = false;
            } else if (iW == 0) {
                strS = aVarM.s(eVar, 0);
                i7 |= 1;
            } else if (iW == 1) {
                strS2 = aVarM.s(eVar, 1);
                i7 |= 2;
            } else if (iW == 2) {
                strS3 = aVarM.s(eVar, 2);
                i7 |= 4;
            } else {
                if (iW != 3) {
                    throw new mc.f(iW);
                }
                c2Var = (c2) aVarM.t(eVar, 3, (mc.a) hVarArr[3].getValue(), c2Var);
                i7 |= 8;
            }
        }
        aVarM.p(eVar);
        return new m2(i7, strS, strS2, strS3, c2Var);
    }

    @Override // mc.a
    public final nc.e d() {
        return descriptor;
    }
}
