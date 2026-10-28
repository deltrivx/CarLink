package mb;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f8617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h9.a f8618b;

    public g(Object obj, h9.a aVar) {
        this.f8617a = obj;
        this.f8618b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && g.class == obj.getClass() && this.f8617a.equals(((g) obj).f8617a);
    }

    public final int hashCode() {
        return this.f8617a.hashCode();
    }
}
