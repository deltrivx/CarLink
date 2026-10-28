package b8;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y0 implements pc.w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y0 f1670a;
    private static final nc.e descriptor;

    static {
        y0 y0Var = new y0();
        f1670a = y0Var;
        pc.o0 o0Var = new pc.o0("com.muyetuge.carlifevehicle.feature.tasker.model.TaskerEvent.MediaButton", y0Var, 2);
        o0Var.b("keyCode", true);
        o0Var.b("action", true);
        descriptor = o0Var;
    }

    @Override // mc.a
    public final void a(rc.s sVar, Object obj) {
        a1 a1Var = (a1) obj;
        i9.l.e(a1Var, "value");
        int i7 = a1Var.f1565c;
        int i10 = a1Var.f1564b;
        nc.e eVar = descriptor;
        rc.s sVarA = sVar.a(eVar);
        z0 z0Var = a1.Companion;
        if (sVarA.u(eVar) || i10 != 0) {
            sVarA.m(0, i10, eVar);
        }
        if (sVarA.u(eVar) || i7 != 0) {
            sVarA.m(1, i7, eVar);
        }
        sVarA.t(eVar);
    }

    @Override // pc.w
    public final mc.a[] b() {
        pc.c0 c0Var = pc.c0.f10429a;
        return new mc.a[]{c0Var, c0Var};
    }

    @Override // mc.a
    public final Object c(oc.b bVar) {
        nc.e eVar = descriptor;
        oc.a aVarM = bVar.m(eVar);
        boolean z10 = true;
        int i7 = 0;
        int iU = 0;
        int iU2 = 0;
        while (z10) {
            int iW = aVarM.w(eVar);
            if (iW == -1) {
                z10 = false;
            } else if (iW == 0) {
                iU = aVarM.u(eVar, 0);
                i7 |= 1;
            } else {
                if (iW != 1) {
                    throw new mc.f(iW);
                }
                iU2 = aVarM.u(eVar, 1);
                i7 |= 2;
            }
        }
        aVarM.p(eVar);
        return new a1(i7, iU, iU2);
    }

    @Override // mc.a
    public final nc.e d() {
        return descriptor;
    }
}
