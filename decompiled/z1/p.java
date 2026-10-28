package z1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class p extends i9.n implements h9.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f15670b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(q qVar, int i7) {
        super(1);
        this.f15669a = i7;
        this.f15670b = qVar;
    }

    @Override // h9.k
    public final Object invoke(Object obj) {
        switch (this.f15669a) {
            case 0:
                double dDoubleValue = ((Number) obj).doubleValue();
                q qVar = this.f15670b;
                return Double.valueOf(qVar.f15681n.b(n3.r.k(dDoubleValue, qVar.f15673e, qVar.f15674f)));
            default:
                double dDoubleValue2 = ((Number) obj).doubleValue();
                q qVar2 = this.f15670b;
                return Double.valueOf(n3.r.k(qVar2.k.b(dDoubleValue2), qVar2.f15673e, qVar2.f15674f));
        }
    }
}
