package pc;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class m implements mc.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f10474a = new m();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final s0 f10475b = new s0("kotlin.Char", nc.c.f9071e);

    @Override // mc.a
    public final void a(rc.s sVar, Object obj) {
        sVar.e(((Character) obj).charValue());
    }

    @Override // mc.a
    public final Object c(oc.b bVar) {
        return Character.valueOf(bVar.c());
    }

    @Override // mc.a
    public final nc.e d() {
        return f10475b;
    }
}
