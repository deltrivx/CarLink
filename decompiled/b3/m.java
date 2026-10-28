package b3;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class m extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p0 f1390b;

    public m(String str, p0 p0Var) {
        this.f1389a = str;
        this.f1390b = p0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return i9.l.a(this.f1389a, mVar.f1389a) && i9.l.a(this.f1390b, mVar.f1390b);
    }

    public final int hashCode() {
        int iHashCode = this.f1389a.hashCode() * 31;
        p0 p0Var = this.f1390b;
        return (iHashCode + (p0Var != null ? p0Var.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return a2.f.I(new StringBuilder("LinkAnnotation.Url(url="), this.f1389a, ')');
    }
}
