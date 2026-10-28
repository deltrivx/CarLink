package oa;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e f9582e = new e(null, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f9583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f9584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f9585c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f9586d;

    public e(h hVar, f fVar, boolean z10, boolean z11) {
        this.f9583a = hVar;
        this.f9584b = fVar;
        this.f9585c = z10;
        this.f9586d = z11;
    }

    public /* synthetic */ e(h hVar, boolean z10) {
        this(hVar, null, z10, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f9583a == eVar.f9583a && this.f9584b == eVar.f9584b && this.f9585c == eVar.f9585c && this.f9586d == eVar.f9586d;
    }

    public final int hashCode() {
        h hVar = this.f9583a;
        int iHashCode = (hVar == null ? 0 : hVar.hashCode()) * 31;
        f fVar = this.f9584b;
        return ((((iHashCode + (fVar != null ? fVar.hashCode() : 0)) * 31) + (this.f9585c ? 1231 : 1237)) * 31) + (this.f9586d ? 1231 : 1237);
    }

    public final String toString() {
        return "JavaTypeQualifiers(nullability=" + this.f9583a + ", mutability=" + this.f9584b + ", definitelyNotNull=" + this.f9585c + ", isNullabilityQualifierForWarning=" + this.f9586d + ')';
    }
}
