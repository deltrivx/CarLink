package b8;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p0 implements pc.w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p0 f1633a;
    private static final nc.e descriptor;

    static {
        p0 p0Var = new p0();
        f1633a = p0Var;
        pc.o0 o0Var = new pc.o0("com.muyetuge.carlifevehicle.feature.tasker.model.TaskerEvent.Hotspot", p0Var, 3);
        o0Var.b("enabled", true);
        o0Var.b("username", true);
        o0Var.b("password", true);
        descriptor = o0Var;
    }

    @Override // mc.a
    public final void a(rc.s sVar, Object obj) {
        r0 r0Var = (r0) obj;
        i9.l.e(r0Var, "value");
        String str = r0Var.f1644d;
        String str2 = r0Var.f1643c;
        boolean z10 = r0Var.f1642b;
        nc.e eVar = descriptor;
        rc.s sVarA = sVar.a(eVar);
        q0 q0Var = r0.Companion;
        if (sVarA.u(eVar) || !z10) {
            sVarA.c(eVar, 0, z10);
        }
        if (sVarA.u(eVar) || !i9.l.a(str2, "")) {
            sVarA.s(eVar, 1, str2);
        }
        if (sVarA.u(eVar) || !i9.l.a(str, "")) {
            sVarA.s(eVar, 2, str);
        }
        sVarA.t(eVar);
    }

    @Override // pc.w
    public final mc.a[] b() {
        pc.x0 x0Var = pc.x0.f10518a;
        return new mc.a[]{pc.f.f10442a, x0Var, x0Var};
    }

    @Override // mc.a
    public final Object c(oc.b bVar) {
        nc.e eVar = descriptor;
        oc.a aVarM = bVar.m(eVar);
        String strS = null;
        String strS2 = null;
        boolean z10 = true;
        int i7 = 0;
        boolean zQ = false;
        while (z10) {
            int iW = aVarM.w(eVar);
            if (iW == -1) {
                z10 = false;
            } else if (iW == 0) {
                zQ = aVarM.q(eVar, 0);
                i7 |= 1;
            } else if (iW == 1) {
                strS = aVarM.s(eVar, 1);
                i7 |= 2;
            } else {
                if (iW != 2) {
                    throw new mc.f(iW);
                }
                strS2 = aVarM.s(eVar, 2);
                i7 |= 4;
            }
        }
        aVarM.p(eVar);
        return new r0(strS, i7, strS2, zQ);
    }

    @Override // mc.a
    public final nc.e d() {
        return descriptor;
    }
}
