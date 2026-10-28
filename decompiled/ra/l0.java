package ra;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class l0 extends xa.n {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final l0 f12074h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f12075i = new a(15);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xa.d f12076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12078c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12079d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public k0 f12080e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public byte f12081f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f12082g;

    static {
        l0 l0Var = new l0();
        f12074h = l0Var;
        l0Var.f12078c = -1;
        l0Var.f12079d = 0;
        l0Var.f12080e = k0.PACKAGE;
    }

    public l0() {
        this.f12081f = (byte) -1;
        this.f12082g = -1;
        this.f12076a = xa.d.f14765a;
    }

    public l0(j0 j0Var) {
        this.f12081f = (byte) -1;
        this.f12082g = -1;
        this.f12076a = j0Var.f14792a;
    }

    public l0(xa.e eVar) {
        this.f12081f = (byte) -1;
        this.f12082g = -1;
        this.f12078c = -1;
        boolean z10 = false;
        this.f12079d = 0;
        k0 k0Var = k0.PACKAGE;
        this.f12080e = k0Var;
        xa.c cVar = new xa.c();
        d3.e eVarS = d3.e.s(cVar, 1);
        while (!z10) {
            try {
                try {
                    int iN = eVar.n();
                    if (iN != 0) {
                        if (iN == 8) {
                            this.f12077b |= 1;
                            this.f12078c = eVar.k();
                        } else if (iN == 16) {
                            this.f12077b |= 2;
                            this.f12079d = eVar.k();
                        } else if (iN == 24) {
                            int iK = eVar.k();
                            k0 k0Var2 = iK != 0 ? iK != 1 ? iK != 2 ? null : k0.LOCAL : k0Var : k0.CLASS;
                            if (k0Var2 == null) {
                                eVarS.J(iN);
                                eVarS.J(iK);
                            } else {
                                this.f12077b |= 4;
                                this.f12080e = k0Var2;
                            }
                        } else if (!eVar.q(iN, eVarS)) {
                        }
                    }
                    z10 = true;
                } catch (xa.q e7) {
                    e7.f14823a = this;
                    throw e7;
                } catch (IOException e10) {
                    xa.q qVar = new xa.q(e10.getMessage());
                    qVar.f14823a = this;
                    throw qVar;
                }
            } catch (Throwable th) {
                try {
                    eVarS.k();
                } catch (IOException unused) {
                } finally {
                    this.f12076a = cVar.c();
                }
                throw th;
            }
        }
        try {
            eVarS.k();
        } catch (IOException unused2) {
        } finally {
            this.f12076a = cVar.c();
        }
    }

    @Override // xa.a
    public final int a() {
        int i7 = this.f12082g;
        if (i7 != -1) {
            return i7;
        }
        int iD = (this.f12077b & 1) == 1 ? d3.e.d(1, this.f12078c) : 0;
        if ((this.f12077b & 2) == 2) {
            iD += d3.e.d(2, this.f12079d);
        }
        if ((this.f12077b & 4) == 4) {
            iD += d3.e.c(3, this.f12080e.f12065a);
        }
        int size = this.f12076a.size() + iD;
        this.f12082g = size;
        return size;
    }

    @Override // xa.a
    public final xa.i b() {
        return j0.e();
    }

    @Override // xa.a
    public final xa.i c() {
        j0 j0VarE = j0.e();
        j0VarE.f(this);
        return j0VarE;
    }

    @Override // xa.a
    public final void d(d3.e eVar) throws IOException {
        a();
        if ((this.f12077b & 1) == 1) {
            eVar.A(1, this.f12078c);
        }
        if ((this.f12077b & 2) == 2) {
            eVar.A(2, this.f12079d);
        }
        if ((this.f12077b & 4) == 4) {
            eVar.z(3, this.f12080e.f12065a);
        }
        eVar.F(this.f12076a);
    }

    @Override // xa.u
    public final boolean isInitialized() {
        byte b10 = this.f12081f;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if ((this.f12077b & 2) == 2) {
            this.f12081f = (byte) 1;
            return true;
        }
        this.f12081f = (byte) 0;
        return false;
    }
}
