package y1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class k0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final k0 f14924d = new k0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f14925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f14926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f14927c;

    public /* synthetic */ k0() {
        this(0.0f, h0.d(4278190080L), 0L);
    }

    public k0(float f10, long j5, long j10) {
        this.f14925a = j5;
        this.f14926b = j10;
        this.f14927c = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return q.c(this.f14925a, k0Var.f14925a) && x1.b.b(this.f14926b, k0Var.f14926b) && this.f14927c == k0Var.f14927c;
    }

    public final int hashCode() {
        int i7 = q.f14959n;
        return Float.floatToIntBits(this.f14927c) + ((x1.b.f(this.f14926b) + (t8.u.a(this.f14925a) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Shadow(color=");
        ob.a.x(this.f14925a, sb2, ", offset=");
        sb2.append((Object) x1.b.j(this.f14926b));
        sb2.append(", blurRadius=");
        return ob.a.r(sb2, this.f14927c, ')');
    }
}
