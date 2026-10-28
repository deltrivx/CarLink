package ra;

import com.baidu.carlife.sdk.Constants;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class u0 extends xa.k {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final u0 f12207p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final a f12208q = new a(19);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xa.d f12209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12210c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12211d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12212e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List f12213f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public s0 f12214g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f12215h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public s0 f12216i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f12217j;
    public List k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public List f12218l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public List f12219m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public byte f12220n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f12221o;

    static {
        u0 u0Var = new u0();
        f12207p = u0Var;
        u0Var.f12211d = 6;
        u0Var.f12212e = 0;
        List list = Collections.EMPTY_LIST;
        u0Var.f12213f = list;
        s0 s0Var = s0.f12166t;
        u0Var.f12214g = s0Var;
        u0Var.f12215h = 0;
        u0Var.f12216i = s0Var;
        u0Var.f12217j = 0;
        u0Var.k = list;
        u0Var.f12218l = list;
        u0Var.f12219m = list;
    }

    public u0() {
        this.f12220n = (byte) -1;
        this.f12221o = -1;
        this.f12209b = xa.d.f14765a;
    }

    public u0(t0 t0Var) {
        super(t0Var);
        this.f12220n = (byte) -1;
        this.f12221o = -1;
        this.f12209b = t0Var.f14792a;
    }

    public u0(xa.e eVar, xa.g gVar) {
        this.f12220n = (byte) -1;
        this.f12221o = -1;
        this.f12211d = 6;
        boolean z10 = false;
        this.f12212e = 0;
        List list = Collections.EMPTY_LIST;
        this.f12213f = list;
        s0 s0Var = s0.f12166t;
        this.f12214g = s0Var;
        this.f12215h = 0;
        this.f12216i = s0Var;
        this.f12217j = 0;
        this.k = list;
        this.f12218l = list;
        this.f12219m = list;
        xa.c cVar = new xa.c();
        d3.e eVarS = d3.e.s(cVar, 1);
        int i7 = 0;
        while (!z10) {
            try {
                try {
                    int iN = eVar.n();
                    r0 r0VarO = null;
                    switch (iN) {
                        case 0:
                            break;
                        case 8:
                            this.f12210c |= 1;
                            this.f12211d = eVar.k();
                            continue;
                        case 16:
                            this.f12210c |= 2;
                            this.f12212e = eVar.k();
                            continue;
                        case ServiceTypes.KEYCODE_MOVE_UP_RIGHT /* 26 */:
                            if ((i7 & 4) != 4) {
                                this.f12213f = new ArrayList();
                                i7 |= 4;
                            }
                            this.f12213f.add(eVar.g(x0.f12255n, gVar));
                            continue;
                        case ServiceTypes.KEYCODE_VR_STOP /* 34 */:
                            if ((this.f12210c & 4) == 4) {
                                s0 s0Var2 = this.f12214g;
                                s0Var2.getClass();
                                r0VarO = s0.o(s0Var2);
                            }
                            s0 s0Var3 = (s0) eVar.g(s0.f12167u, gVar);
                            this.f12214g = s0Var3;
                            if (r0VarO != null) {
                                r0VarO.g(s0Var3);
                                this.f12214g = r0VarO.e();
                            }
                            this.f12210c |= 4;
                            continue;
                        case ServiceTypes.KEYCODE_NUMBER_5 /* 40 */:
                            this.f12210c |= 8;
                            this.f12215h = eVar.k();
                            continue;
                        case 50:
                            if ((this.f12210c & 16) == 16) {
                                s0 s0Var4 = this.f12216i;
                                s0Var4.getClass();
                                r0VarO = s0.o(s0Var4);
                            }
                            s0 s0Var5 = (s0) eVar.g(s0.f12167u, gVar);
                            this.f12216i = s0Var5;
                            if (r0VarO != null) {
                                r0VarO.g(s0Var5);
                                this.f12216i = r0VarO.e();
                            }
                            this.f12210c |= 16;
                            continue;
                        case 56:
                            this.f12210c |= 32;
                            this.f12217j = eVar.k();
                            continue;
                        case 66:
                            if ((i7 & 128) != 128) {
                                this.k = new ArrayList();
                                i7 |= 128;
                            }
                            this.k.add(eVar.g(h.f11961h, gVar));
                            continue;
                        case 248:
                            if ((i7 & 256) != 256) {
                                this.f12218l = new ArrayList();
                                i7 |= 256;
                            }
                            this.f12218l.add(Integer.valueOf(eVar.k()));
                            continue;
                        case 250:
                            int iD = eVar.d(eVar.k());
                            if ((i7 & 256) != 256 && eVar.b() > 0) {
                                this.f12218l = new ArrayList();
                                i7 |= 256;
                            }
                            while (eVar.b() > 0) {
                                this.f12218l.add(Integer.valueOf(eVar.k()));
                            }
                            eVar.c(iD);
                            continue;
                        case 258:
                            if ((i7 & 512) != 512) {
                                this.f12219m = new ArrayList();
                                i7 |= 512;
                            }
                            this.f12219m.add(eVar.g(l.f12067h, gVar));
                            continue;
                        default:
                            if (!l(eVar, eVarS, gVar, iN)) {
                                break;
                            }
                            break;
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
                if ((i7 & 4) == 4) {
                    this.f12213f = Collections.unmodifiableList(this.f12213f);
                }
                if ((i7 & 128) == 128) {
                    this.k = Collections.unmodifiableList(this.k);
                }
                if ((i7 & 256) == 256) {
                    this.f12218l = Collections.unmodifiableList(this.f12218l);
                }
                if ((i7 & 512) == 512) {
                    this.f12219m = Collections.unmodifiableList(this.f12219m);
                }
                try {
                    eVarS.k();
                } catch (IOException unused) {
                } finally {
                    this.f12209b = cVar.c();
                }
                k();
                throw th;
            }
        }
        if ((i7 & 4) == 4) {
            this.f12213f = Collections.unmodifiableList(this.f12213f);
        }
        if ((i7 & 128) == 128) {
            this.k = Collections.unmodifiableList(this.k);
        }
        if ((i7 & 256) == 256) {
            this.f12218l = Collections.unmodifiableList(this.f12218l);
        }
        if ((i7 & 512) == 512) {
            this.f12219m = Collections.unmodifiableList(this.f12219m);
        }
        try {
            eVarS.k();
        } catch (IOException unused2) {
        } finally {
            this.f12209b = cVar.c();
        }
        k();
    }

    @Override // xa.a
    public final int a() {
        int i7 = this.f12221o;
        if (i7 != -1) {
            return i7;
        }
        int iD = (this.f12210c & 1) == 1 ? d3.e.d(1, this.f12211d) : 0;
        if ((this.f12210c & 2) == 2) {
            iD += d3.e.d(2, this.f12212e);
        }
        for (int i10 = 0; i10 < this.f12213f.size(); i10++) {
            iD += d3.e.f(3, (xa.a) this.f12213f.get(i10));
        }
        if ((this.f12210c & 4) == 4) {
            iD += d3.e.f(4, this.f12214g);
        }
        if ((this.f12210c & 8) == 8) {
            iD += d3.e.d(5, this.f12215h);
        }
        if ((this.f12210c & 16) == 16) {
            iD += d3.e.f(6, this.f12216i);
        }
        if ((this.f12210c & 32) == 32) {
            iD += d3.e.d(7, this.f12217j);
        }
        for (int i11 = 0; i11 < this.k.size(); i11++) {
            iD += d3.e.f(8, (xa.a) this.k.get(i11));
        }
        int iE = 0;
        for (int i12 = 0; i12 < this.f12218l.size(); i12++) {
            iE += d3.e.e(((Integer) this.f12218l.get(i12)).intValue());
        }
        int size = (this.f12218l.size() * 2) + iD + iE;
        for (int i13 = 0; i13 < this.f12219m.size(); i13++) {
            size += d3.e.f(32, (xa.a) this.f12219m.get(i13));
        }
        int size2 = this.f12209b.size() + h() + size;
        this.f12221o = size2;
        return size2;
    }

    @Override // xa.a
    public final xa.i b() {
        return t0.f();
    }

    @Override // xa.a
    public final xa.i c() {
        t0 t0VarF = t0.f();
        t0VarF.g(this);
        return t0VarF;
    }

    @Override // xa.a
    public final void d(d3.e eVar) throws IOException {
        a();
        android.support.v4.media.session.r rVar = new android.support.v4.media.session.r(this);
        if ((this.f12210c & 1) == 1) {
            eVar.A(1, this.f12211d);
        }
        if ((this.f12210c & 2) == 2) {
            eVar.A(2, this.f12212e);
        }
        for (int i7 = 0; i7 < this.f12213f.size(); i7++) {
            eVar.C(3, (xa.a) this.f12213f.get(i7));
        }
        if ((this.f12210c & 4) == 4) {
            eVar.C(4, this.f12214g);
        }
        if ((this.f12210c & 8) == 8) {
            eVar.A(5, this.f12215h);
        }
        if ((this.f12210c & 16) == 16) {
            eVar.C(6, this.f12216i);
        }
        if ((this.f12210c & 32) == 32) {
            eVar.A(7, this.f12217j);
        }
        for (int i10 = 0; i10 < this.k.size(); i10++) {
            eVar.C(8, (xa.a) this.k.get(i10));
        }
        for (int i11 = 0; i11 < this.f12218l.size(); i11++) {
            eVar.A(31, ((Integer) this.f12218l.get(i11)).intValue());
        }
        for (int i12 = 0; i12 < this.f12219m.size(); i12++) {
            eVar.C(32, (xa.a) this.f12219m.get(i12));
        }
        rVar.P(Constants.MSG_RESPONSE_SUCCESS, eVar);
        eVar.F(this.f12209b);
    }

    @Override // xa.u
    public final xa.a getDefaultInstanceForType() {
        return f12207p;
    }

    @Override // xa.u
    public final boolean isInitialized() {
        byte b10 = this.f12220n;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if ((this.f12210c & 2) != 2) {
            this.f12220n = (byte) 0;
            return false;
        }
        for (int i7 = 0; i7 < this.f12213f.size(); i7++) {
            if (!((x0) this.f12213f.get(i7)).isInitialized()) {
                this.f12220n = (byte) 0;
                return false;
            }
        }
        if ((this.f12210c & 4) == 4 && !this.f12214g.isInitialized()) {
            this.f12220n = (byte) 0;
            return false;
        }
        if ((this.f12210c & 16) == 16 && !this.f12216i.isInitialized()) {
            this.f12220n = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < this.k.size(); i10++) {
            if (!((h) this.k.get(i10)).isInitialized()) {
                this.f12220n = (byte) 0;
                return false;
            }
        }
        for (int i11 = 0; i11 < this.f12219m.size(); i11++) {
            if (!((l) this.f12219m.get(i11)).isInitialized()) {
                this.f12220n = (byte) 0;
                return false;
            }
        }
        if (g()) {
            this.f12220n = (byte) 1;
            return true;
        }
        this.f12220n = (byte) 0;
        return false;
    }
}
