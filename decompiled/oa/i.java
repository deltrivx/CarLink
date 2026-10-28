package oa;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f9595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f9596b;

    public i(h hVar) {
        this.f9595a = hVar;
        this.f9596b = false;
    }

    public i(h hVar, boolean z10) {
        this.f9595a = hVar;
        this.f9596b = z10;
    }

    public static i a(i iVar, h hVar, boolean z10, int i7) {
        if ((i7 & 1) != 0) {
            hVar = iVar.f9595a;
        }
        if ((i7 & 2) != 0) {
            z10 = iVar.f9596b;
        }
        iVar.getClass();
        i9.l.e(hVar, "qualifier");
        return new i(hVar, z10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f9595a == iVar.f9595a && this.f9596b == iVar.f9596b;
    }

    public final int hashCode() {
        return (this.f9595a.hashCode() * 31) + (this.f9596b ? 1231 : 1237);
    }

    public final String toString() {
        return "NullabilityQualifierWithMigrationStatus(qualifier=" + this.f9595a + ", isForWarningOnly=" + this.f9596b + ')';
    }
}
