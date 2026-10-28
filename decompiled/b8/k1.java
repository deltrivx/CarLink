package b8;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k1 implements pc.w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k1 f1605a;
    private static final nc.e descriptor;

    static {
        k1 k1Var = new k1();
        f1605a = k1Var;
        pc.o0 o0Var = new pc.o0("com.muyetuge.carlifevehicle.feature.tasker.model.TaskerEvent.SunCycle", k1Var, 3);
        o0Var.b("isDayTime", true);
        o0Var.b("latitude", true);
        o0Var.b("longitude", true);
        descriptor = o0Var;
    }

    @Override // mc.a
    public final void a(rc.s sVar, Object obj) {
        m1 m1Var = (m1) obj;
        i9.l.e(m1Var, "value");
        double d10 = m1Var.f1612d;
        double d11 = m1Var.f1611c;
        boolean z10 = m1Var.f1610b;
        nc.e eVar = descriptor;
        rc.s sVarA = sVar.a(eVar);
        l1 l1Var = m1.Companion;
        if (sVarA.u(eVar) || !z10) {
            sVarA.c(eVar, 0, z10);
        }
        if (sVarA.u(eVar) || Double.compare(d11, 0.0d) != 0) {
            sVarA.g(eVar, 1, d11);
        }
        if (sVarA.u(eVar) || Double.compare(d10, 0.0d) != 0) {
            sVarA.g(eVar, 2, d10);
        }
        sVarA.t(eVar);
    }

    @Override // pc.w
    public final mc.a[] b() {
        pc.q qVar = pc.q.f10493a;
        return new mc.a[]{pc.f.f10442a, qVar, qVar};
    }

    @Override // mc.a
    public final Object c(oc.b bVar) {
        nc.e eVar = descriptor;
        oc.a aVarM = bVar.m(eVar);
        double d10 = 0.0d;
        double d11 = 0.0d;
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
                d10 = aVarM.d(eVar, 1);
                i7 |= 2;
            } else {
                if (iW != 2) {
                    throw new mc.f(iW);
                }
                d11 = aVarM.d(eVar, 2);
                i7 |= 4;
            }
        }
        aVarM.p(eVar);
        return new m1(i7, zQ, d10, d11);
    }

    @Override // mc.a
    public final nc.e d() {
        return descriptor;
    }
}
