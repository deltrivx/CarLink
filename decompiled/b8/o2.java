package b8;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o2 implements pc.w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o2 f1629a;
    private static final nc.e descriptor;

    static {
        o2 o2Var = new o2();
        f1629a = o2Var;
        pc.o0 o0Var = new pc.o0("com.muyetuge.carlifevehicle.feature.tasker.model.TaskerRegion", o2Var, 4);
        o0Var.b("province", false);
        o0Var.b("city", false);
        o0Var.b("lat", false);
        o0Var.b("lng", false);
        descriptor = o0Var;
    }

    @Override // mc.a
    public final void a(rc.s sVar, Object obj) {
        q2 q2Var = (q2) obj;
        i9.l.e(q2Var, "value");
        nc.e eVar = descriptor;
        rc.s sVarA = sVar.a(eVar);
        sVarA.s(eVar, 0, q2Var.f1638a);
        sVarA.s(eVar, 1, q2Var.f1639b);
        sVarA.g(eVar, 2, q2Var.f1640c);
        sVarA.g(eVar, 3, q2Var.f1641d);
        sVarA.t(eVar);
    }

    @Override // pc.w
    public final mc.a[] b() {
        pc.x0 x0Var = pc.x0.f10518a;
        pc.q qVar = pc.q.f10493a;
        return new mc.a[]{x0Var, x0Var, qVar, qVar};
    }

    @Override // mc.a
    public final Object c(oc.b bVar) {
        nc.e eVar = descriptor;
        oc.a aVarM = bVar.m(eVar);
        String strS = null;
        String strS2 = null;
        double d10 = 0.0d;
        double d11 = 0.0d;
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
                d10 = aVarM.d(eVar, 2);
                i7 |= 4;
            } else {
                if (iW != 3) {
                    throw new mc.f(iW);
                }
                d11 = aVarM.d(eVar, 3);
                i7 |= 8;
            }
        }
        aVarM.p(eVar);
        return new q2(i7, strS, strS2, d10, d11);
    }

    @Override // mc.a
    public final nc.e d() {
        return descriptor;
    }
}
