package e2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class o extends c0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f4239c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f4240d;

    public o(float f10, float f11) {
        super(3);
        this.f4239c = f10;
        this.f4240d = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return Float.compare(this.f4239c, oVar.f4239c) == 0 && Float.compare(this.f4240d, oVar.f4240d) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f4240d) + (Float.floatToIntBits(this.f4239c) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MoveTo(x=");
        sb2.append(this.f4239c);
        sb2.append(", y=");
        return ob.a.r(sb2, this.f4240d, ')');
    }
}
