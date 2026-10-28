package b8;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t implements pc.w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t f1654a;
    private static final nc.e descriptor;

    static {
        t tVar = new t();
        f1654a = tVar;
        pc.o0 o0Var = new pc.o0("com.muyetuge.carlifevehicle.feature.tasker.model.TaskerEvent.BluetoothSwitch", tVar, 1);
        o0Var.b("enabled", true);
        descriptor = o0Var;
    }

    @Override // mc.a
    public final void a(rc.s sVar, Object obj) {
        v vVar = (v) obj;
        i9.l.e(vVar, "value");
        boolean z10 = vVar.f1659b;
        nc.e eVar = descriptor;
        rc.s sVarA = sVar.a(eVar);
        u uVar = v.Companion;
        if (sVarA.u(eVar) || !z10) {
            sVarA.c(eVar, 0, z10);
        }
        sVarA.t(eVar);
    }

    @Override // pc.w
    public final mc.a[] b() {
        return new mc.a[]{pc.f.f10442a};
    }

    @Override // mc.a
    public final Object c(oc.b bVar) {
        nc.e eVar = descriptor;
        oc.a aVarM = bVar.m(eVar);
        boolean z10 = true;
        int i7 = 0;
        boolean zQ = false;
        while (z10) {
            int iW = aVarM.w(eVar);
            if (iW == -1) {
                z10 = false;
            } else {
                if (iW != 0) {
                    throw new mc.f(iW);
                }
                zQ = aVarM.q(eVar, 0);
                i7 = 1;
            }
        }
        aVarM.p(eVar);
        return new v(i7, zQ);
    }

    @Override // mc.a
    public final nc.e d() {
        return descriptor;
    }
}
