package ra;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class n0 extends xa.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final n0 f12103e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f12104f = new a(16);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xa.d f12105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public xa.s f12106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte f12107c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12108d;

    static {
        n0 n0Var = new n0();
        f12103e = n0Var;
        n0Var.f12106b = xa.r.f14824b;
    }

    public n0() {
        this.f12107c = (byte) -1;
        this.f12108d = -1;
        this.f12105a = xa.d.f14765a;
    }

    public n0(o oVar) {
        this.f12107c = (byte) -1;
        this.f12108d = -1;
        this.f12105a = oVar.f14792a;
    }

    public n0(xa.e eVar) {
        this.f12107c = (byte) -1;
        this.f12108d = -1;
        this.f12106b = xa.r.f14824b;
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
                            xa.t tVarE = eVar.e();
                            if (!z11) {
                                this.f12106b = new xa.r();
                                z11 = true;
                            }
                            this.f12106b.l(tVarE);
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
                    this.f12106b = this.f12106b.b();
                }
                try {
                    eVarS.k();
                } catch (IOException unused) {
                } finally {
                    this.f12105a = cVar.c();
                }
                throw th;
            }
        }
        if (z11) {
            this.f12106b = this.f12106b.b();
        }
        try {
            eVarS.k();
        } catch (IOException unused2) {
        } finally {
            this.f12105a = cVar.c();
        }
    }

    @Override // xa.a
    public final int a() {
        int i7 = this.f12108d;
        if (i7 != -1) {
            return i7;
        }
        int size = 0;
        for (int i10 = 0; i10 < this.f12106b.size(); i10++) {
            xa.d dVarH = this.f12106b.h(i10);
            size += dVarH.size() + d3.e.h(dVarH.size());
        }
        int size2 = this.f12105a.size() + this.f12106b.size() + size;
        this.f12108d = size2;
        return size2;
    }

    @Override // xa.a
    public final xa.i b() {
        o oVar = new o(3);
        oVar.f12111d = xa.r.f14824b;
        return oVar;
    }

    @Override // xa.a
    public final xa.i c() {
        o oVar = new o(3);
        oVar.f12111d = xa.r.f14824b;
        oVar.j(this);
        return oVar;
    }

    @Override // xa.a
    public final void d(d3.e eVar) throws IOException {
        a();
        for (int i7 = 0; i7 < this.f12106b.size(); i7++) {
            xa.d dVarH = this.f12106b.h(i7);
            eVar.L(1, 2);
            eVar.J(dVarH.size());
            eVar.F(dVarH);
        }
        eVar.F(this.f12105a);
    }

    @Override // xa.u
    public final boolean isInitialized() {
        if (this.f12107c == 1) {
            return true;
        }
        this.f12107c = (byte) 1;
        return true;
    }
}
