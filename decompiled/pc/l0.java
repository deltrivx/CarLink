package pc;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class l0 implements mc.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f10471a = t8.a.c(t8.i.f12827a, new a5.e(20, this));

    @Override // mc.a
    public final void a(rc.s sVar, Object obj) {
        i9.l.e(obj, "value");
        sVar.a(d()).t(d());
    }

    @Override // mc.a
    public final Object c(oc.b bVar) {
        nc.e eVarD = d();
        oc.a aVarM = bVar.m(eVarD);
        int iW = aVarM.w(d());
        if (iW != -1) {
            throw new mc.e(a2.f.E(iW, "Unexpected index "));
        }
        aVarM.p(eVarD);
        return t8.z.f12851a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, t8.h] */
    @Override // mc.a
    public final nc.e d() {
        return (nc.e) this.f10471a.getValue();
    }
}
