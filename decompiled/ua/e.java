package ua;

import java.io.IOException;
import xa.n;
import xa.q;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e extends n {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final e f13254j;
    public static final ra.a k = new ra.a(27);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xa.d f13255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f13257c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f13258d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c f13259e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f13260f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c f13261g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public byte f13262h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f13263i;

    static {
        e eVar = new e();
        f13254j = eVar;
        eVar.f13257c = b.f13232g;
        c cVar = c.f13240g;
        eVar.f13258d = cVar;
        eVar.f13259e = cVar;
        eVar.f13260f = cVar;
        eVar.f13261g = cVar;
    }

    public e() {
        this.f13262h = (byte) -1;
        this.f13263i = -1;
        this.f13255a = xa.d.f14765a;
    }

    public e(d dVar) {
        this.f13262h = (byte) -1;
        this.f13263i = -1;
        this.f13255a = dVar.f14792a;
    }

    public e(xa.e eVar, xa.g gVar) {
        this.f13262h = (byte) -1;
        this.f13263i = -1;
        this.f13257c = b.f13232g;
        c cVar = c.f13240g;
        this.f13258d = cVar;
        this.f13259e = cVar;
        this.f13260f = cVar;
        this.f13261g = cVar;
        xa.c cVar2 = new xa.c();
        d3.e eVarS = d3.e.s(cVar2, 1);
        boolean z10 = false;
        while (!z10) {
            try {
                try {
                    int iN = eVar.n();
                    if (iN != 0) {
                        a aVarG = null;
                        if (iN == 10) {
                            if ((this.f13256b & 1) == 1) {
                                b bVar = this.f13257c;
                                bVar.getClass();
                                aVarG = new a(0);
                                aVarG.f(bVar);
                            }
                            b bVar2 = (b) eVar.g(b.f13233h, gVar);
                            this.f13257c = bVar2;
                            if (aVarG != null) {
                                aVarG.f(bVar2);
                                this.f13257c = aVarG.d();
                            }
                            this.f13256b |= 1;
                        } else if (iN == 18) {
                            if ((this.f13256b & 2) == 2) {
                                c cVar3 = this.f13258d;
                                cVar3.getClass();
                                aVarG = c.g(cVar3);
                            }
                            c cVar4 = (c) eVar.g(c.f13241h, gVar);
                            this.f13258d = cVar4;
                            if (aVarG != null) {
                                aVarG.g(cVar4);
                                this.f13258d = aVarG.e();
                            }
                            this.f13256b |= 2;
                        } else if (iN == 26) {
                            if ((this.f13256b & 4) == 4) {
                                c cVar5 = this.f13259e;
                                cVar5.getClass();
                                aVarG = c.g(cVar5);
                            }
                            c cVar6 = (c) eVar.g(c.f13241h, gVar);
                            this.f13259e = cVar6;
                            if (aVarG != null) {
                                aVarG.g(cVar6);
                                this.f13259e = aVarG.e();
                            }
                            this.f13256b |= 4;
                        } else if (iN == 34) {
                            if ((this.f13256b & 8) == 8) {
                                c cVar7 = this.f13260f;
                                cVar7.getClass();
                                aVarG = c.g(cVar7);
                            }
                            c cVar8 = (c) eVar.g(c.f13241h, gVar);
                            this.f13260f = cVar8;
                            if (aVarG != null) {
                                aVarG.g(cVar8);
                                this.f13260f = aVarG.e();
                            }
                            this.f13256b |= 8;
                        } else if (iN == 42) {
                            if ((this.f13256b & 16) == 16) {
                                c cVar9 = this.f13261g;
                                cVar9.getClass();
                                aVarG = c.g(cVar9);
                            }
                            c cVar10 = (c) eVar.g(c.f13241h, gVar);
                            this.f13261g = cVar10;
                            if (aVarG != null) {
                                aVarG.g(cVar10);
                                this.f13261g = aVarG.e();
                            }
                            this.f13256b |= 16;
                        } else if (!eVar.q(iN, eVarS)) {
                        }
                    }
                    z10 = true;
                } catch (q e7) {
                    e7.f14823a = this;
                    throw e7;
                } catch (IOException e10) {
                    q qVar = new q(e10.getMessage());
                    qVar.f14823a = this;
                    throw qVar;
                }
            } catch (Throwable th) {
                try {
                    eVarS.k();
                } catch (IOException unused) {
                } finally {
                    this.f13255a = cVar2.c();
                }
                throw th;
            }
        }
        try {
            eVarS.k();
        } catch (IOException unused2) {
        } finally {
            this.f13255a = cVar2.c();
        }
    }

    @Override // xa.a
    public final int a() {
        int i7 = this.f13263i;
        if (i7 != -1) {
            return i7;
        }
        int iF = (this.f13256b & 1) == 1 ? d3.e.f(1, this.f13257c) : 0;
        if ((this.f13256b & 2) == 2) {
            iF += d3.e.f(2, this.f13258d);
        }
        if ((this.f13256b & 4) == 4) {
            iF += d3.e.f(3, this.f13259e);
        }
        if ((this.f13256b & 8) == 8) {
            iF += d3.e.f(4, this.f13260f);
        }
        if ((this.f13256b & 16) == 16) {
            iF += d3.e.f(5, this.f13261g);
        }
        int size = this.f13255a.size() + iF;
        this.f13263i = size;
        return size;
    }

    @Override // xa.a
    public final xa.i b() {
        return d.e();
    }

    @Override // xa.a
    public final xa.i c() {
        d dVarE = d.e();
        dVarE.f(this);
        return dVarE;
    }

    @Override // xa.a
    public final void d(d3.e eVar) throws IOException {
        a();
        if ((this.f13256b & 1) == 1) {
            eVar.C(1, this.f13257c);
        }
        if ((this.f13256b & 2) == 2) {
            eVar.C(2, this.f13258d);
        }
        if ((this.f13256b & 4) == 4) {
            eVar.C(3, this.f13259e);
        }
        if ((this.f13256b & 8) == 8) {
            eVar.C(4, this.f13260f);
        }
        if ((this.f13256b & 16) == 16) {
            eVar.C(5, this.f13261g);
        }
        eVar.F(this.f13255a);
    }

    @Override // xa.u
    public final boolean isInitialized() {
        if (this.f13262h == 1) {
            return true;
        }
        this.f13262h = (byte) 1;
        return true;
    }
}
