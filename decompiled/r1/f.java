package r1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f11107a;

    public f(float f10) {
        this.f11107a = f10;
    }

    public final int a(int i7, int i10, n3.o oVar) {
        float f10 = (i10 - i7) / 2.0f;
        n3.o oVar2 = n3.o.f8749a;
        float f11 = this.f11107a;
        if (oVar != oVar2) {
            f11 *= -1;
        }
        return Math.round((1 + f11) * f10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && Float.compare(this.f11107a, ((f) obj).f11107a) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f11107a);
    }

    public final String toString() {
        return ob.a.r(new StringBuilder("Horizontal(bias="), this.f11107a, ')');
    }
}
