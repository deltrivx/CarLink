package o2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class g1 extends i9.n implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h1 f9330b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g1(h1 h1Var, int i7) {
        super(2);
        this.f9329a = i7;
        this.f9330b = h1Var;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f9329a) {
            case 0:
                this.f9330b.a().f9342b = (f1.v) obj2;
                break;
            case 1:
                i0 i0VarA = this.f9330b.a();
                ((q2.h0) obj).c0(new f0(i0VarA, (h9.n) obj2, i0VarA.f9355p));
                break;
            default:
                q2.h0 h0Var = (q2.h0) obj;
                h1 h1Var = this.f9330b;
                android.support.v4.media.session.r rVar = h1Var.f9335a;
                i0 i0Var = h0Var.G;
                if (i0Var == null) {
                    i0Var = new i0(h0Var, rVar);
                    h0Var.G = i0Var;
                }
                h1Var.f9336b = i0Var;
                h1Var.a().e();
                i0 i0VarA2 = h1Var.a();
                if (i0VarA2.f9343c != rVar) {
                    i0VarA2.f9343c = rVar;
                    i0VarA2.f(false);
                    q2.h0.V(i0VarA2.f9341a, false, 7);
                }
                break;
        }
        return t8.z.f12851a;
    }
}
