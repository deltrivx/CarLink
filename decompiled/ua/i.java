package ua;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import xa.n;
import xa.q;
import xa.t;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class i extends n {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final i f13279m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final ra.a f13280n = new ra.a(29);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xa.d f13281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13283c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f13284d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f13285e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public h f13286f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List f13287g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f13288h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List f13289i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f13290j;
    public byte k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f13291l;

    static {
        i iVar = new i();
        f13279m = iVar;
        iVar.f13283c = 1;
        iVar.f13284d = 0;
        iVar.f13285e = "";
        iVar.f13286f = h.NONE;
        List list = Collections.EMPTY_LIST;
        iVar.f13287g = list;
        iVar.f13289i = list;
    }

    public i() {
        this.f13288h = -1;
        this.f13290j = -1;
        this.k = (byte) -1;
        this.f13291l = -1;
        this.f13281a = xa.d.f14765a;
    }

    public i(g gVar) {
        this.f13288h = -1;
        this.f13290j = -1;
        this.k = (byte) -1;
        this.f13291l = -1;
        this.f13281a = gVar.f14792a;
    }

    public i(xa.e eVar) {
        this.f13288h = -1;
        this.f13290j = -1;
        this.k = (byte) -1;
        this.f13291l = -1;
        this.f13283c = 1;
        boolean z10 = false;
        this.f13284d = 0;
        this.f13285e = "";
        h hVar = h.NONE;
        this.f13286f = hVar;
        List list = Collections.EMPTY_LIST;
        this.f13287g = list;
        this.f13289i = list;
        xa.c cVar = new xa.c();
        d3.e eVarS = d3.e.s(cVar, 1);
        int i7 = 0;
        while (!z10) {
            try {
                try {
                    int iN = eVar.n();
                    if (iN != 0) {
                        if (iN == 8) {
                            this.f13282b |= 1;
                            this.f13283c = eVar.k();
                        } else if (iN == 16) {
                            this.f13282b |= 2;
                            this.f13284d = eVar.k();
                        } else if (iN == 24) {
                            int iK = eVar.k();
                            h hVar2 = iK != 0 ? iK != 1 ? iK != 2 ? null : h.DESC_TO_CLASS_ID : h.INTERNAL_TO_CLASS_ID : hVar;
                            if (hVar2 == null) {
                                eVarS.J(iN);
                                eVarS.J(iK);
                            } else {
                                this.f13282b |= 8;
                                this.f13286f = hVar2;
                            }
                        } else if (iN == 32) {
                            if ((i7 & 16) != 16) {
                                this.f13287g = new ArrayList();
                                i7 |= 16;
                            }
                            this.f13287g.add(Integer.valueOf(eVar.k()));
                        } else if (iN == 34) {
                            int iD = eVar.d(eVar.k());
                            if ((i7 & 16) != 16 && eVar.b() > 0) {
                                this.f13287g = new ArrayList();
                                i7 |= 16;
                            }
                            while (eVar.b() > 0) {
                                this.f13287g.add(Integer.valueOf(eVar.k()));
                            }
                            eVar.c(iD);
                        } else if (iN == 40) {
                            if ((i7 & 32) != 32) {
                                this.f13289i = new ArrayList();
                                i7 |= 32;
                            }
                            this.f13289i.add(Integer.valueOf(eVar.k()));
                        } else if (iN == 42) {
                            int iD2 = eVar.d(eVar.k());
                            if ((i7 & 32) != 32 && eVar.b() > 0) {
                                this.f13289i = new ArrayList();
                                i7 |= 32;
                            }
                            while (eVar.b() > 0) {
                                this.f13289i.add(Integer.valueOf(eVar.k()));
                            }
                            eVar.c(iD2);
                        } else if (iN == 50) {
                            t tVarE = eVar.e();
                            this.f13282b |= 4;
                            this.f13285e = tVarE;
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
                if ((i7 & 16) == 16) {
                    this.f13287g = Collections.unmodifiableList(this.f13287g);
                }
                if ((i7 & 32) == 32) {
                    this.f13289i = Collections.unmodifiableList(this.f13289i);
                }
                try {
                    eVarS.k();
                } catch (IOException unused) {
                } finally {
                    this.f13281a = cVar.c();
                }
                throw th;
            }
        }
        if ((i7 & 16) == 16) {
            this.f13287g = Collections.unmodifiableList(this.f13287g);
        }
        if ((i7 & 32) == 32) {
            this.f13289i = Collections.unmodifiableList(this.f13289i);
        }
        try {
            eVarS.k();
        } catch (IOException unused2) {
        } finally {
            this.f13281a = cVar.c();
        }
    }

    @Override // xa.a
    public final int a() {
        xa.d tVar;
        int i7 = this.f13291l;
        if (i7 != -1) {
            return i7;
        }
        int iD = (this.f13282b & 1) == 1 ? d3.e.d(1, this.f13283c) : 0;
        if ((this.f13282b & 2) == 2) {
            iD += d3.e.d(2, this.f13284d);
        }
        if ((this.f13282b & 8) == 8) {
            iD += d3.e.c(3, this.f13286f.f13278a);
        }
        int iE = 0;
        for (int i10 = 0; i10 < this.f13287g.size(); i10++) {
            iE += d3.e.e(((Integer) this.f13287g.get(i10)).intValue());
        }
        int iE2 = iD + iE;
        if (!this.f13287g.isEmpty()) {
            iE2 = iE2 + 1 + d3.e.e(iE);
        }
        this.f13288h = iE;
        int iE3 = 0;
        for (int i11 = 0; i11 < this.f13289i.size(); i11++) {
            iE3 += d3.e.e(((Integer) this.f13289i.get(i11)).intValue());
        }
        int size = iE2 + iE3;
        if (!this.f13289i.isEmpty()) {
            size = size + 1 + d3.e.e(iE3);
        }
        this.f13290j = iE3;
        if ((this.f13282b & 4) == 4) {
            Object obj = this.f13285e;
            if (obj instanceof String) {
                try {
                    tVar = new t(((String) obj).getBytes("UTF-8"));
                    this.f13285e = tVar;
                } catch (UnsupportedEncodingException e7) {
                    throw new RuntimeException("UTF-8 not supported?", e7);
                }
            } else {
                tVar = (xa.d) obj;
            }
            size += tVar.size() + d3.e.h(tVar.size()) + d3.e.j(6);
        }
        int size2 = this.f13281a.size() + size;
        this.f13291l = size2;
        return size2;
    }

    @Override // xa.a
    public final xa.i b() {
        return g.e();
    }

    @Override // xa.a
    public final xa.i c() {
        g gVarE = g.e();
        gVarE.f(this);
        return gVarE;
    }

    @Override // xa.a
    public final void d(d3.e eVar) throws IOException {
        xa.d tVar;
        a();
        if ((this.f13282b & 1) == 1) {
            eVar.A(1, this.f13283c);
        }
        if ((this.f13282b & 2) == 2) {
            eVar.A(2, this.f13284d);
        }
        if ((this.f13282b & 8) == 8) {
            eVar.z(3, this.f13286f.f13278a);
        }
        if (this.f13287g.size() > 0) {
            eVar.J(34);
            eVar.J(this.f13288h);
        }
        for (int i7 = 0; i7 < this.f13287g.size(); i7++) {
            eVar.B(((Integer) this.f13287g.get(i7)).intValue());
        }
        if (this.f13289i.size() > 0) {
            eVar.J(42);
            eVar.J(this.f13290j);
        }
        for (int i10 = 0; i10 < this.f13289i.size(); i10++) {
            eVar.B(((Integer) this.f13289i.get(i10)).intValue());
        }
        if ((this.f13282b & 4) == 4) {
            Object obj = this.f13285e;
            if (obj instanceof String) {
                try {
                    tVar = new t(((String) obj).getBytes("UTF-8"));
                    this.f13285e = tVar;
                } catch (UnsupportedEncodingException e7) {
                    throw new RuntimeException("UTF-8 not supported?", e7);
                }
            } else {
                tVar = (xa.d) obj;
            }
            eVar.L(6, 2);
            eVar.J(tVar.size());
            eVar.F(tVar);
        }
        eVar.F(this.f13281a);
    }

    @Override // xa.u
    public final boolean isInitialized() {
        if (this.k == 1) {
            return true;
        }
        this.k = (byte) 1;
        return true;
    }
}
