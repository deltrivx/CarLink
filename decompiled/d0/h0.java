package d0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f3571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f3572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f3573c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f3574d;

    public h0(float f10, float f11, float f12, float f13) {
        this.f3571a = f10;
        this.f3572b = f11;
        this.f3573c = f12;
        this.f3574d = f13;
        if (!((f10 >= 0.0f) & (f11 >= 0.0f) & (f12 >= 0.0f)) || !(f13 >= 0.0f)) {
            e0.a.a("Padding must be non-negative");
        }
    }

    public final float a(n3.o oVar) {
        return oVar == n3.o.f8749a ? this.f3571a : this.f3573c;
    }

    public final float b(n3.o oVar) {
        return oVar == n3.o.f8749a ? this.f3573c : this.f3571a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return n3.f.a(this.f3571a, h0Var.f3571a) && n3.f.a(this.f3572b, h0Var.f3572b) && n3.f.a(this.f3573c, h0Var.f3573c) && n3.f.a(this.f3574d, h0Var.f3574d);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f3574d) + ob.a.j(this.f3573c, ob.a.j(this.f3572b, Float.floatToIntBits(this.f3571a) * 31, 31), 31);
    }

    public final String toString() {
        return "PaddingValues(start=" + ((Object) n3.f.b(this.f3571a)) + ", top=" + ((Object) n3.f.b(this.f3572b)) + ", end=" + ((Object) n3.f.b(this.f3573c)) + ", bottom=" + ((Object) n3.f.b(this.f3574d)) + ')';
    }
}
