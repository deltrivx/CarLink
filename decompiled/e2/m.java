package e2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class m extends c0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f4236c;

    public m(float f10) {
        super(3);
        this.f4236c = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && Float.compare(this.f4236c, ((m) obj).f4236c) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f4236c);
    }

    public final String toString() {
        return ob.a.r(new StringBuilder("HorizontalTo(x="), this.f4236c, ')');
    }
}
