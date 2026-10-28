package b8;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v0 implements pc.w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v0 f1660a;
    private static final nc.e descriptor;

    static {
        v0 v0Var = new v0();
        f1660a = v0Var;
        pc.o0 o0Var = new pc.o0("com.muyetuge.carlifevehicle.feature.tasker.model.TaskerEvent.LogLine", v0Var, 3);
        o0Var.b("lineText", true);
        o0Var.b("keywords", true);
        o0Var.b("ignoreCase", true);
        descriptor = o0Var;
    }

    @Override // mc.a
    public final void a(rc.s sVar, Object obj) {
        x0 x0Var = (x0) obj;
        i9.l.e(x0Var, "value");
        boolean z10 = x0Var.f1668d;
        String str = x0Var.f1667c;
        String str2 = x0Var.f1666b;
        nc.e eVar = descriptor;
        rc.s sVarA = sVar.a(eVar);
        w0 w0Var = x0.Companion;
        if (sVarA.u(eVar) || !i9.l.a(str2, "")) {
            sVarA.s(eVar, 0, str2);
        }
        if (sVarA.u(eVar) || !i9.l.a(str, "")) {
            sVarA.s(eVar, 1, str);
        }
        if (sVarA.u(eVar) || !z10) {
            sVarA.c(eVar, 2, z10);
        }
        sVarA.t(eVar);
    }

    @Override // pc.w
    public final mc.a[] b() {
        pc.x0 x0Var = pc.x0.f10518a;
        return new mc.a[]{x0Var, x0Var, pc.f.f10442a};
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
                strS = aVarM.s(eVar, 0);
                i7 |= 1;
            } else if (iW == 1) {
                strS2 = aVarM.s(eVar, 1);
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
        return new x0(strS, i7, strS2, zQ);
    }

    @Override // mc.a
    public final nc.e d() {
        return descriptor;
    }
}
