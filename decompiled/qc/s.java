package qc;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class s implements mc.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f11050a = new s();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final nc.f f11051b;

    static {
        nc.e[] eVarArr = new nc.e[0];
        if (zb.j.B0("kotlinx.serialization.json.JsonNull")) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        nc.i iVar = nc.i.f9090c;
        nc.h hVar = nc.h.f9089c;
        if (hVar.equals(iVar)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        nc.a aVar = new nc.a("kotlinx.serialization.json.JsonNull");
        f11051b = new nc.f("kotlinx.serialization.json.JsonNull", hVar, aVar.f9063c.size(), u8.l.L0(eVarArr), aVar);
    }

    @Override // mc.a
    public final void a(rc.s sVar, Object obj) {
        i9.l.e((r) obj, "value");
        n3.u.h(sVar);
        sVar.f12358a.g("null");
    }

    @Override // mc.a
    public final Object c(oc.b bVar) {
        n3.u.k(bVar);
        if (bVar.o()) {
            throw new rc.h("Expected 'null' literal");
        }
        return r.INSTANCE;
    }

    @Override // mc.a
    public final nc.e d() {
        return f11051b;
    }
}
