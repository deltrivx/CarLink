package b8;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j0 implements pc.w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j0 f1601a;
    private static final nc.e descriptor;

    static {
        j0 j0Var = new j0();
        f1601a = j0Var;
        pc.o0 o0Var = new pc.o0("com.muyetuge.carlifevehicle.feature.tasker.model.TaskerEvent.Delay", j0Var, 1);
        o0Var.b("millis", false);
        descriptor = o0Var;
    }

    @Override // mc.a
    public final void a(rc.s sVar, Object obj) {
        l0 l0Var = (l0) obj;
        i9.l.e(l0Var, "value");
        nc.e eVar = descriptor;
        rc.s sVarA = sVar.a(eVar);
        long j5 = l0Var.f1607b;
        sVarA.h(eVar, 0);
        sVarA.n(j5);
        sVarA.t(eVar);
    }

    @Override // pc.w
    public final mc.a[] b() {
        return new mc.a[]{pc.i0.f10458a};
    }

    @Override // mc.a
    public final Object c(oc.b bVar) {
        nc.e eVar = descriptor;
        oc.a aVarM = bVar.m(eVar);
        long jA = 0;
        boolean z10 = true;
        int i7 = 0;
        while (z10) {
            int iW = aVarM.w(eVar);
            if (iW == -1) {
                z10 = false;
            } else {
                if (iW != 0) {
                    throw new mc.f(iW);
                }
                jA = aVarM.a(eVar, 0);
                i7 = 1;
            }
        }
        aVarM.p(eVar);
        return new l0(i7, jA);
    }

    @Override // mc.a
    public final nc.e d() {
        return descriptor;
    }
}
