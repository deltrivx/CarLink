package c1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class r1 extends i9.n implements h9.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i2 f2116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f2117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f2118c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f2119d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f2120e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f2121f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f2122g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ h9.n f2123h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ h9.o f2124i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(i2 i2Var, long j5, long j10, long j11, long j12, float f10, float f11, h9.n nVar, h9.o oVar) {
        super(1);
        this.f2116a = i2Var;
        this.f2117b = j5;
        this.f2118c = j10;
        this.f2119d = j11;
        this.f2120e = j12;
        this.f2121f = f10;
        this.f2122g = f11;
        this.f2123h = nVar;
        this.f2124i = oVar;
    }

    @Override // h9.k
    public final Object invoke(Object obj) {
        float fR;
        float f10;
        h9.n nVar;
        float f11;
        long j5;
        a2.g gVar = (a2.g) obj;
        t1 t1Var = t1.f2165a;
        i2 i2Var = this.f2116a;
        float[] fArr = i2Var.f1927f;
        float fB = i2Var.b();
        float fL = gVar.L(i2Var.f1930i.f());
        float fJ = gVar.J(0);
        float fL2 = gVar.L(i2Var.f1931j.f());
        long jA = n3.r.a(0.0f, x1.b.e(gVar.c0()));
        long jA2 = n3.r.a(x1.e.d(gVar.g()), x1.b.e(gVar.c0()));
        float fR2 = gVar.R(fL);
        long jA3 = n3.r.a(((x1.b.d(jA2) - x1.b.d(jA)) * fB) + x1.b.d(jA), x1.b.e(gVar.c0()));
        long jA4 = n3.r.a(((x1.b.d(jA2) - x1.b.d(jA)) * 0.0f) + x1.b.d(jA), x1.b.e(gVar.c0()));
        float f12 = 2;
        float f13 = fR2 / f12;
        float fR3 = gVar.R(this.f2122g);
        float f14 = this.f2121f;
        if (Float.compare(f14, 0) > 0) {
            gVar.R(fJ);
            gVar.R(f14);
            fR = gVar.R(f14) + (gVar.R(fL2) / f12);
        } else {
            fR = 0.0f;
        }
        float fD = x1.b.d(jA3);
        float fD2 = (x1.b.d(jA2) - fR) - f13;
        h9.n nVar2 = this.f2123h;
        if (fD < fD2) {
            float fD3 = x1.b.d(jA3) + fR;
            float fD4 = x1.b.d(jA2);
            f10 = fR2;
            nVar = nVar2;
            f11 = 0.0f;
            t1.d(gVar, n3.r.a(fD3, 0.0f), n3.l.h(fD4 - fD3, fR2), this.f2117b, fR3, f13);
            if (nVar != null) {
                fR3 = fR3;
                f13 = f13;
                nVar.invoke(gVar, new x1.b(n3.r.a(fD4 - f13, x1.b.e(gVar.c0()))));
            }
        } else {
            f10 = fR2;
            nVar = nVar2;
            f11 = 0.0f;
        }
        fR3 = fR3;
        f13 = f13;
        float fD5 = (x1.b.d(jA3) - fR) - f11;
        if (fD5 > f13) {
            t1.d(gVar, n3.r.a(0.0f, 0.0f), n3.l.h(fD5, f10), this.f2118c, f13, fR3);
        }
        long jA5 = n3.r.a(x1.b.d(jA) + f13, x1.b.e(jA));
        long jA6 = n3.r.a(x1.b.d(jA2) - f13, x1.b.e(jA2));
        x1.b.d(jA4);
        x1.b.d(jA4);
        float fD6 = x1.b.d(jA3) - fR;
        float fD7 = x1.b.d(jA3) + fR;
        int length = fArr.length;
        int i7 = 0;
        int i10 = 0;
        while (i7 < length) {
            float f15 = fArr[i7];
            int i11 = i10 + 1;
            boolean z10 = true;
            float f16 = fD6;
            if (nVar == null || i10 != fArr.length - 1) {
                if (f15 <= fB && f15 >= 0.0f) {
                    z10 = false;
                }
                j5 = jA5;
                long jA7 = n3.r.a(x1.b.d(n3.r.G(f15, jA5, jA6)), x1.b.e(gVar.c0()));
                float fD8 = x1.b.d(jA7);
                if (fD8 < f16 || fD8 > fD7) {
                    this.f2124i.invoke(gVar, new x1.b(jA7), new y1.q(z10 ? this.f2119d : this.f2120e));
                }
            } else {
                j5 = jA5;
            }
            i7++;
            i10 = i11;
            fD6 = f16;
            jA5 = j5;
        }
        return t8.z.f12851a;
    }
}
