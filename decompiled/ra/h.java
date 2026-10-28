package ra;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class h extends xa.n {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final h f11960g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f11961h = new a(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xa.d f11962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11964c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f11965d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte f11966e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f11967f;

    static {
        h hVar = new h();
        f11960g = hVar;
        hVar.f11964c = 0;
        hVar.f11965d = Collections.EMPTY_LIST;
    }

    public h() {
        this.f11966e = (byte) -1;
        this.f11967f = -1;
        this.f11962a = xa.d.f14765a;
    }

    public h(g gVar) {
        this.f11966e = (byte) -1;
        this.f11967f = -1;
        this.f11962a = gVar.f14792a;
    }

    public h(xa.e eVar, xa.g gVar) {
        this.f11966e = (byte) -1;
        this.f11967f = -1;
        boolean z10 = false;
        this.f11964c = 0;
        this.f11965d = Collections.EMPTY_LIST;
        xa.c cVar = new xa.c();
        d3.e eVarS = d3.e.s(cVar, 1);
        char c10 = 0;
        while (!z10) {
            try {
                try {
                    try {
                        int iN = eVar.n();
                        if (iN != 0) {
                            if (iN == 8) {
                                this.f11963b |= 1;
                                this.f11964c = eVar.k();
                            } else if (iN == 18) {
                                if ((c10 & 2) != 2) {
                                    this.f11965d = new ArrayList();
                                    c10 = 2;
                                }
                                this.f11965d.add(eVar.g(f.f11927h, gVar));
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
                if ((c10 & 2) == 2) {
                    this.f11965d = Collections.unmodifiableList(this.f11965d);
                }
                try {
                    eVarS.k();
                } catch (IOException unused) {
                } finally {
                    this.f11962a = cVar.c();
                }
                throw th;
            }
        }
        if ((c10 & 2) == 2) {
            this.f11965d = Collections.unmodifiableList(this.f11965d);
        }
        try {
            eVarS.k();
        } catch (IOException unused2) {
        } finally {
            this.f11962a = cVar.c();
        }
    }

    @Override // xa.a
    public final int a() {
        int i7 = this.f11967f;
        if (i7 != -1) {
            return i7;
        }
        int iD = (this.f11963b & 1) == 1 ? d3.e.d(1, this.f11964c) : 0;
        for (int i10 = 0; i10 < this.f11965d.size(); i10++) {
            iD += d3.e.f(2, (xa.a) this.f11965d.get(i10));
        }
        int size = this.f11962a.size() + iD;
        this.f11967f = size;
        return size;
    }

    @Override // xa.a
    public final xa.i b() {
        g gVar = new g(0);
        gVar.f11947d = Collections.EMPTY_LIST;
        return gVar;
    }

    @Override // xa.a
    public final xa.i c() {
        g gVar = new g(0);
        gVar.f11947d = Collections.EMPTY_LIST;
        gVar.g(this);
        return gVar;
    }

    @Override // xa.a
    public final void d(d3.e eVar) throws IOException {
        a();
        if ((this.f11963b & 1) == 1) {
            eVar.A(1, this.f11964c);
        }
        for (int i7 = 0; i7 < this.f11965d.size(); i7++) {
            eVar.C(2, (xa.a) this.f11965d.get(i7));
        }
        eVar.F(this.f11962a);
    }

    @Override // xa.u
    public final boolean isInitialized() {
        byte b10 = this.f11966e;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if ((this.f11963b & 1) != 1) {
            this.f11966e = (byte) 0;
            return false;
        }
        for (int i7 = 0; i7 < this.f11965d.size(); i7++) {
            if (!((f) this.f11965d.get(i7)).isInitialized()) {
                this.f11966e = (byte) 0;
                return false;
            }
        }
        this.f11966e = (byte) 1;
        return true;
    }
}
