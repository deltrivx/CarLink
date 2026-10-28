package b3;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class k0 implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1385a;

    public final boolean equals(Object obj) {
        if (obj instanceof k0) {
            return i9.l.a(this.f1385a, ((k0) obj).f1385a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1385a.hashCode();
    }

    public final String toString() {
        return "StringAnnotation(value=" + this.f1385a + ')';
    }
}
