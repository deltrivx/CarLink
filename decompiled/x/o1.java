package x;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class o1 implements z.n1 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final u0.k f14444i = new u0.k(18, new g0.g(14), new n1(0));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f1.h1 f14445a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f14449e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f1.f0 f14451g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f1.f0 f14452h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f1.h1 f14446b = new f1.h1(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b0.k f14447c = new b0.k();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f1.h1 f14448d = new f1.h1(Integer.MAX_VALUE);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final z.j f14450f = new z.j(new s0.d(8, this));

    public o1(int i7) {
        this.f14445a = new f1.h1(i7);
        final int i10 = 0;
        this.f14451g = f1.b.o(new h9.a(this) { // from class: x.m1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o1 f14430b;

            {
                this.f14430b = this;
            }

            @Override // h9.a
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        o1 o1Var = this.f14430b;
                        return Boolean.valueOf(o1Var.f14445a.f() < o1Var.f14448d.f());
                    default:
                        return Boolean.valueOf(this.f14430b.f14445a.f() > 0);
                }
            }
        });
        final int i11 = 1;
        this.f14452h = f1.b.o(new h9.a(this) { // from class: x.m1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o1 f14430b;

            {
                this.f14430b = this;
            }

            @Override // h9.a
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        o1 o1Var = this.f14430b;
                        return Boolean.valueOf(o1Var.f14445a.f() < o1Var.f14448d.f());
                    default:
                        return Boolean.valueOf(this.f14430b.f14445a.f() > 0);
                }
            }
        });
    }

    @Override // z.n1
    public final boolean a() {
        return this.f14450f.a();
    }

    @Override // z.n1
    public final boolean b() {
        return ((Boolean) this.f14452h.getValue()).booleanValue();
    }

    @Override // z.n1
    public final Object c(v0 v0Var, h9.n nVar, a9.c cVar) {
        Object objC = this.f14450f.c(v0Var, nVar, cVar);
        return objC == z8.a.f15774a ? objC : t8.z.f12851a;
    }

    @Override // z.n1
    public final boolean d() {
        return ((Boolean) this.f14451g.getValue()).booleanValue();
    }

    @Override // z.n1
    public final float e(float f10) {
        return this.f14450f.e(f10);
    }
}
