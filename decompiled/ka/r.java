package ka;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wa.e f7474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final da.o f7475b;

    public r(wa.e eVar, da.o oVar) {
        i9.l.e(eVar, "name");
        this.f7474a = eVar;
        this.f7475b = oVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            return i9.l.a(this.f7474a, ((r) obj).f7474a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7474a.hashCode();
    }
}
