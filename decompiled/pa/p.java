package pa;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10353a;

    public p(String str) {
        this.f10353a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && i9.l.a(this.f10353a, ((p) obj).f10353a);
    }

    public final int hashCode() {
        return this.f10353a.hashCode();
    }

    public final String toString() {
        return a2.f.I(new StringBuilder("MemberSignature(signature="), this.f10353a, ')');
    }
}
