package l0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v0 implements h9.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b1 f7880b;

    public /* synthetic */ v0(b1 b1Var, int i7) {
        this.f7879a = i7;
        this.f7880b = b1Var;
    }

    @Override // h9.k
    public final Object invoke(Object obj) {
        switch (this.f7879a) {
            case 0:
                this.f7880b.a(((x1.b) obj).f14521a);
                break;
            default:
                k2.v vVar = (k2.v) obj;
                this.f7880b.e(k2.u.f(vVar, false));
                vVar.a();
                break;
        }
        return t8.z.f12851a;
    }
}
