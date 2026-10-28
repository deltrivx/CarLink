package l0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class q1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final u0.k f7802g = o1.k.b(new g0.g(7), new t0(7));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f1.g1 f7803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f1.g1 f7804b = new f1.g1(0.0f);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f1.h1 f7805c = new f1.h1(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public x1.c f7806d = x1.c.f14522e;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f7807e = b3.q0.f1428b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f1.k1 f7808f;

    public q1(z.x0 x0Var, float f10) {
        this.f7803a = new f1.g1(f10);
        this.f7808f = new f1.k1(x0Var, f1.w0.f5187f);
    }

    public final void a(z.x0 x0Var, x1.c cVar, int i7, int i10) {
        float f10;
        float f11 = i10 - i7;
        this.f7804b.g(f11);
        float f12 = cVar.f14523a;
        float f13 = cVar.f14524b;
        x1.c cVar2 = this.f7806d;
        float f14 = cVar2.f14523a;
        f1.g1 g1Var = this.f7803a;
        if (f12 != f14 || f13 != cVar2.f14524b) {
            boolean z10 = x0Var == z.x0.f15591a;
            if (z10) {
                f12 = f13;
            }
            float f15 = z10 ? cVar.f14526d : cVar.f14525c;
            float f16 = g1Var.f();
            float f17 = i7;
            float f18 = f16 + f17;
            if (f15 <= f18 && (f12 >= f16 || f15 - f12 <= f17)) {
                f10 = (f12 >= f16 || f15 - f12 > f17) ? 0.0f : f12 - f16;
            } else {
                f10 = f15 - f18;
            }
            g1Var.g(g1Var.f() + f10);
            this.f7806d = cVar;
        }
        g1Var.g(n3.r.l(g1Var.f(), 0.0f, f11));
        this.f7805c.g(i7);
    }
}
