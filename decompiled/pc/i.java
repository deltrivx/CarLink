package pc;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class i implements mc.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f10456a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final s0 f10457b = new s0("kotlin.Byte", nc.c.f9070d);

    @Override // mc.a
    public final void a(rc.s sVar, Object obj) {
        sVar.d(((Number) obj).byteValue());
    }

    @Override // mc.a
    public final Object c(oc.b bVar) {
        return Byte.valueOf(bVar.x());
    }

    @Override // mc.a
    public final nc.e d() {
        return f10457b;
    }
}
