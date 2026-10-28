package e2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class r extends c0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f4249c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f4250d;

    public r(float f10, float f11) {
        super(1);
        this.f4249c = f10;
        this.f4250d = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return Float.compare(this.f4249c, rVar.f4249c) == 0 && Float.compare(this.f4250d, rVar.f4250d) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f4250d) + (Float.floatToIntBits(this.f4249c) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ReflectiveQuadTo(x=");
        sb2.append(this.f4249c);
        sb2.append(", y=");
        return ob.a.r(sb2, this.f4250d, ')');
    }
}
