package b8;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class m1 extends c2 {
    public static final l1 Companion = new l1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f1610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f1611c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f1612d;

    public /* synthetic */ m1(int i7, boolean z10, double d10, double d11) {
        this.f1610b = (i7 & 1) == 0 ? true : z10;
        if ((i7 & 2) == 0) {
            this.f1611c = 0.0d;
        } else {
            this.f1611c = d10;
        }
        if ((i7 & 4) == 0) {
            this.f1612d = 0.0d;
        } else {
            this.f1612d = d11;
        }
    }

    public m1(boolean z10, double d10, double d11) {
        this.f1610b = z10;
        this.f1611c = d10;
        this.f1612d = d11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m1)) {
            return false;
        }
        m1 m1Var = (m1) obj;
        return this.f1610b == m1Var.f1610b && Double.compare(this.f1611c, m1Var.f1611c) == 0 && Double.compare(this.f1612d, m1Var.f1612d) == 0;
    }

    public final int hashCode() {
        int i7 = this.f1610b ? 1231 : 1237;
        long jDoubleToLongBits = Double.doubleToLongBits(this.f1611c);
        int i10 = ((i7 * 31) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 31;
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.f1612d);
        return i10 + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)));
    }

    public final String toString() {
        return "SunCycle(isDayTime=" + this.f1610b + ", latitude=" + this.f1611c + ", longitude=" + this.f1612d + ")";
    }
}
