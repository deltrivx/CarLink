package b8;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q1 implements pc.w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q1 f1636a;
    private static final nc.e descriptor;

    static {
        q1 q1Var = new q1();
        f1636a = q1Var;
        pc.o0 o0Var = new pc.o0("com.muyetuge.carlifevehicle.feature.tasker.model.TaskerEvent.Theme", q1Var, 1);
        o0Var.b("code", true);
        descriptor = o0Var;
    }

    @Override // mc.a
    public final void a(rc.s sVar, Object obj) {
        s1 s1Var = (s1) obj;
        i9.l.e(s1Var, "value");
        int i7 = s1Var.f1648b;
        nc.e eVar = descriptor;
        rc.s sVarA = sVar.a(eVar);
        r1 r1Var = s1.Companion;
        if (sVarA.u(eVar) || i7 != 0) {
            sVarA.m(0, i7, eVar);
        }
        sVarA.t(eVar);
    }

    @Override // pc.w
    public final mc.a[] b() {
        return new mc.a[]{pc.c0.f10429a};
    }

    @Override // mc.a
    public final Object c(oc.b bVar) {
        nc.e eVar = descriptor;
        oc.a aVarM = bVar.m(eVar);
        boolean z10 = true;
        int i7 = 0;
        int iU = 0;
        while (z10) {
            int iW = aVarM.w(eVar);
            if (iW == -1) {
                z10 = false;
            } else {
                if (iW != 0) {
                    throw new mc.f(iW);
                }
                iU = aVarM.u(eVar, 0);
                i7 = 1;
            }
        }
        aVarM.p(eVar);
        return new s1(i7, iU);
    }

    @Override // mc.a
    public final nc.e d() {
        return descriptor;
    }
}
