package e6;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class j extends l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f4446c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f4447d;

    public j(int i7, String str) {
        super(i7);
        this.f4445b = str;
        this.f4447d = false;
        this.f4446c = 0;
    }

    public j(String str, int i7, int i10) {
        super(i7);
        this.f4447d = true;
        this.f4446c = i10;
        this.f4445b = str;
    }
}
