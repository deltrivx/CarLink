package c1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f1989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f1990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f1991c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f1992d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f1993e;

    public m(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f1989a = f10;
        this.f1990b = f11;
        this.f1991c = f12;
        this.f1992d = f13;
        this.f1993e = f15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return n3.f.a(this.f1989a, mVar.f1989a) && n3.f.a(this.f1990b, mVar.f1990b) && n3.f.a(this.f1991c, mVar.f1991c) && n3.f.a(this.f1992d, mVar.f1992d) && n3.f.a(this.f1993e, mVar.f1993e);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f1993e) + ob.a.j(this.f1992d, ob.a.j(this.f1991c, ob.a.j(this.f1990b, Float.floatToIntBits(this.f1989a) * 31, 31), 31), 31);
    }
}
