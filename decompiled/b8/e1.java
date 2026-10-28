package b8;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e1 implements pc.w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e1 f1581a;
    private static final nc.e descriptor;

    static {
        e1 e1Var = new e1();
        f1581a = e1Var;
        pc.o0 o0Var = new pc.o0("com.muyetuge.carlifevehicle.feature.tasker.model.TaskerEvent.NetWork", e1Var, 1);
        o0Var.b("url", true);
        descriptor = o0Var;
    }

    @Override // mc.a
    public final void a(rc.s sVar, Object obj) {
        g1 g1Var = (g1) obj;
        i9.l.e(g1Var, "value");
        String str = g1Var.f1592b;
        nc.e eVar = descriptor;
        rc.s sVarA = sVar.a(eVar);
        f1 f1Var = g1.Companion;
        if (sVarA.u(eVar) || !i9.l.a(str, "")) {
            sVarA.s(eVar, 0, str);
        }
        sVarA.t(eVar);
    }

    @Override // pc.w
    public final mc.a[] b() {
        return new mc.a[]{pc.x0.f10518a};
    }

    @Override // mc.a
    public final Object c(oc.b bVar) {
        nc.e eVar = descriptor;
        oc.a aVarM = bVar.m(eVar);
        String strS = null;
        boolean z10 = true;
        int i7 = 0;
        while (z10) {
            int iW = aVarM.w(eVar);
            if (iW == -1) {
                z10 = false;
            } else {
                if (iW != 0) {
                    throw new mc.f(iW);
                }
                strS = aVarM.s(eVar, 0);
                i7 = 1;
            }
        }
        aVarM.p(eVar);
        return new g1(i7, strS);
    }

    @Override // mc.a
    public final nc.e d() {
        return descriptor;
    }
}
