package ra;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class p extends xa.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final p f12116e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f12117f = new a(6);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xa.d f12118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f12119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte f12120c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12121d;

    static {
        p pVar = new p();
        f12116e = pVar;
        pVar.f12119b = Collections.EMPTY_LIST;
    }

    public p() {
        this.f12120c = (byte) -1;
        this.f12121d = -1;
        this.f12118a = xa.d.f14765a;
    }

    public p(o oVar) {
        this.f12120c = (byte) -1;
        this.f12121d = -1;
        this.f12118a = oVar.f14792a;
    }

    public p(xa.e eVar, xa.g gVar) {
        this.f12120c = (byte) -1;
        this.f12121d = -1;
        this.f12119b = Collections.EMPTY_LIST;
        xa.c cVar = new xa.c();
        d3.e eVarS = d3.e.s(cVar, 1);
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            try {
                try {
                    int iN = eVar.n();
                    if (iN != 0) {
                        if (iN == 10) {
                            if (!z11) {
                                this.f12119b = new ArrayList();
                                z11 = true;
                            }
                            this.f12119b.add(eVar.g(t.f12186j, gVar));
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
                if (z11) {
                    this.f12119b = Collections.unmodifiableList(this.f12119b);
                }
                try {
                    eVarS.k();
                } catch (IOException unused) {
                } finally {
                    this.f12118a = cVar.c();
                }
                throw th;
            }
        }
        if (z11) {
            this.f12119b = Collections.unmodifiableList(this.f12119b);
        }
        try {
            eVarS.k();
        } catch (IOException unused2) {
        } finally {
            this.f12118a = cVar.c();
        }
    }

    @Override // xa.a
    public final int a() {
        int i7 = this.f12121d;
        if (i7 != -1) {
            return i7;
        }
        int iF = 0;
        for (int i10 = 0; i10 < this.f12119b.size(); i10++) {
            iF += d3.e.f(1, (xa.a) this.f12119b.get(i10));
        }
        int size = this.f12118a.size() + iF;
        this.f12121d = size;
        return size;
    }

    @Override // xa.a
    public final xa.i b() {
        o oVar = new o(0);
        oVar.f12111d = Collections.EMPTY_LIST;
        return oVar;
    }

    @Override // xa.a
    public final xa.i c() {
        o oVar = new o(0);
        oVar.f12111d = Collections.EMPTY_LIST;
        oVar.h(this);
        return oVar;
    }

    @Override // xa.a
    public final void d(d3.e eVar) throws IOException {
        a();
        for (int i7 = 0; i7 < this.f12119b.size(); i7++) {
            eVar.C(1, (xa.a) this.f12119b.get(i7));
        }
        eVar.F(this.f12118a);
    }

    @Override // xa.u
    public final boolean isInitialized() {
        byte b10 = this.f12120c;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i7 = 0; i7 < this.f12119b.size(); i7++) {
            if (!((t) this.f12119b.get(i7)).isInitialized()) {
                this.f12120c = (byte) 0;
                return false;
            }
        }
        this.f12120c = (byte) 1;
        return true;
    }
}
