package ra;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class t extends xa.n {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final t f12185i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f12186j = new a(7);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xa.d f12187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public r f12189c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f12190d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public y f12191e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public s f12192f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte f12193g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f12194h;

    static {
        t tVar = new t();
        f12185i = tVar;
        tVar.f12189c = r.RETURNS_CONSTANT;
        tVar.f12190d = Collections.EMPTY_LIST;
        tVar.f12191e = y.f12266l;
        tVar.f12192f = s.AT_MOST_ONCE;
    }

    public t() {
        this.f12193g = (byte) -1;
        this.f12194h = -1;
        this.f12187a = xa.d.f14765a;
    }

    public t(q qVar) {
        this.f12193g = (byte) -1;
        this.f12194h = -1;
        this.f12187a = qVar.f14792a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t(xa.e eVar, xa.g gVar) {
        this.f12193g = (byte) -1;
        this.f12194h = -1;
        r rVar = r.RETURNS_CONSTANT;
        this.f12189c = rVar;
        this.f12190d = Collections.EMPTY_LIST;
        this.f12191e = y.f12266l;
        s sVar = s.AT_MOST_ONCE;
        this.f12192f = sVar;
        xa.c cVar = new xa.c();
        d3.e eVarS = d3.e.s(cVar, 1);
        boolean z10 = false;
        char c10 = 0;
        while (!z10) {
            try {
                try {
                    int iN = eVar.n();
                    if (iN != 0) {
                        s sVar2 = null;
                        r rVar2 = null;
                        w wVarE = null;
                        if (iN == 8) {
                            int iK = eVar.k();
                            if (iK == 0) {
                                rVar2 = rVar;
                            } else if (iK == 1) {
                                rVar2 = r.CALLS;
                            } else if (iK == 2) {
                                rVar2 = r.RETURNS_NOT_NULL;
                            }
                            if (rVar2 == null) {
                                eVarS.J(iN);
                                eVarS.J(iK);
                            } else {
                                this.f12188b |= 1;
                                this.f12189c = rVar2;
                            }
                        } else if (iN == 18) {
                            if ((c10 & 2) != 2) {
                                this.f12190d = new ArrayList();
                                c10 = 2;
                            }
                            this.f12190d.add(eVar.g(y.f12267m, gVar));
                        } else if (iN == 26) {
                            if ((this.f12188b & 2) == 2) {
                                y yVar = this.f12191e;
                                yVar.getClass();
                                wVarE = w.e();
                                wVarE.f(yVar);
                            }
                            y yVar2 = (y) eVar.g(y.f12267m, gVar);
                            this.f12191e = yVar2;
                            if (wVarE != null) {
                                wVarE.f(yVar2);
                                this.f12191e = wVarE.d();
                            }
                            this.f12188b |= 2;
                        } else if (iN == 32) {
                            int iK2 = eVar.k();
                            if (iK2 == 0) {
                                sVar2 = sVar;
                            } else if (iK2 == 1) {
                                sVar2 = s.EXACTLY_ONCE;
                            } else if (iK2 == 2) {
                                sVar2 = s.AT_LEAST_ONCE;
                            }
                            if (sVar2 == null) {
                                eVarS.J(iN);
                                eVarS.J(iK2);
                            } else {
                                this.f12188b |= 4;
                                this.f12192f = sVar2;
                            }
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
                if ((c10 & 2) == 2) {
                    this.f12190d = Collections.unmodifiableList(this.f12190d);
                }
                try {
                    eVarS.k();
                } catch (IOException unused) {
                } finally {
                    this.f12187a = cVar.c();
                }
                throw th;
            }
        }
        if ((c10 & 2) == 2) {
            this.f12190d = Collections.unmodifiableList(this.f12190d);
        }
        try {
            eVarS.k();
        } catch (IOException unused2) {
        } finally {
            this.f12187a = cVar.c();
        }
    }

    @Override // xa.a
    public final int a() {
        int i7 = this.f12194h;
        if (i7 != -1) {
            return i7;
        }
        int iC = (this.f12188b & 1) == 1 ? d3.e.c(1, this.f12189c.f12146a) : 0;
        for (int i10 = 0; i10 < this.f12190d.size(); i10++) {
            iC += d3.e.f(2, (xa.a) this.f12190d.get(i10));
        }
        if ((this.f12188b & 2) == 2) {
            iC += d3.e.f(3, this.f12191e);
        }
        if ((this.f12188b & 4) == 4) {
            iC += d3.e.c(4, this.f12192f.f12165a);
        }
        int size = this.f12187a.size() + iC;
        this.f12194h = size;
        return size;
    }

    @Override // xa.a
    public final xa.i b() {
        return q.e();
    }

    @Override // xa.a
    public final xa.i c() {
        q qVarE = q.e();
        qVarE.f(this);
        return qVarE;
    }

    @Override // xa.a
    public final void d(d3.e eVar) throws IOException {
        a();
        if ((this.f12188b & 1) == 1) {
            eVar.z(1, this.f12189c.f12146a);
        }
        for (int i7 = 0; i7 < this.f12190d.size(); i7++) {
            eVar.C(2, (xa.a) this.f12190d.get(i7));
        }
        if ((this.f12188b & 2) == 2) {
            eVar.C(3, this.f12191e);
        }
        if ((this.f12188b & 4) == 4) {
            eVar.z(4, this.f12192f.f12165a);
        }
        eVar.F(this.f12187a);
    }

    @Override // xa.u
    public final boolean isInitialized() {
        byte b10 = this.f12193g;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i7 = 0; i7 < this.f12190d.size(); i7++) {
            if (!((y) this.f12190d.get(i7)).isInitialized()) {
                this.f12193g = (byte) 0;
                return false;
            }
        }
        if ((this.f12188b & 2) != 2 || this.f12191e.isInitialized()) {
            this.f12193g = (byte) 1;
            return true;
        }
        this.f12193g = (byte) 0;
        return false;
    }
}
