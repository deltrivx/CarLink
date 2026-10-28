package androidx.lifecycle;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class h0 implements r, AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g0 f1035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f1036c;

    public h0(String str, g0 g0Var) {
        this.f1034a = str;
        this.f1035b = g0Var;
    }

    @Override // androidx.lifecycle.r
    public final void c(t tVar, n nVar) {
        if (nVar == n.ON_DESTROY) {
            this.f1036c = false;
            tVar.g().f(this);
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }

    public final void j(android.support.v4.media.session.r rVar, v vVar) {
        i9.l.e(rVar, "registry");
        i9.l.e(vVar, "lifecycle");
        if (this.f1036c) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f1036c = true;
        vVar.a(this);
        rVar.H(this.f1034a, (c.f) this.f1035b.f1033a.f1432a);
    }
}
