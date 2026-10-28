package b8;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q implements pc.w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f1635a;
    private static final nc.e descriptor;

    static {
        q qVar = new q();
        f1635a = qVar;
        pc.o0 o0Var = new pc.o0("com.muyetuge.carlifevehicle.feature.tasker.model.TaskerEvent.BTDevice", qVar, 2);
        o0Var.b("name", true);
        o0Var.b("state", true);
        descriptor = o0Var;
    }

    @Override // mc.a
    public final void a(rc.s sVar, Object obj) {
        s sVar2 = (s) obj;
        i9.l.e(sVar2, "value");
        int i7 = sVar2.f1646c;
        String str = sVar2.f1645b;
        nc.e eVar = descriptor;
        rc.s sVarA = sVar.a(eVar);
        r rVar = s.Companion;
        if (sVarA.u(eVar) || !i9.l.a(str, "")) {
            sVarA.s(eVar, 0, str);
        }
        if (sVarA.u(eVar) || i7 != 0) {
            sVarA.m(1, i7, eVar);
        }
        sVarA.t(eVar);
    }

    @Override // pc.w
    public final mc.a[] b() {
        return new mc.a[]{pc.x0.f10518a, pc.c0.f10429a};
    }

    @Override // mc.a
    public final Object c(oc.b bVar) {
        nc.e eVar = descriptor;
        oc.a aVarM = bVar.m(eVar);
        String strS = null;
        boolean z10 = true;
        int i7 = 0;
        int iU = 0;
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
                iU = aVarM.u(eVar, 1);
                i7 |= 2;
            }
        }
        aVarM.p(eVar);
        return new s(strS, i7, iU);
    }

    @Override // mc.a
    public final nc.e d() {
        return descriptor;
    }
}
