package ra;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class f1 extends xa.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f1 f11939e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f11940f = new a(24);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xa.d f11941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f11942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte f11943c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f11944d;

    static {
        f1 f1Var = new f1();
        f11939e = f1Var;
        f1Var.f11942b = Collections.EMPTY_LIST;
    }

    public f1() {
        this.f11943c = (byte) -1;
        this.f11944d = -1;
        this.f11941a = xa.d.f14765a;
    }

    public f1(o oVar) {
        this.f11943c = (byte) -1;
        this.f11944d = -1;
        this.f11941a = oVar.f14792a;
    }

    public f1(xa.e eVar, xa.g gVar) {
        this.f11943c = (byte) -1;
        this.f11944d = -1;
        this.f11942b = Collections.EMPTY_LIST;
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
                                this.f11942b = new ArrayList();
                                z11 = true;
                            }
                            this.f11942b.add(eVar.g(e1.f11915l, gVar));
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
                    this.f11942b = Collections.unmodifiableList(this.f11942b);
                }
                try {
                    eVarS.k();
                } catch (IOException unused) {
                } finally {
                    this.f11941a = cVar.c();
                }
                throw th;
            }
        }
        if (z11) {
            this.f11942b = Collections.unmodifiableList(this.f11942b);
        }
        try {
            eVarS.k();
        } catch (IOException unused2) {
        } finally {
            this.f11941a = cVar.c();
        }
    }

    @Override // xa.a
    public final int a() {
        int i7 = this.f11944d;
        if (i7 != -1) {
            return i7;
        }
        int iF = 0;
        for (int i10 = 0; i10 < this.f11942b.size(); i10++) {
            iF += d3.e.f(1, (xa.a) this.f11942b.get(i10));
        }
        int size = this.f11941a.size() + iF;
        this.f11944d = size;
        return size;
    }

    @Override // xa.a
    public final xa.i b() {
        o oVar = new o(2);
        oVar.f12111d = Collections.EMPTY_LIST;
        return oVar;
    }

    @Override // xa.a
    public final xa.i c() {
        o oVar = new o(2);
        oVar.f12111d = Collections.EMPTY_LIST;
        oVar.k(this);
        return oVar;
    }

    @Override // xa.a
    public final void d(d3.e eVar) throws IOException {
        a();
        for (int i7 = 0; i7 < this.f11942b.size(); i7++) {
            eVar.C(1, (xa.a) this.f11942b.get(i7));
        }
        eVar.F(this.f11941a);
    }

    public final o g() {
        o oVar = new o(2);
        oVar.f12111d = Collections.EMPTY_LIST;
        oVar.k(this);
        return oVar;
    }

    @Override // xa.u
    public final boolean isInitialized() {
        if (this.f11943c == 1) {
            return true;
        }
        this.f11943c = (byte) 1;
        return true;
    }
}
