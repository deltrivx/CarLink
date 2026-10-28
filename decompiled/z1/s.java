package z1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f15692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f15693b;

    public s(float f10, float f11) {
        this.f15692a = f10;
        this.f15693b = f11;
    }

    public final float[] a() {
        float f10 = this.f15692a;
        float f11 = this.f15693b;
        return new float[]{f10 / f11, 1.0f, ((1.0f - f10) - f11) / f11};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Float.compare(this.f15692a, sVar.f15692a) == 0 && Float.compare(this.f15693b, sVar.f15693b) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f15693b) + (Float.floatToIntBits(this.f15692a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WhitePoint(x=");
        sb2.append(this.f15692a);
        sb2.append(", y=");
        return ob.a.r(sb2, this.f15693b, ')');
    }
}
