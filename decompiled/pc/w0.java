package pc;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class w0 implements mc.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w0 f10515a = new w0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final s0 f10516b = new s0("kotlin.Short", nc.c.f9076j);

    @Override // mc.a
    public final void a(rc.s sVar, Object obj) {
        sVar.q(((Number) obj).shortValue());
    }

    @Override // mc.a
    public final Object c(oc.b bVar) {
        return Short.valueOf(bVar.y());
    }

    @Override // mc.a
    public final nc.e d() {
        return f10516b;
    }
}
