package c1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class i2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h9.a f1923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n9.a f1924c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f1.g1 f1925d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public h9.k f1926e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float[] f1927f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f1.h1 f1928g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f1929h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final f1.g1 f1930i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final f1.g1 f1931j;
    public final f1.k1 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b1.a f1932l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final f1.g1 f1933m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final f1.g1 f1934n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final h2 f1935o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final x.z0 f1936p;

    public i2(float f10, int i7, h9.a aVar, n9.a aVar2) {
        float[] fArr;
        this.f1922a = i7;
        this.f1923b = aVar;
        this.f1924c = aVar2;
        this.f1925d = new f1.g1(f10);
        if (i7 == 0) {
            fArr = new float[0];
        } else {
            int i10 = i7 + 2;
            float[] fArr2 = new float[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                fArr2[i11] = i11 / (i7 + 1);
            }
            fArr = fArr2;
        }
        this.f1927f = fArr;
        this.f1928g = new f1.h1(0);
        this.f1930i = new f1.g1(0.0f);
        this.f1931j = new f1.g1(0.0f);
        this.k = f1.b.s(Boolean.FALSE);
        this.f1932l = new b1.a(3, this);
        n9.a aVar3 = this.f1924c;
        float f11 = aVar3.f8963a;
        float f12 = aVar3.f8964b - f11;
        this.f1933m = new f1.g1(n3.r.E(0.0f, 0.0f, n3.r.l(f12 == 0.0f ? 0.0f : (f10 - f11) / f12, 0.0f, 1.0f)));
        this.f1934n = new f1.g1(0.0f);
        this.f1935o = new h2(this);
        this.f1936p = new x.z0();
    }

    public final void a(float f10) {
        float f11 = this.f1928g.f();
        f1.g1 g1Var = this.f1931j;
        float f12 = 2;
        float fMax = Math.max(f11 - (g1Var.f() / f12), 0.0f);
        float fMin = Math.min(g1Var.f() / f12, fMax);
        f1.g1 g1Var2 = this.f1933m;
        float f13 = g1Var2.f() + f10;
        f1.g1 g1Var3 = this.f1934n;
        g1Var2.g(g1Var3.f() + f13);
        g1Var3.g(0.0f);
        float fE = g2.e(g1Var2.f(), this.f1927f, fMin, fMax);
        n9.a aVar = this.f1924c;
        float f14 = fMax - fMin;
        float fE2 = n3.r.E(aVar.f8963a, aVar.f8964b, n3.r.l(f14 == 0.0f ? 0.0f : (fE - fMin) / f14, 0.0f, 1.0f));
        if (fE2 == this.f1925d.f()) {
            return;
        }
        h9.k kVar = this.f1926e;
        if (kVar != null) {
            kVar.invoke(Float.valueOf(fE2));
        } else {
            c(fE2);
        }
    }

    public final float b() {
        n9.a aVar = this.f1924c;
        float f10 = aVar.f8963a;
        float f11 = aVar.f8964b;
        float fL = n3.r.l(this.f1925d.f(), aVar.f8963a, f11);
        float f12 = f11 - f10;
        return n3.r.l(f12 == 0.0f ? 0.0f : (fL - f10) / f12, 0.0f, 1.0f);
    }

    public final void c(float f10) {
        n9.a aVar = this.f1924c;
        float f11 = aVar.f8963a;
        float f12 = aVar.f8964b;
        this.f1925d.g(g2.e(n3.r.l(f10, f11, f12), this.f1927f, aVar.f8963a, f12));
    }
}
