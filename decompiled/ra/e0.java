package ra;

import com.baidu.carlife.sdk.Constants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends xa.k {
    public static final e0 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f11905l = new a(11);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xa.d f11906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11907c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f11908d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f11909e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List f11910f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public y0 f11911g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public f1 f11912h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public byte f11913i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f11914j;

    static {
        e0 e0Var = new e0();
        k = e0Var;
        List list = Collections.EMPTY_LIST;
        e0Var.f11908d = list;
        e0Var.f11909e = list;
        e0Var.f11910f = list;
        e0Var.f11911g = y0.f12278g;
        e0Var.f11912h = f1.f11939e;
    }

    public e0() {
        this.f11913i = (byte) -1;
        this.f11914j = -1;
        this.f11906b = xa.d.f14765a;
    }

    public e0(d0 d0Var) {
        super(d0Var);
        this.f11913i = (byte) -1;
        this.f11914j = -1;
        this.f11906b = d0Var.f14792a;
    }

    public e0(xa.e eVar, xa.g gVar) {
        this.f11913i = (byte) -1;
        this.f11914j = -1;
        List list = Collections.EMPTY_LIST;
        this.f11908d = list;
        this.f11909e = list;
        this.f11910f = list;
        this.f11911g = y0.f12278g;
        this.f11912h = f1.f11939e;
        xa.c cVar = new xa.c();
        d3.e eVarS = d3.e.s(cVar, 1);
        boolean z10 = false;
        int i7 = 0;
        while (!z10) {
            try {
                try {
                    int iN = eVar.n();
                    if (iN != 0) {
                        if (iN == 26) {
                            if ((i7 & 1) != 1) {
                                this.f11908d = new ArrayList();
                                i7 |= 1;
                            }
                            this.f11908d.add(eVar.g(a0.f11802w, gVar));
                        } else if (iN == 34) {
                            if ((i7 & 2) != 2) {
                                this.f11909e = new ArrayList();
                                i7 |= 2;
                            }
                            this.f11909e.add(eVar.g(i0.f12006w, gVar));
                        } else if (iN != 42) {
                            o oVar = null;
                            g gVarG = null;
                            if (iN == 242) {
                                if ((this.f11907c & 1) == 1) {
                                    y0 y0Var = this.f11911g;
                                    y0Var.getClass();
                                    gVarG = y0.g(y0Var);
                                }
                                y0 y0Var2 = (y0) eVar.g(y0.f12279h, gVar);
                                this.f11911g = y0Var2;
                                if (gVarG != null) {
                                    gVarG.h(y0Var2);
                                    this.f11911g = gVarG.e();
                                }
                                this.f11907c |= 1;
                            } else if (iN == 258) {
                                if ((this.f11907c & 2) == 2) {
                                    f1 f1Var = this.f11912h;
                                    f1Var.getClass();
                                    oVar = new o(2);
                                    oVar.f12111d = Collections.EMPTY_LIST;
                                    oVar.k(f1Var);
                                }
                                f1 f1Var2 = (f1) eVar.g(f1.f11940f, gVar);
                                this.f11912h = f1Var2;
                                if (oVar != null) {
                                    oVar.k(f1Var2);
                                    this.f11912h = oVar.g();
                                }
                                this.f11907c |= 2;
                            } else if (!l(eVar, eVarS, gVar, iN)) {
                            }
                        } else {
                            if ((i7 & 4) != 4) {
                                this.f11910f = new ArrayList();
                                i7 |= 4;
                            }
                            this.f11910f.add(eVar.g(u0.f12208q, gVar));
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
                if ((i7 & 1) == 1) {
                    this.f11908d = Collections.unmodifiableList(this.f11908d);
                }
                if ((i7 & 2) == 2) {
                    this.f11909e = Collections.unmodifiableList(this.f11909e);
                }
                if ((i7 & 4) == 4) {
                    this.f11910f = Collections.unmodifiableList(this.f11910f);
                }
                try {
                    eVarS.k();
                } catch (IOException unused) {
                } finally {
                    this.f11906b = cVar.c();
                }
                k();
                throw th;
            }
        }
        if ((i7 & 1) == 1) {
            this.f11908d = Collections.unmodifiableList(this.f11908d);
        }
        if ((i7 & 2) == 2) {
            this.f11909e = Collections.unmodifiableList(this.f11909e);
        }
        if ((i7 & 4) == 4) {
            this.f11910f = Collections.unmodifiableList(this.f11910f);
        }
        try {
            eVarS.k();
        } catch (IOException unused2) {
        } finally {
            this.f11906b = cVar.c();
        }
        k();
    }

    @Override // xa.a
    public final int a() {
        int i7 = this.f11914j;
        if (i7 != -1) {
            return i7;
        }
        int iF = 0;
        for (int i10 = 0; i10 < this.f11908d.size(); i10++) {
            iF += d3.e.f(3, (xa.a) this.f11908d.get(i10));
        }
        for (int i11 = 0; i11 < this.f11909e.size(); i11++) {
            iF += d3.e.f(4, (xa.a) this.f11909e.get(i11));
        }
        for (int i12 = 0; i12 < this.f11910f.size(); i12++) {
            iF += d3.e.f(5, (xa.a) this.f11910f.get(i12));
        }
        if ((this.f11907c & 1) == 1) {
            iF += d3.e.f(30, this.f11911g);
        }
        if ((this.f11907c & 2) == 2) {
            iF += d3.e.f(32, this.f11912h);
        }
        int size = this.f11906b.size() + h() + iF;
        this.f11914j = size;
        return size;
    }

    @Override // xa.a
    public final xa.i b() {
        return d0.f();
    }

    @Override // xa.a
    public final xa.i c() {
        d0 d0VarF = d0.f();
        d0VarF.g(this);
        return d0VarF;
    }

    @Override // xa.a
    public final void d(d3.e eVar) throws IOException {
        a();
        android.support.v4.media.session.r rVar = new android.support.v4.media.session.r(this);
        for (int i7 = 0; i7 < this.f11908d.size(); i7++) {
            eVar.C(3, (xa.a) this.f11908d.get(i7));
        }
        for (int i10 = 0; i10 < this.f11909e.size(); i10++) {
            eVar.C(4, (xa.a) this.f11909e.get(i10));
        }
        for (int i11 = 0; i11 < this.f11910f.size(); i11++) {
            eVar.C(5, (xa.a) this.f11910f.get(i11));
        }
        if ((this.f11907c & 1) == 1) {
            eVar.C(30, this.f11911g);
        }
        if ((this.f11907c & 2) == 2) {
            eVar.C(32, this.f11912h);
        }
        rVar.P(Constants.MSG_RESPONSE_SUCCESS, eVar);
        eVar.F(this.f11906b);
    }

    @Override // xa.u
    public final xa.a getDefaultInstanceForType() {
        return k;
    }

    @Override // xa.u
    public final boolean isInitialized() {
        byte b10 = this.f11913i;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i7 = 0; i7 < this.f11908d.size(); i7++) {
            if (!((a0) this.f11908d.get(i7)).isInitialized()) {
                this.f11913i = (byte) 0;
                return false;
            }
        }
        for (int i10 = 0; i10 < this.f11909e.size(); i10++) {
            if (!((i0) this.f11909e.get(i10)).isInitialized()) {
                this.f11913i = (byte) 0;
                return false;
            }
        }
        for (int i11 = 0; i11 < this.f11910f.size(); i11++) {
            if (!((u0) this.f11910f.get(i11)).isInitialized()) {
                this.f11913i = (byte) 0;
                return false;
            }
        }
        if ((this.f11907c & 1) == 1 && !this.f11911g.isInitialized()) {
            this.f11913i = (byte) 0;
            return false;
        }
        if (g()) {
            this.f11913i = (byte) 1;
            return true;
        }
        this.f11913i = (byte) 0;
        return false;
    }
}
