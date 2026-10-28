package ra;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class l extends xa.n {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final l f12066g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f12067h = new a(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xa.d f12068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12070c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public xa.t f12071d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte f12072e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f12073f;

    static {
        l lVar = new l();
        f12066g = lVar;
        lVar.f12070c = 0;
        lVar.f12071d = xa.d.f14765a;
    }

    public l() {
        this.f12072e = (byte) -1;
        this.f12073f = -1;
        this.f12068a = xa.d.f14765a;
    }

    public l(b bVar) {
        this.f12072e = (byte) -1;
        this.f12073f = -1;
        this.f12068a = bVar.f14792a;
    }

    public l(xa.e eVar) {
        this.f12072e = (byte) -1;
        this.f12073f = -1;
        boolean z10 = false;
        this.f12070c = 0;
        this.f12071d = xa.d.f14765a;
        xa.c cVar = new xa.c();
        d3.e eVarS = d3.e.s(cVar, 1);
        while (!z10) {
            try {
                try {
                    try {
                        int iN = eVar.n();
                        if (iN != 0) {
                            if (iN == 8) {
                                this.f12069b |= 1;
                                this.f12070c = eVar.k();
                            } else if (iN == 18) {
                                this.f12069b |= 2;
                                this.f12071d = eVar.e();
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
                    this.f12068a = cVar.c();
                }
                throw th;
            }
        }
        try {
            eVarS.k();
        } catch (IOException unused2) {
        } finally {
            this.f12068a = cVar.c();
        }
    }

    @Override // xa.a
    public final int a() {
        int i7 = this.f12073f;
        if (i7 != -1) {
            return i7;
        }
        int iD = (this.f12069b & 1) == 1 ? d3.e.d(1, this.f12070c) : 0;
        if ((this.f12069b & 2) == 2) {
            xa.t tVar = this.f12071d;
            iD += tVar.size() + d3.e.h(tVar.size()) + d3.e.j(2);
        }
        int size = this.f12068a.size() + iD;
        this.f12073f = size;
        return size;
    }

    @Override // xa.a
    public final xa.i b() {
        b bVar = new b(1);
        bVar.f11836e = xa.d.f14765a;
        return bVar;
    }

    @Override // xa.a
    public final xa.i c() {
        b bVar = new b(1);
        bVar.f11836e = xa.d.f14765a;
        bVar.g(this);
        return bVar;
    }

    @Override // xa.a
    public final void d(d3.e eVar) throws IOException {
        a();
        if ((this.f12069b & 1) == 1) {
            eVar.A(1, this.f12070c);
        }
        if ((this.f12069b & 2) == 2) {
            xa.t tVar = this.f12071d;
            eVar.L(2, 2);
            eVar.J(tVar.size());
            eVar.F(tVar);
        }
        eVar.F(this.f12068a);
    }

    @Override // xa.u
    public final boolean isInitialized() {
        byte b10 = this.f12072e;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        int i7 = this.f12069b;
        if ((i7 & 1) != 1) {
            this.f12072e = (byte) 0;
            return false;
        }
        if ((i7 & 2) == 2) {
            this.f12072e = (byte) 1;
            return true;
        }
        this.f12072e = (byte) 0;
        return false;
    }
}
