package j;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class h0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static h0 f6800d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f6801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f6802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6803c;

    public final void a(long j5, double d10, double d11) {
        float f10 = (j5 - 946728000000L) / 8.64E7f;
        float f11 = (0.01720197f * f10) + 6.24006f;
        double d12 = f11;
        double dSin = (Math.sin(f11 * 3.0f) * 5.236000106378924E-6d) + (Math.sin(2.0f * f11) * 3.4906598739326E-4d) + (Math.sin(d12) * 0.03341960161924362d) + d12 + 1.796593063d + 3.141592653589793d;
        double d13 = (-d11) / 360.0d;
        double dSin2 = (Math.sin(2.0d * dSin) * (-0.0069d)) + (Math.sin(d12) * 0.0053d) + ((double) (Math.round(((double) (f10 - 9.0E-4f)) - d13) + 9.0E-4f)) + d13;
        double dAsin = Math.asin(Math.sin(0.4092797040939331d) * Math.sin(dSin));
        double d14 = 0.01745329238474369d * d10;
        double dSin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(dAsin) * Math.sin(d14))) / (Math.cos(dAsin) * Math.cos(d14));
        if (dSin3 >= 1.0d) {
            this.f6803c = 1;
            this.f6801a = -1L;
            this.f6802b = -1L;
        } else {
            if (dSin3 <= -1.0d) {
                this.f6803c = 0;
                this.f6801a = -1L;
                this.f6802b = -1L;
                return;
            }
            double dAcos = (float) (Math.acos(dSin3) / 6.283185307179586d);
            this.f6801a = Math.round((dSin2 + dAcos) * 8.64E7d) + 946728000000L;
            long jRound = Math.round((dSin2 - dAcos) * 8.64E7d) + 946728000000L;
            this.f6802b = jRound;
            if (jRound >= j5 || this.f6801a <= j5) {
                this.f6803c = 1;
            } else {
                this.f6803c = 0;
            }
        }
    }
}
