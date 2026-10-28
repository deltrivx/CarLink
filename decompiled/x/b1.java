package x;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f14324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0.h0 f14325b;

    public b1() {
        long jD = y1.h0.d(4284900966L);
        d0.h0 h0VarA = androidx.compose.foundation.layout.a.a(0.0f, 3);
        this.f14324a = jD;
        this.f14325b = h0VarA;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!b1.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        i9.l.c(obj, "null cannot be cast to non-null type androidx.compose.foundation.OverscrollConfiguration");
        b1 b1Var = (b1) obj;
        return y1.q.c(this.f14324a, b1Var.f14324a) && i9.l.a(this.f14325b, b1Var.f14325b);
    }

    public final int hashCode() {
        int i7 = y1.q.f14959n;
        return this.f14325b.hashCode() + (t8.u.a(this.f14324a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OverscrollConfiguration(glowColor=");
        ob.a.x(this.f14324a, sb2, ", drawPadding=");
        sb2.append(this.f14325b);
        sb2.append(')');
        return sb2.toString();
    }
}
