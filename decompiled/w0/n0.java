package w0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l0.h0 f13857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f13858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m0 f13859c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f13860d;

    public n0(l0.h0 h0Var, long j5, m0 m0Var, boolean z10) {
        this.f13857a = h0Var;
        this.f13858b = j5;
        this.f13859c = m0Var;
        this.f13860d = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return this.f13857a == n0Var.f13857a && x1.b.b(this.f13858b, n0Var.f13858b) && this.f13859c == n0Var.f13859c && this.f13860d == n0Var.f13860d;
    }

    public final int hashCode() {
        return ((this.f13859c.hashCode() + ((x1.b.f(this.f13858b) + (this.f13857a.hashCode() * 31)) * 31)) * 31) + (this.f13860d ? 1231 : 1237);
    }

    public final String toString() {
        return "SelectionHandleInfo(handle=" + this.f13857a + ", position=" + ((Object) x1.b.j(this.f13858b)) + ", anchor=" + this.f13859c + ", visible=" + this.f13860d + ')';
    }
}
