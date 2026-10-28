package v;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class y implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f13476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f13477c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f13478d;

    public y(int i7, int i10, t tVar) {
        this.f13475a = i7;
        this.f13476b = tVar;
        this.f13477c = ((long) i7) * 1000000;
        this.f13478d = ((long) i10) * 1000000;
    }

    @Override // v.w
    public final float a(long j5, float f10, float f11, float f12) {
        long j10 = j5 - this.f13478d;
        if (j10 < 0) {
            j10 = 0;
        }
        long j11 = this.f13477c;
        long j12 = j10 > j11 ? j11 : j10;
        if (j12 == 0) {
            return f12;
        }
        return (e(j12, f10, f11, f12) - e(j12 - 1000000, f10, f11, f12)) * 1000.0f;
    }

    @Override // v.w
    public final long b(float f10, float f11, float f12) {
        return this.f13478d + this.f13477c;
    }

    @Override // v.w
    public final float c(float f10, float f11, float f12) {
        return a(b(f10, f11, f12), f10, f11, f12);
    }

    @Override // v.j
    public final x0 d(w0 w0Var) {
        return new da.a(this);
    }

    @Override // v.w
    public final float e(long j5, float f10, float f11, float f12) {
        long j10 = j5 - this.f13478d;
        if (j10 < 0) {
            j10 = 0;
        }
        long j11 = this.f13477c;
        if (j10 > j11) {
            j10 = j11;
        }
        float fA = this.f13476b.a(this.f13475a == 0 ? 1.0f : j10 / j11);
        return (f11 * fA) + ((1 - fA) * f10);
    }
}
