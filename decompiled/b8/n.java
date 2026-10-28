package b8;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements pc.w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f1618a;
    private static final nc.e descriptor;

    static {
        n nVar = new n();
        f1618a = nVar;
        pc.o0 o0Var = new pc.o0("com.muyetuge.carlifevehicle.feature.tasker.model.TaskerEvent.Audio", nVar, 3);
        o0Var.b("fileName", true);
        o0Var.b("isOldVersion", true);
        o0Var.b("channelIndex", true);
        descriptor = o0Var;
    }

    @Override // mc.a
    public final void a(rc.s sVar, Object obj) {
        p pVar = (p) obj;
        i9.l.e(pVar, "value");
        int i7 = pVar.f1632d;
        boolean z10 = pVar.f1631c;
        String str = pVar.f1630b;
        nc.e eVar = descriptor;
        rc.s sVarA = sVar.a(eVar);
        o oVar = p.Companion;
        if (sVarA.u(eVar) || !i9.l.a(str, "")) {
            sVarA.s(eVar, 0, str);
        }
        if (sVarA.u(eVar) || z10) {
            sVarA.c(eVar, 1, z10);
        }
        if (sVarA.u(eVar) || i7 != 1) {
            sVarA.m(2, i7, eVar);
        }
        sVarA.t(eVar);
    }

    @Override // pc.w
    public final mc.a[] b() {
        return new mc.a[]{pc.x0.f10518a, pc.f.f10442a, pc.c0.f10429a};
    }

    @Override // mc.a
    public final Object c(oc.b bVar) {
        nc.e eVar = descriptor;
        oc.a aVarM = bVar.m(eVar);
        String strS = null;
        boolean z10 = true;
        int i7 = 0;
        boolean zQ = false;
        int iU = 0;
        while (z10) {
            int iW = aVarM.w(eVar);
            if (iW == -1) {
                z10 = false;
            } else if (iW == 0) {
                strS = aVarM.s(eVar, 0);
                i7 |= 1;
            } else if (iW == 1) {
                zQ = aVarM.q(eVar, 1);
                i7 |= 2;
            } else {
                if (iW != 2) {
                    throw new mc.f(iW);
                }
                iU = aVarM.u(eVar, 2);
                i7 |= 4;
            }
        }
        aVarM.p(eVar);
        return new p(i7, strS, zQ, iU);
    }

    @Override // mc.a
    public final nc.e d() {
        return descriptor;
    }
}
