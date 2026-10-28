package jb;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wa.b f7012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f7013b;

    public f(wa.b bVar, d dVar) {
        i9.l.e(bVar, "classId");
        this.f7012a = bVar;
        this.f7013b = dVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return i9.l.a(this.f7012a, ((f) obj).f7012a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7012a.hashCode();
    }
}
