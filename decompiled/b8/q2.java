package b8;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class q2 {
    public static final p2 Companion = new p2();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final t8.o f1637e = t8.a.d(new b3.i0(6));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f1640c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f1641d;

    public q2() {
        this.f1638a = "北京市";
        this.f1639b = "北京市";
        this.f1640c = 39.910924547299565d;
        this.f1641d = 116.4133836971231d;
    }

    public /* synthetic */ q2(int i7, String str, String str2, double d10, double d11) {
        if (15 != (i7 & 15)) {
            pc.m0.e(i7, 15, o2.f1629a.d());
            throw null;
        }
        this.f1638a = str;
        this.f1639b = str2;
        this.f1640c = d10;
        this.f1641d = d11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q2)) {
            return false;
        }
        q2 q2Var = (q2) obj;
        return i9.l.a(this.f1638a, q2Var.f1638a) && i9.l.a(this.f1639b, q2Var.f1639b) && Double.compare(this.f1640c, q2Var.f1640c) == 0 && Double.compare(this.f1641d, q2Var.f1641d) == 0;
    }

    public final int hashCode() {
        int iL = ob.a.l(this.f1639b, this.f1638a.hashCode() * 31, 31);
        long jDoubleToLongBits = Double.doubleToLongBits(this.f1640c);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.f1641d);
        return ((iL + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)));
    }

    public final String toString() {
        return "TaskerRegion(province=" + this.f1638a + ", city=" + this.f1639b + ", lat=" + this.f1640c + ", lng=" + this.f1641d + ")";
    }
}
