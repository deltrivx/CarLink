package n3;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class p implements o3.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f8752a;

    public p(float f10) {
        this.f8752a = f10;
    }

    @Override // o3.a
    public final float a(float f10) {
        return f10 / this.f8752a;
    }

    @Override // o3.a
    public final float b(float f10) {
        return f10 * this.f8752a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && Float.compare(this.f8752a, ((p) obj).f8752a) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f8752a);
    }

    public final String toString() {
        return ob.a.r(new StringBuilder("LinearFontScaleConverter(fontScale="), this.f8752a, ')');
    }
}
