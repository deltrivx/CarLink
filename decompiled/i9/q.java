package i9;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class q implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f6682a;

    public q(Class cls) {
        l.e(cls, "jClass");
        this.f6682a = cls;
    }

    @Override // i9.e
    public final Class a() {
        return this.f6682a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q) {
            return l.a(this.f6682a, ((q) obj).f6682a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6682a.hashCode();
    }

    public final String toString() {
        return this.f6682a + " (Kotlin reflection is not available)";
    }
}
