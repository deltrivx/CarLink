package e2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class t extends c0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f4258c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f4259d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f4260e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f4261f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f4262g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f4263h;

    public t(float f10, float f11, float f12, float f13, float f14, float f15) {
        super(2);
        this.f4258c = f10;
        this.f4259d = f11;
        this.f4260e = f12;
        this.f4261f = f13;
        this.f4262g = f14;
        this.f4263h = f15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return Float.compare(this.f4258c, tVar.f4258c) == 0 && Float.compare(this.f4259d, tVar.f4259d) == 0 && Float.compare(this.f4260e, tVar.f4260e) == 0 && Float.compare(this.f4261f, tVar.f4261f) == 0 && Float.compare(this.f4262g, tVar.f4262g) == 0 && Float.compare(this.f4263h, tVar.f4263h) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f4263h) + ob.a.j(this.f4262g, ob.a.j(this.f4261f, ob.a.j(this.f4260e, ob.a.j(this.f4259d, Float.floatToIntBits(this.f4258c) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeCurveTo(dx1=");
        sb2.append(this.f4258c);
        sb2.append(", dy1=");
        sb2.append(this.f4259d);
        sb2.append(", dx2=");
        sb2.append(this.f4260e);
        sb2.append(", dy2=");
        sb2.append(this.f4261f);
        sb2.append(", dx3=");
        sb2.append(this.f4262g);
        sb2.append(", dy3=");
        return ob.a.r(sb2, this.f4263h, ')');
    }
}
