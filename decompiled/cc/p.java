package cc;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class p extends e1 implements o {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h1 f2651e;

    public p(h1 h1Var) {
        this.f2651e = h1Var;
    }

    @Override // cc.o
    public final boolean c(Throwable th) {
        return j().F(th);
    }

    @Override // cc.e1
    public final boolean k() {
        return true;
    }

    @Override // cc.e1
    public final void l(Throwable th) {
        this.f2651e.B(j());
    }
}
