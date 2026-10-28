package rc;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class l extends a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final qc.j f12328f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(qc.b bVar, qc.j jVar, String str) {
        super(bVar, str);
        i9.l.e(bVar, "json");
        i9.l.e(jVar, "value");
        this.f12328f = jVar;
        this.f12311a.add("primitive");
    }

    @Override // rc.a
    public final qc.j B(String str) {
        i9.l.e(str, "tag");
        if (str == "primitive") {
            return this.f12328f;
        }
        throw new IllegalArgumentException("This input can only handle primitives with 'primitive' tag");
    }

    @Override // rc.a
    public final qc.j Q() {
        return this.f12328f;
    }

    @Override // oc.a
    public final int w(nc.e eVar) {
        i9.l.e(eVar, "descriptor");
        return 0;
    }
}
