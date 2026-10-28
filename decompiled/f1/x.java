package f1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f5196a;

    public x(u uVar) {
        this.f5196a = uVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof x) {
            return i9.l.a(this.f5196a, ((x) obj).f5196a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5196a.hashCode() * 31;
    }
}
