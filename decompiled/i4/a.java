package i4;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f6618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f6619c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f6620d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f6621e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f6622f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f6623g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f6624h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f6625i;

    public final float a(long j5) {
        long j10 = this.f6621e;
        if (j5 < j10) {
            return 0.0f;
        }
        long j11 = this.f6623g;
        if (j11 < 0 || j5 < j11) {
            return e.b((j5 - j10) / this.f6617a, 0.0f, 1.0f) * 0.5f;
        }
        float f10 = this.f6624h;
        return (e.b((j5 - j11) / this.f6625i, 0.0f, 1.0f) * f10) + (1.0f - f10);
    }
}
