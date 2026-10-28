package ra;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e1 extends xa.n {
    public static final e1 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f11915l = new a(23);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xa.d f11916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11918c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f11919d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c1 f11920e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f11921f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f11922g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public d1 f11923h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public byte f11924i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f11925j;

    static {
        e1 e1Var = new e1();
        k = e1Var;
        e1Var.f11918c = 0;
        e1Var.f11919d = 0;
        e1Var.f11920e = c1.ERROR;
        e1Var.f11921f = 0;
        e1Var.f11922g = 0;
        e1Var.f11923h = d1.LANGUAGE_VERSION;
    }

    public e1() {
        this.f11924i = (byte) -1;
        this.f11925j = -1;
        this.f11916a = xa.d.f14765a;
    }

    public e1(b1 b1Var) {
        this.f11924i = (byte) -1;
        this.f11925j = -1;
        this.f11916a = b1Var.f14792a;
    }

    public e1(xa.e eVar) {
        this.f11924i = (byte) -1;
        this.f11925j = -1;
        boolean z10 = false;
        this.f11918c = 0;
        this.f11919d = 0;
        c1 c1Var = c1.ERROR;
        this.f11920e = c1Var;
        this.f11921f = 0;
        this.f11922g = 0;
        d1 d1Var = d1.LANGUAGE_VERSION;
        this.f11923h = d1Var;
        xa.c cVar = new xa.c();
        d3.e eVarS = d3.e.s(cVar, 1);
        while (!z10) {
            try {
                try {
                    int iN = eVar.n();
                    if (iN != 0) {
                        if (iN == 8) {
                            this.f11917b |= 1;
                            this.f11918c = eVar.k();
                        } else if (iN != 16) {
                            d1 d1Var2 = null;
                            c1 c1Var2 = null;
                            if (iN == 24) {
                                int iK = eVar.k();
                                if (iK == 0) {
                                    c1Var2 = c1.WARNING;
                                } else if (iK == 1) {
                                    c1Var2 = c1Var;
                                } else if (iK == 2) {
                                    c1Var2 = c1.HIDDEN;
                                }
                                if (c1Var2 == null) {
                                    eVarS.J(iN);
                                    eVarS.J(iK);
                                } else {
                                    this.f11917b |= 4;
                                    this.f11920e = c1Var2;
                                }
                            } else if (iN == 32) {
                                this.f11917b |= 8;
                                this.f11921f = eVar.k();
                            } else if (iN == 40) {
                                this.f11917b |= 16;
                                this.f11922g = eVar.k();
                            } else if (iN == 48) {
                                int iK2 = eVar.k();
                                if (iK2 == 0) {
                                    d1Var2 = d1Var;
                                } else if (iK2 == 1) {
                                    d1Var2 = d1.COMPILER_VERSION;
                                } else if (iK2 == 2) {
                                    d1Var2 = d1.API_VERSION;
                                }
                                if (d1Var2 == null) {
                                    eVarS.J(iN);
                                    eVarS.J(iK2);
                                } else {
                                    this.f11917b |= 32;
                                    this.f11923h = d1Var2;
                                }
                            } else if (!eVar.q(iN, eVarS)) {
                            }
                        } else {
                            this.f11917b |= 2;
                            this.f11919d = eVar.k();
                        }
                    }
                    z10 = true;
                } catch (Throwable th) {
                    try {
                        eVarS.k();
                    } catch (IOException unused) {
                    } finally {
                        this.f11916a = cVar.c();
                    }
                    throw th;
                }
            } catch (xa.q e7) {
                e7.f14823a = this;
                throw e7;
            } catch (IOException e10) {
                xa.q qVar = new xa.q(e10.getMessage());
                qVar.f14823a = this;
                throw qVar;
            }
        }
        try {
            eVarS.k();
        } catch (IOException unused2) {
        } finally {
            this.f11916a = cVar.c();
        }
    }

    @Override // xa.a
    public final int a() {
        int i7 = this.f11925j;
        if (i7 != -1) {
            return i7;
        }
        int iD = (this.f11917b & 1) == 1 ? d3.e.d(1, this.f11918c) : 0;
        if ((this.f11917b & 2) == 2) {
            iD += d3.e.d(2, this.f11919d);
        }
        if ((this.f11917b & 4) == 4) {
            iD += d3.e.c(3, this.f11920e.f11863a);
        }
        if ((this.f11917b & 8) == 8) {
            iD += d3.e.d(4, this.f11921f);
        }
        if ((this.f11917b & 16) == 16) {
            iD += d3.e.d(5, this.f11922g);
        }
        if ((this.f11917b & 32) == 32) {
            iD += d3.e.c(6, this.f11923h.f11888a);
        }
        int size = this.f11916a.size() + iD;
        this.f11925j = size;
        return size;
    }

    @Override // xa.a
    public final xa.i b() {
        return b1.e();
    }

    @Override // xa.a
    public final xa.i c() {
        b1 b1VarE = b1.e();
        b1VarE.f(this);
        return b1VarE;
    }

    @Override // xa.a
    public final void d(d3.e eVar) throws IOException {
        a();
        if ((this.f11917b & 1) == 1) {
            eVar.A(1, this.f11918c);
        }
        if ((this.f11917b & 2) == 2) {
            eVar.A(2, this.f11919d);
        }
        if ((this.f11917b & 4) == 4) {
            eVar.z(3, this.f11920e.f11863a);
        }
        if ((this.f11917b & 8) == 8) {
            eVar.A(4, this.f11921f);
        }
        if ((this.f11917b & 16) == 16) {
            eVar.A(5, this.f11922g);
        }
        if ((this.f11917b & 32) == 32) {
            eVar.z(6, this.f11923h.f11888a);
        }
        eVar.F(this.f11916a);
    }

    @Override // xa.u
    public final boolean isInitialized() {
        if (this.f11924i == 1) {
            return true;
        }
        this.f11924i = (byte) 1;
        return true;
    }
}
