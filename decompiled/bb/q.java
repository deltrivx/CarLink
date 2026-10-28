package bb;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class q extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f1691a;

    public q(f fVar) {
        this.f1691a = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && i9.l.a(this.f1691a, ((q) obj).f1691a);
    }

    public final int hashCode() {
        return this.f1691a.hashCode();
    }

    public final String toString() {
        return "NormalClass(value=" + this.f1691a + ')';
    }
}
