package ra;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class n extends xa.k {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final n f12094j;
    public static final a k = new a(5);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xa.d f12095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12096c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12097d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f12098e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List f12099f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List f12100g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public byte f12101h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f12102i;

    static {
        n nVar = new n();
        f12094j = nVar;
        nVar.f12097d = 6;
        List list = Collections.EMPTY_LIST;
        nVar.f12098e = list;
        nVar.f12099f = list;
        nVar.f12100g = list;
    }

    public n() {
        this.f12101h = (byte) -1;
        this.f12102i = -1;
        this.f12095b = xa.d.f14765a;
    }

    public n(m mVar) {
        super(mVar);
        this.f12101h = (byte) -1;
        this.f12102i = -1;
        this.f12095b = mVar.f14792a;
    }

    public n(xa.e eVar, xa.g gVar) {
        this.f12101h = (byte) -1;
        this.f12102i = -1;
        this.f12097d = 6;
        List list = Collections.EMPTY_LIST;
        this.f12098e = list;
        this.f12099f = list;
        this.f12100g = list;
        xa.c cVar = new xa.c();
        d3.e eVarS = d3.e.s(cVar, 1);
        boolean z10 = false;
        int i7 = 0;
        while (!z10) {
            try {
                try {
                    int iN = eVar.n();
                    if (iN != 0) {
                        if (iN == 8) {
                            this.f12096c |= 1;
                            this.f12097d = eVar.k();
                        } else if (iN == 18) {
                            if ((i7 & 2) != 2) {
                                this.f12098e = new ArrayList();
                                i7 |= 2;
                            }
                            this.f12098e.add(eVar.g(a1.f11823m, gVar));
                        } else if (iN == 248) {
                            if ((i7 & 4) != 4) {
                                this.f12099f = new ArrayList();
                                i7 |= 4;
                            }
                            this.f12099f.add(Integer.valueOf(eVar.k()));
                        } else if (iN == 250) {
                            int iD = eVar.d(eVar.k());
                            if ((i7 & 4) != 4 && eVar.b() > 0) {
                                this.f12099f = new ArrayList();
                                i7 |= 4;
                            }
                            while (eVar.b() > 0) {
                                this.f12099f.add(Integer.valueOf(eVar.k()));
                            }
                            eVar.c(iD);
                        } else if (iN == 258) {
                            if ((i7 & 8) != 8) {
                                this.f12100g = new ArrayList();
                                i7 |= 8;
                            }
                            this.f12100g.add(eVar.g(l.f12067h, gVar));
                        } else if (!l(eVar, eVarS, gVar, iN)) {
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
                if ((i7 & 2) == 2) {
                    this.f12098e = Collections.unmodifiableList(this.f12098e);
                }
                if ((i7 & 4) == 4) {
                    this.f12099f = Collections.unmodifiableList(this.f12099f);
                }
                if ((i7 & 8) == 8) {
                    this.f12100g = Collections.unmodifiableList(this.f12100g);
                }
                try {
                    eVarS.k();
                } catch (IOException unused) {
                } finally {
                    this.f12095b = cVar.c();
                }
                k();
                throw th;
            }
        }
        if ((i7 & 2) == 2) {
            this.f12098e = Collections.unmodifiableList(this.f12098e);
        }
        if ((i7 & 4) == 4) {
            this.f12099f = Collections.unmodifiableList(this.f12099f);
        }
        if ((i7 & 8) == 8) {
            this.f12100g = Collections.unmodifiableList(this.f12100g);
        }
        try {
            eVarS.k();
        } catch (IOException unused2) {
        } finally {
            this.f12095b = cVar.c();
        }
        k();
    }

    @Override // xa.a
    public final int a() {
        int i7 = this.f12102i;
        if (i7 != -1) {
            return i7;
        }
        int iD = (this.f12096c & 1) == 1 ? d3.e.d(1, this.f12097d) : 0;
        for (int i10 = 0; i10 < this.f12098e.size(); i10++) {
            iD += d3.e.f(2, (xa.a) this.f12098e.get(i10));
        }
        int iE = 0;
        for (int i11 = 0; i11 < this.f12099f.size(); i11++) {
            iE += d3.e.e(((Integer) this.f12099f.get(i11)).intValue());
        }
        int size = (this.f12099f.size() * 2) + iD + iE;
        for (int i12 = 0; i12 < this.f12100g.size(); i12++) {
            size += d3.e.f(32, (xa.a) this.f12100g.get(i12));
        }
        int size2 = this.f12095b.size() + h() + size;
        this.f12102i = size2;
        return size2;
    }

    @Override // xa.a
    public final xa.i b() {
        return m.f();
    }

    @Override // xa.a
    public final xa.i c() {
        m mVarF = m.f();
        mVarF.g(this);
        return mVarF;
    }

    @Override // xa.a
    public final void d(d3.e eVar) throws IOException {
        a();
        android.support.v4.media.session.r rVar = new android.support.v4.media.session.r(this);
        if ((this.f12096c & 1) == 1) {
            eVar.A(1, this.f12097d);
        }
        for (int i7 = 0; i7 < this.f12098e.size(); i7++) {
            eVar.C(2, (xa.a) this.f12098e.get(i7));
        }
        for (int i10 = 0; i10 < this.f12099f.size(); i10++) {
            eVar.A(31, ((Integer) this.f12099f.get(i10)).intValue());
        }
        for (int i11 = 0; i11 < this.f12100g.size(); i11++) {
            eVar.C(32, (xa.a) this.f12100g.get(i11));
        }
        rVar.P(19000, eVar);
        eVar.F(this.f12095b);
    }

    @Override // xa.u
    public final xa.a getDefaultInstanceForType() {
        return f12094j;
    }

    @Override // xa.u
    public final boolean isInitialized() {
        byte b10 = this.f12101h;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i7 = 0; i7 < this.f12098e.size(); i7++) {
            if (!((a1) this.f12098e.get(i7)).isInitialized()) {
                this.f12101h = (byte) 0;
                return false;
            }
        }
        for (int i10 = 0; i10 < this.f12100g.size(); i10++) {
            if (!((l) this.f12100g.get(i10)).isInitialized()) {
                this.f12101h = (byte) 0;
                return false;
            }
        }
        if (g()) {
            this.f12101h = (byte) 1;
            return true;
        }
        this.f12101h = (byte) 0;
        return false;
    }
}
