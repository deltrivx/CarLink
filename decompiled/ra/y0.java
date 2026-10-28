package ra;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class y0 extends xa.n {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final y0 f12278g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f12279h = new a(21);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xa.d f12280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f12282c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12283d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte f12284e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f12285f;

    static {
        y0 y0Var = new y0();
        f12278g = y0Var;
        y0Var.f12282c = Collections.EMPTY_LIST;
        y0Var.f12283d = -1;
    }

    public y0() {
        this.f12284e = (byte) -1;
        this.f12285f = -1;
        this.f12280a = xa.d.f14765a;
    }

    public y0(g gVar) {
        this.f12284e = (byte) -1;
        this.f12285f = -1;
        this.f12280a = gVar.f14792a;
    }

    public y0(xa.e eVar, xa.g gVar) {
        this.f12284e = (byte) -1;
        this.f12285f = -1;
        this.f12282c = Collections.EMPTY_LIST;
        this.f12283d = -1;
        xa.c cVar = new xa.c();
        d3.e eVarS = d3.e.s(cVar, 1);
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            try {
                try {
                    try {
                        int iN = eVar.n();
                        if (iN != 0) {
                            if (iN == 10) {
                                if (!z11) {
                                    this.f12282c = new ArrayList();
                                    z11 = true;
                                }
                                this.f12282c.add(eVar.g(s0.f12167u, gVar));
                            } else if (iN == 16) {
                                this.f12281b |= 1;
                                this.f12283d = eVar.k();
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
                if (z11) {
                    this.f12282c = Collections.unmodifiableList(this.f12282c);
                }
                try {
                    eVarS.k();
                } catch (IOException unused) {
                } finally {
                    this.f12280a = cVar.c();
                }
                throw th;
            }
        }
        if (z11) {
            this.f12282c = Collections.unmodifiableList(this.f12282c);
        }
        try {
            eVarS.k();
        } catch (IOException unused2) {
        } finally {
            this.f12280a = cVar.c();
        }
    }

    public static g g(y0 y0Var) {
        g gVarF = g.f();
        gVarF.h(y0Var);
        return gVarF;
    }

    @Override // xa.a
    public final int a() {
        int i7 = this.f12285f;
        if (i7 != -1) {
            return i7;
        }
        int iD = 0;
        for (int i10 = 0; i10 < this.f12282c.size(); i10++) {
            iD += d3.e.f(1, (xa.a) this.f12282c.get(i10));
        }
        if ((this.f12281b & 1) == 1) {
            iD += d3.e.d(2, this.f12283d);
        }
        int size = this.f12280a.size() + iD;
        this.f12285f = size;
        return size;
    }

    @Override // xa.a
    public final xa.i b() {
        return g.f();
    }

    @Override // xa.a
    public final xa.i c() {
        return g(this);
    }

    @Override // xa.a
    public final void d(d3.e eVar) throws IOException {
        a();
        for (int i7 = 0; i7 < this.f12282c.size(); i7++) {
            eVar.C(1, (xa.a) this.f12282c.get(i7));
        }
        if ((this.f12281b & 1) == 1) {
            eVar.A(2, this.f12283d);
        }
        eVar.F(this.f12280a);
    }

    public final g h() {
        return g(this);
    }

    @Override // xa.u
    public final boolean isInitialized() {
        byte b10 = this.f12284e;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i7 = 0; i7 < this.f12282c.size(); i7++) {
            if (!((s0) this.f12282c.get(i7)).isInitialized()) {
                this.f12284e = (byte) 0;
                return false;
            }
        }
        this.f12284e = (byte) 1;
        return true;
    }
}
