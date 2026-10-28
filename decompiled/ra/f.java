package ra;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class f extends xa.n {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final f f11926g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f11927h = new a(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xa.d f11928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11930c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e f11931d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte f11932e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f11933f;

    static {
        f fVar = new f();
        f11926g = fVar;
        fVar.f11930c = 0;
        fVar.f11931d = e.f11889p;
    }

    public f() {
        this.f11932e = (byte) -1;
        this.f11933f = -1;
        this.f11928a = xa.d.f14765a;
    }

    public f(b bVar) {
        this.f11932e = (byte) -1;
        this.f11933f = -1;
        this.f11928a = bVar.f14792a;
    }

    public f(xa.e eVar, xa.g gVar) {
        c cVarE;
        this.f11932e = (byte) -1;
        this.f11933f = -1;
        boolean z10 = false;
        this.f11930c = 0;
        this.f11931d = e.f11889p;
        xa.c cVar = new xa.c();
        d3.e eVarS = d3.e.s(cVar, 1);
        while (!z10) {
            try {
                try {
                    try {
                        int iN = eVar.n();
                        if (iN != 0) {
                            if (iN == 8) {
                                this.f11929b |= 1;
                                this.f11930c = eVar.k();
                            } else if (iN == 18) {
                                if ((this.f11929b & 2) == 2) {
                                    e eVar2 = this.f11931d;
                                    eVar2.getClass();
                                    cVarE = c.e();
                                    cVarE.f(eVar2);
                                } else {
                                    cVarE = null;
                                }
                                e eVar3 = (e) eVar.g(e.f11890q, gVar);
                                this.f11931d = eVar3;
                                if (cVarE != null) {
                                    cVarE.f(eVar3);
                                    this.f11931d = cVarE.d();
                                }
                                this.f11929b |= 2;
                            } else if (!eVar.q(iN, eVarS)) {
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
                try {
                    eVarS.k();
                } catch (IOException unused) {
                } finally {
                    this.f11928a = cVar.c();
                }
                throw th;
            }
        }
        try {
            eVarS.k();
        } catch (IOException unused2) {
        } finally {
            this.f11928a = cVar.c();
        }
    }

    @Override // xa.a
    public final int a() {
        int i7 = this.f11933f;
        if (i7 != -1) {
            return i7;
        }
        int iD = (this.f11929b & 1) == 1 ? d3.e.d(1, this.f11930c) : 0;
        if ((this.f11929b & 2) == 2) {
            iD += d3.e.f(2, this.f11931d);
        }
        int size = this.f11928a.size() + iD;
        this.f11933f = size;
        return size;
    }

    @Override // xa.a
    public final xa.i b() {
        b bVar = new b(0);
        bVar.f11836e = e.f11889p;
        return bVar;
    }

    @Override // xa.a
    public final xa.i c() {
        b bVar = new b(0);
        bVar.f11836e = e.f11889p;
        bVar.f(this);
        return bVar;
    }

    @Override // xa.a
    public final void d(d3.e eVar) throws IOException {
        a();
        if ((this.f11929b & 1) == 1) {
            eVar.A(1, this.f11930c);
        }
        if ((this.f11929b & 2) == 2) {
            eVar.C(2, this.f11931d);
        }
        eVar.F(this.f11928a);
    }

    @Override // xa.u
    public final boolean isInitialized() {
        byte b10 = this.f11932e;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        int i7 = this.f11929b;
        if ((i7 & 1) != 1) {
            this.f11932e = (byte) 0;
            return false;
        }
        if ((i7 & 2) != 2) {
            this.f11932e = (byte) 0;
            return false;
        }
        if (this.f11931d.isInitialized()) {
            this.f11932e = (byte) 1;
            return true;
        }
        this.f11932e = (byte) 0;
        return false;
    }
}
