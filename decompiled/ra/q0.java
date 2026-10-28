package ra;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class q0 extends xa.n {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final q0 f12133h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f12134i = new a(18);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xa.d f12135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p0 f12137c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public s0 f12138d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12139e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public byte f12140f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f12141g;

    static {
        q0 q0Var = new q0();
        f12133h = q0Var;
        q0Var.f12137c = p0.INV;
        q0Var.f12138d = s0.f12166t;
        q0Var.f12139e = 0;
    }

    public q0() {
        this.f12140f = (byte) -1;
        this.f12141g = -1;
        this.f12135a = xa.d.f14765a;
    }

    public q0(o0 o0Var) {
        this.f12140f = (byte) -1;
        this.f12141g = -1;
        this.f12135a = o0Var.f14792a;
    }

    public q0(xa.e eVar, xa.g gVar) {
        this.f12140f = (byte) -1;
        this.f12141g = -1;
        p0 p0Var = p0.INV;
        this.f12137c = p0Var;
        this.f12138d = s0.f12166t;
        boolean z10 = false;
        this.f12139e = 0;
        xa.c cVar = new xa.c();
        d3.e eVarS = d3.e.s(cVar, 1);
        while (!z10) {
            try {
                try {
                    int iN = eVar.n();
                    if (iN != 0) {
                        r0 r0VarO = null;
                        p0 p0Var2 = null;
                        if (iN == 8) {
                            int iK = eVar.k();
                            if (iK == 0) {
                                p0Var2 = p0.IN;
                            } else if (iK == 1) {
                                p0Var2 = p0.OUT;
                            } else if (iK == 2) {
                                p0Var2 = p0Var;
                            } else if (iK == 3) {
                                p0Var2 = p0.STAR;
                            }
                            if (p0Var2 == null) {
                                eVarS.J(iN);
                                eVarS.J(iK);
                            } else {
                                this.f12136b |= 1;
                                this.f12137c = p0Var2;
                            }
                        } else if (iN == 18) {
                            if ((this.f12136b & 2) == 2) {
                                s0 s0Var = this.f12138d;
                                s0Var.getClass();
                                r0VarO = s0.o(s0Var);
                            }
                            s0 s0Var2 = (s0) eVar.g(s0.f12167u, gVar);
                            this.f12138d = s0Var2;
                            if (r0VarO != null) {
                                r0VarO.g(s0Var2);
                                this.f12138d = r0VarO.e();
                            }
                            this.f12136b |= 2;
                        } else if (iN == 24) {
                            this.f12136b |= 4;
                            this.f12139e = eVar.k();
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
                    this.f12135a = cVar.c();
                }
                throw th;
            }
        }
        try {
            eVarS.k();
        } catch (IOException unused2) {
        } finally {
            this.f12135a = cVar.c();
        }
    }

    @Override // xa.a
    public final int a() {
        int i7 = this.f12141g;
        if (i7 != -1) {
            return i7;
        }
        int iC = (this.f12136b & 1) == 1 ? d3.e.c(1, this.f12137c.f12127a) : 0;
        if ((this.f12136b & 2) == 2) {
            iC += d3.e.f(2, this.f12138d);
        }
        if ((this.f12136b & 4) == 4) {
            iC += d3.e.d(3, this.f12139e);
        }
        int size = this.f12135a.size() + iC;
        this.f12141g = size;
        return size;
    }

    @Override // xa.a
    public final xa.i b() {
        return o0.e();
    }

    @Override // xa.a
    public final xa.i c() {
        o0 o0VarE = o0.e();
        o0VarE.f(this);
        return o0VarE;
    }

    @Override // xa.a
    public final void d(d3.e eVar) throws IOException {
        a();
        if ((this.f12136b & 1) == 1) {
            eVar.z(1, this.f12137c.f12127a);
        }
        if ((this.f12136b & 2) == 2) {
            eVar.C(2, this.f12138d);
        }
        if ((this.f12136b & 4) == 4) {
            eVar.A(3, this.f12139e);
        }
        eVar.F(this.f12135a);
    }

    @Override // xa.u
    public final boolean isInitialized() {
        byte b10 = this.f12140f;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if ((this.f12136b & 2) != 2 || this.f12138d.isInitialized()) {
            this.f12140f = (byte) 1;
            return true;
        }
        this.f12140f = (byte) 0;
        return false;
    }
}
