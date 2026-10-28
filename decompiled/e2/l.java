package e2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class l extends c0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f4217c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f4218d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f4219e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f4220f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f4221g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f4222h;

    public l(float f10, float f11, float f12, float f13, float f14, float f15) {
        super(2);
        this.f4217c = f10;
        this.f4218d = f11;
        this.f4219e = f12;
        this.f4220f = f13;
        this.f4221g = f14;
        this.f4222h = f15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return Float.compare(this.f4217c, lVar.f4217c) == 0 && Float.compare(this.f4218d, lVar.f4218d) == 0 && Float.compare(this.f4219e, lVar.f4219e) == 0 && Float.compare(this.f4220f, lVar.f4220f) == 0 && Float.compare(this.f4221g, lVar.f4221g) == 0 && Float.compare(this.f4222h, lVar.f4222h) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f4222h) + ob.a.j(this.f4221g, ob.a.j(this.f4220f, ob.a.j(this.f4219e, ob.a.j(this.f4218d, Float.floatToIntBits(this.f4217c) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CurveTo(x1=");
        sb2.append(this.f4217c);
        sb2.append(", y1=");
        sb2.append(this.f4218d);
        sb2.append(", x2=");
        sb2.append(this.f4219e);
        sb2.append(", y2=");
        sb2.append(this.f4220f);
        sb2.append(", x3=");
        sb2.append(this.f4221g);
        sb2.append(", y3=");
        return ob.a.r(sb2, this.f4222h, ')');
    }
}
