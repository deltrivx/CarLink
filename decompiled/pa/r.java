package pa;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class r {
    public static final r k = new r(false, false, false, false, false, new r(false, false, false, false, false, null, false, null, null, 1023), false, null, null, 988);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f10355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f10356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f10357c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f10358d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f10359e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final r f10360f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f10361g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final r f10362h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final r f10363i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f10364j;

    public r(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, r rVar, boolean z15, r rVar2, r rVar3, int i7) {
        z10 = (i7 & 1) != 0 ? true : z10;
        z11 = (i7 & 2) != 0 ? true : z11;
        z12 = (i7 & 4) != 0 ? false : z12;
        z13 = (i7 & 8) != 0 ? false : z13;
        z14 = (i7 & 16) != 0 ? false : z14;
        rVar = (i7 & 32) != 0 ? null : rVar;
        z15 = (i7 & 64) != 0 ? true : z15;
        rVar2 = (i7 & 128) != 0 ? rVar : rVar2;
        rVar3 = (i7 & 256) != 0 ? rVar : rVar3;
        boolean z16 = (i7 & 512) == 0;
        this.f10355a = z10;
        this.f10356b = z11;
        this.f10357c = z12;
        this.f10358d = z13;
        this.f10359e = z14;
        this.f10360f = rVar;
        this.f10361g = z15;
        this.f10362h = rVar2;
        this.f10363i = rVar3;
        this.f10364j = z16;
    }
}
