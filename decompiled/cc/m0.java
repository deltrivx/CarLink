package cc;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class m0 extends e1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2644e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f2645f;

    public /* synthetic */ m0(int i7, Object obj) {
        this.f2644e = i7;
        this.f2645f = obj;
    }

    @Override // cc.e1
    public final boolean k() {
        switch (this.f2644e) {
        }
        return false;
    }

    @Override // cc.e1
    public final void l(Throwable th) {
        switch (this.f2644e) {
            case 0:
                ((l0) this.f2645f).a();
                break;
            default:
                ((h9.k) this.f2645f).invoke(th);
                break;
        }
    }
}
