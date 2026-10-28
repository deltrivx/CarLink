package aa;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class x0 extends y0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final t8.o f447l;

    public x0(x9.b bVar, y0 y0Var, int i7, y9.h hVar, wa.e eVar, nb.w wVar, boolean z10, boolean z11, boolean z12, nb.w wVar2, x9.n0 n0Var, h9.a aVar) {
        super(bVar, y0Var, i7, hVar, eVar, wVar, z10, z11, z12, wVar2, n0Var);
        this.f447l = t8.a.d(aVar);
    }

    @Override // aa.y0
    public final y0 C0(v9.f fVar, wa.e eVar, int i7) {
        y9.h annotations = getAnnotations();
        i9.l.d(annotations, "<get-annotations>(...)");
        nb.w type = getType();
        i9.l.d(type, "getType(...)");
        return new x0(fVar, null, i7, annotations, eVar, type, D0(), this.f473h, this.f474i, this.f475j, x9.n0.f14716e0, new e(4, this));
    }
}
