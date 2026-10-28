package b8;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s0 implements pc.w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s0 f1647a;
    private static final nc.e descriptor;

    static {
        s0 s0Var = new s0();
        f1647a = s0Var;
        pc.o0 o0Var = new pc.o0("com.muyetuge.carlifevehicle.feature.tasker.model.TaskerEvent.KeyBoard", s0Var, 3);
        o0Var.b("keyCode", true);
        o0Var.b("action", true);
        o0Var.b("consumed", true);
        descriptor = o0Var;
    }

    @Override // mc.a
    public final void a(rc.s sVar, Object obj) {
        u0 u0Var = (u0) obj;
        i9.l.e(u0Var, "value");
        boolean z10 = u0Var.f1658d;
        int i7 = u0Var.f1657c;
        int i10 = u0Var.f1656b;
        nc.e eVar = descriptor;
        rc.s sVarA = sVar.a(eVar);
        t0 t0Var = u0.Companion;
        if (sVarA.u(eVar) || i10 != 0) {
            sVarA.m(0, i10, eVar);
        }
        if (sVarA.u(eVar) || i7 != 0) {
            sVarA.m(1, i7, eVar);
        }
        if (sVarA.u(eVar) || !z10) {
            sVarA.c(eVar, 2, z10);
        }
        sVarA.t(eVar);
    }

    @Override // pc.w
    public final mc.a[] b() {
        pc.c0 c0Var = pc.c0.f10429a;
        return new mc.a[]{c0Var, c0Var, pc.f.f10442a};
    }

    @Override // mc.a
    public final Object c(oc.b bVar) {
        nc.e eVar = descriptor;
        oc.a aVarM = bVar.m(eVar);
        boolean z10 = true;
        int i7 = 0;
        int iU = 0;
        int iU2 = 0;
        boolean zQ = false;
        while (z10) {
            int iW = aVarM.w(eVar);
            if (iW == -1) {
                z10 = false;
            } else if (iW == 0) {
                iU = aVarM.u(eVar, 0);
                i7 |= 1;
            } else if (iW == 1) {
                iU2 = aVarM.u(eVar, 1);
                i7 |= 2;
            } else {
                if (iW != 2) {
                    throw new mc.f(iW);
                }
                zQ = aVarM.q(eVar, 2);
                i7 |= 4;
            }
        }
        aVarM.p(eVar);
        return new u0(i7, iU, iU2, zQ);
    }

    @Override // mc.a
    public final nc.e d() {
        return descriptor;
    }
}
