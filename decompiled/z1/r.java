package z1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f15685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f15686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f15687c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f15688d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final double f15689e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final double f15690f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final double f15691g;

    public /* synthetic */ r(double d10, double d11, double d12, double d13, double d14) {
        this(d10, d11, d12, d13, d14, 0.0d, 0.0d);
    }

    public r(double d10, double d11, double d12, double d13, double d14, double d15, double d16) {
        this.f15685a = d10;
        this.f15686b = d11;
        this.f15687c = d12;
        this.f15688d = d13;
        this.f15689e = d14;
        this.f15690f = d15;
        this.f15691g = d16;
        if (Double.isNaN(d11) || Double.isNaN(d12) || Double.isNaN(d13) || Double.isNaN(d14) || Double.isNaN(d15) || Double.isNaN(d16) || Double.isNaN(d10)) {
            throw new IllegalArgumentException("Parameters cannot be NaN");
        }
        if (d10 == -2.0d || d10 == -3.0d) {
            return;
        }
        if (d14 < 0.0d || d14 > 1.0d) {
            throw new IllegalArgumentException("Parameter d must be in the range [0..1], was " + d14);
        }
        if (d14 == 0.0d && (d11 == 0.0d || d10 == 0.0d)) {
            throw new IllegalArgumentException("Parameter a or g is zero, the transfer function is constant");
        }
        if (d14 >= 1.0d && d13 == 0.0d) {
            throw new IllegalArgumentException("Parameter c is zero, the transfer function is constant");
        }
        if ((d11 == 0.0d || d10 == 0.0d) && d13 == 0.0d) {
            throw new IllegalArgumentException("Parameter a or g is zero, and c is zero, the transfer function is constant");
        }
        if (d13 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be increasing");
        }
        if (d11 < 0.0d || d10 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be positive or increasing");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return Double.compare(this.f15685a, rVar.f15685a) == 0 && Double.compare(this.f15686b, rVar.f15686b) == 0 && Double.compare(this.f15687c, rVar.f15687c) == 0 && Double.compare(this.f15688d, rVar.f15688d) == 0 && Double.compare(this.f15689e, rVar.f15689e) == 0 && Double.compare(this.f15690f, rVar.f15690f) == 0 && Double.compare(this.f15691g, rVar.f15691g) == 0;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.f15685a);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.f15686b);
        int i7 = ((((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 31;
        long jDoubleToLongBits3 = Double.doubleToLongBits(this.f15687c);
        int i10 = (i7 + ((int) (jDoubleToLongBits3 ^ (jDoubleToLongBits3 >>> 32)))) * 31;
        long jDoubleToLongBits4 = Double.doubleToLongBits(this.f15688d);
        int i11 = (i10 + ((int) (jDoubleToLongBits4 ^ (jDoubleToLongBits4 >>> 32)))) * 31;
        long jDoubleToLongBits5 = Double.doubleToLongBits(this.f15689e);
        int i12 = (i11 + ((int) (jDoubleToLongBits5 ^ (jDoubleToLongBits5 >>> 32)))) * 31;
        long jDoubleToLongBits6 = Double.doubleToLongBits(this.f15690f);
        int i13 = (i12 + ((int) (jDoubleToLongBits6 ^ (jDoubleToLongBits6 >>> 32)))) * 31;
        long jDoubleToLongBits7 = Double.doubleToLongBits(this.f15691g);
        return i13 + ((int) (jDoubleToLongBits7 ^ (jDoubleToLongBits7 >>> 32)));
    }

    public final String toString() {
        return "TransferParameters(gamma=" + this.f15685a + ", a=" + this.f15686b + ", b=" + this.f15687c + ", c=" + this.f15688d + ", d=" + this.f15689e + ", e=" + this.f15690f + ", f=" + this.f15691g + ')';
    }
}
