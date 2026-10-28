package cc;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c[] f2607a;

    public d(c[] cVarArr) {
        this.f2607a = cVarArr;
    }

    public final void a() {
        for (c cVar : this.f2607a) {
            l0 l0Var = cVar.f2603f;
            if (l0Var == null) {
                i9.l.j("handle");
                throw null;
            }
            l0Var.a();
        }
    }

    @Override // cc.i
    public final void b(Throwable th) {
        a();
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.f2607a + ']';
    }
}
