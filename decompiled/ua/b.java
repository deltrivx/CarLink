package ua;

import java.io.IOException;
import xa.n;
import xa.q;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b extends n {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f13232g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ra.a f13233h = new ra.a(25);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xa.d f13234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13236c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f13237d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte f13238e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f13239f;

    static {
        b bVar = new b();
        f13232g = bVar;
        bVar.f13236c = 0;
        bVar.f13237d = 0;
    }

    public b() {
        this.f13238e = (byte) -1;
        this.f13239f = -1;
        this.f13234a = xa.d.f14765a;
    }

    public b(a aVar) {
        this.f13238e = (byte) -1;
        this.f13239f = -1;
        this.f13234a = aVar.f14792a;
    }

    public b(xa.e eVar) {
        this.f13238e = (byte) -1;
        this.f13239f = -1;
        boolean z10 = false;
        this.f13236c = 0;
        this.f13237d = 0;
        xa.c cVar = new xa.c();
        d3.e eVarS = d3.e.s(cVar, 1);
        while (!z10) {
            try {
                try {
                    int iN = eVar.n();
                    if (iN != 0) {
                        if (iN == 8) {
                            this.f13235b |= 1;
                            this.f13236c = eVar.k();
                        } else if (iN == 16) {
                            this.f13235b |= 2;
                            this.f13237d = eVar.k();
                        } else if (!eVar.q(iN, eVarS)) {
                        }
                    }
                    z10 = true;
                } catch (Throwable th) {
                    try {
                        eVarS.k();
                    } catch (IOException unused) {
                    } finally {
                        this.f13234a = cVar.c();
                    }
                    throw th;
                }
            } catch (q e7) {
                e7.f14823a = this;
                throw e7;
            } catch (IOException e10) {
                q qVar = new q(e10.getMessage());
                qVar.f14823a = this;
                throw qVar;
            }
        }
        try {
            eVarS.k();
        } catch (IOException unused2) {
        } finally {
            this.f13234a = cVar.c();
        }
    }

    @Override // xa.a
    public final int a() {
        int i7 = this.f13239f;
        if (i7 != -1) {
            return i7;
        }
        int iD = (this.f13235b & 1) == 1 ? d3.e.d(1, this.f13236c) : 0;
        if ((this.f13235b & 2) == 2) {
            iD += d3.e.d(2, this.f13237d);
        }
        int size = this.f13234a.size() + iD;
        this.f13239f = size;
        return size;
    }

    @Override // xa.a
    public final xa.i b() {
        return new a(0);
    }

    @Override // xa.a
    public final xa.i c() {
        a aVar = new a(0);
        aVar.f(this);
        return aVar;
    }

    @Override // xa.a
    public final void d(d3.e eVar) throws IOException {
        a();
        if ((this.f13235b & 1) == 1) {
            eVar.A(1, this.f13236c);
        }
        if ((this.f13235b & 2) == 2) {
            eVar.A(2, this.f13237d);
        }
        eVar.F(this.f13234a);
    }

    @Override // xa.u
    public final boolean isInitialized() {
        if (this.f13238e == 1) {
            return true;
        }
        this.f13238e = (byte) 1;
        return true;
    }
}
