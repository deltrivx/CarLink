package b8;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w1 implements pc.w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w1 f1665a;
    private static final nc.e descriptor;

    static {
        w1 w1Var = new w1();
        f1665a = w1Var;
        pc.o0 o0Var = new pc.o0("com.muyetuge.carlifevehicle.feature.tasker.model.TaskerEvent.WifiConnect", w1Var, 2);
        o0Var.b("username", true);
        o0Var.b("password", true);
        descriptor = o0Var;
    }

    @Override // mc.a
    public final void a(rc.s sVar, Object obj) {
        y1 y1Var = (y1) obj;
        i9.l.e(y1Var, "value");
        String str = y1Var.f1672c;
        String str2 = y1Var.f1671b;
        nc.e eVar = descriptor;
        rc.s sVarA = sVar.a(eVar);
        x1 x1Var = y1.Companion;
        if (sVarA.u(eVar) || !i9.l.a(str2, "")) {
            sVarA.s(eVar, 0, str2);
        }
        if (sVarA.u(eVar) || !i9.l.a(str, "")) {
            sVarA.s(eVar, 1, str);
        }
        sVarA.t(eVar);
    }

    @Override // pc.w
    public final mc.a[] b() {
        pc.x0 x0Var = pc.x0.f10518a;
        return new mc.a[]{x0Var, x0Var};
    }

    @Override // mc.a
    public final Object c(oc.b bVar) {
        nc.e eVar = descriptor;
        oc.a aVarM = bVar.m(eVar);
        String strS = null;
        String strS2 = null;
        boolean z10 = true;
        int i7 = 0;
        while (z10) {
            int iW = aVarM.w(eVar);
            if (iW == -1) {
                z10 = false;
            } else if (iW == 0) {
                strS = aVarM.s(eVar, 0);
                i7 |= 1;
            } else {
                if (iW != 1) {
                    throw new mc.f(iW);
                }
                strS2 = aVarM.s(eVar, 1);
                i7 |= 2;
            }
        }
        aVarM.p(eVar);
        return new y1(strS, strS2, i7);
    }

    @Override // mc.a
    public final nc.e d() {
        return descriptor;
    }
}
