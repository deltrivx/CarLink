package x9;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class u extends s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wa.e f14741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qb.e f14742b;

    public u(wa.e eVar, qb.e eVar2) {
        i9.l.e(eVar2, "underlyingType");
        this.f14741a = eVar;
        this.f14742b = eVar2;
    }

    @Override // x9.s0
    public final boolean a(wa.e eVar) {
        return this.f14741a.equals(eVar);
    }

    public final String toString() {
        return "InlineClassRepresentation(underlyingPropertyName=" + this.f14741a + ", underlyingType=" + this.f14742b + ')';
    }
}
