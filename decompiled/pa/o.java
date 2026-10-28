package pa;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class o implements lb.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ca.c f10352a;

    public o(ca.c cVar, lb.i iVar) {
        this.f10352a = cVar;
    }

    @Override // lb.j
    public final String E() {
        return a2.f.I(new StringBuilder("Class '"), da.d.a(this.f10352a.f2576a).a().f14240a.f14243a, '\'');
    }

    public final String toString() {
        return o.class.getSimpleName() + ": " + this.f10352a;
    }
}
