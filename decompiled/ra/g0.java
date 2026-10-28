package ra;

import com.baidu.carlife.sdk.Constants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class g0 extends xa.k {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final g0 f11949j;
    public static final a k = new a(12);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xa.d f11950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11951c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public n0 f11952d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public m0 f11953e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e0 f11954f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List f11955g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public byte f11956h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f11957i;

    static {
        g0 g0Var = new g0();
        f11949j = g0Var;
        g0Var.f11952d = n0.f12103e;
        g0Var.f11953e = m0.f12088e;
        g0Var.f11954f = e0.k;
        g0Var.f11955g = Collections.EMPTY_LIST;
    }

    public g0() {
        this.f11956h = (byte) -1;
        this.f11957i = -1;
        this.f11950b = xa.d.f14765a;
    }

    public g0(f0 f0Var) {
        super(f0Var);
        this.f11956h = (byte) -1;
        this.f11957i = -1;
        this.f11950b = f0Var.f14792a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g0(xa.e eVar, xa.g gVar) {
        this.f11956h = (byte) -1;
        this.f11957i = -1;
        this.f11952d = n0.f12103e;
        this.f11953e = m0.f12088e;
        this.f11954f = e0.k;
        this.f11955g = Collections.EMPTY_LIST;
        xa.c cVar = new xa.c();
        d3.e eVarS = d3.e.s(cVar, 1);
        boolean z10 = false;
        char c10 = 0;
        while (!z10) {
            try {
                try {
                    int iN = eVar.n();
                    if (iN != 0) {
                        d0 d0VarF = null;
                        o oVar = null;
                        o oVar2 = null;
                        if (iN == 10) {
                            if ((this.f11951c & 1) == 1) {
                                n0 n0Var = this.f11952d;
                                n0Var.getClass();
                                oVar = new o(3);
                                oVar.f12111d = xa.r.f14824b;
                                oVar.j(n0Var);
                            }
                            n0 n0Var2 = (n0) eVar.g(n0.f12104f, gVar);
                            this.f11952d = n0Var2;
                            if (oVar != null) {
                                oVar.j(n0Var2);
                                this.f11952d = oVar.f();
                            }
                            this.f11951c |= 1;
                        } else if (iN == 18) {
                            if ((this.f11951c & 2) == 2) {
                                m0 m0Var = this.f11953e;
                                m0Var.getClass();
                                oVar2 = new o(1);
                                oVar2.f12111d = Collections.EMPTY_LIST;
                                oVar2.i(m0Var);
                            }
                            m0 m0Var2 = (m0) eVar.g(m0.f12089f, gVar);
                            this.f11953e = m0Var2;
                            if (oVar2 != null) {
                                oVar2.i(m0Var2);
                                this.f11953e = oVar2.e();
                            }
                            this.f11951c |= 2;
                        } else if (iN == 26) {
                            if ((this.f11951c & 4) == 4) {
                                e0 e0Var = this.f11954f;
                                e0Var.getClass();
                                d0VarF = d0.f();
                                d0VarF.g(e0Var);
                            }
                            e0 e0Var2 = (e0) eVar.g(e0.f11905l, gVar);
                            this.f11954f = e0Var2;
                            if (d0VarF != null) {
                                d0VarF.g(e0Var2);
                                this.f11954f = d0VarF.e();
                            }
                            this.f11951c |= 4;
                        } else if (iN == 34) {
                            if ((c10 & '\b') != 8) {
                                this.f11955g = new ArrayList();
                                c10 = '\b';
                            }
                            this.f11955g.add(eVar.g(k.L, gVar));
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
                if ((c10 & '\b') == 8) {
                    this.f11955g = Collections.unmodifiableList(this.f11955g);
                }
                try {
                    eVarS.k();
                } catch (IOException unused) {
                } finally {
                    this.f11950b = cVar.c();
                }
                k();
                throw th;
            }
        }
        if ((c10 & '\b') == 8) {
            this.f11955g = Collections.unmodifiableList(this.f11955g);
        }
        try {
            eVarS.k();
        } catch (IOException unused2) {
        } finally {
            this.f11950b = cVar.c();
        }
        k();
    }

    @Override // xa.a
    public final int a() {
        int i7 = this.f11957i;
        if (i7 != -1) {
            return i7;
        }
        int iF = (this.f11951c & 1) == 1 ? d3.e.f(1, this.f11952d) : 0;
        if ((this.f11951c & 2) == 2) {
            iF += d3.e.f(2, this.f11953e);
        }
        if ((this.f11951c & 4) == 4) {
            iF += d3.e.f(3, this.f11954f);
        }
        for (int i10 = 0; i10 < this.f11955g.size(); i10++) {
            iF += d3.e.f(4, (xa.a) this.f11955g.get(i10));
        }
        int size = this.f11950b.size() + h() + iF;
        this.f11957i = size;
        return size;
    }

    @Override // xa.a
    public final xa.i b() {
        return f0.f();
    }

    @Override // xa.a
    public final xa.i c() {
        f0 f0VarF = f0.f();
        f0VarF.g(this);
        return f0VarF;
    }

    @Override // xa.a
    public final void d(d3.e eVar) throws IOException {
        a();
        android.support.v4.media.session.r rVar = new android.support.v4.media.session.r(this);
        if ((this.f11951c & 1) == 1) {
            eVar.C(1, this.f11952d);
        }
        if ((this.f11951c & 2) == 2) {
            eVar.C(2, this.f11953e);
        }
        if ((this.f11951c & 4) == 4) {
            eVar.C(3, this.f11954f);
        }
        for (int i7 = 0; i7 < this.f11955g.size(); i7++) {
            eVar.C(4, (xa.a) this.f11955g.get(i7));
        }
        rVar.P(Constants.MSG_RESPONSE_SUCCESS, eVar);
        eVar.F(this.f11950b);
    }

    @Override // xa.u
    public final xa.a getDefaultInstanceForType() {
        return f11949j;
    }

    @Override // xa.u
    public final boolean isInitialized() {
        byte b10 = this.f11956h;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if ((this.f11951c & 2) == 2 && !this.f11953e.isInitialized()) {
            this.f11956h = (byte) 0;
            return false;
        }
        if ((this.f11951c & 4) == 4 && !this.f11954f.isInitialized()) {
            this.f11956h = (byte) 0;
            return false;
        }
        for (int i7 = 0; i7 < this.f11955g.size(); i7++) {
            if (!((k) this.f11955g.get(i7)).isInitialized()) {
                this.f11956h = (byte) 0;
                return false;
            }
        }
        if (g()) {
            this.f11956h = (byte) 1;
            return true;
        }
        this.f11956h = (byte) 0;
        return false;
    }
}
