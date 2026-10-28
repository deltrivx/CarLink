package u;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f12955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f12956b;

    public a(float f10, float f11) {
        this.f12955a = f10;
        this.f12956b = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Float.compare(this.f12955a, aVar.f12955a) == 0 && Float.compare(this.f12956b, aVar.f12956b) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f12956b) + (Float.floatToIntBits(this.f12955a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FlingResult(distanceCoefficient=");
        sb2.append(this.f12955a);
        sb2.append(", velocityCoefficient=");
        return ob.a.r(sb2, this.f12956b, ')');
    }
}
