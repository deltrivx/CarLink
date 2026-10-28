package b8;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h1 implements pc.w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h1 f1597a;
    private static final nc.e descriptor;

    static {
        h1 h1Var = new h1();
        f1597a = h1Var;
        pc.o0 o0Var = new pc.o0("com.muyetuge.carlifevehicle.feature.tasker.model.TaskerEvent.Sensor", h1Var, 2);
        o0Var.b("isLowerThan", true);
        o0Var.b("code", true);
        descriptor = o0Var;
    }

    @Override // mc.a
    public final void a(rc.s sVar, Object obj) {
        j1 j1Var = (j1) obj;
        i9.l.e(j1Var, "value");
        int i7 = j1Var.f1603c;
        boolean z10 = j1Var.f1602b;
        nc.e eVar = descriptor;
        rc.s sVarA = sVar.a(eVar);
        i1 i1Var = j1.Companion;
        if (sVarA.u(eVar) || !z10) {
            sVarA.c(eVar, 0, z10);
        }
        if (sVarA.u(eVar) || i7 != 0) {
            sVarA.m(1, i7, eVar);
        }
        sVarA.t(eVar);
    }

    @Override // pc.w
    public final mc.a[] b() {
        return new mc.a[]{pc.f.f10442a, pc.c0.f10429a};
    }

    @Override // mc.a
    public final Object c(oc.b bVar) {
        nc.e eVar = descriptor;
        oc.a aVarM = bVar.m(eVar);
        boolean z10 = true;
        int i7 = 0;
        boolean zQ = false;
        int iU = 0;
        while (z10) {
            int iW = aVarM.w(eVar);
            if (iW == -1) {
                z10 = false;
            } else if (iW == 0) {
                zQ = aVarM.q(eVar, 0);
                i7 |= 1;
            } else {
                if (iW != 1) {
                    throw new mc.f(iW);
                }
                iU = aVarM.u(eVar, 1);
                i7 |= 2;
            }
        }
        aVarM.p(eVar);
        return new j1(i7, iU, zQ);
    }

    @Override // mc.a
    public final nc.e d() {
        return descriptor;
    }
}
