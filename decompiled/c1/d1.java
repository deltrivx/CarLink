package c1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d1 extends i9.n implements h9.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o2.v0 f1850c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o2.v0 f1851d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o2.v0 f1852e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o2.v0 f1853f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ o2.v0 f1854g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ o2.v0 f1855h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ o2.v0 f1856i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ o2.v0 f1857j;
    public final /* synthetic */ o2.v0 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e1 f1858l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ o2.o0 f1859m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(int i7, int i10, o2.v0 v0Var, o2.v0 v0Var2, o2.v0 v0Var3, o2.v0 v0Var4, o2.v0 v0Var5, o2.v0 v0Var6, o2.v0 v0Var7, o2.v0 v0Var8, o2.v0 v0Var9, e1 e1Var, o2.o0 o0Var) {
        super(1);
        this.f1848a = i7;
        this.f1849b = i10;
        this.f1850c = v0Var;
        this.f1851d = v0Var2;
        this.f1852e = v0Var3;
        this.f1853f = v0Var4;
        this.f1854g = v0Var5;
        this.f1855h = v0Var6;
        this.f1856i = v0Var7;
        this.f1857j = v0Var8;
        this.k = v0Var9;
        this.f1858l = e1Var;
        this.f1859m = o0Var;
    }

    @Override // h9.k
    public final Object invoke(Object obj) {
        float f10;
        int iRound;
        float f11;
        o2.u0 u0Var = (o2.u0) obj;
        e1 e1Var = this.f1858l;
        float f12 = e1Var.f1870c;
        boolean z10 = e1Var.f1869b;
        o2.o0 o0Var = this.f1859m;
        float fA = o0Var.a();
        n3.o layoutDirection = o0Var.getLayoutDirection();
        d0.h0 h0Var = e1Var.f1871d;
        float f13 = b1.f1820a;
        o2.u0.h(u0Var, this.f1857j, 0L);
        float f14 = d1.r.f3736b;
        o2.v0 v0Var = this.k;
        int i7 = this.f1848a - (v0Var != null ? v0Var.f9436b : 0);
        int iM = k9.a.M(h0Var.f3572b * fA);
        int iM2 = k9.a.M(androidx.compose.foundation.layout.a.d(h0Var, layoutDirection) * fA);
        float f15 = d1.r.f3737c * fA;
        o2.v0 v0Var2 = this.f1850c;
        if (v0Var2 != null) {
            o2.u0.j(u0Var, v0Var2, 0, Math.round((1 + 0.0f) * ((i7 - v0Var2.f9436b) / 2.0f)));
        }
        o2.v0 v0Var3 = this.f1855h;
        if (v0Var3 != null) {
            if (z10) {
                f10 = 2.0f;
                iRound = Math.round((1 + 0.0f) * ((i7 - v0Var3.f9436b) / 2.0f));
            } else {
                f10 = 2.0f;
                iRound = iM;
            }
            int iF = n3.r.F(f12, iRound, -(v0Var3.f9436b / 2));
            if (v0Var2 == null) {
                f11 = 0.0f;
            } else {
                f11 = (1 - f12) * (v0Var2.f9435a - f15);
            }
            o2.u0.j(u0Var, v0Var3, k9.a.M(f11) + iM2, iF);
        } else {
            f10 = 2.0f;
        }
        o2.v0 v0Var4 = this.f1852e;
        if (v0Var4 != null) {
            o2.u0.j(u0Var, v0Var4, v0Var2 != null ? v0Var2.f9435a : 0, b1.e(z10, i7, iM, v0Var3, v0Var4));
        }
        int i10 = (v0Var2 != null ? v0Var2.f9435a : 0) + (v0Var4 != null ? v0Var4.f9435a : 0);
        o2.v0 v0Var5 = this.f1854g;
        o2.u0.j(u0Var, v0Var5, i10, b1.e(z10, i7, iM, v0Var3, v0Var5));
        o2.v0 v0Var6 = this.f1856i;
        if (v0Var6 != null) {
            o2.u0.j(u0Var, v0Var6, i10, b1.e(z10, i7, iM, v0Var3, v0Var6));
        }
        int i11 = this.f1849b;
        o2.v0 v0Var7 = this.f1851d;
        o2.v0 v0Var8 = this.f1853f;
        if (v0Var8 != null) {
            o2.u0.j(u0Var, v0Var8, (i11 - (v0Var7 != null ? v0Var7.f9435a : 0)) - v0Var8.f9435a, b1.e(z10, i7, iM, v0Var3, v0Var8));
        }
        if (v0Var7 != null) {
            o2.u0.j(u0Var, v0Var7, i11 - v0Var7.f9435a, Math.round((1 + 0.0f) * ((i7 - v0Var7.f9436b) / f10)));
        }
        if (v0Var != null) {
            o2.u0.j(u0Var, v0Var, 0, i7);
        }
        return t8.z.f12851a;
    }
}
