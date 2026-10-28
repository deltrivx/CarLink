package c1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f1881a = y1.q.f14958m;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f1) {
            return y1.q.c(this.f1881a, ((f1) obj).f1881a);
        }
        return false;
    }

    public final int hashCode() {
        int i7 = y1.q.f14959n;
        return t8.u.a(this.f1881a) * 31;
    }

    public final String toString() {
        return "RippleConfiguration(color=" + ((Object) y1.q.i(this.f1881a)) + ", rippleAlpha=null)";
    }
}
