package pc;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long[] f10499e = new long[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nc.e f10500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ob.t f10501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f10502c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long[] f10503d;

    public s(nc.e eVar, ob.t tVar) {
        i9.l.e(eVar, "descriptor");
        this.f10500a = eVar;
        this.f10501b = tVar;
        int iK = eVar.k();
        if (iK <= 64) {
            this.f10502c = iK != 64 ? (-1) << iK : 0L;
            this.f10503d = f10499e;
            return;
        }
        this.f10502c = 0L;
        int i7 = (iK - 1) >>> 6;
        long[] jArr = new long[i7];
        if ((iK & 63) != 0) {
            jArr[i7 - 1] = (-1) << iK;
        }
        this.f10503d = jArr;
    }
}
