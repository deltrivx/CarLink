package x;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f14469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y1.n0 f14470b;

    public q(float f10, y1.n0 n0Var) {
        this.f14469a = f10;
        this.f14470b = n0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return n3.f.a(this.f14469a, qVar.f14469a) && this.f14470b.equals(qVar.f14470b);
    }

    public final int hashCode() {
        return this.f14470b.hashCode() + (Float.floatToIntBits(this.f14469a) * 31);
    }

    public final String toString() {
        return "BorderStroke(width=" + ((Object) n3.f.b(this.f14469a)) + ", brush=" + this.f14470b + ')';
    }
}
