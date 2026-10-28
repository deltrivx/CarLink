package ra;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class z0 extends xa.j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12301d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12302e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f12303f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public s0 f12304g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f12305h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public s0 f12306i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f12307j;

    @Override // xa.i
    public final xa.a a() {
        a1 a1VarE = e();
        if (a1VarE.isInitialized()) {
            return a1VarE;
        }
        throw new cc.s();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // xa.i
    public final xa.i b(xa.e eVar, xa.g gVar) throws Throwable {
        a1 a1Var = null;
        try {
            try {
                a1.f11823m.getClass();
                f(new a1(eVar, gVar));
                return this;
            } catch (xa.q e7) {
                a1 a1Var2 = (a1) e7.f14823a;
                try {
                    throw e7;
                } catch (Throwable th) {
                    th = th;
                    a1Var = a1Var2;
                    if (a1Var != null) {
                        f(a1Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (a1Var != null) {
                f(a1Var);
            }
            throw th;
        }
    }

    @Override // xa.i
    public final /* bridge */ /* synthetic */ xa.i c(xa.n nVar) {
        f((a1) nVar);
        return this;
    }

    public final Object clone() {
        z0 z0Var = new z0();
        s0 s0Var = s0.f12166t;
        z0Var.f12304g = s0Var;
        z0Var.f12306i = s0Var;
        z0Var.f(e());
        return z0Var;
    }

    public final a1 e() {
        a1 a1Var = new a1(this);
        int i7 = this.f12301d;
        int i10 = (i7 & 1) != 1 ? 0 : 1;
        a1Var.f11826d = this.f12302e;
        if ((i7 & 2) == 2) {
            i10 |= 2;
        }
        a1Var.f11827e = this.f12303f;
        if ((i7 & 4) == 4) {
            i10 |= 4;
        }
        a1Var.f11828f = this.f12304g;
        if ((i7 & 8) == 8) {
            i10 |= 8;
        }
        a1Var.f11829g = this.f12305h;
        if ((i7 & 16) == 16) {
            i10 |= 16;
        }
        a1Var.f11830h = this.f12306i;
        if ((i7 & 32) == 32) {
            i10 |= 32;
        }
        a1Var.f11831i = this.f12307j;
        a1Var.f11825c = i10;
        return a1Var;
    }

    public final void f(a1 a1Var) {
        s0 s0Var;
        s0 s0Var2;
        if (a1Var == a1.f11822l) {
            return;
        }
        int i7 = a1Var.f11825c;
        if ((i7 & 1) == 1) {
            int i10 = a1Var.f11826d;
            this.f12301d = 1 | this.f12301d;
            this.f12302e = i10;
        }
        if ((i7 & 2) == 2) {
            int i11 = a1Var.f11827e;
            this.f12301d = 2 | this.f12301d;
            this.f12303f = i11;
        }
        if ((i7 & 4) == 4) {
            s0 s0Var3 = a1Var.f11828f;
            if ((this.f12301d & 4) != 4 || (s0Var2 = this.f12304g) == s0.f12166t) {
                this.f12304g = s0Var3;
            } else {
                r0 r0VarO = s0.o(s0Var2);
                r0VarO.g(s0Var3);
                this.f12304g = r0VarO.e();
            }
            this.f12301d |= 4;
        }
        int i12 = a1Var.f11825c;
        if ((i12 & 8) == 8) {
            int i13 = a1Var.f11829g;
            this.f12301d = 8 | this.f12301d;
            this.f12305h = i13;
        }
        if ((i12 & 16) == 16) {
            s0 s0Var4 = a1Var.f11830h;
            if ((this.f12301d & 16) != 16 || (s0Var = this.f12306i) == s0.f12166t) {
                this.f12306i = s0Var4;
            } else {
                r0 r0VarO2 = s0.o(s0Var);
                r0VarO2.g(s0Var4);
                this.f12306i = r0VarO2.e();
            }
            this.f12301d |= 16;
        }
        if ((a1Var.f11825c & 32) == 32) {
            int i14 = a1Var.f11831i;
            this.f12301d = 32 | this.f12301d;
            this.f12307j = i14;
        }
        d(a1Var);
        this.f14792a = this.f14792a.d(a1Var.f11824b);
    }
}
