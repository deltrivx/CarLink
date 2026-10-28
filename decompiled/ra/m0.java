package ra;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class m0 extends xa.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final m0 f12088e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f12089f = new a(14);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xa.d f12090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f12091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte f12092c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12093d;

    static {
        m0 m0Var = new m0();
        f12088e = m0Var;
        m0Var.f12091b = Collections.EMPTY_LIST;
    }

    public m0() {
        this.f12092c = (byte) -1;
        this.f12093d = -1;
        this.f12090a = xa.d.f14765a;
    }

    public m0(o oVar) {
        this.f12092c = (byte) -1;
        this.f12093d = -1;
        this.f12090a = oVar.f14792a;
    }

    public m0(xa.e eVar, xa.g gVar) {
        this.f12092c = (byte) -1;
        this.f12093d = -1;
        this.f12091b = Collections.EMPTY_LIST;
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
                                this.f12091b = new ArrayList();
                                z11 = true;
                            }
                            this.f12091b.add(eVar.g(l0.f12075i, gVar));
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
                    this.f12091b = Collections.unmodifiableList(this.f12091b);
                }
                try {
                    eVarS.k();
                } catch (IOException unused) {
                } finally {
                    this.f12090a = cVar.c();
                }
                throw th;
            }
        }
        if (z11) {
            this.f12091b = Collections.unmodifiableList(this.f12091b);
        }
        try {
            eVarS.k();
        } catch (IOException unused2) {
        } finally {
            this.f12090a = cVar.c();
        }
    }

    @Override // xa.a
    public final int a() {
        int i7 = this.f12093d;
        if (i7 != -1) {
            return i7;
        }
        int iF = 0;
        for (int i10 = 0; i10 < this.f12091b.size(); i10++) {
            iF += d3.e.f(1, (xa.a) this.f12091b.get(i10));
        }
        int size = this.f12090a.size() + iF;
        this.f12093d = size;
        return size;
    }

    @Override // xa.a
    public final xa.i b() {
        o oVar = new o(1);
        oVar.f12111d = Collections.EMPTY_LIST;
        return oVar;
    }

    @Override // xa.a
    public final xa.i c() {
        o oVar = new o(1);
        oVar.f12111d = Collections.EMPTY_LIST;
        oVar.i(this);
        return oVar;
    }

    @Override // xa.a
    public final void d(d3.e eVar) throws IOException {
        a();
        for (int i7 = 0; i7 < this.f12091b.size(); i7++) {
            eVar.C(1, (xa.a) this.f12091b.get(i7));
        }
        eVar.F(this.f12090a);
    }

    @Override // xa.u
    public final boolean isInitialized() {
        byte b10 = this.f12092c;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i7 = 0; i7 < this.f12091b.size(); i7++) {
            if (!((l0) this.f12091b.get(i7)).isInitialized()) {
                this.f12092c = (byte) 0;
                return false;
            }
        }
        this.f12092c = (byte) 1;
        return true;
    }
}
