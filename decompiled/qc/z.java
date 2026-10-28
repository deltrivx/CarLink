package qc;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class z implements mc.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z f11058a = new z();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final nc.f f11059b;

    static {
        nc.c cVar = nc.c.k;
        nc.e[] eVarArr = new nc.e[0];
        if (zb.j.B0("kotlinx.serialization.json.JsonPrimitive")) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (cVar.equals(nc.i.f9090c)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        nc.a aVar = new nc.a("kotlinx.serialization.json.JsonPrimitive");
        f11059b = new nc.f("kotlinx.serialization.json.JsonPrimitive", cVar, aVar.f9063c.size(), u8.l.L0(eVarArr), aVar);
    }

    @Override // mc.a
    public final void a(rc.s sVar, Object obj) {
        y yVar = (y) obj;
        i9.l.e(yVar, "value");
        n3.u.h(sVar);
        if (yVar instanceof r) {
            sVar.p(s.f11050a, r.INSTANCE);
        } else {
            sVar.p(p.f11048a, (o) yVar);
        }
    }

    @Override // mc.a
    public final Object c(oc.b bVar) {
        j jVarG = n3.u.k(bVar).g();
        if (jVarG instanceof y) {
            return (y) jVarG;
        }
        StringBuilder sb2 = new StringBuilder("Unexpected JSON element, expected JsonPrimitive, had ");
        throw rc.j.e(ob.a.p(i9.y.f6689a, jVarG.getClass(), sb2), jVarG.toString(), -1);
    }

    @Override // mc.a
    public final nc.e d() {
        return f11059b;
    }
}
