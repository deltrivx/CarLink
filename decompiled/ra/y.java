package ra;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class y extends xa.n {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final y f12266l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f12267m = new a(9);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xa.d f12268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12270c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12271d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public x f12272e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public s0 f12273f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f12274g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List f12275h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List f12276i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public byte f12277j;
    public int k;

    static {
        y yVar = new y();
        f12266l = yVar;
        yVar.f12270c = 0;
        yVar.f12271d = 0;
        yVar.f12272e = x.TRUE;
        yVar.f12273f = s0.f12166t;
        yVar.f12274g = 0;
        List list = Collections.EMPTY_LIST;
        yVar.f12275h = list;
        yVar.f12276i = list;
    }

    public y() {
        this.f12277j = (byte) -1;
        this.k = -1;
        this.f12268a = xa.d.f14765a;
    }

    public y(w wVar) {
        this.f12277j = (byte) -1;
        this.k = -1;
        this.f12268a = wVar.f14792a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public y(xa.e eVar, xa.g gVar) {
        x xVar;
        this.f12277j = (byte) -1;
        this.k = -1;
        boolean z10 = false;
        this.f12270c = 0;
        this.f12271d = 0;
        x xVar2 = x.TRUE;
        this.f12272e = xVar2;
        this.f12273f = s0.f12166t;
        this.f12274g = 0;
        List list = Collections.EMPTY_LIST;
        this.f12275h = list;
        this.f12276i = list;
        xa.c cVar = new xa.c();
        d3.e eVarS = d3.e.s(cVar, 1);
        int i7 = 0;
        while (!z10) {
            try {
                try {
                    try {
                        int iN = eVar.n();
                        if (iN != 0) {
                            if (iN == 8) {
                                this.f12269b |= 1;
                                this.f12270c = eVar.k();
                            } else if (iN != 16) {
                                Object objO = null;
                                if (iN == 24) {
                                    int iK = eVar.k();
                                    if (iK != 0) {
                                        if (iK == 1) {
                                            objO = x.FALSE;
                                        } else if (iK == 2) {
                                            objO = x.NULL;
                                        }
                                        xVar = objO;
                                    } else {
                                        xVar = xVar2;
                                    }
                                    if (xVar == 0) {
                                        eVarS.J(iN);
                                        eVarS.J(iK);
                                    } else {
                                        this.f12269b |= 4;
                                        this.f12272e = xVar;
                                    }
                                } else if (iN == 34) {
                                    if ((this.f12269b & 8) == 8) {
                                        s0 s0Var = this.f12273f;
                                        s0Var.getClass();
                                        objO = s0.o(s0Var);
                                    }
                                    r0 r0Var = objO;
                                    s0 s0Var2 = (s0) eVar.g(s0.f12167u, gVar);
                                    this.f12273f = s0Var2;
                                    if (r0Var != 0) {
                                        r0Var.g(s0Var2);
                                        this.f12273f = r0Var.e();
                                    }
                                    this.f12269b |= 8;
                                } else if (iN != 40) {
                                    a aVar = f12267m;
                                    if (iN == 50) {
                                        if ((i7 & 32) != 32) {
                                            this.f12275h = new ArrayList();
                                            i7 |= 32;
                                        }
                                        this.f12275h.add(eVar.g(aVar, gVar));
                                    } else if (iN == 58) {
                                        if ((i7 & 64) != 64) {
                                            this.f12276i = new ArrayList();
                                            i7 |= 64;
                                        }
                                        this.f12276i.add(eVar.g(aVar, gVar));
                                    } else if (!eVar.q(iN, eVarS)) {
                                    }
                                } else {
                                    this.f12269b |= 16;
                                    this.f12274g = eVar.k();
                                }
                            } else {
                                this.f12269b |= 2;
                                this.f12271d = eVar.k();
                            }
                        }
                        z10 = true;
                    } catch (IOException e7) {
                        xa.q qVar = new xa.q(e7.getMessage());
                        qVar.f14823a = this;
                        throw qVar;
                    }
                } catch (xa.q e10) {
                    e10.f14823a = this;
                    throw e10;
                }
            } catch (Throwable th) {
                if ((i7 & 32) == 32) {
                    this.f12275h = Collections.unmodifiableList(this.f12275h);
                }
                if ((i7 & 64) == 64) {
                    this.f12276i = Collections.unmodifiableList(this.f12276i);
                }
                try {
                    eVarS.k();
                } catch (IOException unused) {
                } finally {
                    this.f12268a = cVar.c();
                }
                throw th;
            }
        }
        if ((i7 & 32) == 32) {
            this.f12275h = Collections.unmodifiableList(this.f12275h);
        }
        if ((i7 & 64) == 64) {
            this.f12276i = Collections.unmodifiableList(this.f12276i);
        }
        try {
            eVarS.k();
        } catch (IOException unused2) {
        } finally {
            this.f12268a = cVar.c();
        }
    }

    @Override // xa.a
    public final int a() {
        int i7 = this.k;
        if (i7 != -1) {
            return i7;
        }
        int iD = (this.f12269b & 1) == 1 ? d3.e.d(1, this.f12270c) : 0;
        if ((this.f12269b & 2) == 2) {
            iD += d3.e.d(2, this.f12271d);
        }
        if ((this.f12269b & 4) == 4) {
            iD += d3.e.c(3, this.f12272e.f12253a);
        }
        if ((this.f12269b & 8) == 8) {
            iD += d3.e.f(4, this.f12273f);
        }
        if ((this.f12269b & 16) == 16) {
            iD += d3.e.d(5, this.f12274g);
        }
        for (int i10 = 0; i10 < this.f12275h.size(); i10++) {
            iD += d3.e.f(6, (xa.a) this.f12275h.get(i10));
        }
        for (int i11 = 0; i11 < this.f12276i.size(); i11++) {
            iD += d3.e.f(7, (xa.a) this.f12276i.get(i11));
        }
        int size = this.f12268a.size() + iD;
        this.k = size;
        return size;
    }

    @Override // xa.a
    public final xa.i b() {
        return w.e();
    }

    @Override // xa.a
    public final xa.i c() {
        w wVarE = w.e();
        wVarE.f(this);
        return wVarE;
    }

    @Override // xa.a
    public final void d(d3.e eVar) throws IOException {
        a();
        if ((this.f12269b & 1) == 1) {
            eVar.A(1, this.f12270c);
        }
        if ((this.f12269b & 2) == 2) {
            eVar.A(2, this.f12271d);
        }
        if ((this.f12269b & 4) == 4) {
            eVar.z(3, this.f12272e.f12253a);
        }
        if ((this.f12269b & 8) == 8) {
            eVar.C(4, this.f12273f);
        }
        if ((this.f12269b & 16) == 16) {
            eVar.A(5, this.f12274g);
        }
        for (int i7 = 0; i7 < this.f12275h.size(); i7++) {
            eVar.C(6, (xa.a) this.f12275h.get(i7));
        }
        for (int i10 = 0; i10 < this.f12276i.size(); i10++) {
            eVar.C(7, (xa.a) this.f12276i.get(i10));
        }
        eVar.F(this.f12268a);
    }

    @Override // xa.u
    public final boolean isInitialized() {
        byte b10 = this.f12277j;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if ((this.f12269b & 8) == 8 && !this.f12273f.isInitialized()) {
            this.f12277j = (byte) 0;
            return false;
        }
        for (int i7 = 0; i7 < this.f12275h.size(); i7++) {
            if (!((y) this.f12275h.get(i7)).isInitialized()) {
                this.f12277j = (byte) 0;
                return false;
            }
        }
        for (int i10 = 0; i10 < this.f12276i.size(); i10++) {
            if (!((y) this.f12276i.get(i10)).isInitialized()) {
                this.f12277j = (byte) 0;
                return false;
            }
        }
        this.f12277j = (byte) 1;
        return true;
    }
}
