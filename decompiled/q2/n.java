package q2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f10752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f10753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f10754c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f10755d;

    public n(float f10, float f11, float f12, float f13) {
        this.f10752a = f10;
        this.f10753b = f11;
        this.f10754c = f12;
        this.f10755d = f13;
        if (f10 < 0.0f) {
            n2.a.a("Left must be non-negative");
        }
        if (f11 < 0.0f) {
            n2.a.a("Top must be non-negative");
        }
        if (f12 < 0.0f) {
            n2.a.a("Right must be non-negative");
        }
        if (f13 >= 0.0f) {
            return;
        }
        n2.a.a("Bottom must be non-negative");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return n3.f.a(this.f10752a, nVar.f10752a) && n3.f.a(this.f10753b, nVar.f10753b) && n3.f.a(this.f10754c, nVar.f10754c) && n3.f.a(this.f10755d, nVar.f10755d);
    }

    public final int hashCode() {
        return ((Float.floatToIntBits(this.f10755d) + ob.a.j(this.f10754c, ob.a.j(this.f10753b, Float.floatToIntBits(this.f10752a) * 31, 31), 31)) * 31) + 1231;
    }

    public final String toString() {
        return "DpTouchBoundsExpansion(start=" + ((Object) n3.f.b(this.f10752a)) + ", top=" + ((Object) n3.f.b(this.f10753b)) + ", end=" + ((Object) n3.f.b(this.f10754c)) + ", bottom=" + ((Object) n3.f.b(this.f10755d)) + ", isLayoutDirectionAware=true)";
    }
}
