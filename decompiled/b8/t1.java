package b8;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t1 implements pc.w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t1 f1655a;
    private static final nc.e descriptor;

    static {
        t1 t1Var = new t1();
        f1655a = t1Var;
        pc.o0 o0Var = new pc.o0("com.muyetuge.carlifevehicle.feature.tasker.model.TaskerEvent.TimeRange", t1Var, 3);
        o0Var.b("enabled", true);
        o0Var.b("start", true);
        o0Var.b("end", true);
        descriptor = o0Var;
    }

    @Override // mc.a
    public final void a(rc.s sVar, Object obj) {
        v1 v1Var = (v1) obj;
        i9.l.e(v1Var, "value");
        String str = v1Var.f1663d;
        String str2 = v1Var.f1662c;
        boolean z10 = v1Var.f1661b;
        nc.e eVar = descriptor;
        rc.s sVarA = sVar.a(eVar);
        u1 u1Var = v1.Companion;
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
        return new v1(strS, i7, strS2, zQ);
    }

    @Override // mc.a
    public final nc.e d() {
        return descriptor;
    }
}
