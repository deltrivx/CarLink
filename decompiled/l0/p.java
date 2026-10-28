package l0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7776a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f7777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7778c;

    public /* synthetic */ p(w0.t1 t1Var, boolean z10, int i7) {
        this.f7778c = t1Var;
        this.f7777b = z10;
    }

    public /* synthetic */ p(boolean z10, n1.c cVar, int i7) {
        this.f7777b = z10;
        this.f7778c = cVar;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f7776a) {
            case 0:
                ((Integer) obj2).getClass();
                int iY = f1.b.y(1);
                q0.g((w0.t1) this.f7778c, this.f7777b, (f1.s) obj, iY);
                break;
            default:
                ((Integer) obj2).getClass();
                int iY2 = f1.b.y(385);
                m8.b.a(this.f7777b, (n1.c) this.f7778c, (f1.s) obj, iY2);
                break;
        }
        return t8.z.f12851a;
    }
}
