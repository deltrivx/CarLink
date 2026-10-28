package n5;

import n3.r;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f8854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f8855b;

    public o(float f10, float f11) {
        this.f8854a = f10;
        this.f8855b = f11;
    }

    public static float a(o oVar, o oVar2) {
        return r.w(oVar.f8854a, oVar.f8855b, oVar2.f8854a, oVar2.f8855b);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            o oVar = (o) obj;
            if (this.f8854a == oVar.f8854a && this.f8855b == oVar.f8855b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f8855b) + (Float.floatToIntBits(this.f8854a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("(");
        sb2.append(this.f8854a);
        sb2.append(',');
        return ob.a.r(sb2, this.f8855b, ')');
    }
}
