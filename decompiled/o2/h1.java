package o2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.support.v4.media.session.r f9335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i0 f9336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g1 f9337c = new g1(this, 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g1 f9338d = new g1(this, 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g1 f9339e = new g1(this, 1);

    public h1(android.support.v4.media.session.r rVar) {
        this.f9335a = rVar;
    }

    public final i0 a() {
        i0 i0Var = this.f9336b;
        if (i0Var != null) {
            return i0Var;
        }
        throw new IllegalArgumentException("SubcomposeLayoutState is not attached to SubcomposeLayout");
    }
}
