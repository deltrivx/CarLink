package cc;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class n0 implements x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f2648a;

    public n0(boolean z10) {
        this.f2648a = z10;
    }

    @Override // cc.x0
    public final boolean b() {
        return this.f2648a;
    }

    @Override // cc.x0
    public final j1 d() {
        return null;
    }

    public final String toString() {
        return a2.f.I(new StringBuilder("Empty{"), this.f2648a ? "Active" : "New", '}');
    }
}
