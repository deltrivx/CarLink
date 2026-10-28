package y1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends h0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x1.d f14882e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h f14883f;

    public d0(x1.d dVar) {
        h hVarA;
        this.f14882e = dVar;
        if (n4.h.P(dVar)) {
            hVarA = null;
        } else {
            hVarA = j.a();
            ob.a.i(hVarA, dVar);
        }
        this.f14883f = hVarA;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d0) {
            return i9.l.a(this.f14882e, ((d0) obj).f14882e);
        }
        return false;
    }

    public final int hashCode() {
        return this.f14882e.hashCode();
    }

    @Override // y1.h0
    public final x1.c o() {
        x1.d dVar = this.f14882e;
        return new x1.c(dVar.f14527a, dVar.f14528b, dVar.f14529c, dVar.f14530d);
    }
}
