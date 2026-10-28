package p;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class i0 extends v1 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ o0 f9780j;
    public final /* synthetic */ r0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(r0 r0Var, r0 r0Var2, o0 o0Var) {
        super(r0Var2);
        this.k = r0Var;
        this.f9780j = o0Var;
    }

    @Override // p.v1
    public final o.c0 b() {
        return this.f9780j;
    }

    @Override // p.v1
    public final boolean c() {
        r0 r0Var = this.k;
        if (r0Var.getInternalPopup().a()) {
            return true;
        }
        r0Var.f9889f.m(r0Var.getTextDirection(), r0Var.getTextAlignment());
        return true;
    }
}
