package ga;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final s f6111d = new s(c0.STRICT, 6);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f6112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t8.g f6113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c0 f6114c;

    public s(c0 c0Var, int i7) {
        this(c0Var, (i7 & 2) != 0 ? new t8.g(1, 0, 0) : null, c0Var);
    }

    public s(c0 c0Var, t8.g gVar, c0 c0Var2) {
        this.f6112a = c0Var;
        this.f6113b = gVar;
        this.f6114c = c0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f6112a == sVar.f6112a && i9.l.a(this.f6113b, sVar.f6113b) && this.f6114c == sVar.f6114c;
    }

    public final int hashCode() {
        int iHashCode = this.f6112a.hashCode() * 31;
        t8.g gVar = this.f6113b;
        return this.f6114c.hashCode() + ((iHashCode + (gVar == null ? 0 : gVar.f12826d)) * 31);
    }

    public final String toString() {
        return "JavaNullabilityAnnotationsStatus(reportLevelBefore=" + this.f6112a + ", sinceVersion=" + this.f6113b + ", reportLevelAfter=" + this.f6114c + ')';
    }
}
