package l8;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u implements h9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f8258c;

    public /* synthetic */ u(int i7, int i10, Object obj) {
        this.f8256a = i10;
        this.f8258c = obj;
        this.f8257b = i7;
    }

    @Override // h9.a
    public final Object invoke() {
        switch (this.f8256a) {
            case 0:
                f0.u uVar = (f0.u) this.f8258c;
                int iF = uVar.f4856e.f4840c.f();
                int iF2 = uVar.f4856e.f4839b.f();
                if (iF > this.f8257b / 2) {
                    iF2++;
                }
                return Integer.valueOf(iF2);
            default:
                return Integer.valueOf(((w0.w) this.f8258c).f13978f.f1409b.d(this.f8257b));
        }
    }
}
