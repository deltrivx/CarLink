package y1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends h0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x1.c f14880e;

    public c0(x1.c cVar) {
        this.f14880e = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c0) {
            return i9.l.a(this.f14880e, ((c0) obj).f14880e);
        }
        return false;
    }

    public final int hashCode() {
        return this.f14880e.hashCode();
    }

    @Override // y1.h0
    public final x1.c o() {
        return this.f14880e;
    }
}
