package pc;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class i0 implements mc.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i0 f10458a = new i0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final s0 f10459b = new s0("kotlin.Long", nc.c.f9075i);

    @Override // mc.a
    public final void a(rc.s sVar, Object obj) {
        sVar.n(((Number) obj).longValue());
    }

    @Override // mc.a
    public final Object c(oc.b bVar) {
        return Long.valueOf(bVar.n());
    }

    @Override // mc.a
    public final nc.e d() {
        return f10459b;
    }
}
