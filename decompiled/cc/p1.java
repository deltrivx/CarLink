package cc;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class p1 extends hc.p {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2653e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p1(y8.h hVar, y8.c cVar, int i7) {
        super(cVar, hVar);
        this.f2653e = i7;
    }

    @Override // cc.h1
    public final boolean F(Throwable th) {
        switch (this.f2653e) {
            case 0:
                return false;
            default:
                if (th instanceof gc.l) {
                    return true;
                }
                return B(th);
        }
    }
}
