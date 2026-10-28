package d0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f3580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f3581b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return Float.compare(this.f3580a, k0Var.f3580a) == 0 && this.f3581b == k0Var.f3581b;
    }

    public final int hashCode() {
        return ((Float.floatToIntBits(this.f3580a) * 31) + (this.f3581b ? 1231 : 1237)) * 961;
    }

    public final String toString() {
        return "RowColumnParentData(weight=" + this.f3580a + ", fill=" + this.f3581b + ", crossAxisAlignment=null, flowLayoutData=null)";
    }
}
