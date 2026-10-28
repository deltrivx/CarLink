package w1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class u extends i9.n implements h9.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f14080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f14081c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f14082d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q3.e f14083e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f14084f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(s sVar, s sVar2, Object obj, int i7, q3.e eVar, int i10) {
        super(1);
        this.f14079a = i10;
        this.f14080b = sVar;
        this.f14081c = sVar2;
        this.f14084f = obj;
        this.f14082d = i7;
        this.f14083e = eVar;
    }

    @Override // h9.k
    public final Object invoke(Object obj) {
        switch (this.f14079a) {
            case 0:
                o2.d dVar = (o2.d) obj;
                s sVar = this.f14081c;
                if (this.f14080b != ((j) ((r2.u) q2.f.w(sVar)).getFocusOwner()).f14049h) {
                    return Boolean.TRUE;
                }
                boolean zB = f.B(sVar, (s) this.f14084f, this.f14082d, this.f14083e);
                Boolean boolValueOf = Boolean.valueOf(zB);
                if (zB || !dVar.a()) {
                    return boolValueOf;
                }
                return null;
            default:
                o2.d dVar2 = (o2.d) obj;
                s sVar2 = this.f14081c;
                if (this.f14080b != ((j) ((r2.u) q2.f.w(sVar2)).getFocusOwner()).f14049h) {
                    return Boolean.TRUE;
                }
                boolean zA = f.A(this.f14082d, this.f14083e, sVar2, (x1.c) this.f14084f);
                Boolean boolValueOf2 = Boolean.valueOf(zA);
                if (zA || !dVar2.a()) {
                    return boolValueOf2;
                }
                return null;
        }
    }
}
