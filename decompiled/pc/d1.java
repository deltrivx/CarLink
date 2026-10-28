package pc;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d1 implements mc.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d1 f10436a = new d1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final x f10437b = m0.a("kotlin.UInt", c0.f10429a);

    @Override // mc.a
    public final void a(rc.s sVar, Object obj) {
        sVar.j(f10437b).l(((t8.s) obj).f12844a);
    }

    @Override // mc.a
    public final Object c(oc.b bVar) {
        return new t8.s(bVar.r(f10437b).h());
    }

    @Override // mc.a
    public final nc.e d() {
        return f10437b;
    }
}
