package v;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e0 implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13354a;

    public e0(int i7) {
        this.f13354a = i7;
    }

    @Override // v.j
    public final x0 d(w0 w0Var) {
        return new tb.p(this.f13354a);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof e0) && ((e0) obj).f13354a == this.f13354a;
    }

    public final int hashCode() {
        return this.f13354a;
    }
}
