package o2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class u0 implements n3.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f9432a;

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(u0 u0Var, v0 v0Var) {
        u0Var.getClass();
        if (v0Var instanceof q2.a1) {
            ((q2.a1) v0Var).z(u0Var.f9432a);
        }
    }

    public static void f(u0 u0Var, v0 v0Var, int i7, int i10) {
        u0Var.getClass();
        b(u0Var, v0Var);
        v0Var.T(n3.j.c((((long) i10) & 4294967295L) | (((long) i7) << 32), v0Var.f9439e), 0.0f, null);
    }

    public static void h(u0 u0Var, v0 v0Var, long j5) {
        u0Var.getClass();
        b(u0Var, v0Var);
        v0Var.T(n3.j.c(j5, v0Var.f9439e), 0.0f, null);
    }

    public static void j(u0 u0Var, v0 v0Var, int i7, int i10) {
        long j5 = (((long) i7) << 32) | (((long) i10) & 4294967295L);
        if (u0Var.d() == n3.o.f8749a || u0Var.e() == 0) {
            b(u0Var, v0Var);
            v0Var.T(n3.j.c(j5, v0Var.f9439e), 0.0f, null);
        } else {
            int iE = (u0Var.e() - v0Var.f9435a) - ((int) (j5 >> 32));
            b(u0Var, v0Var);
            v0Var.T(n3.j.c((((long) iE) << 32) | (((long) ((int) (j5 & 4294967295L))) & 4294967295L), v0Var.f9439e), 0.0f, null);
        }
    }

    public static void k(u0 u0Var, v0 v0Var, int i7, int i10) {
        int i11 = x0.f9445b;
        w0 w0Var = w0.f9440b;
        long j5 = (((long) i7) << 32) | (((long) i10) & 4294967295L);
        if (u0Var.d() == n3.o.f8749a || u0Var.e() == 0) {
            b(u0Var, v0Var);
            v0Var.T(n3.j.c(j5, v0Var.f9439e), 0.0f, w0Var);
        } else {
            int iE = (u0Var.e() - v0Var.f9435a) - ((int) (j5 >> 32));
            b(u0Var, v0Var);
            v0Var.T(n3.j.c((((long) iE) << 32) | (((long) ((int) (j5 & 4294967295L))) & 4294967295L), v0Var.f9439e), 0.0f, w0Var);
        }
    }

    public static void l(u0 u0Var, v0 v0Var, h9.k kVar) {
        u0Var.getClass();
        long j5 = 0;
        b(u0Var, v0Var);
        v0Var.T(n3.j.c((j5 & 4294967295L) | (j5 << 32), v0Var.f9439e), 0.0f, kVar);
    }

    public static void m(u0 u0Var, v0 v0Var, long j5) {
        int i7 = x0.f9445b;
        w0 w0Var = w0.f9440b;
        u0Var.getClass();
        b(u0Var, v0Var);
        v0Var.T(n3.j.c(j5, v0Var.f9439e), 0.0f, w0Var);
    }

    @Override // n3.c
    public final long F(float f10) {
        return a2.f.o(L(f10), this);
    }

    @Override // n3.c
    public final float J(int i7) {
        return i7 / a();
    }

    @Override // n3.c
    public final float L(float f10) {
        return f10 / a();
    }

    @Override // n3.c
    public final float R(float f10) {
        return a() * f10;
    }

    @Override // n3.c
    public final /* synthetic */ int a0(float f10) {
        return a2.f.j(f10, this);
    }

    public float c(o oVar) {
        return Float.NaN;
    }

    public abstract n3.o d();

    public abstract int e();

    @Override // n3.c
    public final /* synthetic */ long e0(long j5) {
        return a2.f.n(j5, this);
    }

    @Override // n3.c
    public final /* synthetic */ float h0(long j5) {
        return a2.f.m(j5, this);
    }

    @Override // n3.c
    public final /* synthetic */ long o(long j5) {
        return a2.f.l(j5, this);
    }

    @Override // n3.c
    public final /* synthetic */ float s(long j5) {
        return a2.f.k(j5, this);
    }
}
