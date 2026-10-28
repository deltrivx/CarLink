package z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f15457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f15458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f15459c;

    public q0(long j5, long j10, boolean z10) {
        this.f15457a = j5;
        this.f15458b = j10;
        this.f15459c = z10;
    }

    public final q0 a(q0 q0Var) {
        return new q0(x1.b.h(this.f15457a, q0Var.f15457a), Math.max(this.f15458b, q0Var.f15458b), this.f15459c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return x1.b.b(this.f15457a, q0Var.f15457a) && this.f15458b == q0Var.f15458b && this.f15459c == q0Var.f15459c;
    }

    public final int hashCode() {
        int iF = x1.b.f(this.f15457a) * 31;
        long j5 = this.f15458b;
        return ((iF + ((int) (j5 ^ (j5 >>> 32)))) * 31) + (this.f15459c ? 1231 : 1237);
    }

    public final String toString() {
        return "MouseWheelScrollDelta(value=" + ((Object) x1.b.j(this.f15457a)) + ", timeMillis=" + this.f15458b + ", shouldApplyImmediately=" + this.f15459c + ')';
    }
}
