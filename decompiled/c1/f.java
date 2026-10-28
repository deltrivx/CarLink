package c1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f1874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f1875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f1876c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f1877d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f1878e;

    public f(float f10, float f11, float f12, float f13, float f14) {
        this.f1874a = f10;
        this.f1875b = f11;
        this.f1876c = f12;
        this.f1877d = f13;
        this.f1878e = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return n3.f.a(this.f1874a, fVar.f1874a) && n3.f.a(this.f1875b, fVar.f1875b) && n3.f.a(this.f1876c, fVar.f1876c) && n3.f.a(this.f1877d, fVar.f1877d) && n3.f.a(this.f1878e, fVar.f1878e);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f1878e) + ob.a.j(this.f1877d, ob.a.j(this.f1876c, ob.a.j(this.f1875b, Float.floatToIntBits(this.f1874a) * 31, 31), 31), 31);
    }
}
