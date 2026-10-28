package f1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class g0 implements d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h9.k f4959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h0 f4960b;

    public g0(h9.k kVar) {
        this.f4959a = kVar;
    }

    @Override // f1.d2
    public final void c() {
    }

    @Override // f1.d2
    public final void e() {
        h0 h0Var = this.f4960b;
        if (h0Var != null) {
            h0Var.a();
        }
        this.f4960b = null;
    }

    @Override // f1.d2
    public final void f() {
        this.f4960b = (h0) this.f4959a.invoke(b.f4887b);
    }
}
