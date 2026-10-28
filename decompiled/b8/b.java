package b8;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements pc.w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f1566a;
    private static final nc.e descriptor;

    static {
        b bVar = new b();
        f1566a = bVar;
        pc.o0 o0Var = new pc.o0("com.muyetuge.carlifevehicle.feature.tasker.model.TaskerEvent.Amap", bVar, 2);
        o0Var.b("keyType", true);
        o0Var.b("code", true);
        descriptor = o0Var;
    }

    @Override // mc.a
    public final void a(rc.s sVar, Object obj) {
        d dVar = (d) obj;
        i9.l.e(dVar, "value");
        int i7 = dVar.f1573c;
        int i10 = dVar.f1572b;
        nc.e eVar = descriptor;
        rc.s sVarA = sVar.a(eVar);
        c cVar = d.Companion;
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
        return new d(i7, iU, iU2);
    }

    @Override // mc.a
    public final nc.e d() {
        return descriptor;
    }
}
