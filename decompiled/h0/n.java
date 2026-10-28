package h0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class n extends r1.o implements p2.d, q2.x {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final l f6339r = new l();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public o f6340o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public k f6341p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public z.x0 f6342q;

    @Override // p2.e
    public final /* synthetic */ Object A(p2.f fVar) {
        return ob.a.a(this, fVar);
    }

    public final boolean A0(j jVar, int i7) {
        if (i7 == 5 || i7 == 6) {
            if (this.f6342q == z.x0.f15592b) {
                return false;
            }
        } else if (i7 == 3 || i7 == 4) {
            if (this.f6342q == z.x0.f15591a) {
                return false;
            }
        } else if (i7 != 1 && i7 != 2) {
            throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction");
        }
        if (B0(i7)) {
            if (jVar.f6330b >= this.f6340o.a() - 1) {
                return false;
            }
        } else if (jVar.f6329a <= 0) {
            return false;
        }
        return true;
    }

    public final boolean B0(int i7) {
        if (i7 == 1) {
            return false;
        }
        if (i7 == 2) {
            return true;
        }
        if (i7 == 5) {
            return false;
        }
        if (i7 == 6) {
            return true;
        }
        if (i7 == 3) {
            int iOrdinal = q2.f.v(this).f10690y.ordinal();
            if (iOrdinal == 0) {
                return false;
            }
            if (iOrdinal == 1) {
                return true;
            }
            throw new cc.s();
        }
        if (i7 != 4) {
            throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction");
        }
        int iOrdinal2 = q2.f.v(this).f10690y.ordinal();
        if (iOrdinal2 == 0) {
            return true;
        }
        if (iOrdinal2 == 1) {
            return false;
        }
        throw new cc.s();
    }

    @Override // p2.d
    public final n3.l N() {
        p2.g gVar = new p2.g(o2.f.f9325a);
        gVar.f10125c.setValue(this);
        return gVar;
    }

    @Override // q2.x
    public final o2.n0 b(o2.o0 o0Var, o2.l0 l0Var, long j5) {
        o2.v0 v0VarU = l0Var.u(j5);
        return o0Var.i(v0VarU.f9435a, v0VarU.f9436b, u8.x.f13123a, new d0.i(v0VarU, 5));
    }

    @Override // q2.x
    public final /* synthetic */ int c(q2.p0 p0Var, o2.l0 l0Var, int i7) {
        return ob.a.f(this, p0Var, l0Var, i7);
    }

    @Override // q2.x
    public final /* synthetic */ int d(q2.p0 p0Var, o2.l0 l0Var, int i7) {
        return ob.a.e(this, p0Var, l0Var, i7);
    }

    @Override // q2.x
    public final /* synthetic */ int e(q2.p0 p0Var, o2.l0 l0Var, int i7) {
        return ob.a.c(this, p0Var, l0Var, i7);
    }

    @Override // q2.x
    public final /* synthetic */ int f(q2.p0 p0Var, o2.l0 l0Var, int i7) {
        return ob.a.d(this, p0Var, l0Var, i7);
    }
}
