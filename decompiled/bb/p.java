package bb;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class p extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nb.w f1690a;

    public p(nb.w wVar) {
        this.f1690a = wVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && i9.l.a(this.f1690a, ((p) obj).f1690a);
    }

    public final int hashCode() {
        return this.f1690a.hashCode();
    }

    public final String toString() {
        return "LocalClass(type=" + this.f1690a + ')';
    }
}
