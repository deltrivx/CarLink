package ra;

import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends xa.k {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final a0 f11801v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final a f11802w = new a(10);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xa.d f11803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11804c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f11805d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f11806e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f11807f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public s0 f11808g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f11809h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List f11810i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public s0 f11811j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public List f11812l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public List f11813m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f11814n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public List f11815o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public y0 f11816p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public List f11817q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public p f11818r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public List f11819s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public byte f11820t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f11821u;

    static {
        a0 a0Var = new a0();
        f11801v = a0Var;
        a0Var.n();
    }

    public a0() {
        this.f11814n = -1;
        this.f11820t = (byte) -1;
        this.f11821u = -1;
        this.f11803b = xa.d.f14765a;
    }

    public a0(z zVar) {
        super(zVar);
        this.f11814n = -1;
        this.f11820t = (byte) -1;
        this.f11821u = -1;
        this.f11803b = zVar.f14792a;
    }

    public a0(xa.e eVar, xa.g gVar) {
        this.f11814n = -1;
        this.f11820t = (byte) -1;
        this.f11821u = -1;
        n();
        xa.c cVar = new xa.c();
        d3.e eVarS = d3.e.s(cVar, 1);
        boolean z10 = false;
        int i7 = 0;
        while (!z10) {
            try {
                try {
                    try {
                        int iN = eVar.n();
                        r0 r0VarO = null;
                        o oVar = null;
                        g gVarG = null;
                        r0 r0VarO2 = null;
                        switch (iN) {
                            case 0:
                                z10 = true;
                                continue;
                            case 8:
                                this.f11804c |= 2;
                                this.f11806e = eVar.k();
                                continue;
                            case 16:
                                this.f11804c |= 4;
                                this.f11807f = eVar.k();
                                continue;
                            case ServiceTypes.KEYCODE_MOVE_UP_RIGHT /* 26 */:
                                if ((this.f11804c & 8) == 8) {
                                    s0 s0Var = this.f11808g;
                                    s0Var.getClass();
                                    r0VarO = s0.o(s0Var);
                                }
                                s0 s0Var2 = (s0) eVar.g(s0.f12167u, gVar);
                                this.f11808g = s0Var2;
                                if (r0VarO != null) {
                                    r0VarO.g(s0Var2);
                                    this.f11808g = r0VarO.e();
                                }
                                this.f11804c |= 8;
                                continue;
                            case ServiceTypes.KEYCODE_VR_STOP /* 34 */:
                                if ((i7 & 32) != 32) {
                                    this.f11810i = new ArrayList();
                                    i7 |= 32;
                                }
                                this.f11810i.add(eVar.g(x0.f12255n, gVar));
                                continue;
                            case ServiceTypes.KEYCODE_NUMBER_7 /* 42 */:
                                if ((this.f11804c & 32) == 32) {
                                    s0 s0Var3 = this.f11811j;
                                    s0Var3.getClass();
                                    r0VarO2 = s0.o(s0Var3);
                                }
                                s0 s0Var4 = (s0) eVar.g(s0.f12167u, gVar);
                                this.f11811j = s0Var4;
                                if (r0VarO2 != null) {
                                    r0VarO2.g(s0Var4);
                                    this.f11811j = r0VarO2.e();
                                }
                                this.f11804c |= 32;
                                continue;
                            case 50:
                                if ((i7 & 1024) != 1024) {
                                    this.f11815o = new ArrayList();
                                    i7 |= 1024;
                                }
                                this.f11815o.add(eVar.g(a1.f11823m, gVar));
                                continue;
                            case 56:
                                this.f11804c |= 16;
                                this.f11809h = eVar.k();
                                continue;
                            case ServiceTypes.MSG_VEHICLE_CONTROL_AREA_SEAT_ROW_2_RIGHT /* 64 */:
                                this.f11804c |= 64;
                                this.k = eVar.k();
                                continue;
                            case 72:
                                this.f11804c |= 1;
                                this.f11805d = eVar.k();
                                continue;
                            case 82:
                                if ((i7 & 256) != 256) {
                                    this.f11812l = new ArrayList();
                                    i7 |= 256;
                                }
                                this.f11812l.add(eVar.g(s0.f12167u, gVar));
                                continue;
                            case 88:
                                if ((i7 & 512) != 512) {
                                    this.f11813m = new ArrayList();
                                    i7 |= 512;
                                }
                                this.f11813m.add(Integer.valueOf(eVar.k()));
                                continue;
                            case 90:
                                int iD = eVar.d(eVar.k());
                                if ((i7 & 512) != 512 && eVar.b() > 0) {
                                    this.f11813m = new ArrayList();
                                    i7 |= 512;
                                }
                                while (eVar.b() > 0) {
                                    this.f11813m.add(Integer.valueOf(eVar.k()));
                                }
                                eVar.c(iD);
                                continue;
                            case 242:
                                if ((this.f11804c & 128) == 128) {
                                    y0 y0Var = this.f11816p;
                                    y0Var.getClass();
                                    gVarG = y0.g(y0Var);
                                }
                                y0 y0Var2 = (y0) eVar.g(y0.f12279h, gVar);
                                this.f11816p = y0Var2;
                                if (gVarG != null) {
                                    gVarG.h(y0Var2);
                                    this.f11816p = gVarG.e();
                                }
                                this.f11804c |= 128;
                                continue;
                            case 248:
                                if ((i7 & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_LEFT) != 4096) {
                                    this.f11817q = new ArrayList();
                                    i7 |= ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_LEFT;
                                }
                                this.f11817q.add(Integer.valueOf(eVar.k()));
                                continue;
                            case 250:
                                int iD2 = eVar.d(eVar.k());
                                if ((i7 & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_LEFT) != 4096 && eVar.b() > 0) {
                                    this.f11817q = new ArrayList();
                                    i7 |= ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_LEFT;
                                }
                                while (eVar.b() > 0) {
                                    this.f11817q.add(Integer.valueOf(eVar.k()));
                                }
                                eVar.c(iD2);
                                continue;
                            case 258:
                                if ((this.f11804c & 256) == 256) {
                                    p pVar = this.f11818r;
                                    pVar.getClass();
                                    oVar = new o(0);
                                    oVar.f12111d = Collections.EMPTY_LIST;
                                    oVar.h(pVar);
                                }
                                p pVar2 = (p) eVar.g(p.f12117f, gVar);
                                this.f11818r = pVar2;
                                if (oVar != null) {
                                    oVar.h(pVar2);
                                    this.f11818r = oVar.d();
                                }
                                this.f11804c |= 256;
                                continue;
                            case 266:
                                if ((i7 & 16384) != 16384) {
                                    this.f11819s = new ArrayList();
                                    i7 |= 16384;
                                }
                                this.f11819s.add(eVar.g(l.f12067h, gVar));
                                break;
                            default:
                                if (!l(eVar, eVarS, gVar, iN)) {
                                    z10 = true;
                                }
                                break;
                        }
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
                if ((i7 & 32) == 32) {
                    this.f11810i = Collections.unmodifiableList(this.f11810i);
                }
                if ((i7 & 1024) == 1024) {
                    this.f11815o = Collections.unmodifiableList(this.f11815o);
                }
                if ((i7 & 256) == 256) {
                    this.f11812l = Collections.unmodifiableList(this.f11812l);
                }
                if ((i7 & 512) == 512) {
                    this.f11813m = Collections.unmodifiableList(this.f11813m);
                }
                if ((i7 & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_LEFT) == 4096) {
                    this.f11817q = Collections.unmodifiableList(this.f11817q);
                }
                if ((i7 & 16384) == 16384) {
                    this.f11819s = Collections.unmodifiableList(this.f11819s);
                }
                try {
                    eVarS.k();
                } catch (IOException unused) {
                } finally {
                    this.f11803b = cVar.c();
                }
                k();
                throw th;
            }
        }
        if ((i7 & 32) == 32) {
            this.f11810i = Collections.unmodifiableList(this.f11810i);
        }
        if ((i7 & 1024) == 1024) {
            this.f11815o = Collections.unmodifiableList(this.f11815o);
        }
        if ((i7 & 256) == 256) {
            this.f11812l = Collections.unmodifiableList(this.f11812l);
        }
        if ((i7 & 512) == 512) {
            this.f11813m = Collections.unmodifiableList(this.f11813m);
        }
        if ((i7 & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_LEFT) == 4096) {
            this.f11817q = Collections.unmodifiableList(this.f11817q);
        }
        if ((i7 & 16384) == 16384) {
            this.f11819s = Collections.unmodifiableList(this.f11819s);
        }
        try {
            eVarS.k();
        } catch (IOException unused2) {
        } finally {
            this.f11803b = cVar.c();
        }
        k();
    }

    @Override // xa.a
    public final int a() {
        int i7 = this.f11821u;
        if (i7 != -1) {
            return i7;
        }
        int iD = (this.f11804c & 2) == 2 ? d3.e.d(1, this.f11806e) : 0;
        if ((this.f11804c & 4) == 4) {
            iD += d3.e.d(2, this.f11807f);
        }
        if ((this.f11804c & 8) == 8) {
            iD += d3.e.f(3, this.f11808g);
        }
        for (int i10 = 0; i10 < this.f11810i.size(); i10++) {
            iD += d3.e.f(4, (xa.a) this.f11810i.get(i10));
        }
        if ((this.f11804c & 32) == 32) {
            iD += d3.e.f(5, this.f11811j);
        }
        for (int i11 = 0; i11 < this.f11815o.size(); i11++) {
            iD += d3.e.f(6, (xa.a) this.f11815o.get(i11));
        }
        if ((this.f11804c & 16) == 16) {
            iD += d3.e.d(7, this.f11809h);
        }
        if ((this.f11804c & 64) == 64) {
            iD += d3.e.d(8, this.k);
        }
        if ((this.f11804c & 1) == 1) {
            iD += d3.e.d(9, this.f11805d);
        }
        for (int i12 = 0; i12 < this.f11812l.size(); i12++) {
            iD += d3.e.f(10, (xa.a) this.f11812l.get(i12));
        }
        int iE = 0;
        for (int i13 = 0; i13 < this.f11813m.size(); i13++) {
            iE += d3.e.e(((Integer) this.f11813m.get(i13)).intValue());
        }
        int iF = iD + iE;
        if (!this.f11813m.isEmpty()) {
            iF = iF + 1 + d3.e.e(iE);
        }
        this.f11814n = iE;
        if ((this.f11804c & 128) == 128) {
            iF += d3.e.f(30, this.f11816p);
        }
        int iE2 = 0;
        for (int i14 = 0; i14 < this.f11817q.size(); i14++) {
            iE2 += d3.e.e(((Integer) this.f11817q.get(i14)).intValue());
        }
        int size = (this.f11817q.size() * 2) + iF + iE2;
        if ((this.f11804c & 256) == 256) {
            size += d3.e.f(32, this.f11818r);
        }
        for (int i15 = 0; i15 < this.f11819s.size(); i15++) {
            size += d3.e.f(33, (xa.a) this.f11819s.get(i15));
        }
        int size2 = this.f11803b.size() + h() + size;
        this.f11821u = size2;
        return size2;
    }

    @Override // xa.a
    public final xa.i b() {
        return z.f();
    }

    @Override // xa.a
    public final xa.i c() {
        z zVarF = z.f();
        zVarF.g(this);
        return zVarF;
    }

    @Override // xa.a
    public final void d(d3.e eVar) throws IOException {
        a();
        android.support.v4.media.session.r rVar = new android.support.v4.media.session.r(this);
        if ((this.f11804c & 2) == 2) {
            eVar.A(1, this.f11806e);
        }
        if ((this.f11804c & 4) == 4) {
            eVar.A(2, this.f11807f);
        }
        if ((this.f11804c & 8) == 8) {
            eVar.C(3, this.f11808g);
        }
        for (int i7 = 0; i7 < this.f11810i.size(); i7++) {
            eVar.C(4, (xa.a) this.f11810i.get(i7));
        }
        if ((this.f11804c & 32) == 32) {
            eVar.C(5, this.f11811j);
        }
        for (int i10 = 0; i10 < this.f11815o.size(); i10++) {
            eVar.C(6, (xa.a) this.f11815o.get(i10));
        }
        if ((this.f11804c & 16) == 16) {
            eVar.A(7, this.f11809h);
        }
        if ((this.f11804c & 64) == 64) {
            eVar.A(8, this.k);
        }
        if ((this.f11804c & 1) == 1) {
            eVar.A(9, this.f11805d);
        }
        for (int i11 = 0; i11 < this.f11812l.size(); i11++) {
            eVar.C(10, (xa.a) this.f11812l.get(i11));
        }
        if (this.f11813m.size() > 0) {
            eVar.J(90);
            eVar.J(this.f11814n);
        }
        for (int i12 = 0; i12 < this.f11813m.size(); i12++) {
            eVar.B(((Integer) this.f11813m.get(i12)).intValue());
        }
        if ((this.f11804c & 128) == 128) {
            eVar.C(30, this.f11816p);
        }
        for (int i13 = 0; i13 < this.f11817q.size(); i13++) {
            eVar.A(31, ((Integer) this.f11817q.get(i13)).intValue());
        }
        if ((this.f11804c & 256) == 256) {
            eVar.C(32, this.f11818r);
        }
        for (int i14 = 0; i14 < this.f11819s.size(); i14++) {
            eVar.C(33, (xa.a) this.f11819s.get(i14));
        }
        rVar.P(19000, eVar);
        eVar.F(this.f11803b);
    }

    @Override // xa.u
    public final xa.a getDefaultInstanceForType() {
        return f11801v;
    }

    @Override // xa.u
    public final boolean isInitialized() {
        byte b10 = this.f11820t;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        int i7 = this.f11804c;
        if ((i7 & 4) != 4) {
            this.f11820t = (byte) 0;
            return false;
        }
        if ((i7 & 8) == 8 && !this.f11808g.isInitialized()) {
            this.f11820t = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < this.f11810i.size(); i10++) {
            if (!((x0) this.f11810i.get(i10)).isInitialized()) {
                this.f11820t = (byte) 0;
                return false;
            }
        }
        if ((this.f11804c & 32) == 32 && !this.f11811j.isInitialized()) {
            this.f11820t = (byte) 0;
            return false;
        }
        for (int i11 = 0; i11 < this.f11812l.size(); i11++) {
            if (!((s0) this.f11812l.get(i11)).isInitialized()) {
                this.f11820t = (byte) 0;
                return false;
            }
        }
        for (int i12 = 0; i12 < this.f11815o.size(); i12++) {
            if (!((a1) this.f11815o.get(i12)).isInitialized()) {
                this.f11820t = (byte) 0;
                return false;
            }
        }
        if ((this.f11804c & 128) == 128 && !this.f11816p.isInitialized()) {
            this.f11820t = (byte) 0;
            return false;
        }
        if ((this.f11804c & 256) == 256 && !this.f11818r.isInitialized()) {
            this.f11820t = (byte) 0;
            return false;
        }
        for (int i13 = 0; i13 < this.f11819s.size(); i13++) {
            if (!((l) this.f11819s.get(i13)).isInitialized()) {
                this.f11820t = (byte) 0;
                return false;
            }
        }
        if (g()) {
            this.f11820t = (byte) 1;
            return true;
        }
        this.f11820t = (byte) 0;
        return false;
    }

    public final void n() {
        this.f11805d = 6;
        this.f11806e = 6;
        this.f11807f = 0;
        s0 s0Var = s0.f12166t;
        this.f11808g = s0Var;
        this.f11809h = 0;
        List list = Collections.EMPTY_LIST;
        this.f11810i = list;
        this.f11811j = s0Var;
        this.k = 0;
        this.f11812l = list;
        this.f11813m = list;
        this.f11815o = list;
        this.f11816p = y0.f12278g;
        this.f11817q = list;
        this.f11818r = p.f12116e;
        this.f11819s = list;
    }
}
