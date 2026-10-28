package b3;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class s0 implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1448a;

    public s0(String str) {
        this.f1448a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s0) {
            return i9.l.a(this.f1448a, ((s0) obj).f1448a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1448a.hashCode();
    }

    public final String toString() {
        return a2.f.I(new StringBuilder("UrlAnnotation(url="), this.f1448a, ')');
    }
}
