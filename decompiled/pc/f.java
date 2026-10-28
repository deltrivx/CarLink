package pc;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class f implements mc.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f10442a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final s0 f10443b = new s0("kotlin.Boolean", nc.c.f9069c);

    @Override // mc.a
    public final void a(rc.s sVar, Object obj) {
        sVar.b(((Boolean) obj).booleanValue());
    }

    @Override // mc.a
    public final Object c(oc.b bVar) {
        return Boolean.valueOf(bVar.b());
    }

    @Override // mc.a
    public final nc.e d() {
        return f10443b;
    }
}
