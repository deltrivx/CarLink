package b8;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m0 implements pc.w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m0 f1609a;
    private static final nc.e descriptor;

    static {
        m0 m0Var = new m0();
        f1609a = m0Var;
        pc.o0 o0Var = new pc.o0("com.muyetuge.carlifevehicle.feature.tasker.model.TaskerEvent.Desay", m0Var, 1);
        o0Var.b("code", true);
        descriptor = o0Var;
    }

    @Override // mc.a
    public final void a(rc.s sVar, Object obj) {
        o0 o0Var = (o0) obj;
        i9.l.e(o0Var, "value");
        int i7 = o0Var.f1628b;
        nc.e eVar = descriptor;
        rc.s sVarA = sVar.a(eVar);
        n0 n0Var = o0.Companion;
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
        return new o0(i7, iU);
    }

    @Override // mc.a
    public final nc.e d() {
        return descriptor;
    }
}
