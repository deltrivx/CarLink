package q2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e1 extends i9.n implements h9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h1 f10636b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e1(h1 h1Var, int i7) {
        super(0);
        this.f10635a = i7;
        this.f10636b = h1Var;
    }

    @Override // h9.a
    public final Object invoke() {
        switch (this.f10635a) {
            case 0:
                h1 h1Var = this.f10636b;
                y1.o oVar = h1Var.E;
                i9.l.b(oVar);
                h1Var.A0(oVar, h1Var.D);
                break;
            default:
                h1 h1Var2 = this.f10636b.f10694q;
                if (h1Var2 != null) {
                    h1Var2.N0();
                }
                break;
        }
        return t8.z.f12851a;
    }
}
