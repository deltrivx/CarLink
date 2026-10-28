package c;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class j0 implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m0 f1738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l0 f1739b;

    public j0(l0 l0Var, m0 m0Var) {
        i9.l.e(m0Var, "onBackPressedCallback");
        this.f1739b = l0Var;
        this.f1738a = m0Var;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [h9.a, i9.j] */
    @Override // c.c
    public final void cancel() {
        l0 l0Var = this.f1739b;
        u8.k kVar = l0Var.f1754b;
        m0 m0Var = this.f1738a;
        kVar.remove(m0Var);
        if (i9.l.a(l0Var.f1755c, m0Var)) {
            m0Var.getClass();
            l0Var.f1755c = null;
        }
        m0Var.f1763b.remove(this);
        ?? r8 = m0Var.f1764c;
        if (r8 != 0) {
            r8.invoke();
        }
        m0Var.f1764c = null;
    }
}
