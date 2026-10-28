package e2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class j extends c0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f4203c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f4204d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f4205e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f4206f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f4207g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f4208h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f4209i;

    public j(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14) {
        super(3);
        this.f4203c = f10;
        this.f4204d = f11;
        this.f4205e = f12;
        this.f4206f = z10;
        this.f4207g = z11;
        this.f4208h = f13;
        this.f4209i = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Float.compare(this.f4203c, jVar.f4203c) == 0 && Float.compare(this.f4204d, jVar.f4204d) == 0 && Float.compare(this.f4205e, jVar.f4205e) == 0 && this.f4206f == jVar.f4206f && this.f4207g == jVar.f4207g && Float.compare(this.f4208h, jVar.f4208h) == 0 && Float.compare(this.f4209i, jVar.f4209i) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f4209i) + ob.a.j(this.f4208h, (((ob.a.j(this.f4205e, ob.a.j(this.f4204d, Float.floatToIntBits(this.f4203c) * 31, 31), 31) + (this.f4206f ? 1231 : 1237)) * 31) + (this.f4207g ? 1231 : 1237)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ArcTo(horizontalEllipseRadius=");
        sb2.append(this.f4203c);
        sb2.append(", verticalEllipseRadius=");
        sb2.append(this.f4204d);
        sb2.append(", theta=");
        sb2.append(this.f4205e);
        sb2.append(", isMoreThanHalf=");
        sb2.append(this.f4206f);
        sb2.append(", isPositiveArc=");
        sb2.append(this.f4207g);
        sb2.append(", arcStartX=");
        sb2.append(this.f4208h);
        sb2.append(", arcStartY=");
        return ob.a.r(sb2, this.f4209i, ')');
    }
}
