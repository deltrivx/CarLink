package p;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class p2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9868c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f9869d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f9870e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f9871f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f9872g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f9873h;

    public final void a(int i7, int i10) {
        this.f9868c = i7;
        this.f9869d = i10;
        this.f9873h = true;
        if (this.f9872g) {
            if (i10 != Integer.MIN_VALUE) {
                this.f9866a = i10;
            }
            if (i7 != Integer.MIN_VALUE) {
                this.f9867b = i7;
                return;
            }
            return;
        }
        if (i7 != Integer.MIN_VALUE) {
            this.f9866a = i7;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f9867b = i10;
        }
    }
}
