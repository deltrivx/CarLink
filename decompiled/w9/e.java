package w9;

import o9.u;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e implements wb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f14190a = new e();

    public static x9.e a(x9.e eVar) {
        wa.d dVarG = za.d.g(eVar);
        String str = d.f14177a;
        wa.c cVar = (wa.c) d.k.get(dVarG);
        if (cVar != null) {
            return db.e.e(eVar).j(cVar);
        }
        throw new IllegalArgumentException("Given class " + eVar + " is not a read-only collection");
    }

    public static x9.e b(wa.c cVar, u9.i iVar) {
        i9.l.e(iVar, "builtIns");
        String str = d.f14177a;
        wa.b bVar = (wa.b) d.f14184h.get(cVar.f14240a);
        if (bVar != null) {
            return iVar.j(bVar.a());
        }
        return null;
    }

    @Override // wb.a
    public Iterable g(Object obj) {
        u[] uVarArr = l.f14213h;
        return ((x9.c) obj).a().m();
    }
}
