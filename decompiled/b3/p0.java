package b3;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f1422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0 f1423b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h0 f1424c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h0 f1425d;

    public p0(h0 h0Var, h0 h0Var2, h0 h0Var3, h0 h0Var4) {
        this.f1422a = h0Var;
        this.f1423b = h0Var2;
        this.f1424c = h0Var3;
        this.f1425d = h0Var4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return i9.l.a(this.f1422a, p0Var.f1422a) && i9.l.a(this.f1423b, p0Var.f1423b) && i9.l.a(this.f1424c, p0Var.f1424c) && i9.l.a(this.f1425d, p0Var.f1425d);
    }

    public final int hashCode() {
        h0 h0Var = this.f1422a;
        int iHashCode = (h0Var != null ? h0Var.hashCode() : 0) * 31;
        h0 h0Var2 = this.f1423b;
        int iHashCode2 = (iHashCode + (h0Var2 != null ? h0Var2.hashCode() : 0)) * 31;
        h0 h0Var3 = this.f1424c;
        int iHashCode3 = (iHashCode2 + (h0Var3 != null ? h0Var3.hashCode() : 0)) * 31;
        h0 h0Var4 = this.f1425d;
        return iHashCode3 + (h0Var4 != null ? h0Var4.hashCode() : 0);
    }
}
