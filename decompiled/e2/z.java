package e2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class z extends c0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f4277c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f4278d;

    public z(float f10, float f11) {
        super(1);
        this.f4277c = f10;
        this.f4278d = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return Float.compare(this.f4277c, zVar.f4277c) == 0 && Float.compare(this.f4278d, zVar.f4278d) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f4278d) + (Float.floatToIntBits(this.f4277c) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeReflectiveQuadTo(dx=");
        sb2.append(this.f4277c);
        sb2.append(", dy=");
        return ob.a.r(sb2, this.f4278d, ')');
    }
}
