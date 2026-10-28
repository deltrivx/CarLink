package h0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n0 implements h9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p0 f6344b;

    public /* synthetic */ n0(p0 p0Var, int i7) {
        this.f6343a = i7;
        this.f6344b = p0Var;
    }

    @Override // h9.a
    public final Object invoke() {
        switch (this.f6343a) {
            case 0:
                return Float.valueOf(this.f6344b.f6350p.b());
            case 1:
                return Float.valueOf(this.f6344b.f6350p.d());
            default:
                p0 p0Var = this.f6344b;
                return Float.valueOf(p0Var.f6350p.a() - p0Var.f6350p.c());
        }
    }
}
