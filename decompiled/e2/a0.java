package e2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends c0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f4100c;

    public a0(float f10) {
        super(3);
        this.f4100c = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a0) && Float.compare(this.f4100c, ((a0) obj).f4100c) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f4100c);
    }

    public final String toString() {
        return ob.a.r(new StringBuilder("RelativeVerticalTo(dy="), this.f4100c, ')');
    }
}
