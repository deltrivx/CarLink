package v;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class h0 implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f13366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f13367b;

    public h0(v vVar, long j5) {
        this.f13366a = vVar;
        this.f13367b = j5;
    }

    @Override // v.j
    public final x0 d(w0 w0Var) {
        return new i0(this.f13366a.d(w0Var), this.f13367b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return h0Var.f13367b == this.f13367b && i9.l.a(h0Var.f13366a, this.f13366a);
    }

    public final int hashCode() {
        int iHashCode = this.f13366a.hashCode() * 31;
        long j5 = this.f13367b;
        return iHashCode + ((int) (j5 ^ (j5 >>> 32)));
    }
}
