package ra;

import com.baidu.carlife.sdk.Constants;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a1 extends xa.k {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a1 f11822l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f11823m = new a(22);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xa.d f11824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11825c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f11826d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f11827e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public s0 f11828f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f11829g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public s0 f11830h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f11831i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public byte f11832j;
    public int k;

    static {
        a1 a1Var = new a1();
        f11822l = a1Var;
        a1Var.f11826d = 0;
        a1Var.f11827e = 0;
        s0 s0Var = s0.f12166t;
        a1Var.f11828f = s0Var;
        a1Var.f11829g = 0;
        a1Var.f11830h = s0Var;
        a1Var.f11831i = 0;
    }

    public a1() {
        this.f11832j = (byte) -1;
        this.k = -1;
        this.f11824b = xa.d.f14765a;
    }

    public a1(z0 z0Var) {
        super(z0Var);
        this.f11832j = (byte) -1;
        this.k = -1;
        this.f11824b = z0Var.f14792a;
    }

    public a1(xa.e eVar, xa.g gVar) {
        this.f11832j = (byte) -1;
        this.k = -1;
        boolean z10 = false;
        this.f11826d = 0;
        this.f11827e = 0;
        s0 s0Var = s0.f12166t;
        this.f11828f = s0Var;
        this.f11829g = 0;
        this.f11830h = s0Var;
        this.f11831i = 0;
        xa.c cVar = new xa.c();
        d3.e eVarS = d3.e.s(cVar, 1);
        while (!z10) {
            try {
                try {
                    int iN = eVar.n();
                    if (iN != 0) {
                        if (iN == 8) {
                            this.f11825c |= 1;
                            this.f11826d = eVar.k();
                        } else if (iN != 16) {
                            r0 r0VarO = null;
                            if (iN == 26) {
                                if ((this.f11825c & 4) == 4) {
                                    s0 s0Var2 = this.f11828f;
                                    s0Var2.getClass();
                                    r0VarO = s0.o(s0Var2);
                                }
                                s0 s0Var3 = (s0) eVar.g(s0.f12167u, gVar);
                                this.f11828f = s0Var3;
                                if (r0VarO != null) {
                                    r0VarO.g(s0Var3);
                                    this.f11828f = r0VarO.e();
                                }
                                this.f11825c |= 4;
                            } else if (iN == 34) {
                                if ((this.f11825c & 16) == 16) {
                                    s0 s0Var4 = this.f11830h;
                                    s0Var4.getClass();
                                    r0VarO = s0.o(s0Var4);
                                }
                                s0 s0Var5 = (s0) eVar.g(s0.f12167u, gVar);
                                this.f11830h = s0Var5;
                                if (r0VarO != null) {
                                    r0VarO.g(s0Var5);
                                    this.f11830h = r0VarO.e();
                                }
                                this.f11825c |= 16;
                            } else if (iN == 40) {
                                this.f11825c |= 8;
                                this.f11829g = eVar.k();
                            } else if (iN == 48) {
                                this.f11825c |= 32;
                                this.f11831i = eVar.k();
                            } else if (!l(eVar, eVarS, gVar, iN)) {
                            }
                        } else {
                            this.f11825c |= 2;
                            this.f11827e = eVar.k();
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
                try {
                    eVarS.k();
                } catch (IOException unused) {
                } finally {
                    this.f11824b = cVar.c();
                }
                k();
                throw th;
            }
        }
        try {
            eVarS.k();
        } catch (IOException unused2) {
        } finally {
            this.f11824b = cVar.c();
        }
        k();
    }

    @Override // xa.a
    public final int a() {
        int i7 = this.k;
        if (i7 != -1) {
            return i7;
        }
        int iD = (this.f11825c & 1) == 1 ? d3.e.d(1, this.f11826d) : 0;
        if ((this.f11825c & 2) == 2) {
            iD += d3.e.d(2, this.f11827e);
        }
        if ((this.f11825c & 4) == 4) {
            iD += d3.e.f(3, this.f11828f);
        }
        if ((this.f11825c & 16) == 16) {
            iD += d3.e.f(4, this.f11830h);
        }
        if ((this.f11825c & 8) == 8) {
            iD += d3.e.d(5, this.f11829g);
        }
        if ((this.f11825c & 32) == 32) {
            iD += d3.e.d(6, this.f11831i);
        }
        int size = this.f11824b.size() + h() + iD;
        this.k = size;
        return size;
    }

    @Override // xa.a
    public final xa.i b() {
        z0 z0Var = new z0();
        s0 s0Var = s0.f12166t;
        z0Var.f12304g = s0Var;
        z0Var.f12306i = s0Var;
        return z0Var;
    }

    @Override // xa.a
    public final xa.i c() {
        z0 z0Var = new z0();
        s0 s0Var = s0.f12166t;
        z0Var.f12304g = s0Var;
        z0Var.f12306i = s0Var;
        z0Var.f(this);
        return z0Var;
    }

    @Override // xa.a
    public final void d(d3.e eVar) throws IOException {
        a();
        android.support.v4.media.session.r rVar = new android.support.v4.media.session.r(this);
        if ((this.f11825c & 1) == 1) {
            eVar.A(1, this.f11826d);
        }
        if ((this.f11825c & 2) == 2) {
            eVar.A(2, this.f11827e);
        }
        if ((this.f11825c & 4) == 4) {
            eVar.C(3, this.f11828f);
        }
        if ((this.f11825c & 16) == 16) {
            eVar.C(4, this.f11830h);
        }
        if ((this.f11825c & 8) == 8) {
            eVar.A(5, this.f11829g);
        }
        if ((this.f11825c & 32) == 32) {
            eVar.A(6, this.f11831i);
        }
        rVar.P(Constants.MSG_RESPONSE_SUCCESS, eVar);
        eVar.F(this.f11824b);
    }

    @Override // xa.u
    public final xa.a getDefaultInstanceForType() {
        return f11822l;
    }

    @Override // xa.u
    public final boolean isInitialized() {
        byte b10 = this.f11832j;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        int i7 = this.f11825c;
        if ((i7 & 2) != 2) {
            this.f11832j = (byte) 0;
            return false;
        }
        if ((i7 & 4) == 4 && !this.f11828f.isInitialized()) {
            this.f11832j = (byte) 0;
            return false;
        }
        if ((this.f11825c & 16) == 16 && !this.f11830h.isInitialized()) {
            this.f11832j = (byte) 0;
            return false;
        }
        if (g()) {
            this.f11832j = (byte) 1;
            return true;
        }
        this.f11832j = (byte) 0;
        return false;
    }
}
