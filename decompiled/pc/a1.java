package pc;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a1 implements mc.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a1 f10423a = new a1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final x f10424b = m0.a("kotlin.UByte", i.f10456a);

    @Override // mc.a
    public final void a(rc.s sVar, Object obj) {
        sVar.j(f10424b).d(((t8.q) obj).f12842a);
    }

    @Override // mc.a
    public final Object c(oc.b bVar) {
        return new t8.q(bVar.r(f10424b).x());
    }

    @Override // mc.a
    public final nc.e d() {
        return f10424b;
    }
}
