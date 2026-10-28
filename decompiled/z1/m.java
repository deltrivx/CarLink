package z1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f15664b;

    public /* synthetic */ m(q qVar, int i7) {
        this.f15663a = i7;
        this.f15664b = qVar;
    }

    @Override // z1.i
    public final double b(double d10) {
        switch (this.f15663a) {
            case 0:
                q qVar = this.f15664b;
                return n3.r.k(qVar.k.b(d10), qVar.f15673e, qVar.f15674f);
            default:
                q qVar2 = this.f15664b;
                return qVar2.f15681n.b(n3.r.k(d10, qVar2.f15673e, qVar2.f15674f));
        }
    }
}
