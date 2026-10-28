package w0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f14016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f14017b;

    public y1(long j5, long j10) {
        this.f14016a = j5;
        this.f14017b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y1)) {
            return false;
        }
        y1 y1Var = (y1) obj;
        return y1.q.c(this.f14016a, y1Var.f14016a) && y1.q.c(this.f14017b, y1Var.f14017b);
    }

    public final int hashCode() {
        int i7 = y1.q.f14959n;
        return t8.u.a(this.f14017b) + (t8.u.a(this.f14016a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelectionColors(selectionHandleColor=");
        ob.a.x(this.f14016a, sb2, ", selectionBackgroundColor=");
        sb2.append((Object) y1.q.i(this.f14017b));
        sb2.append(')');
        return sb2.toString();
    }
}
