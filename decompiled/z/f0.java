package z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class f0 extends q2.m implements q2.v1 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public x0 f15367q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public h9.k f15368r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f15369s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public b0.k f15370t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ec.h f15371u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public b0.b f15372v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f15373w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f15374x = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public k2.m0 f15375y;

    public f0(h9.k kVar, boolean z10, b0.k kVar2, x0 x0Var) {
        this.f15367q = x0Var;
        this.f15368r = kVar;
        this.f15369s = z10;
        this.f15370t = kVar2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object D0(f0 f0Var, a9.c cVar) throws Throwable {
        b0 b0Var;
        if (cVar instanceof b0) {
            b0Var = (b0) cVar;
            int i7 = b0Var.f15311c;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                b0Var.f15311c = i7 - Integer.MIN_VALUE;
            } else {
                b0Var = new b0(f0Var, cVar);
            }
        } else {
            b0Var = new b0(f0Var, cVar);
        }
        Object obj = b0Var.f15309a;
        int i10 = b0Var.f15311c;
        if (i10 == 0) {
            t8.a.e(obj);
            b0.b bVar = f0Var.f15372v;
            if (bVar != null) {
                b0.k kVar = f0Var.f15370t;
                if (kVar != null) {
                    b0.a aVar = new b0.a(bVar);
                    b0Var.f15311c = 1;
                    Object objA = kVar.a(aVar, b0Var);
                    z8.a aVar2 = z8.a.f15774a;
                    if (objA == aVar2) {
                        return aVar2;
                    }
                }
            }
            f0Var.J0(0L);
            return t8.z.f12851a;
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t8.a.e(obj);
        f0Var.f15372v = null;
        f0Var.J0(0L);
        return t8.z.f12851a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object E0(f0 f0Var, m mVar, a9.c cVar) {
        c0 c0Var;
        b0.k kVar;
        b0.b bVar;
        m mVar2;
        b0.b bVar2;
        if (cVar instanceof c0) {
            c0Var = (c0) cVar;
            int i7 = c0Var.f15330e;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                c0Var.f15330e = i7 - Integer.MIN_VALUE;
            } else {
                c0Var = new c0(f0Var, cVar);
            }
        } else {
            c0Var = new c0(f0Var, cVar);
        }
        Object obj = c0Var.f15328c;
        int i10 = c0Var.f15330e;
        z8.a aVar = z8.a.f15774a;
        if (i10 == 0) {
            t8.a.e(obj);
            b0.b bVar3 = f0Var.f15372v;
            if (bVar3 != null && (kVar = f0Var.f15370t) != null) {
                b0.a aVar2 = new b0.a(bVar3);
                c0Var.f15326a = mVar;
                c0Var.f15330e = 1;
                if (kVar.a(aVar2, c0Var) != aVar) {
                }
                return aVar;
            }
            f0Var.f15372v = bVar;
            f0Var.I0(mVar.f15432a);
            return t8.z.f12851a;
        }
        if (i10 == 1) {
            mVar = c0Var.f15326a;
            t8.a.e(obj);
        } else {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bVar2 = c0Var.f15327b;
            mVar2 = c0Var.f15326a;
            t8.a.e(obj);
        }
        bVar = bVar2;
        mVar = mVar2;
        f0Var.f15372v = bVar;
        f0Var.I0(mVar.f15432a);
        return t8.z.f12851a;
        bVar = new b0.b();
        b0.k kVar2 = f0Var.f15370t;
        if (kVar2 != null) {
            c0Var.f15326a = mVar;
            c0Var.f15327b = bVar;
            c0Var.f15330e = 2;
            if (kVar2.a(bVar, c0Var) != aVar) {
                mVar2 = mVar;
                bVar2 = bVar;
                bVar = bVar2;
                mVar = mVar2;
            }
            return aVar;
        }
        f0Var.f15372v = bVar;
        f0Var.I0(mVar.f15432a);
        return t8.z.f12851a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object F0(f0 f0Var, n nVar, a9.c cVar) throws Throwable {
        d0 d0Var;
        if (cVar instanceof d0) {
            d0Var = (d0) cVar;
            int i7 = d0Var.f15342d;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                d0Var.f15342d = i7 - Integer.MIN_VALUE;
            } else {
                d0Var = new d0(f0Var, cVar);
            }
        } else {
            d0Var = new d0(f0Var, cVar);
        }
        Object obj = d0Var.f15340b;
        int i10 = d0Var.f15342d;
        if (i10 == 0) {
            t8.a.e(obj);
            b0.b bVar = f0Var.f15372v;
            if (bVar != null) {
                b0.k kVar = f0Var.f15370t;
                if (kVar != null) {
                    b0.c cVar2 = new b0.c(bVar);
                    d0Var.f15339a = nVar;
                    d0Var.f15342d = 1;
                    Object objA = kVar.a(cVar2, d0Var);
                    z8.a aVar = z8.a.f15774a;
                    if (objA == aVar) {
                        return aVar;
                    }
                }
            }
            f0Var.J0(nVar.f15435a);
            return t8.z.f12851a;
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        nVar = d0Var.f15339a;
        t8.a.e(obj);
        f0Var.f15372v = null;
        f0Var.J0(nVar.f15435a);
        return t8.z.f12851a;
    }

    public final void G0() {
        b0.b bVar = this.f15372v;
        if (bVar != null) {
            b0.k kVar = this.f15370t;
            if (kVar != null) {
                kVar.b(new b0.a(bVar));
            }
            this.f15372v = null;
        }
    }

    public abstract Object H0(e0 e0Var, e0 e0Var2);

    @Override // q2.v1
    public final /* synthetic */ void I() {
    }

    public abstract void I0(long j5);

    public abstract void J0(long j5);

    public abstract boolean K0();

    public final void L0(h9.k kVar, boolean z10, b0.k kVar2, x0 x0Var, boolean z11) {
        k2.m0 m0Var;
        this.f15368r = kVar;
        boolean z12 = true;
        if (this.f15369s != z10) {
            this.f15369s = z10;
            if (!z10) {
                G0();
                k2.m0 m0Var2 = this.f15375y;
                if (m0Var2 != null) {
                    B0(m0Var2);
                }
                this.f15375y = null;
            }
            z11 = true;
        }
        if (!i9.l.a(this.f15370t, kVar2)) {
            G0();
            this.f15370t = kVar2;
        }
        if (this.f15367q != x0Var) {
            this.f15367q = x0Var;
        } else {
            z12 = z11;
        }
        if (!z12 || (m0Var = this.f15375y) == null) {
            return;
        }
        m0Var.C0();
    }

    @Override // q2.v1
    public final /* synthetic */ boolean d0() {
        return false;
    }

    @Override // q2.v1
    public final void g0() {
        z();
    }

    @Override // q2.v1
    public void l0(k2.n nVar, k2.o oVar, long j5) {
        if (this.f15369s && this.f15375y == null) {
            k2.m0 m0VarA = k2.h0.a(new q7.g(6, this));
            A0(m0VarA);
            this.f15375y = m0VarA;
        }
        k2.m0 m0Var = this.f15375y;
        if (m0Var != null) {
            m0Var.l0(nVar, oVar, j5);
        }
    }

    @Override // q2.v1
    public final long m() {
        return q2.b2.f10596a;
    }

    @Override // r1.o
    public void r0() {
        z();
    }

    @Override // r1.o
    public final void s0() {
        this.f15373w = false;
        G0();
        this.f15374x = 0L;
    }

    @Override // q2.v1
    public final void z() {
        k2.m0 m0Var = this.f15375y;
        if (m0Var != null) {
            m0Var.z();
        }
    }
}
