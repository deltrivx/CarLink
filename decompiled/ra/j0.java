package ra;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class j0 extends xa.i implements xa.u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12034c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12035d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public k0 f12036e;

    public static j0 e() {
        j0 j0Var = new j0();
        j0Var.f12034c = -1;
        j0Var.f12036e = k0.PACKAGE;
        return j0Var;
    }

    @Override // xa.i
    public final xa.a a() {
        l0 l0VarD = d();
        if (l0VarD.isInitialized()) {
            return l0VarD;
        }
        throw new cc.s();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // xa.i
    public final xa.i b(xa.e eVar, xa.g gVar) throws Throwable {
        l0 l0Var = null;
        try {
            try {
                l0.f12075i.getClass();
                f(new l0(eVar));
                return this;
            } catch (xa.q e7) {
                l0 l0Var2 = (l0) e7.f14823a;
                try {
                    throw e7;
                } catch (Throwable th) {
                    th = th;
                    l0Var = l0Var2;
                    if (l0Var != null) {
                        f(l0Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (l0Var != null) {
                f(l0Var);
            }
            throw th;
        }
    }

    @Override // xa.i
    public final /* bridge */ /* synthetic */ xa.i c(xa.n nVar) {
        f((l0) nVar);
        return this;
    }

    public final Object clone() {
        j0 j0VarE = e();
        j0VarE.f(d());
        return j0VarE;
    }

    public final l0 d() {
        l0 l0Var = new l0(this);
        int i7 = this.f12033b;
        int i10 = (i7 & 1) != 1 ? 0 : 1;
        l0Var.f12078c = this.f12034c;
        if ((i7 & 2) == 2) {
            i10 |= 2;
        }
        l0Var.f12079d = this.f12035d;
        if ((i7 & 4) == 4) {
            i10 |= 4;
        }
        l0Var.f12080e = this.f12036e;
        l0Var.f12077b = i10;
        return l0Var;
    }

    public final void f(l0 l0Var) {
        if (l0Var == l0.f12074h) {
            return;
        }
        int i7 = l0Var.f12077b;
        if ((i7 & 1) == 1) {
            int i10 = l0Var.f12078c;
            this.f12033b = 1 | this.f12033b;
            this.f12034c = i10;
        }
        if ((i7 & 2) == 2) {
            int i11 = l0Var.f12079d;
            this.f12033b = 2 | this.f12033b;
            this.f12035d = i11;
        }
        if ((i7 & 4) == 4) {
            k0 k0Var = l0Var.f12080e;
            k0Var.getClass();
            this.f12033b = 4 | this.f12033b;
            this.f12036e = k0Var;
        }
        this.f14792a = this.f14792a.d(l0Var.f12076a);
    }
}
