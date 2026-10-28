package ra;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b1 extends xa.i implements xa.u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11840c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f11841d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c1 f11842e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f11843f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f11844g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public d1 f11845h;

    public static b1 e() {
        b1 b1Var = new b1();
        b1Var.f11842e = c1.ERROR;
        b1Var.f11845h = d1.LANGUAGE_VERSION;
        return b1Var;
    }

    @Override // xa.i
    public final xa.a a() {
        e1 e1VarD = d();
        e1VarD.isInitialized();
        return e1VarD;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // xa.i
    public final xa.i b(xa.e eVar, xa.g gVar) throws Throwable {
        e1 e1Var = null;
        try {
            try {
                e1.f11915l.getClass();
                f(new e1(eVar));
                return this;
            } catch (xa.q e7) {
                e1 e1Var2 = (e1) e7.f14823a;
                try {
                    throw e7;
                } catch (Throwable th) {
                    th = th;
                    e1Var = e1Var2;
                    if (e1Var != null) {
                        f(e1Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (e1Var != null) {
                f(e1Var);
            }
            throw th;
        }
    }

    @Override // xa.i
    public final /* bridge */ /* synthetic */ xa.i c(xa.n nVar) {
        f((e1) nVar);
        return this;
    }

    public final Object clone() {
        b1 b1VarE = e();
        b1VarE.f(d());
        return b1VarE;
    }

    public final e1 d() {
        e1 e1Var = new e1(this);
        int i7 = this.f11839b;
        int i10 = (i7 & 1) != 1 ? 0 : 1;
        e1Var.f11918c = this.f11840c;
        if ((i7 & 2) == 2) {
            i10 |= 2;
        }
        e1Var.f11919d = this.f11841d;
        if ((i7 & 4) == 4) {
            i10 |= 4;
        }
        e1Var.f11920e = this.f11842e;
        if ((i7 & 8) == 8) {
            i10 |= 8;
        }
        e1Var.f11921f = this.f11843f;
        if ((i7 & 16) == 16) {
            i10 |= 16;
        }
        e1Var.f11922g = this.f11844g;
        if ((i7 & 32) == 32) {
            i10 |= 32;
        }
        e1Var.f11923h = this.f11845h;
        e1Var.f11917b = i10;
        return e1Var;
    }

    public final void f(e1 e1Var) {
        if (e1Var == e1.k) {
            return;
        }
        int i7 = e1Var.f11917b;
        if ((i7 & 1) == 1) {
            int i10 = e1Var.f11918c;
            this.f11839b = 1 | this.f11839b;
            this.f11840c = i10;
        }
        if ((i7 & 2) == 2) {
            int i11 = e1Var.f11919d;
            this.f11839b = 2 | this.f11839b;
            this.f11841d = i11;
        }
        if ((i7 & 4) == 4) {
            c1 c1Var = e1Var.f11920e;
            c1Var.getClass();
            this.f11839b = 4 | this.f11839b;
            this.f11842e = c1Var;
        }
        int i12 = e1Var.f11917b;
        if ((i12 & 8) == 8) {
            int i13 = e1Var.f11921f;
            this.f11839b = 8 | this.f11839b;
            this.f11843f = i13;
        }
        if ((i12 & 16) == 16) {
            int i14 = e1Var.f11922g;
            this.f11839b = 16 | this.f11839b;
            this.f11844g = i14;
        }
        if ((i12 & 32) == 32) {
            d1 d1Var = e1Var.f11923h;
            d1Var.getClass();
            this.f11839b = 32 | this.f11839b;
            this.f11845h = d1Var;
        }
        this.f14792a = this.f14792a.d(e1Var.f11916a);
    }
}
