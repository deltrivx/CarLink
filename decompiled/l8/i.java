package l8;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8172a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f8173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h9.k f8174c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8175d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f8176e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f8177f;

    public /* synthetic */ i(r1.p pVar, m5.l lVar, boolean z10, h9.k kVar, int i7) {
        this.f8176e = pVar;
        this.f8177f = lVar;
        this.f8173b = z10;
        this.f8174c = kVar;
        this.f8175d = i7;
    }

    public /* synthetic */ i(boolean z10, h9.a aVar, n8.q qVar, h9.k kVar, int i7) {
        this.f8173b = z10;
        this.f8176e = aVar;
        this.f8177f = qVar;
        this.f8174c = kVar;
        this.f8175d = i7;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f8172a) {
            case 0:
                ((Integer) obj2).getClass();
                n.b(this.f8173b, (h9.a) this.f8176e, (n8.q) this.f8177f, this.f8174c, (f1.s) obj, f1.b.y(this.f8175d | 1));
                break;
            default:
                r1.p pVar = (r1.p) this.f8176e;
                m5.l lVar = (m5.l) this.f8177f;
                ((Integer) obj2).getClass();
                i9.l.e(pVar, "$modifier");
                i9.l.e(lVar, "$controller");
                o9.e0.a(pVar, lVar, this.f8173b, this.f8174c, (f1.s) obj, f1.b.y(this.f8175d | 1));
                break;
        }
        return t8.z.f12851a;
    }
}
