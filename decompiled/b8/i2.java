package b8;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i2 implements pc.w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i2 f1599a;
    private static final nc.e descriptor;

    static {
        i2 i2Var = new i2();
        f1599a = i2Var;
        pc.o0 o0Var = new pc.o0("com.muyetuge.carlifevehicle.feature.tasker.model.TaskerOption", i2Var, 5);
        o0Var.b("id", false);
        o0Var.b("label", false);
        o0Var.b("trigger", false);
        o0Var.b("action", false);
        o0Var.b("enabled", true);
        descriptor = o0Var;
    }

    @Override // mc.a
    public final void a(rc.s sVar, Object obj) {
        n2 n2Var = (n2) obj;
        i9.l.e(n2Var, "value");
        nc.e eVar = descriptor;
        rc.s sVarA = sVar.a(eVar);
        t8.h[] hVarArr = n2.f1620f;
        int i7 = n2Var.f1623a;
        boolean z10 = n2Var.f1627e;
        sVarA.m(0, i7, eVar);
        sVarA.s(eVar, 1, n2Var.f1624b);
        sVarA.o(eVar, 2, (mc.a) hVarArr[2].getValue(), n2Var.f1625c);
        sVarA.o(eVar, 3, (mc.a) hVarArr[3].getValue(), n2Var.f1626d);
        if (sVarA.u(eVar) || !z10) {
            sVarA.c(eVar, 4, z10);
        }
        sVarA.t(eVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // pc.w
    public final mc.a[] b() {
        t8.h[] hVarArr = n2.f1620f;
        return new mc.a[]{pc.c0.f10429a, pc.x0.f10518a, hVarArr[2].getValue(), hVarArr[3].getValue(), pc.f.f10442a};
    }

    @Override // mc.a
    public final Object c(oc.b bVar) {
        nc.e eVar = descriptor;
        oc.a aVarM = bVar.m(eVar);
        t8.h[] hVarArr = n2.f1620f;
        String strS = null;
        List list = null;
        List list2 = null;
        boolean z10 = true;
        int i7 = 0;
        int iU = 0;
        boolean zQ = false;
        while (z10) {
            int iW = aVarM.w(eVar);
            if (iW == -1) {
                z10 = false;
            } else if (iW == 0) {
                iU = aVarM.u(eVar, 0);
                i7 |= 1;
            } else if (iW == 1) {
                strS = aVarM.s(eVar, 1);
                i7 |= 2;
            } else if (iW == 2) {
                list = (List) aVarM.t(eVar, 2, (mc.a) hVarArr[2].getValue(), list);
                i7 |= 4;
            } else if (iW == 3) {
                list2 = (List) aVarM.t(eVar, 3, (mc.a) hVarArr[3].getValue(), list2);
                i7 |= 8;
            } else {
                if (iW != 4) {
                    throw new mc.f(iW);
                }
                zQ = aVarM.q(eVar, 4);
                i7 |= 16;
            }
        }
        aVarM.p(eVar);
        return new n2(i7, iU, strS, list, list2, zQ);
    }

    @Override // mc.a
    public final nc.e d() {
        return descriptor;
    }
}
