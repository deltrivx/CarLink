package e2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class x extends c0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f4269c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f4270d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f4271e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f4272f;

    public x(float f10, float f11, float f12, float f13) {
        super(1);
        this.f4269c = f10;
        this.f4270d = f11;
        this.f4271e = f12;
        this.f4272f = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return Float.compare(this.f4269c, xVar.f4269c) == 0 && Float.compare(this.f4270d, xVar.f4270d) == 0 && Float.compare(this.f4271e, xVar.f4271e) == 0 && Float.compare(this.f4272f, xVar.f4272f) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f4272f) + ob.a.j(this.f4271e, ob.a.j(this.f4270d, Float.floatToIntBits(this.f4269c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeQuadTo(dx1=");
        sb2.append(this.f4269c);
        sb2.append(", dy1=");
        sb2.append(this.f4270d);
        sb2.append(", dx2=");
        sb2.append(this.f4271e);
        sb2.append(", dy2=");
        return ob.a.r(sb2, this.f4272f, ')');
    }
}
