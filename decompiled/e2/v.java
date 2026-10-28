package e2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class v extends c0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f4265c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f4266d;

    public v(float f10, float f11) {
        super(3);
        this.f4265c = f10;
        this.f4266d = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return Float.compare(this.f4265c, vVar.f4265c) == 0 && Float.compare(this.f4266d, vVar.f4266d) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f4266d) + (Float.floatToIntBits(this.f4265c) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeLineTo(dx=");
        sb2.append(this.f4265c);
        sb2.append(", dy=");
        return ob.a.r(sb2, this.f4266d, ')');
    }
}
