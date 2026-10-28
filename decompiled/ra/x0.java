package ra;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class x0 extends xa.k {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final x0 f12254m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f12255n = new a(20);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xa.d f12256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12257c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12258d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12259e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f12260f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public w0 f12261g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List f12262h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List f12263i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f12264j;
    public byte k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f12265l;

    static {
        x0 x0Var = new x0();
        f12254m = x0Var;
        x0Var.f12258d = 0;
        x0Var.f12259e = 0;
        x0Var.f12260f = false;
        x0Var.f12261g = w0.INV;
        List list = Collections.EMPTY_LIST;
        x0Var.f12262h = list;
        x0Var.f12263i = list;
    }

    public x0() {
        this.f12264j = -1;
        this.k = (byte) -1;
        this.f12265l = -1;
        this.f12256b = xa.d.f14765a;
    }

    public x0(v0 v0Var) {
        super(v0Var);
        this.f12264j = -1;
        this.k = (byte) -1;
        this.f12265l = -1;
        this.f12256b = v0Var.f14792a;
    }

    public x0(xa.e eVar, xa.g gVar) {
        this.f12264j = -1;
        this.k = (byte) -1;
        this.f12265l = -1;
        this.f12258d = 0;
        this.f12259e = 0;
        this.f12260f = false;
        w0 w0Var = w0.INV;
        this.f12261g = w0Var;
        List list = Collections.EMPTY_LIST;
        this.f12262h = list;
        this.f12263i = list;
        xa.c cVar = new xa.c();
        d3.e eVarS = d3.e.s(cVar, 1);
        boolean z10 = false;
        int i7 = 0;
        while (!z10) {
            try {
                try {
                    int iN = eVar.n();
                    if (iN != 0) {
                        if (iN == 8) {
                            this.f12257c |= 1;
                            this.f12258d = eVar.k();
                        } else if (iN == 16) {
                            this.f12257c |= 2;
                            this.f12259e = eVar.k();
                        } else if (iN == 24) {
                            this.f12257c |= 4;
                            this.f12260f = eVar.l() != 0;
                        } else if (iN == 32) {
                            int iK = eVar.k();
                            w0 w0Var2 = iK != 0 ? iK != 1 ? iK != 2 ? null : w0Var : w0.OUT : w0.IN;
                            if (w0Var2 == null) {
                                eVarS.J(iN);
                                eVarS.J(iK);
                            } else {
                                this.f12257c |= 8;
                                this.f12261g = w0Var2;
                            }
                        } else if (iN == 42) {
                            if ((i7 & 16) != 16) {
                                this.f12262h = new ArrayList();
                                i7 |= 16;
                            }
                            this.f12262h.add(eVar.g(s0.f12167u, gVar));
                        } else if (iN == 48) {
                            if ((i7 & 32) != 32) {
                                this.f12263i = new ArrayList();
                                i7 |= 32;
                            }
                            this.f12263i.add(Integer.valueOf(eVar.k()));
                        } else if (iN == 50) {
                            int iD = eVar.d(eVar.k());
                            if ((i7 & 32) != 32 && eVar.b() > 0) {
                                this.f12263i = new ArrayList();
                                i7 |= 32;
                            }
                            while (eVar.b() > 0) {
                                this.f12263i.add(Integer.valueOf(eVar.k()));
                            }
                            eVar.c(iD);
                        } else if (!l(eVar, eVarS, gVar, iN)) {
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
                if ((i7 & 16) == 16) {
                    this.f12262h = Collections.unmodifiableList(this.f12262h);
                }
                if ((i7 & 32) == 32) {
                    this.f12263i = Collections.unmodifiableList(this.f12263i);
                }
                try {
                    eVarS.k();
                } catch (IOException unused) {
                } finally {
                    this.f12256b = cVar.c();
                }
                k();
                throw th;
            }
        }
        if ((i7 & 16) == 16) {
            this.f12262h = Collections.unmodifiableList(this.f12262h);
        }
        if ((i7 & 32) == 32) {
            this.f12263i = Collections.unmodifiableList(this.f12263i);
        }
        try {
            eVarS.k();
        } catch (IOException unused2) {
        } finally {
            this.f12256b = cVar.c();
        }
        k();
    }

    @Override // xa.a
    public final int a() {
        int i7 = this.f12265l;
        if (i7 != -1) {
            return i7;
        }
        int iD = (this.f12257c & 1) == 1 ? d3.e.d(1, this.f12258d) : 0;
        if ((this.f12257c & 2) == 2) {
            iD += d3.e.d(2, this.f12259e);
        }
        if ((this.f12257c & 4) == 4) {
            iD += d3.e.j(3) + 1;
        }
        if ((this.f12257c & 8) == 8) {
            iD += d3.e.c(4, this.f12261g.f12248a);
        }
        for (int i10 = 0; i10 < this.f12262h.size(); i10++) {
            iD += d3.e.f(5, (xa.a) this.f12262h.get(i10));
        }
        int iE = 0;
        for (int i11 = 0; i11 < this.f12263i.size(); i11++) {
            iE += d3.e.e(((Integer) this.f12263i.get(i11)).intValue());
        }
        int iE2 = iD + iE;
        if (!this.f12263i.isEmpty()) {
            iE2 = iE2 + 1 + d3.e.e(iE);
        }
        this.f12264j = iE;
        int size = this.f12256b.size() + h() + iE2;
        this.f12265l = size;
        return size;
    }

    @Override // xa.a
    public final xa.i b() {
        return v0.f();
    }

    @Override // xa.a
    public final xa.i c() {
        v0 v0VarF = v0.f();
        v0VarF.g(this);
        return v0VarF;
    }

    @Override // xa.a
    public final void d(d3.e eVar) throws IOException {
        a();
        android.support.v4.media.session.r rVar = new android.support.v4.media.session.r(this);
        if ((this.f12257c & 1) == 1) {
            eVar.A(1, this.f12258d);
        }
        if ((this.f12257c & 2) == 2) {
            eVar.A(2, this.f12259e);
        }
        if ((this.f12257c & 4) == 4) {
            boolean z10 = this.f12260f;
            eVar.L(3, 0);
            eVar.E(z10 ? 1 : 0);
        }
        if ((this.f12257c & 8) == 8) {
            eVar.z(4, this.f12261g.f12248a);
        }
        for (int i7 = 0; i7 < this.f12262h.size(); i7++) {
            eVar.C(5, (xa.a) this.f12262h.get(i7));
        }
        if (this.f12263i.size() > 0) {
            eVar.J(50);
            eVar.J(this.f12264j);
        }
        for (int i10 = 0; i10 < this.f12263i.size(); i10++) {
            eVar.B(((Integer) this.f12263i.get(i10)).intValue());
        }
        rVar.P(1000, eVar);
        eVar.F(this.f12256b);
    }

    @Override // xa.u
    public final xa.a getDefaultInstanceForType() {
        return f12254m;
    }

    @Override // xa.u
    public final boolean isInitialized() {
        byte b10 = this.k;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        int i7 = this.f12257c;
        if ((i7 & 1) != 1) {
            this.k = (byte) 0;
            return false;
        }
        if ((i7 & 2) != 2) {
            this.k = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < this.f12262h.size(); i10++) {
            if (!((s0) this.f12262h.get(i10)).isInitialized()) {
                this.k = (byte) 0;
                return false;
            }
        }
        if (g()) {
            this.k = (byte) 1;
            return true;
        }
        this.k = (byte) 0;
        return false;
    }
}
