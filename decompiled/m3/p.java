package m3;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p f8426c = new p(1.0f, 0.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f8427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f8428b;

    public p(float f10, float f11) {
        this.f8427a = f10;
        this.f8428b = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f8427a == pVar.f8427a && this.f8428b == pVar.f8428b;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f8428b) + (Float.floatToIntBits(this.f8427a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TextGeometricTransform(scaleX=");
        sb2.append(this.f8427a);
        sb2.append(", skewX=");
        return ob.a.r(sb2, this.f8428b, ')');
    }
}
