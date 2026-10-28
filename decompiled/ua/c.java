package ua;

import java.io.IOException;
import xa.n;
import xa.q;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c extends n {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c f13240g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ra.a f13241h = new ra.a(26);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xa.d f13242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13244c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f13245d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte f13246e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f13247f;

    static {
        c cVar = new c();
        f13240g = cVar;
        cVar.f13244c = 0;
        cVar.f13245d = 0;
    }

    public c() {
        this.f13246e = (byte) -1;
        this.f13247f = -1;
        this.f13242a = xa.d.f14765a;
    }

    public c(a aVar) {
        this.f13246e = (byte) -1;
        this.f13247f = -1;
        this.f13242a = aVar.f14792a;
    }

    public c(xa.e eVar) {
        this.f13246e = (byte) -1;
        this.f13247f = -1;
        boolean z10 = false;
        this.f13244c = 0;
        this.f13245d = 0;
        xa.c cVar = new xa.c();
        d3.e eVarS = d3.e.s(cVar, 1);
        while (!z10) {
            try {
                try {
                    int iN = eVar.n();
                    if (iN != 0) {
                        if (iN == 8) {
                            this.f13243b |= 1;
                            this.f13244c = eVar.k();
                        } else if (iN == 16) {
                            this.f13243b |= 2;
                            this.f13245d = eVar.k();
                        } else if (!eVar.q(iN, eVarS)) {
                        }
                    }
                    z10 = true;
                } catch (Throwable th) {
                    try {
                        eVarS.k();
                    } catch (IOException unused) {
                    } finally {
                        this.f13242a = cVar.c();
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
            this.f13242a = cVar.c();
        }
    }

    public static a g(c cVar) {
        a aVar = new a(1);
        aVar.g(cVar);
        return aVar;
    }

    @Override // xa.a
    public final int a() {
        int i7 = this.f13247f;
        if (i7 != -1) {
            return i7;
        }
        int iD = (this.f13243b & 1) == 1 ? d3.e.d(1, this.f13244c) : 0;
        if ((this.f13243b & 2) == 2) {
            iD += d3.e.d(2, this.f13245d);
        }
        int size = this.f13242a.size() + iD;
        this.f13247f = size;
        return size;
    }

    @Override // xa.a
    public final xa.i b() {
        return new a(1);
    }

    @Override // xa.a
    public final xa.i c() {
        return g(this);
    }

    @Override // xa.a
    public final void d(d3.e eVar) throws IOException {
        a();
        if ((this.f13243b & 1) == 1) {
            eVar.A(1, this.f13244c);
        }
        if ((this.f13243b & 2) == 2) {
            eVar.A(2, this.f13245d);
        }
        eVar.F(this.f13242a);
    }

    @Override // xa.u
    public final boolean isInitialized() {
        if (this.f13246e == 1) {
            return true;
        }
        this.f13246e = (byte) 1;
        return true;
    }
}
