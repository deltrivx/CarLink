package f1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o implements h9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f5065b;

    public /* synthetic */ o(int i7, s sVar) {
        this.f5064a = i7;
        this.f5065b = sVar;
    }

    public /* synthetic */ o(s sVar, a1 a1Var) {
        this.f5064a = 0;
        this.f5065b = sVar;
    }

    @Override // h9.a
    public final Object invoke() {
        switch (this.f5064a) {
            case 0:
                throw null;
            case 1:
                return this.f5065b.m();
            default:
                return this.f5065b.m();
        }
    }
}
