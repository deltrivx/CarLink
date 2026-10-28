package q2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class t0 extends i9.n implements h9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u0 f10802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q1 f10803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f10804c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(u0 u0Var, q1 q1Var, long j5) {
        super(0);
        this.f10802a = u0Var;
        this.f10803b = q1Var;
        this.f10804c = j5;
    }

    @Override // h9.a
    public final Object invoke() {
        q0 q0VarE0;
        l0 l0Var = this.f10802a.f10810f;
        o2.u0 placementScope = null;
        if (f.q(l0Var.f10729a) || l0Var.f10731c) {
            h1 h1Var = l0Var.a().f10694q;
            if (h1Var != null) {
                placementScope = h1Var.f10773l;
            }
        } else {
            h1 h1Var2 = l0Var.a().f10694q;
            if (h1Var2 != null && (q0VarE0 = h1Var2.E0()) != null) {
                placementScope = q0VarE0.f10773l;
            }
        }
        if (placementScope == null) {
            placementScope = ((r2.u) this.f10803b).getPlacementScope();
        }
        q0 q0VarE1 = l0Var.a().E0();
        i9.l.b(q0VarE1);
        o2.u0.h(placementScope, q0VarE1, this.f10804c);
        return t8.z.f12851a;
    }
}
