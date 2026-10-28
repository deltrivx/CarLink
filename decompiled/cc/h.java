package cc;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class h implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f2625b;

    public /* synthetic */ h(int i7, Object obj) {
        this.f2624a = i7;
        this.f2625b = obj;
    }

    @Override // cc.i
    public final void b(Throwable th) {
        switch (this.f2624a) {
            case 0:
                ((h9.k) this.f2625b).invoke(th);
                break;
            default:
                ((l0) this.f2625b).a();
                break;
        }
    }

    public final String toString() {
        switch (this.f2624a) {
            case 0:
                return "CancelHandler.UserSupplied[" + ((h9.k) this.f2625b).getClass().getSimpleName() + '@' + b0.l(this) + ']';
            default:
                return "DisposeOnCancel[" + ((l0) this.f2625b) + ']';
        }
    }
}
