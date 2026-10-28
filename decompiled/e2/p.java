package e2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class p extends c0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f4241c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f4242d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f4243e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f4244f;

    public p(float f10, float f11, float f12, float f13) {
        super(1);
        this.f4241c = f10;
        this.f4242d = f11;
        this.f4243e = f12;
        this.f4244f = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return Float.compare(this.f4241c, pVar.f4241c) == 0 && Float.compare(this.f4242d, pVar.f4242d) == 0 && Float.compare(this.f4243e, pVar.f4243e) == 0 && Float.compare(this.f4244f, pVar.f4244f) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f4244f) + ob.a.j(this.f4243e, ob.a.j(this.f4242d, Float.floatToIntBits(this.f4241c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("QuadTo(x1=");
        sb2.append(this.f4241c);
        sb2.append(", y1=");
        sb2.append(this.f4242d);
        sb2.append(", x2=");
        sb2.append(this.f4243e);
        sb2.append(", y2=");
        return ob.a.r(sb2, this.f4244f, ')');
    }
}
