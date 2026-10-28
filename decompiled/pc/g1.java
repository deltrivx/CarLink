package pc;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class g1 implements mc.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g1 f10450a = new g1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final x f10451b = m0.a("kotlin.ULong", i0.f10458a);

    @Override // mc.a
    public final void a(rc.s sVar, Object obj) {
        sVar.j(f10451b).n(((t8.u) obj).f12846a);
    }

    @Override // mc.a
    public final Object c(oc.b bVar) {
        return new t8.u(bVar.r(f10451b).n());
    }

    @Override // mc.a
    public final nc.e d() {
        return f10451b;
    }
}
