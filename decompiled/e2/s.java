package e2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class s extends c0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f4251c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f4252d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f4253e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f4254f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f4255g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f4256h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f4257i;

    public s(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14) {
        super(3);
        this.f4251c = f10;
        this.f4252d = f11;
        this.f4253e = f12;
        this.f4254f = z10;
        this.f4255g = z11;
        this.f4256h = f13;
        this.f4257i = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Float.compare(this.f4251c, sVar.f4251c) == 0 && Float.compare(this.f4252d, sVar.f4252d) == 0 && Float.compare(this.f4253e, sVar.f4253e) == 0 && this.f4254f == sVar.f4254f && this.f4255g == sVar.f4255g && Float.compare(this.f4256h, sVar.f4256h) == 0 && Float.compare(this.f4257i, sVar.f4257i) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f4257i) + ob.a.j(this.f4256h, (((ob.a.j(this.f4253e, ob.a.j(this.f4252d, Float.floatToIntBits(this.f4251c) * 31, 31), 31) + (this.f4254f ? 1231 : 1237)) * 31) + (this.f4255g ? 1231 : 1237)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeArcTo(horizontalEllipseRadius=");
        sb2.append(this.f4251c);
        sb2.append(", verticalEllipseRadius=");
        sb2.append(this.f4252d);
        sb2.append(", theta=");
        sb2.append(this.f4253e);
        sb2.append(", isMoreThanHalf=");
        sb2.append(this.f4254f);
        sb2.append(", isPositiveArc=");
        sb2.append(this.f4255g);
        sb2.append(", arcStartDx=");
        sb2.append(this.f4256h);
        sb2.append(", arcStartDy=");
        return ob.a.r(sb2, this.f4257i, ')');
    }
}
