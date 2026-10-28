package ua;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import xa.n;
import xa.q;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class j extends n {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final j f13292g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ra.a f13293h = new ra.a(28);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xa.d f13294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f13295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f13296c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f13297d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte f13298e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f13299f;

    static {
        j jVar = new j();
        f13292g = jVar;
        List list = Collections.EMPTY_LIST;
        jVar.f13295b = list;
        jVar.f13296c = list;
    }

    public j() {
        this.f13297d = -1;
        this.f13298e = (byte) -1;
        this.f13299f = -1;
        this.f13294a = xa.d.f14765a;
    }

    public j(f fVar) {
        this.f13297d = -1;
        this.f13298e = (byte) -1;
        this.f13299f = -1;
        this.f13294a = fVar.f14792a;
    }

    public j(xa.e eVar, xa.g gVar) {
        this.f13297d = -1;
        this.f13298e = (byte) -1;
        this.f13299f = -1;
        List list = Collections.EMPTY_LIST;
        this.f13295b = list;
        this.f13296c = list;
        xa.c cVar = new xa.c();
        d3.e eVarS = d3.e.s(cVar, 1);
        boolean z10 = false;
        int i7 = 0;
        while (!z10) {
            try {
                try {
                    int iN = eVar.n();
                    if (iN != 0) {
                        if (iN == 10) {
                            if ((i7 & 1) != 1) {
                                this.f13295b = new ArrayList();
                                i7 |= 1;
                            }
                            this.f13295b.add(eVar.g(i.f13280n, gVar));
                        } else if (iN == 40) {
                            if ((i7 & 2) != 2) {
                                this.f13296c = new ArrayList();
                                i7 |= 2;
                            }
                            this.f13296c.add(Integer.valueOf(eVar.k()));
                        } else if (iN == 42) {
                            int iD = eVar.d(eVar.k());
                            if ((i7 & 2) != 2 && eVar.b() > 0) {
                                this.f13296c = new ArrayList();
                                i7 |= 2;
                            }
                            while (eVar.b() > 0) {
                                this.f13296c.add(Integer.valueOf(eVar.k()));
                            }
                            eVar.c(iD);
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
                if ((i7 & 1) == 1) {
                    this.f13295b = Collections.unmodifiableList(this.f13295b);
                }
                if ((i7 & 2) == 2) {
                    this.f13296c = Collections.unmodifiableList(this.f13296c);
                }
                try {
                    eVarS.k();
                } catch (IOException unused) {
                } finally {
                    this.f13294a = cVar.c();
                }
                throw th;
            }
        }
        if ((i7 & 1) == 1) {
            this.f13295b = Collections.unmodifiableList(this.f13295b);
        }
        if ((i7 & 2) == 2) {
            this.f13296c = Collections.unmodifiableList(this.f13296c);
        }
        try {
            eVarS.k();
        } catch (IOException unused2) {
        } finally {
            this.f13294a = cVar.c();
        }
    }

    @Override // xa.a
    public final int a() {
        int i7 = this.f13299f;
        if (i7 != -1) {
            return i7;
        }
        int iF = 0;
        for (int i10 = 0; i10 < this.f13295b.size(); i10++) {
            iF += d3.e.f(1, (xa.a) this.f13295b.get(i10));
        }
        int iE = 0;
        for (int i11 = 0; i11 < this.f13296c.size(); i11++) {
            iE += d3.e.e(((Integer) this.f13296c.get(i11)).intValue());
        }
        int iE2 = iF + iE;
        if (!this.f13296c.isEmpty()) {
            iE2 = iE2 + 1 + d3.e.e(iE);
        }
        this.f13297d = iE;
        int size = this.f13294a.size() + iE2;
        this.f13299f = size;
        return size;
    }

    @Override // xa.a
    public final xa.i b() {
        f fVar = new f();
        List list = Collections.EMPTY_LIST;
        fVar.f13265c = list;
        fVar.f13266d = list;
        return fVar;
    }

    @Override // xa.a
    public final xa.i c() {
        f fVar = new f();
        List list = Collections.EMPTY_LIST;
        fVar.f13265c = list;
        fVar.f13266d = list;
        fVar.e(this);
        return fVar;
    }

    @Override // xa.a
    public final void d(d3.e eVar) throws IOException {
        a();
        for (int i7 = 0; i7 < this.f13295b.size(); i7++) {
            eVar.C(1, (xa.a) this.f13295b.get(i7));
        }
        if (this.f13296c.size() > 0) {
            eVar.J(42);
            eVar.J(this.f13297d);
        }
        for (int i10 = 0; i10 < this.f13296c.size(); i10++) {
            eVar.B(((Integer) this.f13296c.get(i10)).intValue());
        }
        eVar.F(this.f13294a);
    }

    @Override // xa.u
    public final boolean isInitialized() {
        if (this.f13298e == 1) {
            return true;
        }
        this.f13298e = (byte) 1;
        return true;
    }
}
