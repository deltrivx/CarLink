package o2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class k implements l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l0 f9363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Enum f9364c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Enum f9365d;

    public /* synthetic */ k(l0 l0Var, Enum r8, Enum r10, int i7) {
        this.f9362a = i7;
        this.f9363b = l0Var;
        this.f9364c = r8;
        this.f9365d = r10;
    }

    @Override // o2.l0
    public final int H(int i7) {
        switch (this.f9362a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f9363b.H(i7);
    }

    @Override // o2.l0
    public final int c(int i7) {
        switch (this.f9362a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f9363b.c(i7);
    }

    @Override // o2.l0
    public final int m(int i7) {
        switch (this.f9362a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f9363b.m(i7);
    }

    @Override // o2.l0
    public final int r(int i7) {
        switch (this.f9362a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f9363b.r(i7);
    }

    @Override // o2.l0
    public final v0 u(long j5) {
        switch (this.f9362a) {
            case 0:
                s sVar = (s) this.f9364c;
                t tVar = (t) this.f9365d;
                t tVar2 = t.f9424a;
                s sVar2 = s.f9420b;
                l0 l0Var = this.f9363b;
                if (tVar == tVar2) {
                    return new l(sVar == sVar2 ? l0Var.r(n3.a.g(j5)) : l0Var.m(n3.a.g(j5)), n3.a.c(j5) ? n3.a.g(j5) : 32767, 0);
                }
                return new l(n3.a.d(j5) ? n3.a.h(j5) : 32767, sVar == sVar2 ? l0Var.c(n3.a.h(j5)) : l0Var.H(n3.a.h(j5)), 0);
            case 1:
                p0 p0Var = (p0) this.f9364c;
                q0 q0Var = (q0) this.f9365d;
                q0 q0Var2 = q0.f9415a;
                p0 p0Var2 = p0.f9406b;
                l0 l0Var2 = this.f9363b;
                if (q0Var == q0Var2) {
                    return new l(p0Var == p0Var2 ? l0Var2.r(n3.a.g(j5)) : l0Var2.m(n3.a.g(j5)), n3.a.c(j5) ? n3.a.g(j5) : 32767, 1);
                }
                return new l(n3.a.d(j5) ? n3.a.h(j5) : 32767, p0Var == p0Var2 ? l0Var2.c(n3.a.h(j5)) : l0Var2.H(n3.a.h(j5)), 1);
            default:
                q2.j1 j1Var = (q2.j1) this.f9364c;
                q2.k1 k1Var = (q2.k1) this.f9365d;
                q2.k1 k1Var2 = q2.k1.f10726a;
                q2.j1 j1Var2 = q2.j1.f10723b;
                l0 l0Var3 = this.f9363b;
                if (k1Var == k1Var2) {
                    return new l(j1Var == j1Var2 ? l0Var3.r(n3.a.g(j5)) : l0Var3.m(n3.a.g(j5)), n3.a.c(j5) ? n3.a.g(j5) : 32767, 2);
                }
                return new l(n3.a.d(j5) ? n3.a.h(j5) : 32767, j1Var == j1Var2 ? l0Var3.c(n3.a.h(j5)) : l0Var3.H(n3.a.h(j5)), 2);
        }
    }

    @Override // o2.l0
    public final Object w() {
        switch (this.f9362a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f9363b.w();
    }
}
