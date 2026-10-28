package q2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b extends i9.n implements h9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f10589b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(c cVar, int i7) {
        super(0);
        this.f10588a = i7;
        this.f10589b = cVar;
    }

    @Override // h9.a
    public final Object invoke() {
        switch (this.f10588a) {
            case 0:
                this.f10589b.C0();
                break;
            default:
                c cVar = this.f10589b;
                r1.n nVar = cVar.f10598o;
                i9.l.c(nVar, "null cannot be cast to non-null type androidx.compose.ui.modifier.ModifierLocalConsumer");
                d0.a0 a0Var = (d0.a0) nVar;
                a0Var.getClass();
                d0.t0 t0Var = (d0.t0) cVar.A(d0.c.f3545c);
                d0.t0 t0Var2 = a0Var.f3535a;
                a0Var.f3536b.setValue(new d0.v(t0Var2, t0Var));
                a0Var.f3537c.setValue(new d0.q0(t0Var, t0Var2));
                break;
        }
        return t8.z.f12851a;
    }
}
