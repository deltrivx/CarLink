package r1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f11108a;

    public g(float f10) {
        this.f11108a = f10;
    }

    public final int a(int i7, int i10) {
        return Math.round((1 + this.f11108a) * ((i10 - i7) / 2.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && Float.compare(this.f11108a, ((g) obj).f11108a) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f11108a);
    }

    public final String toString() {
        return ob.a.r(new StringBuilder("Vertical(bias="), this.f11108a, ')');
    }
}
