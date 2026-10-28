package k0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f7138a;

    public c(float f10) {
        this.f7138a = f10;
        if (f10 < 0.0f || f10 > 100.0f) {
            c0.b.a("The percent should be in the range of [0, 100]");
        }
    }

    @Override // k0.a
    public final float a(long j5, n3.c cVar) {
        return (this.f7138a / 100.0f) * x1.e.c(j5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Float.compare(this.f7138a, ((c) obj).f7138a) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f7138a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.f7138a + "%)";
    }
}
