package fc;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f5524a;

    public c(d dVar) {
        this.f5524a = dVar;
    }

    @Override // fc.d
    public final Object l(e eVar, y8.c cVar) {
        i9.x xVar = new i9.x();
        xVar.f6688a = gc.c.f6217b;
        Object objL = this.f5524a.l(new b0.f(this, xVar, eVar), cVar);
        return objL == z8.a.f15774a ? objL : t8.z.f12851a;
    }
}
