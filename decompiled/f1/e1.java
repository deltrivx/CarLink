package f1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4943a;

    public e1(String str) {
        this.f4943a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e1) && i9.l.a(this.f4943a, ((e1) obj).f4943a);
    }

    public final int hashCode() {
        return this.f4943a.hashCode();
    }

    public final String toString() {
        return a2.f.I(new StringBuilder("OpaqueKey(key="), this.f4943a, ')');
    }
}
