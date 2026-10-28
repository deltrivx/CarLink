package b8;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n1 implements pc.w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n1 f1619a;
    private static final nc.e descriptor;

    static {
        n1 n1Var = new n1();
        f1619a = n1Var;
        pc.o0 o0Var = new pc.o0("com.muyetuge.carlifevehicle.feature.tasker.model.TaskerEvent.SystemUi", n1Var, 1);
        o0Var.b("code", true);
        descriptor = o0Var;
    }

    @Override // mc.a
    public final void a(rc.s sVar, Object obj) {
        p1 p1Var = (p1) obj;
        i9.l.e(p1Var, "value");
        int i7 = p1Var.f1634b;
        nc.e eVar = descriptor;
        rc.s sVarA = sVar.a(eVar);
        o1 o1Var = p1.Companion;
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
        return new p1(i7, iU);
    }

    @Override // mc.a
    public final nc.e d() {
        return descriptor;
    }
}
