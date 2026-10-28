package q2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r1.o f10590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public h1.e f10592c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public h1.e f10593d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f10594e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d1 f10595f;

    public b1(d1 d1Var, r1.o oVar, int i7, h1.e eVar, h1.e eVar2, boolean z10) {
        this.f10595f = d1Var;
        this.f10590a = oVar;
        this.f10591b = i7;
        this.f10592c = eVar;
        this.f10593d = eVar2;
        this.f10594e = z10;
    }

    public final boolean a(int i7, int i10) {
        h1.e eVar = this.f10592c;
        int i11 = this.f10591b;
        r1.n nVar = (r1.n) eVar.f6421a[i7 + i11];
        r1.n nVar2 = (r1.n) this.f10593d.f6421a[i11 + i10];
        return i9.l.a(nVar, nVar2) || nVar.getClass() == nVar2.getClass();
    }
}
