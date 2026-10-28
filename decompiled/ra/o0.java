package ra;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class o0 extends xa.i implements xa.u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p0 f12113c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public s0 f12114d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12115e;

    public static o0 e() {
        o0 o0Var = new o0();
        o0Var.f12113c = p0.INV;
        o0Var.f12114d = s0.f12166t;
        return o0Var;
    }

    @Override // xa.i
    public final xa.a a() {
        q0 q0VarD = d();
        if (q0VarD.isInitialized()) {
            return q0VarD;
        }
        throw new cc.s();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // xa.i
    public final xa.i b(xa.e eVar, xa.g gVar) throws Throwable {
        q0 q0Var = null;
        try {
            try {
                q0.f12134i.getClass();
                f(new q0(eVar, gVar));
                return this;
            } catch (xa.q e7) {
                q0 q0Var2 = (q0) e7.f14823a;
                try {
                    throw e7;
                } catch (Throwable th) {
                    th = th;
                    q0Var = q0Var2;
                    if (q0Var != null) {
                        f(q0Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (q0Var != null) {
                f(q0Var);
            }
            throw th;
        }
    }

    @Override // xa.i
    public final /* bridge */ /* synthetic */ xa.i c(xa.n nVar) {
        f((q0) nVar);
        return this;
    }

    public final Object clone() {
        o0 o0VarE = e();
        o0VarE.f(d());
        return o0VarE;
    }

    public final q0 d() {
        q0 q0Var = new q0(this);
        int i7 = this.f12112b;
        int i10 = (i7 & 1) != 1 ? 0 : 1;
        q0Var.f12137c = this.f12113c;
        if ((i7 & 2) == 2) {
            i10 |= 2;
        }
        q0Var.f12138d = this.f12114d;
        if ((i7 & 4) == 4) {
            i10 |= 4;
        }
        q0Var.f12139e = this.f12115e;
        q0Var.f12136b = i10;
        return q0Var;
    }

    public final void f(q0 q0Var) {
        s0 s0Var;
        if (q0Var == q0.f12133h) {
            return;
        }
        if ((q0Var.f12136b & 1) == 1) {
            p0 p0Var = q0Var.f12137c;
            p0Var.getClass();
            this.f12112b = 1 | this.f12112b;
            this.f12113c = p0Var;
        }
        if ((q0Var.f12136b & 2) == 2) {
            s0 s0Var2 = q0Var.f12138d;
            if ((this.f12112b & 2) != 2 || (s0Var = this.f12114d) == s0.f12166t) {
                this.f12114d = s0Var2;
            } else {
                r0 r0VarO = s0.o(s0Var);
                r0VarO.g(s0Var2);
                this.f12114d = r0VarO.e();
            }
            this.f12112b |= 2;
        }
        if ((q0Var.f12136b & 4) == 4) {
            int i7 = q0Var.f12139e;
            this.f12112b = 4 | this.f12112b;
            this.f12115e = i7;
        }
        this.f14792a = this.f14792a.d(q0Var.f12135a);
    }
}
