package rc;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class n extends a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final qc.d f12333f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f12334g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f12335h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(qc.b bVar, qc.d dVar) {
        super(bVar, null);
        i9.l.e(bVar, "json");
        this.f12333f = dVar;
        this.f12334g = dVar.f11036a.size();
        this.f12335h = -1;
    }

    @Override // rc.a
    public final qc.j B(String str) {
        i9.l.e(str, "tag");
        return (qc.j) this.f12333f.f11036a.get(Integer.parseInt(str));
    }

    @Override // rc.a
    public final String O(nc.e eVar, int i7) {
        i9.l.e(eVar, "descriptor");
        return String.valueOf(i7);
    }

    @Override // rc.a
    public final qc.j Q() {
        return this.f12333f;
    }

    @Override // oc.a
    public final int w(nc.e eVar) {
        i9.l.e(eVar, "descriptor");
        int i7 = this.f12335h;
        if (i7 >= this.f12334g - 1) {
            return -1;
        }
        int i10 = i7 + 1;
        this.f12335h = i10;
        return i10;
    }
}
