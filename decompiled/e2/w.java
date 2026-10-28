package e2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class w extends c0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f4267c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f4268d;

    public w(float f10, float f11) {
        super(3);
        this.f4267c = f10;
        this.f4268d = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return Float.compare(this.f4267c, wVar.f4267c) == 0 && Float.compare(this.f4268d, wVar.f4268d) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f4268d) + (Float.floatToIntBits(this.f4267c) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeMoveTo(dx=");
        sb2.append(this.f4267c);
        sb2.append(", dy=");
        return ob.a.r(sb2, this.f4268d, ')');
    }
}
